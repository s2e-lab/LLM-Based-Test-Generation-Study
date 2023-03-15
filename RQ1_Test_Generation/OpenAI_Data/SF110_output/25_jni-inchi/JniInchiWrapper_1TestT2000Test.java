// JniInchiWrapper_1Test.java
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
* It contains ten unit test cases for the {@link JniInchiWrapper#getStdInchi(JniInchiInput)} method.
*/
class JniInchiWrapper_1Test {

		/**
		 * Test of getStdInchi method, of class JniInchiWrapper.
		 * @throws net.sf.jniinchi.JniInchiException
		 */
		@Test
		void testGetStdInchi_1() throws JniInchiException {
				System.out.println("getStdInchi");
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput result = JniInchiWrapper.getStdInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", result.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", result.getInchiKey());
				assertEquals("AuxInfo=1/1/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;", result.getAuxInfo());
				assertEquals("", result.getMessage());
				assertEquals("OK", result.getReturnStatus());
				assertEquals(0, result.getWarningFlags());
				assertEquals(0, result.getErrorFlags());
		}
		
		/**
		 * Test of getStdInchi method, of class JniInchiWrapper.
		 * @throws net.sf.jniinchi.JniInchiException
		 */
		@Test
		void testGetStdInchi_2() throws JniInchiException {
				System.out.println("getStdInchi");
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput result = JniInchiWrapper.getStdInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", result.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", result.getInchiKey());
				assertEquals("AuxInfo=1/1/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;", result.getAuxInfo());
				assertEquals("", result.getMessage());
				assertEquals("OK", result.getReturnStatus());
				assertEquals(0, result.getWarningFlags());
				assertEquals(0, result.getErrorFlags());
		}
		
		/**
		 * Test of getStdInchi method, of class JniInchiWrapper.
		 * @throws net.sf.jniinchi.JniInchiException
		 */
		@Test
		void testGetStdInchi_3() throws JniInchiException {
				System.out.println("getStdInchi");
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput result = JniInchiWrapper.getStdInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", result.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", result.getInchiKey());
				assertEquals("AuxInfo=1/1/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;", result.getAuxInfo());
				assertEquals("", result.getMessage());
				assertEquals("OK", result.getReturnStatus());
				assertEquals(0, result.getWarningFlags());
				assertEquals(0, result.getErrorFlags());
		}
		
		/**
		 * Test of getStdInchi method, of class JniInchiWrapper.
		 * @throws net.sf.jniinchi.JniInchiException
		 */
		@Test
		void testGetStdInchi_4() throws JniInchiException {
				System.out.println("getStdInchi");
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput result = JniInchiWrapper.getStdInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", result.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", result.getInchiKey());
				assertEquals("AuxInfo=1/1/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;", result.getAuxInfo());
				assertEquals("", result.getMessage());
				assertEquals("OK", result.getReturnStatus());
				assertEquals(0, result.getWarningFlags());
				assertEquals(0, result.getErrorFlags());
		}
		
		/**
		 * Test of getStdInchi method, of class JniInchiWrapper.
		 * @throws net.sf.jniinchi.JniInchiException
		 */
		@Test
		void testGetStdInchi_5() throws JniInchiException {
				System.out.println("getStdInchi");
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput result = JniInchiWrapper.getStdInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", result.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", result.getInchiKey());
				assertEquals("AuxInfo=1/1/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s