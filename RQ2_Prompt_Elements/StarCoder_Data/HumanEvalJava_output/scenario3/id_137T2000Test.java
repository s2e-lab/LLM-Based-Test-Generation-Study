// CompareOneTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)}.
    *
    * <p>The first argument is an integer, the second argument is a float.
    * The expected result is a float.
    */
    @Test
    void testCompareOne_int_float() {
        assertEquals(2.5, CompareOne.compareOne(1, 2.5));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)}.
    *
    * <p>The first argument is an integer, the second argument is a string.
    * The expected result is a string.
    */
    @Test
    void testCompareOne_int_string() {
        assertEquals("2,3", CompareOne.compareOne(1, "2,3"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)}.
    *
    * <p>The first argument is a float, the second argument is an integer.
    * The expected result is a float.
    */
    @Test
    void testCompareOne_float_int() {
        assertEquals(2.5, CompareOne.compareOne(2.5, 1));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)}.
    *
    * <p>The first argument is a float, the second argument is a float.
    * The expected result is a float.
    */
    @Test
    void testCompareOne_float_float() {
        assertEquals(6, CompareOne.compareOne(5, 6));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)}.
    *
    * <p>The first argument is a float, the second argument is a string.
    * The expected result is a string.
    */
    @Test
    void testCompareOne_float_string() {
        assertEquals("6", CompareOne.compareOne(5, "6"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)}.
    *
    * <p>The first argument is a string, the second argument is an integer.
    * The expected result is a string.
    */
    @Test
    void testCompareOne_string_int() {
        assertEquals("2", CompareOne.compareOne("1", 2));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)}.
    *
    * <p>The first argument is a string, the second argument is a float.
    * The expected result is a string.
    */
    @Test
    void testCompareOne_string_float() {
        assertEquals("6", CompareOne.compareOne("5,1", 6));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)}.
    *
    * <p>The first argument is a string, the second argument is a string.
    * The expected result is a string.
    */
    @Test
    void testCompareOne_string_string() {
        assertEquals("6", CompareOne.compareOne("5,1", "6"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)}.
    *
    * <p>The first argument is an integer, the second argument is an integer.
    * The expected result is null.
    */
    @Test
    void testCompareOne_int_int() {
        assertNull(CompareOne.compareOne(1, 1));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)}.
    *
    * <p>The first argument is a float, the second argument is a float.
    * The expected result is null.
    */
    @Test
    void testCompareOne_float_float_2() {
        assertNull(CompareOne.compareOne(2.5, 2.5));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)}.
    *
    * <p>The first argument is a string, the second argument is a string.
    * The expected result is null.
    */
    @Test
    void testCompareOne_string_string_2() {
        assertNull(CompareOne.compareOne("1", "1"));
    }
}
