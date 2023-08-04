// IscubeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {

    /**
    * Test case for {@link Iscube#iscube(int)} where the input is 0.
    */
    @Test
    void testIscube0() {
        assertTrue(Iscube.iscube(0));
    }

    /**
    * Test case for {@link Iscube#iscube(int)} where the input is 1.
    */
    @Test
    void testIscube1() {
        assertTrue(Iscube.iscube(1));
    }

    /**
    * Test case for {@link Iscube#iscube(int)} where the input is 8.
    */
    @Test
    void testIscube8() {
        assertTrue(Iscube.iscube(8));
    }

    /**
    * Test case for {@link Iscube#iscube(int)} where the input is 27.
    */
    @Test
    void testIscube27() {
        assertTrue(Iscube.iscube(27));
    }

    /**
    * Test case for {@link Iscube#iscube(int)} where the input is 64.
    */
    @Test
    void testIscube64() {
        assertTrue(Iscube.iscube(64));
    }

    /**
    * Test case for {@link Iscube#iscube(int)} where the input is 125.
    */
    @Test
    void testIscube125() {
        assertTrue(Iscube.iscube(125));
    }

    /**
    * Test case for {@link Iscube#iscube(int)} where the input is 216.
    */
    @Test
    void testIscube216() {
        assertTrue(Iscube.iscube(216));
    }

    /**
    * Test case for {@link Iscube#iscube(int)} where the input is 343.
    */
    @Test
    void testIscube343() {
        assertTrue(Iscube.iscube(343));
    }

    /**
    * Test case for {@link Iscube#iscube(int)} where the input is 512.
    */
    @Test
    void testIscube512() {
        assertTrue(Iscube.iscube(512));
    }

    /**
    * Test case for {@link Iscube#iscube(int)} where the input is -1.
    */
    @Test
    void testIscubeNeg1() {
        assertFalse(Iscube.iscube(-1));
    }
}
