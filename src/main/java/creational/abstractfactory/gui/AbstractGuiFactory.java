package creational.abstractfactory.gui;

import creational.abstractfactory.gui.elements.Button;
import creational.abstractfactory.gui.elements.Checkbox;

public interface AbstractGuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
