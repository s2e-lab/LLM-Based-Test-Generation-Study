// IntegerGreaterThanGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntegerGreaterThanGuardCondition}.
* It contains ten unit test cases for the {@link IntegerGreaterThanGuardCondition#evaluate(Object)} method.
*/
class IntegerGreaterThanGuardConditionTest {

	/**
	* Test case for {@link IntegerGreaterThanGuardCondition#evaluate(Object)} method.
	* Test data: {@code null}.
	* Expected result: {@code false}.
	*/
	@Test
	void testEvaluate_Null() {
		IntegerGreaterThanGuardCondition integerGreaterThanGuardCondition = new IntegerGreaterThanGuardCondition(0);
		assertFalse(integerGreaterThanGuardCondition.evaluate(null));
	}
	
	/**
	* Test case for {@link IntegerGreaterThanGuardCondition#evaluate(Object)} method.
	* Test data: {@code new Event(new Vector())}.
	* Expected result: {@code false}.
	*/
	@Test
	void testEvaluate_EmptyEvent() {
		IntegerGreaterThanGuardCondition integerGreaterThanGuardCondition = new IntegerGreaterThanGuardCondition(0);
		assertFalse(integerGreaterThanGuardCondition.evaluate(new Event(new Vector())));
	}
	
	/**
	* Test case for {@link IntegerGreaterThanGuardCondition#evaluate(Object)} method.
	* Test data: {@code new Event(new Vector(new Integer(0)))}.
	* Expected result: {@code false}.
	*/
	@Test
	void testEvaluate_Zero() {
		IntegerGreaterThanGuardCondition integerGreaterThanGuardCondition = new IntegerGreaterThanGuardCondition(0);
		assertFalse(integerGreaterThanGuardCondition.evaluate(new Event(new Vector(new Integer(0)))));
	}
	
	/**
	* Test case for {@link IntegerGreaterThanGuardCondition#evaluate(Object)} method.
	* Test data: {@code new Event(new Vector(new Integer(1)))}.
	* Expected result: {@code true}.
	*/
	@Test
	void testEvaluate_One() {
		IntegerGreaterThanGuardCondition integerGreaterThanGuardCondition = new IntegerGreaterThanGuardCondition(0);
		assertTrue(integerGreaterThanGuardCondition.evaluate(new Event(new Vector(new Integer(1)))));
	}
	
	/**
	* Test case for {@link IntegerGreaterThanGuardCondition#evaluate(Object)} method.
	* Test data: {@code new Event(new Vector(new Integer(-1)))}.
	* Expected result: {@code false}.
	*/
	@Test
	void testEvaluate_MinusOne() {
		IntegerGreaterThanGuardCondition integerGreaterThanGuardCondition = new IntegerGreaterThanGuardCondition(0);
		assertFalse(integerGreaterThanGuardCondition.evaluate(new Event(new Vector(new Integer(-1)))));
	}
	
	/**
	* Test case for {@link IntegerGreaterThanGuardCondition#evaluate(Object)} method.
	* Test data: {@code new Event(new Vector(new Integer(Integer.MAX_VALUE)))}.
	* Expected result: {@code true}.
	*/
	@Test
	void testEvaluate_MaxValue() {
		IntegerGreaterThanGuardCondition integerGreaterThanGuardCondition = new IntegerGreaterThanGuardCondition(0);
		assertTrue(integerGreaterThanGuardCondition.evaluate(new Event(new Vector(new Integer(Integer.MAX_VALUE)))));
	}
	
	/**
	* Test case for {@link IntegerGreaterThanGuardCondition#evaluate(Object)} method.
	* Test data: {@code new Event(new Vector(new Integer(Integer.MIN_VALUE)))}.
	* Expected result: {@code false}.
	*/
	@Test
	void testEvaluate_MinValue() {
		IntegerGreaterThanGuardCondition integerGreaterThanGuardCondition = new IntegerGreaterThanGuardCondition(0);
		assertFalse(integerGreaterThanGuardCondition.evaluate(new Event(new Vector(new Integer(Integer.MIN_VALUE)))));
	}
	
	/**
	* Test case for {@link IntegerGreaterThanGuardCondition#evaluate(Object)} method.
	* Test data: {@code new Event(new Vector(new Integer(Integer.MAX_VALUE - 1)))}.
	* Expected result: {@code true}.
	*/
	@Test
	void testEvaluate_MaxValueMinusOne() {
		IntegerGreaterThanGuardCondition integerGreaterThanGuardCondition = new IntegerGreaterThanGuardCondition(0);
		assertTrue(integerGreaterThanGuardCondition.evaluate(new Event(new Vector(new Integer(Integer.MAX_VALUE - 1)))));
	}
	
	/**
	* Test case for {@link IntegerGreaterThanGuardCondition#evaluate(Object)} method.
	* Test data: {@code new Event(new Vector(new Integer(Integer.MIN_VALUE + 1)))}.
	* Expected result: {@code false}.
	*/
	@Test
	void testEvaluate_MinValuePlusOne() {
		IntegerGreaterThanGuardCondition integerGreaterThanGuardCondition = new IntegerGreaterThanGuardCondition(0);
		assertFalse(integerGreaterThanGuardCondition.evaluate(new Event(new Vector(new Integer(Integer.MIN_VALUE + 1)))));
	}
	
	/**
	* Test case for {@link IntegerGreaterThanGuardCondition#evaluate(Object)} method.
	* Test data: {@code new Event(new Vector(new Integer(Integer.MAX_VALUE / 2)))}.
	* Expected result: {@code true}.
	*/
	@Test
	void testEvaluate_MaxValueDividedByTwo() {
		IntegerGreaterThanGuardCondition integerGreaterThanGuardCondition = new IntegerGreaterThanGuardCondition(0);
		assertTrue(integerGreaterThanGuardCondition.evaluate(new Event(new Vector(new Integer(Integer.MAX_VALUE / 2)))));
	}
	
}