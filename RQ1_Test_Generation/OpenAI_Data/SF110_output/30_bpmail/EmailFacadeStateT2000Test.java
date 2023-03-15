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
	 * Tested Case:
	 * <ul>
	 * <li>The state is empty</li>
	 * </ul>
	 * Expected Result:
	 * <ul>
	 * <li>The method returns true</li>
	 * </ul>
	 */
	@Test
	public void testIsDirty_EmptyState() {
		EmailFacadeState state = new EmailFacadeState();
		assertTrue(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Tested Case:
	 * <ul>
	 * <li>The state is not empty</li>
	 * <li>The state contains the id</li>
	 * <li>The state is dirty</li>
	 * </ul>
	 * Expected Result:
	 * <ul>
	 * <li>The method returns true</li>
	 * </ul>
	 */
	@Test
	public void testIsDirty_DirtyState() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		assertTrue(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Tested Case:
	 * <ul>
	 * <li>The state is not empty</li>
	 * <li>The state contains the id</li>
	 * <li>The state is clean</li>
	 * </ul>
	 * Expected Result:
	 * <ul>
	 * <li>The method returns false</li>
	 * </ul>
	 */
	@Test
	public void testIsDirty_CleanState() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		assertFalse(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Tested Case:
	 * <ul>
	 * <li>The state is not empty</li>
	 * <li>The state does not contain the id</li>
	 * </ul>
	 * Expected Result:
	 * <ul>
	 * <li>The method returns true</li>
	 * </ul>
	 */
	@Test
	public void testIsDirty_StateDoesNotContainId() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		assertTrue(state.isDirty(new Integer(2)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Tested Case:
	 * <ul>
	 * <li>The state is not empty</li>
	 * <li>The state contains the id</li>
	 * <li>The state is dirty</li>
	 * </ul>
	 * Expected Result:
	 * <ul>
	 * <li>The method returns true</li>
	 * </ul>
	 */
	@Test
	public void testIsDirty_StateContainsId() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		assertFalse(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Tested Case:
	 * <ul>
	 * <li>The state is not empty</li>
	 * <li>The state contains the id</li>
	 * <li>The state is dirty</li>
	 * </ul>
	 * Expected Result:
	 * <ul>
	 * <li>The method returns true</li>
	 * </ul>
	 */
	@Test
	public void testIsDirty_StateContainsIdAndIsDirty() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		assertTrue(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Tested Case:
	 * <ul>
	 * <li>The state is not empty</li>
	 * <li>The state contains the id</li>
	 * <li>The state is dirty</li>
	 * </ul>
	 * Expected Result:
	 * <ul>
	 * <li>The method returns true</li>
	 * </ul>
	 */
	@Test
	public void testIsDirty_StateContainsIdAndIsClean() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		assertFalse(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Tested Case:
	 * <ul>
	 * <li>The state is not empty</li>
	 * <li>The state contains the id</li>
	 * <li>The state is dirty</li>
	 * </ul>
	 * Expected Result:
	 * <ul>
	 * <li>The method returns true</li>
	 * </ul>
	 */
	@Test
	public void testIsDirty_StateContainsIdAndIsDirtyAndIsClean() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), true);
		state.setState(new Integer(1), false);
		assertFalse(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Tested Case:
	 * <ul>
	 * <li>The state is not empty</li>
	 * <li>The state contains the id</li>
	 * <li>The state is dirty</li>
	 * </ul>
	 * Expected Result:
	 * <ul>
	 * <li>The method returns true</li>
	 * </ul>
	 */
	@Test
	public void testIsDirty_StateContainsIdAndIsCleanAndIsDirty() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		state.setState(new Integer(1), true);
		assertTrue(state.isDirty(new Integer(1)));
	}

	/**
	 * Test case for {@link EmailFacadeState#isDirty(Integer)}
	 * <p>
	 * Tested Case:
	 * <ul>
	 * <li>The state is not empty</li>
	 * <li>The state contains the id</li>
	 * <li>The state is dirty</li>
	 * </ul>
	 * Expected Result:
	 * <ul>
	 * <li>The method returns true</li>
	 * </ul>
	 */
	@Test
	public void testIsDirty_StateContainsIdAndIsCleanAndIsClean() {
		EmailFacadeState state = new EmailFacadeState();
		state.setState(new Integer(1), false);
		state.setState(new Integer(1), false);
		assertFalse(state.isDirty(new Integer(1)));
	}
}