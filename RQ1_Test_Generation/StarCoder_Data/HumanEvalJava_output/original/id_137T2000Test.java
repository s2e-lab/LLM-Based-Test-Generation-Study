// CompareOneTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the values are equal.
    */
    @Test
    void testCompareOneEqual() {
        assertEquals(null, CompareOne.compareOne(1, 1));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the values are not equal.
    */
    @Test
    void testCompareOneNotEqual() {
        assertEquals(2, CompareOne.compareOne(1, 2));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the values are not equal.
    */
    @Test
    void testCompareOneNotEqual2() {
        assertEquals(2.5, CompareOne.compareOne(1, 2.5));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the values are not equal.
    */
    @Test
    void testCompareOneNotEqual3() {
        assertEquals("2,3", CompareOne.compareOne(1, "2,3"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the values are not equal.
    */
    @Test
    void testCompareOneNotEqual4() {
        assertEquals("6", CompareOne.compareOne("5,1", "6"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the values are not equal.
    */
    @Test
    void testCompareOneNotEqual5() {
        assertEquals("2", CompareOne.compareOne("1", "2"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the values are not equal.
    */
    @Test
    void testCompareOneNotEqual6() {
        assertEquals(null, CompareOne.compareOne("1", 1));
    }
}
