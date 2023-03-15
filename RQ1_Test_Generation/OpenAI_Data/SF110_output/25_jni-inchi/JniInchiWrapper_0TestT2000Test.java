// JniInchiWrapper_0Test.java
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
* It contains ten unit test cases for the {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
*/
class JniInchiWrapper_0Test {

		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * It tests the case when the input is null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi_0() throws JniInchiException {
				JniInchiInput input = null;
				assertThrows(IllegalArgumentException.class, () -> {
						JniInchiWrapper.getInchi(input);
				});
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * It tests the case when the input is not null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi_1() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * It tests the case when the input is not null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi_2() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * It tests the case when the input is not null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi_3() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * It tests the case when the input is not null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi_4() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * It tests the case when the input is not null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi_5() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * It tests the case when the input is not null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi_6() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * It tests the case when the input is not null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi_7() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * It tests the case when the input is not null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi_8() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * It tests the case when the input is not null.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi_9() throws JniInchiException {
				JniIn