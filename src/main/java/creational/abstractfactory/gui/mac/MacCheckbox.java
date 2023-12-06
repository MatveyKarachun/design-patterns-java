package creational.abstractfactory.gui.mac;

import creational.abstractfactory.gui.elements.Checkbox;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        log.info("You have created MacCheckbox.");
    }
}
