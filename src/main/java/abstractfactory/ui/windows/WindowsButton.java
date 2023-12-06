package abstractfactory.ui.windows;

import abstractfactory.ui.elements.Button;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WindowsButton implements Button {
    @Override
    public void paint() {
        log.info("You have created WindowsButton.");
    }
}
