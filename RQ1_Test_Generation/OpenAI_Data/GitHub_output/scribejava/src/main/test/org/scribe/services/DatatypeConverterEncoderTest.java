// DatatypeConverterEncoderTest.java
package org.scribe.services;

import javax.xml.bind.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DatatypeConverterEncoder}.
* It contains ten unit test cases for the {@link DatatypeConverterEncoder#encode(byte[])} method.
*/
class DatatypeConverterEncoderTest {

	@Test
	void testEncode() {
		DatatypeConverterEncoder encoder = new DatatypeConverterEncoder();
		assertEquals("", encoder.encode(new byte[]{}));
		assertEquals("AA==", encoder.encode(new byte[]{0}));
		assertEquals("AAA=", encoder.encode(new byte[]{0, 0}));
		assertEquals("AAAA", encoder.encode(new byte[]{0, 0, 0}));
		assertEquals("//8=", encoder.encode(new byte[]{63}));
		assertEquals("/+8=", encoder.encode(new byte[]{62}));
		assertEquals("//4=", encoder.encode(new byte[]{61}));
		assertEquals("/+4=", encoder.encode(new byte[]{60}));
		assertEquals("//0=", encoder.encode(new byte[]{59}));
		assertEquals("/+0=", encoder.encode(new byte[]{58}));
	}
}