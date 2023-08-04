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
    * @throws IFXException if there was a problem reading the document.
    */
    @Test
    void testRead() throws IFXException {
        InputStream istream = getClass().getResourceAsStream("IFXDocumentHandler_2Test.xml");
        Map validationProperties = null;
        Document doc = IFXDocumentHandler.read(istream, true, validationProperties);
        assertNotNull(doc);
        Element root = doc.getRootElement();
        assertNotNull(root);
        assertEquals("IFXDocumentHandler_2Test", root.getName());
        Namespace ns = root.getNamespace();
        assertNotNull(ns);
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", ns.getURI());
        assertEquals("IFXDocumentHandler_2Test", ns.getPrefix());
        assertEquals("IFXDocumentHandler_2Test", root.getNamespacePrefix());
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getNamespaceURI());
        assertEquals("IFXDocumentHandler_2Test", root.getQualifiedName());
        assertEquals("IFXDocumentHandler_2Test", root.getQualifiedName(ns));
        assertEquals("IFXDocumentHandler_2Test", root.getQualifiedName(ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI()));
        assertEquals("IFXDocumentHandler_2Test", root.getQualifiedName(ns.getPrefix(), ns.getURI()));
        assertEquals("IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.getQualifiedName(ns.getURI(), ns.getPrefix()));
        assertEquals("http://www.ifx.org/IFXDocumentHandler_2Test", root.get