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
				Resource keyStoreResource = new FileSystemResource("/home/jnfe/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/jnfe-2.0.0/