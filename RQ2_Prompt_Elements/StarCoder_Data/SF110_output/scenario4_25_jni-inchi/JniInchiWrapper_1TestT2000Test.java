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
     * Test of checkInchi method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testCheckInchi() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = false;
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = instance.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkInchi method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testCheckInchi_1() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = true;
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = instance.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkInchi method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testCheckInchi_2() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = false;
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = instance.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkInchi method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testCheckInchi_3() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = true;
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = instance.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkInchi method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testCheckInchi_4() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = false;
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = instance.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkInchi method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testCheckInchi_5() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = true;
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = instance.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkInchi method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testCheckInchi_6() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = false;
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = instance.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkInchi method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testCheckInchi_7() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = true;
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = instance.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkInchi method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testCheckInchi_8() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = false;
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = instance.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkInchi method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testCheckInchi_9() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = true;
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = instance.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkInchi method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testCheckInchi_10() throws JniInchiException {
        System.out.println("checkInchi");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        boolean strict = false;
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        INCHI_STATUS expResult = INCHI_STATUS.INCHI_OKAY;
        INCHI_STATUS result = instance.checkInchi(inchi, strict);
        assertEquals(expResult, result);
    }
}

// JniInchiWrapper_2Test.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java