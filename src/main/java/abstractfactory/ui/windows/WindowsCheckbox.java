package abstractfactory.ui.windows;

import abstractfactory.ui.elements.Checkbox;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        log.info("You have created WindowsCheckbox.");
    }
}
