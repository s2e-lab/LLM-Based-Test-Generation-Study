// SecurityUtils_1Test.java
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
class SecurityUtils_1Test {

		private static final Logger logger = LoggerFactory.getLogger(SecurityUtils_1Test.class);
		
		/**
		* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_1() throws Exception {
				logger.debug("Executing test case for the openStore(Resource, char[]) method.");
				
				// Test data
				String keyStoreType = "JKS";
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/nfe.jks");
				char[] passphrase = "changeit".toCharArray();
				
				// Execute the method under test
				KeyStore keyStore = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
				
				// Verify the result
				assertNotNull(keyStore);
				assertEquals(keyStoreType, keyStore.getType());
		}
		
		/**
		* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_2() throws Exception {
				logger.debug("Executing test case for the openStore(Resource, char[]) method.");
				
				// Test data
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/nfe.jks");
				char[] passphrase = "changeit".toCharArray();
				
				// Execute the method under test
				KeyStore keyStore = SecurityUtils.openStore(keyStoreResource, passphrase);
				
				// Verify the result
				assertNotNull(keyStore);
				assertEquals("JKS", keyStore.getType());
		}
		
		/**
		* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_3() throws Exception {
				logger.debug("Executing test case for the openStore(Resource, char[]) method.");
				
				// Test data
				String keyStoreType = "JKS";
				String storeLocation = "/home/mauricio/certificados/nfe.jks";
				char[] passphrase = "changeit".toCharArray();
				
				// Execute the method under test
				KeyStore keyStore = SecurityUtils.openStore(keyStoreType, storeLocation, passphrase);
				
				// Verify the result
				assertNotNull(keyStore);
				assertEquals(keyStoreType, keyStore.getType());
		}
		
		/**
		* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_4() throws Exception {
				logger.debug("Executing test case for the openStore(Resource, char[]) method.");
				
				// Test data
				String storeLocation = "/home/mauricio/certificados/nfe.jks";
				char[] passphrase = "changeit".toCharArray();
				
				// Execute the method under test
				KeyStore keyStore = SecurityUtils.openStore(storeLocation, passphrase);
				
				// Verify the result
				assertNotNull(keyStore);
				assertEquals("JKS", keyStore.getType());
		}
		
		/**
		* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_5() throws Exception {
				logger.debug("Executing test case for the openStore(Resource, char[]) method.");
				
				// Test data
				char[] passphrase = "changeit".toCharArray();
				
				// Execute the method under test
				KeyStore keyStore = SecurityUtils.openTrustStore(passphrase);
				
				// Verify the result
				assertNotNull(keyStore);
				assertEquals("JKS", keyStore.getType());
		}
		
		/**
		* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_6() throws Exception {
				logger.debug("Executing test case for the openStore(Resource, char[]) method.");
				
				// Test data
				String trustStorePath = null;
				char[] passphrase = "changeit".toCharArray();
				
				// Execute the method under test
				KeyStore keyStore = SecurityUtils.openTrustStore(trustStorePath, passphrase);
				
				// Verify the result
				assertNotNull(keyStore);
				assertEquals("JKS", keyStore.getType());
		}
		
		/**
		* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_7() throws Exception {
				logger.debug("Executing test case for the openStore(Resource, char[]) method.");
				
				// Test data
				String certificateLocation = "/home/mauricio/certificados";
				String certificateName = "NFe";
				
				// Execute the method under test
				SecurityUtils.installCertificate(certificateLocation, certificateName);
				
				// Verify the result
				assertTrue(true);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_8() throws Exception {
				logger.debug("Executing test case for the openStore(Resource, char[]) method.");
				
				// Test data
				String trustStorePath = null;
				String certificateLocation = "/home/mauricio/certificados";
				String certificateName = "NFe";
				
				// Execute the method under test
				SecurityUtils.installCertificate(trustStorePath, certificateLocation, certificateName);
				
				// Verify the result
				assertTrue(true);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_9() throws Exception {
				logger.debug("Executing test case for the openStore(Resource, char[]) method.");
				
				// Test data
				String[] args = new String[3];
				args[0] = "NFe";
				args[1] = "/home/mauricio/certificados";
				args[2] = null;
				
				// Execute the method under test
				SecurityUtils.main(args);
				
				// Verify the result
				assertTrue(true);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_10() throws Exception {
				logger.debug("Executing test case for the openStore(Resource, char[]) method.");
				
				// Test data
				String[] args = new String[2];
				args[0] = "NFe";
				args[1] = "/home/mauricio/certificados";
				
				// Execute the method under test
				SecurityUtils.main(args);
				
				// Verify the result
				assertTrue(true);
		}
		
}