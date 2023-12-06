package structural.adapter.square;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SquarePegImpl {
    private final double width;

    public double getSquare() {
        return Math.pow(this.width, 2);
    }

    public double getWidth() {
        return this.width;
    }
}
