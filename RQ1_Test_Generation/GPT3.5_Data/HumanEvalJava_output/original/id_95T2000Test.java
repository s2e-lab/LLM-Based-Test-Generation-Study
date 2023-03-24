// CheckDictCaseTest.java
package original;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {
    
    @Test
    void testAllLower() {
        Map<String, String> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }
    
    @Test
    void testAllUpper() {
        Map<String, String> dict = new HashMap<>();
        dict.put("STATE", "NC");
        dict.put("ZIP", "12345");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }
    
    @Test
    void testMixedCase() {
        Map<String, String> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        dict.put("B", "banana");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
    
    @Test
    void testNonStringKey() {
        Map<Object, String> dict = new HashMap<>();
        dict.put("p", "pineapple");
        dict.put(5, "banana");
        dict.put("a", "apple");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
    
    @Test
    void testEmptyDict() {
        Map<String, String> dict = new HashMap<>();
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
    
    @Test
    void testDuplicateKeys() {
        Map<String, String> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("a", "apple");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
    
    @Test
    void testAllNumericKeys() {
        Map<Integer, String> dict = new HashMap<>();
        dict.put(1, "one");
        dict.put(2, "two");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
    
    @Test
    void testAllBooleanKeys() {
        Map<Boolean, String> dict = new HashMap<>();
        dict.put(true, "yes");
        dict.put(false, "no");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
    
    @Test
    void testAllNullKeys() {
        Map<Object, String> dict = new HashMap<>();
        dict.put(null, "null");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
    
    @Test
    void testAllEmptyStringKeys() {
        Map<String, String> dict = new HashMap<>();
        dict.put("", "empty");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
}