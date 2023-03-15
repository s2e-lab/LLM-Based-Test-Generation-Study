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
* It contains ten unit test cases for the {@link Element#getAttrValueOrNull(String, String)} method.
*/
class Element_13Test {

		@Test
		public void test_getAttrValueOrNull_1() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals("value1", element.getAttrValueOrNull("attr1"));
		}
		
		@Test
		public void test_getAttrValueOrNull_2() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals("value2", element.getAttrValueOrNull("attr2"));
		}
		
		@Test
		public void test_getAttrValueOrNull_3() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals("value3", element.getAttrValueOrNull("attr3"));
		}
		
		@Test
		public void test_getAttrValueOrNull_4() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals(null, element.getAttrValueOrNull("attr4"));
		}
		
		@Test
		public void test_getAttrValueOrNull_5() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals(null, element.getAttrValueOrNull("attr5"));
		}
		
		@Test
		public void test_getAttrValueOrNull_6() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals(null, element.getAttrValueOrNull("attr6"));
		}
		
		@Test
		public void test_getAttrValueOrNull_7() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals(null, element.getAttrValueOrNull("attr7"));
		}
		
		@Test
		public void test_getAttrValueOrNull_8() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals(null, element.getAttrValueOrNull("attr8"));
		}
		
		@Test
		public void test_getAttrValueOrNull_9() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals(null, element.getAttrValueOrNull("attr9"));
		}
		
		@Test
		public void test_getAttrValueOrNull_10() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals(null, element.getAttrValueOrNull("attr10"));
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
* It contains ten unit test cases for the {@link Element#getAttrValue(String, String)} method.
*/
class Element_14Test {
		
		@Test
		public void test_getAttrValue_1() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals("value1", element.getAttrValue("attr1"));
		}
		
		@Test
		public void test_getAttrValue_2() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals("value2", element.getAttrValue("attr2"));
		}
		
		@Test
		public void test_getAttrValue_3() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA", "value1");
				element.addAttribute("", "attr2", "CDATA", "value2");
				element.addAttribute("", "attr3", "CDATA", "value3");
				assertEquals("value3", element.getAttrValue("attr3"));
		}
		
		@Test
		public void test_getAttrValue_4() throws Exception {
				Element element = new Element("", "test");
				element.addAttribute("", "attr1", "CDATA