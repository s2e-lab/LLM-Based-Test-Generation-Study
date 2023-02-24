// AnyIntTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link AnyInt}.
 * It contains ten test cases for the {@link scenario1.AnyInt#anyInt()} method.
 */
class AnyIntTest {
		


    @Test
    void testAnyInt() {
        assertTrue(AnyInt.anyInt(1, 2, 3));
        assertTrue(AnyInt.anyInt(1, 3, 2));
        assertTrue(AnyInt.anyInt(2, 1, 3));
        assertTrue(AnyInt.anyInt(2, 3, 1));
        assertTrue(AnyInt.anyInt(3, 1, 2));
        assertTrue(AnyInt.anyInt(3, 2, 1));
        assertFalse(AnyInt.anyInt(1, 2, 4));
        assertFalse(AnyInt.anyInt(1, 4, 2));
        assertFalse(AnyInt.anyInt(2, 1, 4));
        assertFalse(AnyInt.anyInt(2, 4, 1));
        assertFalse(AnyInt.anyInt(4, 1, 2));
        assertFalse(AnyInt.anyInt(4, 2, 1));
    }
}