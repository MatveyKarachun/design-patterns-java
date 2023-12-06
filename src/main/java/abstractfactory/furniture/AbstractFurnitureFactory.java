package abstractfactory.furniture;

import abstractfactory.furniture.products.Chair;

public interface AbstractFurnitureFactory {
    Chair createChair();
}
