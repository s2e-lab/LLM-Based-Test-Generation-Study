// OddCountTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {

    /**
     * Test case for the {@link OddCount#oddCount(List)} method.
     * Tests that the method returns a list of strings.
     */
    @Test
    void testOddCount() {
        List<String> lst = new ArrayList<String>();
        lst.add("1234567");
        List<String> result = OddCount.oddCount(lst);
        assertEquals(1, result.size());
        assertEquals("the number of odd elements 4n the str4ng 4 of the 4nput.", result.get(0));
    }

    /**
     * Test case for the {@link OddCount#oddCount(List)} method.
     * Tests that the method returns a list of strings.
     */
    @Test
    void testOddCount2() {
        List<String> lst = new ArrayList<String>();
        lst.add("3");
        lst.add("11111111");
        List<String> result = OddCount.oddCount(lst);
        assertEquals(2, result.size());
        assertEquals("the number of odd elements 1n the str1ng 1 of the 1nput.", result.get(0));
        assertEquals("the number of odd elements 8n the str8ng 8 of the 8nput.", result.get(1));
    }

    /**
     * Test case for the {@link OddCount#oddCount(List)} method.
     * Tests that the method returns a list of strings.
     */
    @Test
    void testOddCount3() {
        List<String> lst = new ArrayList<String>();
        lst.add("271");
        lst.add("137");
        lst.add("314");
        List<String> result = OddCount.oddCount(lst);
        assertEquals(3, result.size());
        assertEquals("the number of odd elements 2n the str2ng 2 of the 2nput.", result.get(0));
        assertEquals("the number of odd elements 3n the str3ng 3 of the 3nput.", result.get(1));
        assertEquals("the number of odd elements 2n the str2ng 2 of the 2nput.", result.get(2));
    }
}
