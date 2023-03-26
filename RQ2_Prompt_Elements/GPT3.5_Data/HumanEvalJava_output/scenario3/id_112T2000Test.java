// ReverseDeleteTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReverseDelete}.
* It contains ten unit test cases for the {@link ReverseDelete#reverseDelete(String, String)} method.
*/
class ReverseDeleteTest {
    
    @Test
    void testReverseDelete1() {
        List<Object> result = ReverseDelete.reverseDelete("abcde", "ae");
        assertEquals("bcd", result.get(0));
        assertFalse((boolean) result.get(1));
    }
    
    @Test
    void testReverseDelete2() {
        List<Object> result = ReverseDelete.reverseDelete("abcdef", "b");
        assertEquals("acdef", result.get(0));
        assertFalse((boolean) result.get(1));
    }
    
    @Test
    void testReverseDelete3() {
        List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "ab");
        assertEquals("cdedc", result.get(0));
        assertTrue((boolean) result.get(1));
    }
    
    @Test
    void testReverseDelete4() {
        List<Object> result = ReverseDelete.reverseDelete("dwik", "w");
        assertEquals("dik", result.get(0));
        assertFalse((boolean) result.get(1));
    }
    
    @Test
    void testReverseDelete5() {
        List<Object> result = ReverseDelete.reverseDelete("a", "a");
        assertEquals("", result.get(0));
        assertTrue((boolean) result.get(1));
    }
    
    @Test
    void testReverseDelete6() {
        List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "");
        assertEquals("abcdedcba", result.get(0));
        assertTrue((boolean) result.get(1));
    }
    
    @Test
    void testReverseDelete7() {
        List<Object> result = ReverseDelete.reverseDelete("abcdedcba", "v");
        assertEquals("abcdedcba", result.get(0));
        assertTrue((boolean) result.get(1));
    }
    
    @Test
    void testReverseDelete8() {
        List<Object> result = ReverseDelete.reverseDelete("vabba", "v");
        assertEquals("abba", result.get(0));
        assertTrue((boolean) result.get(1));
    }
    
    @Test
    void testReverseDelete9() {
        List<Object> result = ReverseDelete.reverseDelete("mamma", "mia");
        assertEquals("", result.get(0));
        assertTrue((boolean) result.get(1));
    }
    
    @Test
    void testReverseDelete10() {
        List<Object> result = ReverseDelete.reverseDelete("", "");
        assertEquals("", result.get(0));
        assertTrue((boolean) result.get(1));
    }
}