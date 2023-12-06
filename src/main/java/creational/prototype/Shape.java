package creational.prototype;

import java.util.Objects;

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

    Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract Shape copy();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape shape2)) return false;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
