// Element_16Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getFirstChildElement(String, String)} method.
*/
class Element_16Test {

		@Test
		public void test_getFirstChildElement_01() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement("", "child");
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_02() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement("", "child2");
				assertNull(result);
		}
		
		@Test
		public void test_getFirstChildElement_03() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement("", "child");
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_04() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement("", "child2");
				assertNull(result);
		}
		
		@Test
		public void test_getFirstChildElement_05() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement("", "child");
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_06() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement("", "child2");
				assertNull(result);
		}
		
		@Test
		public void test_getFirstChildElement_07() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement("", "child");
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_08() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement("", "child2");
				assertNull(result);
		}
		
		@Test
		public void test_getFirstChildElement_09() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement("", "child");
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_10() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement("", "child2");
				assertNull(result);
		}
}

// Element_17Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getFirstChildElement()} method.
*/
class Element_17Test {
		
		@Test
		public void test_getFirstChildElement_01() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement();
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_02() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement();
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_03() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement();
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_04() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement();
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_05() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement();
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_06() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement();
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_07() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement();
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_08() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element("", "child");
				element.addChild(child);
				Element result = element.getFirstChildElement();
				assertEquals(child, result);
		}
		
		@Test
		public void test_getFirstChildElement_09() throws Exception {
				Element element = new Element("", "element");
				Element child = new Element