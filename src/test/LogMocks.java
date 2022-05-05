package test;

import static java.lang.Double.*;
import static java.lang.Math.PI;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import work.LnCalculator;
import work.LogBaseCalculator;

public class LogMocks {
    public static LnCalculator getLnMock() {
        LnCalculator m = mock(LnCalculator.class);

        MockChain.when(m)
                .mock(1 * PI / 6, -0.6470295833786549)
                .mock(1 * PI / 4, -0.2415644752704905)
                .mock(2 * PI / 3, 0.7392647777412357)
                .mock(3 * PI / 4, 0.8570478133976193)
                .mock(5 * PI / 6, 0.9624083290554456)
                .mock(7 * PI / 6, 1.2988805656766584)
                .mock(5 * PI / 4, 1.3678734371636099)
                .mock(4 * PI / 3, 1.432411958301181)
                .mock(5 * PI / 3, 1.6555555096153909)
                .mock(7 * PI / 4, 1.7043456737848228)
                .mock(11 * PI / 6, 1.7508656894197157)
                .mock(-PI / 4, NaN)
                .mock(-PI / 2, NaN)
                .mock(-3 * PI / 4, NaN)
                .mock(-PI, NaN)
                .mock(-5 * PI / 4, NaN)
                .mock(-7 * PI / 4, NaN)
                .mock(-4 * PI / 3, NaN)
                .mock(-2 * PI, NaN)
                .mock(PI / 8, -0.93471165583043575411)
                .mock(3 * PI / 16, -0.5292465477222714)
                .mock(PI / 3, 0.0461175971812904827)
                .mock(PI / 2, 0.4515827052894548647)
                .mock(PI, 1.1447298858494001741)
                .mock(2 * PI, 1.83787706640934548356)
                .mock(3 * PI, 2.2433421745175099)
                .mock(2, 0.6931471805599453094)
                .mock(3, 1.0986122886681096914)
                .mock(5, 1.6094379124341003746)
        ;

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog2Mock() {
        LogBaseCalculator m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(PI / 8, -1.3485038705276813)
                .mock(3 * PI / 16, -0.7635413698065251)
                .mock(PI / 3, 0.06653362875116242)
                .mock(PI / 2, 0.6514961294723187)
                .mock(PI, 1.6514961294723187)
                .mock(2 * PI, 2.651496129472319)
                .mock(3 * PI, 3.236458630193475)
        ;

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog3Mock() {
        LogBaseCalculator m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(PI / 8, -0.850811214722186)
                .mock(3 * PI / 16, -0.481740968293644)
                .mock(PI / 3, 0.041978045992186)
                .mock(PI / 2, 0.411048292420728)
                .mock(PI, 1.041978045992186)
                .mock(2 * PI, 1.672907799563643)
                .mock(3 * PI, 2.041978045992186)
        ;

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }

    public static LogBaseCalculator getLog5Mock() {
        LogBaseCalculator m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(PI / 8, -0.580769005507510)
                .mock(3 * PI / 16, -0.328839369094918)
                .mock(PI / 3, 0.028654474226684)
                .mock(PI / 2, 0.280584110639276)
                .mock(PI, 0.711260668712669)
                .mock(2 * PI, 1.141937226786062)
                .mock(3 * PI, 1.393866863198654)
        ;

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
    public static LogBaseCalculator getLog10Mock() {
        LogBaseCalculator m = mock(LogBaseCalculator.class);

        MockChain.when(m)
                .mock(PI / 8, -0.580769005507510)
                .mock(3 * PI / 16, -0.328839369094918)
                .mock(PI / 3, 0.028654474226684)
                .mock(PI / 2, 0.280584110639276)
                .mock(PI, 0.711260668712669)
                .mock(2 * PI, 1.141937226786062)
                .mock(3 * PI, 1.393866863198654)
        ;

        when(m.calculate(POSITIVE_INFINITY)).thenReturn(POSITIVE_INFINITY);
        when(m.calculate(NEGATIVE_INFINITY)).thenReturn(NaN);
        when(m.calculate(NaN)).thenReturn(NaN);

        return m;
    }
}
