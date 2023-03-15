// DefaultDataMode_1Test.java
package org.quickserver.util.xmlreader;

import org.quickserver.net.server.DataMode;
import org.quickserver.net.server.DataType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataMode}.
* It contains ten unit test cases for the {@link DefaultDataMode#toXML(String)} method.
*/
class DefaultDataMode_1Test {

	@Test
	void testToXML_1() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.STRING, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>STRING</data-type-in>\n" +
				"\t<data-type-out>STRING</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_2() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>BYTE</data-type-in>\n" +
				"\t<data-type-out>BYTE</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_3() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>OBJECT</data-type-in>\n" +
				"\t<data-type-out>OBJECT</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_4() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>BINARY</data-type-in>\n" +
				"\t<data-type-out>BINARY</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_5() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>STRING</data-type-in>\n" +
				"\t<data-type-out>BYTE</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_6() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>STRING</data-type-in>\n" +
				"\t<data-type-out>OBJECT</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_7() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>STRING</data-type-in>\n" +
				"\t<data-type-out>BINARY</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_8() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.STRING, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>BYTE</data-type-in>\n" +
				"\t<data-type-out>STRING</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_9() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>BYTE</data-type-in>\n" +
				"\t<data-type-out>OBJECT</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_10() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>BYTE</data-type-in>\n" +
				"\t<data-type-out>BINARY</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
}

// DefaultDataMode_2Test.java
package org.quickserver.util.xmlreader;

import org.quickserver.net.server.DataMode;
import org.quickserver.net.server.DataType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataMode}.
* It contains ten unit test cases for the {@link DefaultDataMode#toXML(String)} method.
*/
class DefaultDataMode_2Test {
		
	@Test
	void testToXML_1() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.STRING, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>STRING</data-type-in>\n" +
				"\t<data-type-out>STRING</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_2() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>BYTE</data-type-in>\n" +
				"\t<data-type-out>BYTE</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_3() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>OBJECT</data-type-in>\n" +
				"\t<data-type-out>OBJECT</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_4() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>BINARY</data-type-in>\n" +
				"\t<data-type-out>BINARY</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_5() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>STRING</data-type-in>\n" +
				"\t<data-type-out>BYTE</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_6() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>STRING</data-type-in>\n" +
				"\t<data-type-out>OBJECT</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_7() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>STRING</data-type-in>\n" +
				"\t<data-type-out>BINARY</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_8() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.STRING, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>BYTE</data-type-in>\n" +
				"\t<data-type-out>STRING</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_9() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>BYTE</data-type-in>\n" +
				"\t<data-type-out>OBJECT</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
	
	@Test
	void testToXML_10() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		String expected = "<default-data-mode>\n" +
				"\t<data-type-in>BYTE</data-type-in>\n" +
				"\t<data-type-out>BINARY</data-type-out>\n" +
				"</default-data-mode>\n";
		assertEquals(expected, defaultDataMode.toXML(null));
	}
}

// DefaultDataMode_3Test.java
package org.quickserver.util.xmlreader;

import org.quickserver.net.server.DataMode;
import org.quickserver.net.server.DataType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataMode}.
