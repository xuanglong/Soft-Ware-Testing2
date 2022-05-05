package work;

public class CosCalculator extends Calculator {
    private final SinCalculator sin;

    public CosCalculator(double accuracy, SinCalculator sin) {
        super(accuracy);
        this.sin = sin;
    }

    public double calculate(double x) {
        int fl = 1;
        if (((x > Math.PI / 2) & (x < 3 * Math.PI / 2)) ||
                ((x < -Math.PI / 2) & (x > -3 * Math.PI / 2)))
            fl = -1;

        return fl * Math.sqrt(1 - sin.calculate(x) * sin.calculate(x));
    }
}
