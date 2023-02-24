// IscubeTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Iscube}.
 * It contains ten test cases for the {@link scenario1.Iscube#iscube()} method.
 */
class IscubeTest {
		


    @Test
    void testIscube() {
        assertTrue(Iscube.iscube(0));
        assertTrue(Iscube.iscube(1));
        assertTrue(Iscube.iscube(8));
        assertTrue(Iscube.iscube(27));
        assertTrue(Iscube.iscube(64));
        assertTrue(Iscube.iscube(125));
        assertTrue(Iscube.iscube(216));
        assertTrue(Iscube.iscube(343));
        assertTrue(Iscube.iscube(512));
        assertTrue(Iscube.iscube(729));
    }
}