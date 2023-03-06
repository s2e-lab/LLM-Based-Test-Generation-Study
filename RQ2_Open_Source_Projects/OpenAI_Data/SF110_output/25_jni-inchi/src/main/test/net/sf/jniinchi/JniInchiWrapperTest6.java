// JniInchiWrapperTest6.java
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
* It contains ten unit test cases for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
*/
class JniInchiWrapperTest6 {

		/**
		* Test case 1.
		* <p>
		* This test case checks the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
		* </p>
		* @throws JniInchiException
		*/
		@Test
		void testCheckInchi1() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
				boolean strict = false;
				INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, strict);
				assertEquals(INCHI_STATUS.OKAY, status);
		}
		
		/**
		* Test case 2.
		* <p>
		* This test case checks the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
		* </p>
		* @throws JniInchiException
		*/
		@Test
		void testCheckInchi2() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
				boolean strict = true;
				INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, strict);
				assertEquals(INCHI_STATUS.OKAY, status);
		}
		
		/**
		* Test case 3.
		* <p>
		* This test case checks the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
		* </p>
		* @throws JniInchiException
		*/
		@Test
		void testCheckInchi3() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
				boolean strict = false;
				INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, strict);
				assertEquals(INCHI_STATUS.OKAY, status);
		}
		
		/**
		* Test case 4.
		* <p>
		* This test case checks the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
		* </p>
		* @throws JniInchiException
		*/
		@Test
		void testCheckInchi4() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
				boolean strict = true;
				INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, strict);
				assertEquals(INCHI_STATUS.OKAY, status);
		}
		
		/**
		* Test case 5.
		* <p>
		* This test case checks the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
		* </p>
		* @throws JniInchiException
		*/
		@Test
		void testCheckInchi5() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/p-1";
				boolean strict = false;
				INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, strict);
				assertEquals(INCHI_STATUS.OKAY, status);
		}
		
		/**
		* Test case 6.
		* <p>
		* This test case checks the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
		* </p>
		* @throws JniInchiException
		*/
		@Test
		void testCheckInchi6() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/p-1";
				boolean strict = true;
				INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, strict);
				assertEquals(INCHI_STATUS.OKAY, status);
		}
		
		/**
		* Test case 7.
		* <p>
		* This test case checks the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
		* </p>
		* @throws JniInchiException
		*/
		@Test
		void testCheckInchi7() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1";
				boolean strict = false;
				INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, strict);
				assertEquals(INCHI_STATUS.OKAY, status);
		}
		
		/**
		* Test case 8.
		* <p>
		* This test case checks the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
		* </p>
		* @throws JniInchiException
		*/
		@Test
		void testCheckInchi8() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1";
				boolean strict = true;
				INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, strict);
				assertEquals(INCHI_STATUS.OKAY, status);
		}
		
		/**
		* Test case 9.
		* <p>
		* This test case checks the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
		* </p>
		* @throws JniInchiException
		*/
		@Test
		void testCheckInchi9() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1";
				boolean strict = false;
				INCHI_STATUS status = JniInchiWrapper.checkInchi(inchi, strict);
				assertEquals(INCHI_STATUS.OKAY, status);
		}
		
		/**
		* Test case 10.
		* <p>
		* This test case checks the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
		* </p>
		* @throws JniInchiException
		*/
		@Test
		void testCheckInchi10() throws JniInchiException {
				