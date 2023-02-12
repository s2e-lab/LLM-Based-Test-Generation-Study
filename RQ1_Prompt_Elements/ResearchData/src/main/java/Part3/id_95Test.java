package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CheckDictCaseTest {
    @Test
    public void testCheckDictCase() {
        assertEquals(true, CheckDictCase.checkDictCase(new HashMap<String, String>() {{
            put("p", "pineapple");
            put("b", "banana");
        }}));
        assertEquals(false, CheckDictCase.checkDictCase(new HashMap<String, String>() {{
            put("p", "pineapple");
            put("A", "banana");
            put("B", "banana");
        }}));
        assertEquals(false, CheckDictCase.checkDictCase(new HashMap<String, String>() {{
            put("p", "pineapple");
            put("5", "banana");
            put("a", "apple");
        }}));
        assertEquals(false, CheckDictCase.checkDictCase(new HashMap<String, String>() {{
            put("Name", "John");
            put("Age", "36");
            put("City", "Houston");
        }}));
        assertEquals(true, CheckDictCase.checkDictCase(new HashMap<String, String>() {{
            put("STATE", "NC");
            put("ZIP", "12345");
        }}));
        assertEquals(true, CheckDictCase.checkDictCase(new HashMap<String, String>() {{
            put("fruit", "Orange");
            put("taste", "Sweet");
        }}));
        assertEquals(false, CheckDictCase.checkDictCase(new HashMap<String, String>()));
    }
}