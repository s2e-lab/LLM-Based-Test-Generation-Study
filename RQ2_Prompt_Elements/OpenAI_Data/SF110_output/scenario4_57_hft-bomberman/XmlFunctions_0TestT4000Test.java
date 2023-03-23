// XmlFunctions_0Test.java
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
* It contains ten unit test cases for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_0Test {

	/**
	* Test case for {@link XmlFunctions#getXmlValue(String)}
	* with the following input values:
	* <ul>
	* 	<li>XmlPath = "//test/test1"</li>
	* </ul>
	*
	* @throws Exception
	* 	if an error occurs during the test
	*/
	@Test
	public void testGetXmlValue_0() throws Exception {
		// initialize test
		XmlFunctions fixture = new XmlFunctions("");
		String XmlPath = "//test/test1";
		
		// execute test
		String result = fixture.getXmlValue(XmlPath);
		
		// verify test result
		assertEquals("test1", result);
	}
	
	/**
	* Test case for {@link XmlFunctions#getXmlValue(String)}
	* with the following input values:
	* <ul>
	* 	<li>XmlPath = "//test/test2"</li>
	* </ul>
	*
	* @throws Exception
	* 	if an error occurs during the test
	*/
	@Test
	public void testGetXmlValue_1() throws Exception {
		// initialize test
		XmlFunctions fixture = new XmlFunctions("");
		String XmlPath = "//test/test2";
		
		// execute test
		String result = fixture.getXmlValue(XmlPath);
		
		// verify test result
		assertEquals("test2", result);
	}
	
	/**
	* Test case for {@link XmlFunctions#getXmlValue(String)}
	* with the following input values:
	* <ul>
	* 	<li>XmlPath = "//test/test3"</li>
	* </ul>
	*
	* @throws Exception
	* 	if an error occurs during the test
	*/
	@Test
	public void testGetXmlValue_2() throws Exception {
		// initialize test
		XmlFunctions fixture = new XmlFunctions("");
		String XmlPath = "//test/test3";
		
		// execute test
		String result = fixture.getXmlValue(XmlPath);
		
		// verify test result
		assertEquals("test3", result);
	}
	
	/**
	* Test case for {@link XmlFunctions#getXmlValue(String)}
	* with the following input values:
	* <ul>
	* 	<li>XmlPath = "//test/test4"</li>
	* </ul>
	*
	* @throws Exception
	* 	if an error occurs during the test
	*/
	@Test
	public void testGetXmlValue_3() throws Exception {
		// initialize test
		XmlFunctions fixture = new XmlFunctions("");
		String XmlPath = "//test/test4";
		
		// execute test
		String result = fixture.getXmlValue(XmlPath);
		
		// verify test result
		assertEquals("test4", result);
	}
	
	/**
	* Test case for {@link XmlFunctions#getXmlValue(String)}
	* with the following input values:
	* <ul>
	* 	<li>XmlPath = "//test/test5"</li>
	* </ul>
	*
	* @throws Exception
	* 	if an error occurs during the test
	*/
	@Test
	public void testGetXmlValue_4() throws Exception {
		// initialize test
		XmlFunctions fixture = new XmlFunctions("");
		String XmlPath = "//test/test5";
		
		// execute test
		String result = fixture.getXmlValue(XmlPath);
		
		// verify test result
		assertEquals("test5", result);
	}
	
	/**
	* Test case for {@link XmlFunctions#getXmlValue(String)}
	* with the following input values:
	* <ul>
	* 	<li>XmlPath = "//test/test6"</li>
	* </ul>
	*
	* @throws Exception
	* 	if an error occurs during the test
	*/
	@Test
	public void testGetXmlValue_5() throws Exception {
		// initialize test
		XmlFunctions fixture = new XmlFunctions("");
		String XmlPath = "//test/test6";
		
		// execute test
		String result = fixture.getXmlValue(XmlPath);
		
		// verify test result
		assertEquals("test6", result);
	}
	
	/**
	* Test case for {@link XmlFunctions#getXmlValue(String)}
	* with the following input values:
	* <ul>
	* 	<li>XmlPath = "//test/test7"</li>
	* </ul>
	*
	* @throws Exception
	* 	if an error occurs during the test
	*/
	@Test
	public void testGetXmlValue_6() throws Exception {
		// initialize test
		XmlFunctions fixture = new XmlFunctions("");
		String XmlPath = "//test/test7";
		
		// execute test
		String result = fixture.getXmlValue(XmlPath);
		
		// verify test result
		assertEquals("test7", result);
	}
	
	/**
	* Test case for {@link XmlFunctions#getXmlValue(String)}
	* with the following input values:
	* <ul>
	* 	<li>XmlPath = "//test/test8"</li>
	* </ul>
	*
	* @throws Exception
	* 	if an error occurs during the test
	*/
	@Test
	public void testGetXmlValue_7() throws Exception {
		// initialize test
		XmlFunctions fixture = new XmlFunctions("");
		String XmlPath = "//test/test8";
		
		// execute test
		String result = fixture.getXmlValue(XmlPath);
		
		// verify test result
		assertEquals("test8", result);
	}
	
	/**
	* Test case for {@link XmlFunctions#getXmlValue(String)}
	* with the following input values:
	* <ul>
	* 	<li>XmlPath = "//test/test9"</li>
	* </ul>
	*
	* @throws Exception
	* 	if an error occurs during the test
	*/
	@Test
	public void testGetXmlValue_8() throws Exception {
		// initialize test
		XmlFunctions fixture = new XmlFunctions("");
		String XmlPath = "//test/test9";
		
		// execute test
		String result = fixture.getXmlValue(XmlPath);
		
		// verify test result
		assertEquals("test9", result);
	}
	
	/**
	* Test case for {@link XmlFunctions#getXmlValue(String)}
	* with the following input values:
	* <ul>
	* 	<li>XmlPath = "//test/test10"</li>
	* </ul>
	*
	* @throws Exception
	* 	if an error occurs during the test
	*/
	@Test
	public void testGetXmlValue_9() throws Exception {
		// initialize test
		XmlFunctions fixture = new XmlFunctions("");
		String XmlPath = "//test/test10";
		
		// execute test
		String result = fixture.getXmlValue(XmlPath);
		
		// verify test result
		assertEquals("test10", result);
	}
	
}