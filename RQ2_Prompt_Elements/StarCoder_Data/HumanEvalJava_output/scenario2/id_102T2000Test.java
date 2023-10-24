// ChooseNumTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains ten unit test cases for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when the first argument is 1 and the second argument is 10.
     */
    @Test
    void testChooseNum1() {
        assertEquals(10, ChooseNum.chooseNum(1, 10));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when the first argument is 1 and the second argument is 11.
     */
    @Test
    void testChooseNum2() {
        assertEquals(-1, ChooseNum.chooseNum(1, 11));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when the first argument is 1 and the second argument is 12.
     */
    @Test
    void testChooseNum3() {
        assertEquals(12, ChooseNum.chooseNum(1, 12));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when the first argument is 1 and the second argument is 13.
     */
    @Test
    void testChooseNum4() {
        assertEquals(-1, ChooseNum.chooseNum(1, 13));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when the first argument is 1 and the second argument is 14.
     */
    @Test
    void testChooseNum5() {
        assertEquals(14, ChooseNum.chooseNum(1, 14));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when the first argument is 1 and the second argument is 15.
     */
    @Test
    void testChooseNum6() {
        assertEquals(-1, ChooseNum.chooseNum(1, 15));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when the first argument is 1 and the second argument is 16.
     */
    @Test
    void testChooseNum7() {
        assertEquals(16, ChooseNum.chooseNum(1, 16));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when the first argument is 1 and the second argument is 17.
     */
    @Test
    void testChooseNum8() {
        assertEquals(-1, ChooseNum.chooseNum(1, 17));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when the first argument is 1 and the second argument is 18.
     */
    @Test
    void testChooseNum9() {
        assertEquals(18, ChooseNum.chooseNum(1, 18));
    }

    /**
     * Test case for {@link ChooseNum#chooseNum(int, int)}
     * when the first argument is 1 and the second argument is 19.
     */
    @Test
    void testChooseNum10() {
        assertEquals(-1, ChooseNum.chooseNum(1, 19));
    }
}
