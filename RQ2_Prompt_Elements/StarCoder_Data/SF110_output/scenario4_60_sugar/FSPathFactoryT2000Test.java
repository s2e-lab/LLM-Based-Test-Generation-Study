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
     * Test of newFSPath method, of class FSPathFactory.
     */
    @Test
    void testNewFSPath() {
        System.out.println("newFSPath");
        FSPath result = FSPathFactory.newFSPath();
        assertNotNull(result);
    }

    /**
     * Test of newFSPath method, of class FSPathFactory.
     */
    @Test
    void testNewFSPathFile() {
        System.out.println("newFSPath");
        File file = new File(".");
        FSPath result = FSPathFactory.newFSPath(file);
        assertNotNull(result);
    }

    /**
     * Test of newFSPath method, of class FSPathFactory.
     */
    @Test
    void testNewFSPathString() {
        System.out.println("newFSPath");
        String path = ".";
        FSPath result = FSPathFactory.newFSPath(path);
        assertNotNull(result);
    }
}

// FSPathTest.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPath}.
* It contains ten unit test cases for the {@link FSPath#find(String)} method.
*/
class FSPathTest {

    /**
     * Test of find method, of class FSPath.
     */
    @Test
    void testFind() {
        System.out.println("find");
        String path = ".";
        FSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.java");
        assertTrue(result.size() > 0);
    }

    /**
     * Test of find method, of class FSPath.
     */
    @Test
    void testFindWithNoResults() {
        System.out.println("find");
        String path = ".";
        FSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class FSPath.
     */
    @Test
    void testFindWithNoResults2() {
        System.out.println("find");
        String path = ".";
        FSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class FSPath.
     */
    @Test
    void testFindWithNoResults3() {
        System.out.println("find");
        String path = ".";
        FSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class FSPath.
     */
    @Test
    void testFindWithNoResults4() {
        System.out.println("find");
        String path = ".";
        FSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class FSPath.
     */
    @Test
    void testFindWithNoResults5() {
        System.out.println("find");
        String path = ".";
        FSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class FSPath.
     */
    @Test
    void testFindWithNoResults6() {
        System.out.println("find");
        String path = ".";
        FSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class FSPath.
     */
    @Test
    void testFindWithNoResults7() {
        System.out.println("find");
        String path = ".";
        FSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class FSPath.
     */
    @Test
    void testFindWithNoResults8() {
        System.out.println("find");
        String path = ".";
        FSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class FSPath.
     */
    @Test
    void testFindWithNoResults9() {
        System.out.println("find");
        String path = ".";
        FSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class FSPath.
     */
    @Test
    void testFindWithNoResults10() {
        System.out.println("find");
        String path = ".";
        FSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }
}

// DefaultFSPath.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultFSPath}.
* It contains ten unit test cases for the {@link DefaultFSPath#find(String)} method.
*/
class DefaultFSPathTest {

    /**
     * Test of find method, of class DefaultFSPath.
     */
    @Test
    void testFind() {
        System.out.println("find");
        String path = ".";
        DefaultFSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.java");
        assertTrue(result.size() > 0);
    }

    /**
     * Test of find method, of class DefaultFSPath.
     */
    @Test
    void testFindWithNoResults() {
        System.out.println("find");
        String path = ".";
        DefaultFSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class DefaultFSPath.
     */
    @Test
    void testFindWithNoResults2() {
        System.out.println("find");
        String path = ".";
        DefaultFSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class DefaultFSPath.
     */
    @Test
    void testFindWithNoResults3() {
        System.out.println("find");
        String path = ".";
        DefaultFSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class DefaultFSPath.
     */
    @Test
    void testFindWithNoResults4() {
        System.out.println("find");
        String path = ".";
        DefaultFSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class DefaultFSPath.
     */
    @Test
    void testFindWithNoResults5() {
        System.out.println("find");
        String path = ".";
        DefaultFSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class DefaultFSPath.
     */
    @Test
    void testFindWithNoResults6() {
        System.out.println("find");
        String path = ".";
        DefaultFSPath instance = new DefaultFSPath(path);
        List<File> result = instance.find("*.class");
        assertTrue(result.size() == 0);
    }

    /**
     * Test of find method, of class DefaultFSPath.
     */
    @Test
    void testFindWithNoResults7() {
        System.out.println("find");
        String path = ".";
        DefaultFSPath instance = new DefaultFSPath(path);
       