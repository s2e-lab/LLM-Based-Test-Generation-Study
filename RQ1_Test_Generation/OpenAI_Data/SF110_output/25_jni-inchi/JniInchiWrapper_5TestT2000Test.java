// JniInchiWrapper_5Test.java
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
* It contains ten unit test cases for the {@link JniInchiWrapper#checkInchiKey(String)} method.
*/
class JniInchiWrapper_5Test {

		/**
		* Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
		* It checks if the method returns {@link INCHI_KEY_STATUS#VALID_STANDARD} for a valid standard InChIKey.
		*/
		@Test
		void testCheckInchiKey_1() throws Exception {
				String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				INCHI_KEY_STATUS status = JniInchiWrapper.checkInchiKey(inchiKey);
				assertEquals(INCHI_KEY_STATUS.VALID_STANDARD, status);
		}
		
		/**
		* Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
		* It checks if the method returns {@link INCHI_KEY_STATUS#VALID_NON_STANDARD} for a valid non-standard InChIKey.
		*/
		@Test
		void testCheckInchiKey_2() throws Exception {
				String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N-N";
				INCHI_KEY_STATUS status = JniInchiWrapper.checkInchiKey(inchiKey);
				assertEquals(INCHI_KEY_STATUS.VALID_NON_STANDARD, status);
		}
		
		/**
		* Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
		* It checks if the method returns {@link INCHI_KEY_STATUS#VALID_NON_STANDARD} for a valid non-standard InChIKey.
		*/
		@Test
		void testCheckInchiKey_3() throws Exception {
				String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N-N-N";
				INCHI_KEY_STATUS status = JniInchiWrapper.checkInchiKey(inchiKey);
				assertEquals(INCHI_KEY_STATUS.VALID_NON_STANDARD, status);
		}
		
		/**
		* Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
		* It checks if the method returns {@link INCHI_KEY_STATUS#VALID_NON_STANDARD} for a valid non-standard InChIKey.
		*/
		@Test
		void testCheckInchiKey_4() throws Exception {
				String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N-N-N-N";
				INCHI_KEY_STATUS status = JniInchiWrapper.checkInchiKey(inchiKey);
				assertEquals(INCHI_KEY_STATUS.VALID_NON_STANDARD, status);
		}
		
		/**
		* Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
		* It checks if the method returns {@link INCHI_KEY_STATUS#VALID_NON_STANDARD} for a valid non-standard InChIKey.
		*/
		@Test
		void testCheckInchiKey_5() throws Exception {
				String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N-N-N-N-N";
				INCHI_KEY_STATUS status = JniInchiWrapper.checkInchiKey(inchiKey);
				assertEquals(INCHI_KEY_STATUS.VALID_NON_STANDARD, status);
		}
		
		/**
		* Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
		* It checks if the method returns {@link INCHI_KEY_STATUS#VALID_NON_STANDARD} for a valid non-standard InChIKey.
		*/
		@Test
		void testCheckInchiKey_6() throws Exception {
				String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N-N-N-N-N-N";
				INCHI_KEY_STATUS status = JniInchiWrapper.checkInchiKey(inchiKey);
				assertEquals(INCHI_KEY_STATUS.VALID_NON_STANDARD, status);
		}
		
		/**
		* Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
		* It checks if the method returns {@link INCHI_KEY_STATUS#VALID_NON_STANDARD} for a valid non-standard InChIKey.
		*/
		@Test
		void testCheckInchiKey_7() throws Exception {
				String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N-N-N-N-N-N-N";
				INCHI_KEY_STATUS status = JniInchiWrapper.checkInchiKey(inchiKey);
				assertEquals(INCHI_KEY_STATUS.VALID_NON_STANDARD, status);
		}
		
		/**
		* Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
		* It checks if the method returns {@link INCHI_KEY_STATUS#VALID_NON_STANDARD} for a valid non-standard InChIKey.
		*/
		@Test
		void testCheckInchiKey_8() throws Exception {
				String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N-N-N-N-N-N-N-N";
				INCHI_KEY_STATUS status = JniInchiWrapper.checkInchiKey(inchiKey);
				assertEquals(INCHI_KEY_STATUS.VALID_NON_STANDARD, status);
		}
		
		/**
		* Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
		* It checks if the method returns {@link INCHI_KEY_STATUS#VALID_NON_STANDARD} for a valid non-standard InChIKey.
		*/
		@Test
		void testCheckInchiKey_9() throws Exception {
				String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N-N-N-N-N-N-N-N-N";
				INCHI_KEY_STATUS status = JniInchiWrapper.checkInchiKey(inchiKey);
				assertEquals(INCHI_KEY_STATUS.VALID_NON_STANDARD, status);
		}
		
		/**
		* Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
		* It checks if the method returns {@link INCHI_KEY_STATUS#VALID_NON_STANDARD} for a valid non-standard InChIKey.
		*/
		@Test
		void testCheckInchiKey_10() throws Exception {
				String inchiKey = "UHOVQNZJYSORNB-UHFFFAOYSA-N-N-N-N-N-N-N-N-N-N";
				INCHI_KEY_STATUS status = JniInchiWrapper.checkInchiKey(inchiKey);
				