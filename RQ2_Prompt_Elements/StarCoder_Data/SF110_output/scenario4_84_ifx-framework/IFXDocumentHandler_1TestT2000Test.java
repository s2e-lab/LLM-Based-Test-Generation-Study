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
    * Test method for {@link org.sourceforge.ifx.utils.IFXDocumentHandler#parse(Document)}.
    * @throws IFXException if any problems were encountered in parsing.
    */
    @Test
    void testParse() throws IFXException {
        IFXDocumentHandler handler = new IFXDocumentHandler();
        Document doc = handler.read(getClass().getResourceAsStream("IFXDocumentHandler_1.xml"), false, null);
        IFXObject obj = handler.parse(doc);
        assertNotNull(obj);
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
    * Test method for {@link org.sourceforge.ifx.utils.IFXDocumentHandler#parse(Document)}.
    * @throws IFXException if any problems were encountered in parsing.
    */
    @Test
    void testParse() throws IFXException {
        IFXDocumentHandler handler = new IFXDocumentHandler();
        Document doc = handler.read(getClass().getResourceAsStream("IFXDocumentHandler_2.xml"), false, null);
        IFXObject obj = handler.parse(doc);
        assertNotNull(obj);
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
    * Test method for {@link org.sourceforge.ifx.utils.IFXDocumentHandler#parse(Document)}.
    * @throws IFXException if any problems were encountered in parsing.
    */
    @Test
    void testParse() throws IFXException {
        IFXDocumentHandler handler = new IFXDocumentHandler();
        Document doc = handler.read(getClass().getResourceAsStream("IFXDocumentHandler_3.xml"), false, null);
        IFXObject obj = handler.parse(doc);
        assertNotNull(obj);
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
    * Test method for {@link org.sourceforge.ifx.utils.IFXDocumentHandler#parse(Document)}.
    * @throws IFXException if any problems were encountered in parsing.
    */
    @Test
    void testParse() throws IFXException {
        IFXDocumentHandler handler = new IFXDocumentHandler();
        Document doc = handler.read(getClass().getResourceAsStream("IFXDocumentHandler_4.xml"), false, null);
        IFXObject obj = handler.parse(doc);
        assertNotNull(obj);
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
    * Test method for {@link org.sourceforge.ifx.utils.IFXDocumentHandler#parse(Document)}.
    * @throws IFXException if any problems were encountered in parsing.
    */
    @Test
    void testParse() throws IFXException {
        IFXDocumentHandler handler = new IFXDocumentHandler();
        Document doc = handler.read(getClass().getResourceAsStream("IFXDocumentHandler_5.xml"), false, null);
        IFXObject obj = handler.parse(doc);
        assertNotNull(obj);
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
    * Test method for {@link org.sourceforge.ifx.utils.IFXDocumentHandler#parse(Document)}.
    * @throws IFXException if any problems were encountered in parsing.
    */
    @Test
    void testParse() throws IFXException {
        IFXDocumentHandler handler = new IFXDocumentHandler();
        Document doc = handler.read(getClass().getResourceAsStream("IFXDocumentHandler_6.xml"), false, null);
        IFXObject obj = handler.parse(doc);
        assertNotNull(obj);
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
* It contains ten unit test cases for the {@link IFXDocumentHandler#parse(Document)} method.
*/
class IFXDocumentHandler_7Test {
		
    /**
    * Test method for {@link org.sourceforge.ifx.utils.IFXDocumentHandler#parse(Document)}.
    * @throws IFXException if any problems were