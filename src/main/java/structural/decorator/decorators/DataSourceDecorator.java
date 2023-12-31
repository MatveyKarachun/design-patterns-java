package structural.decorator.decorators;

import lombok.RequiredArgsConstructor;
import structural.decorator.DataSource;

@RequiredArgsConstructor
public abstract class DataSourceDecorator implements DataSource {
    private final DataSource wrappee;

    @Override
    public void write(final String dataString) {
        wrappee.write(dataString);
    }

    @Override
    public String read() {
        return wrappee.read();
    }
}
