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

    @Test
    void testDeleteFile() throws Exception {
        FTPClient client = new FTPClient();
        client.connect("ftp.inf.tu-dresden.de");
        client.login("anonymous", "<EMAIL>");
        client.deleteFile("/pub/example/file1.txt");
        client.deleteFile("/pub/example/file2.txt");
        client.deleteFile("/pub/example/file3.txt");
        client.deleteFile("/pub/example/file4.txt");
        client.deleteFile("/pub/example/file5.txt");
        client.deleteFile("/pub/example/file6.txt");
        client.deleteFile("/pub/example/file7.txt");
        client.deleteFile("/pub/example/file8.txt");
        client.deleteFile("/pub/example/file9.txt");
        client.deleteFile("/pub/example/file10.txt");
        client.disconnect();
    }
}
