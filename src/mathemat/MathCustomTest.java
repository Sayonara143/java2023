package mathemat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MathCustomTest {


    @Test
    void factorialOfNullIsOne() {
        long expected = 1;

        long actual = MathCustom.factorial(0);
        assertEquals(expected, actual);
    }

    @Test
    void factorialOfOneIsOne() {
        assertEquals(1, MathCustom.factorial(1));
    }

    @Test
    void factorialOfPositiveIsTrue() {
        assertEquals(120, MathCustom.factorial(5));
    }

    @Test
    void factorialOfBigPositiveIsTrue() {
        assertEquals(39_916_800, MathCustom.factorial(11));
    }

    @Test
    void signOfNullIsNull() {
        assertEquals(0, MathCustom.getSign(0));
    }

    @Test
    void sSignOfNegativeIsNegative() {
        assertEquals(-1, MathCustom.getSign(-123));
    }

    @Test
    void signOfPositiveIsPositive() {
        assertEquals(1, MathCustom.getSign(123));
    }
}
