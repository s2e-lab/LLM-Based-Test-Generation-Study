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
    void test_parse_1() {
        try {
            // Create a SAXBuilder object.
            SAXBuilder builder = new SAXBuilder();
            // Parse the IFX XML Document.
            Document doc = builder.build(getClass().getResourceAsStream("IFXDocumentHandler_1.xml"));
            // Parse the IFX XML Document into an IFXObject.
            IFXObject obj = IFXDocumentHandler.parse(doc);
            // Check the IFXObject.
            assertNotNull(obj);
            assertEquals("IFXDocumentHandler_1", obj.getName());
            assertEquals("IFXDocumentHandler_1", obj.getAlias());
            assertEquals("IFXDocumentHandler_1", obj.getClassName());
            assertEquals("IFXDocumentHandler_1", obj.getPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperPackageName());
            assertEquals("IFXDocumentHandler_1", obj.getSuperAlias());
            assertEquals("IFXDocumentHandler_1", obj.getSuperClassName());
            assertEquals("IFXDocumentHandler_