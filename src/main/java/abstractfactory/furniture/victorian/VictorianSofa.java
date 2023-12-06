package abstractfactory.furniture.victorian;

import abstractfactory.furniture.products.Sofa;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class VictorianSofa implements Sofa {
    @Override
    public void layOn() {
        log.info("lay on victorian sofa");
    }
}
