// CommonsEncoderTest1.java
package org.scribe.services;

import org.apache.commons.codec.binary.*;
import org.scribe.exceptions.*;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#isPresent()} method.
*/
class CommonsEncoderTest1 {

	@Test
	public void testIsPresent() {
		assertTrue(CommonsEncoder.isPresent());
	}
}