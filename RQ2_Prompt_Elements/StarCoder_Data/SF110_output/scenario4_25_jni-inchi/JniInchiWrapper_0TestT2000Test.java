// JniInchiWrapper_0Test.java
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
* It contains ten unit test cases for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_0Test {

    /**
     * Test of getInchiKey method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testGetInchiKey() throws JniInchiException {
        System.out.println("getInchiKey");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        JniInchiOutputKey expResult = new JniInchiOutputKey("X<KEY>");
        JniInchiOutputKey result = instance.getInchiKey(inchi);
        assertEquals(expResult, result);
    }

    /**
     * Test of getInchiKey method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testGetInchiKey_1() throws JniInchiException {
        System.out.println("getInchiKey");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        JniInchiOutputKey expResult = new JniInchiOutputKey("X<KEY>");
        JniInchiOutputKey result = instance.getInchiKey(inchi);
        assertEquals(expResult, result);
    }

    /**
     * Test of getInchiKey method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testGetInchiKey_2() throws JniInchiException {
        System.out.println("getInchiKey");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        JniInchiOutputKey expResult = new JniInchiOutputKey("X<KEY>");
        JniInchiOutputKey result = instance.getInchiKey(inchi);
        assertEquals(expResult, result);
    }

    /**
     * Test of getInchiKey method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testGetInchiKey_3() throws JniInchiException {
        System.out.println("getInchiKey");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        JniInchiOutputKey expResult = new JniInchiOutputKey("X<KEY>");
        JniInchiOutputKey result = instance.getInchiKey(inchi);
        assertEquals(expResult, result);
    }

    /**
     * Test of getInchiKey method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testGetInchiKey_4() throws JniInchiException {
        System.out.println("getInchiKey");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        JniInchiOutputKey expResult = new JniInchiOutputKey("X<KEY>");
        JniInchiOutputKey result = instance.getInchiKey(inchi);
        assertEquals(expResult, result);
    }

    /**
     * Test of getInchiKey method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testGetInchiKey_5() throws JniInchiException {
        System.out.println("getInchiKey");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        JniInchiOutputKey expResult = new JniInchiOutputKey("X<KEY>");
        JniInchiOutputKey result = instance.getInchiKey(inchi);
        assertEquals(expResult, result);
    }

    /**
     * Test of getInchiKey method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testGetInchiKey_6() throws JniInchiException {
        System.out.println("getInchiKey");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        JniInchiOutputKey expResult = new JniInchiOutputKey("X<KEY>");
        JniInchiOutputKey result = instance.getInchiKey(inchi);
        assertEquals(expResult, result);
    }

    /**
     * Test of getInchiKey method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testGetInchiKey_7() throws JniInchiException {
        System.out.println("getInchiKey");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        JniInchiOutputKey expResult = new JniInchiOutputKey("X<KEY>");
        JniInchiOutputKey result = instance.getInchiKey(inchi);
        assertEquals(expResult, result);
    }

    /**
     * Test of getInchiKey method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testGetInchiKey_8() throws JniInchiException {
        System.out.println("getInchiKey");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        JniInchiOutputKey expResult = new JniInchiOutputKey("X<KEY>");
        JniInchiOutputKey result = instance.getInchiKey(inchi);
        assertEquals(expResult, result);
    }

    /**
     * Test of getInchiKey method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testGetInchiKey_9() throws JniInchiException {
        System.out.println("getInchiKey");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        JniInchiWrapper instance = JniInchiWrapper.getWrapper();
        JniInchiOutputKey expResult = new JniInchiOutputKey("X<KEY>");
        JniInchiOutputKey result = instance.getInchiKey(inchi);
        assertEquals(expResult, result);
    }
}

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
* It contains ten unit test cases for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_1Test {
		
    /**
     * Test of getInchiKey method, of class JniInchiWrapper.
     * @throws JniInchiException
     */
    @Test
    void testGetInchiKey() throws JniInchiException {
        System.out.println("getInchiKey");
        String inchi = "InChI=1S/C6H12O6/c1-2-4-6-5-3-1/h1-6H";
        Jni