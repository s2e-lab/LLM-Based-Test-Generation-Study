// SecureStoreManager_0Test.java
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
class SecureStoreManager_0Test {

		private static Logger logger = Logger.getLogger(SecureStoreManager_0Test.class.getName());
		
		private SensitiveInput sensitiveInput = null;
		
		/**
		* Loads KeyManagers. KeyManagers are responsible for managing
		* the key material which is used to authenticate the local
		* SSLSocket to its peer. Can return null.
		*/
		@Test
		public void loadKeyManagers_0() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
				secureStore.setKeyStoreInfo(keyStoreInfo);
				KeyManager[] result = new SecureStoreManager().loadKeyManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads KeyManagers. KeyManagers are responsible for managing
		* the key material which is used to authenticate the local
		* SSLSocket to its peer. Can return null.
		*/
		@Test
		public void loadKeyManagers_1() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
				secureStore.setKeyStoreInfo(keyStoreInfo);
				keyStoreInfo.setStoreFile("none");
				KeyManager[] result = new SecureStoreManager().loadKeyManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads KeyManagers. KeyManagers are responsible for managing
		* the key material which is used to authenticate the local
		* SSLSocket to its peer. Can return null.
		*/
		@Test
		public void loadKeyManagers_2() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
				secureStore.setKeyStoreInfo(keyStoreInfo);
				keyStoreInfo.setStoreFile("none");
				keyStoreInfo.setStorePassword("");
				KeyManager[] result = new SecureStoreManager().loadKeyManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads KeyManagers. KeyManagers are responsible for managing
		* the key material which is used to authenticate the local
		* SSLSocket to its peer. Can return null.
		*/
		@Test
		public void loadKeyManagers_3() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
				secureStore.setKeyStoreInfo(keyStoreInfo);
				keyStoreInfo.setStoreFile("none");
				keyStoreInfo.setStorePassword("");
				keyStoreInfo.setKeyPassword("");
				KeyManager[] result = new SecureStoreManager().loadKeyManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads KeyManagers. KeyManagers are responsible for managing
		* the key material which is used to authenticate the local
		* SSLSocket to its peer. Can return null.
		*/
		@Test
		public void loadKeyManagers_4() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
				secureStore.setKeyStoreInfo(keyStoreInfo);
				keyStoreInfo.setStoreFile("none");
				keyStoreInfo.setStorePassword("");
				keyStoreInfo.setKeyPassword("");
				secureStore.setType("JKS");
				KeyManager[] result = new SecureStoreManager().loadKeyManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads KeyManagers. KeyManagers are responsible for managing
		* the key material which is used to authenticate the local
		* SSLSocket to its peer. Can return null.
		*/
		@Test
		public void loadKeyManagers_5() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
				secureStore.setKeyStoreInfo(keyStoreInfo);
				keyStoreInfo.setStoreFile("none");
				keyStoreInfo.setStorePassword("");
				keyStoreInfo.setKeyPassword("");
				secureStore.setType("JKS");
				secureStore.setAlgorithm("SunX509");
				KeyManager[] result = new SecureStoreManager().loadKeyManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads KeyManagers. KeyManagers are responsible for managing
		* the key material which is used to authenticate the local
		* SSLSocket to its peer. Can return null.
		*/
		@Test
		public void loadKeyManagers_6() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
				secureStore.setKeyStoreInfo(keyStoreInfo);
				keyStoreInfo.setStoreFile("none");
				keyStoreInfo.setStorePassword("");
				keyStoreInfo.setKeyPassword("");
				secureStore.setType("JKS");
				secureStore.setAlgorithm("SunX509");
				secureStore.setProvider("SUN");
				KeyManager[] result = new SecureStoreManager().loadKeyManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads KeyManagers. KeyManagers are responsible for managing
		* the key material which is used to authenticate the local
		* SSLSocket to its peer. Can return null.
		*/
		@Test
		public void loadKeyManagers_7() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
				secureStore.setKeyStoreInfo(keyStoreInfo);
				keyStoreInfo.setStoreFile("none");
				keyStoreInfo.setStorePassword("");
				keyStoreInfo.setKeyPassword("");
				secureStore.setType("JKS");
				secureStore.setAlgorithm("SunX509");
				secureStore.setProvider("SUN");
				secureStore.setKeyStoreInfo(null);
				KeyManager[] result = new SecureStoreManager().loadKeyManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads KeyManagers. KeyManagers are responsible for managing
		* the key material which is used to authenticate the local
		* SSLSocket to its peer. Can return null.
		*/
		@Test
		public void loadKeyManagers_8() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
				secureStore.setKeyStoreInfo(keyStoreInfo);
				keyStoreInfo.setStoreFile("none");
				keyStoreInfo.setStorePassword("");
				keyStoreInfo.setKeyPassword("");
				secureStore.setType("JKS");
				secureStore.setAlgorithm("SunX509");
				secureStore.setProvider("SUN");
				secureStore.setKeyStoreInfo(null);
				secureStore.setSecureStore(null);
				KeyManager[] result = new SecureStoreManager().loadKeyManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads KeyManagers. KeyManagers are responsible for managing
		* the key material which is used to authenticate the local
		* SSLSocket to its peer. Can return null.
		*/
		@Test
		public void loadKeyManagers_9() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
				secureStore.setKeyStoreInfo(keyStoreInfo);
				keyStoreInfo.setStoreFile("none");
				keyStoreInfo.setStorePassword("");
				keyStoreInfo.setKeyPassword("");
				secureStore.setType("JKS");
				secureStore.setAlgorithm("SunX509");
				secureStore.setProvider("SUN");
				secureStore.setKeyStoreInfo(null);
				secureStore.setSecureStore(null);
				secureStore.setAlgorithm(null);
				KeyManager[] result = new SecureStoreManager().loadKeyManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads KeyManagers. KeyManagers are responsible for managing
		* the key material which is used to authenticate the local
		* SSLSocket to its peer. Can return null.
		*/
		@Test
		public void loadKeyManagers_10() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
				secureStore.setKeyStoreInfo(keyStoreInfo);
				keyStoreInfo.setStoreFile("none");
				keyStoreInfo.setStorePassword("");
				keyStoreInfo.setKeyPassword("");
				secureStore.setType("JKS");
				secureStore.setAlgorithm("SunX509");
				secureStore.setProvider("SUN");
				secureStore.setKeyStoreInfo(null);
				secureStore.setSecureStore(null);
				secureStore.setAlgorithm(null);
				secureStore.setProvider(null);
				KeyManager[] result = new SecureStoreManager().loadKeyManagers(config);
				assertNull(result);
		}
		
}

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
		@Test
		public void loadTrustManagers_0() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
				secureStore.setTrustStoreInfo(trustStoreInfo);
				TrustManager[] result = new SecureStoreManager().loadTrustManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads TrustManagers. TrustManagers are responsible for managing the
		* trust material that is used when making trust decisions, and for
		* deciding whether credentials presented by a peer should be accepted.
		* Can return null.
		*/
		@Test
		public void loadTrustManagers_1() throws GeneralSecurityException, IOException {
				QuickServerConfig config = new QuickServerConfig();
				Secure secure = new Secure();
				config.setSecure(secure);
				SecureStore secureStore = new SecureStore();
				secure.setSecureStore(secureStore);
				TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
				secureStore.setTrustStoreInfo(trustStoreInfo);
				trustStoreInfo.setStoreFile("none");
				TrustManager[] result = new SecureStoreManager().loadTrustManagers(config);
				assertNull(result);
		}
		
		/**
		* Loads TrustManagers. TrustManagers are responsible for managing the
		* trust material that is used when making trust decisions, and for
		* deciding whether credentials