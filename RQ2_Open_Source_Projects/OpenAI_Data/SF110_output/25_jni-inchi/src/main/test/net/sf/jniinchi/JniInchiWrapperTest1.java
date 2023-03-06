// JniInchiWrapperTest1.java
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
class JniInchiWrapperTest1 {

		/**
		 * Test case 1.
		 * @throws JniInchiException
		 */
		@Test
		void testGetStdInchi1() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getStdInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", output.getInchiKey());
				assertEquals("AuxInfo=1/0/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;/rD:+1;-2;+3;-4;+5;-6", output.getAuxInfo());
				assertEquals("Warning: no 2D or 3D coordinates", output.getMessage());
				assertEquals("Ok", output.getLog());
				assertEquals(INCHI_RET.OKAY, output.getReturnStatus());
				assertEquals(INCHI_RET.WARNING, output.getReturnStatus());
		}
		
		/**
		 * Test case 2.
		 * @throws JniInchiException
		 */
		@Test
		void testGetStdInchi2() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getStdInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", output.getInchiKey());
				assertEquals("AuxInfo=1/0/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;/rD:+1;-2;+3;-4;+5;-6", output.getAuxInfo());
				assertEquals("Warning: no 2D or 3D coordinates", output.getMessage());
				assertEquals("Ok", output.getLog());
				assertEquals(INCHI_RET.OKAY, output.getReturnStatus());
				assertEquals(INCHI_RET.WARNING, output.getReturnStatus());
		}
		
		/**
		 * Test case 3.
		 * @throws JniInchiException
		 */
		@Test
		void testGetStdInchi3() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getStdInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", output.getInchiKey());
				assertEquals("AuxInfo=1/0/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;/rD:+1;-2;+3;-4;+5;-6", output.getAuxInfo());
				assertEquals("Warning: no 2D or 3D coordinates", output.getMessage());
				assertEquals("Ok", output.getLog());
				assertEquals(INCHI_RET.OKAY, output.getReturnStatus());
				assertEquals(INCHI_RET.WARNING, output.getReturnStatus());
		}
		
		/**
		 * Test case 4.
		 * @throws JniInchiException
		 */
		@Test
		void testGetStdInchi4() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getStdInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", output.getInchiKey());
				assertEquals("AuxInfo=1/0/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;/rD:+1;-2;+3;-4;+5;-6", output.getAuxInfo());
				assertEquals("Warning: no 2D or 3D coordinates", output.getMessage());
				assertEquals("Ok", output.getLog());
				assertEquals(INCHI_RET.OKAY, output.getReturnStatus());
				assertEquals(INCHI_RET.WARNING, output.getReturnStatus());
		}
		
		/**
		 * Test case 5.
		 * @throws JniInchiException
		 */
		@Test
		void testGetStdInchi5() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getStdInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", output.getInchiKey());
				assertEquals("AuxInfo=1/0/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;/rD:+1;-2;+3;-4;+5;-6", output.getAuxInfo());
				assertEquals("Warning: no 2D or 3D coordinates", output.getMessage());
				assertEquals("Ok", output.