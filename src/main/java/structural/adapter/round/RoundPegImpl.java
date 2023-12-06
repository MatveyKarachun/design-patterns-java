package structural.adapter.round;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoundPegImpl {
    private final double radius;

    public double getRadius() {
        return this.radius;
    }
}
