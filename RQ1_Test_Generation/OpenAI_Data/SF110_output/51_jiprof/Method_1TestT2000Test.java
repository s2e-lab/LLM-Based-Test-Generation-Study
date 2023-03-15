// Method_1Test.java
package org.objectweb.asm.jip.commons;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.jip.Type;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Method}.
* It contains ten unit test cases for the {@link Method#getMethod(java.lang.reflect.Constructor)} method.
*/
class Method_1Test {

		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Constructor)} method.
		*/
		@Test
		void testGetMethod_1() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getConstructor());
				assertEquals("<init>", method.getName());
				assertEquals("()V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Constructor)} method.
		*/
		@Test
		void testGetMethod_2() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getConstructor(String.class));
				assertEquals("<init>", method.getName());
				assertEquals("(Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Constructor)} method.
		*/
		@Test
		void testGetMethod_3() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getConstructor(String.class, String.class));
				assertEquals("<init>", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Constructor)} method.
		*/
		@Test
		void testGetMethod_4() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getConstructor(String.class, String.class, String.class));
				assertEquals("<init>", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Constructor)} method.
		*/
		@Test
		void testGetMethod_5() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getConstructor(String.class, String.class, String.class, String.class));
				assertEquals("<init>", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Constructor)} method.
		*/
		@Test
		void testGetMethod_6() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getConstructor(String.class, String.class, String.class, String.class, String.class));
				assertEquals("<init>", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Constructor)} method.
		*/
		@Test
		void testGetMethod_7() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("<init>", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Constructor)} method.
		*/
		@Test
		void testGetMethod_8() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("<init>", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Constructor)} method.
		*/
		@Test
		void testGetMethod_9() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("<init>", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Constructor)} method.
		*/
		@Test
		void testGetMethod_10() throws Exception {
				Method method = Method.getMethod(Method_1Test.class.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class));
				assertEquals("<init>", method.getName());
				assertEquals("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", method.getDescriptor());
		}
}

// Method_2Test.java
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
class Method_2Test {
		
		/**
		* Test case for the {@link Method#getMethod(java.lang.reflect.Method)} method.
		*/
		@Test
		void testGetMethod_1() throws Exception {
				Method method = Method.getMethod(Method_2Test.class.getMethod("testGetMethod_1"));
				assertEquals("testGetMethod_1", method.getName());
				assertEquals("()V", method.getDescriptor());
		}
		
		/**
		* Test case for the {@link Method#get