package creational.abstractfactory.furniture.modern;

import creational.abstractfactory.furniture.AbstractFurnitureFactory;
import creational.abstractfactory.furniture.products.Chair;

class ModernFurnitureFactory implements AbstractFurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
