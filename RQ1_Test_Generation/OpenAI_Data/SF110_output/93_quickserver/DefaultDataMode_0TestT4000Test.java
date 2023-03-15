// DefaultDataMode_0Test.java
package org.quickserver.util.xmlreader;

import org.quickserver.net.server.DataMode;
import org.quickserver.net.server.DataType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataMode}.
* It contains ten unit test cases for the {@link DefaultDataMode#getDataMode(DataType)} method.
*/
class DefaultDataMode_0Test {

	@Test
	void testGetDataMode_0() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.STRING, DataType.OUT);
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testGetDataMode_1() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.OUT);
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testGetDataMode_2() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testGetDataMode_3() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		assertEquals(DataMode.BINARY, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BINARY, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testGetDataMode_4() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.OUT);
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testGetDataMode_5() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testGetDataMode_6() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BINARY, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testGetDataMode_7() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.STRING, DataType.OUT);
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testGetDataMode_8() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testGetDataMode_9() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BINARY, defaultDataMode.getDataMode(DataType.OUT));
	}
	
}

// DefaultDataMode_1Test.java
package org.quickserver.util.xmlreader;

import org.quickserver.net.server.DataMode;
import org.quickserver.net.server.DataType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataMode}.
* It contains ten unit test cases for the {@link DefaultDataMode#setDataMode(DataMode, DataType)} method.
*/
class DefaultDataMode_1Test {
		
	@Test
	void testSetDataMode_0() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.STRING, DataType.OUT);
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataMode_1() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.OUT);
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataMode_2() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataMode_3() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		assertEquals(DataMode.BINARY, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BINARY, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataMode_4() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.OUT);
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataMode_5() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataMode_6() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.STRING, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BINARY, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataMode_7() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.STRING, DataType.OUT);
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataMode_8() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.OBJECT, DataType.OUT);
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataMode_9() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataMode(DataMode.BYTE, DataType.IN);
		defaultDataMode.setDataMode(DataMode.BINARY, DataType.OUT);
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BINARY, defaultDataMode.getDataMode(DataType.OUT));
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
* It contains ten unit test cases for the {@link DefaultDataMode#setDataModeIn(String)} method.
*/
class DefaultDataMode_2Test {
		
	@Test
	void testSetDataModeIn_0() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataModeIn("STRING");
		defaultDataMode.setDataModeOut("STRING");
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataModeIn_1() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataModeIn("BYTE");
		defaultDataMode.setDataModeOut("BYTE");
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataModeIn_2() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataModeIn("OBJECT");
		defaultDataMode.setDataModeOut("OBJECT");
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataModeIn_3() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataModeIn("BINARY");
		defaultDataMode.setDataModeOut("BINARY");
		assertEquals(DataMode.BINARY, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BINARY, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataModeIn_4() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataModeIn("STRING");
		defaultDataMode.setDataModeOut("BYTE");
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataModeIn_5() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataModeIn("STRING");
		defaultDataMode.setDataModeOut("OBJECT");
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataModeIn_6() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataModeIn("STRING");
		defaultDataMode.setDataModeOut("BINARY");
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.BINARY, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataModeIn_7() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataModeIn("BYTE");
		defaultDataMode.setDataModeOut("STRING");
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.STRING, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
	void testSetDataModeIn_8() {
		DefaultDataMode defaultDataMode = new DefaultDataMode();
		defaultDataMode.setDataModeIn("BYTE");
		defaultDataMode.setDataModeOut("OBJECT");
		assertEquals(DataMode.BYTE, defaultDataMode.getDataMode(DataType.IN));
		assertEquals(DataMode.OBJECT, defaultDataMode.getDataMode(DataType.OUT));
	}
	
	@Test
