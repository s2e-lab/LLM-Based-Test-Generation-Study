// EmailFacadeStateTest1.java
package ch.bluepenguin.email.client.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EmailFacadeState}.
* It contains ten unit test cases for the {@link EmailFacadeState#isAllClean()} method.
*/
class EmailFacadeStateTest1 {

	/**
	* Test case for {@link EmailFacadeState#isAllClean()} method.
	* Tested with an empty state map.
	*/
	@Test
	void testIsAllClean1() {
		EmailFacadeState state = new EmailFacadeState();
		assertFalse(state.isAllClean());
	}
	
	/**
	* Test case for {@link EmailFacadeState#isAllClean()} method.
	* Tested with a state map containing one dirty entry.
	*/
	@Test
	void testIsAllClean2() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		assertFalse(state.isAllClean());
	}
	
	/**
	* Test case for {@link EmailFacadeState#isAllClean()} method.
	* Tested with a state map containing one clean entry.
	*/
	@Test
	void testIsAllClean3() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		assertTrue(state.isAllClean());
	}
	
	/**
	* Test case for {@link EmailFacadeState#isAllClean()} method.
	* Tested with a state map containing two dirty entries.
	*/
	@Test
	void testIsAllClean4() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		state.setState(new Integer(2), true);
		assertFalse(state.isAllClean());
	}
	
	/**
	* Test case for {@link EmailFacadeState#isAllClean()} method.
	* Tested with a state map containing two clean entries.
	*/
	@Test
	void testIsAllClean5() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		state.setState(new Integer(2), false);
		assertTrue(state.isAllClean());
	}
	
	/**
	* Test case for {@link EmailFacadeState#isAllClean()} method.
	* Tested with a state map containing one dirty and one clean entry.
	*/
	@Test
	void testIsAllClean6() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		state.setState(new Integer(2), false);
		assertFalse(state.isAllClean());
	}
	
	/**
	* Test case for {@link EmailFacadeState#isAllClean()} method.
	* Tested with a state map containing one clean and one dirty entry.
	*/
	@Test
	void testIsAllClean7() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		state.setState(new Integer(2), true);
		assertFalse(state.isAllClean());
	}
	
	/**
	* Test case for {@link EmailFacadeState#isAllClean()} method.
	* Tested with a state map containing one dirty and one unknown entry.
	*/
	@Test
	void testIsAllClean8() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		assertFalse(state.isAllClean());
	}
	
	/**
	* Test case for {@link EmailFacadeState#isAllClean()} method.
	* Tested with a state map containing one clean and one unknown entry.
	*/
	@Test
	void testIsAllClean9() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		assertFalse(state.isAllClean());
	}
	
	/**
	* Test case for {@link EmailFacadeState#isAllClean()} method.
	* Tested with a state map containing one unknown and one dirty entry.
	*/
	@Test
	void testIsAllClean10() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		assertFalse(state.isAllClean());
	}
}