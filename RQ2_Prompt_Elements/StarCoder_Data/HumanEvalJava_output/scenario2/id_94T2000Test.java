// SkjkasdkdTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Skjkasdkd}.
* It contains ten unit test cases for the {@link Skjkasdkd#skjkasdkd(List)} method.
*/
class SkjkasdkdTest {

    /**
    * Test case for {@link Skjkasdkd#skjkasdkd(List)}.
    */
    @Test
    void testSkjkasdkd() {
        List<Integer> lst = List.of(12, 13, 15, 17, 19, 23, 29, 31, 37, 41);
        assertEquals(29, Skjkasdkd.skjkasdkd(lst));
    }

    /**
    * Test case for {@link Skjkasdkd#skjkasdkd(List)}.
    */
    @Test
    void testSkjkasdkd2() {
        List<Integer> lst = List.of(12, 13, 15, 17, 19, 23, 29, 31, 37, 41, 43);
        assertEquals(31, Skjkasdkd.skjkasdkd(lst));
    }

    /**
    * Test case for {@link Skjkasdkd#skjkasdkd(List)}.
    */
    @Test
    void testSkjkasdkd3() {
        List<Integer> lst = List.of(12, 13, 15, 17, 19, 23, 29, 31, 37, 41, 43, 47);
        assertEquals(37, Skjkasdkd.skjkasdkd(lst));
    }

    /**
    * Test case for {@link Skjkasdkd#skjkasdkd(List)}.
    */
    @Test
    void testSkjkasdkd4() {
        List<Integer> lst = List.of(12, 13, 15, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53);
        assertEquals(43, Skjkasdkd.skjkasdkd(lst));
    }

    /**
    * Test case for {@link Skjkasdkd#skjkasdkd(List)}.
    */
    @Test
    void testSkjkasdkd5() {
        List<Integer> lst = List.of(12, 13, 15, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59);
        assertEquals(47, Skjkasdkd.skjkasdkd(lst));
    }

    /**
    * Test case for {@link Skjkasdkd#skjkasdkd(List)}.
    */
    @Test
    void testSkjkasdkd6() {
        List<Integer> lst = List.of(12, 13, 15, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61);
        assertEquals(53, Skjkasdkd.skjkasdkd(lst));
    }

    /**
    * Test case for {@link Skjkasdkd#skjkasdkd(List)}.
    */
    @Test
    void testSkjkasdkd7() {
        List<Integer> lst = List.of(12, 13, 15, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67);
        assertEquals(59, Skjkasdkd.skjkasdkd(lst));
    }

    /**
    * Test case for {@link Skjkasdkd#skjkasdkd(List)}.
    */
    @Test
    void testSkjkasdkd8() {
        List<Integer> lst = List.of(12, 13, 15, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71);
        assertEquals(61, Skjkasdkd.skjkasdkd(lst));
    }

    /**
    * Test case for {@link Skjkasdkd#skjkasdkd(List)}.
    */
    @Test
    void testSkjkasdkd9() {
        List<Integer> lst = List.of(12, 13, 15, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73);
        assertEquals(67, Skjkasdkd.skjkasdkd(lst));
    }

    /**
    * Test case for {@link Skjkasdkd#skjkasdkd(List)}.
    */
    @Test
    void testSkjkasdkd10() {
        List<Integer> lst = List.of(12, 13, 15, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79);
        assertEquals(73, Skjkasdkd.skjkasdkd(lst));
    }
}
