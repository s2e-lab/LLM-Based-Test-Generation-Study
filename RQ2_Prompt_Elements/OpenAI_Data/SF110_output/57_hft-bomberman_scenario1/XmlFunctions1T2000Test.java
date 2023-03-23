// XmlFunctionsTest.java
package common;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlFunctions}.
* It contains ten unit test cases for the {@link XmlFunctions#findXmlNodes(String)} method.
*/
class XmlFunctionsTest {

		private static final Logger logger = Logger.getLogger(XmlFunctionsTest.class);
		
		private static final String XML_FILE = "test.xml";
		
		private static final String XML_FILE_PATH = "src/test/resources/";
		
		private static final String XML_FILE_WITH_PATH = XML_FILE_PATH + XML_FILE;
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE_WITH_PATH_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION_AND_EXTENSION = XML_FILE_WITH_PATH + ".xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml.xml";
		
		private static final String XML_FILE