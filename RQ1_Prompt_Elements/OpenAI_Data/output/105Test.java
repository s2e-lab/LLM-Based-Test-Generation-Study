// ByLengthTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link ByLength}.
* It contains ten test cases for the {@link ByLength#byLength()} method.
*/
class ByLengthTest {


    @Test
    void testByLength() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        List<Object> result = ByLength.byLength(arr);
        List<Object> expected = new ArrayList<Object>();
        expected.add("Nine");
        expected.add("Eight");
        expected.add("Seven");
        expected.add("Six");
        expected.add("Five");
        expected.add("Four");
        expected.add("Three");
        expected.add("Two");
        expected.add("One");
        assertEquals(expected, result);
    }
}