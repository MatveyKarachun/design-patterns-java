package creational.prototype;

import java.util.HashMap;
import java.util.Map;

class ShapeCache {
    private final Map<String, Shape> cache = new HashMap<>();

    ShapeCache() {
        cache.put("Big green circle", new Circle(0, 0, "green", 100));
        cache.put("Medium blue rectangle", new Rectangle(0, 0, "blue", 50, 50));
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).copy();
    }
}
