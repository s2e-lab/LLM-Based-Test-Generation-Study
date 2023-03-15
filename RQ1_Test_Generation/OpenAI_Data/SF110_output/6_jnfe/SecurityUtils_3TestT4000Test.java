// SecurityUtils_3Test.java
package br.com.jnfe.base.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SecurityUtils}.
* It contains ten unit test cases for the {@link SecurityUtils#openStore(String, char[])} method.
*/
class SecurityUtils_3Test {

	private static final Logger logger = LoggerFactory.getLogger(SecurityUtils_3Test.class);
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_1() throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_2() throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_3() throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_4() throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_5() throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_6() throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_7() throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_8() throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_9() throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_10() throws Exception {
		String storeLocation = "";
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(storeLocation, passphrase);
		assertNotNull(result);
	}
	
}

// SecurityUtils_4Test.java
package br.com.jnfe.base.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SecurityUtils}.
* It contains ten unit test cases for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
*/
class SecurityUtils_4Test {
		
	private static final Logger logger = LoggerFactory.getLogger(SecurityUtils_4Test.class);
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_1() throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_2() throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_3() throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_4() throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_5() throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_6() throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_7() throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_8() throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_9() throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_10() throws Exception {
		String keyStoreType = "";
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
}

// SecurityUtils_5Test.java
package br.com.jnfe.base.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SecurityUtils}.
* It contains ten unit test cases for the {@link SecurityUtils#openStore(Resource, char[])} method.
*/
class SecurityUtils_5Test {
		
	private static final Logger logger = LoggerFactory.getLogger(SecurityUtils_5Test.class);
	
	/**
	* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_1() throws Exception {
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_2() throws Exception {
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_3() throws Exception {
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_4() throws Exception {
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_5() throws Exception {
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_6() throws Exception {
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_7() throws Exception {
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_8() throws Exception {
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenStore_9() throws Exception {
		Resource keyStoreResource = null;
		char[] passphrase = new char[0];
		KeyStore result = SecurityUtils.open