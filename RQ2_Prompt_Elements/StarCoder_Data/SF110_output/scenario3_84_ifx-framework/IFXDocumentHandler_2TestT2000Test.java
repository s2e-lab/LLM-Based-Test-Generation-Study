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
        InputStream istream = null;
        Document doc = null;
        try {
            istream = getClass().getResourceAsStream("IFXDocumentHandler_1.xml");
            doc = IFXDocumentHandler.read(istream, true, null);
            assertNotNull(doc);
            istream.close();
            istream = getClass().getResourceAsStream("IFXDocumentHandler_2.xml");
            doc = IFXDocumentHandler.read(istream, true, null);
            assertNotNull(doc);
            istream.close();
            istream = getClass().getResourceAsStream("IFXDocumentHandler_3.xml");
            doc = IFXDocumentHandler.read(istream, true, null);
            assertNotNull(doc);
            istream.close();
            istream = getClass().getResourceAsStream("IFXDocumentHandler_4.xml");
            doc = IFXDocumentHandler.read(istream, true, null);
            assertNotNull(doc);
            istream.close();
            istream = getClass().getResourceAsStream("IFXDocumentHandler_5.xml");
            doc = IFXDocumentHandler.read(istream, true, null);
            assertNotNull(doc);
            istream.close();
            istream = getClass().getResourceAsStream("IFXDocumentHandler_6.xml");
            doc = IFXDocumentHandler.read(istream, true, null);
            assertNotNull(doc);
            istream.close();
            istream = getClass().getResourceAsStream("IFXDocumentHandler_7.xml");
            doc = IFXDocumentHandler.read(istream, true, null);
            assertNotNull(doc);
            istream.close();
            istream = getClass().getResourceAsStream("IFXDocumentHandler_8.xml");
            doc = IFXDocumentHandler.read(istream, true, null);
            assertNotNull(doc);
            istream.close();
            istream = getClass().getResourceAsStream("IFXDocumentHandler_9.xml");
            doc = IFXDocumentHandler.read(istream, true, null);
            assertNotNull(doc);
            istream.close();
            istream = getClass().getResourceAsStream("IFXDocumentHandler_10.xml");
            doc = IFXDocumentHandler.read(istream, true, null);
            assertNotNull(doc);
            istream.close();
        } catch (IOException e) {
            fail(e.getMessage());
        } finally {
            try {
                if (istream != null) {
                    istream.close();
                }
            } catch (IOException e) {
                fail(e.getMessage());
            }
        }
    }
}

// IFXDocumentHandler_1.xml
<?xml version="1.0" encoding="UTF-8"?>
<IFX xmlns="http://www.ifx.org/IFX/IFX2.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.ifx.org/IFX/IFX2.0 http://www.ifx.org/IFX/IFX2.0/IFX2.0.xsd">
	<IFXHeader>
		<IFXIdentifier>IFXDocumentHandler_1</IFXIdentifier>
		<IFXVersion>2.0</IFXVersion>
		<IFXRevision>0</IFXRevision>
		<IFXStatus>Draft</IFXStatus>
		<IFXType>IFXDocumentHandler_1</IFXType>
		<IFXDescription>IFXDocumentHandler_1</IFXDescription>
		<IFXAuthor>Sujit Pal</IFXAuthor>
		<IFXOrganization>IFX</IFXOrganization>
		<IFXContact><EMAIL></IFXContact>
		<IFXLicense>BSD</IFXLicense>
		<IFXCopyright>Copyright (c) 2009, IFX</IFXCopyright>
		<IFXDate>2009-01-01</IFXDate>
		<IFXReference>http://www.ifx.org</IFXReference>
	</IFXHeader>
	<IFXBody>
		<IFXObject>
			<IFXIdentifier>IFXDocumentHandler_1</IFXIdentifier>
			<IFXType>IFXDocumentHandler_1</IFXType>
			<IFXDescription>IFXDocumentHandler_1</IFXDescription>
			<IFXAuthor>Sujit Pal</IFXAuthor>
			<IFXOrganization>IFX</IFXOrganization>
			<IFXContact><EMAIL></IFXContact>
			<IFXLicense>BSD</IFXLicense>
			<IFXCopyright>Copyright (c) 2009, IFX</IFXCopyright>
			<IFXDate>2009-01-01</IFXDate>
			<IFXReference>http://www.ifx.org</IFXReference>
		</IFXObject>
	</IFXBody>
</IFX>

// IFXDocumentHandler_2.xml
<?xml version="1.0" encoding="UTF-8"?>
<IFX xmlns="http://www.ifx.org/IFX/IFX2.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.ifx.org/IFX/IFX2.0 http://www.ifx.org/IFX/IFX2.0/IFX2.0.xsd">
	<IFXHeader>
		<IFXIdentifier>IFXDocumentHandler_2</IFXIdentifier>
		<IFXVersion>2.0</IFXVersion>
		<IFXRevision>0</IFXRevision>
		<IFXStatus>Draft</IFXStatus>
		<IFXType>IFXDocumentHandler_2</IFXType>
		<IFXDescription>IFXDocumentHandler_2</IFXDescription>
		<IFXAuthor>Sujit Pal</IFXAuthor>
		<IFXOrganization>IFX</IFXOrganization>
		<IFXContact><EMAIL></IFXContact>
		<IFXLicense>BSD</IFXLicense>
		<IFXCopyright>Copyright (c) 2009, IFX</IFXCopyright>
		<IFXDate>2009-01-01</IFXDate>
		<IFXReference>http://www.ifx.org</IFXReference>
	</IFXHeader>
	<IFXBody>
		<IFXObject>
			<IFXIdentifier>IFXDocumentHandler_2</IFXIdentifier>
			<IFXType>IFXDocumentHandler_2</IFXType>
			<IFXDescription>IFXDocumentHandler_2</IFXDescription>
			<IFXAuthor>Sujit Pal</IFXAuthor>
			<IFXOrganization>IFX</IFXOrganization>
			<IFXContact><EMAIL></IFXContact>
			<IFXLicense>BSD</IFXLicense>
			<IFXCopyright>Copyright (c) 2009, IFX</IFXCopyright>
			<IFXDate>2009-01-01</IFXDate>
			<IFXReference>http://www.ifx.org</IFXReference>
		</IFXObject>
	</IFXBody>
</IFX>

// IFXDocumentHandler_3.xml
<?xml version="1.0" encoding="UTF-8"?>
<IFX xmlns="http://www.ifx.org/IFX/IFX2.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.ifx.org/IFX/IFX2.0 http://www.ifx.org/IFX/IFX2.0/IFX2.0.xsd">
	<IFXHeader>
		<IFXIdentifier>IFXDocumentHandler_3</IFXIdentifier>
		<IFXVersion>2.0</IFXVersion>
		<IFXRevision>0</IFXRevision>
		<IFXStatus>Draft</IFXStatus>
		<IFXType>IFXDocumentHandler_3</IFXType>
		<IFXDescription>IFXDocumentHandler_3</IFXDescription>
		<IFXAuthor>Sujit Pal</IFXAuthor>
		<IFXOrganization>IFX</IFXOrganization>
		<IFXContact><EMAIL></IFXContact>
		<IFXLicense>BSD</IFXLicense>
		<IFXCopyright>Copyright (c) 2009, IF