// XMLParser_0Test.java
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
* It contains ten unit test cases for the {@link XMLParser#getProperty(String)} method.
*/
class XMLParser_0Test {

		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <ul>
		* <li>input: "test"</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testGetProperty_0() throws Exception {
				XMLParser fixture = new XMLParser(new File("test/osa/ora/server/utils/test.xml"));
				String tagName = "test";
				Vector result = fixture.getProperty(tagName);
				assertNotNull(result);
				assertEquals(1, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("test", table.get("id"));
				assertEquals("test", table.get("test"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <ul>
		* <li>input: "test"</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testGetProperty_1() throws Exception {
				XMLParser fixture = new XMLParser(new File("test/osa/ora/server/utils/test.xml"));
				String tagName = "test";
				Vector result = fixture.getProperty(tagName);
				assertNotNull(result);
				assertEquals(1, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("test", table.get("id"));
				assertEquals("test", table.get("test"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <ul>
		* <li>input: "test"</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testGetProperty_2() throws Exception {
				XMLParser fixture = new XMLParser(new File("test/osa/ora/server/utils/test.xml"));
				String tagName = "test";
				Vector result = fixture.getProperty(tagName);
				assertNotNull(result);
				assertEquals(1, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("test", table.get("id"));
				assertEquals("test", table.get("test"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <ul>
		* <li>input: "test"</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testGetProperty_3() throws Exception {
				XMLParser fixture = new XMLParser(new File("test/osa/ora/server/utils/test.xml"));
				String tagName = "test";
				Vector result = fixture.getProperty(tagName);
				assertNotNull(result);
				assertEquals(1, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("test", table.get("id"));
				assertEquals("test", table.get("test"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <ul>
		* <li>input: "test"</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testGetProperty_4() throws Exception {
				XMLParser fixture = new XMLParser(new File("test/osa/ora/server/utils/test.xml"));
				String tagName = "test";
				Vector result = fixture.getProperty(tagName);
				assertNotNull(result);
				assertEquals(1, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("test", table.get("id"));
				assertEquals("test", table.get("test"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <ul>
		* <li>input: "test"</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testGetProperty_5() throws Exception {
				XMLParser fixture = new XMLParser(new File("test/osa/ora/server/utils/test.xml"));
				String tagName = "test";
				Vector result = fixture.getProperty(tagName);
				assertNotNull(result);
				assertEquals(1, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("test", table.get("id"));
				assertEquals("test", table.get("test"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <ul>
		* <li>input: "test"</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testGetProperty_6() throws Exception {
				XMLParser fixture = new XMLParser(new File("test/osa/ora/server/utils/test.xml"));
				String tagName = "test";
				Vector result = fixture.getProperty(tagName);
				assertNotNull(result);
				assertEquals(1, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("test", table.get("id"));
				assertEquals("test", table.get("test"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <ul>
		* <li>input: "test"</li>
		* </ul>
		* @throws Exception
		*/
		@Test
		public void testGetProperty_7() throws Exception {
				XMLParser fixture = new XMLParser(new File("test/osa/ora/server/utils/test.xml"));
				String tagName = "test";
				Vector result = fixture.getProperty(tagName);
				assertNotNull(result);
				assertEquals(1, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("test", table.get("id"));
				assertEquals("test", table.get("test"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method