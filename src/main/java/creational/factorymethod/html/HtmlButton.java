package creational.factorymethod.html;

import creational.factorymethod.Button;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class HtmlButton implements Button {
    @Override
    public void render() {
        log.info("<button>Test Button</button>");
    }

    @Override
    public void onClick() {
        log.info("Click! Button says - 'Hello World!'");
    }
}
