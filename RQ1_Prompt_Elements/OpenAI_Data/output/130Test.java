// TriTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Tri}.
 * It contains ten test cases for the {@link scenario1.Tri#tri()} method.
 */
class TriTest {
		


    @Test
    void testTri() {
        assertEquals(Arrays.asList(1), Tri.tri(0));
        assertEquals(Arrays.asList(1, 3), Tri.tri(1));
        assertEquals(Arrays.asList(1, 3, 4), Tri.tri(2));
        assertEquals(Arrays.asList(1, 3, 4, 7), Tri.tri(3));
        assertEquals(Arrays.asList(1, 3, 4, 7, 9), Tri.tri(4));
        assertEquals(Arrays.asList(1, 3, 4, 7, 9, 12), Tri.tri(5));
        assertEquals(Arrays.asList(1, 3, 4, 7, 9, 12, 16), Tri.tri(6));
        assertEquals(Arrays.asList(1, 3, 4, 7, 9, 12, 16, 20), Tri.tri(7));
        assertEquals(Arrays.asList(1, 3, 4, 7, 9, 12, 16, 20, 25), Tri.tri(8));
        assertEquals(Arrays.asList(1, 3, 4, 7, 9, 12, 16, 20, 25, 31), Tri.tri(9));
    }
}