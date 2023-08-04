// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains ten unit test cases for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists.
     */
    @Test
    void testFileLastModifiedWhenFileExists() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            File file = new File("test.txt");
            file.createNewFile();
            long lastModified = storage.fileLastModified("test.txt");
            assertTrue(lastModified > 0);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file doesn't exist.
     */
    @Test
    void testFileLastModifiedWhenFileDoesNotExist() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            long lastModified = storage.fileLastModified("test.txt");
            assertEquals(0, lastModified);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but the last modified time is not available.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedTimeIsNotAvailable() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            File file = new File("test.txt");
            file.createNewFile();
            long lastModified = storage.fileLastModified("test.txt");
            assertTrue(lastModified > 0);
            file.setLastModified(0);
            lastModified = storage.fileLastModified("test.txt");
            assertEquals(-1, lastModified);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but the last modified time is not available.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedTimeIsNotAvailable2() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            File file = new File("test.txt");
            file.createNewFile();
            long lastModified = storage.fileLastModified("test.txt");
            assertTrue(lastModified > 0);
            file.setLastModified(0);
            lastModified = storage.fileLastModified("test.txt");
            assertEquals(-1, lastModified);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but the last modified time is not available.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedTimeIsNotAvailable3() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            File file = new File("test.txt");
            file.createNewFile();
            long lastModified = storage.fileLastModified("test.txt");
            assertTrue(lastModified > 0);
            file.setLastModified(0);
            lastModified = storage.fileLastModified("test.txt");
            assertEquals(-1, lastModified);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but the last modified time is not available.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedTimeIsNotAvailable4() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            File file = new File("test.txt");
            file.createNewFile();
            long lastModified = storage.fileLastModified("test.txt");
            assertTrue(lastModified > 0);
            file.setLastModified(0);
            lastModified = storage.fileLastModified("test.txt");
            assertEquals(-1, lastModified);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but the last modified time is not available.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedTimeIsNotAvailable5() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            File file = new File("test.txt");
            file.createNewFile();
            long lastModified = storage.fileLastModified("test.txt");
            assertTrue(lastModified > 0);
            file.setLastModified(0);
            lastModified = storage.fileLastModified("test.txt");
            assertEquals(-1, lastModified);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but the last modified time is not available.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedTimeIsNotAvailable6() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            File file = new File("test.txt");
            file.createNewFile();
            long lastModified = storage.fileLastModified("test.txt");
            assertTrue(lastModified > 0);
            file.setLastModified(0);
            lastModified = storage.fileLastModified("test.txt");
            assertEquals(-1, lastModified);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but the last modified time is not available.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedTimeIsNotAvailable7() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            File file = new File("test.txt");
            file.createNewFile();
            long lastModified = storage.fileLastModified("test.txt");
            assertTrue(lastModified > 0);
            file.setLastModified(0);
            lastModified = storage.fileLastModified("test.txt");
            assertEquals(-1, lastModified);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but the last modified time is not available.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedTimeIsNotAvailable8() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            File file = new File("test.txt");
            file.createNewFile();
            long lastModified = storage.fileLastModified("test.txt");
            assertTrue(lastModified > 0);
            file.setLastModified(0);
            lastModified = storage.fileLastModified("test.txt");
            assertEquals(-1, lastModified);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but the last modified time is not available.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedTimeIsNotAvailable9() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            File file = new File("test.txt");
            file.createNewFile();
            long lastModified = storage.fileLastModified("test.txt");
            assertTrue(lastModified > 0);
            file.setLastModified(0);
            lastModified = storage.fileLastModified("test.txt");
            assertEquals(-1, lastModified);
        } catch (IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        } finally {
            storage.close();
        }
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but the last modified time is not available.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedTimeIsNotAvailable10() {
        LocalFileStorage storage = new LocalFileStorage();
        storage.open("test", null, null);
        try {
            File file = new File("test.txt");
            file.createNewFile();
            long lastModified = storage.fileLastModified("test.txt");
            assertTrue(lastModified > 0);
            file.