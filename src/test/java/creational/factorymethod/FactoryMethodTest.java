package creational.factorymethod;

import creational.factorymethod.html.HtmlDialog;
import creational.factorymethod.windows.WindowsDialog;
import org.junit.jupiter.api.Test;

class FactoryMethodTest {
    @Test
    void test() {
        final Dialog htmlDialog = new HtmlDialog();
        final Dialog windowsDialog = new WindowsDialog();

        htmlDialog.renderWindow();
        windowsDialog.renderWindow();
    }
}
