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

// CommonsEncoderTest2.java
package org.scribe.services;

import org.apache.commons.codec.binary.*;
import org.scribe.exceptions.*;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#encode(byte[])} method.
*/
class CommonsEncoderTest2 {
		
	@Test
	public void testEncode() {
		byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String expected = "AQIDBAUGBwgJ";
		String actual = new CommonsEncoder().encode(bytes);
		assertEquals(expected, actual);
	}
}

// CommonsEncoderTest3.java
package org.scribe.services;

import org.apache.commons.codec.binary.*;
import org.scribe.exceptions.*;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#getType()} method.
*/
class CommonsEncoderTest3 {
		
	@Test
	public void testGetType() {
		String expected = "CommonsCodec";
		String actual = new CommonsEncoder().getType();
		assertEquals(expected, actual);
	}
}

// CommonsEncoderTest4.java
package org.scribe.services;

import org.apache.commons.codec.binary.*;
import org.scribe.exceptions.*;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#encode(byte[])} method.
*/
class CommonsEncoderTest4 {
		
	@Test
	public void testEncode() {
		byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String expected = "AQIDBAUGBwgJ";
		String actual = new CommonsEncoder().encode(bytes);
		assertEquals(expected, actual);
	}
}

// CommonsEncoderTest5.java
package org.scribe.services;

import org.apache.commons.codec.binary.*;
import org.scribe.exceptions.*;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#getType()} method.
*/
class CommonsEncoderTest5 {
		
	@Test
	public void testGetType() {
		String expected = "CommonsCodec";
		String actual = new CommonsEncoder().getType();
		assertEquals(expected, actual);
	}
}

// CommonsEncoderTest6.java
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
class CommonsEncoderTest6 {
		
	@Test
	public void testIsPresent() {
		assertTrue(CommonsEncoder.isPresent());
	}
}

// CommonsEncoderTest7.java
package org.scribe.services;

import org.apache.commons.codec.binary.*;
import org.scribe.exceptions.*;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#getType()} method.
*/
class CommonsEncoderTest7 {
		
	@Test
	public void testGetType() {
		String expected = "CommonsCodec";
		String actual = new CommonsEncoder().getType();
		assertEquals(expected, actual);
	}
}

// CommonsEncoderTest8.java
package org.scribe.services;

import org.apache.commons.codec.binary.*;
import org.scribe.exceptions.*;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#encode(byte[])} method.
*/
class CommonsEncoderTest8 {
		
	@Test
	public void testEncode() {
		byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String expected = "AQIDBAUGBwgJ";
		String actual = new CommonsEncoder().encode(bytes);
		assertEquals(expected, actual);
	}
}

// CommonsEncoderTest9.java
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
class CommonsEncoderTest9 {
		
	@Test
	public void testIsPresent() {
		assertTrue(CommonsEncoder.isPresent());
	}
}

// CommonsEncoderTest10.java
package org.scribe.services;

import org.apache.commons.codec.binary.*;
import org.scribe.exceptions.*;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#encode(byte[])} method.
*/
class CommonsEncoderTest10 {
		
	@Test
	public void testEncode() {
		byte[] bytes = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String expected = "AQIDBAUGBwgJ";
		String actual = new CommonsEncoder().encode(bytes);
		assertEquals(expected, actual);
	}
}

// CommonsEncoderTest11.java
package org.scribe.services;

import org.apache.commons.codec.binary.*;
import org.scribe.exceptions.*;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#getType()} method.
*/
class CommonsEncoderTest11 {
		
	@Test
	public void testGetType() {