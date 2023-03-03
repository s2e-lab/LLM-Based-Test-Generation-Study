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
				assertEquals(0, p1.compareTo(p1));
		}
		
		@Test
		void testCompareTo4() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(0, p2.compareTo(p2));
		}
		
		@Test
		void testCompareTo5() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(0, p1.compareTo(new Parameter("key", "value")));
		}
		
		@Test
		void testCompareTo6() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(0, p2.compareTo(new Parameter("key", "value")));
		}
		
		@Test
		void testCompareTo7() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(-1, p1.compareTo(new Parameter("key2", "value")));
		}
		
		@Test
		void testCompareTo8() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(1, p2.compareTo(new Parameter("key2", "value")));
		}
		
		@Test
		void testCompareTo9() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(-1, p1.compareTo(new Parameter("key", "value2")));
		}
		
		@Test
		void testCompareTo10() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals(1, p2.compareTo(new Parameter("key", "value2")));
		}
}

// ParameterTest4.java
package org.scribe.model;

import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Parameter}.
* It contains ten unit test cases for the {@link Parameter#asUrlEncodedPair()} method.
*/
class ParameterTest4 {
		
		@Test
		void testAsUrlEncodedPair1() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals("key=value", p1.asUrlEncodedPair());
		}
		
		@Test
		void testAsUrlEncodedPair2() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals("key=value", p2.asUrlEncodedPair());
		}
		
		@Test
		void testAsUrlEncodedPair3() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals("key=value", p1.asUrlEncodedPair());
		}
		
		@Test
		void testAsUrlEncodedPair4() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals("key=value", p2.asUrlEncodedPair());
		}
		
		@Test
		void testAsUrlEncodedPair5() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals("key=value", p1.asUrlEncodedPair());
		}
		
		@Test
		void testAsUrlEncodedPair6() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals("key=value", p2.asUrlEncodedPair());
		}
		
		@Test
		void testAsUrlEncodedPair7() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals("key=value", p1.asUrlEncodedPair());
		}
		
		@Test
		void testAsUrlEncodedPair8() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals("key=value", p2.asUrlEncodedPair());
		}
		
		@Test
		void testAsUrlEncodedPair9() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals("key=value", p1.asUrlEncodedPair());
		}
		
		@Test
		void testAsUrlEncodedPair10() {
				Parameter p1 = new Parameter("key", "value");
				Parameter p2 = new Parameter("key", "value");
				assertEquals("key=value", p2.asUrlEncodedPair());
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
     * @param key name
     * @param value value
     */
    public void add(String key, String value) {
        params.add(new Parameter(key, value));
    }

    /**
     * Adds all parameters from the given list.
     *
     * @param parameters parameters to add
     */
    public void addAll(ParameterList parameters) {
        params.addAll(parameters.params);
    }

    /**
     * Adds all parameters from the given array.
     *
     * @param parameters parameters to add
     */
    public void addAll(Parameter[] parameters) {
        params.addAll(Arrays.asList(parameters));
    }

    /**
     * Returns the complete list of parameters.
     *
     * @return parameters as list
     */
    public List<Parameter> asList() {
        return new ArrayList<Parameter>(params);
    }

    /**
     * Returns the complete list of parameters as URL-encoded String.
     *
     * @return parameters as URL-encoded String
     */
    public String asOauthBaseString