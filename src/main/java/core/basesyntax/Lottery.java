package core.basesyntax;

public class Lottery {
    public static Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(), 100);
    }
}