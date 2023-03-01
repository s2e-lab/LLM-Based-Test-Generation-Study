// TokenTest1.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#empty()} method.
*/
class TokenTest1 {

		@Test
		public void testEmptyToken() {
				Token token = Token.empty();
				assertTrue(token.isEmpty());
		}
}

// TokenTest2.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#equals(Object)} method.
*/
class TokenTest2 {
		
		@Test
		public void testEquals() {
				Token token1 = new Token("token1", "secret1");
				Token token2 = new Token("token2", "secret2");
				assertFalse(token1.equals(token2));
		}
}

// TokenTest3.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#hashCode()} method.
*/
class TokenTest3 {
		
		@Test
		public void testHashCode() {
				Token token1 = new Token("token1", "secret1");
				Token token2 = new Token("token2", "secret2");
				assertNotEquals(token1.hashCode(), token2.hashCode());
		}
}

// TokenTest4.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#getToken()} method.
*/
class TokenTest4 {
		
		@Test
		public void testGetToken() {
				Token token = new Token("token1", "secret1");
				assertEquals("token1", token.getToken());
		}
}

// TokenTest5.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#getSecret()} method.
*/
class TokenTest5 {
		
		@Test
		public void testGetSecret() {
				Token token = new Token("token1", "secret1");
				assertEquals("secret1", token.getSecret());
		}
}

// TokenTest6.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#getRawResponse()} method.
*/
class TokenTest6 {
		
		@Test
		public void testGetRawResponse() {
				Token token = new Token("token1", "secret1", "rawResponse1");
				assertEquals("rawResponse1", token.getRawResponse());
		}
}

// TokenTest7.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#toString()} method.
*/
class TokenTest7 {
		
		@Test
		public void testToString() {
				Token token = new Token("token1", "secret1");
				assertEquals("Token[token1 , secret1]", token.toString());
		}
}

// TokenTest8.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#Token(String, String)} method.
*/
class TokenTest8 {
		
		@Test
		public void testToken() {
				Token token = new Token("token1", "secret1");
				assertEquals("token1", token.getToken());
				assertEquals("secret1", token.getSecret());
		}
}

// TokenTest9.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#Token(String, String, String)} method.
*/
class TokenTest9 {
		
		@Test
		public void testToken() {
				Token token = new Token("token1", "secret1", "rawResponse1");
				assertEquals("token1", token.getToken());
				assertEquals("secret1", token.getSecret());
				assertEquals("rawResponse1", token.getRawResponse());
		}
}

// TokenTest10.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#isEmpty()} method.
*/
class TokenTest10 {
		
		@Test
		public void testIsEmpty() {
				Token token = new Token("token1", "secret1");
				assertFalse(token.isEmpty());
		}
}

// Verifier.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;

/**
 * Represents an OAuth verifier code.
 *
 * @author Pablo Fernandez
 */
public class Verifier implements Serializable {

    private static final long serialVersionUID = -8344528374458826291L;

    private final String value;

    /**
     * Default constructor.
     *
     * @param value verifier value
     */
    public Verifier(String value) {
        Preconditions.checkNotNull(value, "Must provide a valid string as verifier");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

// VerifierTest1.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Verifier}.
* It contains ten unit test cases for the {@link Verifier#Verifier(String)} method.
*/
class VerifierTest1 {
		
		@Test
		public void testVerifier() {
				Verifier verifier = new Verifier("verifier1");
				assertEquals("verifier1", verifier.getValue());
		}
}

// VerifierTest2.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org