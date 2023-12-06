package factorymethod.windows;

import factorymethod.Button;
import factorymethod.Dialog;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
