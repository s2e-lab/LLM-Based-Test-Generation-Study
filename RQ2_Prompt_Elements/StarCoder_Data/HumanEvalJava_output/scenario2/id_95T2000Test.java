// CheckDictCaseTest.java
package scenario2;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

    /**
     * Test case for an empty dictionary.
     */
    @Test
    void testCheckDictCaseEmpty() {
        Object dict = new Object();
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with all keys in lower case.
     */
    @Test
    void testCheckDictCaseAllLower() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c");
        assertEquals(true, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with all keys in upper case.
     */
    @Test
    void testCheckDictCaseAllUpper() {
        Map<String, String> dict = Map.of("A", "A", "B", "B", "C", "C");
        assertEquals(true, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed() {
        Map<String, String> dict = Map.of("a", "a", "B", "B", "C", "C");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed2() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed3() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed4() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed5() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F", "G", "G");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed6() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F", "G", "G", "H", "H");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed7() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F", "G", "G", "H", "H", "I", "I");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed8() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F", "G", "G", "H", "H", "I", "I", "J", "J");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed9() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F", "G", "G", "H", "H", "I", "I", "J", "J", "K", "K");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed10() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F", "G", "G", "H", "H", "I", "I", "J", "J", "K", "K", "L", "L");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed11() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F", "G", "G", "H", "H", "I", "I", "J", "J", "K", "K", "L", "L", "M", "M");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed12() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F", "G", "G", "H", "H", "I", "I", "J", "J", "K", "K", "L", "L", "M", "M", "N", "N");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed13() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F", "G", "G", "H", "H", "I", "I", "J", "J", "K", "K", "L", "L", "M", "M", "N", "N", "O", "O");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed14() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F", "G", "G", "H", "H", "I", "I", "J", "J", "K", "K", "L", "L", "M", "M", "N", "N", "O", "O", "P", "P");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed15() {
        Map<String, String> dict = Map.of("a", "a", "b", "b", "c", "c", "D", "D", "E", "E", "F", "F", "G", "G", "H", "H", "I", "I", "J", "J", "K", "K", "L", "L", "M", "M", "N", "N", "O", "O", "P", "P", "Q", "Q");
        assertEquals(false, CheckDictCase.checkDictCase(dict));
    }

    /**
     * Test case for a dictionary with mixed case.
     */
    @Test
    void testCheckDictCaseMixed16() {
        Map<String, String