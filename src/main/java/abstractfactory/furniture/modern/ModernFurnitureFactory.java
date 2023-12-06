package abstractfactory.furniture.modern;

import abstractfactory.furniture.AbstractFurnitureFactory;
import abstractfactory.furniture.products.Chair;

class ModernFurnitureFactory implements AbstractFurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
