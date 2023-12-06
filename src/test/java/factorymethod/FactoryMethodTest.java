package factorymethod;

import factorymethod.html.HtmlDialog;
import factorymethod.windows.WindowsDialog;
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
