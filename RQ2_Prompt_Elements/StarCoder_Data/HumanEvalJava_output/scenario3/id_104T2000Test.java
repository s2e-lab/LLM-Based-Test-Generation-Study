// UniqueDigitsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

    /**
     * Test case for {@link UniqueDigits#uniqueDigits(List)}.
     */
    @Test
    void testUniqueDigits() {
        List<Integer> x = List.of(15, 33, 1422, 1);
        List<Integer> expected = List.of(1, 15, 33);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }

    /**
     * Test case for {@link UniqueDigits#uniqueDigits(List)}.
     */
    @Test
    void testUniqueDigits2() {
        List<Integer> x = List.of(152, 323, 1422, 10);
        List<Integer> expected = List.of();
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }

    /**
     * Test case for {@link UniqueDigits#uniqueDigits(List)}.
     */
    @Test
    void testUniqueDigits3() {
        List<Integer> x = List.of(12345, 2033, 111, 151);
        List<Integer> expected = List.of(111, 151);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }

    /**
     * Test case for {@link UniqueDigits#uniqueDigits(List)}.
     */
    @Test
    void testUniqueDigits4() {
        List<Integer> x = List.of(135, 103, 31);
        List<Integer> expected = List.of(31, 135);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }

    /**
     * Test case for {@link UniqueDigits#uniqueDigits(List)}.
     */
    @Test
    void testUniqueDigits5() {
        List<Integer> x = List.of(12345, 2033, 111, 151);
        List<Integer> expected = List.of(111, 151);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }

    /**
     * Test case for {@link UniqueDigits#uniqueDigits(List)}.
     */
    @Test
    void testUniqueDigits6() {
        List<Integer> x = List.of(135, 103, 31);
        List<Integer> expected = List.of(31, 135);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }

    /**
     * Test case for {@link UniqueDigits#uniqueDigits(List)}.
     */
    @Test
    void testUniqueDigits7() {
        List<Integer> x = List.of(12345, 2033, 111, 151);
        List<Integer> expected = List.of(111, 151);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }

    /**
     * Test case for {@link UniqueDigits#uniqueDigits(List)}.
     */
    @Test
    void testUniqueDigits8() {
        List<Integer> x = List.of(135, 103, 31);
        List<Integer> expected = List.of(31, 135);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }

    /**
     * Test case for {@link UniqueDigits#uniqueDigits(List)}.
     */
    @Test
    void testUniqueDigits9() {
        List<Integer> x = List.of(12345, 2033, 111, 151);
        List<Integer> expected = List.of(111, 151);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }

    /**
     * Test case for {@link UniqueDigits#uniqueDigits(List)}.
     */
    @Test
    void testUniqueDigits10() {
        List<Integer> x = List.of(135, 103, 31);
        List<Integer> expected = List.of(31, 135);
        assertEquals(expected, UniqueDigits.uniqueDigits(x));
    }
}
