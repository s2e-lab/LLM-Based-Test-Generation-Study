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

    @Test
    void test1() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, false);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test2() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test3() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, false);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test4() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test5() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, false);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test6() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test7() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, false);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test8() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test9() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, false);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test10() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }
}

// JniInchiWrapper_2Test.java
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
class JniInchiWrapper_2Test {
		
    @Test
    void test1() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, false);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test2() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test3() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, false);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test4() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test5() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, false);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test6() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test7() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, false);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test8() throws JniInchiException {
        String inchi = "InChI=1S/C6H6O/c1-2-4-6-5-3-1/h1-6H";
        INCHI_STATUS retStatus = JniInchiWrapper.checkInchi(inchi, true);
        assertEquals(INCHI_STATUS.INCHI_OK, retStatus);
    }

    @Test
    void test9() throws JniInchiException {
        String