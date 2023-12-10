package structural.decorator.decorators;

import lombok.Getter;
import lombok.Setter;
import lombok.val;
import structural.decorator.DataSource;

import java.io.*;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {
    private static final int BAOS_SIZE = 512;

    @Getter
    @Setter
    private int compressionLvl = 6;

    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void write(final String dataString) {
        super.write(compress(dataString));
    }

    @Override
    public String read() {
        return decompress(super.read());
    }

    private String compress(final String dataString) {
        val bytes = dataString.getBytes();
        try (val baos = new ByteArrayOutputStream(BAOS_SIZE);
             final OutputStream deflaterOutputStream = new DeflaterOutputStream(baos, new Deflater(compressionLvl))
        ) {
            deflaterOutputStream.write(bytes);
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    private String decompress(final String dataString) {
        val bytes = Base64.getDecoder().decode(dataString);
        try (final InputStream inputStream = new ByteArrayInputStream(bytes);
             final InputStream inflaterInputStream = new InflaterInputStream(inputStream);
             val baos = new ByteArrayOutputStream(BAOS_SIZE)
        ) {
            int byteInt;
            while ((byteInt = inflaterInputStream.read()) != -1) {
                baos.write(byteInt);
            }
            return baos.toString();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
