package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import work.TanCalculator;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value=PER_CLASS)
public class TanTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private final TanCalculator tan = new TanCalculator(
            ACCURACY, TrigonometryMocks.getSinMock(), TrigonometryMocks.getCosMock()
    );

    @ParameterizedTest
    @CsvFileSource(resources = "/tan_test_data.csv")
    public void tableValuesStubsTest(double expected, double num, double den) {
        double actual = tan.calculate(num * PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = tan.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = tan.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = tan.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
