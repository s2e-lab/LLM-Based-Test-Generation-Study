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
* It contains ten unit test cases for the {@link IFXDocumentHandler#read(InputStream, boolean, Map)} method.
*/
class IFXDocumentHandler_2Test {

    /**
    * Test method for {@link IFXDocumentHandler#read(InputStream, boolean, Map)}.
    * @throws IFXException
    */
    @Test
    void testRead() throws IFXException {
        InputStream istream = getClass().getResourceAsStream("IFXDocumentHandler_1.xml");
        Document doc = IFXDocumentHandler.read(istream, true, null);
        assertNotNull(doc);
        Element root = doc.getRootElement();
        assertNotNull(root);
        assertEquals("IFXDocumentHandler", root.getName());
        assertEquals("http://www.ifx.org/IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler", root.getNamespace().getURI());
        assertEquals("IFXDocumentHandler", root.getNamespace().getPrefix());
        assertEquals("IFXDocumentHandler", root.getNamespace().getQualifiedName());
        assertEquals("IFXDocumentHandler",