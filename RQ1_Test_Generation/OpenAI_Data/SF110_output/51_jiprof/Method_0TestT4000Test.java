// Method_0Test.java
package org.objectweb.asm.jip.commons;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.jip.Type;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Method}.
* It contains ten unit test cases for the {@link Method#getMethod(java.lang.reflect.Method)} method.
*/
class Method_0Test {

		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_0() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("testGetMethod_0"));
				assertEquals("testGetMethod_0", method.getName());
				assertEquals("()V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_1() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("testGetMethod_1", String.class));
				assertEquals("testGetMethod_1", method.getName());
				assertEquals("(Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_2() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("testGetMethod_2", String.class, String.class));
				assertEquals("testGetMethod_2", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_3() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("testGetMethod_3", String.class, String.class, String.class));
				assertEquals("testGetMethod_3", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_4() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("testGetMethod_4", String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_4", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_5() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("testGetMethod_5", String.class, String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_5", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_6() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("testGetMethod_6", String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_6", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_7() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("testGetMethod_7", String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_7", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_8() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("testGetMethod_8", String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_8", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_9() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("testGetMethod_9", String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_9", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_10() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("testGetMethod_10", String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_10", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
}

// Method_1Test.java
package org.objectweb.asm.jip.commons;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.jip.Type;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Method}.
* It contains ten unit test cases for the {@link Method#getMethod(java.lang.reflect.Method)} method.
*/
class Method_1Test {
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_0() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getMethod("testGetMethod_0"));
				assertEquals("testGetMethod_0", method.getName());
				assertEquals("()V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_1() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getMethod("testGetMethod_1", String.class));
				assertEquals("testGetMethod_1", method.getName());
				assertEquals("(Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_2() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getMethod("testGetMethod_2", String.class, String.class));
				assertEquals("testGetMethod_2", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_3() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getMethod("testGetMethod_3", String.class, String.class, String.class));
				assertEquals("testGetMethod_3", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_4() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getMethod("testGetMethod_4", String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_4", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_5() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getMethod("testGetMethod_5", String.class, String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_5", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_6() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getMethod("testGetMethod_6", String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_6", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_7() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getMethod("testGetMethod_7", String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_7", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_8() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getMethod("testGetMethod_8", String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("testGetMethod_8", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		 * Test case for {@link Method#getMethod(java.lang.reflect.Method)}
		 * 
		 * @throws Exception
		 */
		@Test
		void testGetMethod_9() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getMethod("testGetMethod_9", String.class, String.class,