// Element_4Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeType(int)} method.
*/
class Element_4Test {

	/**
	 * Test case for {@link Element#getAttributeType(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute type.
	 * </p>
	 */
	@Test
	void testGetAttributeType_1() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "CDATA", "");
		assertEquals("CDATA", element.getAttributeType(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeType(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute type.
	 * </p>
	 */
	@Test
	void testGetAttributeType_2() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "ID", "");
		assertEquals("ID", element.getAttributeType(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeType(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute type.
	 * </p>
	 */
	@Test
	void testGetAttributeType_3() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "IDREF", "");
		assertEquals("IDREF", element.getAttributeType(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeType(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute type.
	 * </p>
	 */
	@Test
	void testGetAttributeType_4() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "IDREFS", "");
		assertEquals("IDREFS", element.getAttributeType(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeType(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute type.
	 * </p>
	 */
	@Test
	void testGetAttributeType_5() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "NMTOKEN", "");
		assertEquals("NMTOKEN", element.getAttributeType(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeType(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute type.
	 * </p>
	 */
	@Test
	void testGetAttributeType_6() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "NMTOKENS", "");
		assertEquals("NMTOKENS", element.getAttributeType(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeType(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute type.
	 * </p>
	 */
	@Test
	void testGetAttributeType_7() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "ENTITY", "");
		assertEquals("ENTITY", element.getAttributeType(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeType(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute type.
	 * </p>
	 */
	@Test
	void testGetAttributeType_8() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "ENTITIES", "");
		assertEquals("ENTITIES", element.getAttributeType(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeType(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute type.
	 * </p>
	 */
	@Test
	void testGetAttributeType_9() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "NOTATION", "");
		assertEquals("NOTATION", element.getAttributeType(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeType(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute type.
	 * </p>
	 */
	@Test
	void testGetAttributeType_10() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "CDATA", "");
		assertEquals("CDATA", element.getAttributeType(0));
	}
}

// Element_5Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeValue(int)} method.
*/
class Element_5Test {
		
	/**
	 * Test case for {@link Element#getAttributeValue(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute value.
	 * </p>
	 */
	@Test
	void testGetAttributeValue_1() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "CDATA", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeValue(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute value.
	 * </p>
	 */
	@Test
	void testGetAttributeValue_2() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "ID", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeValue(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute value.
	 * </p>
	 */
	@Test
	void testGetAttributeValue_3() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "IDREF", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeValue(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute value.
	 * </p>
	 */
	@Test
	void testGetAttributeValue_4() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "IDREFS", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeValue(int)}.
	 * 
	 * <p>
	 * Test if the method returns the correct attribute value.
	 * </p>
	 */
	@Test
	void testGetAttributeValue_5() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "NMTOKEN", "value");
		assertEquals("value", element.getAttributeValue(0));
	}
	
	/**
	 * Test case for {@link Element#getAttributeValue(int)}.