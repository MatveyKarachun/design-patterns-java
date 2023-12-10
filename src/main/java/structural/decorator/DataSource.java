package structural.decorator;

public interface DataSource {
    void write(String dataString);
    String read();
}
