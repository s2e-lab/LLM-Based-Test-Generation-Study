// FTPClient_1Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#store(String, boolean)} method.
*/
class FTPClient_1Test {

    @Test
    void testStore() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.store("java-tutorial.tar.gz");
        ftp.close();
    }

    @Test
    void testStore2() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.store("java-tutorial.tar.gz", true);
        ftp.close();
    }

    @Test
    void testStore3() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.store("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testStore4() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.store("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testStore5() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.store("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testStore6() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.store("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testStore7() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.store("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testStore8() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.store("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testStore9() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.store("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testStore10() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.store("java-tutorial.tar.gz", false);
        ftp.close();
    }
}

// FTPClient_2Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#append(String, boolean)} method.
*/
class FTPClient_2Test {
		
    @Test
    void testAppend() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.append("java-tutorial.tar.gz");
        ftp.close();
    }

    @Test
    void testAppend2() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.append("java-tutorial.tar.gz", true);
        ftp.close();
    }

    @Test
    void testAppend3() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.append("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testAppend4() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.append("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testAppend5() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.append("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testAppend6() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.append("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testAppend7() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.append("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testAppend8() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.append("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testAppend9() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.append("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testAppend10() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.append("java-tutorial.tar.gz", false);
        ftp.close();
    }
}

// FTPClient_3Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#storeUnique(String, boolean)} method.
*/
class FTPClient_3Test {
		
    @Test
    void testStoreUnique() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.storeUnique("java-tutorial.tar.gz");
        ftp.close();
    }

    @Test
    void testStoreUnique2() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.storeUnique("java-tutorial.tar.gz", true);
        ftp.close();
    }

    @Test
    void testStoreUnique3() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.storeUnique("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testStoreUnique4() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug.nl/pub/languages/java/java-tutorial.tar.gz", "anonymous");
        ftp.storeUnique("java-tutorial.tar.gz", false);
        ftp.close();
    }

    @Test
    void testStoreUnique5() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp://ftp.nluug