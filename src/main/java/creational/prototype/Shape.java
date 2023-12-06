package creational.prototype;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
abstract class Shape {
    private final int x;
    private final int y;
    private final String color;

    Shape(Shape shapeFrom) {
        if (shapeFrom == null) {
            throw new NullPointerException("ShapeFrom can't be null");
        }

        this.x = shapeFrom.x;
        this.y = shapeFrom.y;
        this.color = shapeFrom.color;
    }

    public abstract Shape copy();
}
