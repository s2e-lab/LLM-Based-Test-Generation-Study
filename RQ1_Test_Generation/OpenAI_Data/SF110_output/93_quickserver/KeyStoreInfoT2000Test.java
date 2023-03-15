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
 * Copyright (C) QuickServer