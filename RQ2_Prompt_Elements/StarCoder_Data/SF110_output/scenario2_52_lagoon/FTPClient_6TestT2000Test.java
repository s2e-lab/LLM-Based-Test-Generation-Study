// FTPClient_6Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClient_6Test {

    /**
    * Test case for {@link FTPClient#deleteFile(String)} method.
    * It tests the deletion of a file.
    */
    @Test
    void testDeleteFile() throws IOException, FTPException {
        FTPClient client = new FTPClient();
        client.connect("ftp.inf.tu-dresden.de");
        client.login("anonymous", "<EMAIL>");
        client.deleteFile("/pub/example/file1.txt");
        client.disconnect();
    }
}
