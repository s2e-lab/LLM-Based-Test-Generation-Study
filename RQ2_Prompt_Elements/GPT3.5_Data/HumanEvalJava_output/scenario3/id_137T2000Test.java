// CompareOne.java
package scenario3;

class CompareOne {

    /**
     * Create a function that takes integers, floats, or strings representing
     * real numbers, and returns the larger variable in its given variable type.
     * Return null if the values are equal.
     * Note: If a real number is represented as a string, the floating point might be . or ,
     *
     * compareOne(1, 2.5) ➞ 2.5
     * compareOne(1, "2,3") ➞ "2,3"
     * compareOne("5,1", "6") ➞ "6"
     * compareOne("1", 1) ➞ None
     *
     * > compareOne(1, 2)
     * 2
     * > compareOne(1, 2.5)
     * 2.5
     * > compareOne(2, 3)
     * 3
     * > compareOne(5, 6)
     * 6
     * > compareOne(1, "2,3")
     * "2,3"
     * > compareOne("5,1", "6")
     * "6"
     * > compareOne("1", "2")
     * "2"
     * > compareOne("1", 1)
     * null
     */
    public static Object compareOne(Object a, Object b) {
        if (a instanceof String && b instanceof String) {
            String aStr = (String) a;
            String bStr = (String) b;
            double aDouble = Double.parseDouble(aStr.replace(",", "."));
            double bDouble = Double.parseDouble(bStr.replace(",", "."));
            if (aDouble > bDouble) {
                return a;
            } else if (bDouble > aDouble) {
                return b;
            } else {
                return null;
            }
        } else if (a instanceof String) {
            String aStr = (String) a;
            double aDouble = Double.parseDouble(aStr.replace(",", "."));
            if (aDouble > (double) b) {
                return a;
            } else if ((double) b > aDouble) {
                return b;
            } else {
                return null;
            }
        } else if (b instanceof String) {
            String bStr = (String) b;
            double bDouble = Double.parseDouble(bStr.replace(",", "."));
            if ((double) a > bDouble) {
                return a;
            } else if (bDouble > (double) a) {
                return b;
            } else {
                return null;
            }
        } else {
            if ((double) a > (double) b) {
                return a;
            } else if ((double) b > (double) a) {
                return b;
            } else {
                return null;
            }
        }
    }
}

// CompareOneTest.java
package scenario3;


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
        assertEquals(2.5, CompareOne.compareOne(1.5, 2.5));
        assertEquals(2.5, CompareOne.compareOne(2.5, 1.5));
        assertEquals(3.5, CompareOne.compareOne(2.5, 3.5));
        assertEquals(3.5, CompareOne.compareOne(3.5, 2.5));
        assertNull(CompareOne.compareOne(1.5, 1.5));
    }

    @Test
    void testCompareOneStrings() {
        assertEquals("2,3", CompareOne.compareOne("1,5", "2,3"));
        assertEquals("2,3", CompareOne.compareOne("2,3", "1,5"));
        assertEquals("3,5", CompareOne.compareOne("2,5", "3,5"));
        assertEquals("3,5", CompareOne.compareOne("3,5", "2,5"));
        assertNull(CompareOne.compareOne("1,5", "1,5"));
    }

    @Test
    void testCompareOneMixed() {
        assertEquals("2,3", CompareOne.compareOne("1,5", 2.3));
        assertEquals("2,3", CompareOne.compareOne(2.3, "1,5"));
        assertEquals("3,5", CompareOne.compareOne("2,5", 3.5));
        assertEquals("3,5", CompareOne.compareOne(3.5, "2,5"));
        assertNull(CompareOne.compareOne("1,5", 1.5));
        assertNull(CompareOne.compareOne(1.5, "1,5"));
        assertNull(CompareOne.compareOne(1, "1"));
        assertNull(CompareOne.compareOne("1", 1));
    }
}