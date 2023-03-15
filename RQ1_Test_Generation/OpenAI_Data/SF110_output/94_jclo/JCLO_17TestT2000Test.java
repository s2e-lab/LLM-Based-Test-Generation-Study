// JCLO_17Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#getLongs(String)} method.
*/
class JCLO_17Test {

		/**
		* Test case 1 for {@link JCLO#getLongs(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetLongs_1() {
				JCLO jclo = new JCLO(new JCLO_17Test_1());
				jclo.parse(new String[]{"-longs", "1", "2", "3"});
				long[] expected = {1, 2, 3};
				long[] actual = jclo.getLongs("longs");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link JCLO#getLongs(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetLongs_2() {
				JCLO jclo = new JCLO(new JCLO_17Test_2());
				jclo.parse(new String[]{"-longs", "1", "2", "3"});
				long[] expected = {1, 2, 3};
				long[] actual = jclo.getLongs("longs");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link JCLO#getLongs(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetLongs_3() {
				JCLO jclo = new JCLO(new JCLO_17Test_3());
				jclo.parse(new String[]{"-longs", "1", "2", "3"});
				long[] expected = {1, 2, 3};
				long[] actual = jclo.getLongs("longs");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link JCLO#getLongs(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetLongs_4() {
				JCLO jclo = new JCLO(new JCLO_17Test_4());
				jclo.parse(new String[]{"-longs", "1", "2", "3"});
				long[] expected = {1, 2, 3};
				long[] actual = jclo.getLongs("longs");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link JCLO#getLongs(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetLongs_5() {
				JCLO jclo = new JCLO(new JCLO_17Test_5());
				jclo.parse(new String[]{"-longs", "1", "2", "3"});
				long[] expected = {1, 2, 3};
				long[] actual = jclo.getLongs("longs");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link JCLO#getLongs(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetLongs_6() {
				JCLO jclo = new JCLO(new JCLO_17Test_6());
				jclo.parse(new String[]{"-longs", "1", "2", "3"});
				long[] expected = {1, 2, 3};
				long[] actual = jclo.getLongs("longs");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link JCLO#getLongs(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetLongs_7() {
				JCLO jclo = new JCLO(new JCLO_17Test_7());
				jclo.parse(new String[]{"-longs", "1", "2", "3"});
				long[] expected = {1, 2, 3};
				long[] actual = jclo.getLongs("longs");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link JCLO#getLongs(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetLongs_8() {
				JCLO jclo = new JCLO(new JCLO_17Test_8());
				jclo.parse(new String[]{"-longs", "1", "2", "3"});
				long[] expected = {1, 2, 3};
				long[] actual = jclo.getLongs("longs");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link JCLO#getLongs(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetLongs_9() {
				JCLO jclo = new JCLO(new JCLO_17Test_9());
				jclo.parse(new String[]{"-longs", "1", "2", "3"});
				long[] expected = {1, 2, 3};
				long[] actual = jclo.getLongs("longs");
				assertArrayEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link JCLO#getLongs(String)} method.
		* It tests the method with a valid argument.
		*/
		@Test
		void testGetLongs_10() {
				JCLO jclo = new JCLO(new JCLO_17Test_10());
				jclo.parse(new String[]{"-longs", "1", "2", "3"});
				long[] expected = {1, 2, 3};
				long[] actual = jclo.getLongs("longs");
				assertArrayEquals(expected, actual);
		}
}

class JCLO_17Test_1 {
		public long[] longs;
}

class JCLO_17Test_2 {
		public long longs[];
}

class JCLO_17Test_3 {
		public long[] longs[];
}

class JCLO_17Test_4 {
		public long longs[][];
}

class JCLO_17Test_5 {
		public long[] longs[][];
}

class JCLO_17Test_6 {
		public long longs[][][];
}

class JCLO_17Test_7 {
		public long[] longs[][][];
}

class JCLO_17Test_8 {
		public long longs[][][][];
}

class JCLO_17Test_9 {
		public long[] longs[][][][];
}

class JCLO_17Test_10 {
		public long longs[][][][][];
}

// JCLO_18Test.java