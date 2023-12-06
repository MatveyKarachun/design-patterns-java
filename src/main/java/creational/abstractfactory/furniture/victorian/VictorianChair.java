package creational.abstractfactory.furniture.victorian;

import creational.abstractfactory.furniture.products.Chair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class VictorianChair implements Chair {
    private static final Logger log = LoggerFactory.getLogger(VictorianChair.class);

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        log.info("sit on victorian chair");
    }
}
