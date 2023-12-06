package abstractfactory.gui;

import abstractfactory.gui.elements.Button;
import abstractfactory.gui.elements.Checkbox;

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
