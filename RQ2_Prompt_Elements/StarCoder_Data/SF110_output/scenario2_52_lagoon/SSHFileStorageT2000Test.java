// SSHFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.MalformedURLException;
import nu.staldal.lagoon.core.FileStorage;
import nu.staldal.lagoon.core.OutputHandler;
import nu.staldal.lagoon.core.RemoteFileStorage;
import nu.staldal.lagoon.core.LagoonContext;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHFileStorage}.
* It contains ten unit test cases for the {@link SSHFileStorage#createFile(String)} method.
*/
class SSHFileStorageTest {

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFile() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("test.txt");
        fileStorage.discardFile("test.txt");
        fileStorage.close();
    }

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFileWithAbsolutePath() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("/tmp/lagoon-test/test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("/tmp/lagoon-test/test.txt");
        fileStorage.discardFile("/tmp/lagoon-test/test.txt");
        fileStorage.close();
    }

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFileWithRelativePath() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("test.txt");
        fileStorage.discardFile("test.txt");
        fileStorage.close();
    }

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFileWithRelativePath2() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("test/test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("test/test.txt");
        fileStorage.discardFile("test/test.txt");
        fileStorage.close();
    }

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFileWithRelativePath3() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("test/test/test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("test/test/test.txt");
        fileStorage.discardFile("test/test/test.txt");
        fileStorage.close();
    }

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFileWithRelativePath4() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("test/test/test/test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("test/test/test/test.txt");
        fileStorage.discardFile("test/test/test/test.txt");
        fileStorage.close();
    }

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFileWithRelativePath5() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("test/test/test/test/test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("test/test/test/test/test.txt");
        fileStorage.discardFile("test/test/test/test/test.txt");
        fileStorage.close();
    }

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFileWithRelativePath6() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("test/test/test/test/test/test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("test/test/test/test/test/test.txt");
        fileStorage.discardFile("test/test/test/test/test/test.txt");
        fileStorage.close();
    }

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFileWithRelativePath7() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("test/test/test/test/test/test/test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("test/test/test/test/test/test/test.txt");
        fileStorage.discardFile("test/test/test/test/test/test/test.txt");
        fileStorage.close();
    }

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFileWithRelativePath8() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("test/test/test/test/test/test/test/test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("test/test/test/test/test/test/test/test.txt");
        fileStorage.discardFile("test/test/test/test/test/test/test/test.txt");
        fileStorage.close();
    }

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFileWithRelativePath9() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("test/test/test/test/test/test/test/test/test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("test/test/test/test/test/test/test/test/test.txt");
        fileStorage.discardFile("test/test/test/test/test/test/test/test/test.txt");
        fileStorage.close();
    }

    /**
     * Test case for {@link SSHFileStorage#createFile(String)}
     * @throws java.io.IOException
     */
    @Test
    void testCreateFileWithRelativePath10() throws java.io.IOException {
        SSHFileStorage fileStorage = new SSHFileStorage("localhost", 22, "root", "root", "/tmp/lagoon-test");
        OutputHandler outputHandler = fileStorage.createFile("test/test/test/test/test/test/test/test/test/test.txt");
        outputHandler.write("Hello, world!\n");
        outputHandler.close();
        fileStorage.commitFile("test/test/test/test/test/test/test/test/test/test.txt");
        fileStorage.discardFile("