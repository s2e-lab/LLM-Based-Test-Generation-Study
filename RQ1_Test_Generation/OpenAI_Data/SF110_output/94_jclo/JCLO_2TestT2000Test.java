// JCLO_2Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getBoolean(String)} method.
*/
class JCLO_2Test {

		/**
		* Test case for {@link JCLO#getBoolean(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetBoolean_1() {
				JCLO jclo = new JCLO(new JCLO_2Test_1());
				jclo.parse(new String[] {"-a"});
				assertTrue(jclo.getBoolean("a"));
		}
		
		/**
		* Test case for {@link JCLO#getBoolean(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetBoolean_2() {
				JCLO jclo = new JCLO(new JCLO_2Test_1());
				jclo.parse(new String[] {"-b"});
				assertTrue(jclo.getBoolean("b"));
		}
		
		/**
		* Test case for {@link JCLO#getBoolean(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetBoolean_3() {
				JCLO jclo = new JCLO(new JCLO_2Test_1());
				jclo.parse(new String[] {"-c"});
				assertTrue(jclo.getBoolean("c"));
		}
		
		/**
		* Test case for {@link JCLO#getBoolean(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetBoolean_4() {
				JCLO jclo = new JCLO(new JCLO_2Test_1());
				jclo.parse(new String[] {"-d"});
				assertTrue(jclo.getBoolean("d"));
		}
		
		/**
		* Test case for {@link JCLO#getBoolean(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetBoolean_5() {
				JCLO jclo = new JCLO(new JCLO_2Test_1());
				jclo.parse(new String[] {"-e"});
				assertTrue(jclo.getBoolean("e"));
		}
		
		/**
		* Test case for {@link JCLO#getBoolean(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetBoolean_6() {
				JCLO jclo = new JCLO(new JCLO_2Test_1());
				jclo.parse(new String[] {"-f"});
				assertTrue(jclo.getBoolean("f"));
		}
		
		/**
		* Test case for {@link JCLO#getBoolean(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetBoolean_7() {
				JCLO jclo = new JCLO(new JCLO_2Test_1());
				jclo.parse(new String[] {"-g"});
				assertTrue(jclo.getBoolean("g"));
		}
		
		/**
		* Test case for {@link JCLO#getBoolean(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetBoolean_8() {
				JCLO jclo = new JCLO(new JCLO_2Test_1());
				jclo.parse(new String[] {"-h"});
				assertTrue(jclo.getBoolean("h"));
		}
		
		/**
		* Test case for {@link JCLO#getBoolean(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetBoolean_9() {
				JCLO jclo = new JCLO(new JCLO_2Test_1());
				jclo.parse(new String[] {"-i"});
				assertTrue(jclo.getBoolean("i"));
		}
		
		/**
		* Test case for {@link JCLO#getBoolean(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetBoolean_10() {
				JCLO jclo = new JCLO(new JCLO_2Test_1());
				jclo.parse(new String[] {"-j"});
				assertTrue(jclo.getBoolean("j"));
		}
}

// JCLO_2Test_1.java
package edu.mscd.cs.jclo;

/**
* Test class of {@link JCLO}.
* It contains ten boolean variables.
*/
class JCLO_2Test_1 {
		
		/**
		* A boolean variable.
		*/
		public boolean a;
		
		/**
		* A boolean variable.
		*/
		public boolean b;
		
		/**
		* A boolean variable.
		*/
		public boolean c;
		
		/**
		* A boolean variable.
		*/
		public boolean d;
		
		/**
		* A boolean variable.
		*/
		public boolean e;
		
		/**
		* A boolean variable.
		*/
		public boolean f;
		
		/**
		* A boolean variable.
		*/
		public boolean g;
		
		/**
		* A boolean variable.
		*/
		public boolean h;
		
		/**
		* A boolean variable.
		*/
		public boolean i;
		
		/**
		* A boolean variable.
		*/
		public boolean j;
}

// JCLO_3Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getByte(String)} method.
*/
class JCLO_3Test {
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetByte_1() {
				JCLO jclo = new JCLO(new JCLO_3Test_1());
				jclo.parse(new String[] {"-a", "1"});
				assertEquals(1, jclo.getByte("a"));
		}
		
		/**
		* Test case for {@link JCLO#getByte(String)} method.
		* It tests the method with a valid key.
		*/
		@Test
		void testGetByte_2() {
				JCLO jclo = new JCLO(new JCLO