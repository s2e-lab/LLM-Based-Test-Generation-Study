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
		* Test case 1 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is null.
		* The expected result is null.
		*/
		@Test
		void testSingle2plannar1() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(null);
				assertNull(basePara.single2plannar());
		}
		
		/**
		* Test case 2 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is empty.
		* The expected result is null.
		*/
		@Test
		void testSingle2plannar2() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(new String[0]);
				assertNull(basePara.single2plannar());
		}
		
		/**
		* Test case 3 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is odd.
		* The expected result is null.
		*/
		@Test
		void testSingle2plannar3() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(new String[]{"a","b","c"});
				assertNull(basePara.single2plannar());
		}
		
		/**
		* Test case 4 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is even.
		* The expected result is not null.
		*/
		@Test
		void testSingle2plannar4() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(new String[]{"a","b","c","d"});
				assertNotNull(basePara.single2plannar());
		}
		
		/**
		* Test case 5 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is even.
		* The expected result is not null.
		*/
		@Test
		void testSingle2plannar5() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(new String[]{"a","b","c","d","e","f"});
				assertNotNull(basePara.single2plannar());
		}
		
		/**
		* Test case 6 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is even.
		* The expected result is not null.
		*/
		@Test
		void testSingle2plannar6() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(new String[]{"a","b","c","d","e","f","g","h"});
				assertNotNull(basePara.single2plannar());
		}
		
		/**
		* Test case 7 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is even.
		* The expected result is not null.
		*/
		@Test
		void testSingle2plannar7() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(new String[]{"a","b","c","d","e","f","g","h","i","j"});
				assertNotNull(basePara.single2plannar());
		}
		
		/**
		* Test case 8 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is even.
		* The expected result is not null.
		*/
		@Test
		void testSingle2plannar8() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l"});
				assertNotNull(basePara.single2plannar());
		}
		
		/**
		* Test case 9 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is even.
		* The expected result is not null.
		*/
		@Test
		void testSingle2plannar9() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n"});
				assertNotNull(basePara.single2plannar());
		}
		
		/**
		* Test case 10 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is even.
		* The expected result is not null.
		*/
		@Test
		void testSingle2plannar10() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"});
				assertNotNull(basePara.single2plannar());
		}
}

// BaseParaTest2.java
package com.hf.sfm.util;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BasePara}.
* It contains ten unit test cases for the {@link BasePara#single2plannar()} method.
*/
class BaseParaTest2 {
		
		/**
		* Test case 1 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is null.
		* The expected result is null.
		*/
		@Test
		void testSingle2plannar1() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(null);
				assertNull(basePara.single2plannar());
		}
		
		/**
		* Test case 2 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is empty.
		* The expected result is null.
		*/
		@Test
		void testSingle2plannar2() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(new String[0]);
				assertNull(basePara.single2plannar());
		}
		
		/**
		* Test case 3 for {@link BasePara#single2plannar()}.
		* The test case is for the situation that the queryparams is odd.
		* The expected result is null.
		*/
		@Test
		void testSingle2plannar3() {
				BasePara basePara = new BasePara();
				basePara.setQueryparams(new String[]{"a","b","c"});
				assertNull(basePara.single2plannar());
		}
		
		/**
		* Test case 4 for