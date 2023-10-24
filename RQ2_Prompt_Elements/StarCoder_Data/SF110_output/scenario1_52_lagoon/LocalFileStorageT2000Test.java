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

    @Test
    void testFileLastModified() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        File file = new File(path);
        file.createNewFile();
        long lastModified = file.lastModified();
        assertEquals(lastModified, storage.fileLastModified(path));
        file.delete();
    }

    @Test
    void testFileLastModified_fileDoesNotExist() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        assertEquals(0, storage.fileLastModified(path));
    }

    @Test
    void testFileLastModified_fileIsDirectory() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test";
        File file = new File(path);
        file.mkdir();
        assertEquals(0, storage.fileLastModified(path));
        file.delete();
    }

    @Test
    void testFileLastModified_fileIsSymlink() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        File file = new File(path);
        file.createNewFile();
        File link = new File("test/link.txt");
        link.delete();
        link.deleteOnExit();
        assertTrue(link.createNewFile());
        assertTrue(link.setLastModified(file.lastModified()));
        assertEquals(file.lastModified(), storage.fileLastModified(path));
        file.delete();
        link.delete();
    }

    @Test
    void testFileLastModified_fileIsSymlinkToDirectory() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        File file = new File(path);
        file.createNewFile();
        File link = new File("test/link");
        link.delete();
        link.deleteOnExit();
        assertTrue(link.mkdir());
        assertTrue(link.setLastModified(file.lastModified()));
        assertEquals(file.lastModified(), storage.fileLastModified(path));
        file.delete();
        link.delete();
    }

    @Test
    void testFileLastModified_fileIsSymlinkToNonExistingFile() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        File file = new File(path);
        file.createNewFile();
        File link = new File("test/link.txt");
        link.delete();
        link.deleteOnExit();
        assertTrue(link.createNewFile());
        assertTrue(link.setLastModified(file.lastModified()));
        assertEquals(file.lastModified(), storage.fileLastModified(path));
        file.delete();
        link.delete();
    }

    @Test
    void testFileLastModified_fileIsSymlinkToNonExistingDirectory() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        File file = new File(path);
        file.createNewFile();
        File link = new File("test/link");
        link.delete();
        link.deleteOnExit();
        assertTrue(link.mkdir());
        assertTrue(link.setLastModified(file.lastModified()));
        assertEquals(file.lastModified(), storage.fileLastModified(path));
        file.delete();
        link.delete();
    }

    @Test
    void testFileLastModified_fileIsSymlinkToExistingFile() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        File file = new File(path);
        file.createNewFile();
        File link = new File("test/link.txt");
        link.delete();
        link.deleteOnExit();
        assertTrue(link.createNewFile());
        assertTrue(link.setLastModified(file.lastModified()));
        assertEquals(file.lastModified(), storage.fileLastModified(path));
        file.delete();
        link.delete();
    }

    @Test
    void testFileLastModified_fileIsSymlinkToExistingDirectory() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        File file = new File(path);
        file.createNewFile();
        File link = new File("test/link");
        link.delete();
        link.deleteOnExit();
        assertTrue(link.mkdir());
        assertTrue(link.setLastModified(file.lastModified()));
        assertEquals(file.lastModified(), storage.fileLastModified(path));
        file.delete();
        link.delete();
    }

    @Test
    void testFileLastModified_fileIsSymlinkToExistingFileInNonExistingDirectory() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        File file = new File(path);
        file.createNewFile();
        File link = new File("test/link/file.txt");
        link.delete();
        link.deleteOnExit();
        assertTrue(link.createNewFile());
        assertTrue(link.setLastModified(file.lastModified()));
        assertEquals(file.lastModified(), storage.fileLastModified(path));
        file.delete();
        link.delete();
    }

    @Test
    void testFileLastModified_fileIsSymlinkToExistingDirectoryInNonExistingDirectory() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        File file = new File(path);
        file.createNewFile();
        File link = new File("test/link/file");
        link.delete();
        link.deleteOnExit();
        assertTrue(link.mkdir());
        assertTrue(link.setLastModified(file.lastModified()));
        assertEquals(file.lastModified(), storage.fileLastModified(path));
        file.delete();
        link.delete();
    }

    @Test
    void testFileLastModified_fileIsSymlinkToExistingFileInExistingDirectory() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        File file = new File(path);
        file.createNewFile();
        File link = new File("test/link/file.txt");
        link.delete();
        link.deleteOnExit();
        assertTrue(link.createNewFile());
        assertTrue(link.setLastModified(file.lastModified()));
        assertEquals(file.lastModified(), storage.fileLastModified(path));
        file.delete();
        link.delete();
    }

    @Test
    void testFileLastModified_fileIsSymlinkToExistingDirectoryInExistingDirectory() throws IOException {
        LocalFileStorage storage = new LocalFileStorage();
        String path = "test/file.txt";
        File file = new File(path);
        file.createNewFile();
        File link = new File("test/link/file");
        link.delete();
        link.deleteOnExit();
        assertTrue(link.mkdir());
        assertTrue(link.setLastModified(file.lastModified()));
        assertEquals(file.lastModified(), storage.fileLastModified(path));
        file.delete();
        link.delete();
    }
}
