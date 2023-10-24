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

    /**
     * Test case for {@link FTPClient#storeUnique(String, boolean)}.
     *
     * @throws IOException if any IO error occurs
     * @throws FTPException if any FTP protocol error occurs
     */
    @Test
    void testStoreUnique() throws IOException, FTPException {
        FTPClient client = new FTPClient();
        client.connect("localhost", 21);
        client.login("anonymous", "<EMAIL>");
        client.changeDir("/tmp");
        client.storeUnique("test.txt", true);
        client.disconnect();
    }
}
