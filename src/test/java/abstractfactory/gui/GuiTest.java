package abstractfactory.gui;

import abstractfactory.gui.mac.MacFactory;
import abstractfactory.gui.windows.WindowsFactory;
import lombok.val;
import org.junit.jupiter.api.Test;

class GuiTest {
    @Test
    void test() {
        final AbstractGuiFactory windowsFactory = new WindowsFactory();
        final AbstractGuiFactory macFactory = new MacFactory();
        val windowsClient = new Client(windowsFactory);
        val macClient = new Client(macFactory);
        windowsClient.paint();
        macClient.paint();
    }
}
