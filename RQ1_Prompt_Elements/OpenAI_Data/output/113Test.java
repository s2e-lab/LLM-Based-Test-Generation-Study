// OddCountTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link OddCount}.
* It contains ten test cases for the {@link OddCount#oddCount()} method.
*/
class OddCountTest {

    @Test
    void testOddCount() {
        List<String> lst = new ArrayList<String>();
        lst.add("1234");
        lst.add("12345");
        lst.add("123456");
        lst.add("1234567");
        lst.add("12345678");
        lst.add("123456789");
        lst.add("1234567890");
        lst.add("12345678901");
        lst.add("123456789012");
        lst.add("1234567890123");
        List<String> result = new ArrayList<String>();
        result.add("the number of odd elements 2n the str2ng 2 of the 2nput.");
        result.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
        result.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
        result.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
        result.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
        result.add("the number of odd elements 5n the str5ng 5 of the 5nput.");
        result.add("the number of odd elements 5n the str5ng 5 of the 5nput.");
        result.add("the number of odd elements 6n the str6ng 6 of the 6nput.");
        result.add("the number of odd elements 6n the str6ng 6 of the 6nput.");
        result.add("the number of odd elements 7n the str7ng 7 of the 7nput.");
        assertEquals(result, OddCount.oddCount(lst));
    }
}