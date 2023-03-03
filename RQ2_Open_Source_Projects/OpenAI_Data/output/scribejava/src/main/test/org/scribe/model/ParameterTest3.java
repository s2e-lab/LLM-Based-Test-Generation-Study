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
		void testCompareTo_1() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key2", "value2");
				int result = p1.compareTo(p2);
				assertTrue(result < 0);
		}
		
		@Test
		void testCompareTo_2() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value2");
				int result = p1.compareTo(p2);
				assertTrue(result < 0);
		}
		
		@Test
		void testCompareTo_3() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_4() {
				Parameter p1 = new Parameter("key2", "value2");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result > 0);
		}
		
		@Test
		void testCompareTo_5() {
				Parameter p1 = new Parameter("key1", "value2");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result > 0);
		}
		
		@Test
		void testCompareTo_6() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_7() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_8() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_9() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_10() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
}

// ParameterTest4.java
package org.scribe.model;

import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Parameter}.
* It contains ten unit test cases for the {@link Parameter#compareTo(Parameter)} method.
*/
class ParameterTest4 {
		
		@Test
		void testCompareTo_1() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key2", "value2");
				int result = p1.compareTo(p2);
				assertTrue(result < 0);
		}
		
		@Test
		void testCompareTo_2() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value2");
				int result = p1.compareTo(p2);
				assertTrue(result < 0);
		}
		
		@Test
		void testCompareTo_3() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_4() {
				Parameter p1 = new Parameter("key2", "value2");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result > 0);
		}
		
		@Test
		void testCompareTo_5() {
				Parameter p1 = new Parameter("key1", "value2");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result > 0);
		}
		
		@Test
		void testCompareTo_6() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_7() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_8() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_9() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_10() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
}

// ParameterTest5.java
package org.scribe.model;

import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Parameter}.
* It contains ten unit test cases for the {@link Parameter#compareTo(Parameter)} method.
*/
class ParameterTest5 {
		
		@Test
		void testCompareTo_1() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key2", "value2");
				int result = p1.compareTo(p2);
				assertTrue(result < 0);
		}
		
		@Test
		void testCompareTo_2() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value2");
				int result = p1.compareTo(p2);
				assertTrue(result < 0);
		}
		
		@Test
		void testCompareTo_3() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_4() {
				Parameter p1 = new Parameter("key2", "value2");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result > 0);
		}
		
		@Test
		void testCompareTo_5() {
				Parameter p1 = new Parameter("key1", "value2");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result > 0);
		}
		
		@Test
		void testCompareTo_6() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_7() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_8() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_9() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_10() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
}

// ParameterTest6.java
package org.scribe.model;

import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Parameter}.
* It contains ten unit test cases for the {@link Parameter#compareTo(Parameter)} method.
*/
class ParameterTest6 {
		
		@Test
		void testCompareTo_1() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key2", "value2");
				int result = p1.compareTo(p2);
				assertTrue(result < 0);
		}
		
		@Test
		void testCompareTo_2() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value2");
				int result = p1.compareTo(p2);
				assertTrue(result < 0);
		}
		
		@Test
		void testCompareTo_3() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_4() {
				Parameter p1 = new Parameter("key2", "value2");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result > 0);
		}
		
		@Test
		void testCompareTo_5() {
				Parameter p1 = new Parameter("key1", "value2");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result > 0);
		}
		
		@Test
		void testCompareTo_6() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_7() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_8() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_9() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("key1", "value1");
				int result = p1.compareTo(p2);
				assertTrue(result == 0);
		}
		
		@Test
		void testCompareTo_10() {
				Parameter p1 = new Parameter("key1", "value1");
				Parameter p2 = new Parameter("