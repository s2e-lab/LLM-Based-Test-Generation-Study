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

    /**
     * Test case for {@link FTPClient#storeUnique(String)}.
     *
     * @throws FTPException if any FTP protocol error occurs
     * @throws IOException if any other IO error occurs
     */
    @Test
    void testStoreUnique() throws FTPException, IOException {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.setFileType(FTPClient.BINARY_FILE_TYPE);
        client.setPassiveMode(true);
        client.setTransferType(FTPClient.BINARY_FILE_TYPE);
        client.setTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setBufferSize(1024);
        client.setLocalPort(0);
        client.setRemotePort(0);
        client.setLocalAddress("127.0.0.1");
        client.setRemoteAddress("127.0.0.1");
        client.setLocalFileSeparator('/');
        client.setRemoteFileSeparator('/');
        client.setLocalEncoding("UTF-8");
        client.setRemoteEncoding("UTF-8");
        client.setLocalType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalPassiveMode(true);
        client.setRemotePassiveMode(true);
        client.setLocalTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setRemoteTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setLocalBufferSize(1024);
        client.setRemoteBufferSize(1024);
        client.setLocalPort(0);
        client.setRemotePort(0);
        client.setLocalAddress("127.0.0.1");
        client.setRemoteAddress("127.0.0.1");
        client.setLocalFileSeparator('/');
        client.setRemoteFileSeparator('/');
        client.setLocalEncoding("UTF-8");
        client.setRemoteEncoding("UTF-8");
        client.setLocalType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalPassiveMode(true);
        client.setRemotePassiveMode(true);
        client.setLocalTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setRemoteTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setLocalBufferSize(1024);
        client.setRemoteBufferSize(1024);
        client.setLocalPort(0);
        client.setRemotePort(0);
        client.setLocalAddress("127.0.0.1");
        client.setRemoteAddress("127.0.0.1");
        client.setLocalFileSeparator('/');
        client.setRemoteFileSeparator('/');
        client.setLocalEncoding("UTF-8");
        client.setRemoteEncoding("UTF-8");
        client.setLocalType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalPassiveMode(true);
        client.setRemotePassiveMode(true);
        client.setLocalTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setRemoteTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setLocalBufferSize(1024);
        client.setRemoteBufferSize(1024);
        client.setLocalPort(0);
        client.setRemotePort(0);
        client.setLocalAddress("127.0.0.1");
        client.setRemoteAddress("127.0.0.1");
        client.setLocalFileSeparator('/');
        client.setRemoteFileSeparator('/');
        client.setLocalEncoding("UTF-8");
        client.setRemoteEncoding("UTF-8");
        client.setLocalType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalPassiveMode(true);
        client.setRemotePassiveMode(true);
        client.setLocalTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setRemoteTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setLocalBufferSize(1024);
        client.setRemoteBufferSize(1024);
        client.setLocalPort(0);
        client.setRemotePort(0);
        client.setLocalAddress("127.0.0.1");
        client.setRemoteAddress("127.0.0.1");
        client.setLocalFileSeparator('/');
        client.setRemoteFileSeparator('/');
        client.setLocalEncoding("UTF-8");
        client.setRemoteEncoding("UTF-8");
        client.setLocalType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalPassiveMode(true);
        client.setRemotePassiveMode(true);
        client.setLocalTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setRemoteTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setLocalBufferSize(1024);
        client.setRemoteBufferSize(1024);
        client.setLocalPort(0);
        client.setRemotePort(0);
        client.setLocalAddress("127.0.0.1");
        client.setRemoteAddress("127.0.0.1");
        client.setLocalFileSeparator('/');
        client.setRemoteFileSeparator('/');
        client.setLocalEncoding("UTF-8");
        client.setRemoteEncoding("UTF-8");
        client.setLocalType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalPassiveMode(true);
        client.setRemotePassiveMode(true);
        client.setLocalTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setRemoteTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setLocalBufferSize(1024);
        client.setRemoteBufferSize(1024);
        client.setLocalPort(0);
        client.setRemotePort(0);
        client.setLocalAddress("127.0.0.1");
        client.setRemoteAddress("127.0.0.1");
        client.setLocalFileSeparator('/');
        client.setRemoteFileSeparator('/');
        client.setLocalEncoding("UTF-8");
        client.setRemoteEncoding("UTF-8");
        client.setLocalType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalPassiveMode(true);
        client.setRemotePassiveMode(true);
        client.setLocalTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setRemoteTransferMode(FTPClient.STREAM_TRANSFER_MODE);
        client.setLocalBufferSize(1024);
        client.setRemoteBufferSize(1024);
        client.setLocalPort(0);
        client.setRemotePort(0);
        client.setLocalAddress("127.0.0.1");
        client.setRemoteAddress("127.0.0.1");
        client.setLocalFileSeparator('/');
        client.setRemoteFileSeparator('/');
        client.setLocalEncoding("UTF-8");
        client.setRemoteEncoding("UTF-8");
        client.setLocalType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalPassiveMode(true);
        client.setRemotePassiveMode(true);
        client.setLocalTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setRemoteTransferType(FTPClient.ASCII_FILE_TYPE);
        client.setLocalTransferMode