// ContourPathTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPath}.
* It contains ten unit test cases for the {@link ContourPath#clone()} method.
*/
class ContourPathTest {

	/**
	* Test method for {@link ContourPath#clone()}.
	*/
	@Test
	void testClone() {
		ContourPath path = new ContourPath(new ContourAttrib(), 0, new double[] {1.0, 2.0, 3.0}, new double[] {4.0, 5.0, 6.0});
		ContourPath clone = (ContourPath) path.clone();
		assertNotSame(path, clone);
		assertArrayEquals(path.getAllX(), clone.getAllX());
		assertArrayEquals(path.getAllY(), clone.getAllY());
		assertEquals(path.getLevelIndex(), clone.getLevelIndex());
		assertEquals(path.isClosed(), clone.isClosed());
		assertEquals(path.getAttributes(), clone.getAttributes());
	}
	
}