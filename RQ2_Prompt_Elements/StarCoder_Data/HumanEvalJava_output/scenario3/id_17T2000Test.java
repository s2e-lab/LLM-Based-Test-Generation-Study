// ParseMusicTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseMusic}.
* It contains ten unit test cases for the {@link ParseMusic#parseMusic(String)} method.
*/
class ParseMusicTest {

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the empty string.
     */
    @Test
    void testParseMusicEmptyString() {
        List<Object> actual = ParseMusic.parseMusic("");
        List<Object> expected = List.of();
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the string with a single whole note.
     */
    @Test
    void testParseMusicSingleWholeNote() {
        List<Object> actual = ParseMusic.parseMusic("o");
        List<Object> expected = List.of(4);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the string with a single half note.
     */
    @Test
    void testParseMusicSingleHalfNote() {
        List<Object> actual = ParseMusic.parseMusic("o|");
        List<Object> expected = List.of(2);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the string with a single quarter note.
     */
    @Test
    void testParseMusicSingleQuarterNote() {
        List<Object> actual = ParseMusic.parseMusic(".|");
        List<Object> expected = List.of(1);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the string with a single whole note repeated four times.
     */
    @Test
    void testParseMusicSingleWholeNoteRepeatedFourTimes() {
        List<Object> actual = ParseMusic.parseMusic("o o o o");
        List<Object> expected = List.of(4, 4, 4, 4);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the string with a single half note repeated four times.
     */
    @Test
    void testParseMusicSingleHalfNoteRepeatedFourTimes() {
        List<Object> actual = ParseMusic.parseMusic("o| o| o| o|");
        List<Object> expected = List.of(2, 2, 2, 2);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the string with a single quarter note repeated four times.
     */
    @Test
    void testParseMusicSingleQuarterNoteRepeatedFourTimes() {
        List<Object> actual = ParseMusic.parseMusic(".| .| .| .|");
        List<Object> expected = List.of(1, 1, 1, 1);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the string with a single whole note repeated four times and a single half note repeated four times.
     */
    @Test
    void testParseMusicSingleWholeNoteRepeatedFourTimesAndSingleHalfNoteRepeatedFourTimes() {
        List<Object> actual = ParseMusic.parseMusic("o o o o o| o| o| o| o|");
        List<Object> expected = List.of(4, 4, 4, 4, 2, 2, 2, 2);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the string with a single whole note repeated four times and a single quarter note repeated four times.
     */
    @Test
    void testParseMusicSingleWholeNoteRepeatedFourTimesAndSingleQuarterNoteRepeatedFourTimes() {
        List<Object> actual = ParseMusic.parseMusic("o o o o .| .| .| .| .|");
        List<Object> expected = List.of(4, 4, 4, 4, 1, 1, 1, 1);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the string with a single whole note repeated four times and a single whole note repeated four times.
     */
    @Test
    void testParseMusicSingleWholeNoteRepeatedFourTimesAndSingleWholeNoteRepeatedFourTimes() {
        List<Object> actual = ParseMusic.parseMusic("o o o o o o o o o o");
        List<Object> expected = List.of(4, 4, 4, 4, 4, 4, 4, 4, 4, 4);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the string with a single whole note repeated four times and a single whole note repeated four times and a single half note repeated four times.
     */
    @Test
    void testParseMusicSingleWholeNoteRepeatedFourTimesAndSingleWholeNoteRepeatedFourTimesAndSingleHalfNoteRepeatedFourTimes() {
        List<Object> actual = ParseMusic.parseMusic("o o o o o o o o o o o| o| o| o| o| o| o| o| o|");
        List<Object> expected = List.of(4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 2, 2, 2, 2, 2, 2, 2, 2);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * Tests the string with a single whole note repeated four times and a single whole note repeated four times and a single quarter note repeated four times.
     */
    @Test
    void testParseMusicSingleWholeNoteRepeatedFourTimesAndSingleWholeNoteRepeatedFourTimesAndSingleQuarterNoteRepeatedFourTimes() {
        List<Object> actual = ParseMusic.parseMusic("o o o o o o o o o o .| .| .| .| .| .| .| .| .|");
        List<Object> expected = List.of(4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1, 1, 1, 1, 1, 1, 1, 1);
        assertEquals(expected, actual);
    }
}
