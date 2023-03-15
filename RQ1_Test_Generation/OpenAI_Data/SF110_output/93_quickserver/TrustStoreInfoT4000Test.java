// TrustStoreInfoTest.java
package org.quickserver.util.xmlreader;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TrustStoreInfo}.
* It contains ten unit test cases for the {@link TrustStoreInfo#toXML(String)} method.
*/
class TrustStoreInfoTest {

	@Test
	void testToXML() {
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("NONE");
		trustStoreInfo.setStorePassword("");
		trustStoreInfo.setType("JKS");
		trustStoreInfo.setProvider("SUN");
		String expected = "<trust-store-info>\n" +
				"\t<store-file>NONE</store-file>\n" +
				"\t<store-password></store-password>\n" +
				"\t<type>JKS</type>\n" +
				"\t<provider>SUN</provider>\n" +
				"</trust-store-info>\n";
		assertEquals(expected, trustStoreInfo.toXML(""));
	}
	
	@Test
	void testToXML2() {
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("NONE");
		trustStoreInfo.setStorePassword("");
		trustStoreInfo.setType("JKS");
		trustStoreInfo.setProvider("SUN");
		String expected = "    <trust-store-info>\n" +
				"        <store-file>NONE</store-file>\n" +
				"        <store-password></store-password>\n" +
				"        <type>JKS</type>\n" +
				"        <provider>SUN</provider>\n" +
				"    </trust-store-info>\n";
		assertEquals(expected, trustStoreInfo.toXML("    "));
	}
	
	@Test
	void testToXML3() {
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("NONE");
		trustStoreInfo.setStorePassword("");
		trustStoreInfo.setType("JKS");
		trustStoreInfo.setProvider("SUN");
		String expected = "        <trust-store-info>\n" +
				"            <store-file>NONE</store-file>\n" +
				"            <store-password></store-password>\n" +
				"            <type>JKS</type>\n" +
				"            <provider>SUN</provider>\n" +
				"        </trust-store-info>\n";
		assertEquals(expected, trustStoreInfo.toXML("        "));
	}
	
	@Test
	void testToXML4() {
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("NONE");
		trustStoreInfo.setStorePassword("");
		trustStoreInfo.setType("JKS");
		trustStoreInfo.setProvider("SUN");
		String expected = "            <trust-store-info>\n" +
				"                <store-file>NONE</store-file>\n" +
				"                <store-password></store-password>\n" +
				"                <type>JKS</type>\n" +
				"                <provider>SUN</provider>\n" +
				"            </trust-store-info>\n";
		assertEquals(expected, trustStoreInfo.toXML("            "));
	}
	
	@Test
	void testToXML5() {
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("NONE");
		trustStoreInfo.setStorePassword("");
		trustStoreInfo.setType("JKS");
		trustStoreInfo.setProvider("SUN");
		String expected = "                <trust-store-info>\n" +
				"                    <store-file>NONE</store-file>\n" +
				"                    <store-password></store-password>\n" +
				"                    <type>JKS</type>\n" +
				"                    <provider>SUN</provider>\n" +
				"                </trust-store-info>\n";
		assertEquals(expected, trustStoreInfo.toXML("                "));
	}
	
	@Test
	void testToXML6() {
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("NONE");
		trustStoreInfo.setStorePassword("");
		trustStoreInfo.setType("JKS");
		trustStoreInfo.setProvider("SUN");
		String expected = "                    <trust-store-info>\n" +
				"                        <store-file>NONE</store-file>\n" +
				"                        <store-password></store-password>\n" +
				"                        <type>JKS</type>\n" +
				"                        <provider>SUN</provider>\n" +
				"                    </trust-store-info>\n";
		assertEquals(expected, trustStoreInfo.toXML("                    "));
	}
	
	@Test
	void testToXML7() {
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("NONE");
		trustStoreInfo.setStorePassword("");
		trustStoreInfo.setType("JKS");
		trustStoreInfo.setProvider("SUN");
		String expected = "                        <trust-store-info>\n" +
				"                            <store-file>NONE</store-file>\n" +
				"                            <store-password></store-password>\n" +
				"                            <type>JKS</type>\n" +
				"                            <provider>SUN</provider>\n" +
				"                        </trust-store-info>\n";
		assertEquals(expected, trustStoreInfo.toXML("                        "));
	}
	
	@Test
	void testToXML8() {
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("NONE");
		trustStoreInfo.setStorePassword("");
		trustStoreInfo.setType("JKS");
		trustStoreInfo.setProvider("SUN");
		String expected = "                            <trust-store-info>\n" +
				"                                <store-file>NONE</store-file>\n" +
				"                                <store-password></store-password>\n" +
				"                                <type>JKS</type>\n" +
				"                                <provider>SUN</provider>\n" +
				"                            </trust-store-info>\n";
		assertEquals(expected, trustStoreInfo.toXML("                            "));
	}
	
	@Test
	void testToXML9() {
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("NONE");
		trustStoreInfo.setStorePassword("");
		trustStoreInfo.setType("JKS");
		trustStoreInfo.setProvider("SUN");
		String expected = "                                <trust-store-info>\n" +
				"                                    <store-file>NONE</store-file>\n" +
				"                                    <store-password></store-password>\n" +
				"                                    <type>JKS</type>\n" +
				"                                    <provider>SUN</provider>\n" +
				"                                </trust-store-info>\n";
		assertEquals(expected, trustStoreInfo.toXML("                                "));
	}
	
	@Test
	void testToXML10() {
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("NONE");
		trustStoreInfo.setStorePassword("");
		trustStoreInfo.setType("JKS");
		trustStoreInfo.setProvider("SUN");
		String expected = "                                    <trust-store-info>\n" +
				"                                        <store-file>NONE</store-file>\n" +
				"                                        <store-password></store-password>\n" +
				"                                        <type>JKS</type>\n" +
				"                                        <provider>SUN</provider>\n" +
				"                                    </trust-store-info>\n";
		assertEquals(expected, trustStoreInfo.toXML("                                    "));
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

/**
 * This class encapsulate SecureStore.
 * The example xml is <pre>
 * 	....
 * 	&lt;secure-store&gt;
 * 		&lt;key-store-info&gt;
 * 			&lt;store-file&gt;NONE&lt;/store-file&gt;
 * 			&lt;store-password&gt;&lt;/store-password&gt;
 * 			&lt;key-password&gt;&lt;/key-password&gt;
 * 			&lt;type&gt;JKS&lt;/type&gt;
 * 			&lt;provider&gt;SUN&lt;/provider&gt;
 * 		&lt;/key-store-info&gt;
 * 		&lt;trust-store-info&gt;
 * 			&lt;store-file&gt;NONE&lt;/store-file&gt;
 * 			&lt;store-password&gt;&lt;/store-password&gt;
 * 			&lt;type&gt;JKS&lt;/type&gt;
 * 			&lt;provider&gt;SUN&lt;/provider&gt;
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

    /**
     * Sets the key store info.
     * @param keyStoreInfo key store info.
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
     * @param trustStoreInfo trust store info.
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
}

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
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		keyStoreInfo.setType("JKS");
		keyStoreInfo.setProvider("SUN");
		secureStore.setKeyStoreInfo(keyStoreInfo);
		TrustStoreInfo trustStoreInfo = new TrustStoreInfo();
		trustStoreInfo.setStoreFile("NONE");
		trustStoreInfo.setStorePassword("");
		trustStoreInfo.setType("JKS");
		trustStoreInfo.setProvider("SUN");
		secureStore.setTrustStoreInfo(trustStoreInfo);
		String expected = "<secure-store>\n" +
				"\t<key-store-info>\n" +
				"\t\t<store-file>NONE</store-file>\n" +
				"\t\t<store-password></store-password>\n" +
				"\t\t<key-password></key-password>\n" +
				"\t\t<type>JKS</type>\n" +
				"\t\t<provider>SUN</provider>\n" +
				"\t</key-store-info>\n" +
				"\t<trust-store-info>\n" +
				"\t\t<store-file>NONE</store-file>\n" +
				"\t\t<store-password></store-password>\n" +
				"\t\t<type>JKS</type>\n" +
				"\t\t<provider>SUN</provider>\n" +
				"\t</trust-store-info>\n" +
				"</secure-store>\n";
		assertEquals(expected, secureStore.toXML(""));
	}
	
	@Test
	void testToXML2() {
		SecureStore secureStore = new SecureStore();
		KeyStoreInfo keyStoreInfo = new KeyStoreInfo();
		keyStoreInfo.setStoreFile("NONE");
		keyStoreInfo.setStorePassword("");
		keyStoreInfo.setKeyPassword("");
		keyStoreInfo