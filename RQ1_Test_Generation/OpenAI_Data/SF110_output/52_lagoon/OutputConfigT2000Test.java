// OutputConfigTest.java
package nu.staldal.xodus;

import java.util.*;
import javax.xml.transform.OutputKeys;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputConfig}.
* It contains ten unit test cases for the {@link OutputConfig#createOutputConfig(Properties)} method.
*/
class OutputConfigTest {

	/**
	* Test case 1.
	* Test method: {@link OutputConfig#createOutputConfig(Properties)}.
	* Test data: {@code null}.
	* Expected result: {@code IllegalArgumentException}.
	*/
	@Test
	void testCreateOutputConfig_1() {
		Properties outputProps = null;
		assertThrows(IllegalArgumentException.class, () -> {
			OutputConfig.createOutputConfig(outputProps);
		});
	}
	
	/**
	* Test case 2.
	* Test method: {@link OutputConfig#createOutputConfig(Properties)}.
	* Test data: {@code empty}.
	* Expected result: {@code IllegalArgumentException}.
	*/
	@Test
	void testCreateOutputConfig_2() {
		Properties outputProps = new Properties();
		assertThrows(IllegalArgumentException.class, () -> {
			OutputConfig.createOutputConfig(outputProps);
		});
	}
	
	/**
	* Test case 3.
	* Test method: {@link OutputConfig#createOutputConfig(Properties)}.
	* Test data: {@code method=xml}.
	* Expected result: {@code OutputConfig}.
	*/
	@Test
	void testCreateOutputConfig_3() {
		Properties outputProps = new Properties();
		outputProps.setProperty(OutputKeys.METHOD, "xml");
		OutputConfig outputConfig = OutputConfig.createOutputConfig(outputProps);
		assertEquals("xml", outputConfig.method);
		assertFalse(outputConfig.isXhtml);
		assertFalse(outputConfig.isText);
		assertFalse(outputConfig.isHtml);
		assertEquals("1.0", outputConfig.version);
		assertEquals("UTF-8", outputConfig.encoding);
		assertEquals(0, outputConfig.omit_xml_declaration);
		assertFalse(outputConfig.standalone);
		assertNull(outputConfig.doctype_public);
		assertNull(outputConfig.doctype_system);
		assertEquals(Collections.EMPTY_SET, outputConfig.cdata_section_elements);
		assertFalse(outputConfig.indent);
		assertEquals("text/xml", outputConfig.media_type);
	}
	
	/**
	* Test case 4.
	* Test method: {@link OutputConfig#createOutputConfig(Properties)}.
	* Test data: {@code method=xhtml}.
	* Expected result: {@code OutputConfig}.
	*/
	@Test
	void testCreateOutputConfig_4() {
		Properties outputProps = new Properties();
		outputProps.setProperty(OutputKeys.METHOD, "xhtml");
		OutputConfig outputConfig = OutputConfig.createOutputConfig(outputProps);
		assertEquals("xhtml", outputConfig.method);
		assertTrue(outputConfig.isXhtml);
		assertFalse(outputConfig.isText);
		assertFalse(outputConfig.isHtml);
		assertEquals("1.0", outputConfig.version);
		assertEquals("UTF-8", outputConfig.encoding);
		assertEquals(0, outputConfig.omit_xml_declaration);
		assertFalse(outputConfig.standalone);
		assertNull(outputConfig.doctype_public);
		assertNull(outputConfig.doctype_system);
		assertEquals(Collections.EMPTY_SET, outputConfig.cdata_section_elements);
		assertFalse(outputConfig.indent);
		assertEquals("text/html", outputConfig.media_type);
	}
	
	/**
	* Test case 5.
	* Test method: {@link OutputConfig#createOutputConfig(Properties)}.
	* Test data: {@code method=text}.
	* Expected result: {@code OutputConfig}.
	*/
	@Test
	void testCreateOutputConfig_5() {
		Properties outputProps = new Properties();
		outputProps.setProperty(OutputKeys.METHOD, "text");
		OutputConfig outputConfig = OutputConfig.createOutputConfig(outputProps);
		assertEquals("text", outputConfig.method);
		assertFalse(outputConfig.isXhtml);
		assertTrue(outputConfig.isText);
		assertFalse(outputConfig.isHtml);
		assertEquals("1.0", outputConfig.version);
		assertEquals("iso-8859-1", outputConfig.encoding);
		assertEquals(0, outputConfig.omit_xml_declaration);
		assertFalse(outputConfig.standalone);
		assertNull(outputConfig.doctype_public);
		assertNull(outputConfig.doctype_system);
		assertEquals(Collections.EMPTY_SET, outputConfig.cdata_section_elements);
		assertFalse(outputConfig.indent);
		assertEquals("text/plain", outputConfig.media_type);
	}
	
	/**
	* Test case 6.
	* Test method: {@link OutputConfig#createOutputConfig(Properties)}.
	* Test data: {@code method=html}.
	* Expected result: {@code OutputConfig}.
	*/
	@Test
	void testCreateOutputConfig_6() {
		Properties outputProps = new Properties();
		outputProps.setProperty(OutputKeys.METHOD, "html");
		OutputConfig outputConfig = OutputConfig.createOutputConfig(outputProps);
		assertEquals("html", outputConfig.method);
		assertFalse(outputConfig.isXhtml);
		assertFalse(outputConfig.isText);
		assertTrue(outputConfig.isHtml);
		assertEquals("4.0", outputConfig.version);
		assertEquals("iso-8859-1", outputConfig.encoding);
		assertEquals(0, outputConfig.omit_xml_declaration);
		assertFalse(outputConfig.standalone);
		assertNull(outputConfig.doctype_public);
		assertNull(outputConfig.doctype_system);
		assertEquals(Collections.EMPTY_SET, outputConfig.cdata_section_elements);
		assertFalse(outputConfig.indent);
		assertEquals("text/html", outputConfig.media_type);
	}
	
	/**
	* Test case 7.
	* Test method: {@link OutputConfig#createOutputConfig(Properties)}.
	* Test data: {@code method=unknown}.
	* Expected result: {@code IllegalArgumentException}.
	*/
	@Test
	void testCreateOutputConfig_7() {
		Properties outputProps = new Properties();
		outputProps.setProperty(OutputKeys.METHOD, "unknown");
		assertThrows(IllegalArgumentException.class, () -> {
			OutputConfig.createOutputConfig(outputProps);
		});
	}
	
	/**
	* Test case 8.
	* Test method: {@link OutputConfig#createOutputConfig(Properties)}.
	* Test data: {@code method=xml, version=1.1}.
	* Expected result: {@code OutputConfig}.
	*/
	@Test
	void testCreateOutputConfig_8() {
		Properties outputProps = new Properties();
		outputProps.setProperty(OutputKeys.METHOD, "xml");
		outputProps.setProperty(OutputKeys.VERSION, "1.1");
		OutputConfig outputConfig = OutputConfig.createOutputConfig(outputProps);
		assertEquals("xml", outputConfig.method);
		assertFalse(outputConfig.isXhtml);
		assertFalse(outputConfig.isText);
		assertFalse(outputConfig.isHtml);
		assertEquals("1.1", outputConfig.version);
		assertEquals("UTF-8", outputConfig.encoding);
		assertEquals(0, outputConfig.omit_xml_declaration);
		assertFalse(outputConfig.stand