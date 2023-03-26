// CheckDictCase.java
package scenario3;

import java.util.Map;

class CheckDictCase {

    /**
     * * Given a dictionary, return True if all keys are strings in lower
     * case or all keys are strings in upper case, else return False.
     * The function should return False is the given dictionary is empty.
     * Examples:
     * check_dict_case({"a":"apple", "b":"banana"}) should return True.
     * check_dict_case({"a":"apple", "A":"banana", "B":"banana"}) should return False.
     * check_dict_case({"a":"apple", 8:"banana", "a":"apple"}) should return False.
     * check_dict_case({"Name":"John", "Age":"36", "City":"Houston"}) should return False.
     * check_dict_case({"STATE":"NC", "ZIP":"12345" }) should return True.
     *
     * > checkDictCase({"p": "pineapple", "b": "banana"})
     * true
     * > checkDictCase({"p": "pineapple", "A": "banana", "B": "banana"})
     * false
     * > checkDictCase({"p": "pineapple", 5: "banana", "a": "apple"})
     * false
     * > checkDictCase({"Name": "John", "Age": "36", "City": "Houston"})
     * false
     * > checkDictCase({"STATE": "NC", "ZIP": "12345"})
     * true
     * > checkDictCase({"fruit": "Orange", "taste": "Sweet"})
     * true
     * > checkDictCase({})
     * false
     */
    public static Boolean checkDictCase(Object dict) {
        if (dict instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) dict;
            if (map.isEmpty()) {
                return false;
            }
            boolean allLowerCase = true;
            boolean allUpperCase = true;
            for (Object key : map.keySet()) {
                if (!(key instanceof String)) {
                    return false;
                }
                String strKey = (String) key;
                if (!strKey.equals(strKey.toLowerCase())) {
                    allLowerCase = false;
                }
                if (!strKey.equals(strKey.toUpperCase())) {
                    allUpperCase = false;
                }
                if (!allLowerCase && !allUpperCase) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

// CheckDictCaseTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

    @Test
    void testAllLowerCase() {
        assertTrue(CheckDictCase.checkDictCase(Map.of("a", "apple", "b", "banana")));
        assertTrue(CheckDictCase.checkDictCase(Map.of("fruit", "orange", "taste", "sweet")));
    }

    @Test
    void testAllUpperCase() {
        assertTrue(CheckDictCase.checkDictCase(Map.of("STATE", "NC", "ZIP", "12345")));
    }

    @Test
    void testMixedCase() {
        assertFalse(CheckDictCase.checkDictCase(Map.of("a", "apple", "A", "banana", "B", "banana")));
        assertFalse(CheckDictCase.checkDictCase(Map.of("Name", "John", "Age", "36", "City", "Houston")));
    }

    @Test
    void testNonStringKey() {
        assertFalse(CheckDictCase.checkDictCase(Map.of("a", "apple", 8, "banana", "a", "apple")));
        assertFalse(CheckDictCase.checkDictCase(Map.of("p", "pineapple", 5, "banana", "a", "apple")));
    }

    @Test
    void testEmptyDict() {
        assertFalse(CheckDictCase.checkDictCase(Map.of()));
    }
}