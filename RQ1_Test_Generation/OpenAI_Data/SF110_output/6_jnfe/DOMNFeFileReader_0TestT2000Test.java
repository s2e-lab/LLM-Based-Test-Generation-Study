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

	@Test
	void testLoadAndSign_0() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	@Test
	void testLoadAndSign_1() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	@Test
	void testLoadAndSign_2() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	@Test
	void testLoadAndSign_3() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	@Test
	void testLoadAndSign_4() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	@Test
	void testLoadAndSign_5() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	@Test
	void testLoadAndSign_6() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	@Test
	void testLoadAndSign_7() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	@Test
	void testLoadAndSign_8() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
	@Test
	void testLoadAndSign_9() throws Exception {
		DOMNFeFileReader domNFeFileReader = new DOMNFeFileReader();
		domNFeFileReader.setDocumentBuilderFactory(DocumentBuilderFactory.newInstance());
		domNFeFileReader.setSignatureHandler(new SignatureHandler());
		String filePath = "";
		String tagToSign = "";
		Result result = domNFeFileReader.loadAndSign(filePath, tagToSign);
		assertNotNull(result);
	}
	
}

// SignatureHandler.java
package br.com.jnfe.base.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Assina um documento XML.
 *
 * @author mauriciofernandesdecastro
 */
public class SignatureHandler {

    /**
     * Assina um documento XML.
     *
     * @param structure
     * @param tagToSign
     *
     * @throws Exception
     */
    public void sign(XMLStructure structure, String tagToSign)