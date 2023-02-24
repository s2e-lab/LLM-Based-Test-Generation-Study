// MakeAPileTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link MakeAPile}.
* It contains ten test cases for the {@link MakeAPile#makeAPile()} method.
*/
class MakeAPileTest {

    @Test
    void testMakeAPile() {
        assertEquals(Arrays.asList(1), MakeAPile.makeAPile(1));
        assertEquals(Arrays.asList(2, 1), MakeAPile.makeAPile(2));
        assertEquals(Arrays.asList(3, 1, 2), MakeAPile.makeAPile(3));
        assertEquals(Arrays.asList(4, 2, 1, 3), MakeAPile.makeAPile(4));
        assertEquals(Arrays.asList(5, 3, 1, 2, 4), MakeAPile.makeAPile(5));
        assertEquals(Arrays.asList(6, 4, 2, 1, 3, 5), MakeAPile.makeAPile(6));
        assertEquals(Arrays.asList(7, 5, 3, 1, 2, 4, 6), MakeAPile.makeAPile(7));
        assertEquals(Arrays.asList(8, 6, 4, 2, 1, 3, 5, 7), MakeAPile.makeAPile(8));
        assertEquals(Arrays.asList(9, 7, 5, 3, 1, 2, 4, 6, 8), MakeAPile.makeAPile(9));
        assertEquals(Arrays.asList(10, 8, 6, 4, 2, 1, 3, 5, 7, 9), MakeAPile.makeAPile(10));
    }
}