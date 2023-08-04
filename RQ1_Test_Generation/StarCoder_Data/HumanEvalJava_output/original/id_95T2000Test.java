// CheckDictCaseTest.java
package original;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

    /**
    * Test case number: 1
    * Test case values: {"a":"apple", "b":"banana"}
    * Expected output (Post-state): true
    */
    @Test
    void test1() {
        Map<String, String> dict = Map.of("a", "apple", "b", "banana");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    /**
    * Test case number: 2
    * Test case values: {"a":"apple", "A":"banana", "B":"banana"}
    * Expected output (Post-state): false
    */
    @Test
    void test2() {
        Map<String, String> dict = Map.of("a", "apple", "A", "banana", "B", "banana");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    /**
    * Test case number: 3
    * Test case values: {"a":"apple", 8:"banana", "a":"apple"}
    * Expected output (Post-state): false
    */
    @Test
    void test3() {
        Map<String, String> dict = Map.of("a", "apple", 8, "banana", "a", "apple");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    /**
    * Test case number: 4
    * Test case values: {"Name":"John", "Age":"36", "City":"Houston"}
    * Expected output (Post-state): false
    */
    @Test
    void test4() {
        Map<String, String> dict = Map.of("Name", "John", "Age", "36", "City", "Houston");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    /**
    * Test case number: 5
    * Test case values: {"STATE":"NC", "ZIP":"12345" }
    * Expected output (Post-state): true
    */
    @Test
    void test5() {
        Map<String, String> dict = Map.of("STATE", "NC", "ZIP", "12345");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    /**
    * Test case number: 6
    * Test case values: {"p": "pineapple", "b": "banana"}
    * Expected output (Post-state): true
    */
    @Test
    void test6() {
        Map<String, String> dict = Map.of("p", "pineapple", "b", "banana");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    /**
    * Test case number: 7
    * Test case values: {"p": "pineapple", "A": "banana", "B": "banana"}
    * Expected output (Post-state): false
    */
    @Test
    void test7() {
        Map<String, String> dict = Map.of("p", "pineapple", "A", "banana", "B", "banana");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    /**
    * Test case number: 8
    * Test case values: {"p": "pineapple", 5: "banana", "a": "apple"}
    * Expected output (Post-state): false
    */
    @Test
    void test8() {
        Map<String, String> dict = Map.of("p", "pineapple", 5, "banana", "a", "apple");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    /**
    * Test case number: 9
    * Test case values: {"Name": "John", "Age": "36", "City": "Houston"}
    * Expected output (Post-state): false
    */
    @Test
    void test9() {
        Map<String, String> dict = Map.of("Name", "John", "Age", "36", "City", "Houston");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    /**
    * Test case number: 10
    * Test case values: {"STATE": "NC", "ZIP": "12345"}
    * Expected output (Post-state): true
    */
    @Test
    void test10() {
        Map<String, String> dict = Map.of("STATE", "NC", "ZIP", "12345");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    /**
    * Test case number: 11
    * Test case values: {"fruit": "Orange", "taste": "Sweet"}
    * Expected output (Post-state): true
    */
    @Test
    void test11() {
        Map<String, String> dict = Map.of("fruit", "Orange", "taste", "Sweet");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    /**
    * Test case number: 12
    * Test case values: {}
    * Expected output (Post-state): false
    */
    @Test
    void test12() {
        Map<String, String> dict = Map.of();
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
}
