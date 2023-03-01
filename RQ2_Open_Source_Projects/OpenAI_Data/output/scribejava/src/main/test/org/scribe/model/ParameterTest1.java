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

// ParameterTest2.java
package org.scribe.model;

import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Parameter}.
* It contains ten unit test cases for the {@link Parameter#hashCode()} method.
*/
class ParameterTest2 {
		
		@Test
		void testHashCode1() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(p1.hashCode(), p2.hashCode());
		}
		
		@Test
		void testHashCode2() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(p2.hashCode(), p1.hashCode());
		}
		
		@Test
		void testHashCode3() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(p1.hashCode(), p1.hashCode());
		}
		
		@Test
		void testHashCode4() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(p2.hashCode(), p2.hashCode());
		}
		
		@Test
		void testHashCode5() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertNotEquals(p1.hashCode(), new Parameter("key", "value2").hashCode());
		}
		
		@Test
		void testHashCode6() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertNotEquals(p2.hashCode(), new Parameter("key", "value2").hashCode());
		}
		
		@Test
		void testHashCode7() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertNotEquals(p1.hashCode(), new Parameter("key2", "value").hashCode());
		}
		
		@Test
		void testHashCode8() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertNotEquals(p2.hashCode(), new Parameter("key2", "value").hashCode());
		}
		
		@Test
		void testHashCode9() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertNotEquals(p1.hashCode(), new Parameter("key2", "value2").hashCode());
		}
		
		@Test
		void testHashCode10() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertNotEquals(p2.hashCode(), new Parameter("key2", "value2").hashCode());
		}
}

// ParameterTest3.java
package org.scribe.model;

import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Parameter}.
* It contains ten unit test cases for the {@link Parameter#compareTo(Parameter)} method.
*/
class ParameterTest3 {
		
		@Test
		void testCompareTo1() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(0, p1.compareTo(p2));
		}
		
		@Test
		void testCompareTo2() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(0, p2.compareTo(p1));
		}
		
		@Test
		void testCompareTo3() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(0, p1.compareTo(p