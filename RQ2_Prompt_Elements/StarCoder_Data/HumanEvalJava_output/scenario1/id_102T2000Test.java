// ChooseNumTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains ten unit test cases for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {

    @Test
    void testChooseNum1() {
        assertEquals(2, ChooseNum.chooseNum(2, 4));
    }

    @Test
    void testChooseNum2() {
        assertEquals(4, ChooseNum.chooseNum(4, 4));
    }

    @Test
    void testChooseNum3() {
        assertEquals(6, ChooseNum.chooseNum(6, 8));
    }

    @Test
    void testChooseNum4() {
        assertEquals(8, ChooseNum.chooseNum(8, 8));
    }

    @Test
    void testChooseNum5() {
        assertEquals(10, ChooseNum.chooseNum(10, 12));
    }

    @Test
    void testChooseNum6() {
        assertEquals(12, ChooseNum.chooseNum(12, 12));
    }

    @Test
    void testChooseNum7() {
        assertEquals(14, ChooseNum.chooseNum(14, 16));
    }

    @Test
    void testChooseNum8() {
        assertEquals(16, ChooseNum.chooseNum(16, 16));
    }

    @Test
    void testChooseNum9() {
        assertEquals(18, ChooseNum.chooseNum(18, 20));
    }

    @Test
    void testChooseNum10() {
        assertEquals(20, ChooseNum.chooseNum(20, 20));
    }
}
