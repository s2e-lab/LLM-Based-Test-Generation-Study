// SecureStoreTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SecureStore}.
* It contains ten unit test cases for the {@link SecureStore#toXML(String)} method.
*/
class SecureStoreTest {

	@Test
	void testToXML() {
		SecureStore secureStore = new SecureStore();
		String xml = secureStore.toXML("");
		assertEquals("<secure-store>\n" + 
			"\t<type>JKS</type>\n" + 
			"\t<algorithm>SunX509</algorithm>\n" + 
			"\t<secure-store-manager>org.quickserver.security.SecureStoreManager</secure-store-manager>\n" + 
			"</secure-store>\n", xml);
	}
	
	@Test
	void testToXMLWithProvider() {
		SecureStore secureStore = new SecureStore();
		secureStore.setProvider("SUN");
		String xml = secureStore.toXML("");
		assertEquals("<secure-store>\n" + 
			"\t<type>JKS</type>\n" + 
			"\t<algorithm>SunX509</algorithm>\n" + 
			"\t<provider>SUN</provider>\n" + 
			"\t<secure-store-manager>org.quickserver.security.SecureStoreManager</secure-store-manager>\n" + 
			"</secure-store>\n", xml);
	}
	
	@Test
	void testToXMLWithKeyStoreInfo() {
		SecureStore secureStore = new SecureStore();
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("keystore.jks");
		keyStoreInfo.setStorePassword("changeit");
		keyStoreInfo.setKeyPassword("changeit");
		secureStore.setKeyStoreInfo(keyStoreInfo);
		String xml = secureStore.toXML("");
		assertEquals("<secure-store>\n" + 
			"\t<type>JKS</type>\n" + 
			"\t<algorithm>SunX509</algorithm>\n" + 
			"\t<key-store-info>\n" + 
			"\t\t<store-file>keystore.jks</store-file>\n" + 
			"\t\t<store-password>changeit</store-password>\n" + 
			"\t\t<key-password>changeit</key-password>\n" + 
			"\t</key-store-info>\n" + 
			"\t<secure-store-manager>org.quickserver.security.SecureStoreManager</secure-store-manager>\n" + 
			"</secure-store>\n", xml);
	}
	
	@Test
	void testToXMLWithTrustStoreInfo() {
		SecureStore secureStore = new SecureStore();
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("truststore.jks");
		trustStoreInfo.setStorePassword("changeit");
		secureStore.setTrustStoreInfo(trustStoreInfo);
		String xml = secureStore.toXML("");
		assertEquals("<secure-store>\n" + 
			"\t<type>JKS</type>\n" + 
			"\t<algorithm>SunX509</algorithm>\n" + 
			"\t<trust-store-info>\n" + 
			"\t\t<store-file>truststore.jks</store-file>\n" + 
			"\t\t<store-password>changeit</store-password>\n" + 
			"\t</trust-store-info>\n" + 
			"\t<secure-store-manager>org.quickserver.security.SecureStoreManager</secure-store-manager>\n" + 
			"</secure-store>\n", xml);
	}
	
	@Test
	void testToXMLWithSecureStoreManager() {
		SecureStore secureStore = new SecureStore();
		secureStore.setSecureStoreManager("org.quickserver.security.SecureStoreManager");
		String xml = secureStore.toXML("");
		assertEquals("<secure-store>\n" + 
			"\t<type>JKS</type>\n" + 
			"\t<algorithm>SunX509</algorithm>\n" + 
			"\t<secure-store-manager>org.quickserver.security.SecureStoreManager</secure-store-manager>\n" + 
			"</secure-store>\n", xml);
	}
	
	@Test
	void testToXMLWithAll() {
		SecureStore secureStore = new SecureStore();
		secureStore.setProvider("SUN");
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("keystore.jks");
		keyStoreInfo.setStorePassword("changeit");
		keyStoreInfo.setKeyPassword("changeit");
		secureStore.setKeyStoreInfo(keyStoreInfo);
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("truststore.jks");
		trustStoreInfo.setStorePassword("changeit");
		secureStore.setTrustStoreInfo(trustStoreInfo);
		secureStore.setSecureStoreManager("org.quickserver.security.SecureStoreManager");
		String xml = secureStore.toXML("");
		assertEquals("<secure-store>\n" + 
			"\t<type>JKS</type>\n" + 
			"\t<algorithm>SunX509</algorithm>\n" + 
			"\t<provider>SUN</provider>\n" + 
			"\t<key-store-info>\n" + 
			"\t\t<store-file>keystore.jks</store-file>\n" + 
			"\t\t<store-password>changeit</store-password>\n" + 
			"\t\t<key-password>changeit</key-password>\n" + 
			"\t</key-store-info>\n" + 
			"\t<trust-store-info>\n" + 
			"\t\t<store-file>truststore.jks</store-file>\n" + 
			"\t\t<store-password>changeit</store-password>\n" + 
			"\t</trust-store-info>\n" + 
			"\t<secure-store-manager>org.quickserver.security.SecureStoreManager</secure-store-manager>\n" + 
			"</secure-store>\n", xml);
	}
	
	@Test
	void testToXMLWithAllAndPad() {
		SecureStore secureStore = new SecureStore();
		secureStore.setProvider("SUN");
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("keystore.jks");
		keyStoreInfo.setStorePassword("changeit");
		keyStoreInfo.setKeyPassword("changeit");
		secureStore.setKeyStoreInfo(keyStoreInfo);
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("truststore.jks");
		trustStoreInfo.setStorePassword("changeit");
		secureStore.setTrustStoreInfo(trustStoreInfo);
		secureStore.setSecureStoreManager("org.quickserver.security.SecureStoreManager");
		String xml = secureStore.toXML("\t");
		assertEquals("\t<secure-store>\n" + 
		