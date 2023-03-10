// ParameterTest1.java
package org.scribe.model;

import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Parameter}.
* It contains ten unit test cases for the {@link Parameter#equals(Object)} method.
*/
class ParameterTest1 {

		@Test
		void testEquals1() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertTrue(p1.equals(p2));
		}
		
		@Test
		void testEquals2() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertTrue(p2.equals(p1));
		}
		
		@Test
		void testEquals3() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertTrue(p1.equals(p1));
		}
		
		@Test
		void testEquals4() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertTrue(p2.equals(p2));
		}
		
		@Test
		void testEquals5() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertFalse(p1.equals(null));
		}
		
		@Test
		void testEquals6() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertFalse(p2.equals(null));
		}
		
		@Test
		void testEquals7() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertFalse(p1.equals(new Object()));
		}
		
		@Test
		void testEquals8() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertFalse(p2.equals(new Object()));
		}
		
		@Test
		void testEquals9() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertFalse(p1.equals(new Parameter("key", "value2")));
		}
		
		@Test
		void testEquals10() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertFalse(p2.equals(new Parameter("key", "value2")));
		}
}