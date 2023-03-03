// Base64EncoderTest1.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Encoder}.
* It contains ten unit test cases for the {@link Base64Encoder#type()} method.
*/
class Base64EncoderTest1 {

	@Test
	void testType() {
		assertEquals("CommonsEncoder", Base64Encoder.type());
	}
}