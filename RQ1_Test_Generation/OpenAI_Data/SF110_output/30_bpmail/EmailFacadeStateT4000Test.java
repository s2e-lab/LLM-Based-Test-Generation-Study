// EmailFacadeStateTest.java
package ch.bluepenguin.email.client.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EmailFacadeState}.
* It contains ten unit test cases for the {@link EmailFacadeState#isDirty(Integer)} method.
*/
class EmailFacadeStateTest {

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Test case for an empty state.
	 * <p>
	 * Expected result: <code>true</code>
	 */
	@Test
	public void testIsDirtyEmpty() {
		EmailFacadeState state = new EmailFacadeState();
		assertTrue(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Test case for a state with one entry.
	 * <p>
	 * Expected result: <code>true</code>
	 */
	@Test
	public void testIsDirtyOneEntry() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		assertTrue(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Test case for a state with one entry.
	 * <p>
	 * Expected result: <code>false</code>
	 */
	@Test
	public void testIsDirtyOneEntryFalse() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		assertFalse(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Test case for a state with two entries.
	 * <p>
	 * Expected result: <code>true</code>
	 */
	@Test
	public void testIsDirtyTwoEntries() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		state.setState(new Integer(2), true);
		assertTrue(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Test case for a state with two entries.
	 * <p>
	 * Expected result: <code>false</code>
	 */
	@Test
	public void testIsDirtyTwoEntriesFalse() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		state.setState(new Integer(2), false);
		assertFalse(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Test case for a state with two entries.
	 * <p>
	 * Expected result: <code>true</code>
	 */
	@Test
	public void testIsDirtyTwoEntriesOneTrue() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		state.setState(new Integer(2), false);
		assertTrue(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Test case for a state with two entries.
	 * <p>
	 * Expected result: <code>true</code>
	 */
	@Test
	public void testIsDirtyTwoEntriesOneTrueFalse() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		state.setState(new Integer(2), false);
		assertFalse(state.isDirty(new Integer(2)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Test case for a state with two entries.
	 * <p>
	 * Expected result: <code>true</code>
	 */
	@Test
	public void testIsDirtyTwoEntriesOneFalse() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		state.setState(new Integer(2), true);
		assertTrue(state.isDirty(new Integer(2)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Test case for a state with two entries.
	 * <p>
	 * Expected result: <code>true</code>
	 */
	@Test
	public void testIsDirtyTwoEntriesOneFalseFalse() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		state.setState(new Integer(2), true);
		assertFalse(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Test case for a state with two entries.
	 * <p>
	 * Expected result: <code>true</code>
	 */
	@Test
	public void testIsDirtyTwoEntriesOneFalseTrue() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		state.setState(new Integer(2), true);
		assertTrue(state.isDirty(new Integer(2)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Test case for a state with two entries.
	 * <p>
	 * Expected result: <code>true</code>
	 */
	@Test
	public void testIsDirtyTwoEntriesOneTrueTrue() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		state.setState(new Integer(2), true);
		assertTrue(state.isDirty(new Integer(1)));
	}
}