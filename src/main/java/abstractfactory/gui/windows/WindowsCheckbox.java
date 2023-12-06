package abstractfactory.gui.windows;

import abstractfactory.gui.elements.Checkbox;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        log.info("You have created WindowsCheckbox.");
    }
}
