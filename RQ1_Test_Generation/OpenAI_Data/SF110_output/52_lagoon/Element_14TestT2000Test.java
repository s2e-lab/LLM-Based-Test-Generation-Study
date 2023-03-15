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
* It contains ten unit test cases for the {@link Element#getAttrValue(String, String)} method.
*/
class Element_14Test {

	@Test
	void test_getAttrValue_1() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value2", element.getAttrValue("", "attr2"));
	}
	
	@Test
	void test_getAttrValue_2() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value3", element.getAttrValue("", "attr3"));
	}
	
	@Test
	void test_getAttrValue_3() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value1", element.getAttrValue("", "attr1"));
	}
	
	@Test
	void test_getAttrValue_4() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value1", element.getAttrValue("", "attr1"));
	}
	
	@Test
	void test_getAttrValue_5() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value2", element.getAttrValue("", "attr2"));
	}
	
	@Test
	void test_getAttrValue_6() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value3", element.getAttrValue("", "attr3"));
	}
	
	@Test
	void test_getAttrValue_7() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value1", element.getAttrValue("", "attr1"));
	}
	
	@Test
	void test_getAttrValue_8() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value2", element.getAttrValue("", "attr2"));
	}
	
	@Test
	void test_getAttrValue_9() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value3", element.getAttrValue("", "attr3"));
	}
	
	@Test
	void test_getAttrValue_10() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value1", element.getAttrValue("", "attr1"));
	}
}

// Element_15Test.java
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
class Element_15Test {
		
	@Test
	void test_getAttrValue_1() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value2", element.getAttrValue("attr2"));
	}
	
	@Test
	void test_getAttrValue_2() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value3", element.getAttrValue("attr3"));
	}
	
	@Test
	void test_getAttrValue_3() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value1", element.getAttrValue("attr1"));
	}
	
	@Test
	void test_getAttrValue_4() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value2", element.getAttrValue("attr2"));
	}
	
	@Test
	void test_getAttrValue_5() throws Exception {
		Element element = new Element("", "test");
		element.addAttribute("", "attr1", "CDATA", "value1");
		element.addAttribute("", "attr2", "CDATA", "value2");
		element.addAttribute("", "attr3", "CDATA", "value3");
		assertEquals("value3", element.getAttrValue("attr3"));
	}
	
	@Test
	void test_getAttrValue_6() throws Exception {
		