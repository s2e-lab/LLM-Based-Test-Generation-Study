// KeyStoreInfoTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link KeyStoreInfo}.
* It contains ten unit test cases for the {@link KeyStoreInfo#toXML(String)} method.
*/
class KeyStoreInfoTest {

	@Test
	void testToXML() {
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		String expected = "<key-store-info>\n" +
				"\t<store-file>NONE</store-file>\n" +
				"\t<store-password></store-password>\n" +
				"\t<key-password></key-password>\n" +
				"</key-store-info>\n";
		assertEquals(expected, keyStoreInfo.toXML(""));
	}
	
	@Test
	void testToXML2() {
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		String expected = "    <key-store-info>\n" +
				"        <store-file>NONE</store-file>\n" +
				"        <store-password></store-password>\n" +
				"        <key-password></key-password>\n" +
				"    </key-store-info>\n";
		assertEquals(expected, keyStoreInfo.toXML("    "));
	}
	
	@Test
	void testToXML3() {
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		String expected = "        <key-store-info>\n" +
				"                <store-file>NONE</store-file>\n" +
				"                <store-password></store-password>\n" +
				"                <key-password></key-password>\n" +
				"        </key-store-info>\n";
		assertEquals(expected, keyStoreInfo.toXML("        "));
	}
	
	@Test
	void testToXML4() {
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		String expected = "                <key-store-info>\n" +
				"                        <store-file>NONE</store-file>\n" +
				"                        <store-password></store-password>\n" +
				"                        <key-password></key-password>\n" +
				"                </key-store-info>\n";
		assertEquals(expected, keyStoreInfo.toXML("                "));
	}
	
	@Test
	void testToXML5() {
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		String expected = "                        <key-store-info>\n" +
				"                                <store-file>NONE</store-file>\n" +
				"                                <store-password></store-password>\n" +
				"                                <key-password></key-password>\n" +
				"                        </key-store-info>\n";
		assertEquals(expected, keyStoreInfo.toXML("                        "));
	}
	
	@Test
	void testToXML6() {
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		String expected = "                                <key-store-info>\n" +
				"                                        <store-file>NONE</store-file>\n" +
				"                                        <store-password></store-password>\n" +
				"                                        <key-password></key-password>\n" +
				"                                </key-store-info>\n";
		assertEquals(expected, keyStoreInfo.toXML("                                "));
	}
	
	@Test
	void testToXML7() {
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		String expected = "                                        <key-store-info>\n" +
				"                                                <store-file>NONE</store-file>\n" +
				"                                                <store-password></store-password>\n" +
				"                                                <key-password></key-password>\n" +
				"                                        </key-store-info>\n";
		assertEquals(expected, keyStoreInfo.toXML("                                        "));
	}
	
	@Test
	void testToXML8() {
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		String expected = "                                                <key-store-info>\n" +
				"                                                        <store-file>NONE</store-file>\n" +
				"                                                        <store-password></store-password>\n" +
				"                                                        <key-password></key-password>\n" +
				"                                                </key-store-info>\n";
		assertEquals(expected, keyStoreInfo.toXML("                                                "));
	}
	
	@Test
	void testToXML9() {
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		String expected = "                                                        <key-store-info>\n" +
				"                                                                <store-file>NONE</store-file>\n" +
				"                                                                <store-password></store-password>\n" +
				"                                                                <key-password></key-password>\n" +
				"                                                        </key-store-info>\n";
		assertEquals(expected, keyStoreInfo.toXML("                                                        "));
	}
	
	@Test
	void testToXML10() {
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		String expected = "                                                                <key-store-info>\n" +
				"                                                                        <store-file>NONE</store-file>\n" +
				"                                                                        <store-password></store-password>\n" +
				"                                                                        <key-password></key-password>\n" +
				"                                                                </key-store-info>\n";
		assertEquals(expected, keyStoreInfo.toXML("                                                                "));
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class encapsulate Key Store and Trust Store.
 * The example xml is <pre>
 * 	....
 * 	&lt;secure-store&gt;
 * 		&lt;key-store-info&gt;
 * 			&lt;store-file&gt;NONE&lt;/store-file&gt;
 * 			&lt;store-password&gt;&lt;/store-password&gt;
 * 			&lt;key-password&gt;&lt;/key-password&gt;
 * 		&lt;/key-store-info&gt;
 * 		&lt;trust-store-info&gt;
 * 			&lt;store-file&gt;NONE&lt;/store-file&gt;
 * 			&lt;store-password&gt;&lt;/store-password&gt;
 * 		&lt;/trust-store-info&gt;
 * 	&lt;/secure-store&gt;
 * 	....
 *  </pre>
 *  @see KeyStoreInfo
 *  @see TrustStoreInfo
 *  @see Secure
 *  @author Akshathkumar Shetty
 *  @since 1.4
 */
public class SecureStore implements java.io.Serializable {

    private KeyStoreInfo keyStoreInfo = new KeyStoreInfo();

    private TrustStoreInfo trustStoreInfo = new TrustStoreInfo();

    private KeyStore keyStore = null;

    private KeyStore trustStore = null;

    /**
     * Sets the key store info.
     * XML Tag: &lt;key-store-info&gt;
     * @param keyStoreInfo key store info
     * @see #getKeyStoreInfo
     */
    public void setKeyStoreInfo(KeyStoreInfo keyStoreInfo) {
        if (keyStoreInfo != null)
            this.keyStoreInfo = keyStoreInfo;
    }

    /**
     * Returns the key store info.
     * @see #setKeyStoreInfo
     */
    public KeyStoreInfo getKeyStoreInfo() {
        return keyStoreInfo;
    }

    /**
     * Sets the trust store info.
     * XML Tag: &lt;trust-store-info&gt;
     * @param trustStoreInfo trust store info
     * @see #getTrustStoreInfo
     */
    public void setTrustStoreInfo(TrustStoreInfo trustStoreInfo) {
        if (trustStoreInfo != null)
            this.trustStoreInfo = trustStoreInfo;
    }

    /**
     * Returns the trust store info.
     * @see #setTrustStoreInfo
     */
    public TrustStoreInfo getTrustStoreInfo() {
        return trustStoreInfo;
    }

    /**
     * Returns the key store.
     * @see #setKeyStore
     */
    public KeyStore getKeyStore() {
        return keyStore;
    }

    /**
     * Sets the key store.
     * @see #getKeyStore
     */
    public void setKeyStore(KeyStore keyStore) {
        this.keyStore = keyStore;
    }

    /**
     * Returns the trust store.
     * @see #setTrustStore
     */
    public KeyStore getTrustStore() {
        return trustStore;
    }

    /**
     * Sets the trust store.
     * @see #getTrustStore
     */
    public void setTrustStore(KeyStore trustStore) {
        this.trustStore = trustStore;
    }

    /**
     * Returns XML config of this class.
     */
    public String toXML(String pad) {
        if (pad == null)
            pad = "";
        StringBuilder sb = new StringBuilder();
        sb.append(pad).append("<secure-store>\n");
        sb.append(keyStoreInfo.toXML(pad + "\t"));
        sb.append(trustStoreInfo.toXML(pad + "\t"));
        sb.append(pad).append("</secure-store>\n");
        return sb.toString();
    }

    /**
     * Loads the key store and trust store.
     * @throws KeyStoreException if key store could not be loaded
     * @throws IOException if an I/O error occurs while saving this keystore
     * @throws NoSuchAlgorithmException if the algorithm used to check the integrity of the keystore cannot be found
     * @throws CertificateException if any of the certificates in the keystore could not be loaded
     */
    public void loadStore() throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
        if (keyStoreInfo.getStoreFile() != null &amp;&amp; keyStoreInfo.getStoreFile().trim().length() != 0) {
            keyStore = KeyStore.getInstance("JKS");
            File file = new File(keyStoreInfo.getStoreFile());
            if (file.exists() == false) {
                throw new FileNotFoundException("KeyStore file not found : " + file.getAbsolutePath());
            }
            FileInputStream fis = new FileInputStream(file);
            keyStore.load(fis, keyStoreInfo.getStorePassword().toCharArray());
            fis.close();
        }
        if (trustStoreInfo.getStoreFile() != null &amp;&amp; trustStoreInfo.getStoreFile().trim().length() != 0) {
            trustStore = KeyStore.getInstance("JKS");
            File file = new File(trustStoreInfo.getStoreFile());
            if (file.exists() == false) {
                throw new FileNotFoundException("TrustStore file not found : " + file.getAbsolutePath());
            }
            FileInputStream fis = new FileInputStream(file);
            trustStore.load(fis, trustStoreInfo.getStorePassword().toCharArray());
            fis.close();
        }
    }

    /**
     * Loads the key store and trust store.
     * @throws KeyStoreException if key store could not be loaded
     * @throws IOException if an I/O error occurs while saving this keystore
     * @throws NoSuchAlgorithmException if the algorithm used to check the integrity of the keystore cannot be found
     * @throws CertificateException if any of the certificates in the keystore could not be loaded
     */
    public void loadStore(Logger logger) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
        if (keyStoreInfo.getStoreFile() != null &amp;&amp; keyStoreInfo.getStoreFile().trim().length() != 0) {
            keyStore = KeyStore.getInstance("JKS");
            File file = new File(keyStoreInfo.getStoreFile());
            if (file.exists() == false) {
                throw new FileNotFoundException("KeyStore file not found : " + file.getAbsolutePath());
            }
            FileInputStream fis = new FileInputStream(file);
            keyStore.load(fis, keyStoreInfo.getStorePassword().toCharArray());
            fis.close();
            if (logger != null) {
                logger.log(Level.FINE, "Loaded KeyStore : {0}", file.getAbsolutePath());
            }
        }
        if (trustStoreInfo.getStoreFile() != null &amp;&amp; trustStoreInfo.getStoreFile().