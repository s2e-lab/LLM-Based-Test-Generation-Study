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
				Token token3 = new Token("token1", "secret1");
				Token token4 = new Token("token1", "secret2");
				Token token5 = new Token("token2", "secret1");
				Token token6 = new Token("token1", "secret1");
				Token token7 = new Token("token1", "secret1");
				Token token8 = new Token("token1", "secret1");
				Token token9 = new Token("token1", "secret1");
				Token token10 = new Token("token1", "secret1");
				
				assertFalse(token1.equals(token2));
				assertFalse(token1.equals(token3));
				assertFalse(token1.equals(token4));
				assertFalse(token1.equals(token5));
				assertFalse(token1.equals(token6));
				assertFalse(token1.equals(token7));
				assertFalse(token1.equals(token8));
				assertFalse(token1.equals(token9));
				assertFalse(token1.equals(token10));
		}
}