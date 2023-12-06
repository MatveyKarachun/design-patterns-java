package creational.abstractfactory.gui.mac;

import creational.abstractfactory.gui.elements.Button;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class MacButton implements Button {
    @Override
    public void paint() {
        log.info("You have created MacButton.");
    }
}
