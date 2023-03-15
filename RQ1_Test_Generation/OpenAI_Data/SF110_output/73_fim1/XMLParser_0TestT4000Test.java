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
		* <pre>
		* <?xml version="1.0" encoding="UTF-8"?>
		* <data>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* </data>
		* </pre>
		*/
		@Test
		public void testGetProperty_0() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test/osa/ora/server/utils/XMLParser_0Test_testGetProperty_0.xml"));
				Vector result = xmlParser.getProperty("tagName");
				assertEquals(1, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <pre>
		* <?xml version="1.0" encoding="UTF-8"?>
		* <data>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* </data>
		* </pre>
		*/
		@Test
		public void testGetProperty_1() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test/osa/ora/server/utils/XMLParser_0Test_testGetProperty_1.xml"));
				Vector result = xmlParser.getProperty("tagName");
				assertEquals(2, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
				table = (Hashtable) result.elementAt(1);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <pre>
		* <?xml version="1.0" encoding="UTF-8"?>
		* <data>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* </data>
		* </pre>
		*/
		@Test
		public void testGetProperty_2() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test/osa/ora/server/utils/XMLParser_0Test_testGetProperty_2.xml"));
				Vector result = xmlParser.getProperty("tagName");
				assertEquals(3, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
				table = (Hashtable) result.elementAt(1);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
				table = (Hashtable) result.elementAt(2);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <pre>
		* <?xml version="1.0" encoding="UTF-8"?>
		* <data>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* </data>
		* </pre>
		*/
		@Test
		public void testGetProperty_3() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test/osa/ora/server/utils/XMLParser_0Test_testGetProperty_3.xml"));
				Vector result = xmlParser.getProperty("tagName");
				assertEquals(4, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
				table = (Hashtable) result.elementAt(1);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
				table = (Hashtable) result.elementAt(2);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
				table = (Hashtable) result.elementAt(3);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <pre>
		* <?xml version="1.0" encoding="UTF-8"?>
		* <data>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* </data>
		* </pre>
		*/
		@Test
		public void testGetProperty_4() throws Exception {
				XMLParser xmlParser = new XMLParser(new File("test/osa/ora/server/utils/XMLParser_0Test_testGetProperty_4.xml"));
				Vector result = xmlParser.getProperty("tagName");
				assertEquals(5, result.size());
				Hashtable table = (Hashtable) result.elementAt(0);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
				table = (Hashtable) result.elementAt(1);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
				table = (Hashtable) result.elementAt(2);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
				table = (Hashtable) result.elementAt(3);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
				table = (Hashtable) result.elementAt(4);
				assertEquals("id", table.get("id"));
				assertEquals("val1", table.get("element1"));
				assertEquals("val1", table.get("element2"));
				assertEquals("val1", table.get("element3"));
		}
		
		/**
		* Test case for the {@link XMLParser#getProperty(String)} method.
		* This test case is for the following input:
		* <pre>
		* <?xml version="1.0" encoding="UTF-8"?>
		* <data>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<element2>val1</element2>
		* 		<element3>val1</element3>
		* 	</tagName>
		* 	<tagName id="id">
		* 		<element1>val1</element1>
		* 		<