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
* It contains ten unit test cases for the {@link SecurityUtils#openTrustStore(char[])} method.
*/
class SecurityUtils_4Test {

		private static final Logger logger = LoggerFactory.getLogger(SecurityUtils_4Test.class);
		
		/**
		* Test case for the {@link SecurityUtils#openTrustStore(char[])} method.
		* It tests the case when the trustStorePath is null.
		*/
		@Test
		public void testOpenTrustStore_1() throws Exception {
				SecurityUtils.trustStorePath = null;
				KeyStore trustStore = SecurityUtils.openTrustStore(SecurityUtils.trustStorePassword.toCharArray());
				assertNotNull(trustStore);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openTrustStore(char[])} method.
		* It tests the case when the trustStorePath is not null.
		*/
		@Test
		public void testOpenTrustStore_2() throws Exception {
				SecurityUtils.trustStorePath = "";
				KeyStore trustStore = SecurityUtils.openTrustStore(SecurityUtils.trustStorePassword.toCharArray());
				assertNotNull(trustStore);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openTrustStore(char[])} method.
		* It tests the case when the trustStorePath is not null.
		*/
		@Test
		public void testOpenTrustStore_3() throws Exception {
				SecurityUtils.trustStorePath = "";
				KeyStore trustStore = SecurityUtils.openTrustStore(SecurityUtils.trustStorePath, SecurityUtils.trustStorePassword.toCharArray());
				assertNotNull(trustStore);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openTrustStore(char[])} method.
		* It tests the case when the trustStorePath is not null.
		*/
		@Test
		public void testOpenTrustStore_4() throws Exception {
				SecurityUtils.trustStorePath = "";
				KeyStore trustStore = SecurityUtils.openTrustStore(SecurityUtils.trustStorePath, SecurityUtils.trustStorePassword.toCharArray());
				assertNotNull(trustStore);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openTrustStore(char[])} method.
		* It tests the case when the trustStorePath is not null.
		*/
		@Test
		public void testOpenTrustStore_5() throws Exception {
				SecurityUtils.trustStorePath = "";
				KeyStore trustStore = SecurityUtils.openTrustStore(SecurityUtils.trustStorePath, SecurityUtils.trustStorePassword.toCharArray());
				assertNotNull(trustStore);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openTrustStore(char[])} method.
		* It tests the case when the trustStorePath is not null.
		*/
		@Test
		public void testOpenTrustStore_6() throws Exception {
				SecurityUtils.trustStorePath = "";
				KeyStore trustStore = SecurityUtils.openTrustStore(SecurityUtils.trustStorePath, SecurityUtils.trustStorePassword.toCharArray());
				assertNotNull(trustStore);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openTrustStore(char[])} method.
		* It tests the case when the trustStorePath is not null.
		*/
		@Test
		public void testOpenTrustStore_7() throws Exception {
				SecurityUtils.trustStorePath = "";
				KeyStore trustStore = SecurityUtils.openTrustStore(SecurityUtils.trustStorePath, SecurityUtils.trustStorePassword.toCharArray());
				assertNotNull(trustStore);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openTrustStore(char[])} method.
		* It tests the case when the trustStorePath is not null.
		*/
		@Test
		public void testOpenTrustStore_8() throws Exception {
				SecurityUtils.trustStorePath = "";
				KeyStore trustStore = SecurityUtils.openTrustStore(SecurityUtils.trustStorePath, SecurityUtils.trustStorePassword.toCharArray());
				assertNotNull(trustStore);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openTrustStore(char[])} method.
		* It tests the case when the trustStorePath is not null.
		*/
		@Test
		public void testOpenTrustStore_9() throws Exception {
				SecurityUtils.trustStorePath = "";
				KeyStore trustStore = SecurityUtils.openTrustStore(SecurityUtils.trustStorePath, SecurityUtils.trustStorePassword.toCharArray());
				assertNotNull(trustStore);
		}
		
		/**
		* Test case for the {@link SecurityUtils#openTrustStore(char[])} method.
		* It tests the case when the trustStorePath is not null.
		*/
		@Test
		public void testOpenTrustStore_10() throws Exception {
				SecurityUtils.trustStorePath = "";
				KeyStore trustStore = SecurityUtils.openTrustStore(SecurityUtils.trustStorePath, SecurityUtils.trustStorePassword.toCharArray());
				assertNotNull(trustStore);
		}
		
}