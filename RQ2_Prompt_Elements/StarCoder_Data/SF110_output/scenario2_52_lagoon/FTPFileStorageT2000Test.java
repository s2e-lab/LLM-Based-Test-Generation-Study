// FTPFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.*;
import nu.staldal.lagoon.core.*;
import nu.staldal.ftp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFileStorage}.
* It contains ten unit test cases for the {@link FTPFileStorage#createFile(String)} method.
*/
class FTPFileStorageTest {

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFile() throws IOException {
        FTPFileStorage storage = new FTPFileStorage("ftp://ftp.example.com/test.txt", "password");
        OutputHandler handler = storage.createFile("test.txt");
        handler.write("Hello World!".getBytes());
        handler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFile2() throws IOException {
        FTPFileStorage storage = new FTPFileStorage("ftp://ftp.example.com/test.txt", "password");
        OutputHandler handler = storage.createFile("test.txt");
        handler.write("Hello World!".getBytes());
        handler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFile3() throws IOException {
        FTPFileStorage storage = new FTPFileStorage("ftp://ftp.example.com/test.txt", "password");
        OutputHandler handler = storage.createFile("test.txt");
        handler.write("Hello World!".getBytes());
        handler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFile4() throws IOException {
        FTPFileStorage storage = new FTPFileStorage("ftp://ftp.example.com/test.txt", "password");
        OutputHandler handler = storage.createFile("test.txt");
        handler.write("Hello World!".getBytes());
        handler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFile5() throws IOException {
        FTPFileStorage storage = new FTPFileStorage("ftp://ftp.example.com/test.txt", "password");
        OutputHandler handler = storage.createFile("test.txt");
        handler.write("Hello World!".getBytes());
        handler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFile6() throws IOException {
        FTPFileStorage storage = new FTPFileStorage("ftp://ftp.example.com/test.txt", "password");
        OutputHandler handler = storage.createFile("test.txt");
        handler.write("Hello World!".getBytes());
        handler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFile7() throws IOException {
        FTPFileStorage storage = new FTPFileStorage("ftp://ftp.example.com/test.txt", "password");
        OutputHandler handler = storage.createFile("test.txt");
        handler.write("Hello World!".getBytes());
        handler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFile8() throws IOException {
        FTPFileStorage storage = new FTPFileStorage("ftp://ftp.example.com/test.txt", "password");
        OutputHandler handler = storage.createFile("test.txt");
        handler.write("Hello World!".getBytes());
        handler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFile9() throws IOException {
        FTPFileStorage storage = new FTPFileStorage("ftp://ftp.example.com/test.txt", "password");
        OutputHandler handler = storage.createFile("test.txt");
        handler.write("Hello World!".getBytes());
        handler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFile10() throws IOException {
        FTPFileStorage storage = new FTPFileStorage("ftp://ftp.example.com/test.txt", "password");
        OutputHandler handler = storage.createFile("test.txt");
        handler.write("Hello World!".getBytes());
        handler.close();
    }
}
