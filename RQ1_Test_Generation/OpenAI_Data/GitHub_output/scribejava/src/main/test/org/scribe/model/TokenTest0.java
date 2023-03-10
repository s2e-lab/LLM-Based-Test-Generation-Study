// TokenTest0.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#isEmpty()} method.
*/
class TokenTest0 {

		@Test
		public void testIsEmpty0() {
				Token token = new Token("", "");
				boolean result = token.isEmpty();
				assertTrue(result);
		}
		
		@Test
		public void testIsEmpty1() {
				Token token = new Token("", "secret");
				boolean result = token.isEmpty();
				assertFalse(result);
		}
		
		@Test
		public void testIsEmpty2() {
				Token token = new Token("token", "");
				boolean result = token.isEmpty();
				assertFalse(result);
		}
		
		@Test
		public void testIsEmpty3() {
				Token token = new Token("token", "secret");
				boolean result = token.isEmpty();
				assertFalse(result);
		}
		
		@Test
		public void testIsEmpty4() {
				Token token = new Token("", "secret");
				boolean result = token.isEmpty();
				assertFalse(result);
		}
		
		@Test
		public void testIsEmpty5() {
				Token token = new Token("token", "");
				boolean result = token.isEmpty();
				assertFalse(result);
		}
		
		@Test
		public void testIsEmpty6() {
				Token token = new Token("token", "secret");
				boolean result = token.isEmpty();
				assertFalse(result);
		}
		
		@Test
		public void testIsEmpty7() {
				Token token = new Token("", "secret");
				boolean result = token.isEmpty();
				assertFalse(result);
		}
		
		@Test
		public void testIsEmpty8() {
				Token token = new Token("token", "");
				boolean result = token.isEmpty();
				assertFalse(result);
		}
		
		@Test
		public void testIsEmpty9() {
				Token token = new Token("token", "secret");
				boolean result = token.isEmpty();
				assertFalse(result);
		}
}