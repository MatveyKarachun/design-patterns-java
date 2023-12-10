package structural.decorator;

import lombok.RequiredArgsConstructor;
import lombok.val;

import java.io.*;

@RequiredArgsConstructor
class FileDataSource implements DataSource {
    private final String name;

    @Override
    public void write(final String dataString) {
        val file = new File(name);
        try (final OutputStream outputStream = new FileOutputStream(file)){
            outputStream.write(dataString.getBytes(), 0, dataString.length());
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public String read() {
        char[] buffer;
        val file = new File(name);
        try (val fileReader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            fileReader.read(buffer);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        return new String(buffer);
    }
}
