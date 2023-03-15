// XPathReaderFactory_1Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader(String)} method.
*/
class XPathReaderFactory_1Test {

	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_1() {
		String className = null;
		try {
			XPathReaderFactory.createReader(className);
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class name cannot be null", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is empty.
	*/
	@Test
	public void testCreateReader_2() {
		String className = "";
		try {
			XPathReaderFactory.createReader(className);
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class name cannot be empty", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_3() {
		String className = "com.werken.saxpath.XPathReader1";
		try {
			XPathReaderFactory.createReader(className);
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [" + className + "] not found", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_4() {
		String className = "com.werken.saxpath.XPathReader";
		try {
			XPathReaderFactory.createReader(className);
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [" + className + "] does not implement the org.saxpath.XPathReader interface.", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_5() {
		String className = "com.werken.saxpath.XPathReader";
		try {
			XPathReaderFactory.createReader(className);
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [" + className + "] does not implement the org.saxpath.XPathReader interface.", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_6() {
		String className = "com.werken.saxpath.XPathReader";
		try {
			XPathReaderFactory.createReader(className);
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [" + className + "] does not implement the org.saxpath.XPathReader interface.", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_7() {
		String className = "com.werken.saxpath.XPathReader";
		try {
			XPathReaderFactory.createReader(className);
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [" + className + "] does not implement the org.saxpath.XPathReader interface.", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_8() {
		String className = "com.werken.saxpath.XPathReader";
		try {
			XPathReaderFactory.createReader(className);
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [" + className + "] does not implement the org.saxpath.XPathReader interface.", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_9() {
		String className = "com.werken.saxpath.XPathReader";
		try {
			XPathReaderFactory.createReader(className);
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [" + className + "] does not implement the org.saxpath.XPathReader interface.", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case when the class name is not a valid class name.
	*/
	@Test
	public void testCreateReader_10() {
		String className = "com.werken.saxpath.XPathReader";
		try {
			XPathReaderFactory.createReader(className);
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Class [" + className + "] does not implement the org.saxpath.XPathReader interface.", e.getMessage());
		}
	}
}

// XPathReaderFactory_2Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_2Test {
		
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_1() {
		try {
			XPathReaderFactory.createReader();
			fail("Expected SAXPathException");
		} catch (SAXPathException e) {
			assertEquals("Property org.saxpath.driver not set", e.getMessage());
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case when the class name is null.
	*/
	@Test
	public void testCreateReader_2() {
		try {
			XPathReaderFactory.createReader();
			fail("Expected SAXPathException");
		} catch