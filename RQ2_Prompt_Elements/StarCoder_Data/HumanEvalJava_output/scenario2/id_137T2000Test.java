// CompareOneTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {

    /**
     * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is an integer and the second parameter is a float.
     */
    @Test
    void testCompareOne_int_float() {
        assertEquals(10, CompareOne.compareOne(10, 10.0f));
        assertEquals(10, CompareOne.compareOne(10, 10.0));
        assertEquals(10, CompareOne.compareOne(10, 10.0d));
        assertEquals(10, CompareOne.compareOne(10, 10.00));
        assertEquals(10, CompareOne.compareOne(10, 10.000));
        assertEquals(10, CompareOne.compareOne(10, 10.0000));
        assertEquals(10, CompareOne.compareOne(10, 10.00000));
        assertEquals(10, CompareOne.compareOne(10, 10.000000));
        assertEquals(10, CompareOne.compareOne(10, 10.0000000));
        assertEquals(10, CompareOne.compareOne(10, 10.00000000));
        assertEquals(10, CompareOne.compareOne(10, 10.000000000));
    }

    /**
     * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a float and the second parameter is an integer.
     */
    @Test
    void testCompareOne_float_int() {
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0d));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.00));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.00000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.000000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0000000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.00000000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.000000000));
    }

    /**
     * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a float and the second parameter is a float.
     */
    @Test
    void testCompareOne_float_float() {
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0f));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0d));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.00));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.00000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.000000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0000000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.00000000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.000000000));
    }

    /**
     * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a float and the second parameter is a double.
     */
    @Test
    void testCompareOne_float_double() {
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0d));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.00));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.00000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.000000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.0000000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.00000000));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, 10.000000000));
    }

    /**
     * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a float and the second parameter is a string.
     */
    @Test
    void testCompareOne_float_string() {
        assertEquals(10.0f, CompareOne.compareOne(10.0f, "10.0"));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, "10.00"));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, "10.000"));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, "10.0000"));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, "10.00000"));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, "10.000000"));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, "10.0000000"));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, "10.00000000"));
        assertEquals(10.0f, CompareOne.compareOne(10.0f, "10.000000000"));
    }

    /**
     * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a double and the second parameter is an integer.
     */
    @Test
    void testCompareOne_double_int() {
        assertEquals(10.0d, CompareOne.compareOne(10.0d, 10));
        assertEquals(10.0d, CompareOne.compareOne(10.0d, 10.0));
        assertEquals(10.0d, CompareOne.compareOne(10.0d, 10.0f));
        assertEquals(10.0d, CompareOne.compareOne(10.0d, 10.00));
        assertEquals(10.0d, CompareOne.compareOne(10.0d, 10.000));
        assertEquals(10.0d, CompareOne.compareOne(10.0d, 10.0000));
        assertEquals(10.0d, CompareOne.compareOne(10.0d, 10.000