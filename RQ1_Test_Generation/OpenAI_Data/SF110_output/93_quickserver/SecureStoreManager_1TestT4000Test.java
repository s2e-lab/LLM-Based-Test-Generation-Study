// SecureStoreManager_1Test.java
package org.quickserver.security;

import java.io.*;
import java.util.logging.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.util.io.*;
import javax.net.ssl.*;
import java.security.*;
import org.quickserver.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SecureStoreManager}.
* It contains ten unit test cases for the {@link SecureStoreManager#loadTrustManagers(QuickServerConfig)} method.
*/
class SecureStoreManager_1Test {

		private static Logger logger = Logger.getLogger(SecureStoreManager_1Test.class.getName());
		
		private SensitiveInput sensitiveInput = null;
		
		/**
		 * Loads TrustManagers. TrustManagers are responsible for managing the
		 * trust material that is used when making trust decisions, and for
		 * deciding whether credentials presented by a peer should be accepted.
		 * Can return null.
		 */
		public TrustManager[] loadTrustManagers(QuickServerConfig config) throws GeneralSecurityException, IOException {
				Secure secure = config.getSecure();
				SecureStore secureStore = secure.getSecureStore();
				TrustStoreInfo trustStoreInfo = secureStore.getTrustStoreInfo();
				if (trustStoreInfo == null) {
						return null;
				}
				logger.finest("Loading TrustManagers");
				String type = null;
				if (trustStoreInfo.getType() != null && trustStoreInfo.getType().trim().length() != 0)
						type = trustStoreInfo.getType();
				else
						type = secureStore.getType();
				String provider = null;
				if (trustStoreInfo.getProvider() != null && trustStoreInfo.getProvider().trim().length() != 0)
						provider = trustStoreInfo.getProvider();
				else
						provider = secureStore.getProvider();
				KeyStore ts = getKeyStoreForTrust(type, provider);
				char[] trustpass = null;
				if (trustStoreInfo.getStorePassword() != null) {
						logger.finest("TrustStore: Store password was present!");
						trustpass = trustStoreInfo.getStorePassword().toCharArray();
				} else {
						logger.finest("TrustStore: Store password was not set.. so asking!");
						if (sensitiveInput == null) {
								sensitiveInput = new SensitiveInput(config.getName() + " - Input Prompt");
						}
						trustpass = sensitiveInput.getInput("Store password for TrustStore");
						if (trustpass == null) {
								logger.finest("No password entered.. will pass null");
						}
				}
				InputStream trustStoreStream = null;
				try {
						if (trustStoreInfo.getStoreFile().equalsIgnoreCase("none") == false) {
								logger.finest("TrustStore location: " + ConfigReader.makeAbsoluteToConfig(trustStoreInfo.getStoreFile(), config));
								trustStoreStream = new FileInputStream(ConfigReader.makeAbsoluteToConfig(trustStoreInfo.getStoreFile(), config));
						}
						ts.load(trustStoreStream, trustpass);
						logger.finest("TrustStore loaded");
				} finally {
						if (trustStoreStream != null) {
								trustStoreStream.close();
								trustStoreStream = null;
						}
				}
				TrustManagerFactory tmf = TrustManagerFactory.getInstance(secureStore.getAlgorithm());
				tmf.init(ts);
				return tmf.getTrustManagers();
		}
		
		/**
		 * Generates a keystore object for the specified keystore type from
		 * the specified provider to be used for loading/storing trusted
		 * keys/certificates.
		 * @param type the type of keystore
		 * @param provider the name of the provider if <code>null</code> any
		 * provider package that implements this type of key may be given based
		 * on the priority.
		 */
		protected KeyStore getKeyStoreForTrust(String type, String provider) throws KeyStoreException, NoSuchProviderException {
				if (provider == null)
						return KeyStore.getInstance(type);
				return KeyStore.getInstance(type, provider);
		}
		
		/**
		 * Test case for {@link SecureStoreManager#loadTrustManagers(QuickServerConfig)} method.
		 * Test case for the scenario when the trustStoreInfo is null.
		 */
		@Test
		public void testLoadTrustManagers_1() throws Exception {
				QuickServerConfig config = new QuickServerConfig();
				SecureStoreManager secureStoreManager = new SecureStoreManager();
				TrustManager[] trustManagers = secureStoreManager.loadTrustManagers(config);
				assertNull(trustManagers);
		}
		
		/**
		 * Test case for {@link SecureStoreManager#loadTrustManagers(QuickServerConfig)} method.
		 * Test case for the scenario when the trustStoreInfo is not null.
		 */
		@Test
		public void testLoadTrustManagers_2() throws Exception {
				QuickServerConfig config = new QuickServerConfig();
				SecureStore secureStore = new SecureStore();
				TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
				secureStore.setTrustStoreInfo(trustStoreInfo);
				config.getSecure().setSecureStore(secureStore);
				SecureStoreManager secureStoreManager = new SecureStoreManager();
				TrustManager[] trustManagers = secureStoreManager.loadTrustManagers(config);
				assertNull(trustManagers);
		}
		
		/**
		 * Test case for {@link SecureStoreManager#loadTrustManagers(QuickServerConfig)} method.
		 * Test case for the scenario when the trustStoreInfo is not null.
		 */
		@Test
		public void testLoadTrustManagers_3() throws Exception {
				QuickServerConfig config = new QuickServerConfig();
				SecureStore secureStore = new SecureStore();
				TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
				trustStoreInfo.setStoreFile("none");
				secureStore.setTrustStoreInfo(trustStoreInfo);
				config.getSecure().setSecureStore(secureStore);
				SecureStoreManager secureStoreManager = new SecureStoreManager();
				TrustManager[] trustManagers = secureStoreManager.loadTrustManagers(config);
				assertNull(trustManagers);
		}
		
		/**
		 * Test case for {@link SecureStoreManager#loadTrustManagers(QuickServerConfig)} method.
		 * Test case for the scenario when the trustStoreInfo is not null.
		 */
		@Test
		public void testLoadTrustManagers_4() throws Exception {
				QuickServerConfig config = new QuickServerConfig();
				SecureStore secureStore = new SecureStore();
				TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
				trustStoreInfo.setStoreFile("none");
				trustStoreInfo.setStorePassword("password");
				secureStore.setTrustStoreInfo(trustStoreInfo);
				config.getSecure().setSecureStore(secureStore);
				SecureStoreManager secureStoreManager = new SecureStoreManager();
				TrustManager[] trustManagers = secureStoreManager.loadTrustManagers(config);
				assertNull(trustManagers);
		}
		
		/**
		 * Test case for {@link SecureStoreManager#loadTrustManagers(QuickServerConfig)} method.
		 * Test case for the scenario when the trustStoreInfo is not null.
		 */
		@Test
		public void testLoadTrustManagers_5() throws Exception {
				QuickServerConfig config = new QuickServerConfig();
				SecureStore secureStore = new SecureStore();
				TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
				trustStoreInfo.setStoreFile("none");
				trustStoreInfo.setStorePassword("password");
				trustStoreInfo.setType("type");
				secureStore.setTrustStoreInfo(trustStoreInfo);
				config.getSecure().setSecureStore(secureStore);
				SecureStoreManager secureStoreManager = new SecureStoreManager();
				TrustManager[] trustManagers = secureStoreManager.loadTrustManagers(config);
				assertNull(trustManagers);
		}
		
		/**
		 * Test case for {@link SecureStoreManager#loadTrustManagers(QuickServerConfig)} method.
		 * Test case for the scenario when the trustStoreInfo is not null.
		 */
		@Test
		public void testLoadTrustManagers_6() throws Exception {
				QuickServerConfig config = new QuickServerConfig();
				SecureStore secureStore = new SecureStore();
				TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
				trustStoreInfo.setStoreFile("none");
				trustStoreInfo.setStorePassword("password");
				trustStoreInfo.setType("type");
				trustStoreInfo.setProvider("provider");
				secureStore.setTrustStoreInfo(trustStoreInfo);
				config.getSecure().setSecureStore(secureStore);
				SecureStoreManager secureStoreManager = new SecureStoreManager();
				TrustManager[] trustManagers = secureStoreManager.loadTrustManagers(config);
				assertNull(trustManagers);
		}
		
		/**
		 * Test case for {@link SecureStoreManager#loadTrustManagers(QuickServerConfig)} method.
		 * Test case for the scenario when the trustStoreInfo is not null.
		 */
		@Test
		public void testLoadTrustManagers_7() throws Exception {
				QuickServerConfig config = new QuickServerConfig();
				SecureStore secureStore = new SecureStore();
				TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
				trustStoreInfo.setStoreFile("none");
				trustStoreInfo.setStorePassword("password");
				trustStoreInfo.setType("type");
				trustStoreInfo.setProvider("provider");
				secureStore.setTrustStoreInfo(trustStoreInfo);
				config.getSecure().setSecureStore(secureStore);
				SecureStoreManager secureStoreManager = new SecureStoreManager();
				TrustManager[] trustManagers = secureStoreManager.loadTrustManagers(config);
				assertNull(trustManagers);
		}
		
		/**
		 * Test case for {@link SecureStoreManager#loadTrustManagers(QuickServerConfig)} method.
		 * Test case for the scenario when the trustStoreInfo is not null.
		 */
		@Test
		public void testLoadTrustManagers_8() throws Exception {
				QuickServerConfig config = new QuickServerConfig();
				SecureStore secureStore = new SecureStore();
				TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
				trustStoreInfo.setStoreFile("none");
				trustStoreInfo.setStorePassword("password");
				trustStoreInfo.setType("type");
				trustStoreInfo.setProvider("provider");
				secureStore.setTrustStoreInfo(trustStoreInfo);
				config.getSecure().setSecureStore(secureStore);
				SecureStoreManager secureStoreManager = new SecureStoreManager();
				TrustManager[] trustManagers = secureStoreManager.loadTrustManagers(config);
				assertNull(trustManagers);
		}
		
		/**
		 * Test case for {@link SecureStoreManager#loadTrustManagers(QuickServerConfig)} method.
		 * Test case for the scenario when the trustStoreInfo is not null.
		 */
		@Test
		public void testLoadTrustManagers_9() throws Exception {
				QuickServerConfig config = new QuickServerConfig();
				SecureStore secureStore = new SecureStore();
				TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
				trustStoreInfo.setStoreFile("none");
				trustStoreInfo.setStorePassword("password");
				trustStoreInfo.setType("type");
				trustStoreInfo.setProvider("provider");
				secureStore.setTrustStoreInfo(trustStoreInfo);
				config.getSecure().setSecureStore(secureStore);
				SecureStoreManager secureStoreManager = new SecureStoreManager();
				TrustManager[] trustManagers = secureStoreManager.loadTrustManagers(config);
				assertNull(trustManagers);
		}
		
		/**
		 * Test case for {@link SecureStoreManager#loadTrustManagers(QuickServerConfig)} method.
		 * Test case for the scenario when the trustStoreInfo is not null.
		 */
		@Test
		public void testLoadTrustManagers_10() throws Exception {
				QuickServerConfig config = new QuickServerConfig();
				SecureStore secureStore = new SecureStore();
				TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
				trustStoreInfo.setStoreFile("none");
				trustStoreInfo.setStorePassword("password");
				trustStoreInfo.setType("type");
				trustStoreInfo.setProvider("provider");
				secureStore.setTrustStoreInfo(trustStoreInfo);
				config.getSecure().setSecureStore(secureStore);
				SecureStoreManager secureStoreManager = new SecureStoreManager();
				TrustManager[] trustManagers = secureStoreManager.loadTrustManagers(config);
				assertNull(trustManagers);
		}
		
}

// SecureStoreManager_2Test.java
package org.quickserver.security;

import java.io.*;
import java.util.logging.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.util.io.*;
import javax.net.ssl.*;
import java.security.*;
import org.quickserver.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SecureStoreManager}.
* It contains ten unit test cases for the {@link SecureStoreManager#loadKeyManagers(QuickServerConfig)} method.
*/
class SecureStoreManager_2Test {
		
		private static Logger logger = Logger.getLogger(SecureStoreManager_2Test.class.getName());
		
		private SensitiveInput sensitiveInput = null;
		
		/**
		 * Loads KeyManagers. KeyManagers are responsible for managing
		 * the key material which is used to authenticate the local
		 * SSLSocket to its peer. Can return null.
		 */
		public KeyManager[] loadKeyManagers(QuickServerConfig config) throws GeneralSecurityException, IOException {
				Secure secure = config.getSecure();
				SecureStore secureStore = secure.getSecureStore();
				if (secureStore == null) {
						logger.fine("SecureStore configuration not set! " + "So returning null for KeyManager");
						return null;
				}
				KeyStoreInfo keyStoreInfo = secureStore.getKeyStoreInfo();
				if (keyStoreInfo == null) {
						logger.fine("