package abstractfactory.furniture.victorian;

import abstractfactory.furniture.products.Chair;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void sitOn() {
        log.info("sit on victorian chair");
    }
}
