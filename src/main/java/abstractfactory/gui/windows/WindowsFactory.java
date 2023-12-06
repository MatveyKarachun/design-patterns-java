package abstractfactory.gui.windows;

import abstractfactory.gui.AbstractGuiFactory;
import abstractfactory.gui.elements.Button;
import abstractfactory.gui.elements.Checkbox;

public class WindowsFactory implements AbstractGuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
