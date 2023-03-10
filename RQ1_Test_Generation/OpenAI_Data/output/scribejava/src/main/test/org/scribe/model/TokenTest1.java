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
		
		@Test
		public void testEmptyTokenWithNullToken() {
				Token token = Token.empty();
				assertTrue(token.isEmpty());
		}
		
		@Test
		public void testEmptyTokenWithNullSecret() {
				Token token = Token.empty();
				assertTrue(token.isEmpty());
		}
		
		@Test
		public void testEmptyTokenWithEmptyToken() {
				Token token = Token.empty();
				assertTrue(token.isEmpty());
		}
		
		@Test
		public void testEmptyTokenWithEmptySecret() {
				Token token = Token.empty();
				assertTrue(token.isEmpty());
		}
		
		@Test
		public void testEmptyTokenWithNullTokenAndSecret() {
				Token token = Token.empty();
				assertTrue(token.isEmpty());
		}
		
		@Test
		public void testEmptyTokenWithEmptyTokenAndSecret() {
				Token token = Token.empty();
				assertTrue(token.isEmpty());
		}
		
		@Test
		public void testEmptyTokenWithNullTokenAndEmptySecret() {
				Token token = Token.empty();
				assertTrue(token.isEmpty());
		}
		
		@Test
		public void testEmptyTokenWithEmptyTokenAndNullSecret() {
				Token token = Token.empty();
				assertTrue(token.isEmpty());
		}
		
		@Test
		public void testEmptyTokenWithNullTokenAndNullSecret() {
				Token token = Token.empty();
				assertTrue(token.isEmpty());
		}
}