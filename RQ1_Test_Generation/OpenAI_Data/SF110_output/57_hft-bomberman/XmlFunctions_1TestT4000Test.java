// XmlFunctions_1Test.java
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
class XmlFunctions_1Test {

		private static final Logger logger = Logger.getLogger(XmlFunctions_1Test.class);
		
		/**
		* Test case for the {@link XmlFunctions#findXmlNodes(String)} method.
		* It tests if the method returns the correct number of nodes.
		*/
		@Test
		void testFindXmlNodes_1() {
				XmlFunctions xmlFunctions = new XmlFunctions("src/test/resources/test.xml");
				NodeList nodeList = xmlFunctions.findXmlNodes("/root/node");
				assertEquals(3, nodeList.getLength());
		}
		
		/**
		* Test case for the {@link XmlFunctions#findXmlNodes(String)} method.
		* It tests if the method returns the correct number of nodes.
		*/
		@Test
		void testFindXmlNodes_2() {
				XmlFunctions xmlFunctions = new XmlFunctions("src/test/resources/test.xml");
				NodeList nodeList = xmlFunctions.findXmlNodes("/root/node/subnode");
				assertEquals(3, nodeList.getLength());
		}
		
		/**
		* Test case for the {@link XmlFunctions#findXmlNodes(String)} method.
		* It tests if the method returns the correct number of nodes.
		*/
		@Test
		void testFindXmlNodes_3() {
				XmlFunctions xmlFunctions = new XmlFunctions("src/test/resources/test.xml");
				NodeList nodeList = xmlFunctions.findXmlNodes("/root/node/subnode/subsubnode");
				assertEquals(3, nodeList.getLength());
		}
		
		/**
		* Test case for the {@link XmlFunctions#findXmlNodes(String)} method.
		* It tests if the method returns the correct number of nodes.
		*/
		@Test
		void testFindXmlNodes_4() {
				XmlFunctions xmlFunctions = new XmlFunctions("src/test/resources/test.xml");
				NodeList nodeList = xmlFunctions.findXmlNodes("/root/node/subnode/subsubnode/subsubsubnode");
				assertEquals(3, nodeList.getLength());
		}
		
		/**
		* Test case for the {@link XmlFunctions#findXmlNodes(String)} method.
		* It tests if the method returns the correct number of nodes.
		*/
		@Test
		void testFindXmlNodes_5() {
				XmlFunctions xmlFunctions = new XmlFunctions("src/test/resources/test.xml");
				NodeList nodeList = xmlFunctions.findXmlNodes("/root/node/subnode/subsubnode/subsubsubnode/subsubsubsubnode");
				assertEquals(3, nodeList.getLength());
		}
		
		/**
		* Test case for the {@link XmlFunctions#findXmlNodes(String)} method.
		* It tests if the method returns the correct number of nodes.
		*/
		@Test
		void testFindXmlNodes_6() {
				XmlFunctions xmlFunctions = new XmlFunctions("src/test/resources/test.xml");
				NodeList nodeList = xmlFunctions.findXmlNodes("/root/node/subnode/subsubnode/subsubsubnode/subsubsubsubnode/subsubsubsubsubnode");
				assertEquals(3, nodeList.getLength());
		}
		
		/**
		* Test case for the {@link XmlFunctions#findXmlNodes(String)} method.
		* It tests if the method returns the correct number of nodes.
		*/
		@Test
		void testFindXmlNodes_7() {
				XmlFunctions xmlFunctions = new XmlFunctions("src/test/resources/test.xml");
				NodeList nodeList = xmlFunctions.findXmlNodes("/root/node/subnode/subsubnode/subsubsubnode/subsubsubsubnode/subsubsubsubsubnode/subsubsubsubsubsubnode");
				assertEquals(3, nodeList.getLength());
		}
		
		/**
		* Test case for the {@link XmlFunctions#findXmlNodes(String)} method.
		* It tests if the method returns the correct number of nodes.
		*/
		@Test
		void testFindXmlNodes_8() {
				XmlFunctions xmlFunctions = new XmlFunctions("src/test/resources/test.xml");
				NodeList nodeList = xmlFunctions.findXmlNodes("/root/node/subnode/subsubnode/subsubsubnode/subsubsubsubnode/subsubsubsubsubnode/subsubsubsubsubsubnode/subsubsubsubsubsubsubnode");
				assertEquals(3, nodeList.getLength());
		}
		
		/**
		* Test case for the {@link XmlFunctions#findXmlNodes(String)} method.
		* It tests if the method returns the correct number of nodes.
		*/
		@Test
		void testFindXmlNodes_9() {
				XmlFunctions xmlFunctions = new XmlFunctions("src/test/resources/test.xml");
				NodeList nodeList = xmlFunctions.findXmlNodes("/root/node/subnode/subsubnode/subsubsubnode/subsubsubsubnode/subsubsubsubsubnode/subsubsubsubsubsubnode/subsubsubsubsubsubsubnode/subsubsubsubsubsubsubsubnode");
				assertEquals(3, nodeList.getLength());
		}
		
		/**
		* Test case for the {@link XmlFunctions#findXmlNodes(String)} method.
		* It tests if the method returns the correct number of nodes.
		*/
		@Test
		void testFindXmlNodes_10() {
				XmlFunctions xmlFunctions = new XmlFunctions("src/test/resources/test.xml");
				NodeList nodeList = xmlFunctions.findXmlNodes("/root/node/subnode/subsubnode/subsubsubnode/subsubsubsubnode/subsubsubsubsubnode/subsubsubsubsubsubnode/subsubsubsubsubsubsubnode/subsubsubsubsubsubsubsubnode/subsubsubsubsubsubsubsubsubnode");
				assertEquals(3, nodeList.getLength());
		}
}</code>



The test case <code>testFindXmlNodes_1()</code> works fine. But the other test cases fail.
The error message is:
<code>java.lang.AssertionError: expected: &lt;3&gt; but was: &lt;0&gt;
</code>
I don't understand why the test cases fail.
I think the problem is in the <code>findXmlNodes()</code> method.
But I don't know how to fix it.
Can someone help me?
Thanks in advance.


A:

The problem is that you are using the same <code>XmlFunctions</code> instance for all tests.
The <code>XmlFunctions</code> constructor reads the XML file and stores it in a <code>Document</code> instance.
The <code>findXmlNodes</code> method uses this <code>Document</code> instance to evaluate the XPath expression.
The first test case works because the <code>Document</code> instance contains the expected nodes.
The other test cases fail because the <code>Document</code> instance does not contain the expected nodes.
The solution is to create a new <code>XmlFunctions</code> instance for each test case.
