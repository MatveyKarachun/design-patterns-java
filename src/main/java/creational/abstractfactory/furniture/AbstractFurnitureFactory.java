package creational.abstractfactory.furniture;

import creational.abstractfactory.furniture.products.Chair;

public interface AbstractFurnitureFactory {
    Chair createChair();
}
