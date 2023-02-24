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
* It contains ten test cases for the {@link Iscube#iscube()} method.
*/
class IscubeTest {


    @Test
    void testIscube() {
        assertEquals(true, Iscube.iscube(27));
        assertEquals(true, Iscube.iscube(0));
        assertEquals(true, Iscube.iscube(1));
        assertEquals(true, Iscube.iscube(-1));
        assertEquals(true, Iscube.iscube(-27));
        assertEquals(false, Iscube.iscube(3));
        assertEquals(false, Iscube.iscube(-4));
        assertEquals(false, Iscube.iscube(26));
        assertEquals(false, Iscube.iscube(-25));
        assertEquals(false, Iscube.iscube(28));
    }
}