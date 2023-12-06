package abstractfactory.gui.windows;

import abstractfactory.gui.elements.Button;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class WindowsButton implements Button {
    @Override
    public void paint() {
        log.info("You have created WindowsButton.");
    }
}
