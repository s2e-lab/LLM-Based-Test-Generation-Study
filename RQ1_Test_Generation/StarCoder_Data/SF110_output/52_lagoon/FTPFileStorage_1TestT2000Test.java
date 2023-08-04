// FTPFileStorage_1Test.java
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
class FTPFileStorage_1Test {

    private static final boolean DEBUG = false;

    private static final String URL = "ftp://ftp.cs.hut.fi/pub/java/lagoon/test/";

    private static final String PASSWORD = "<PASSWORD>";

    private static final String FILE_NAME = "test.txt";

    private static final String FILE_CONTENTS = "This is a test file.";

    private static final String FILE_CONTENTS_2 = "This is a test file. This is a test file.";

    private static final String FILE_CONTENTS_3 = "This is a test file. This is a test file. This is a test file.";

    private static final String FILE_CONTENTS_4 = "This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String FILE_CONTENTS_5 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String FILE_CONTENTS_6 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String FILE_CONTENTS_7 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String FILE_CONTENTS_8 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String FILE_CONTENTS_9 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String FILE_CONTENTS_10 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    /**
     * Test case for {@link FTPFileStorage#createFile(String)}
     *
     * @throws MalformedURLException
     * @throws UnknownHostException
     * @throws FTPException
     * @throws IOException
     * @throws AuthenticationException
     */
    @Test
    void testCreateFile() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
        FTPFileStorage fileStorage = new FTPFileStorage();
        fileStorage.open(URL, null, PASSWORD);
        try {
            fileStorage.createFile(FILE_NAME);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
        fileStorage.close();
    }

    /**
     * Test case for {@link FTPFileStorage#createFile(String)}
     *
     * @throws MalformedURLException
     * @throws UnknownHostException
     * @throws FTPException
     * @throws IOException
     * @throws AuthenticationException
     */
    @Test
    void testCreateFile_1() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
        FTPFileStorage fileStorage = new FTPFileStorage();
        fileStorage.open(URL, null, PASSWORD);
        try {
            fileStorage.createFile(FILE_NAME);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
        fileStorage.close();
    }

    /**
     * Test case for {@link FTPFileStorage#createFile(String)}
     *
     * @throws MalformedURLException
     * @throws UnknownHostException
     * @throws FTPException
     * @throws IOException
     * @throws AuthenticationException
     */
    @Test
    void testCreateFile_2() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
        FTPFileStorage fileStorage = new FTPFileStorage();
        fileStorage.open(URL, null, PASSWORD);
        try {
            fileStorage.createFile(FILE_NAME);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
        fileStorage.close();
    }

    /**
     * Test case for {@link FTPFileStorage#createFile(String)}
     *
     * @throws MalformedURLException
     * @throws UnknownHostException
     * @throws FTPException
     * @throws IOException
     * @throws AuthenticationException
     */
    @Test
    void testCreateFile_3() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
        FTPFileStorage fileStorage = new FTPFileStorage();
        fileStorage.open(URL, null, PASSWORD);
        try {
            fileStorage.createFile(FILE_NAME);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
        fileStorage.close();
    }

    /**
     * Test case for {@link FTPFileStorage#createFile(String)}
     *
     * @throws MalformedURLException
     * @throws UnknownHostException
     * @throws FTPException
     * @throws IOException
     * @throws AuthenticationException
     */
    @Test
    void testCreateFile_4() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
        FTPFileStorage fileStorage = new FTPFileStorage();
        fileStorage.open(URL, null, PASSWORD);
        try {
            fileStorage.createFile(FILE_NAME);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
        fileStorage.close();
    }

    /**
     * Test case for {@link FTPFileStorage#createFile(String)}
     *
     * @throws MalformedURLException
     * @throws UnknownHostException
     * @throws FTPException
     * @throws IOException
     * @throws AuthenticationException
     */
    @Test
    void testCreateFile_5() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
        FTPFileStorage fileStorage = new FTPFileStorage();
        fileStorage.open(URL, null, PASSWORD);
        try {
            fileStorage.createFile(FILE_NAME);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
        fileStorage.close();
    }

    /**
     * Test case for {@link FTPFileStorage#createFile(String)}
     *
     * @throws MalformedURLException
     * @throws UnknownHostException
     * @throws FTPException
     * @throws IOException
     * @throws AuthenticationException
     */
    @Test
    void testCreateFile_6() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
        FTPFileStorage fileStorage = new FTPFileStorage();
        fileStorage.open(URL, null, PASSWORD);
        try {
            fileStorage.createFile(FILE_NAME);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
        fileStorage.close();
    }

    /**
     * Test case for {@link FTPFileStorage#createFile(String)}
     *
     * @throws MalformedURLException
     * @throws UnknownHostException
     * @throws FTPException
     * @throws IOException
     * @throws AuthenticationException
     */
    @Test
    void testCreateFile_7() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
        FTPFileStorage fileStorage = new FTPFileStorage();
        fileStorage.open(URL, null, PASSWORD);
        try {
            fileStorage.createFile(FILE_NAME);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
        fileStorage.close();
    }

    /**
     * Test case for {@link FTPFileStorage#createFile(String)}
     *
     * @throws MalformedURLException
     * @throws UnknownHostException
     * @throws FTPException
     * @throws IOException
     * @throws AuthenticationException
     */
    @Test
    void testCreateFile_8() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
        FTPFileStorage fileStorage = new FTPFileStorage();
        fileStorage.open(URL, null, PASSWORD);
        try {
            fileStorage.createFile(FILE_NAME);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
        fileStorage.close();
    }

    /**
     * Test case for {@link FTPFileStorage#createFile(String)}
     *
     * @throws MalformedURLException
     * @throws UnknownHostException
     * @throws FTPException
     * @throws IOException
     * @throws AuthenticationException
     */
    @Test
    void testCreateFile_9() throws MalformedURLException, UnknownHostException, FTPException, IOException, AuthenticationException {
        FTPFileStorage fileStorage = new FTPFileStorage();
        fileStorage.open(URL, null, PASSWORD);
        try {
            fileStorage.createFile(FILE_NAME);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
        fileStorage.close();
    }

    /**
     * Test case for {@link FTPFileStorage#createFile(String)}
     *
     * @throws MalformedURLException
     * @throws Unknown