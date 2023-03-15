// SecurityUtils_0Test.java
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
class SecurityUtils_0Test {

		private static final Logger logger = LoggerFactory.getLogger(SecurityUtils_0Test.class);
		
		/**
		* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_0() throws Exception {
				String keyStoreType = "JKS";
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
				KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
				assertNotNull(result);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openStore(String, Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_1() throws Exception {
				String keyStoreType = "JKS";
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				String keyStoreType = "JKS";
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				String keyStoreType = "JKS";
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				String keyStoreType = "JKS";
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				String keyStoreType = "JKS";
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				String keyStoreType = "JKS";
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				String keyStoreType = "JKS";
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				String keyStoreType = "JKS";
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				String keyStoreType = "JKS";
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
				KeyStore result = SecurityUtils.openStore(keyStoreType, keyStoreResource, passphrase);
				assertNotNull(result);
		}
		
}

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
		void testOpenStore_0() throws Exception {
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
				KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);
				assertNotNull(result);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openStore(Resource, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_1() throws Exception {
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
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
				Resource keyStoreResource = new FileSystemResource("/home/mauricio/certificados/certificado.jks");
				char[] passphrase = "changeit".toCharArray();
				KeyStore result = SecurityUtils.openStore(keyStoreResource, passphrase);
				assertNotNull(result);
		}
		
}

// SecurityUtils_2Test.java
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
* It contains ten unit test cases for the {@link SecurityUtils#openStore(String, String, char[])} method.
*/
class SecurityUtils_2Test {
		
		private static final Logger logger = LoggerFactory.getLogger(SecurityUtils_2Test.class);
		
		/**
		* Test case for the {@link SecurityUtils#openStore(String, String, char[])} method.
		*
		* @throws Exception
		*/
		@Test
		void testOpenStore_0() throws Exception {
				String keyStoreType = "JKS";
				String storeLocation = "/home/mauricio/certificados/certificado.jks";
				char[] passphrase = "changeit".toCharArray();
