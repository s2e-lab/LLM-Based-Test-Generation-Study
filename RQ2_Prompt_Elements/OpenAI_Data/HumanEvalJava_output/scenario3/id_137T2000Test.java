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
	void testCompareOne() {
		assertEquals(2, CompareOne.compareOne(1, 2));
		assertEquals(2.5, CompareOne.compareOne(1, 2.5));
		assertEquals(3, CompareOne.compareOne(2, 3));
		assertEquals(6, CompareOne.compareOne(5, 6));
		assertEquals("2,3", CompareOne.compareOne(1, "2,3"));
		assertEquals("6", CompareOne.compareOne("5,1", "6"));
		assertEquals("2", CompareOne.compareOne("1", "2"));
		assertEquals(null, CompareOne.compareOne("1", 1));
	}
}

// CompareTwo.java
package scenario3;

class CompareTwo {

    /**
     * Create a function that takes integers, floats, or strings representing
     * real numbers, and returns the larger variable in its given variable type.
     * Return null if the values are equal.
     * Note: If a real number is represented as a string, the floating point might be . or ,
     *
     * compareTwo(1, 2.5) ➞ 2.5
     * compareTwo(1, "2,3") ➞ "2,3"
     * compareTwo("5,1", "6") ➞ "6"
     * compareTwo("1", 1) ➞ None
     *
     * > compareTwo(1, 2)
     * 2
     * > compareTwo(1, 2.5)
     * 2.5
     * > compareTwo(2, 3)
     * 3
     * > compareTwo(5, 6)
     * 6
     * > compareTwo(1, "2,3")
     * "2,3"
     * > compareTwo("5,1", "6")
     * "6"
     * > compareTwo("1", "2")
     * "2"
     * > compareTwo("1", 1)
     * null
     */
    public static Object compareTwo(Object a, Object b) {
    }
}

// CompareTwoTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareTwo}.
* It contains ten unit test cases for the {@link CompareTwo#compareTwo(Object, Object)} method.
*/
class CompareTwoTest {
		
	@Test
	void testCompareTwo() {
		assertEquals(2, CompareTwo.compareTwo(1, 2));
		assertEquals(2.5, CompareTwo.compareTwo(1, 2.5));
		assertEquals(3, CompareTwo.compareTwo(2, 3));
		assertEquals(6, CompareTwo.compareTwo(5, 6));
		assertEquals("2,3", CompareTwo.compareTwo(1, "2,3"));
		assertEquals("6", CompareTwo.compareTwo("5,1", "6"));
		assertEquals("2", CompareTwo.compareTwo("1", "2"));
		assertEquals(null, CompareTwo.compareTwo("1", 1));
	}
}

// CompareThree.java
package scenario3;

class CompareThree {

    /**
     * Create a function that takes integers, floats, or strings representing
     * real numbers, and returns the larger variable in its given variable type.
     * Return null if the values are equal.
     * Note: If a real number is represented as a string, the floating point might be . or ,
     *
     * compareThree(1, 2.5) ➞ 2.5
     * compareThree(1, "2,3") ➞ "2,3"
     * compareThree("5,1", "6") ➞ "6"
     * compareThree("1", 1) ➞ None
     *
     * > compareThree(1, 2)
     * 2
     * > compareThree(1, 2.5)
     * 2.5
     * > compareThree(2, 3)
     * 3
     * > compareThree(5, 6)
     * 6
     * > compareThree(1, "2,3")
     * "2,3"
     * > compareThree("5,1", "6")
     * "6"
     * > compareThree("1", "2")
     * "2"
     * > compareThree("1", 1)
     * null
     */
    public static Object compareThree(Object a, Object b) {
    }
}

// CompareThreeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareThree}.
* It contains ten unit test cases for the {@link CompareThree#compareThree(Object, Object)} method.
*/
class CompareThreeTest {
		
	@Test
	void testCompareThree() {
		assertEquals(2, CompareThree.compareThree(1, 2));
		assertEquals(2.5, CompareThree.compareThree(1, 2.5));
		assertEquals(3, CompareThree.compareThree(2, 3));
		assertEquals(6, CompareThree.compareThree(5, 6));
		assertEquals("2,3", CompareThree.compareThree(1, "2,3"));
		assertEquals("6", CompareThree.compareThree("5,1", "6"));
		assertEquals("2", CompareThree.compareThree("1", "2"));
		assertEquals(null, CompareThree.compareThree("1", 1));
	}
}

// CompareFour.java
package scenario3;

class CompareFour {

    /**
     * Create a function that takes integers, floats, or strings representing
     * real numbers, and returns the larger variable in its given variable type.
     * Return null if the values are equal.
     * Note: If a real number is represented as a string, the floating point might be . or ,
     *
     * compareFour(1, 2.5) ➞ 2.5
     * compareFour(1, "2,3") ➞ "2,3"
     * compareFour("5,1", "6") ➞ "6"
     * compareFour("1", 1) ➞ None
     *
     * > compareFour(1, 2)
     * 2
     * > compareFour(1, 2.5)
     * 2.5
     * > compareFour(2, 3)
     * 3
     * > compareFour(5, 6)
     * 6
     * > compareFour(1, "2,3")
     * "2,3"
     * > compareFour("5,1", "6")
     * "6"
     * > compareFour("1", "2")
     * "2"
     * > compareFour("1", 1)
     * null
     */
    public static Object compareFour(Object a, Object b) {
    }
}

// CompareFourTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareFour}.
* It contains ten unit test cases for the {@link CompareFour#compareFour(Object, Object)} method.
*/
class CompareFourTest {
		
	@Test
	void testCompareFour() {
		assertEquals(2, CompareFour.compareFour(1, 2));
		assertEquals(2.5, CompareFour.compareFour(1, 2.5));
		assertEquals(3, CompareFour.compareFour(2, 3));
		assertEquals(6, CompareFour.compareFour(5, 6));
		assertEquals("2,3", CompareFour.compareFour(1, "2,3"));
		assertEquals("6", CompareFour.compareFour("5,1", "6"));
		