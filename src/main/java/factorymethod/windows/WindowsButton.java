package factorymethod.windows;

import factorymethod.Button;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class WindowsButton implements Button {

    @Override
    public void render() {
        log.info("WindowsButton rendered.");
    }

    @Override
    public void onClick() {
        log.info("WindowsButton clicked.");
    }
}
