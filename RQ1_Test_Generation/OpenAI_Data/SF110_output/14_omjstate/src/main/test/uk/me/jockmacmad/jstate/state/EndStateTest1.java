// EndStateTest1.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#equals(Object)} method.
*/
class EndStateTest1 {

	/**
	* Test case for {@link EndState#equals(Object)} method.
	* Test case for {@link EndState#hashCode()} method.
	* Test case for {@link EndState#getName()} method.
	* Test case for {@link EndState#toObject()} method.
	*/
	@Test
	void testEquals() {
		EndState endState = EndState.getSingleton();
		assertTrue(endState.equals(endState));
		assertTrue(endState.hashCode() == endState.hashCode());
		assertTrue(endState.getName().equals(endState.getName()));
		assertTrue(endState.toObject().equals(endState.toObject()));
	}
	
	/**
	* Test case for {@link EndState#equals(Object)} method.
	* Test case for {@link EndState#hashCode()} method.
	* Test case for {@link EndState#getName()} method.
	* Test case for {@link EndState#toObject()} method.
	*/
	@Test
	void testEquals1() {
		EndState endState = EndState.getSingleton();
		EndState endState1 = EndState.getSingleton();
		assertTrue(endState.equals(endState1));
		assertTrue(endState.hashCode() == endState1.hashCode());
		assertTrue(endState.getName().equals(endState1.getName()));
		assertTrue(endState.toObject().equals(endState1.toObject()));
	}
	
	/**
	* Test case for {@link EndState#equals(Object)} method.
	* Test case for {@link EndState#hashCode()} method.
	* Test case for {@link EndState#getName()} method.
	* Test case for {@link EndState#toObject()} method.
	*/
	@Test
	void testEquals2() {
		EndState endState = EndState.getSingleton();
		EndState endState1 = EndState.getSingleton();
		assertTrue(endState1.equals(endState));
		assertTrue(endState1.hashCode() == endState.hashCode());
		assertTrue(endState1.getName().equals(endState.getName()));
		assertTrue(endState1.toObject().equals(endState.toObject()));
	}
	
	/**
	* Test case for {@link EndState#equals(Object)} method.
	* Test case for {@link EndState#hashCode()} method.
	* Test case for {@link EndState#getName()} method.
	* Test case for {@link EndState#toObject()} method.
	*/
	@Test
	void testEquals3() {
		EndState endState = EndState.getSingleton();
		EndState endState1 = EndState.getSingleton();
		assertTrue(endState.equals(endState1));
		assertTrue(endState.hashCode() == endState1.hashCode());
		assertTrue(endState.getName().equals(endState1.getName()));
		assertTrue(endState.toObject().equals(endState1.toObject()));
	}
	
	/**
	* Test case for {@link EndState#equals(Object)} method.
	* Test case for {@link EndState#hashCode()} method.
	* Test case for {@link EndState#getName()} method.
	* Test case for {@link EndState#toObject()} method.
	*/
	@Test
	void testEquals4() {
		EndState endState = EndState.getSingleton();
		EndState endState1 = EndState.getSingleton();
		assertTrue(endState1.equals(endState));
		assertTrue(endState1.hashCode() == endState.hashCode());
		assertTrue(endState1.getName().equals(endState.getName()));
		assertTrue(endState1.toObject().equals(endState.toObject()));
	}
	
	/**
	* Test case for {@link EndState#equals(Object)} method.
	* Test case for {@link EndState#hashCode()} method.
	* Test case for {@link EndState#getName()} method.
	* Test case for {@link EndState#toObject()} method.
	*/
	@Test
	void testEquals5() {
		EndState endState = EndState.getSingleton();
		EndState endState1 = EndState.getSingleton();
		assertTrue(endState.equals(endState1));
		assertTrue(endState.hashCode() == endState1.hashCode());
		assertTrue(endState.getName().equals(endState1.getName()));
		assertTrue(endState.toObject().equals(endState1.toObject()));
	}
	
	/**
	* Test case for {@link EndState#equals(Object)} method.
	* Test case for {@link EndState#hashCode()} method.
	* Test case for {@link EndState#getName()} method.
	* Test case for {@link EndState#toObject()} method.
	*/
	@Test
	void testEquals6() {
		EndState endState = EndState.getSingleton();
		EndState endState1 = EndState.getSingleton();
		assertTrue(endState1.equals(endState));
		assertTrue(endState1.hashCode() == endState.hashCode());
		assertTrue(endState1.getName().equals(endState.getName()));
		assertTrue(endState1.toObject().equals(endState.toObject()));
	}
	
	/**
	* Test case for {@link EndState#equals(Object)} method.
	* Test case for {@link EndState#hashCode()} method.
	* Test case for {@link EndState#getName()} method.
	* Test case for {@link EndState#toObject()} method.
	*/
	@Test
	void testEquals7() {
		EndState endState = EndState.getSingleton();
		EndState endState1 = EndState.getSingleton();
		assertTrue(endState.equals(endState1));
		assertTrue(endState.hashCode() == endState1.hashCode());
		assertTrue(endState.getName().equals(endState1.getName()));
		assertTrue(endState.toObject().equals(endState1.toObject()));
	}
	
	/**
	* Test case for {@link EndState#equals(Object)} method.
	* Test case for {@link EndState#hashCode()} method.
	* Test case for {@link EndState#getName()} method.
	* Test case for {@link EndState#toObject()} method.
	*/
	@Test
	void testEquals8() {
		EndState endState = EndState.getSingleton();
		EndState endState1 = EndState.getSingleton();
		assertTrue(endState1.equals(endState));
		assertTrue(endState1.hashCode() == endState.hashCode());
		assertTrue(endState1.getName().equals(endState.getName()));
		assertTrue(endState1.toObject().equals(endState.toObject()));
	}
	
	/**
	* Test case for {@link EndState#equals(Object)} method.
	* Test case for {@link EndState#hashCode()} method.
	* Test case for {@link EndState#getName()} method.
	* Test case for {@link EndState#toObject()} method.
	*/
	@Test
	void testEquals9() {
		EndState endState = EndState.getSingleton();
		EndState endState1 = EndState.getSingleton();
		assertTrue(endState.equals(endState1));
		assertTrue(endState.hashCode() == endState1.hashCode());
		assertTrue(endState.getName().equals(endState1.get