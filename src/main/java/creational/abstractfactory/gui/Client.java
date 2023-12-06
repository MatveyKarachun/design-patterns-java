package creational.abstractfactory.gui;

import creational.abstractfactory.gui.elements.Button;
import creational.abstractfactory.gui.elements.Checkbox;

class Client {
    private final Button button;
    private final Checkbox checkbox;

    Client(AbstractGuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    void paint() {
        button.paint();
        checkbox.paint();
    }
}
