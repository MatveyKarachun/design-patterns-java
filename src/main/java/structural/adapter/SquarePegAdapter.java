package structural.adapter;

import structural.adapter.round.RoundPeg;
import structural.adapter.square.SquarePeg;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SquarePegAdapter implements RoundPeg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return sqrt(pow((squarePeg.getWidth() / 2), 2) * 2);
    }
}
