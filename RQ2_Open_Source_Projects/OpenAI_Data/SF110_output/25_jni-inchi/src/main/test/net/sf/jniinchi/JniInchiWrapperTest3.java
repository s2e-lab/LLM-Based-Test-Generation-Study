// JniInchiWrapperTest3.java
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
class JniInchiWrapperTest3 {

		/**
		* Test case 1.
		* @throws JniInchiException
		*/
		@Test
		void testGetStructureFromInchi1() throws JniInchiException {
				JniInchiWrapper.loadLibrary();
				JniInchiWrapper.init();
				JniInchiInputInchi input = new JniInchiInputInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H");
				JniInchiOutputStructure output = JniInchiWrapper.getStructureFromInchi(input);
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getReturnStatus(), INCHI_RET.OKAY);
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
				assertEquals(output.getLog(), "");
				assertEquals(output.getAuxInfo(), "");
				assertEquals(output.getMessage(), "Structure OK. Warning: no stereo0D");
				assertEquals(output.getWarningFlags(), "Warning: no stereo0D");
			