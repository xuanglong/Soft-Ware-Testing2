package work;

public class CotCalculator extends Calculator {

    private final SinCalculator sin;
    private final CosCalculator cos;

    public CotCalculator(double accuracy, SinCalculator sin, CosCalculator cos) {
        super(accuracy);
        this.sin = sin;
        this.cos = cos;
    }

    public double calculate(double x) {
        if (Math.abs(x % Math.PI) < accuracy) return Double.POSITIVE_INFINITY;

        double cot = cos.calculate(x) / sin.calculate(x);
        return Double.isFinite(cot) ? cot : Double.POSITIVE_INFINITY;
    }

}