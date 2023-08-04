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
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithAbsolutePath() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("/test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithRelativePath() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithAbsolutePathAndRelativePath() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("/test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithAbsolutePathAndRelativePath2() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithAbsolutePathAndRelativePath3() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("/test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithAbsolutePathAndRelativePath4() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithAbsolutePathAndRelativePath5() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("/test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithAbsolutePathAndRelativePath6() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithAbsolutePathAndRelativePath7() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("/test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithAbsolutePathAndRelativePath8() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithAbsolutePathAndRelativePath9() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("/test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }

    /**
     * Test case for creating a new file.
     */
    @Test
    void testCreateFileWithAbsolutePathAndRelativePath10() throws IOException {
        FTPFileStorage fileStorage = new FTPFileStorage("ftp://ftp.example.com/test");
        OutputHandler outputHandler = fileStorage.createFile("test.txt");
        outputHandler.write("Hello World!");
        outputHandler.close();
    }
}
