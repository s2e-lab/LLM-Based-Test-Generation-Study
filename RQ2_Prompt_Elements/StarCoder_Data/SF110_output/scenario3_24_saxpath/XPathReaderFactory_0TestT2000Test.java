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
     * @throws SAXPathException if the property is unset, or if
     *          the class can not be instantiated for some reason.,
     *          or if the class doesn't implement the <code>XPathReader</code>
     *          interface.
     */
    @Test
    void testCreateReader_001() throws SAXPathException {
        System.setProperty("org.saxpath.driver", "");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class that doesn't exist.
     *
     * @throws SAXPathException if the property is unset, or if
     *          the class can not be instantiated for some reason.,
     *          or if the class doesn't implement the <code>XPathReader</code>
     *          interface.
     */
    @Test
    void testCreateReader_002() throws SAXPathException {
        System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactory_0Test");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class that doesn't implement the <code>XPathReader</code>
     *  interface.
     *
     * @throws SAXPathException if the property is unset, or if
     *          the class can not be instantiated for some reason.,
     *          or if the class doesn't implement the <code>XPathReader</code>
     *          interface.
     */
    @Test
    void testCreateReader_003() throws SAXPathException {
        System.setProperty("org.saxpath.driver", "java.lang.String");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class that implements the <code>XPathReader</code>
     *  interface.
     *
     * @throws SAXPathException if the property is unset, or if
     *          the class can not be instantiated for some reason.,
     *          or if the class doesn't implement the <code>XPathReader</code>
     *          interface.
     */
    @Test
    void testCreateReader_004() throws SAXPathException {
        System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactory_0Test");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class that implements the <code>XPathReader</code>
     *  interface.
     *
     * @throws SAXPathException if the property is unset, or if
     *          the class can not be instantiated for some reason.,
     *          or if the class doesn't implement the <code>XPathReader</code>
     *          interface.
     */
    @Test
    void testCreateReader_005() throws SAXPathException {
        System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactory_0Test");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class that implements the <code>XPathReader</code>
     *  interface.
     *
     * @throws SAXPathException if the property is unset, or if
     *          the class can not be instantiated for some reason.,
     *          or if the class doesn't implement the <code>XPathReader</code>
     *          interface.
     */
    @Test
    void testCreateReader_006() throws SAXPathException {
        System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactory_0Test");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class that implements the <code>XPathReader</code>
     *  interface.
     *
     * @throws SAXPathException if the property is unset, or if
     *          the class can not be instantiated for some reason.,
     *          or if the class doesn't implement the <code>XPathReader</code>
     *          interface.
     */
    @Test
    void testCreateReader_007() throws SAXPathException {
        System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactory_0Test");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class that implements the <code>XPathReader</code>
     *  interface.
     *
     * @throws SAXPathException if the property is unset, or if
     *          the class can not be instantiated for some reason.,
     *          or if the class doesn't implement the <code>XPathReader</code>
     *          interface.
     */
    @Test
    void testCreateReader_008() throws SAXPathException {
        System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactory_0Test");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class that implements the <code>XPathReader</code>
     *  interface.
     *
     * @throws SAXPathException if the property is unset, or if
     *          the class can not be instantiated for some reason.,
     *          or if the class doesn't implement the <code>XPathReader</code>
     *          interface.
     */
    @Test
    void testCreateReader_009() throws SAXPathException {
        System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactory_0Test");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
    }

    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is set to a class that implements the <code>XPathReader</code>
     *  interface.
     *
     * @throws SAXPathException if the property is unset, or if
     *          the class can not be instantiated for some reason.,
     *          or if the class doesn't implement the <code>XPathReader</code>
     *          interface.
     */
    @Test
    void testCreateReader_010() throws SAXPathException {
        System.setProperty("org.saxpath.driver", "org.saxpath.helpers.XPathReaderFactory_0Test");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(reader);
    }
}

// XPathReaderFactory_1Test.java
package org.saxpath.helpers;

import org.saxpath.XPathReader;
import org.saxpath.SAXPathException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XPathReaderFactory}.
* It contains ten unit test cases for the {@link XPathReaderFactory#createReader()} method.
*/
class XPathReaderFactory_1Test {
		
    /**
     * Test case for {@link XPathReaderFactory#createReader()}
     *  when the <code>org.saxpath.driver</code> system property
     *  is unset.
     *
     * @throws SAXPathException if the property is unset, or if
     *          the class can not be instantiated for some reason.,
     *          or if the class doesn't implement the <code>XPathReader</code>
     *          interface.
     */
    @Test
    void testCreateReader_001() throws SAXPathException {
        System.setProperty("org.saxpath.driver", "");
        XPathReader reader = XPathReaderFactory.createReader();
        assertNotNull(