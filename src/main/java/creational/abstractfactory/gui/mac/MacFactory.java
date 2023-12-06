package creational.abstractfactory.gui.mac;

import creational.abstractfactory.gui.AbstractGuiFactory;
import creational.abstractfactory.gui.elements.Button;
import creational.abstractfactory.gui.elements.Checkbox;

public class MacFactory implements AbstractGuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
