// StringXorTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link StringXor}.
 * It contains ten test cases for the {@link scenario1.StringXor#stringXor()} method.
 */
class StringXorTest {
		


    @Test
    void testStringXor() {
        assertEquals("10011", StringXor.stringXor("10101", "00110"));
        assertEquals("11001", StringXor.stringXor("11100", "00111"));
        assertEquals("11100", StringXor.stringXor("11100", "00000"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
    }
}

// StringXor.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class StringXor {

    public static String stringXor(String a, String b) {
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                result += "0";
            } else {
                result += "1";
            }
        }
        return result;
    }
}

// StringXorTest.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link StringXor}.
 * It contains ten test cases for the {@link scenario2.StringXor#stringXor()} method.
 */
class StringXorTest {

    @Test
    void testStringXor() {
        assertEquals("10011", StringXor.stringXor("10101", "00110"));
        assertEquals("11001", StringXor.stringXor("11100", "00111"));
        assertEquals("11100", StringXor.stringXor("11100", "00000"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
        assertEquals("11100", StringXor.stringXor("11100", "11100"));
    }
}

// StringXor.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class StringXor {

    public static String stringXor(String a, String b) {
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                result += "0";
            } else {
                result += "1";
            }
        }
        return result;
    }
}

// StringXorTest.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*