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
* It contains ten unit test cases for the {@link Element#getFirstChildElementOrNull(String, String)} method.
*/
class Element_15Test {

	@Test
	void test_getFirstChildElementOrNull_01() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull("", "");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_02() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull("", "a");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_03() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull("a", "");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_04() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull("a", "a");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_05() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull("", "a");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_06() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull("a", "");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_07() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull("a", "a");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_08() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull("", "a");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_09() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull("a", "");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_10() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull("a", "a");
		assertNull(result);
	}
}

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
	void test_getFirstChildElement_01() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElement("", "");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElement_02() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElement("", "a");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElement_03() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElement("a", "");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElement_04() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElement("a", "a");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElement_05() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElement("", "a");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElement_06() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElement("a", "");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElement_07() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElement("a", "a");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElement_08() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElement("", "a");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElement_09() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElement("a", "");
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElement_10() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElement("a", "a");
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
* It contains ten unit test cases for the {@link Element#getFirstChildElementOrNull()} method.
*/
class Element_17Test {
		
	@Test
	void test_getFirstChildElementOrNull_01() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull();
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_02() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull();
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_03() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull();
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_04() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull();
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_05() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull();
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_06() {
		Element element = new Element("", "", 0, 0);
		Element result = element.getFirstChildElementOrNull();
		assertNull(result);
	}
	
	@Test
	void test_getFirstChildElementOrNull_07() {
		Element element = new Element("",