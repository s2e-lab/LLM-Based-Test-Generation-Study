// CompareOneTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link CompareOne}.
* It contains ten test cases for the {@link CompareOne#compareOne()} method.
*/
class CompareOneTest {

    @Test
    void testCompareOne() {
        assertEquals(null, CompareOne.compareOne(1, 1));
        assertEquals(null, CompareOne.compareOne(1.0, 1.0));
        assertEquals(null, CompareOne.compareOne(1.0, 1));
        assertEquals(null, CompareOne.compareOne(1, 1.0));
        assertEquals(null, CompareOne.compareOne("1", "1"));
        assertEquals(null, CompareOne.compareOne("1.0", "1.0"));
        assertEquals(null, CompareOne.compareOne("1.0", "1"));
        assertEquals(null, CompareOne.compareOne("1", "1.0"));
        assertEquals(null, CompareOne.compareOne("1,0", "1.0"));
        assertEquals(null, CompareOne.compareOne("1.0", "1,0"));
    }
}

// CompareTwo.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class CompareTwo {

    public static Object compareTwo(Object a, Object b) {
        Object temp_a = a;
        Object temp_b = b;
        if (temp_a instanceof String) {
            temp_a = ((String) temp_a).replace(',', '.');
        }
        if (temp_b instanceof String) {
            temp_b = ((String) temp_b).replace(',', '.');
        }
        if (Float.parseFloat(temp_a.toString()) == Float.parseFloat(temp_b.toString())) {
            return null;
        }
        return Float.parseFloat(temp_a.toString()) > Float.parseFloat(temp_b.toString()) ? a : b;
    }
}

// CompareTwoTest.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link CompareTwo}.
* It contains ten test cases for the {@link CompareTwo#compareTwo()} method.
*/
class CompareTwoTest {
    @Test
    void testCompareTwo() {
        assertEquals(null, CompareTwo.compareTwo(1, 1));
        assertEquals(null, CompareTwo.compareTwo(1.0, 1.0));
        assertEquals(null, CompareTwo.compareTwo(1.0, 1));
        assertEquals(null, CompareTwo.compareTwo(1, 1.0));
        assertEquals(null, CompareTwo.compareTwo("1", "1"));
        assertEquals(null, CompareTwo.compareTwo("1.0", "1.0"));
        assertEquals(null, CompareTwo.compareTwo("1.0", "1"));
        assertEquals(null, CompareTwo.compareTwo("1", "1.0"));
        assertEquals(null, CompareTwo.compareTwo("1,0", "1.0"));
        assertEquals(null, CompareTwo.compareTwo("1.0", "1,0"));
    }
}

// CompareThree.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class CompareThree {

    public static Object compareThree(Object a, Object b) {
        Object temp_a = a;
        Object temp_b = b;
        if (temp_a instanceof String) {
            temp_a = ((String) temp_a).replace(',', '.');
        }
        if (temp_b instanceof String) {
            temp_b = ((String) temp_b).replace(',', '.');
        }
        if (Float.parseFloat(temp_a.toString()) == Float.parseFloat(temp_b.toString())) {
            return null;
        }
        return