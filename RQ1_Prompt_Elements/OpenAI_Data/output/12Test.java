// LongestTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Longest}.
* It contains ten test cases for the {@link Longest#longest()} method.
*/
class LongestTest {


    @Test
    void testLongest() {
        List<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("abcde");
        list.add("abcdef");
        list.add("abcdefg");
        list.add("abcdefgh");
        list.add("abcdefghi");
        list.add("abcdefghij");
        assertEquals("abcdefghij", Longest.longest(list));
    }
}