package creational.prototype;

class Circle extends Shape {
    private final int radius;

    public Circle(Circle circleFrom) {
        super(circleFrom);
        this.radius = circleFrom.radius;
    }

    Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public Shape copy() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle shape2) || !super.equals(object2)) return false;
        return shape2.radius == radius;
    }
}
