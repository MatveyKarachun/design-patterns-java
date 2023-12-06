package abstractfactory.furniture.modern;

import abstractfactory.furniture.products.Chair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class ModernChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {
        log.info("sit on modern chair");
    }
}
