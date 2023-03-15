// DOMNFeFileReader_1Test.java
package br.com.jnfe.base.service;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DOMNFeFileReader}.
* It contains ten unit test cases for the {@link DOMNFeFileReader#loadAndSign(InputStream, String)} method.
*/
class DOMNFeFileReader_1Test {

	/**
	* Test case 1.
	*
	* @throws Exception
	*/
	@Test
	void testLoadAndSign_1() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	/**
	* Test case 2.
	*
	* @throws Exception
	*/
	@Test
	void testLoadAndSign_2() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	/**
	* Test case 3.
	*
	* @throws Exception
	*/
	@Test
	void testLoadAndSign_3() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	/**
	* Test case 4.
	*
	* @throws Exception
	*/
	@Test
	void testLoadAndSign_4() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	/**
	* Test case 5.
	*
	* @throws Exception
	*/
	@Test
	void testLoadAndSign_5() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	/**
	* Test case 6.
	*
	* @throws Exception
	*/
	@Test
	void testLoadAndSign_6() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	/**
	* Test case 7.
	*
	* @throws Exception
	*/
	@Test
	void testLoadAndSign_7() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	/**
	* Test case 8.
	*
	* @throws Exception
	*/
	@Test
	void testLoadAndSign_8() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	/**
	* Test case 9.
	*
	* @throws Exception
	*/
	@Test
	void testLoadAndSign_9() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	/**
	* Test case 10.
	*
	* @throws Exception
	*/
	@Test
	void testLoadAndSign_10() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
}