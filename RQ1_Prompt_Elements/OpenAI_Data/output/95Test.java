// CheckDictCaseTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link CheckDictCase}.
* It contains ten test cases for the {@link CheckDictCase#checkDictCase()} method.
*/
class CheckDictCaseTest {


    @Test
    void testCheckDictCase() {
        Map<String, String> dict1 = new HashMap<String, String>();
        dict1.put("a", "1");
        dict1.put("b", "2");
        dict1.put("c", "3");
        assertTrue(CheckDictCase.checkDictCase(dict1));

        Map<String, String> dict2 = new HashMap<String, String>();
        dict2.put("A", "1");
        dict2.put("B", "2");
        dict2.put("C", "3");
        assertTrue(CheckDictCase.checkDictCase(dict2));

        Map<String, String> dict3 = new HashMap<String, String>();
        dict3.put("a", "1");
        dict3.put("B", "2");
        dict3.put("c", "3");
        assertFalse(CheckDictCase.checkDictCase(dict3));

        Map<String, String> dict4 = new HashMap<String, String>();
        dict4.put("A", "1");
        dict4.put("b", "2");
        dict4.put("C", "3");
        assertFalse(CheckDictCase.checkDictCase(dict4));

        Map<String, String> dict5 = new HashMap<String, String>();
        dict5.put("a", "1");
        dict5.put("b", "2");
        dict5.put("C", "3");
        assertFalse(CheckDictCase.checkDictCase(dict5));

        Map<String, String> dict6 = new HashMap<String, String>();
        dict6.put("A", "1");
        dict6.put("B", "2");
        dict6.put("c", "3");
        assertFalse(CheckDictCase.checkDictCase(dict6));

        Map<String, String> dict7 = new HashMap<String, String>();
        dict7.put("a", "1");
        dict7.put("B", "2");
        dict7.put("C", "3");
        assertFalse(CheckDictCase.checkDictCase(dict7));

        Map<String, String> dict8 = new HashMap<String, String>();
        dict8.put("A", "1");
        dict8.put("b", "2");
        dict8.put("c", "3");
        assertFalse(CheckDictCase.checkDictCase(dict8));

        Map<String, String> dict9 = new HashMap<String, String>();
        dict9.put("a", "1");
        dict9.put("b", "2");
        dict9.put("C", "3");
        assertFalse(CheckDictCase.checkDictCase(dict9));

        Map<String, String> dict10 = new HashMap<String, String>();
        dict10.put("A", "1");
        dict10.put("B", "2");
        dict10.put("c", "3");
        assertFalse(CheckDictCase.checkDictCase(dict10));
    }
}