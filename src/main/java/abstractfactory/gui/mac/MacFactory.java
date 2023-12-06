package abstractfactory.gui.mac;

import abstractfactory.gui.AbstractGuiFactory;
import abstractfactory.gui.elements.Button;
import abstractfactory.gui.elements.Checkbox;

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
