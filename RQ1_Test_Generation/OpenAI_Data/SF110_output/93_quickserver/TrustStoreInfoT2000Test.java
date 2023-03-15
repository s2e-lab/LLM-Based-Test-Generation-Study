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
	