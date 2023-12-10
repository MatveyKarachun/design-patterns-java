package structural.decorator.decorators;

import lombok.val;
import structural.decorator.DataSource;

import java.util.Base64;

class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void write(final String dataString) {
        super.write(encrypt(dataString));
    }

    private String encrypt(final String dataString) {
        val bytes = dataString.getBytes();
        for (var i = 0; i < bytes.length; i++) {
            bytes[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(bytes);
    }

    @Override
    public String read() {
        return decrypt(super.read());
    }

    private String decrypt(final String dataString) {
        val bytes = Base64.getDecoder().decode(dataString);
        for (var i = 0; i < bytes.length; i++) {
            bytes[i] -= (byte) 1;
        }
        return new String(bytes);
    }
}
