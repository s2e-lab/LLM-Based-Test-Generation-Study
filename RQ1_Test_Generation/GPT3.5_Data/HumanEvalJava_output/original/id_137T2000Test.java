// CompareOneTest.java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link CompareOne}.
 * It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
 */
class CompareOneTest {

    @Test
    void testCompareOneIntegers() {
        assertEquals(2, CompareOne.compareOne(1, 2));
        assertEquals(2, CompareOne.compareOne(2, 1));
        assertEquals(3, CompareOne.compareOne(2, 3));
        assertEquals(3, CompareOne.compareOne(3, 2));
        assertNull(CompareOne.compareOne(1, 1));
    }

    @Test
    void testCompareOneFloats() {
        assertEquals(2.5f, CompareOne.compareOne(1.5f, 2.5f));
        assertEquals(2.5f, CompareOne.compareOne(2.5f, 1.5f));
        assertEquals(3.5f, CompareOne.compareOne(2.5f, 3.5f));
        assertEquals(3.5f, CompareOne.compareOne(3.5f, 2.5f));
        assertNull(CompareOne.compareOne(1.5f, 1.5f));
    }

    @Test
    void testCompareOneStrings() {
        assertEquals("2.3", CompareOne.compareOne("1.2", "2.3"));
        assertEquals("2.3", CompareOne.compareOne("2.3", "1.2"));
        assertEquals("3.4", CompareOne.compareOne("2.3", "3.4"));
        assertEquals("3.4", CompareOne.compareOne("3.4", "2.3"));
        assertNull(CompareOne.compareOne("1.2", "1.2"));
    }

    @Test
    void testCompareOneMixed() {
        assertEquals("2.3", CompareOne.compareOne("1.2", "2,3"));
        assertEquals("2.3", CompareOne.compareOne("2,3", "1.2"));
        assertEquals("6", CompareOne.compareOne("5,1", "6"));
        assertEquals("6", CompareOne.compareOne("6", "5,1"));
        assertNull(CompareOne.compareOne("1", "1"));
        assertNull(CompareOne.compareOne("1", 1));
    }
}