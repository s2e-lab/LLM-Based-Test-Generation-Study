// DOMNFeFileReader_0Test.java
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
* It contains ten unit test cases for the {@link DOMNFeFileReader#loadAndSign(String, String)} method.
*/
class DOMNFeFileReader_0Test {

	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(String, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_0() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		Result result = domNFeFileReader.loadAndSign("/br/com/jnfe/base/service/nfe.xml", "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(String, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_1() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		Result result = domNFeFileReader.loadAndSign("/br/com/jnfe/base/service/nfe.xml", "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(String, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_2() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		Result result = domNFeFileReader.loadAndSign("/br/com/jnfe/base/service/nfe.xml", "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(String, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_3() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		Result result = domNFeFileReader.loadAndSign("/br/com/jnfe/base/service/nfe.xml", "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(String, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_4() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		Result result = domNFeFileReader.loadAndSign("/br/com/jnfe/base/service/nfe.xml", "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(String, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_5() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		Result result = domNFeFileReader.loadAndSign("/br/com/jnfe/base/service/nfe.xml", "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(String, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_6() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		Result result = domNFeFileReader.loadAndSign("/br/com/jnfe/base/service/nfe.xml", "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(String, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_7() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		Result result = domNFeFileReader.loadAndSign("/br/com/jnfe/base/service/nfe.xml", "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(String, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_8() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		Result result = domNFeFileReader.loadAndSign("/br/com/jnfe/base/service/nfe.xml", "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(String, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_9() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		Result result = domNFeFileReader.loadAndSign("/br/com/jnfe/base/service/nfe.xml", "infNFe");
		assertNotNull(result);
	}
	
}

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
	* Test case for the {@link DOMNFeFileReader#loadAndSign(InputStream, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_0() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		InputStreamSource resource = new ClassPathResource("/br/com/jnfe/base/service/nfe.xml");
		Result result = domNFeFileReader.loadAndSign(resource.getInputStream(), "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(InputStream, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_1() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		InputStreamSource resource = new ClassPathResource("/br/com/jnfe/base/service/nfe.xml");
		Result result = domNFeFileReader.loadAndSign(resource.getInputStream(), "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(InputStream, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_2() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		InputStreamSource resource = new ClassPathResource("/br/com/jnfe/base/service/nfe.xml");
		Result result = domNFeFileReader.loadAndSign(resource.getInputStream(), "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(InputStream, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_3() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		InputStreamSource resource = new ClassPathResource("/br/com/jnfe/base/service/nfe.xml");
		Result result = domNFeFileReader.loadAndSign(resource.getInputStream(), "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(InputStream, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_4() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		InputStreamSource resource = new ClassPathResource("/br/com/jnfe/base/service/nfe.xml");
		Result result = domNFeFileReader.loadAndSign(resource.getInputStream(), "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(InputStream, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_5() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		InputStreamSource resource = new ClassPathResource("/br/com/jnfe/base/service/nfe.xml");
		Result result = domNFeFileReader.loadAndSign(resource.getInputStream(), "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(InputStream, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_6() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		InputStreamSource resource = new ClassPathResource("/br/com/jnfe/base/service/nfe.xml");
		Result result = domNFeFileReader.loadAndSign(resource.getInputStream(), "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(InputStream, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_7() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		InputStreamSource resource = new ClassPathResource("/br/com/jnfe/base/service/nfe.xml");
		Result result = domNFeFileReader.loadAndSign(resource.getInputStream(), "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(InputStream, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_8() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		InputStreamSource resource = new ClassPathResource("/br/com/jnfe/base/service/nfe.xml");
		Result result = domNFeFileReader.loadAndSign(resource.getInputStream(), "infNFe");
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link DOMNFeFileReader#loadAndSign(InputStream, String)} method.
	*
	* @throws Exception
	*/
	@Test
	public void testLoadAndSign_9() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		InputStreamSource resource = new ClassPathResource("/br/com/jnfe/base/service/nfe.xml");
		Result result = domNFeFileReader.loadAndSign(resource.getInputStream(), "infNFe");
		assertNotNull(result);
	}
	
