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
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_1Test {

    /**
     * Test case for {@link IFXDocumentHandler#parse(Document)} method.
     * It tests the parsing of a valid IFX XML Document.
     */
    @Test
    void testParse_1() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("IFXDocumentHandler_1.xml");
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(inputStream);
            IFXObject obj = IFXDocumentHandler.parse(doc);
            assertNotNull(obj);
        } catch (Exception e) {
            fail(e.getMessage());
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_2Test {
		
    /**
     * Test case for {@link IFXDocumentHandler#parse(Document)} method.
     * It tests the parsing of a valid IFX XML Document.
     */
    @Test
    void testParse_1() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("IFXDocumentHandler_2.xml");
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(inputStream);
            IFXObject obj = IFXDocumentHandler.parse(doc);
            assertNotNull(obj);
        } catch (Exception e) {
            fail(e.getMessage());
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
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXDocumentHandler}.
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_3Test {
		
    /**
     * Test case for {@link IFXDocumentHandler#parse(Document)} method.
     * It tests the parsing of a valid IFX XML Document.
     */
    @Test
    void testParse_1() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("IFXDocumentHandler_3.xml");
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(inputStream);
            IFXObject obj = IFXDocumentHandler.parse(doc);
            assertNotNull(obj);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}

// IFXDocumentHandler_4Test.java
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_4Test {
		
    /**
     * Test case for {@link IFXDocumentHandler#parse(Document)} method.
     * It tests the parsing of a valid IFX XML Document.
     */
    @Test
    void testParse_1() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("IFXDocumentHandler_4.xml");
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(inputStream);
            IFXObject obj = IFXDocumentHandler.parse(doc);
            assertNotNull(obj);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}

// IFXDocumentHandler_5Test.java
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_5Test {
		
    /**
     * Test case for {@link IFXDocumentHandler#parse(Document)} method.
     * It tests the parsing of a valid IFX XML Document.
     */
    @Test
    void testParse_1() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("IFXDocumentHandler_5.xml");
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(inputStream);
            IFXObject obj = IFXDocumentHandler.parse(doc);
            assertNotNull(obj);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}

// IFXDocumentHandler_6Test.java
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_6Test {
		
    /**
     * Test case for {@link IFXDocumentHandler#parse(Document)} method.
     * It tests the parsing of a valid IFX XML Document.
     */
    @Test
    void testParse_1() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("IFXDocumentHandler_6.xml");
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(inputStream);
            IFXObject obj = IFXDocumentHandler.parse(doc);
            assertNotNull(obj);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}

// IFXDocumentHandler_7Test.java
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
* It contains ten unit test cases