// JniInchiWrapperTest2.java
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
class JniInchiWrapperTest2 {

		/**
		 * Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		 * It tests the case when the input InChI string is null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiFromInchi_NullInchi() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi(null, null);
				assertThrows(IllegalArgumentException.class, () -> {
						JniInchiWrapper.getInchiFromInchi(input);
				});
		}
		
		/**
		 * Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		 * It tests the case when the input InChI string is empty.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiFromInchi_EmptyInchi() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("", null);
				assertThrows(JniInchiException.class, () -> {
						JniInchiWrapper.getInchiFromInchi(input);
				});
		}
		
		/**
		 * Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		 * It tests the case when the input InChI string is invalid.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiFromInchi_InvalidInchi() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", null);
				assertThrows(JniInchiException.class, () -> {
						JniInchiWrapper.getInchiFromInchi(input);
				});
		}
		
		/**
		 * Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		 * It tests the case when the input InChI string is valid.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiFromInchi_ValidInchi() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", null);
				JniInchiOutput output = JniInchiWrapper.getInchiFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		 * It tests the case when the input InChI string is valid and the options string is null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiFromInchi_ValidInchi_NullOptions() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", null);
				JniInchiOutput output = JniInchiWrapper.getInchiFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		 * It tests the case when the input InChI string is valid and the options string is empty.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiFromInchi_ValidInchi_EmptyOptions() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", "");
				JniInchiOutput output = JniInchiWrapper.getInchiFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		 * It tests the case when the input InChI string is valid and the options string is invalid.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiFromInchi_ValidInchi_InvalidOptions() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", "/Snon");
				assertThrows(JniInchiException.class, () -> {
						JniInchiWrapper.getInchiFromInchi(input);
				});
		}
		
		/**
		 * Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		 * It tests the case when the input InChI string is valid and the options string is valid.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiFromInchi_ValidInchi_ValidOptions() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", "/InChI2InChI");
				JniInchiOutput output = JniInchiWrapper.getInchiFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for the {@link JniInchiWrapper#getInchiFromInchi(JniInchiInputInchi)} method.
		 * It tests the case when the input InChI string is valid and the options string is valid.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiFromInchi_ValidInchi_ValidOptions2() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", "/InChI2InChI /Snon");
				JniInchiOutput output = JniInchiWrapper.getInchiFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5