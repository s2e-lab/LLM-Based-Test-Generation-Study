// UserEventTest.java
package dsachat.share;

import java.io.Serializable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UserEvent}.
* It contains ten unit test cases for the {@link UserEvent#isDisconnect()} method.
*/
class UserEventTest {

	/**
	 * Test of isDisconnect method, of class UserEvent.
	 */
	@Test
	public void testIsDisconnect() {
		System.out.println("isDisconnect");
		UserEvent instance = new UserEvent(true, "test");
		boolean expResult = true;
		boolean result = instance.isDisconnect();
		assertEquals(expResult, result);
	}

	/**
	 * Test of isDisconnect method, of class UserEvent.
	 */
	@Test
	public void testIsDisconnect2() {
		System.out.println("isDisconnect");
		UserEvent instance = new UserEvent(false, "test");
		boolean expResult = false;
		boolean result = instance.isDisconnect();
		assertEquals(expResult, result);
	}

	/**
	 * Test of isDisconnect method, of class UserEvent.
	 */
	@Test
	public void testIsDisconnect3() {
		System.out.println("isDisconnect");
		UserEvent instance = new UserEvent(true, "test");
		boolean expResult = false;
		boolean result = instance.isDisconnect();
		assertNotEquals(expResult, result);
	}

	/**
	 * Test of isDisconnect method, of class UserEvent.
	 */
	@Test
	public void testIsDisconnect4() {
		System.out.println("isDisconnect");
		UserEvent instance = new UserEvent(false, "test");
		boolean expResult = true;
		boolean result = instance.isDisconnect();
		assertNotEquals(expResult, result);
	}

	/**
	 * Test of isDisconnect method, of class UserEvent.
	 */
	@Test
	public void testIsDisconnect5() {
		System.out.println("isDisconnect");
		UserEvent instance = new UserEvent(true, "test");
		boolean expResult = false;
		boolean result = instance.isDisconnect();
		assertNotEquals(expResult, result);
	}

	/**
	 * Test of isDisconnect method, of class UserEvent.
	 */
	@Test
	public void testIsDisconnect6() {
		System.out.println("isDisconnect");
		UserEvent instance = new UserEvent(false, "test");
		boolean expResult = true;
		boolean result = instance.isDisconnect();
		assertNotEquals(expResult, result);
	}

	/**
	 * Test of isDisconnect method, of class UserEvent.
	 */
	@Test
	public void testIsDisconnect7() {
		System.out.println("isDisconnect");
		UserEvent instance = new UserEvent(true, "test");
		boolean expResult = true;
		boolean result = instance.isDisconnect();
		assertEquals(expResult, result);
	}

	/**
	 * Test of isDisconnect method, of class UserEvent.
	 */
	@Test
	public void testIsDisconnect8() {
		System.out.println("isDisconnect");
		UserEvent instance = new UserEvent(false, "test");
		boolean expResult = false;
		boolean result = instance.isDisconnect();
		assertEquals(expResult, result);
	}

	/**
	 * Test of isDisconnect method, of class UserEvent.
	 */
	@Test
	public void testIsDisconnect9() {
		System.out.println("isDisconnect");
		UserEvent instance = new UserEvent(true, "test");
		boolean expResult = false;
		boolean result = instance.isDisconnect();
		assertNotEquals(expResult, result);
	}

	/**
	 * Test of isDisconnect method, of class UserEvent.
	 */
	@Test
	public void testIsDisconnect10() {
		System.out.println("isDisconnect");
		UserEvent instance = new UserEvent(false, "test");
		boolean expResult = true;
		boolean result = instance.isDisconnect();
		assertNotEquals(expResult, result);
	}
}