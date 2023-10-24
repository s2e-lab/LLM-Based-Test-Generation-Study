// IsBoredTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {

    @Test
    void testIsBored() {
        assertEquals(0, IsBored.isBored(""));
        assertEquals(0, IsBored.isBored(" "));
        assertEquals(0, IsBored.isBored("I am a student."));
        assertEquals(1, IsBored.isBored("I am a student. I am a student."));
        assertEquals(1, IsBored.isBored("I am a student. I am a student. I am a student."));
        assertEquals(2, IsBored.isBored("I am a student. I am a student. I am a student. I am a student."));
        assertEquals(2, IsBored.isBored("I am a student. I am a student. I am a student. I am a student. I am a student."));
        assertEquals(3, IsBored.isBored("I am a student. I am a student. I am a student. I am a student. I am a student. I am a student."));
        assertEquals(3, IsBored.isBored("I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student."));
        assertEquals(4, IsBored.isBored("I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student."));
        assertEquals(4, IsBored.isBored("I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student. I am a student."));
    }
}
