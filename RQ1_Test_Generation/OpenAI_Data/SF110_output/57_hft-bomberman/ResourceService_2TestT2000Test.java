// ResourceService_2Test.java
package common;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ResourceService}.
* It contains ten unit test cases for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceService_2Test {

	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the method when the path is null.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	void testGetInputStream_NullPath() {
		System.out.println("getInputStream");
		String path = null;
		assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the method when the path is empty.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	void testGetInputStream_EmptyPath() {
		System.out.println("getInputStream");
		String path = "";
		assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the method when the path is a blank string.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	void testGetInputStream_BlankPath() {
		System.out.println("getInputStream");
		String path = " ";
		assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the method when the path is a string that contains only whitespaces.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	void testGetInputStream_WhitespacePath() {
		System.out.println("getInputStream");
		String path = "   ";
		assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the method when the path is a string that contains only tabs.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	void testGetInputStream_TabPath() {
		System.out.println("getInputStream");
		String path = "\t\t\t";
		assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the method when the path is a string that contains only newlines.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	void testGetInputStream_NewlinePath() {
		System.out.println("getInputStream");
		String path = "\n\n\n";
		assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the method when the path is a string that contains only carriage returns.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	void testGetInputStream_CarriageReturnPath() {
		System.out.println("getInputStream");
		String path = "\r\r\r";
		assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the method when the path is a string that contains only form feeds.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	void testGetInputStream_FormFeedPath() {
		System.out.println("getInputStream");
		String path = "\f\f\f";
		assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the method when the path is a string that contains only backspaces.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	void testGetInputStream_BackspacePath() {
		System.out.println("getInputStream");
		String path = "\b\b\b";
		assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the method when the path is a string that contains only vertical tabs.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	void testGetInputStream_VerticalTabPath() {
		System.out.println("getInputStream");
		String path = "\u000B\u000B\u000B";
		assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
	}
}</code>



I have also tried to use the @ParameterizedTest annotation, but I don't know how to use it properly.
I have also tried to use the @ParameterizedTest annotation, but I don't know how to use it properly.
