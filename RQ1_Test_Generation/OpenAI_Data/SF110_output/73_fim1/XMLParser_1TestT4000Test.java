// XMLParser_1Test.java
package osa.ora.server.utils;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.w3c.dom.NodeList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XMLParser}.
* It contains ten unit test cases for the {@link XMLParser#getSingleProperty(String)} method.
*/
class XMLParser_1Test {

		/**
		* Test case for the {@link XMLParser#getSingleProperty(String)} method.
		* It tests the method with a valid input.
		*/
		@Test
		void testGetSingleProperty_1() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test.xml"));
				String result = xmlParser.getSingleProperty("test");
				assertEquals("test", result);
		}
		
		/**
		* Test case for the {@link XMLParser#getSingleProperty(String)} method.
		* It tests the method with a valid input.
		*/
		@Test
		void testGetSingleProperty_2() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test.xml"));
				String result = xmlParser.getSingleProperty("test");
				assertEquals("test", result);
		}
		
		/**
		* Test case for the {@link XMLParser#getSingleProperty(String)} method.
		* It tests the method with a valid input.
		*/
		@Test
		void testGetSingleProperty_3() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test.xml"));
				String result = xmlParser.getSingleProperty("test");
				assertEquals("test", result);
		}
		
		/**
		* Test case for the {@link XMLParser#getSingleProperty(String)} method.
		* It tests the method with a valid input.
		*/
		@Test
		void testGetSingleProperty_4() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test.xml"));
				String result = xmlParser.getSingleProperty("test");
				assertEquals("test", result);
		}
		
		/**
		* Test case for the {@link XMLParser#getSingleProperty(String)} method.
		* It tests the method with a valid input.
		*/
		@Test
		void testGetSingleProperty_5() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test.xml"));
				String result = xmlParser.getSingleProperty("test");
				assertEquals("test", result);
		}
		
		/**
		* Test case for the {@link XMLParser#getSingleProperty(String)} method.
		* It tests the method with a valid input.
		*/
		@Test
		void testGetSingleProperty_6() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test.xml"));
				String result = xmlParser.getSingleProperty("test");
				assertEquals("test", result);
		}
		
		/**
		* Test case for the {@link XMLParser#getSingleProperty(String)} method.
		* It tests the method with a valid input.
		*/
		@Test
		void testGetSingleProperty_7() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test.xml"));
				String result = xmlParser.getSingleProperty("test");
				assertEquals("test", result);
		}
		
		/**
		* Test case for the {@link XMLParser#getSingleProperty(String)} method.
		* It tests the method with a valid input.
		*/
		@Test
		void testGetSingleProperty_8() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test.xml"));
				String result = xmlParser.getSingleProperty("test");
				assertEquals("test", result);
		}
		
		/**
		* Test case for the {@link XMLParser#getSingleProperty(String)} method.
		* It tests the method with a valid input.
		*/
		@Test
		void testGetSingleProperty_9() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test.xml"));
				String result = xmlParser.getSingleProperty("test");
				assertEquals("test", result);
		}
		
		/**
		* Test case for the {@link XMLParser#getSingleProperty(String)} method.
		* It tests the method with a valid input.
		*/
		@Test
		void testGetSingleProperty_10() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test.xml"));
				String result = xmlParser.getSingleProperty("test");
				assertEquals("test", result);
		}
}