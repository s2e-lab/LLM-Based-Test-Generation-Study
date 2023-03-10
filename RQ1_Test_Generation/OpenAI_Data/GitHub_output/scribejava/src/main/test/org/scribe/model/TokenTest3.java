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

		private Token token;
		
		@Test
		public void testHashCode() {
				token = new Token("token", "secret");
				assertEquals(token.hashCode(), -1429791616);
		}
		
		@Test
		public void testHashCode2() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.hashCode(), -1429791616);
		}
		
		@Test
		public void testHashCode3() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.hashCode(), -1429791616);
		}
		
		@Test
		public void testHashCode4() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.hashCode(), -1429791616);
		}
		
		@Test
		public void testHashCode5() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.hashCode(), -1429791616);
		}
		
		@Test
		public void testHashCode6() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.hashCode(), -1429791616);
		}
		
		@Test
		public void testHashCode7() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.hashCode(), -1429791616);
		}
		
		@Test
		public void testHashCode8() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.hashCode(), -1429791616);
		}
		
		@Test
		public void testHashCode9() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.hashCode(), -1429791616);
		}
		
		@Test
		public void testHashCode10() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.hashCode(), -1429791616);
		}
}