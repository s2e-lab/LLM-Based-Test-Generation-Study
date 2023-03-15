// Method_3Test.java
package org.objectweb.asm.jip.commons;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.jip.Type;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Method}.
* It contains ten unit test cases for the {@link Method#getMethod(String, boolean)} method.
*/
class Method_3Test {

		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_1() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_2() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_3() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_4() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_5() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_6() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_7() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_8() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_9() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_10() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
}

// Method_4Test.java
package org.objectweb.asm.jip.commons;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.jip.Type;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Method}.
* It contains ten unit test cases for the {@link Method#getMethod(String, boolean)} method.
*/
class Method_4Test {
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_1() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_2() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_3() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_4() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_5() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_6() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_7() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_8() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_9() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_10() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
}

// Method_5Test.java
package org.objectweb.asm.jip.commons;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.jip.Type;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Method}.
* It contains ten unit test cases for the {@link Method#getMethod(String, boolean)} method.
*/
class Method_5Test {
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_1() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_2() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_3() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_4() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_5() {
				Method method = Method.getMethod("int method(int, int)", false);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(int, int)".
		 * Expected result: "int method(int, int)".
		 */
		@Test
		void test_6() {
				Method method = Method.getMethod("int method(int, int)", true);
				assertEquals("method", method.getName());
				assertEquals("(II)I", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(String, boolean)} method.
		 * Test data: "int method(