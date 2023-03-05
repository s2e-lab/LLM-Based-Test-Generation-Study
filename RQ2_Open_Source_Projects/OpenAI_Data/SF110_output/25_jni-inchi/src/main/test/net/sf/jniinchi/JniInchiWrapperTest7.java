// JniInchiWrapperTest7.java
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
* It contains ten unit test cases for the {@link JniInchiWrapper#getInputFromAuxInfo(String)} method.
*/
class JniInchiWrapperTest7 {

		/**
		* Test case 1.
		* Test method: {@link JniInchiWrapper#getInputFromAuxInfo(String)}.
		* Test data: AuxInfo with one atom.
		* Expected result: JniInchiInputData object with one atom.
		*/
		@Test
		void testGetInputFromAuxInfo1() throws JniInchiException {
				String auxInfo = "AuxInfo=1/0/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/";
				JniInchiInputData inputData = JniInchiWrapper.getInputFromAuxInfo(auxInfo);
				assertEquals(1, inputData.getNumAtoms());
		}
		
		/**
		* Test case 2.
		* Test method: {@link JniInchiWrapper#getInputFromAuxInfo(String)}.
		* Test data: AuxInfo with two atoms.
		* Expected result: JniInchiInputData object with two atoms.
		*/
		@Test
		void testGetInputFromAuxInfo2() throws JniInchiException {
				String auxInfo = "AuxInfo=2/0/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/";
				JniInchiInputData inputData = JniInchiWrapper.getInputFromAuxInfo(auxInfo);
				assertEquals(2, inputData.getNumAtoms());
		}
		
		/**
		* Test case 3.
		* Test method: {@link JniInchiWrapper#getInputFromAuxInfo(String)}.
		* Test data: AuxInfo with one atom and one bond.
		* Expected result: JniInchiInputData object with one atom and one bond.
		*/
		@Test
		void testGetInputFromAuxInfo3() throws JniInchiException {
				String auxInfo = "AuxInfo=1/1/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/";
				JniInchiInputData inputData = JniInchiWrapper.getInputFromAuxInfo(auxInfo);
				assertEquals(1, inputData.getNumAtoms());
				assertEquals(1, inputData.getNumBonds());
		}
		
		/**
		* Test case 4.
		* Test method: {@link JniInchiWrapper#getInputFromAuxInfo(String)}.
		* Test data: AuxInfo with two atoms and one bond.
		* Expected result: JniInchiInputData object with two atoms and one bond.
		*/
		@Test
		void testGetInputFromAuxInfo4() throws JniInchiException {
				String auxInfo = "AuxInfo=2/1/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/";
				JniInchiInputData inputData = JniInchiWrapper.getInputFromAuxInfo(auxInfo);
				assertEquals(2, inputData.getNumAtoms());
				assertEquals(1, inputData.getNumBonds());
		}
		
		/**
		* Test case 5.
		* Test method: {@link JniInchiWrapper#getInputFromAuxInfo(String)}.
		* Test data: AuxInfo with one atom and two bonds.
		* Expected result: JniInchiInputData object with one atom and two bonds.
		*/
		@Test
		void testGetInputFromAuxInfo5() throws JniInchiException {
				String auxInfo = "AuxInfo=1/2/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/";
				JniInchiInputData inputData = JniInchiWrapper.getInputFromAuxInfo(auxInfo);
				assertEquals(1, inputData.getNumAtoms());
				assertEquals(2, inputData.getNumBonds());
		}
		
		/**
		* Test case 6.
		* Test method: {@link JniInchiWrapper#getInputFromAuxInfo(String)}.
		* Test data: AuxInfo with two atoms and two bonds.
		* Expected result: JniInchiInputData object with two atoms and two bonds.
		*/
		@Test
		void testGetInputFromAuxInfo6() throws JniInchiException {
				String auxInfo = "AuxInfo=2/2/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/";
				JniInchiInputData inputData = JniInchiWrapper.getInputFromAuxInfo(auxInfo);
				assertEquals(2, inputData.getNumAtoms());
				assertEquals(2, inputData.getNumBonds());
		}
		
		/**
		* Test case 7.
		* Test method: {@link JniInchiWrapper#getInputFromAuxInfo(String)}.
		* Test data: AuxInfo with one atom and one bond and one atom label.
		* Expected result: JniInchiInputData object with one atom and one bond and one atom label.
		*/
		@Test
		void testGetInputFromAuxInfo7() throws JniInchiException {
				String auxInfo = "AuxInfo=1/1/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/N:0,0,0,0,0/E:(1,1,1,0,0)/rA:6.0/rB:1.0/rC:1.0/p:0/t:0/L:1/";
				JniInchiInputData inputData = JniInchiWrapper.getInputFromAuxInfo(auxInfo);
				assertEquals(1, inputData.getNumAtoms());
				assertEquals(1, inputData.getNum