// BaseParaTest0.java
package com.hf.sfm.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BasePara}.
* It contains ten unit test cases for the {@link BasePara#isPaging()} method.
*/
class BaseParaTest0 {

		/**
		* Test case for the {@link BasePara#isPaging()} method.
		*/
		@Test
		void testIsPaging0() {
				BasePara basePara = new BasePara();
				basePara.setPaging(true);
				assertTrue(basePara.isPaging());
		}
		
		/**
		* Test case for the {@link BasePara#isPaging()} method.
		*/
		@Test
		void testIsPaging1() {
				BasePara basePara = new BasePara();
				basePara.setPaging(false);
				assertFalse(basePara.isPaging());
		}
		
		/**
		* Test case for the {@link BasePara#isPaging()} method.
		*/
		@Test
		void testIsPaging2() {
				BasePara basePara = new BasePara();
				basePara.setPaging(true);
				assertTrue(basePara.isPaging());
		}
		
		/**
		* Test case for the {@link BasePara#isPaging()} method.
		*/
		@Test
		void testIsPaging3() {
				BasePara basePara = new BasePara();
				basePara.setPaging(false);
				assertFalse(basePara.isPaging());
		}
		
		/**
		* Test case for the {@link BasePara#isPaging()} method.
		*/
		@Test
		void testIsPaging4() {
				BasePara basePara = new BasePara();
				basePara.setPaging(true);
				assertTrue(basePara.isPaging());
		}
		
		/**
		* Test case for the {@link BasePara#isPaging()} method.
		*/
		@Test
		void testIsPaging5() {
				BasePara basePara = new BasePara();
				basePara.setPaging(false);
				assertFalse(basePara.isPaging());
		}
		
		/**
		* Test case for the {@link BasePara#isPaging()} method.
		*/
		@Test
		void testIsPaging6() {
				BasePara basePara = new BasePara();
				basePara.setPaging(true);
				assertTrue(basePara.isPaging());
		}
		
		/**
		* Test case for the {@link BasePara#isPaging()} method.
		*/
		@Test
		void testIsPaging7() {
				BasePara basePara = new BasePara();
				basePara.setPaging(false);
				assertFalse(basePara.isPaging());
		}
		
		/**
		* Test case for the {@link BasePara#isPaging()} method.
		*/
		@Test
		void testIsPaging8() {
				BasePara basePara = new BasePara();
				basePara.setPaging(true);
				assertTrue(basePara.isPaging());
		}
		
		/**
		* Test case for the {@link BasePara#isPaging()} method.
		*/
		@Test
		void testIsPaging9() {
				BasePara basePara = new BasePara();
				basePara.setPaging(false);
				assertFalse(basePara.isPaging());
		}
		
}

// BaseParaTest1.java
package com.hf.sfm.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BasePara}.
* It contains ten unit test cases for the {@link BasePara#single2plannar()} method.
*/
class BaseParaTest1 {
		
		/**
		* Test case for the {@link BasePara#single2plannar()} method.
		*/
		@Test
		void testSingle2plannar0() {
				BasePara basePara = new BasePara();
				String[] queryparams = new String[]{"a","b","c","d","e","f","g","h","i","j"};
				basePara.setQueryparams(queryparams);
				String[][] arr2params = new String[][]{{"a","b","c","d","e"},{"f","g","h","i","j"}};
				assertArrayEquals(arr2params, basePara.single2plannar());
		}
		
		/**
		* Test case for the {@link BasePara#single2plannar()} method.
		*/
		@Test
		void testSingle2plannar1() {
				BasePara basePara = new BasePara();
				String[] queryparams = new String[]{"a","b","c","d","e","f","g","h","i","j"};
				basePara.setQueryparams(queryparams);
				String[][] arr2params = new String[][]{{"a","b","c","d","e"},{"f","g","h","i","j"}};
				assertArrayEquals(arr2params, basePara.single2plannar());
		}
		
		/**
		* Test case for the {@link BasePara#single2plannar()} method.
		*/
		@Test
		void testSingle2plannar2() {
				BasePara basePara = new BasePara();
				String[] queryparams = new String[]{"a","b","c","d","e","f","g","h","i","j"};
				basePara.setQueryparams(queryparams);
				String[][] arr2params = new String[][]{{"a","b","c","d","e"},{"f","g","h","i","j"}};
				assertArrayEquals(arr2params, basePara.single2plannar());
		}
		
		/**
		* Test case for the {@link BasePara#single2plannar()} method.
		*/
		@Test
		void testSingle2plannar3() {
				BasePara basePara = new BasePara();
				String[] queryparams = new String[]{"a","b","c","d","e","f","g","h","i","j"};
				basePara.setQueryparams(queryparams);
				String[][] arr2params = new String[][]{{"a","b","c","d","e"},{"f","g","h","i","j"}};
				assertArrayEquals(arr2params, basePara.single2plannar());
		}
		
		/**
		* Test case for the {@link BasePara#single2plannar()} method.
		*/
		@Test
		void testSingle2plannar4() {
				BasePara basePara = new BasePara();
				String[] queryparams = new String[]{"a","b","c","d","e","f","g","h","i","j"};
				basePara.setQueryparams(queryparams);
				String[][] arr2params = new String[][]{{"a","b","c","d","e"},{"f","g","h","i","j"}};
		