// ChooseNumTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains ten unit test cases for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when x is greater than y.
     */
    @Test
    void testChooseNum1() {
        assertEquals(-1, ChooseNum.chooseNum(12, 15));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when x is less than y.
     */
    @Test
    void testChooseNum2() {
        assertEquals(-1, ChooseNum.chooseNum(13, 12));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when x and y are equal.
     */
    @Test
    void testChooseNum3() {
        assertEquals(-1, ChooseNum.chooseNum(33, 12354));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when x and y are equal.
     */
    @Test
    void testChooseNum4() {
        assertEquals(-1, ChooseNum.chooseNum(5234, 5233));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when x and y are equal.
     */
    @Test
    void testChooseNum5() {
        assertEquals(28, ChooseNum.chooseNum(6, 29));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when x and y are equal.
     */
    @Test
    void testChooseNum6() {
        assertEquals(-1, ChooseNum.chooseNum(27, 10));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when x and y are equal.
     */
    @Test
    void testChooseNum7() {
        assertEquals(-1, ChooseNum.chooseNum(7, 7));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when x and y are equal.
     */
    @Test
    void testChooseNum8() {
        assertEquals(546, ChooseNum.chooseNum(546, 546));
    }
}
