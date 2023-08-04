// CompareOneTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a float and the second parameter is a float.
    */
    @Test
    void testCompareOneFloatFloat() {
        assertEquals(null, CompareOne.compareOne(1.0f, 1.0f));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a float and the second parameter is a string.
    */
    @Test
    void testCompareOneFloatString() {
        assertEquals(1.0f, CompareOne.compareOne(1.0f, "1,0"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a string and the second parameter is a float.
    */
    @Test
    void testCompareOneStringFloat() {
        assertEquals("1,0", CompareOne.compareOne("1,0", 1.0f));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a string and the second parameter is a string.
    */
    @Test
    void testCompareOneStringString() {
        assertEquals("1,0", CompareOne.compareOne("1,0", "1,0"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a string and the second parameter is a string.
    */
    @Test
    void testCompareOneStringString2() {
        assertEquals("1,0", CompareOne.compareOne("1,0", "1,0"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a string and the second parameter is a string.
    */
    @Test
    void testCompareOneStringString3() {
        assertEquals("1,0", CompareOne.compareOne("1,0", "1,0"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a string and the second parameter is a string.
    */
    @Test
    void testCompareOneStringString4() {
        assertEquals("1,0", CompareOne.compareOne("1,0", "1,0"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a string and the second parameter is a string.
    */
    @Test
    void testCompareOneStringString5() {
        assertEquals("1,0", CompareOne.compareOne("1,0", "1,0"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a string and the second parameter is a string.
    */
    @Test
    void testCompareOneStringString6() {
        assertEquals("1,0", CompareOne.compareOne("1,0", "1,0"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a string and the second parameter is a string.
    */
    @Test
    void testCompareOneStringString7() {
        assertEquals("1,0", CompareOne.compareOne("1,0", "1,0"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a string and the second parameter is a string.
    */
    @Test
    void testCompareOneStringString8() {
        assertEquals("1,0", CompareOne.compareOne("1,0", "1,0"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a string and the second parameter is a string.
    */
    @Test
    void testCompareOneStringString9() {
        assertEquals("1,0", CompareOne.compareOne("1,0", "1,0"));
    }

    /**
    * Test case for {@link CompareOne#compareOne(Object, Object)} where the first parameter is a string and the second parameter is a string.
    */
    @Test
    void testCompareOneStringString10() {
        assertEquals("1,0", CompareOne.compareOne("1,0", "1,0"));
    }
}
