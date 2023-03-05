// AbstractUniqueIDTest.java
package ch.bluepenguin.email.client;

import java.io.Serializable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AbstractUniqueID}.
* It contains ten unit test cases for the {@link AbstractUniqueID#hashCode()} method.
*/
class AbstractUniqueIDTest {

	/**
	 * Test case for {@link AbstractUniqueID#hashCode()} method.
	 * 
	 * <p>
	 * Test case for the hashCode method.
	 * </p>
	 */
	@Test
	public void testHashCode() {
		AbstractUniqueID abstractUniqueID = new AbstractUniqueID();
		abstractUniqueID.setId(new Integer(1));
		assertEquals(abstractUniqueID.hashCode(), 37);
	}
	
	/**
	 * Test case for {@link AbstractUniqueID#hashCode()} method.
	 * 
	 * <p>
	 * Test case for the hashCode method.
	 * </p>
	 */
	@Test
	public void testHashCode2() {
		AbstractUniqueID abstractUniqueID = new AbstractUniqueID();
		abstractUniqueID.setId(new Integer(2));
		assertEquals(abstractUniqueID.hashCode(), 74);
	}
	
	/**
	 * Test case for {@link AbstractUniqueID#hashCode()} method.
	 * 
	 * <p>
	 * Test case for the hashCode method.
	 * </p>
	 */
	@Test
	public void testHashCode3() {
		AbstractUniqueID abstractUniqueID = new AbstractUniqueID();
		abstractUniqueID.setId(new Integer(3));
		assertEquals(abstractUniqueID.hashCode(), 111);
	}
	
	/**
	 * Test case for {@link AbstractUniqueID#hashCode()} method.
	 * 
	 * <p>
	 * Test case for the hashCode method.
	 * </p>
	 */
	@Test
	public void testHashCode4() {
		AbstractUniqueID abstractUniqueID = new AbstractUniqueID();
		abstractUniqueID.setId(new Integer(4));
		assertEquals(abstractUniqueID.hashCode(), 148);
	}
	
	/**
	 * Test case for {@link AbstractUniqueID#hashCode()} method.
	 * 
	 * <p>
	 * Test case for the hashCode method.
	 * </p>
	 */
	@Test
	public void testHashCode5() {
		AbstractUniqueID abstractUniqueID = new AbstractUniqueID();
		abstractUniqueID.setId(new Integer(5));
		assertEquals(abstractUniqueID.hashCode(), 185);
	}
	
	/**
	 * Test case for {@link AbstractUniqueID#hashCode()} method.
	 * 
	 * <p>
	 * Test case for the hashCode method.
	 * </p>
	 */
	@Test
	public void testHashCode6() {
		AbstractUniqueID abstractUniqueID = new AbstractUniqueID();
		abstractUniqueID.setId(new Integer(6));
		assertEquals(abstractUniqueID.hashCode(), 222);
	}
	
	/**
	 * Test case for {@link AbstractUniqueID#hashCode()} method.
	 * 
	 * <p>
	 * Test case for the hashCode method.
	 * </p>
	 */
	@Test
	public void testHashCode7() {
		AbstractUniqueID abstractUniqueID = new AbstractUniqueID();
		abstractUniqueID.setId(new Integer(7));
		assertEquals(abstractUniqueID.hashCode(), 259);
	}
	
	/**
	 * Test case for {@link AbstractUniqueID#hashCode()} method.
	 * 
	 * <p>
	 * Test case for the hashCode method.
	 * </p>
	 */
	@Test
	public void testHashCode8() {
		AbstractUniqueID abstractUniqueID = new AbstractUniqueID();
		abstractUniqueID.setId(new Integer(8));
		assertEquals(abstractUniqueID.hashCode(), 296);
	}
	
	/**
	 * Test case for {@link AbstractUniqueID#hashCode()} method.
	 * 
	 * <p>
	 * Test case for the hashCode method.
	 * </p>
	 */
	@Test
	public void testHashCode9() {
		AbstractUniqueID abstractUniqueID = new AbstractUniqueID();
		abstractUniqueID.setId(new Integer(9));
		assertEquals(abstractUniqueID.hashCode(), 333);
	}
	
	/**
	 * Test case for {@link AbstractUniqueID#hashCode()} method.
	 * 
	 * <p>
	 * Test case for the hashCode method.
	 * </p>
	 */
	@Test
	public void testHashCode10() {
		AbstractUniqueID abstractUniqueID = new AbstractUniqueID();
		abstractUniqueID.setId(new Integer(10));
		assertEquals(abstractUniqueID.hashCode(), 370);
	}
}