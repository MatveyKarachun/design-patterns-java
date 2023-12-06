package abstractfactory.furniture.victorian;

import abstractfactory.furniture.products.CoffeeTable;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void sitDown() {
        log.info("sit down victorian coffee table");
    }
}
