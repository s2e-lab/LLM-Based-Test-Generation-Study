Here's the code for the IsBoredTest class:

```
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsBoredTest {

    @Test
    void testEmptyString() {
        assertEquals(0, IsBored.isBored(""));
    }

    @Test
    void testNoI() {
        assertEquals(0, IsBored.isBored("This is a test."));
    }

    @Test
    void testOneI() {
        assertEquals(1, IsBored.isBored("I am bored."));
    }

    @Test
    void testMultipleI() {
        assertEquals(3, IsBored.isBored("I am bored. I am tired. I am hungry."));
    }

    @Test
    void testIAtEnd() {
        assertEquals(1, IsBored.isBored("This is a test. I"));
    }

    @Test
    void testIAtBeginning() {
        assertEquals(1, IsBored.isBored("I am bored. This is a test."));
    }

    @Test
    void testIWithPunctuation() {
        assertEquals(1, IsBored.isBored("I am bored, too!"));
    }

    @Test
    void testMultipleSentences() {
        assertEquals(2, IsBored.isBored("I am bored. This is a test. I am tired."));
    }

    @Test
    void testMultipleSentencesWithPunctuation() {
        assertEquals(2, IsBored.isBored("I am bored! This is a test. I am tired."));
    }

    @Test
    void testOnlyI() {
        assertEquals(1, IsBored.isBored("I"));
    }
}
```

This test class contains ten unit test cases for the `isBored` method of the `IsBored` class. Each test case tests a different scenario and uses the `assertEquals` method to check if the expected result matches the actual result returned by the `isBored` method.