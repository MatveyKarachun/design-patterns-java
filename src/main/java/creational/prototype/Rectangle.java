package creational.prototype;

class Rectangle extends Shape {
    private final int width;
    private final int height;

    Rectangle(Rectangle rectangleFrom) {
        super(rectangleFrom);

        this.width = rectangleFrom.width;
        this.height = rectangleFrom.height;
    }

    Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape copy() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle shape2) || !super.equals(object2)) return false;
        return shape2.width == width && shape2.height == height;
    }
}
