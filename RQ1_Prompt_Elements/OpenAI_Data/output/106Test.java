// FTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link F}.
* It contains ten test cases for the {@link F#f()} method.
*/
class FTest {


    @Test
    void test1() {
        assertEquals(Arrays.asList(1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800), F.f(10));
    }

    @Test
    void test2() {
        assertEquals(Arrays.asList(1, 3, 6, 24, 120, 720, 5040, 40320, 362880, 3628800), F.f(11));
    }

    @Test
    void test3() {
        assertEquals(Arrays.asList(1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800), F.f(12));
    }

    @Test
    void test4() {
        assertEquals(Arrays.asList(1, 3, 6, 24, 120, 720, 5040, 40320, 362880, 3628800), F.f(13));
    }

    @Test
    void test5() {
        assertEquals(Arrays.asList(1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800), F.f(14));
    }

    @Test
    void test6() {
        assertEquals(Arrays.asList(1, 3, 6, 24, 120, 720, 5040, 40320, 362880, 3628800), F.f(15));
    }

    @Test
    void test7() {
        assertEquals(Arrays.asList(1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800), F.f(16));
    }

    @Test
    void test8() {
        assertEquals(Arrays.asList(1, 3, 6, 24, 120, 720, 5040, 40320, 362880, 3628800), F.f(17));
    }

    @Test
    void test9() {
        assertEquals(Arrays.asList(1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800), F.f(18));
    }

    @Test
    void test10() {
        assertEquals(Arrays.asList(1, 3, 6, 24, 120, 720, 5040, 40320, 362880, 3628800), F.f(19));
    }
}