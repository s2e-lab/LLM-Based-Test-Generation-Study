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
* It contains ten unit test cases for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
*/
class JniInchiWrapper_1Test {

    /**
     * <p>Test of {@link JniInchiWrapper#checkInchi(String, boolean)} method, of class {@link JniInchiWrapper}.
     *
     * <p>Test of the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
     */
    @Test
    void testCheckInchi_01() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = false;
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * <p>Test of {@link JniInchiWrapper#checkInchi(String, boolean)} method, of class {@link JniInchiWrapper}.
     *
     * <p>Test of the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
     */
    @Test
    void testCheckInchi_02() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = true;
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * <p>Test of {@link JniInchiWrapper#checkInchi(String, boolean)} method, of class {@link JniInchiWrapper}.
     *
     * <p>Test of the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
     */
    @Test
    void testCheckInchi_03() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = false;
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * <p>Test of {@link JniInchiWrapper#checkInchi(String, boolean)} method, of class {@link JniInchiWrapper}.
     *
     * <p>Test of the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
     */
    @Test
    void testCheckInchi_04() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = true;
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * <p>Test of {@link JniInchiWrapper#checkInchi(String, boolean)} method, of class {@link JniInchiWrapper}.
     *
     * <p>Test of the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
     */
    @Test
    void testCheckInchi_05() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = false;
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * <p>Test of {@link JniInchiWrapper#checkInchi(String, boolean)} method, of class {@link JniInchiWrapper}.
     *
     * <p>Test of the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
     */
    @Test
    void testCheckInchi_06() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = true;
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * <p>Test of {@link JniInchiWrapper#checkInchi(String, boolean)} method, of class {@link JniInchiWrapper}.
     *
     * <p>Test of the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
     */
    @Test
    void testCheckInchi_07() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = false;
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * <p>Test of {@link JniInchiWrapper#checkInchi(String, boolean)} method, of class {@link JniInchiWrapper}.
     *
     * <p>Test of the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
     */
    @Test
    void testCheckInchi_08() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = true;
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * <p>Test of {@link JniInchiWrapper#checkInchi(String, boolean)} method, of class {@link JniInchiWrapper}.
     *
     * <p>Test of the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
     */
    @Test
    void testCheckInchi_09() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = false;
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * <p>Test of {@link JniInchiWrapper#checkInchi(String, boolean)} method, of class {@link JniInchiWrapper}.
     *
     * <p>Test of the {@link JniInchiWrapper#checkInchi(String, boolean)} method with a valid InChI string.
     */
    @Test
    void testCheckInchi_10() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O/c1-2-4-6-5-3