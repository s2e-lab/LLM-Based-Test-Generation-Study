// IsBoredTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link IsBored}.
 * It contains ten test cases for the {@link scenario1.IsBored#isBored()} method.
 */
class IsBoredTest {
		


    @Test
    void testIsBored() {
        assertEquals(0, IsBored.isBored(""));
        assertEquals(0, IsBored.isBored("I am not bored."));
        assertEquals(1, IsBored.isBored("I am bored."));
        assertEquals(1, IsBored.isBored("I am bored. I am not bored."));
        assertEquals(2, IsBored.isBored("I am bored. I am bored."));
        assertEquals(2, IsBored.isBored("I am bored. I am bored. I am not bored."));
        assertEquals(3, IsBored.isBored("I am bored. I am bored. I am bored."));
        assertEquals(3, IsBored.isBored("I am bored. I am bored. I am bored. I am not bored."));
        assertEquals(4, IsBored.isBored("I am bored. I am bored. I am bored. I am bored."));
        assertEquals(4, IsBored.isBored("I am bored. I am bored. I am bored. I am bored. I am not bored."));
    }
}

// IsBoredTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link IsBored}.
 * It contains ten test cases for the {@link scenario1.IsBored#isBored()} method.
 */
class IsBoredTest {

    @Test
    void testIsBored() {
        assertEquals(0, IsBored.isBored(""));
        assertEquals(0, IsBored.isBored("I am not bored."));
        assertEquals(1, IsBored.isBored("I am bored."));
        assertEquals(1, IsBored.isBored("I am bored. I am not bored."));
        assertEquals(2, IsBored.isBored("I am bored. I am bored."));
        assertEquals(2, IsBored.isBored("I am bored. I am bored. I am not bored."));
        assertEquals(3, IsBored.isBored("I am bored. I am bored. I am bored."));
        assertEquals(3, IsBored.isBored("I am bored. I am bored. I am bored. I am not bored."));
        assertEquals(4, IsBored.isBored("I am bored. I am bored. I am bored. I am bored."));
        assertEquals(4, IsBored.isBored("I am bored. I am bored. I am bored. I am bored. I am not bored."));
    }
}

// IsBoredTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link IsBored}.
 * It contains ten test cases for the {@link scenario1.IsBored#isBored()} method.
 */
class IsBoredTest {

    @Test
    void testIsBored() {
        assertEquals(0, IsBored.isBored(""));
        assertEquals(0, IsBored.isBored("I am not bored."));
        assertEquals(1, IsBored.isBored("I am bored."));
        assertEquals(1, IsBored.isBored("I am bored. I am not bored."));
        assertEquals(2, IsBored.isBored("I am bored. I am bored."));
        assertEquals(2, IsBored.isBored("I am bored. I am bored. I am not bored."));
        assertEquals(3, IsBored.isBored("I am bored. I am bored. I am bored."));
