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
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void test_getMethod_0() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("test_getMethod_0"));
				assertEquals("test_getMethod_0", method.getName());
				assertEquals("()V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void test_getMethod_1() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("test_getMethod_1", String.class));
				assertEquals("test_getMethod_1", method.getName());
				assertEquals("(Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void test_getMethod_2() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("test_getMethod_2", String.class, String.class));
				assertEquals("test_getMethod_2", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void test_getMethod_3() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("test_getMethod_3", String.class, String.class, String.class));
				assertEquals("test_getMethod_3", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void test_getMethod_4() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("test_getMethod_4", String.class, String.class, String.class, String.class));
				assertEquals("test_getMethod_4", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void test_getMethod_5() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("test_getMethod_5", String.class, String.class, String.class, String.class, String.class));
				assertEquals("test_getMethod_5", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void test_getMethod_6() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("test_getMethod_6", String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("test_getMethod_6", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void test_getMethod_7() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("test_getMethod_7", String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("test_getMethod_7", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void test_getMethod_8() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("test_getMethod_8", String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("test_getMethod_8", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void test_getMethod_9() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("test_getMethod_9", String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("test_getMethod_9", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void test_getMethod_10() throws Exception {
				Method method = Method.getMethod(Method_0Test.class.getMethod("test_getMethod_10", String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("test_getMethod_10", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String