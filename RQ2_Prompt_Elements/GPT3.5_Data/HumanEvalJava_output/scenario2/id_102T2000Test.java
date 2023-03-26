Here's the code for the ChooseNumTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChooseNumTest {

    @Test
    void testChooseNum1() {
        int result = ChooseNum.chooseNum(1, 10);
        assertEquals(10, result);
    }

    @Test
    void testChooseNum2() {
        int result = ChooseNum.chooseNum(1, 9);
        assertEquals(8, result);
    }

    @Test
    void testChooseNum3() {
        int result = ChooseNum.chooseNum(2, 8);
        assertEquals(8, result);
    }

    @Test
    void testChooseNum4() {
        int result = ChooseNum.chooseNum(3, 7);
        assertEquals(6, result);
    }

    @Test
    void testChooseNum5() {
        int result = ChooseNum.chooseNum(4, 6);
        assertEquals(6, result);
    }

    @Test
    void testChooseNum6() {
        int result = ChooseNum.chooseNum(5, 5);
        assertEquals(-1, result);
    }

    @Test
    void testChooseNum7() {
        int result = ChooseNum.chooseNum(6, 4);
        assertEquals(-1, result);
    }

    @Test
    void testChooseNum8() {
        int result = ChooseNum.chooseNum(7, 3);
        assertEquals(-1, result);
    }

    @Test
    void testChooseNum9() {
        int result = ChooseNum.chooseNum(8, 2);
        assertEquals(-1, result);
    }

    @Test
    void testChooseNum10() {
        int result = ChooseNum.chooseNum(9, 1);
        assertEquals(-1, result);
    }
}
```

This test class contains ten unit test cases for the `chooseNum` method of the `ChooseNum` class. Each test case tests a different scenario and checks if the method returns the expected result. The `assertEquals` method is used to compare the expected result with the actual result returned by the method.