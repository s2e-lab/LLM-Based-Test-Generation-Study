// JniInchiWrapperTest4.java
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
* It contains ten unit test cases for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapperTest4 {

		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey1() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
				assertEquals(expected, output.getKey());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey2() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
				assertEquals(expected, output.getKey());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey3() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
				assertEquals(expected, output.getKey());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey4() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
				assertEquals(expected, output.getKey());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey5() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
				assertEquals(expected, output.getKey());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey6() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1/t2-,4+";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
				assertEquals(expected, output.getKey());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey7() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1/t2-,4+/m1/s1";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
				assertEquals(expected, output.getKey());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey8() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1/t2-,4+/m1/s1/i2+1";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
				assertEquals(expected, output.getKey());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey9() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1/t2-,4+/m1/s1/i2+1/c2-1-,3-4+";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				JniIn