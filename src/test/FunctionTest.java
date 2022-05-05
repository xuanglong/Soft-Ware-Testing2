package test;

import work.CosCalculator;
import work.CosecCalculator;
import work.CotCalculator;
import work.Function;
import work.LnCalculator;
import work.LogBaseCalculator;
import work.SecCalculator;
import work.SinCalculator;
import work.TanCalculator;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(value = PER_CLASS)
public class FunctionTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.00001;

    private final SinCalculator sinMock = TrigonometryMocks.getSinMock();
    private final CosCalculator cosMock = TrigonometryMocks.getCosMock();
    private final CosecCalculator cosecMock = TrigonometryMocks.getCosecMock();
    private final SecCalculator secMock = TrigonometryMocks.getSecMock();
    private final TanCalculator tanMock = TrigonometryMocks.getTanMock();
    private final CotCalculator cotMock = TrigonometryMocks.getCotMock();
    private final LnCalculator lnMock = LogMocks.getLnMock();
    private final LogBaseCalculator log2Mock = LogMocks.getLog2Mock();
    private final LogBaseCalculator log3Mock = LogMocks.getLog3Mock();
    private final LogBaseCalculator log5Mock = LogMocks.getLog5Mock();
    private final LogBaseCalculator log10Mock = LogMocks.getLog5Mock();
    
    private final SinCalculator sin = new SinCalculator(ACCURACY);
    private final CosCalculator cos = new CosCalculator(ACCURACY, sin);
    private final CosecCalculator cosec = new CosecCalculator(ACCURACY, sin);
    private final SecCalculator sec = new SecCalculator(ACCURACY, cos);
    private final TanCalculator tan = new TanCalculator(ACCURACY, sin, cos);
    private final CotCalculator cot = new CotCalculator(ACCURACY, sin, cos);
    private final LnCalculator ln = new LnCalculator(ACCURACY);
    private final LogBaseCalculator log2 = new LogBaseCalculator(ACCURACY, 2, ln);
    private final LogBaseCalculator log3 = new LogBaseCalculator(ACCURACY, 3, ln);
    private final LogBaseCalculator log5 = new LogBaseCalculator(ACCURACY, 5, ln);
    private final LogBaseCalculator log10 = new LogBaseCalculator(ACCURACY, 10, ln);
    
    private Function function;

    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void stubsTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sinMock, cosMock,  tanMock,  lnMock, log2Mock, log3Mock, log5Mock,log10Mock
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void lnStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sinMock, cosMock,  tanMock,  ln, log2, log3, log5, log10
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void sinStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sin, cos,  tan,  lnMock, log2Mock, log3Mock, log5Mock, log10
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/function_test_data.csv")
    public void allStubTest(double expected, double num, double den) {
        function = new Function(ACCURACY,
                sin,  cos, tan,  ln, log2, log3, log5, log10
        );
        double actual = function.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }
}