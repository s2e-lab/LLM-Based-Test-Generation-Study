// GetMaxTriplesTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link GetMaxTriples}.
 * It contains ten test cases for the {@link scenario1.GetMaxTriples#getMaxTriples()} method.
 */
class GetMaxTriplesTest {
		


    @Test
    void testGetMaxTriples() {
        assertEquals(0, GetMaxTriples.getMaxTriples(0));
        assertEquals(0, GetMaxTriples.getMaxTriples(1));
        assertEquals(0, GetMaxTriples.getMaxTriples(2));
        assertEquals(1, GetMaxTriples.getMaxTriples(3));
        assertEquals(1, GetMaxTriples.getMaxTriples(4));
        assertEquals(2, GetMaxTriples.getMaxTriples(5));
        assertEquals(2, GetMaxTriples.getMaxTriples(6));
        assertEquals(3, GetMaxTriples.getMaxTriples(7));
        assertEquals(3, GetMaxTriples.getMaxTriples(8));
        assertEquals(4, GetMaxTriples.getMaxTriples(9));
    }
}

// GetMaxTriples.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class GetMaxTriples {

    public static int getMaxTriples(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if ((i * i - i + 1 + j * j - j + 1 + k * k - k + 1) % 3 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

// GetMaxTriplesTest.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link GetMaxTriples}.
 * It contains ten test cases for the {@link scenario2.GetMaxTriples#getMaxTriples()} method.
 */
class GetMaxTriplesTest {

    @Test
    void testGetMaxTriples() {
        assertEquals(0, GetMaxTriples.getMaxTriples(0));
        assertEquals(0, GetMaxTriples.getMaxTriples(1));
        assertEquals(0, GetMaxTriples.getMaxTriples(2));
        assertEquals(1, GetMaxTriples.getMaxTriples(3));
        assertEquals(1, GetMaxTriples.getMaxTriples(4));
        assertEquals(2, GetMaxTriples.getMaxTriples(5));
        assertEquals(2, GetMaxTriples.getMaxTriples(6));
        assertEquals(3, GetMaxTriples.getMaxTriples(7));
        assertEquals(3, GetMaxTriples.getMaxTriples(8));
        assertEquals(4, GetMaxTriples.getMaxTriples(9));
    }
}

// GetMaxTriples.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class GetMaxTriples {

    public static int getMaxTriples(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if ((i * i - i + 1 + j * j - j + 1 + k * k - k + 1) % 3 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

// GetMaxTriplesTest.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link