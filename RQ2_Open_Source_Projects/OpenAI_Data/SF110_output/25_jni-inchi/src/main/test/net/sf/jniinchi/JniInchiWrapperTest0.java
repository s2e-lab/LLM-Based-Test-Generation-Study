// JniInchiWrapperTest0.java
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
class JniInchiWrapperTest0 {

		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", output.getInchiKey());
				assertEquals("AuxInfo=1/1/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;/rD:+1;+2;+3;+4;+5;+6", output.getAuxInfo());
				assertEquals("Warning: Empty structure", output.getMessage());
				assertEquals("", output.getLog());
				assertEquals(0, output.getReturnStatus());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi1() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", output.getInchiKey());
				assertEquals("AuxInfo=1/1/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;/rD:+1;+2;+3;+4;+5;+6", output.getAuxInfo());
				assertEquals("Warning: Empty structure", output.getMessage());
				assertEquals("", output.getLog());
				assertEquals(0, output.getReturnStatus());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi2() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", output.getInchiKey());
				assertEquals("AuxInfo=1/1/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;/rD:+1;+2;+3;+4;+5;+6", output.getAuxInfo());
				assertEquals("Warning: Empty structure", output.getMessage());
				assertEquals("", output.getLog());
				assertEquals(0, output.getReturnStatus());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi3() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", output.getInchiKey());
				assertEquals("AuxInfo=1/1/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;/rD:+1;+2;+3;+4;+5;+6", output.getAuxInfo());
				assertEquals("Warning: Empty structure", output.getMessage());
				assertEquals("", output.getLog());
				assertEquals(0, output.getReturnStatus());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchi4() throws JniInchiException {
				JniInchiInput input = new JniInchiInput("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutput output = JniInchiWrapper.getInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
				assertEquals("InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N", output.getInchiKey());
				assertEquals("AuxInfo=1/1/N:1,2,3,4,5,6/E:(1,2,3,4,5,6)/rA:6CCCCCC/rB:s1;s2;s3;s4;s5;s6;/rC:;;;;;;;;/rD:+1;+2;+3;+4;+5;+6", output.getAuxInfo());
				assertEquals("Warning: Empty structure", output.getMessage());
				assertEquals("", output.getLog());
				assertEquals(0, output.getReturnStatus());
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchi(JniInchiInput)} method.
		 * @th