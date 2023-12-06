package abstractfactory.gui;

import abstractfactory.gui.elements.Button;
import abstractfactory.gui.elements.Checkbox;

public interface AbstractGuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
