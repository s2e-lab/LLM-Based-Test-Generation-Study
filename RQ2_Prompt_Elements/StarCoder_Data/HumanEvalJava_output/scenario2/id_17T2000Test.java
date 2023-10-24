// ParseMusicTest.java
package scenario2;

import java.util.ArrayList;
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
     * It tests the case when the input string is empty.
     */
    @Test
    void testParseMusicEmptyString() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, ParseMusic.parseMusic(""));
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * It tests the case when the input string contains only whitespaces.
     */
    @Test
    void testParseMusicOnlyWhitespaces() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, ParseMusic.parseMusic("   "));
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * It tests the case when the input string contains only whitespaces and dots.
     */
    @Test
    void testParseMusicOnlyWhitespacesAndDots() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(1);
        assertEquals(expected, ParseMusic.parseMusic("  .  .  "));
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * It tests the case when the input string contains only whitespaces, dots and bars.
     */
    @Test
    void testParseMusicOnlyWhitespacesDotsAndBars() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(1);
        expected.add(1);
        assertEquals(expected, ParseMusic.parseMusic("  .  |  .  "));
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * It tests the case when the input string contains only whitespaces, dots and bars.
     */
    @Test
    void testParseMusicOnlyWhitespacesDotsAndBarsAndWholeNotes() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(2);
        expected.add(4);
        assertEquals(expected, ParseMusic.parseMusic("  o  |  o  "));
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * It tests the case when the input string contains only whitespaces, dots and bars.
     */
    @Test
    void testParseMusicOnlyWhitespacesDotsAndBarsAndWholeNotesAndHalfNotes() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(2);
        expected.add(2);
        assertEquals(expected, ParseMusic.parseMusic("  o  |  o|  "));
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * It tests the case when the input string contains only whitespaces, dots and bars.
     */
    @Test
    void testParseMusicOnlyWhitespacesDotsAndBarsAndWholeNotesAndHalfNotesAndQuarterNotes() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(2);
        expected.add(1);
        assertEquals(expected, ParseMusic.parseMusic("  o  |  .|  "));
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * It tests the case when the input string contains only whitespaces, dots and bars.
     */
    @Test
    void testParseMusicOnlyWhitespacesDotsAndBarsAndWholeNotesAndHalfNotesAndQuarterNotesAndWholeNotes() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(4);
        assertEquals(expected, ParseMusic.parseMusic("  o  |  .|  o  "));
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * It tests the case when the input string contains only whitespaces, dots and bars.
     */
    @Test
    void testParseMusicOnlyWhitespacesDotsAndBarsAndWholeNotesAndHalfNotesAndQuarterNotesAndWholeNotesAndHalfNotes() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(2);
        assertEquals(expected, ParseMusic.parseMusic("  o  |  .|  o|  "));
    }

    /**
     * Test case for the {@link ParseMusic#parseMusic(String)} method.
     * It tests the case when the input string contains only whitespaces, dots and bars.
     */
    @Test
    void testParseMusicOnlyWhitespacesDotsAndBarsAndWholeNotesAndHalfNotesAndQuarterNotesAndWholeNotesAndHalfNotesAndQuarterNotes() {
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(1);
        assertEquals(expected, ParseMusic.parseMusic("  o  |  .|  o|  .|  "));
    }
}
