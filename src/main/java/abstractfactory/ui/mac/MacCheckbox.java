package abstractfactory.ui.mac;

import abstractfactory.ui.elements.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacCheckbox.");
    }
}
