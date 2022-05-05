package work;

public class Function extends Calculator {
    private final SinCalculator sin;
    private final TanCalculator tan;
    private final CosCalculator cos;
    private final LnCalculator ln;
    private final LogBaseCalculator log2;
    private final LogBaseCalculator log3;
    private final LogBaseCalculator log5;
    private final LogBaseCalculator log10;

    public Function(double accuracy, SinCalculator sin,CosCalculator cos, TanCalculator tan,  LnCalculator ln,
    		LogBaseCalculator log2, LogBaseCalculator log3, LogBaseCalculator log5, 
    		LogBaseCalculator log10) {
        super(accuracy);
        this.sin = sin;
        this.cos = cos;
        this.tan = tan;
        this.ln = ln;
        this.log2 = log2;
        this.log3 = log3;
        this.log5 = log5;
        this.log10 = log10;
    }



	public double calculate(double x) {
        if (x <= 0) {
            return (Math.pow(Math.pow(Math.pow(sin.calculate(x) * cos.calculate(x), 3),2) * cos.calculate(x),2));
        } else {
            return (((((log2.calculate(x) - ln.calculate(x)) * log10.calculate(x)) 
            /log10.calculate(x)) - log2.calculate(x))/log3.calculate(x) *  log5.calculate(x));
        }
    }
}










