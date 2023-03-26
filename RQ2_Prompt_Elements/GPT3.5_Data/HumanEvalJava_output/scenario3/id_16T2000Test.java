// CountDistinctCharacters.java
package scenario3;

import java.util.HashSet;
import java.util.Set;

class CountDistinctCharacters {

    /**
     * Given a string, find out how many distinct characters (regardless of case)  it consists  of.
     *
     * > countDistinctCharacters("xyzXYZ")
     * 3
     * > countDistinctCharacters("Jerry")
     * 4
     * > countDistinctCharacters("")
     * 0
     * > countDistinctCharacters("abcde")
     * 5
     * > countDistinctCharacters("abcdecadeCADE")
     * 5
     * > countDistinctCharacters("aaaaAAAAaaaa")
     * 1
     * > countDistinctCharacters("Jerry jERRY JeRRRY")
     * 5
     */
    public static int countDistinctCharacters(String string) {
        Set<Character> distinctChars = new HashSet<>();
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                distinctChars.add(Character.toLowerCase(c));
            }
        }
        return distinctChars.size();
    }
}

// CountDistinctCharactersTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {

    @Test
    void testEmptyString() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
    }

    @Test
    void testSingleDistinctCharacter() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("a"));
    }

    @Test
    void testSingleNonLetterCharacter() {
        assertEquals(0, CountDistinctCharacters.countDistinctCharacters("1"));
    }

    @Test
    void testMultipleDistinctCharacters() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
    }

    @Test
    void testMultipleMixedCaseDistinctCharacters() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
    }

    @Test
    void testMultipleSameCharacters() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
    }

    @Test
    void testMultipleMixedCaseSameCharacters() {
        assertEquals(1, CountDistinctCharacters.countDistinctCharacters("AAAAaaaa"));
    }

    @Test
    void testMultipleWords() {
        assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
    }

    @Test
    void testSpecialCharacters() {
        assertEquals(2, CountDistinctCharacters.countDistinctCharacters("a!b@c#d$e%f^g&h*i(j)k_l+m=n{o}p[q]r\\s|t`u~v"));
    }

    @Test
    void testAllLetters() {
        assertEquals(26, CountDistinctCharacters.countDistinctCharacters("abcdefghijklmnopqrstuvwxyz"));
    }
}