package telran.util;

import static org.junit.jupiter.api.Assertions.*;
import static telran.util.RecursionMethods.*;

import org.junit.jupiter.api.Test;

public class RecursionMethodsTests {

    @Test
    void fTest() {
        f(400);
    }

    @Test
    void factorialTest() {
        assertEquals(6, factorial(3));
        assertEquals(24, factorial(4));
        assertEquals(1, factorial(0));
        assertEquals(6, factorial(-3));
    }

    @Test
    void powTest() {
        assertEquals(100, pow(10, 2));
        assertEquals(100, pow(-10, 2));
        assertEquals(1000, pow(10, 3));
        assertEquals(-1000, pow(-10, 3));

        assertThrows(IllegalArgumentException.class, () -> pow(2, -2));
    }

    @Test
    void squareTest() {
        assertEquals(100, square(10));
        assertEquals(100, square(-10));
        assertEquals(1, square(0));
    }

    @Test
    void sumTest() {
        int[] arr = { 1, 2, 3, 4, 5 };
        assertEquals(15, sum(arr));
    }

    @Test
    void isSubstringTest() {
        String str = "abcdfghij";
        String subStr1 = "cd";
        String subStr2 = "cba";

        assertTrue(isSubstring(str, subStr1));
        assertFalse(isSubstring(str, subStr2));

        assertThrows(IllegalArgumentException.class, () -> isSubstring(subStr1, str));
        assertThrows(NullPointerException.class, () -> isSubstring(null, str));
        assertThrows(NullPointerException.class, () -> isSubstring(subStr1, null));
    }
}
