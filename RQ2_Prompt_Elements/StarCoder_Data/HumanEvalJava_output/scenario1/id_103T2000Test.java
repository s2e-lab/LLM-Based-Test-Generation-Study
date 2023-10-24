// RoundedAvgTest.java
package scenario1;


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
        assertEquals(-1, RoundedAvg.roundedAvg(10, 5));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to m.
    */
    @Test
    void testRoundedAvg_nEqualToM() {
        assertEquals("0b10", RoundedAvg.roundedAvg(10, 10));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is less than m.
    */
    @Test
    void testRoundedAvg_nLessThanM() {
        assertEquals("0b10", RoundedAvg.roundedAvg(5, 10));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to 0.
    */
    @Test
    void testRoundedAvg_nEqualTo0() {
        assertEquals("0b10", RoundedAvg.roundedAvg(0, 10));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where m is equal to 0.
    */
    @Test
    void testRoundedAvg_mEqualTo0() {
        assertEquals("0b10", RoundedAvg.roundedAvg(10, 0));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to 1.
    */
    @Test
    void testRoundedAvg_nEqualTo1() {
        assertEquals("0b10", RoundedAvg.roundedAvg(1, 10));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where m is equal to 1.
    */
    @Test
    void testRoundedAvg_mEqualTo1() {
        assertEquals("0b10", RoundedAvg.roundedAvg(10, 1));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to -1.
    */
    @Test
    void testRoundedAvg_nEqualToMinus1() {
        assertEquals("0b10", RoundedAvg.roundedAvg(-1, 10));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where m is equal to -1.
    */
    @Test
    void testRoundedAvg_mEqualToMinus1() {
        assertEquals("0b10", RoundedAvg.roundedAvg(10, -1));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to 1000000000.
    */
    @Test
    void testRoundedAvg_nEqualTo1000000000() {
        assertEquals("0b1000000000", RoundedAvg.roundedAvg(1000000000, 1000000000));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where m is equal to 1000000000.
    */
    @Test
    void testRoundedAvg_mEqualTo1000000000() {
        assertEquals("0b1000000000", RoundedAvg.roundedAvg(1000000000, 1000000000));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where n is equal to -1000000000.
    */
    @Test
    void testRoundedAvg_nEqualToMinus1000000000() {
        assertEquals("0b1000000000", RoundedAvg.roundedAvg(-1000000000, 1000000000));
    }

    /**
    * Test case for {@link RoundedAvg#roundedAvg(int, int)} where m is equal to -1000000000.
    */
    @Test
    void testRoundedAvg_mEqualToMinus1000000000() {
        assertEquals("0b1000000000", RoundedAvg.roundedAvg(1000000000, -1000000000));
    }
}
