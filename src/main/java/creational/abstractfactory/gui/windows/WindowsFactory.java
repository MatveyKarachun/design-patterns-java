package creational.abstractfactory.gui.windows;

import creational.abstractfactory.gui.AbstractGuiFactory;
import creational.abstractfactory.gui.elements.Button;
import creational.abstractfactory.gui.elements.Checkbox;

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
