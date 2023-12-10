package structural.decorator;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.jupiter.api.Test;
import structural.decorator.decorators.CompressionDecorator;
import structural.decorator.decorators.DataSourceDecorator;
import structural.decorator.decorators.EncryptionDecorator;

//TODO move output file to another place?
@Slf4j
class DecoratorTest {
    @Test
    void test() {
        val salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        final DataSourceDecorator encoded = new CompressionDecorator(
            new EncryptionDecorator(
                new FileDataSource("out/OutputDemo.txt")));
        encoded.write(salaryRecords);
        final DataSource plain = new FileDataSource("out/OutputDemo.txt");

        log.info("- Input ----------------");
        log.info(salaryRecords);
        log.info("- Encoded --------------");
        log.info(plain.read());
        log.info("- Decoded --------------");
        log.info(encoded.read());
    }
}
