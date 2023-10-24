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
    * It tests the method with the default user directory.
    */
    @Test
    void testNewFSPath() {
        FSPath path = FSPathFactory.newFSPath();
        assertNotNull(path);
        assertTrue(path instanceof DefaultFSPath);
        assertEquals(System.getProperty("user.dir"), path.toString());
    }

    /**
    * Test case for {@link FSPathFactory#newFSPath(String)}.
    * It tests the method with a non-null argument.
    */
    @Test
    void testNewFSPathString() {
        String path = "C:\\Users\\kbishop";
        FSPath fsPath = FSPathFactory.newFSPath(path);
        assertNotNull(fsPath);
        assertTrue(fsPath instanceof DefaultFSPath);
        assertEquals(path, fsPath.toString());
    }

    /**
    * Test case for {@link FSPathFactory#newFSPath(String)}.
    * It tests the method with a null argument.
    */
    @Test
    void testNewFSPathStringNull() {
        FSPath fsPath = FSPathFactory.newFSPath(null);
        assertNotNull(fsPath);
        assertTrue(fsPath instanceof DefaultFSPath);
        assertEquals(System.getProperty("user.dir"), fsPath.toString());
    }

    /**
    * Test case for {@link FSPathFactory#newFSPath(File)}.
    * It tests the method with a non-null argument.
    */
    @Test
    void testNewFSPathFile() {
        File file = new File("C:\\Users\\kbishop");
        FSPath fsPath = FSPathFactory.newFSPath(file);
        assertNotNull(fsPath);
        assertTrue(fsPath instanceof DefaultFSPath);
        assertEquals(file.getAbsolutePath(), fsPath.toString());
    }

    /**
    * Test case for {@link FSPathFactory#newFSPath(File)}.
    * It tests the method with a null argument.
    */
    @Test
    void testNewFSPathFileNull() {
        FSPath fsPath = FSPathFactory.newFSPath((File) null);
        assertNotNull(fsPath);
        assertTrue(fsPath instanceof DefaultFSPath);
        assertEquals(System.getProperty("user.dir"), fsPath.toString());
    }
}
