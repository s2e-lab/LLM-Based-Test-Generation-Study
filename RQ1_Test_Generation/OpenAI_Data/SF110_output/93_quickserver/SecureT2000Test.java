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
		