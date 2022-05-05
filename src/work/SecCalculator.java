package work;

public class SecCalculator extends Calculator {
    private final CosCalculator cos;

    public SecCalculator(double accuracy, CosCalculator cos) {
        super(accuracy);
        this.cos = cos;
    }

    public double calculate(double x) {
        if (Math.abs(x % Math.PI - Math.PI/2) <= accuracy) return Double.POSITIVE_INFINITY;
        if (Math.abs(x % Math.PI + Math.PI/2) <= accuracy) return Double.POSITIVE_INFINITY;

        double sec = 1 / cos.calculate(x);
        return Double.isFinite(sec) ? sec : Double.POSITIVE_INFINITY;
    }


}
