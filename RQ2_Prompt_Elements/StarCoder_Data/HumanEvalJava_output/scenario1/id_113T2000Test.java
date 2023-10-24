// OddCountTest.java
package scenario1;

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
    */
    @Test
    void testOddCount() {
        List<String> lst = new ArrayList<String>();
        lst.add("123456789");
        lst.add("123456789");
        lst.add("123456789");
        lst.add("123456789");
        lst.add("123456789");
        lst.add("123456789");
        lst.add("123456789");
        lst.add("123456789");
        lst.add("123456789");
        lst.add("123456789");
        List<String> result = OddCount.oddCount(lst);
        assertEquals(10, result.size());
        assertEquals("the number of odd elements 5n the str5n string 5 of the 5nput.", result.get(0));
        assertEquals("the number of odd elements 5n the str5n string 5 of the 5nput.", result.get(1));
        assertEquals("the number of odd elements 5n the str5n string 5 of the 5nput.", result.get(2));
        assertEquals("the number of odd elements 5n the str5n string 5 of the 5nput.", result.get(3));
        assertEquals("the number of odd elements 5n the str5n string 5 of the 5nput.", result.get(4));
        assertEquals("the number of odd elements 5n the str5n string 5 of the 5nput.", result.get(5));
        assertEquals("the number of odd elements 5n the str5n string 5 of the 5nput.", result.get(6));
        assertEquals("the number of odd elements 5n the str5n string 5 of the 5nput.", result.get(7));
        assertEquals("the number of odd elements 5n the str5n string 5 of the 5nput.", result.get(8));
        assertEquals("the number of odd elements 5n the str5n string 5 of the 5nput.", result.get(9));
    }
}
