// JniInchiWrapper_2Test.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiWrapper}.
* It contains ten unit test cases for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
*/
class JniInchiWrapper_2Test {

		/**
		* Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		* It tests the case when the input is null.
		*/
		@Test
		void testGetInchiFromInchi_1() throws Exception {
				JniInchiInputInchi input = null;
				assertThrows(IllegalArgumentException.class, () -> {
						JniInchiWrapper.getInchiFromInchi(input);
				});
		}
		
		/**
		* Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		* It tests the case when the input is empty.
		*/
		@Test
		void testGetInchiFromInchi_2() throws Exception {
				JniInchiInputInchi input = new JniInchiInputInchi("");
				assertThrows(JniInchiException.class, () -> {
						JniInchiWrapper.getInchiFromInchi(input);
				});
		}
		
		/**
		* Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		* It tests the case when the input is not an InChI string.
		*/
		@Test
		void testGetInchiFromInchi_3() throws Exception {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				assertThrows(JniInchiException.class, () -> {
						JniInchiWrapper.getInchiFromInchi(input);
				});
		}
		
		/**
		* Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		* It tests the case when the input is an InChI string.
		*/
		@Test
		void testGetInchiFromInchi_4() throws Exception {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+");
				JniInchiOutput output = JniInchiWrapper.getInchiFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+", output.getInchi());
		}
		
		/**
		* Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		* It tests the case when the input is an InChI string and the options are null.
		*/
		@Test
		void testGetInchiFromInchi_5() throws Exception {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+", null);
				JniInchiOutput output = JniInchiWrapper.getInchiFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+", output.getInchi());
		}
		
		/**
		* Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		* It tests the case when the input is an InChI string and the options are empty.
		*/
		@Test
		void testGetInchiFromInchi_6() throws Exception {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+", "");
				JniInchiOutput output = JniInchiWrapper.getInchiFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+", output.getInchi());
		}
		
		/**
		* Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		* It tests the case when the input is an InChI string and the options are not valid.
		*/
		@Test
		void testGetInchiFromInchi_7() throws Exception {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+", "InChI2InChI");
				assertThrows(JniInchiException.class, () -> {
						JniInchiWrapper.getInchiFromInchi(input);
				});
		}
		
		/**
		* Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		* It tests the case when the input is an InChI string and the options are valid.
		*/
		@Test
		void testGetInchiFromInchi_8() throws Exception {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+", "InChI2InChI /FixedH /RecMet");
				JniInchiOutput output = JniInchiWrapper.getInchiFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+", output.getInchi());
		}
		
		/**
		* Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		* It tests the case when the input is an InChI string and the options are valid.
		*/
		@Test
		void testGetInchiFromInchi_9() throws Exception {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+", "InChI2InChI /FixedH /RecMet");
				JniInchiOutput output = JniInchiWrapper.getInchiFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+", output.getInchi());
		}
		
		/**
		* Test case