package structural.adapter.round;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class RoundHole {
    private final double radius;

    public double getRadius() {
        return this.radius;
    }
}
