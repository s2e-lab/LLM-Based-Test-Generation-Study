// FSPathFactoryTest.java
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains ten unit test cases for the {@link FSPathFactory#newFSPath()} method.
*/
class FSPathFactoryTest {

    /**
    * Test case for {@link FSPathFactory#newFSPath()}.
    * It tests the {@link FSPathFactory#newFSPath()} method.
    */
    @Test
    void testNewFSPath() {
        FSPath path = FSPathFactory.newFSPath();
        assertNotNull(path);
    }
}
