Here's the code for the `IsHappyTest` class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsHappyTest {

    @Test
    void testIsHappyWithEmptyString() {
        assertFalse(IsHappy.isHappy(""));
    }

    @Test
    void testIsHappyWithShortString() {
        assertFalse(IsHappy.isHappy("ab"));
    }

    @Test
    void testIsHappyWithThreeDistinctLetters() {
        assertTrue(IsHappy.isHappy("abc"));
    }

    @Test
    void testIsHappyWithThreeSameLetters() {
        assertFalse(IsHappy.isHappy("aaa"));
    }

    @Test
    void testIsHappyWithThreeConsecutiveSameLetters() {
        assertFalse(IsHappy.isHappy("abcabcabc"));
    }

    @Test
    void testIsHappyWithThreeConsecutiveDistinctLetters() {
        assertTrue(IsHappy.isHappy("abcxyzdef"));
    }

    @Test
    void testIsHappyWithFourConsecutiveDistinctLetters() {
        assertTrue(IsHappy.isHappy("abcdxyz"));
    }

    @Test
    void testIsHappyWithFourConsecutiveSameLetters() {
        assertFalse(IsHappy.isHappy("abcaaaaa"));
    }

    @Test
    void testIsHappyWithLongString() {
        assertTrue(IsHappy.isHappy("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void testIsHappyWithLongStringWithRepeatingLetters() {
        assertFalse(IsHappy.isHappy("abcdefghijklmnopqrstuvwxyzaaa"));
    }
}
```

This test class contains ten test cases for the `isHappy` method of the `IsHappy` class. The test cases cover different scenarios, such as empty string, short string, long string, string with repeating letters, and so on. Each test case is annotated with the `@Test` annotation, and it uses the `assertTrue` and `assertFalse` methods from the `Assertions` class to check the expected result of the `isHappy` method.