// Element_12Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttrValue(String)} method.
*/
class Element_12Test {

	@Test
	void testGetAttrValue() throws Exception {
		Element e = new Element("", "test");
		e.addAttribute("", "attr1", "CDATA", "value1");
		e.addAttribute("", "attr2", "CDATA", "value2");
		e.addAttribute("", "attr3", "CDATA", "value3");
		e.addAttribute("", "attr4", "CDATA", "value4");
		e.addAttribute("", "attr5", "CDATA", "value5");
		e.addAttribute("", "attr6", "CDATA", "value6");
		e.addAttribute("", "attr7", "CDATA", "value7");
		e.addAttribute("", "attr8", "CDATA", "value8");
		e.addAttribute("", "attr9", "CDATA", "value9");
		e.addAttribute("", "attr10", "CDATA", "value10");
		e.addAttribute("", "attr11", "CDATA", "value11");
		e.addAttribute("", "attr12", "CDATA", "value12");
		assertEquals("value1", e.getAttrValue("attr1"));
		assertEquals("value2", e.getAttrValue("attr2"));
		assertEquals("value3", e.getAttrValue("attr3"));
		assertEquals("value4", e.getAttrValue("attr4"));
		assertEquals("value5", e.getAttrValue("attr5"));
		assertEquals("value6", e.getAttrValue("attr6"));
		assertEquals("value7", e.getAttrValue("attr7"));
		assertEquals("value8", e.getAttrValue("attr8"));
		assertEquals("value9", e.getAttrValue("attr9"));
		assertEquals("value10", e.getAttrValue("attr10"));
		assertEquals("value11", e.getAttrValue("attr11"));
		assertEquals("value12", e.getAttrValue("attr12"));
	}
}

// Element_13Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttrValueOrNull(String)} method.
*/
class Element_13Test {
		
	@Test
	void testGetAttrValueOrNull() throws Exception {
		Element e = new Element("", "test");
		e.addAttribute("", "attr1", "CDATA", "value1");
		e.addAttribute("", "attr2", "CDATA", "value2");
		e.addAttribute("", "attr3", "CDATA", "value3");
		e.addAttribute("", "attr4", "CDATA", "value4");
		e.addAttribute("", "attr5", "CDATA", "value5");
		e.addAttribute("", "attr6", "CDATA", "value6");
		e.addAttribute("", "attr7", "CDATA", "value7");
		e.addAttribute("", "attr8", "CDATA", "value8");
		e.addAttribute("", "attr9", "CDATA", "value9");
		e.addAttribute("", "attr10", "CDATA", "value10");
		e.addAttribute("", "attr11", "CDATA", "value11");
		e.addAttribute("", "attr12", "CDATA", "value12");
		assertEquals("value1", e.getAttrValueOrNull("attr1"));
		assertEquals("value2", e.getAttrValueOrNull("attr2"));
		assertEquals("value3", e.getAttrValueOrNull("attr3"));
		assertEquals("value4", e.getAttrValueOrNull("attr4"));
		assertEquals("value5", e.getAttrValueOrNull("attr5"));
		assertEquals("value6", e.getAttrValueOrNull("attr6"));
		assertEquals("value7", e.getAttrValueOrNull("attr7"));
		assertEquals("value8", e.getAttrValueOrNull("attr8"));
		assertEquals("value9", e.getAttrValueOrNull("attr9"));
		assertEquals("value10", e.getAttrValueOrNull("attr10"));
		assertEquals("value11", e.getAttrValueOrNull("attr11"));
		assertEquals("value12", e.getAttrValueOrNull("attr12"));
	}
}

// Element_14Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttrValue(String,String)} method.
*/
class Element_14Test {
		
	@Test
	void testGetAttrValue() throws Exception {
		Element e = new Element("", "test");
		e.addAttribute("", "attr1", "CDATA", "value1");
		e.addAttribute("", "attr2", "CDATA", "value2");
		e.addAttribute("", "attr3", "CDATA", "value3");
		e.addAttribute("", "attr4", "CDATA", "value4");
		e.addAttribute("", "attr5", "CDATA", "value5");
		e.addAttribute("", "attr6", "CDATA", "value6");
		e.addAttribute("", "attr7", "CDATA", "value7");
		e.addAttribute("", "attr8", "CDATA", "value8");
		e.addAttribute("", "attr9", "CDATA", "value9");
		e.addAttribute("", "attr10", "CDATA", "value10");
		e.addAttribute("", "attr11", "CDATA", "value11");
		e.addAttribute("", "attr12", "CDATA", "value12");
		assertEquals("value1", e.getAttrValue("", "attr1"));
		assertEquals("value2", e.getAttrValue("", "attr2"));
		assertEquals("value3", e.getAttrValue("", "attr3"));
		assertEquals("value4", e.getAttrValue("", "attr4"));
		assertEquals("value5", e.getAttrValue("", "attr5"));
		assertEquals("value6", e.getAttrValue("", "attr6"));
		assertEquals("value7", e.getAttrValue("", "attr7"));
		assertEquals("value8", e.getAttrValue("", "attr8"));
		assertEquals("value9", e.getAttrValue("", "attr9"));
		assertEquals("value10", e.getAttrValue("", "attr10"));
		assertEquals("value11", e.getAttrValue("", "attr11"));
		assertEquals("value12", e.getAttrValue("", "attr12"));
	}
}

// Element_15Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*