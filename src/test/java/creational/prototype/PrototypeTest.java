package creational.prototype;

import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PrototypeTest {
    @Test
    void test() {
        final List<Shape> shapes = new ArrayList<>();
        final List<Shape> shapesCopies = new ArrayList<>();

        val circle = new Circle(10, 20, "red", 15);
        final Circle anotherCircle = (Circle) circle.copy();
        shapes.add(circle);
        shapes.add(anotherCircle);

        shapes.add(new Rectangle(10, 20, "blue", 15, 20));

        for (val shape : shapes) {
            shapesCopies.add(shape.copy());
        }

        compare(shapes, shapesCopies);
    }

    private static void compare(final List<Shape> shapes, final List<Shape> shapesCopies) {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopies.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopies.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
