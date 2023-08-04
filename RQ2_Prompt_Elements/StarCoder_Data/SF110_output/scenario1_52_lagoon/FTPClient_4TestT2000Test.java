// FTPClient_4Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClient_4Test {

    @Test
    void storeUnique_1() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.disconnect();
    }

    @Test
    void storeUnique_2() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
    }

    @Test
    void storeUnique_3() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
    }

    @Test
    void storeUnique_4() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
    }

    @Test
    void storeUnique_5() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
    }

    @Test
    void storeUnique_6() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
    }

    @Test
    void storeUnique_7() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
    }

    @Test
    void storeUnique_8() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
    }

    @Test
    void storeUnique_9() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
    }

    @Test
    void storeUnique_10() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
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
* It contains one unit test case for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClient_5Test {
		
    @Test
    void storeUnique_1() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
    }
}

// FTPClient_6Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClient_6Test {
		
    @Test
    void storeUnique_1() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
    }
}

// FTPClient_7Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClient_7Test {
		
    @Test
    void storeUnique_1() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.storeUnique("test.txt");
        client.disconnect();
    }
}

// FTPClient_8Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api