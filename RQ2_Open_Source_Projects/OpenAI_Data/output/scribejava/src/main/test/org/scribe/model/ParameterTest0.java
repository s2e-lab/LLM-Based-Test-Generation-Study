// ParameterTest0.java
package org.scribe.model;

import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Parameter}.
* It contains ten unit test cases for the {@link Parameter#asUrlEncodedPair()} method.
*/
class ParameterTest0 {

		@Test
		public void testAsUrlEncodedPair0() throws Throwable {
				Parameter parameter = new Parameter("", "");
				String result = parameter.asUrlEncodedPair();
				assertEquals("=", result);
		}
		
		@Test
		public void testAsUrlEncodedPair1() throws Throwable {
				Parameter parameter = new Parameter("", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair2() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=", result);
		}
		
		@Test
		public void testAsUrlEncodedPair3() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair4() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair5() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair6() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair7() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair8() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair9() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
}

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
		public void testEquals0() throws Throwable {
				Parameter parameter = new Parameter("", "");
				boolean result = parameter.equals(new Parameter("", ""));
				assertTrue(result);
		}
		
		@Test
		public void testEquals1() throws Throwable {
				Parameter parameter = new Parameter("", "testParametervalue");
				boolean result = parameter.equals(new Parameter("", "testParametervalue"));
				assertTrue(result);
		}
		
		@Test
		public void testEquals2() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "");
				boolean result = parameter.equals(new Parameter("testParameterkey", ""));
				assertTrue(result);
		}
		
		@Test
		public void testEquals3() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				boolean result = parameter.equals(new Parameter("testParameterkey", "testParametervalue"));
				assertTrue(result);
		}
		
		@Test
		public void testEquals4() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				boolean result = parameter.equals(new Parameter("testParameterkey", "testParametervalue"));
				assertTrue(result);
		}
		
		@Test
		public void testEquals5() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				boolean result = parameter.equals(new Parameter("testParameterkey", "testParametervalue"));
				assertTrue(result);
		}
		
		@Test
		public void testEquals6() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				boolean result = parameter.equals(new Parameter("testParameterkey", "testParametervalue"));
				assertTrue(result);
		}
		
		@Test
		public void testEquals7() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				boolean result = parameter.equals(new Parameter("testParameterkey", "testParametervalue"));
				assertTrue(result);
		}
		
		@Test
		public void testEquals8() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				boolean result = parameter.equals(new Parameter("testParameterkey", "testParametervalue"));
				assertTrue(result);
		}
		
		@Test
		public void testEquals9() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				boolean result = parameter.equals(new Parameter("testParameterkey", "testParametervalue"));
				assertTrue(result);
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
		public void testHashCode0() throws Throwable {
				Parameter parameter = new Parameter("", "");
				int result = parameter.hashCode();
				assertEquals(0, result);
		}
		
		@Test
		public void testHashCode1() throws Throwable {
				Parameter parameter = new Parameter("", "testParametervalue");
				int result = parameter.hashCode();
				assertEquals(12, result);
		}
		
		@Test
		public void testHashCode2() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "");
				int result = parameter.hashCode();
				assertEquals(12, result);
		}
		
		@Test
		public void testHashCode3() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.hashCode();
				assertEquals(24, result);
		}
		
		@Test
		public void testHashCode4() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.hashCode();
				assertEquals(24, result);
		}
		
		@Test
		public void testHashCode5() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.hashCode();
				assertEquals(24, result);
		}
		
		@Test
		public void testHashCode6() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.hashCode();
				assertEquals(24, result);
		}
		
		@Test
		public void testHashCode7() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.hashCode();
				assertEquals(24, result);
		}
		
		@Test
		public void testHashCode8() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.hashCode();
				assertEquals(24, result);
		}
		
		@Test
		public void testHashCode9() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.hashCode();
				assertEquals(24, result);
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
		public void testCompareTo0() throws Throwable {
				Parameter parameter = new Parameter("", "");
				int result = parameter.compareTo(new Parameter("", ""));
				assertEquals(0, result);
		}
		
		@Test
		public void testCompareTo1() throws Throwable {
				Parameter parameter = new Parameter("", "testParametervalue");
				int result = parameter.compareTo(new Parameter("", "testParametervalue"));
				assertEquals(0, result);
		}
		
		@Test
		public void testCompareTo2() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "");
				int result = parameter.compareTo(new Parameter("testParameterkey", ""));
				assertEquals(0, result);
		}
		
		@Test
		public void testCompareTo3() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.compareTo(new Parameter("testParameterkey", "testParametervalue"));
				assertEquals(0, result);
		}
		
		@Test
		public void testCompareTo4() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.compareTo(new Parameter("testParameterkey", "testParametervalue"));
				assertEquals(0, result);
		}
		
		@Test
		public void testCompareTo5() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.compareTo(new Parameter("testParameterkey", "testParametervalue"));
				assertEquals(0, result);
		}
		
		@Test
		public void testCompareTo6() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.compareTo(new Parameter("testParameterkey", "testParametervalue"));
				assertEquals(0, result);
		}
		
		@Test
		public void testCompareTo7() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.compareTo(new Parameter("testParameterkey", "testParametervalue"));
				assertEquals(0, result);
		}
		
		@Test
		public void testCompareTo8() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.compareTo(new Parameter("testParameterkey", "testParametervalue"));
				assertEquals(0, result);
		}
		
		@Test
		public void testCompareTo9() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				int result = parameter.compareTo(new Parameter("testParameterkey", "testParametervalue"));
				assertEquals(0, result);
		}
}

// ParameterList.java
package org.scribe.model;

import java.util.*;

/**
 * Represents a list of {@link Parameter}s.
 *
 * @author Pablo Fernandez
 */
public class ParameterList implements Iterable<Parameter> {

    private SortedSet<Parameter> params;

    /**
     * Default constructor.
     */
    public ParameterList() {
        params = new TreeSet<Parameter>();
    }

    /**
     * Adds a new parameter.
     *
     * @param key name of the parameter
     * @param value value of the parameter
     */
    public void add(String key, String value) {
        params.add(new Parameter(key, value));
    }

    /**
     * Adds all the parameters from the given list.
     *
     * @param other list to add
     */
    public void addAll(ParameterList other) {
        params.addAll(other.params);
    }

    /**
     * Adds a new parameter.
     *
     * @param param parameter to add
     */
    public void add(Parameter