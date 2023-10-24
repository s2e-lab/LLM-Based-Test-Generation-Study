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
     *  when the <code>org.saxpath.driver</code> system property is set.
     */
    @Test
    void testCreateReader_001() {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$TestXPathReader");
        XPathReader reader = null;
        try {
            reader = XPathReaderFactory.createReader();
        } catch (SAXPathException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        assertNotNull(reader);
        assertTrue(reader instanceof TestXPathReader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property is not set.
     */
    @Test
    void testCreateReader_002() {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "");
        XPathReader reader = null;
        try {
            reader = XPathReaderFactory.createReader();
        } catch (SAXPathException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        assertNotNull(reader);
        assertTrue(reader instanceof TestXPathReader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property is set to an invalid class name.
     */
    @Test
    void testCreateReader_003() {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$InvalidXPathReader");
        XPathReader reader = null;
        try {
            reader = XPathReaderFactory.createReader();
        } catch (SAXPathException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        assertNotNull(reader);
        assertTrue(reader instanceof TestXPathReader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property is set to an invalid class name.
     */
    @Test
    void testCreateReader_004() {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$InvalidXPathReader");
        XPathReader reader = null;
        try {
            reader = XPathReaderFactory.createReader();
        } catch (SAXPathException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        assertNotNull(reader);
        assertTrue(reader instanceof TestXPathReader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property is set to an invalid class name.
     */
    @Test
    void testCreateReader_005() {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$InvalidXPathReader");
        XPathReader reader = null;
        try {
            reader = XPathReaderFactory.createReader();
        } catch (SAXPathException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        assertNotNull(reader);
        assertTrue(reader instanceof TestXPathReader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property is set to an invalid class name.
     */
    @Test
    void testCreateReader_006() {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$InvalidXPathReader");
        XPathReader reader = null;
        try {
            reader = XPathReaderFactory.createReader();
        } catch (SAXPathException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        assertNotNull(reader);
        assertTrue(reader instanceof TestXPathReader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property is set to an invalid class name.
     */
    @Test
    void testCreateReader_007() {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$InvalidXPathReader");
        XPathReader reader = null;
        try {
            reader = XPathReaderFactory.createReader();
        } catch (SAXPathException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        assertNotNull(reader);
        assertTrue(reader instanceof TestXPathReader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property is set to an invalid class name.
     */
    @Test
    void testCreateReader_008() {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$InvalidXPathReader");
        XPathReader reader = null;
        try {
            reader = XPathReaderFactory.createReader();
        } catch (SAXPathException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        assertNotNull(reader);
        assertTrue(reader instanceof TestXPathReader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property is set to an invalid class name.
     */
    @Test
    void testCreateReader_009() {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$InvalidXPathReader");
        XPathReader reader = null;
        try {
            reader = XPathReaderFactory.createReader();
        } catch (SAXPathException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        assertNotNull(reader);
        assertTrue(reader instanceof TestXPathReader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property is set to an invalid class name.
     */
    @Test
    void testCreateReader_010() {
        System.setProperty(XPathReaderFactory.DRIVER_PROPERTY, "org.saxpath.helpers.XPathReaderFactory_0Test$InvalidXPathReader");
        XPathReader reader = null;
        try {
            reader = XPathReaderFactory.createReader();
        } catch (SAXPathException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
        assertNotNull(reader);
        assertTrue(reader instanceof TestXPathReader);
    }

    /**
     * Test class for {@link XPathReaderFactory}.
     * It implements the {@link XPathReader} interface.
     */
    static class TestXPathReader implements XPathReader {
        public TestXPathReader() {
        }
    }

    /**
     * Test class for {@link XPathReaderFactory}.
     * It does not implement the {@link XPathReader} interface.
     */
    static class InvalidXPathReader {
        public InvalidXPathReader() {
        }
    }
}
