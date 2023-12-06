package abstractfactory.furniture.modern;

import abstractfactory.furniture.AbstractFurnitureFactory;
import abstractfactory.furniture.products.Chair;

public class ModernFurnitureFactory implements AbstractFurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
