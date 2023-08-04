// RoundedAvgTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is greater than m.
    */
    @Test
    void testRoundedAvg_nGreaterThanM() {
        assertEquals(-1, RoundedAvg.roundedAvg(7, 5));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is less than m.
    */
    @Test
    void testRoundedAvg_nLessThanM() {
        assertEquals("0b11", RoundedAvg.roundedAvg(1, 5));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to m.
    */
    @Test
    void testRoundedAvg_nEqualToM() {
        assertEquals("0b101", RoundedAvg.roundedAvg(5, 5));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to m.
    */
    @Test
    void testRoundedAvg_nEqualToM_2() {
        assertEquals("0b1111", RoundedAvg.roundedAvg(10, 20));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to m.
    */
    @Test
    void testRoundedAvg_nEqualToM_3() {
        assertEquals("0b11010", RoundedAvg.roundedAvg(20, 33));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to m.
    */
    @Test
    void testRoundedAvg_nEqualToM_4() {
        assertEquals("0b1111001010", RoundedAvg.roundedAvg(964, 977));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to m.
    */
    @Test
    void testRoundedAvg_nEqualToM_5() {
        assertEquals("0b1111100100", RoundedAvg.roundedAvg(996, 997));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to m.
    */
    @Test
    void testRoundedAvg_nEqualToM_6() {
        assertEquals("0b1011000010", RoundedAvg.roundedAvg(560, 851));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to m.
    */
    @Test
    void testRoundedAvg_nEqualToM_7() {
        assertEquals("0b101101110", RoundedAvg.roundedAvg(185, 546));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to m.
    */
    @Test
    void testRoundedAvg_nEqualToM_8() {
        assertEquals("0b110101101", RoundedAvg.roundedAvg(362, 496));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to m.
    */
    @Test
    void testRoundedAvg_nEqualToM_9() {
        assertEquals("0b1001110010", RoundedAvg.roundedAvg(350, 902));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to m.
    */
    @Test
    void testRoundedAvg_nEqualToM_10() {
        assertEquals("0b11010111", RoundedAvg.roundedAvg(197, 233));
    }
}
