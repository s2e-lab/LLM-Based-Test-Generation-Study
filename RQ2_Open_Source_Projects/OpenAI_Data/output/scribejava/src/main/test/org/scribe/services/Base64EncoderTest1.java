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

// Base64EncoderTest2.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Encoder}.
* It contains ten unit test cases for the {@link Base64Encoder#type()} method.
*/
class Base64EncoderTest2 {
		
	@Test
	void testType() {
		assertEquals("DatatypeConverterEncoder", Base64Encoder.type());
	}
}

// Base64EncoderTest3.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Encoder}.
* It contains ten unit test cases for the {@link Base64Encoder#type()} method.
*/
class Base64EncoderTest3 {
		
	@Test
	void testType() {
		assertEquals("CommonsEncoder", Base64Encoder.type());
	}
}

// Base64EncoderTest4.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Encoder}.
* It contains ten unit test cases for the {@link Base64Encoder#type()} method.
*/
class Base64EncoderTest4 {
		
	@Test
	void testType() {
		assertEquals("DatatypeConverterEncoder", Base64Encoder.type());
	}
}

// Base64EncoderTest5.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Encoder}.
* It contains ten unit test cases for the {@link Base64Encoder#type()} method.
*/
class Base64EncoderTest5 {
		
	@Test
	void testType() {
		assertEquals("CommonsEncoder", Base64Encoder.type());
	}
}

// Base64EncoderTest6.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Encoder}.
* It contains ten unit test cases for the {@link Base64Encoder#type()} method.
*/
class Base64EncoderTest6 {
		
	@Test
	void testType() {
		assertEquals("DatatypeConverterEncoder", Base64Encoder.type());
	}
}

// Base64EncoderTest7.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Encoder}.
* It contains ten unit test cases for the {@link Base64Encoder#type()} method.
*/
class Base64EncoderTest7 {
		
	@Test
	void testType() {
		assertEquals("CommonsEncoder", Base64Encoder.type());
	}
}

// Base64EncoderTest8.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Encoder}.
* It contains ten unit test cases for the {@link Base64Encoder#type()} method.
*/
class Base64EncoderTest8 {
		
	@Test
	void testType() {
		assertEquals("DatatypeConverterEncoder", Base64Encoder.type());
	}
}

// Base64EncoderTest9.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Encoder}.
* It contains ten unit test cases for the {@link Base64Encoder#type()} method.
*/
class Base64EncoderTest9 {
		
	@Test
	void testType() {
		assertEquals("CommonsEncoder", Base64Encoder.type());
	}
}

// Base64EncoderTest10.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Encoder}.
* It contains ten unit test cases for the {@link Base64Encoder#type()} method.
*/
class Base64EncoderTest10 {
		
	@Test
	void testType() {
		assertEquals("DatatypeConverterEncoder", Base64Encoder.type());
	}
}

// CommonsEncoder.java
package org.scribe.services;

import org.apache.commons.codec.binary.Base64;

public class CommonsEncoder extends Base64Encoder {

    private static final String TYPE = "CommonsEncoder";

    public static boolean isPresent() {
        try {
            Class.forName("org.apache.commons.codec.binary.Base64");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public String encode(byte[] bytes) {
        return new String(Base64.encodeBase64(bytes));
    }

    public String getType() {
        return TYPE;
    }
}

// DatatypeConverterEncoder.java
package org.scribe.services;

import javax.xml.bind.DatatypeConverter;

public class DatatypeConverterEncoder extends Base64Encoder {

    private static final String TYPE = "DatatypeConverterEncoder";

    public String encode(byte[] bytes) {
        return DatatypeConverter.printBase64Binary(bytes);
    }

    public String getType() {
        return TYPE;
    }
}

// CommonsEncoderTest1.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#isPresent()} method.
*/
class CommonsEncoderTest1 {
		
	@Test
	void testIsPresent() {
		assertTrue(CommonsEncoder.isPresent());
	}
}

// CommonsEncoderTest2.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#isPresent()} method.
*/
class CommonsEncoderTest2 {
		
	@Test
	void testIsPresent() {
		assertFalse(CommonsEncoder.isPresent());
	}
}

// CommonsEncoderTest3.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CommonsEncoder}.
* It contains ten unit test cases for the {@link CommonsEncoder#isPresent()} method.
*/
class CommonsEncoderTest3 {
		
	@Test
	void testIsPresent() {
		assertTrue(CommonsEncoder.isPresent());
	}
}

// CommonsEncoderTest4.java
package org.scribe.services;


import org.junit.jupiter.api.Test;
import static org