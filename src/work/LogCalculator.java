package work;

public class LogCalculator	extends Calculator
{
    private final LnCalculator ln;
    private final int base;

    public LogCalculator(double accuracy, int base, LnCalculator ln) {
        super(accuracy);
        this.base = base;
        this.ln = ln;
    }

    public double calculate(double x) {
        return ln.calculate(x) / ln.calculate(this.base);
    }
}

