// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {

		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has no variables.
		*/
		@Test
		void testUsage_1() {
				JCLO jclo = new JCLO(new Object());
				assertEquals("", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has one variable.
		*/
		@Test
		void testUsage_2() {
				JCLO jclo = new JCLO(new Object() {
						public boolean a;
				});
				assertEquals("-a\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has two variables.
		*/
		@Test
		void testUsage_3() {
				JCLO jclo = new JCLO(new Object() {
						public boolean a;
						public boolean b;
				});
				assertEquals("-a\n-b\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has two variables, one of which is an array.
		*/
		@Test
		void testUsage_4() {
				JCLO jclo = new JCLO(new Object() {
						public boolean a;
						public boolean[] b;
				});
				assertEquals("-a\n-b boolean...\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has two variables, one of which is an array.
		*/
		@Test
		void testUsage_5() {
				JCLO jclo = new JCLO(new Object() {
						public boolean a;
						public boolean[] b;
						public boolean c;
				});
				assertEquals("-a\n-b boolean...\n-c\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has two variables, one of which is an array.
		*/
		@Test
		void testUsage_6() {
				JCLO jclo = new JCLO(new Object() {
						public boolean a;
						public boolean[] b;
						public boolean c;
						public boolean d;
				});
				assertEquals("-a\n-b boolean...\n-c\n-d\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has two variables, one of which is an array.
		*/
		@Test
		void testUsage_7() {
				JCLO jclo = new JCLO(new Object() {
						public boolean a;
						public boolean[] b;
						public boolean c;
						public boolean d;
						public boolean e;
				});
				assertEquals("-a\n-b boolean...\n-c\n-d\n-e\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has two variables, one of which is an array.
		*/
		@Test
		void testUsage_8() {
				JCLO jclo = new JCLO(new Object() {
						public boolean a;
						public boolean[] b;
						public boolean c;
						public boolean d;
						public boolean e;
						public boolean f;
				});
				assertEquals("-a\n-b boolean...\n-c\n-d\n-e\n-f\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has two variables, one of which is an array.
		*/
		@Test
		void testUsage_9() {
				JCLO jclo = new JCLO(new Object() {
						public boolean a;
						public boolean[] b;
						public boolean c;
						public boolean d;
						public boolean e;
						public boolean f;
						public boolean g;
				});
				assertEquals("-a\n-b boolean...\n-c\n-d\n-e\n-f\n-g\n", jclo.usage());
		}
		
		/**
		* Test case for {@link JCLO#usage()} method.
		* It tests the usage method with a class that has two variables, one of which is an array.
		*/
		@Test
		void testUsage_10() {
				JCLO jclo = new JCLO(new Object() {
						public boolean a;
						public boolean[] b;
						public boolean c;
						public boolean d;
						public boolean e;
						public boolean f;
						public boolean g;
						public boolean h;
				});
				assertEquals("-a\n-b boolean...\n-c\n-d\n-e\n-f\n-g\n-h\n", jclo.usage());
		}
}

// JCLO_2Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#parse(String[])} method.
*/
class JCLO_2Test {
		
		/**
		* Test case for {@link JCLO#parse(String[])} method.
		* It tests the parse method with a class that has no variables.
		*/
		@Test
		void testParse_1() {
				JCLO jclo = new JCLO(new Object());
				jclo.parse(new String[] {});
		}
		
		/**
		* Test case for {@link JCLO#parse(String[])} method.
		