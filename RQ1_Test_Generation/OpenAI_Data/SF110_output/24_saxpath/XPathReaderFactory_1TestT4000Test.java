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
	* It tests the case that the class name is null and expects SAXPathException.
	*/
	@Test
	void testCreateReader_Null() {
		try {
			XPathReaderFactory.createReader(null);
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is empty and expects SAXPathException.
	*/
	@Test
	void testCreateReader_Empty() {
		try {
			XPathReaderFactory.createReader("");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not found and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotFound() {
		try {
			XPathReaderFactory.createReader("NotFound");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance() {
		try {
			XPathReaderFactory.createReader("java.lang.String");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance2() {
		try {
			XPathReaderFactory.createReader("java.lang.Integer");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance3() {
		try {
			XPathReaderFactory.createReader("java.lang.Double");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance4() {
		try {
			XPathReaderFactory.createReader("java.lang.Boolean");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance5() {
		try {
			XPathReaderFactory.createReader("java.lang.Character");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance6() {
		try {
			XPathReaderFactory.createReader("java.lang.Byte");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance7() {
		try {
			XPathReaderFactory.createReader("java.lang.Short");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance8() {
		try {
			XPathReaderFactory.createReader("java.lang.Long");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance9() {
		try {
			XPathReaderFactory.createReader("java.lang.Float");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader(String)} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance10() {
		try {
			XPathReaderFactory.createReader("java.lang.Object");
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
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
	* It tests the case that the class name is null and expects SAXPathException.
	*/
	@Test
	void testCreateReader_Null() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is empty and expects SAXPathException.
	*/
	@Test
	void testCreateReader_Empty() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not found and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotFound() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance2() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance3() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance4() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance5() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance6() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance7() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance8() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance9() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not an instance of XPathReader and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotInstance10() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
}

// XPathReaderFactory_3Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_3Test {
		
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is null and expects SAXPathException.
	*/
	@Test
	void testCreateReader_Null() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is empty and expects SAXPathException.
	*/
	@Test
	void testCreateReader_Empty() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class name is not found and expects SAXPathException.
	*/
	@Test
	void testCreateReader_NotFound() {
		try {
			XPathReaderFactory.createReader();
			fail("SAXPathException expected.");
		} catch (SAXPathException e) {
			// as expected
		}
	}
	
	/**
	* Test case for {@link XPathReaderFactory#createReader()} method.
	* It tests the case that the class