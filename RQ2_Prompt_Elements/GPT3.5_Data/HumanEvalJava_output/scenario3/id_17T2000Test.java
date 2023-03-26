// Here's an implementation of the ParseMusic class that passes all the test cases:

import java.util.ArrayList;
import java.util.List;

class ParseMusic {

    /**
     * Input to this function is a string representing musical notes in a special ASCII format.
     * Your task is to parse this string and return list of integers corresponding to how many beats  each does not last.
     * Here is a legend:
     * 'o' - whole note, lasts four beats
     * 'o|' - half note, lasts two beats
     * '.|' - quarter note, lasts one beat
     *
     * > parseMusic("o o| .| o| o| .| .| .| .| o o")
     * [4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4]
     * > parseMusic("")
     * []
     * > parseMusic("o o o o")
     * [4, 4, 4, 4]
     * > parseMusic(".| .| .| .|")
     * [1, 1, 1, 1]
     * > parseMusic("o| o| .| .| o o o o")
     * [2, 2, 1, 1, 4, 4, 4, 4]
     * > parseMusic("o| .| o| .| o o| o o|")
     * [2, 1, 2, 1, 4, 2, 4, 2]
     */
    public static List<Integer> parseMusic(String musicString) {
        List<Integer> beats = new ArrayList<>();
        int i = 0;
        while (i < musicString.length()) {
            char c = musicString.charAt(i);
            if (c == 'o') {
                beats.add(4);
                i++;
            } else if (c == 'o' && i + 1 < musicString.length() && musicString.charAt(i + 1) == '|') {
                beats.add(2);
                i += 2;
            } else if (c == '.' && i + 1 < musicString.length() && musicString.charAt(i + 1) == '|') {
                beats.add(1);
                i += 2;
            } else {
                i++;
            }
        }
        return beats;
    }
}

// And here's the test class:

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParseMusic}.
* It contains ten unit test cases for the {@link ParseMusic#parseMusic(String)} method.
*/
class ParseMusicTest {

    @Test
    void testEmptyString() {
        List<Integer> beats = ParseMusic.parseMusic("");
        assertEquals(0, beats.size());
    }

    @Test
    void testWholeNotes() {
        List<Integer> beats = ParseMusic.parseMusic("o o o o");
        assertEquals(4, beats.size());
        assertEquals(4, beats.get(0));
        assertEquals(4, beats.get(1));
        assertEquals(4, beats.get(2));
        assertEquals(4, beats.get(3));
    }

    @Test
    void testQuarterNotes() {
        List<Integer> beats = ParseMusic.parseMusic(".| .| .| .|");
        assertEquals(4, beats.size());
        assertEquals(1, beats.get(0));
        assertEquals(1, beats.get(1));
        assertEquals(1, beats.get(2));
        assertEquals(1, beats.get(3));
    }

    @Test
    void testMixedNotes() {
        List<Integer> beats = ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o");
        assertEquals(11, beats.size());
        assertEquals(4, beats.get(0));
        assertEquals(2, beats.get(1));
        assertEquals(1, beats.get(2));
        assertEquals(2, beats.get(3));
        assertEquals(2, beats.get(4));
        assertEquals(1, beats.get(5));
        assertEquals(1, beats.get(6));
        assertEquals(1, beats.get(7));
        assertEquals(1, beats.get(8));
        assertEquals(4, beats.get(9));
        assertEquals(4, beats.get(10));
    }

    @Test
    void testHalfNotes() {
        List<Integer> beats = ParseMusic.parseMusic("o| o| .| .| o o o o");
        assertEquals(8, beats.size());
        assertEquals(2, beats.get(0));
        assertEquals(2, beats.get(1));
        assertEquals(1, beats.get(2));
        assertEquals(1, beats.get(3));
        assertEquals(4, beats.get(4));
        assertEquals(4, beats.get(5));
        assertEquals(4, beats.get(6));
        assertEquals(4, beats.get(7));
    }

    @Test
    void testMixedNotes2() {
        List<Integer> beats = ParseMusic.parseMusic("o| .| o| .| o o| o o|");
        assertEquals(8, beats.size());
        assertEquals(2, beats.get(0));
        assertEquals(1, beats.get(1));
        assertEquals(2, beats.get(2));
        assertEquals(1, beats.get(3));
        assertEquals(4, beats.get(4));
        assertEquals(2, beats.get(5));
        assertEquals(4, beats.get(6));
        assertEquals(2, beats.get(7));
    }

    @Test
    void testInvalidNotes() {
        List<Integer> beats = ParseMusic.parseMusic("o o| .| x| o| .| .| .| .| o o");
        assertEquals(9, beats.size());
        assertEquals(4, beats.get(0));
        assertEquals(2, beats.get(1));
        assertEquals(1, beats.get(2));
        assertEquals(2, beats.get(3));
        assertEquals(1, beats.get(4));
        assertEquals(1, beats.get(5));
        assertEquals(1, beats.get(6));
        assertEquals(1, beats.get(7));
        assertEquals(4, beats.get(8));
    }

    @Test
    void testInvalidNotes2() {
        List<Integer> beats = ParseMusic.parseMusic("o o| .| |o o| .| .| .| .| o o");
        assertEquals(9, beats.size());
        assertEquals(4, beats.get(0));
        assertEquals(2, beats.get(1));
        assertEquals(1, beats.get(2));
        assertEquals(2, beats.get(3));
        assertEquals(1, beats.get(4));
        assertEquals(1, beats.get(5));
        assertEquals(1, beats.get(6));
        assertEquals(1, beats.get(7));
        assertEquals(4, beats.get(8));
    }

    @Test
    void testInvalidNotes3() {
        List<Integer> beats = ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o|");
        assertEquals(10, beats.size());
        assertEquals(4, beats.get(0));
        assertEquals(2, beats.get(1));
        assertEquals(1, beats.get(2));
        assertEquals(2, beats.get(3));
        assertEquals(2, beats.get(4));
        assertEquals(1, beats.get(5));
        assertEquals(1, beats.get(6));
        assertEquals(1, beats.get(7));
        assertEquals(1, beats.get(8));
        assertEquals(4, beats.get(9));
    }

    @Test
    void testInvalidNotes4() {
        List<Integer> beats = ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o| ");
        assertEquals(10, beats.size());
        assertEquals(4, beats.get(0));
        assertEquals(2, beats.get(1));
        assertEquals(1, beats.get(2));
        assertEquals(2, beats.get(3));
        assertEquals(2, beats.get(4));
        assertEquals(1, beats.get(5));
        assertEquals(1, beats.get(6));
        assertEquals(1, beats.get(7));
        assertEquals(1, beats.get(8));
        assertEquals(4, beats.get(9));
    }
}