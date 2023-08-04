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
     * when the file exists and when it was last modified.
     */
    @Test
    void testFileLastModifiedWhenFileExists() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        String path = "src/test/resources/test-file.txt";
        long lastModified = fileStorage.fileLastModified(path);
        assertTrue(lastModified > 0);
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file doesn't exist.
     */
    @Test
    void testFileLastModifiedWhenFileDoesNotExist() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        String path = "src/test/resources/test-file-does-not-exist.txt";
        long lastModified = fileStorage.fileLastModified(path);
        assertEquals(0, lastModified);
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but when the last modified information is not avaliable.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedInfoIsNotAvaliable() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        String path = "src/test/resources/test-file-no-last-modified-info.txt";
        long lastModified = fileStorage.fileLastModified(path);
        assertEquals(-1, lastModified);
    }
}

// LocalFileStorage.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;

/**
 * A FileStorage using the local file system.
 */
public class LocalFileStorage implements FileStorage {

    /**
     * Check if a file exists and when it was last modified.
     *
     * @param path path to the file
     * @return the time when the file was last modified,
     * or -1 if that information is not avaliable,
     * or 0 if the file doesn't exists.
     */
    public long fileLastModified(String path) {
        File file = new File(path);
        if (file.exists()) {
            return file.lastModified();
        } else {
            return 0;
        }
    }
}

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
     * when the file exists and when it was last modified.
     */
    @Test
    void testFileLastModifiedWhenFileExists() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        String path = "src/test/resources/test-file.txt";
        long lastModified = fileStorage.fileLastModified(path);
        assertTrue(lastModified > 0);
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file doesn't exist.
     */
    @Test
    void testFileLastModifiedWhenFileDoesNotExist() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        String path = "src/test/resources/test-file-does-not-exist.txt";
        long lastModified = fileStorage.fileLastModified(path);
        assertEquals(0, lastModified);
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but when the last modified information is not avaliable.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedInfoIsNotAvaliable() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        String path = "src/test/resources/test-file-no-last-modified-info.txt";
        long lastModified = fileStorage.fileLastModified(path);
        assertEquals(-1, lastModified);
    }
}

// LocalFileStorage.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;

/**
 * A FileStorage using the local file system.
 */
public class LocalFileStorage implements FileStorage {

    /**
     * Check if a file exists and when it was last modified.
     *
     * @param path path to the file
     * @return the time when the file was last modified,
     * or -1 if that information is not avaliable,
     * or 0 if the file doesn't exists.
     */
    public long fileLastModified(String path) {
        File file = new File(path);
        if (file.exists()) {
            return file.lastModified();
        } else {
            return 0;
        }
    }
}

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
     * when the file exists and when it was last modified.
     */
    @Test
    void testFileLastModifiedWhenFileExists() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        String path = "src/test/resources/test-file.txt";
        long lastModified = fileStorage.fileLastModified(path);
        assertTrue(lastModified > 0);
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file doesn't exist.
     */
    @Test
    void testFileLastModifiedWhenFileDoesNotExist() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        String path = "src/test/resources/test-file-does-not-exist.txt";
        long lastModified = fileStorage.fileLastModified(path);
        assertEquals(0, lastModified);
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file exists but when the last modified information is not avaliable.
     */
    @Test
    void testFileLastModifiedWhenFileExistsButLastModifiedInfoIsNotAvaliable() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        String path = "src/test/resources/test-file-no-last-modified-info.txt";
        long lastModified = fileStorage.fileLastModified(path);
        assertEquals(-1, lastModified);
    }
}

// LocalFileStorage.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;

/**
 * A FileStorage using the local file system.
 */
public class LocalFileStorage implements FileStorage {

    /**
     * Check if a file exists and when it was last modified.
     *
     * @param path path to the file
     * @return the time when the file was last modified,
     * or -1 if that information is not avaliable,
     * or 0 if the file doesn't exists.
     */
    public long fileLastModified(String path) {
        File file = new File(path);
        if (file.exists()) {
            return file.lastModified();
        } else {
            return 0;
        }
    }
}

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
     * when the file exists and when it was last modified.
     */
    @Test
    void testFileLastModifiedWhenFileExists() {
        LocalFileStorage fileStorage = new LocalFileStorage();
        String path = "src/test/resources/test-file.txt";
        long lastModified = fileStorage.fileLastModified(path);
        assertTrue(lastModified > 0);
    }

    /**
     * Test case for {@link LocalFileStorage#fileLastModified(String)}
     * when the file doesn't exist.
     */
    @Test
    void testFileLastModifiedWhenFileDoesNotExist() {
        LocalFile