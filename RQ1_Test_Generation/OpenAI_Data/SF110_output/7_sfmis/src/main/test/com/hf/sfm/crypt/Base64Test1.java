// Base64Test1.java
package com.hf.sfm.crypt;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64}.
* It contains ten unit test cases for the {@link Base64#base64ToByteArray(String)} method.
*/
class Base64Test1 {

		/**
		* Test case 1.
		* Test method with empty string.
		*/
		@Test
		void test1() {
				String s = "";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case 2.
		* Test method with string of length 1.
		*/
		@Test
		void test2() {
				String s = "a";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case 3.
		* Test method with string of length 2.
		*/
		@Test
		void test3() {
				String s = "aa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case 4.
		* Test method with string of length 3.
		*/
		@Test
		void test4() {
				String s = "aaa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(1, b.length);
				assertEquals(0, b[0]);
		}
		
		/**
		* Test case 5.
		* Test method with string of length 4.
		*/
		@Test
		void test5() {
				String s = "aaaa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(1, b.length);
				assertEquals(0, b[0]);
		}
		
		/**
		* Test case 6.
		* Test method with string of length 5.
		*/
		@Test
		void test6() {
				String s = "aaaaa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(2, b.length);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
		}
		
		/**
		* Test case 7.
		* Test method with string of length 6.
		*/
		@Test
		void test7() {
				String s = "aaaaaa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(2, b.length);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
		}
		
		/**
		* Test case 8.
		* Test method with string of length 7.
		*/
		@Test
		void test8() {
				String s = "aaaaaaa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(2, b.length);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
		}
		
		/**
		* Test case 9.
		* Test method with string of length 8.
		*/
		@Test
		void test9() {
				String s = "aaaaaaaa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(3, b.length);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
				assertEquals(0, b[2]);
		}
		
		/**
		* Test case 10.
		* Test method with string of length 9.
		*/
		@Test
		void test10() {
				String s = "aaaaaaaaa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(3, b.length);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
				assertEquals(0, b[2]);
		}
}

// Base64Test2.java
package com.hf.sfm.crypt;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64}.
* It contains ten unit test cases for the {@link Base64#base64ToByteArray(String)} method.
*/
class Base64Test2 {
		
		/**
		* Test case 1.
		* Test method with empty string.
		*/
		@Test
		void test1() {
				String s = "";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case 2.
		* Test method with string of length 1.
		*/
		@Test
		void test2() {
				String s = "a";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case 3.
		* Test method with string of length 2.
		*/
		@Test
		void test3() {
				String s = "aa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(0, b.length);
		}
		
		/**
		* Test case 4.
		* Test method with string of length 3.
		*/
		@Test
		void test4() {
				String s = "aaa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(1, b.length);
				assertEquals(0, b[0]);
		}
		
		/**
		* Test case 5.
		* Test method with string of length 4.
		*/
		@Test
		void test5() {
				String s = "aaaa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(1, b.length);
				assertEquals(0, b[0]);
		}
		
		/**
		* Test case 6.
		* Test method with string of length 5.
		*/
		@Test
		void test6() {
				String s = "aaaaa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(2, b.length);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
		}
		
		/**
		* Test case 7.
		* Test method with string of length 6.
		*/
		@Test
		void test7() {
				String s = "aaaaaa";
				byte[] b = Base64.base64ToByteArray(s);
				assertEquals(2, b.length);
				assertEquals(0, b[0]);
				assertEquals(0, b[1]);
		}
		
		/**
		* Test case 8.
		* Test method with string of length 7.
		*/
		@Test
		void test8() {
	