package structural.decorator.decorators;

import lombok.Getter;
import lombok.Setter;
import lombok.val;
import structural.decorator.DataSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

class CompressionDecorator extends DataSourceDecorator {
    @Getter
    @Setter
    private int compressionLvl = 6;

    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    public void write(final String dataString) {
        super.write(compress());
    }

    private String compress(final String dataString) {
        val bytes = dataString.getBytes();
        try (val baos = new ByteArrayOutputStream(512);
             final OutputStream deflaterOutputStream = new DeflaterOutputStream(baos, new Deflater(compressionLvl));
        ) {
            deflaterOutputStream.write(bytes);
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
