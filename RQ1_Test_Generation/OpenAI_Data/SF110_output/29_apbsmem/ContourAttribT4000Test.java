// ContourAttribTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourAttrib}.
* It contains ten unit test cases for the {@link ContourAttrib#clone()} method.
*/
class ContourAttribTest {

	/**
	* Test method for {@link ContourAttrib#clone()}.
	*/
	@Test
	void testClone() {
		ContourAttrib attrib = new ContourAttrib(1.0);
		ContourAttrib clone = (ContourAttrib) attrib.clone();
		assertEquals(attrib.getLevel(), clone.getLevel());
	}
	
}