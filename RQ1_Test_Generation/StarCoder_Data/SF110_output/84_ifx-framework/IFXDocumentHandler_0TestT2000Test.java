// IFXDocumentHandler_0Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains ten unit test cases for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandler_0Test {

    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a null IFXObject.
    */
    @Test
    void test_build_0() {
        IFXObject obj = null;
        String namespacePrefix = null;
        String namespaceURI = null;
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a null namespacePrefix.
    */
    @Test
    void test_build_1() {
        IFXObject obj = new IFXObject();
        String namespacePrefix = null;
        String namespaceURI = null;
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a null namespaceURI.
    */
    @Test
    void test_build_2() {
        IFXObject obj = new IFXObject();
        String namespacePrefix = "ns";
        String namespaceURI = null;
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a valid IFXObject, namespacePrefix and namespaceURI.
    */
    @Test
    void test_build_3() {
        IFXObject obj = new IFXObject();
        String namespacePrefix = "ns";
        String namespaceURI = "http://www.example.com";
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
        } catch (Exception e) {
            fail("Unexpected exception " + e.getMessage());
        }
    }
}

// IFXDocumentHandler_1Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains ten unit test cases for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandler_1Test {
		
    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a null IFXObject.
    */
    @Test
    void test_build_0() {
        IFXObject obj = null;
        String namespacePrefix = "ns";
        String namespaceURI = "http://www.example.com";
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a null namespacePrefix.
    */
    @Test
    void test_build_1() {
        IFXObject obj = new IFXObject();
        String namespacePrefix = null;
        String namespaceURI = "http://www.example.com";
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a null namespaceURI.
    */
    @Test
    void test_build_2() {
        IFXObject obj = new IFXObject();
        String namespacePrefix = "ns";
        String namespaceURI = null;
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a valid IFXObject, namespacePrefix and namespaceURI.
    */
    @Test
    void test_build_3() {
        IFXObject obj = new IFXObject();
        String namespacePrefix = "ns";
        String namespaceURI = "http://www.example.com";
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
        } catch (Exception e) {
            fail("Unexpected exception " + e.getMessage());
        }
    }
}

// IFXDocumentHandler_2Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains ten unit test cases for the {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
*/
class IFXDocumentHandler_2Test {
		
    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a null IFXObject.
    */
    @Test
    void test_build_0() {
        IFXObject obj = null;
        String namespacePrefix = "ns";
        String namespaceURI = "http://www.example.com";
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a null namespacePrefix.
    */
    @Test
    void test_build_1() {
        IFXObject obj = new IFXObject();
        String namespacePrefix = null;
        String namespaceURI = "http://www.example.com";
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a null namespaceURI.
    */
    @Test
    void test_build_2() {
        IFXObject obj = new IFXObject();
        String namespacePrefix = "ns";
        String namespaceURI = null;
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    /**
    * Test case for {@link IFXDocumentHandler#build(IFXObject, String, String)} method.
    * It tests the method with a valid IFXObject, namespacePrefix and namespaceURI.
    */
    @Test
    void test_build_3() {
        IFXObject obj = new IFXObject();
        String namespacePrefix = "ns";
        String namespaceURI = "http://www.example.com";
        try {
            IFXDocumentHandler.build(obj, namespacePrefix, namespaceURI);
        } catch (Exception e) {
            fail("Unexpected exception " + e.getMessage());
        }
    }
}

// IFXDocumentHandler_3Test.java
package org.sourceforge.ifx.utils;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import org.jdom.Document;
import org.jdom.