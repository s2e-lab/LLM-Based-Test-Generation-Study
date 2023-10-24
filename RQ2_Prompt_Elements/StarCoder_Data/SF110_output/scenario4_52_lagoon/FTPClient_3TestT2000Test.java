// FTPClient_3Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#append(String, boolean)} method.
*/
class FTPClient_3Test {

    @Test
    void testAppend() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt");
        ftp.append("test.txt");
        ftp.close();
    }

    @Test
    void testAppend2() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt");
        ftp.append("test.txt", true);
        ftp.close();
    }

    @Test
    void testAppend3() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt");
        ftp.append("test.txt", false);
        ftp.close();
    }

    @Test
    void testAppend4() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt");
        ftp.append("test.txt", false);
        ftp.close();
    }

    @Test
    void testAppend5() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt");
        ftp.append("test.txt", true);
        ftp.close();
    }

    @Test
    void testAppend6() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt");
        ftp.append("test.txt", true);
        ftp.close();
    }

    @Test
    void testAppend7() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt");
        ftp.append("test.txt", false);
        ftp.close();
    }

    @Test
    void testAppend8() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt");
        ftp.append("test.txt", false);
        ftp.close();
    }

    @Test
    void testAppend9() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt");
        ftp.append("test.txt", true);
        ftp.close();
    }

    @Test
    void testAppend10() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt");
        ftp.append("test.txt", true);
        ftp.close();
    }
}

// FTPClient_4Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#store(String, boolean)} method.
*/
class FTPClient_4Test {
		
    @Test
    void testStore() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt");
        ftp.close();
    }

    @Test
    void testStore2() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt", true);
        ftp.close();
    }

    @Test
    void testStore3() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt", false);
        ftp.close();
    }

    @Test
    void testStore4() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt", false);
        ftp.close();
    }

    @Test
    void testStore5() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt", true);
        ftp.close();
    }

    @Test
    void testStore6() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt", true);
        ftp.close();
    }

    @Test
    void testStore7() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt", false);
        ftp.close();
    }

    @Test
    void testStore8() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt", false);
        ftp.close();
    }

    @Test
    void testStore9() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt", true);
        ftp.close();
    }

    @Test
    void testStore10() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.store("test.txt", true);
        ftp.close();
    }
}

// FTPClient_5Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#storeUnique(String, boolean)} method.
*/
class FTPClient_5Test {
		
    @Test
    void testStoreUnique() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.storeUnique("test.txt");
        ftp.close();
    }

    @Test
    void testStoreUnique2() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.storeUnique("test.txt", true);
        ftp.close();
    }

    @Test
    void testStoreUnique3() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.storeUnique("test.txt", false);
        ftp.close();
    }

    @Test
    void testStoreUnique4() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.storeUnique("test.txt", false);
        ftp.close();
    }

    @Test
    void testStoreUnique5() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.storeUnique("test.txt", true);
        ftp.close();
    }

    @Test
    void testStoreUnique6() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.storeUnique("test.txt", true);
        ftp.close();
    }

    @Test
    void testStoreUnique7() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.storeUnique("test.txt", false);
        ftp.close();
    }

    @Test
    void testStoreUnique8() throws IOException, FTP