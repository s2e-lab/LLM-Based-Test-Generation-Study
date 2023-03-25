// MainTest.java
package net.sf.jniinchi;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains one unit test case for the {@link Main#getTestMolecule()} method.
*/
class MainTest {

	/**
	 * Test case where {@link Main#getTestMolecule()} is called.
	*/
	@Test (expected=UnsupportedOperationException.class)
	public void testGetTestMolecule() {
		Main.getTestMolecule();
	}
}