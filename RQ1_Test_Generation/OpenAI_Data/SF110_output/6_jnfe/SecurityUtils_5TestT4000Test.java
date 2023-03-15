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
* It contains ten unit test cases for the {@link SecurityUtils#openTrustStore(String, char[])} method.
*/
class SecurityUtils_5Test {

	/**
	* Test case for the {@link SecurityUtils#openTrustStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenTrustStore_1() throws Exception {
		String trustStorePath = null;
		char[] passphrase = "changeit".toCharArray();
		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openTrustStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenTrustStore_2() throws Exception {
		String trustStorePath = "";
		char[] passphrase = "changeit".toCharArray();
		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openTrustStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenTrustStore_3() throws Exception {
		String trustStorePath = "lib/security/";
		char[] passphrase = "changeit".toCharArray();
		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openTrustStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenTrustStore_4() throws Exception {
		String trustStorePath = "lib/security/cacerts";
		char[] passphrase = "changeit".toCharArray();
		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openTrustStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenTrustStore_5() throws Exception {
		String trustStorePath = "lib/security/cacerts";
		char[] passphrase = "changeit".toCharArray();
		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openTrustStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenTrustStore_6() throws Exception {
		String trustStorePath = "lib/security/cacerts";
		char[] passphrase = "changeit".toCharArray();
		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openTrustStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenTrustStore_7() throws Exception {
		String trustStorePath = "lib/security/cacerts";
		char[] passphrase = "changeit".toCharArray();
		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openTrustStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenTrustStore_8() throws Exception {
		String trustStorePath = "lib/security/cacerts";
		char[] passphrase = "changeit".toCharArray();
		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openTrustStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenTrustStore_9() throws Exception {
		String trustStorePath = "lib/security/cacerts";
		char[] passphrase = "changeit".toCharArray();
		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SecurityUtils#openTrustStore(String, char[])} method.
	*
	* @throws Exception
	*/
	@Test
	void testOpenTrustStore_10() throws Exception {
		String trustStorePath = "lib/security/cacerts";
		char[] passphrase = "changeit".toCharArray();
		KeyStore result = SecurityUtils.openTrustStore(trustStorePath, passphrase);
		assertNotNull(result);
	}
	
}