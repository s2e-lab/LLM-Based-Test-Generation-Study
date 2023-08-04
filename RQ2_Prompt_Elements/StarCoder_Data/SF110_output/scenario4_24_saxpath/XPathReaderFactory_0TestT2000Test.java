// XPathReaderFactory_0Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_0Test {

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is unset.
     *
     *  <p>
     *  This test case expects the {@link XPathReaderFactory#createReader()}
     *  method to return an instance of the default driver class,
     *  {@link org.saxpath.XPathReader}.
     *
     *  @throws SAXPathException if the method throws an exception.
     */
    @Test
    void testCreateReader_001() throws SAXPathException {
        XPathReaderFactory.USE_DEFAULT = true;
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals(XPathReaderFactory.DEFAULT_DRIVER, reader.getClass().getName());
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class which does not exist.
     *
     *  <p>
     *  This test case expects the {@link XPathReaderFactory#createReader()}
     *  method to return an instance of the default driver class,
     *  {@link org.saxpath.XPathReader}.
     *
     *  @throws SAXPathException if the method throws an exception.
     */
    @Test
    void testCreateReader_002() throws SAXPathException {
        XPathReaderFactory.USE_DEFAULT = true;
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test_002");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals(XPathReaderFactory.DEFAULT_DRIVER, reader.getClass().getName());
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class which does not implement the
     *  {@link org.saxpath.XPathReader} interface.
     *
     *  <p>
     *  This test case expects the {@link XPathReaderFactory#createReader()}
     *  method to return an instance of the default driver class,
     *  {@link org.saxpath.XPathReader}.
     *
     *  @throws SAXPathException if the method throws an exception.
     */
    @Test
    void testCreateReader_003() throws SAXPathException {
        XPathReaderFactory.USE_DEFAULT = true;
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "java.lang.String");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals(XPathReaderFactory.DEFAULT_DRIVER, reader.getClass().getName());
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class which implements the
     *  {@link org.saxpath.XPathReader} interface.
     *
     *  <p>
     *  This test case expects the {@link XPathReaderFactory#createReader()}
     *  method to return an instance of the class specified by the
     *  <code>org.saxpath.driver</code> system property.
     *
     *  @throws SAXPathException if the method throws an exception.
     */
    @Test
    void testCreateReader_004() throws SAXPathException {
        XPathReaderFactory.USE_DEFAULT = true;
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test_004");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals(XPathReaderFactory.DRIVER_PROPERTY, reader.getClass().getName());
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class which implements the
     *  {@link org.saxpath.XPathReader} interface.
     *
     *  <p>
     *  This test case expects the {@link XPathReaderFactory#createReader()}
     *  method to return an instance of the class specified by the
     *  <code>org.saxpath.driver</code> system property.
     *
     *  @throws SAXPathException if the method throws an exception.
     */
    @Test
    void testCreateReader_005() throws SAXPathException {
        XPathReaderFactory.USE_DEFAULT = false;
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test_005");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals(XPathReaderFactory.DRIVER_PROPERTY, reader.getClass().getName());
    }
}

// XPathReaderFactory_0Test_002.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;

/**
* Test class of {@link XPathReaderFactory}.
* It contains one unit test case for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_0Test_002 {
		
    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class which does not exist.
     *
     *  <p>
     *  This test case expects the {@link XPathReaderFactory#createReader()}
     *  method to return an instance of the default driver class,
     *  {@link org.saxpath.XPathReader}.
     *
     *  @throws SAXPathException if the method throws an exception.
     */
    @Test
    void testCreateReader_001() throws SAXPathException {
        XPathReaderFactory.USE_DEFAULT = true;
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test_002");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals(XPathReaderFactory.DEFAULT_DRIVER, reader.getClass().getName());
    }
}

// XPathReaderFactory_0Test_004.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;

/**
* Test class of {@link XPathReaderFactory}.
* It contains one unit test case for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_0Test_004 {
		
    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class which implements the
     *  {@link org.saxpath.XPathReader} interface.
     *
     *  <p>
     *  This test case expects the {@link XPathReaderFactory#createReader()}
     *  method to return an instance of the class specified by the
     *  <code>org.saxpath.driver</code> system property.
     *
     *  @throws SAXPathException if the method throws an exception.
     */
    @Test
    void testCreateReader_001() throws SAXPathException {
        XPathReaderFactory.USE_DEFAULT = true;
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test_004");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
        assertEquals(XPathReaderFactory.DRIVER_PROPERTY, reader.getClass().getName());
    }
}

// XPathReaderFactory_0Test_005.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;

/**
* Test class of {@link XPathReaderFactory}.
* It contains one unit test case for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_0Test_005 {
		
    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class which implements the
     *  {@link org.saxpath.XPathReader} interface.
     *
     *  <p>
     *  This test case expects the {@link XPathReaderFactory#createReader()}
     *  method to return an instance of the class specified by the
     *  <code>org.saxpath.driver</code> system property.
     *
     *  @throws SAXPathException if the method throws an exception.
     */
    @Test
    void testCreateReader_001() throws SAXPathException {
        XPathReaderFactory.USE_DEFAULT = false;
        System.setProperty(XPathReader