// SecureTest.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Secure}.
* It contains ten unit test cases for the {@link Secure#toXML(String)} method.
*/
class SecureTest {

	@Test
	public void testToXML() {
		Secure secure = new Secure();
		String xml = secure.toXML("");
		assertEquals("<secure>\n"+
			"\t<enable>false</enable>\n"+
			"\t<load>false</load>\n"+
			"\t<protocol>TLS</protocol>\n"+
			"\t<client-auth-enable>false</client-auth-enable>\n"+
			"\t<secure-store>\n"+
			"\t\t<trust-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</trust-store>\n"+
			"\t\t<key-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</key-store>\n"+
			"\t</secure-store>\n"+
			"</secure>\n", xml);
		
		secure.setEnable(true);
		xml = secure.toXML("");
		assertEquals("<secure>\n"+
			"\t<enable>true</enable>\n"+
			"\t<load>true</load>\n"+
			"\t<protocol>TLS</protocol>\n"+
			"\t<client-auth-enable>false</client-auth-enable>\n"+
			"\t<secure-store>\n"+
			"\t\t<trust-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</trust-store>\n"+
			"\t\t<key-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</key-store>\n"+
			"\t</secure-store>\n"+
			"</secure>\n", xml);
		
		secure.setLoad(false);
		xml = secure.toXML("");
		assertEquals("<secure>\n"+
			"\t<enable>true</enable>\n"+
			"\t<load>false</load>\n"+
			"\t<protocol>TLS</protocol>\n"+
			"\t<client-auth-enable>false</client-auth-enable>\n"+
			"\t<secure-store>\n"+
			"\t\t<trust-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</trust-store>\n"+
			"\t\t<key-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</key-store>\n"+
			"\t</secure-store>\n"+
			"</secure>\n", xml);
		
		secure.setPort(1234);
		xml = secure.toXML("");
		assertEquals("<secure>\n"+
			"\t<enable>true</enable>\n"+
			"\t<load>false</load>\n"+
			"\t<port>1234</port>\n"+
			"\t<protocol>TLS</protocol>\n"+
			"\t<client-auth-enable>false</client-auth-enable>\n"+
			"\t<secure-store>\n"+
			"\t\t<trust-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</trust-store>\n"+
			"\t\t<key-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</key-store>\n"+
			"\t</secure-store>\n"+
			"</secure>\n", xml);
		
		secure.setProtocol("SSLv3");
		xml = secure.toXML("");
		assertEquals("<secure>\n"+
			"\t<enable>true</enable>\n"+
			"\t<load>false</load>\n"+
			"\t<port>1234</port>\n"+
			"\t<protocol>SSLv3</protocol>\n"+
			"\t<client-auth-enable>false</client-auth-enable>\n"+
			"\t<secure-store>\n"+
			"\t\t<trust-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</trust-store>\n"+
			"\t\t<key-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</key-store>\n"+
			"\t</secure-store>\n"+
			"</secure>\n", xml);
		
		secure.setClientAuthEnable(true);
		xml = secure.toXML("");
		assertEquals("<secure>\n"+
			"\t<enable>true</enable>\n"+
			"\t<load>false</load>\n"+
			"\t<port>1234</port>\n"+
			"\t<protocol>SSLv3</protocol>\n"+
			"\t<client-auth-enable>true</client-auth-enable>\n"+
			"\t<secure-store>\n"+
			"\t\t<trust-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</trust-store>\n"+
			"\t\t<key-store>\n"+
			"\t\t\t<file></file>\n"+
			"\t\t\t<password></password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</key-store>\n"+
			"\t</secure-store>\n"+
			"</secure>\n", xml);
		
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setFile("truststore.jks");
		trustStoreInfo.setPassword("truststorepass");
		trustStoreInfo.setType("JKS");
		
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setFile("keystore.jks");
		keyStoreInfo.setPassword("keystorepass");
		keyStoreInfo.setType("JKS");
		
		SecureStore secureStore = new SecureStore();
		secureStore.setTrustStore(trustStoreInfo);
		secureStore.setKeyStore(keyStoreInfo);
		
		secure.setSecureStore(secureStore);
		xml = secure.toXML("");
		assertEquals("<secure>\n"+
			"\t<enable>true</enable>\n"+
			"\t<load>false</load>\n"+
			"\t<port>1234</port>\n"+
			"\t<protocol>SSLv3</protocol>\n"+
			"\t<client-auth-enable>true</client-auth-enable>\n"+
			"\t<secure-store>\n"+
			"\t\t<trust-store>\n"+
			"\t\t\t<file>truststore.jks</file>\n"+
			"\t\t\t<password>truststorepass</password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</trust-store>\n"+
			"\t\t<key-store>\n"+
			"\t\t\t<file>keystore.jks</file>\n"+
			"\t\t\t<password>keystorepass</password>\n"+
			"\t\t\t<type>JKS</type>\n"+
			"\t\t</key-store>\n"+
			"\t</secure-store>\n"+
			"</secure>\n", xml);
	}
}

// SecureStore.java
/*
 * This file is part of the QuickServer library 
 * Copyright (C) QuickServer.org
 *
 * Use, modification, copying and distribution of this software is subject to
 * the terms and conditions of the GNU Lesser General Public License. 
 * You should have received a copy of the GNU LGP License along with this 
 * library; if not, you can download a copy from <http://www.quickserver.org/>.
 *
 * For questions, suggestions, bug-reports, enhancement-requests etc.
 * visit http://www.quickserver.org
 *
 */
package org.quickserver.util.xmlreader;

import java.util.*;

/**
 *  This class encapsulate the setting that help in configuring a secure socket
 *  based QuickServer.
 *  The example xml is <pre>
 * 	....
 * 	&lt;secure-store&gt;
 * 		&lt;trust-store&gt;
 * 			&lt;file&gt;&lt;/file&gt;
 * 			&lt;password&gt;&lt;/password&gt;
 * 			&lt;type&gt;JKS&lt;/type&gt;
 * 		&lt;/trust-store&gt;
 * 		&lt;key-store&gt;
 * 			&lt;file&gt;&lt;/file&gt;
 * 			&lt;password&gt;&lt;/password&gt;
 * 			&lt;type&gt;JKS&lt;/type&gt;
 * 		&lt;/key-store&gt;
 * 	&lt;/secure-store&gt;
 * 	....
 *  </pre>
 *  @see TrustStoreInfo
 *  @see KeyStoreInfo
 *  @author Akshathkumar Shetty
 *  @since 1.4
 */
public class SecureStore implements java.io.Serializable {

    private TrustStoreInfo trustStore = new TrustStoreInfo();

    private KeyStoreInfo keyStore = new KeyStoreInfo();

    /**
     * Sets TrustStore information.
     * XML Tag: &lt;trust-store&gt;&lt;/trust-store&gt;
     * @param trustStore TrustStore information
     * @see #getTrustStore
     */
    public void setTrustStore(TrustStoreInfo trustStore) {
        if (trustStore != null)
            this.trustStore = trustStore;
    }

    /**
     * Returns TrustStore information.
     * @see #setTrustStore
     */
    public TrustStoreInfo getTrustStore() {
        return trustStore;
    }

    /**
     * Sets KeyStore information.
     * XML Tag: &lt;key-store&gt;&lt;/key-store&gt;
     * @param keyStore KeyStore information
     * @see #getKeyStore
     */
    public void setKeyStore(KeyStoreInfo keyStore) {
        if (keyStore != null)
            this.keyStore = keyStore;
    }

    /**
     * Returns KeyStore information.
     * @see #setKeyStore
     */
    public KeyStoreInfo getKeyStore() {
        return keyStore;
    }

    /**
     * Returns XML config of this class.
     */
    public String toXML(String pad) {
        if (pad == null)
            pad = "";
        StringBuilder sb = new StringBuilder();
        sb.append(pad + "<secure-store>\n");
        if (getTrustStore() != null) {
            sb.append(getTrustStore().toXML(pad + "\t"));
        }
        if (getKeyStore() != null) {
            sb.append(getKeyStore().toXML(pad + "\t"));
        }
        sb.append(pad + "</secure-store>\n");
        return sb.toString();
    }
}

// SecureStoreTest.java
package org.quickserver.util.xmlreader;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SecureStore}.
* It contains ten unit test cases for the {@link SecureStore#toXML(String)} method.
*/
class SecureStoreTest {
		
	@Test
	public void testToXML() {
		SecureStore secureStore = new SecureStore();
		String xml = secureStore.toXML("");
		assertEquals("<secure-store>\n"+
			"\t<trust-store>\n"+
			"\t\t<file></file>\