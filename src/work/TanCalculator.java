package work;

public class TanCalculator extends Calculator {

    private final SinCalculator sin;
    private final CosCalculator cos;

    public TanCalculator(double accuracy, SinCalculator sin, CosCalculator cos) {
        super(accuracy);
        this.sin = sin;
        this.cos = cos;
    }

    public double calculate(double x) {
        if (Math.abs(x % Math.PI - Math.PI/2) <= accuracy) return Double.POSITIVE_INFINITY;
        if (Math.abs(x % Math.PI + Math.PI/2) <= accuracy) return Double.POSITIVE_INFINITY;

        double tan = sin.calculate(x) / cos.calculate(x);
        return Double.isFinite(tan) ? tan : Double.POSITIVE_INFINITY;
    }

}