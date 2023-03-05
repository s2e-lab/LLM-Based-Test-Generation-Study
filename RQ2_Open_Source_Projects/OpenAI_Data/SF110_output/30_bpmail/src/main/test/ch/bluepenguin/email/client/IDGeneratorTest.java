// IDGeneratorTest.java
package ch.bluepenguin.email.client;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IDGenerator}.
* It contains ten unit test cases for the {@link IDGenerator#next()} method.
*/
class IDGeneratorTest {

	@Test
	public void testNext() {
		Integer id1 = IDGenerator.next();
		Integer id2 = IDGenerator.next();
		assertTrue(id1.intValue() < id2.intValue());
	}
	
	@Test
	public void testNext2() {
		Integer id1 = IDGenerator.next();
		Integer id2 = IDGenerator.next();
		assertTrue(id1.intValue() < id2.intValue());
	}
	
	@Test
	public void testNext3() {
		Integer id1 = IDGenerator.next();
		Integer id2 = IDGenerator.next();
		assertTrue(id1.intValue() < id2.intValue());
	}
	
	@Test
	public void testNext4() {
		Integer id1 = IDGenerator.next();
		Integer id2 = IDGenerator.next();
		assertTrue(id1.intValue() < id2.intValue());
	}
	
	@Test
	public void testNext5() {
		Integer id1 = IDGenerator.next();
		Integer id2 = IDGenerator.next();
		assertTrue(id1.intValue() < id2.intValue());
	}
	
	@Test
	public void testNext6() {
		Integer id1 = IDGenerator.next();
		Integer id2 = IDGenerator.next();
		assertTrue(id1.intValue() < id2.intValue());
	}
	
	@Test
	public void testNext7() {
		Integer id1 = IDGenerator.next();
		Integer id2 = IDGenerator.next();
		assertTrue(id1.intValue() < id2.intValue());
	}
	
	@Test
	public void testNext8() {
		Integer id1 = IDGenerator.next();
		Integer id2 = IDGenerator.next();
		assertTrue(id1.intValue() < id2.intValue());
	}
	
	@Test
	public void testNext9() {
		Integer id1 = IDGenerator.next();
		Integer id2 = IDGenerator.next();
		assertTrue(id1.intValue() < id2.intValue());
	}
	
	@Test
	public void testNext10() {
		Integer id1 = IDGenerator.next();
		Integer id2 = IDGenerator.next();
		assertTrue(id1.intValue() < id2.intValue());
	}
}