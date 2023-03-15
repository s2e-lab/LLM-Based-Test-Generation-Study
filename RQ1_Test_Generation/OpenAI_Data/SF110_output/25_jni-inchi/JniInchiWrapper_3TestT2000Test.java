// JniInchiWrapper_3Test.java
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
* It contains ten unit test cases for the {@link JniInchiWrapper#getStructureFromInchi(JniInchiInputInchi)} method.
*/
class JniInchiWrapper_3Test {

		/**
		* Test case 1.
		* Test method: {@link JniInchiWrapper#getStructureFromInchi(JniInchiInputInchi)}.
		* Test data: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H"}.
		* Expected result: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H"}.
		* @throws JniInchiException
		*/
		@Test
		void testGetStructureFromInchi_1() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutputStructure output = JniInchiWrapper.getStructureFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", output.getInchi());
		}
		
		/**
		* Test case 2.
		* Test method: {@link JniInchiWrapper#getStructureFromInchi(JniInchiInputInchi)}.
		* Test data: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1"}.
		* Expected result: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1"}.
		* @throws JniInchiException
		*/
		@Test
		void testGetStructureFromInchi_2() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1");
				JniInchiOutputStructure output = JniInchiWrapper.getStructureFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1", output.getInchi());
		}
		
		/**
		* Test case 3.
		* Test method: {@link JniInchiWrapper#getStructureFromInchi(JniInchiInputInchi)}.
		* Test data: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1"}.
		* Expected result: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1"}.
		* @throws JniInchiException
		*/
		@Test
		void testGetStructureFromInchi_3() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1");
				JniInchiOutputStructure output = JniInchiWrapper.getStructureFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1", output.getInchi());
		}
		
		/**
		* Test case 4.
		* Test method: {@link JniInchiWrapper#getStructureFromInchi(JniInchiInputInchi)}.
		* Test data: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1/f/h2H"}.
		* Expected result: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1/f/h2H"}.
		* @throws JniInchiException
		*/
		@Test
		void testGetStructureFromInchi_4() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1/f/h2H");
				JniInchiOutputStructure output = JniInchiWrapper.getStructureFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1/f/h2H", output.getInchi());
		}
		
		/**
		* Test case 5.
		* Test method: {@link JniInchiWrapper#getStructureFromInchi(JniInchiInputInchi)}.
		* Test data: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1/f/h2H/i1+2"}.
		* Expected result: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1/f/h2H/i1+2"}.
		* @throws JniInchiException
		*/
		@Test
		void testGetStructureFromInchi_5() throws JniInchiException {
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1/f/h2H/i1+2");
				JniInchiOutputStructure output = JniInchiWrapper.getStructureFromInchi(input);
				assertEquals("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1/f/h2H/i1+2", output.getInchi());
		}
		
		/**
		* Test case 6.
		* Test method: {@link JniInchiWrapper#getStructureFromInchi(JniInchiInputInchi)}.
		* Test data: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1/f/h2H/i1+2/t1-/m0/s1"}.
		* Expected result: {@code "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1/p-1/f/h2H/i1+2/t1-/m0/s1"}.
		* @throws JniInchiException
		*/
		@Test
		void testGetStructureFromIn