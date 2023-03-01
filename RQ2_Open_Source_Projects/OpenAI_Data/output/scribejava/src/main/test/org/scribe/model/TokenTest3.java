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

// TokenTest4.java
package org.scribe.model;

import java.io.*;
import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#equals(Object)} method.
*/
class TokenTest4 {
		
		private Token token;
		
		@Test
		public void testEquals() {
				token = new Token("token", "secret");
				assertEquals(token.equals(token), true);
		}
		
		@Test
		public void testEquals2() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.equals(token), true);
		}
		
		@Test
		public void testEquals3() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.equals(token), true);
		}
		
		@Test
		public void testEquals4() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.equals(token), true);
		}
		
		@Test
		public void testEquals5() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.equals(token), true);
		}
		
		@Test
		public void testEquals6() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.equals(token), true);
		}
		
		@Test
		public void testEquals7() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.equals(token), true);
		}
		
		@Test
		public void testEquals8() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.equals(token), true);
		}
		
		@Test
		public void testEquals9() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.equals(token), true);
		}
		
		@Test
		public void testEquals10() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.equals(token), true);
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
* It contains ten unit test cases for the {@link Token#toString()} method.
*/
class TokenTest5 {
		
		private Token token;
		
		@Test
		public void testToString() {
				token = new Token("token", "secret");
				assertEquals(token.toString(), "Token[token , secret]");
		}
		
		@Test
		public void testToString2() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.toString(), "Token[token , secret]");
		}
		
		@Test
		public void testToString3() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.toString(), "Token[token , secret]");
		}
		
		@Test
		public void testToString4() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.toString(), "Token[token , secret]");
		}
		
		@Test
		public void testToString5() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.toString(), "Token[token , secret]");
		}
		
		@Test
		public void testToString6() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.toString(), "Token[token , secret]");
		}
		
		@Test
		public void testToString7() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.toString(), "Token[token , secret]");
		}
		
		@Test
		public void testToString8() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.toString(), "Token[token , secret]");
		}
		
		@Test
		public void testToString9() {
				token = new Token("token", "secret", "rawResponse");
				assertEquals(token.toString(), "Token[token , secret]");
		}
		
		@Test
		