// SkjkasdkdTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Skjkasdkd}.
* It contains ten unit test cases for the {@link Skjkasdkd#skjkasdkd(List)} method.
*/
class SkjkasdkdTest {
    
    @Test
    void testSkjkasdkd1() {
        List<Integer> lst = Arrays.asList(0, 3, 2, 1, 3, 5, 7, 4, 5, 5, 5, 2, 181, 32, 4, 32, 3, 2, 32, 324, 4, 3);
        int expected = 10;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSkjkasdkd2() {
        List<Integer> lst = Arrays.asList(1, 0, 1, 8, 2, 4597, 2, 1, 3, 40, 1, 2, 1, 2, 4, 2, 5, 1);
        int expected = 25;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSkjkasdkd3() {
        List<Integer> lst = Arrays.asList(1, 3, 1, 32, 5107, 34, 83278, 109, 163, 23, 2323, 32, 30, 1, 9, 3);
        int expected = 13;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSkjkasdkd4() {
        List<Integer> lst = Arrays.asList(0, 724, 32, 71, 99, 32, 6, 0, 5, 91, 83, 0, 5, 6);
        int expected = 11;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSkjkasdkd5() {
        List<Integer> lst = Arrays.asList(0, 81, 12, 3, 1, 21);
        int expected = 3;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSkjkasdkd6() {
        List<Integer> lst = Arrays.asList(0, 8, 1, 2, 1, 7);
        int expected = 7;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSkjkasdkd7() {
        List<Integer> lst = Arrays.asList(8191);
        int expected = 19;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSkjkasdkd8() {
        List<Integer> lst = Arrays.asList(8191, 123456, 127, 7);
        int expected = 19;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSkjkasdkd9() {
        List<Integer> lst = Arrays.asList(127, 97, 8192);
        int expected = 10;
        int actual = Skjkasdkd.skjkasdkd(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSkjkasdkd10() {
        List<Integer> lst = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 