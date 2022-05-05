package test;

import static java.lang.Double.NaN;
import static java.lang.Math.PI;
import static org.mockito.Mockito.*;
import work.CosCalculator;
import work.CosecCalculator;
import work.CotCalculator;
import work.SecCalculator;
import work.SinCalculator;
import work.TanCalculator;
import static java.lang.Double.POSITIVE_INFINITY;
public class TrigonometryMocks {
    public static SinCalculator getSinMock() {
        SinCalculator m = mock(SinCalculator.class);

        MockChain.when(m)
                .mock(PI / 6, 0.49999999999999994)
                .mock(PI / 4, 0.7071067811865475)
                .mock(PI / 3, 0.8660254037844386)
                .mock(PI / 2, 1.0)
                .mock(2 * PI / 3, 0.8660254037844386)
                .mock(3 * PI / 4, 0.7071067811865476)
                .mock(5 * PI / 6, 0.49999999999999994)
                .mock(PI, 0.0)
                .mock(7 * PI / 6, -0.4999999999999997)
                .mock(5 * PI / 4, -0.7071067811865475)
                .mock(4 * PI / 3, -0.8660254037844384)
                .mock(5 * PI / 3, -0.8660254037844386)
                .mock(7 * PI / 4, -0.7071067811865477)
                .mock(11 * PI / 6, -0.5000000000000004)
                .mock(2 * PI, 0.0)
                .mock(0d, 0.0)
                .mock(-PI / 6, -0.5)
                .mock(-PI / 4, -0.7071067811865475)
                .mock(-PI / 3, -0.8660254037844386)
                .mock(-PI / 2, -1.0)
                .mock(-2 * PI / 3, -0.8660254037844387)
                .mock(-3 * PI / 4, -0.7071067811865476)
                .mock(-5 * PI / 6, -0.5)
                .mock(-PI, -1.2246467991473532e-16)
                .mock(-7 * PI / 6, 0.5)
                .mock(-5 * PI / 4, 0.7071067811865475)
                .mock(-4 * PI / 3, 0.866025403784439)
                .mock(-3 * PI / 2, 1.0)
                .mock(-5 * PI / 3, 0.866025403784439)
                .mock(-7 * PI / 4, 0.7071067811865477)
                .mock(-11 * PI / 6, 0.5)
                .mock(-2 * PI, 0.0)
        ;

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static CosCalculator getCosMock() {
        CosCalculator m = mock(CosCalculator.class);

        MockChain.when(m)
                .mock(PI / 6, 0.8660254037844387)
                .mock(PI / 4, 0.7071067811865476)
                .mock(PI / 3, 0.5000000000000001)
                .mock(PI / 2, 0.0)
                .mock(2 * PI / 3, -0.4999999999999998)
                .mock(3 * PI / 4, -0.7071067811865475)
                .mock(5 * PI / 6, -0.8660254037844387)
                .mock(PI, -1.0000000000)
                .mock(7 * PI / 6, -0.8660254037844388)
                .mock(5 * PI / 4, -0.7071067811865477)
                .mock(4 * PI / 3, -0.5000000000000004)
                .mock(5 * PI / 3, 0.5000000000000001)
                .mock(7 * PI / 4, 0.7071067811865474)
                .mock(11 * PI / 6, 0.8660254037844384)
                .mock(2 * PI, 1.0000000000)
                .mock(0d, 1.0)
                .mock(-PI / 6, 0.8660254037844387)
                .mock(-PI / 4, 0.7071067811865476)
                .mock(-PI / 3, 0.5)
                .mock(-PI / 2, 0.0)
                .mock(-2 * PI / 3, -0.5)
                .mock(-3 * PI / 4, -0.7071067811865475)
                .mock(-5 * PI / 6, -0.8660254037844387)
                .mock(-PI, -1.0)
                .mock(-7 * PI / 6, -0.8660254037844387)
                .mock(-5 * PI / 4, -0.7071067811865477)
                .mock(-4 * PI / 3, -0.5000000000)
                .mock(-3 * PI / 2, 0.0)
                .mock(-5 * PI / 3, 0.5)
                .mock(-7 * PI / 4, 0.7071067811865474)
                .mock(-11 * PI / 6, 0.8660254037844387)
                .mock(-2 * PI, 1.0)
        ;

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }





    public static TanCalculator getTanMock() {
        TanCalculator m = mock(TanCalculator.class);

        MockChain.when(m)
                .mock(0d, 0.0)
                .mock(-1 * PI / 6, -0.5773502691896257)
                .mock(-1 * PI / 4, -0.9999999999999999)
                .mock(-1 * PI / 3, -1.7320508075688767)
                .mock(-PI / 2, Double.POSITIVE_INFINITY)
                .mock(-2* PI / 3, 1.7320508075688783)
                .mock(-3 * PI / 4, 1.0000000000000002)
                .mock(-5 * PI / 6, 0.5773502691896257)
                .mock(-PI, 0.0)
                .mock(-7 * PI / 6, -0.5773502691896254)
                .mock(-5 * PI / 4, -0.9999999999999997)
                .mock(-4 * PI / 3, -1.7320508075688754)
                .mock(-3 * PI / 2, Double.POSITIVE_INFINITY)
                .mock(-5 * PI / 3, 1.7320508075688805)
                .mock(-7 * PI / 4, 1.0000000000000004)
                .mock(-11 * PI / 6, 0.5773502691896276)
                .mock(-2 * PI, 0.0);

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
    public static SecCalculator getSecMock() {
        SecCalculator m = mock(SecCalculator.class);

        MockChain.when(m)
                .mock(0d, 1.0)
                .mock(-PI / 6, 1.1547005384)
                .mock(-PI / 4, 1.4142135624)
                .mock(-PI / 3, 2.0)
                .mock(-PI / 2, NaN)
                .mock(-2 * PI / 3, -2.0)
                .mock(-3 * PI / 4, -1.4142135624)
                .mock(-5 * PI / 6, -1.1547005384)
                .mock(-PI, -1.0)
                .mock(-7 * PI / 6, -1.1547005384)
                .mock(-5 * PI / 4, -1.4142135624)
                .mock(-4 * PI / 3, -2.0)
                .mock(-3 * PI / 2, NaN)
                .mock(-5 * PI / 3, 2.0)
                .mock(-7 * PI / 4, 1.4142135624)
                .mock(-11 * PI / 6, 1.1547005384)
                .mock(-2 * PI, 1.0)
        ;

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
    public static CotCalculator getCotMock() {
        CotCalculator m = mock(CotCalculator.class);

        MockChain.when(m)
                .mock(0d, Double.POSITIVE_INFINITY)
                .mock(-1 * PI / 6, -1.7320508075688774)
                .mock(-1 * PI / 4, -0.9999999999999999)
                .mock(-1 * PI / 3, -0.577350269189626)
                .mock(-PI / 2, 0.0)
                .mock(-2 * PI / 3, 0.577350269189626)
                .mock(-3 * PI / 4, 1.0000000000000002)
                .mock(-5 * PI / 6, 1.7320508075688756)
                .mock(-PI, Double.POSITIVE_INFINITY)
                .mock(-7 * PI / 6, -1.7320508075688756)
                .mock(-4 * PI / 3, -0.577350269189626)
                .mock(-5 * PI / 4, -0.9999999999999997)
                .mock(-3 * PI / 2, 0.0)
                .mock(-5 * PI / 3, 0.577350269189626)
                .mock(-7 * PI / 4, 1.0000000000000004)
                .mock(-11 * PI / 6, 1.7320508075688756)
                .mock(-2 * PI, Double.POSITIVE_INFINITY);

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
     
    public static CosecCalculator getCosecMock() {
        CosecCalculator m = mock(CosecCalculator.class);

        MockChain.when(m)
                .mock(0d, POSITIVE_INFINITY)
                .mock(-PI / 6, -2.0000000000)
                .mock(-PI / 4, -1.4142135624)
                .mock(-PI / 3, -1.1547005383792517)
                .mock(-PI / 2, -1.0)
                .mock(-2 * PI / 3, -1.1547005383792517)
                .mock(-3 * PI / 4, -1.4142135624)
                .mock(-5 * PI / 6, -2.0)
                .mock(-PI, -8165619676597685.0)
                .mock(-7 * PI / 6, 2.0)
                .mock(-5 * PI / 4, 1.4142135623730951)
                .mock(-4 * PI / 3, 1.1547005384)
                .mock(-3 * PI / 2, 1.0)
                .mock(-5 * PI / 3, 1.154700538379251)
                .mock(-7 * PI / 4, 1.4142135623730947)
                .mock(-11 * PI / 6, 2.0)
                .mock(-2 * PI, 4082809838298842.5)
        ;

        when(m.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;

    }
}
