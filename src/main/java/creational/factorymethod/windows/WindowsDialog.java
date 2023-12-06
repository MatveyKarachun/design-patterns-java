package creational.factorymethod.windows;

import creational.factorymethod.Button;
import creational.factorymethod.Dialog;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
