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
    void testDeleteFile() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.deleteFile("test.txt");
        ftp.close();
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
* It contains ten unit test cases for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClient_7Test {
		
    @Test
    void testDeleteFile() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.deleteFile("test.txt");
        ftp.close();
    }
}

// FTPClient_8Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClient_8Test {
		
    @Test
    void testDeleteFile() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.deleteFile("test.txt");
        ftp.close();
    }
}

// FTPClient_9Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClient_9Test {
		
    @Test
    void testDeleteFile() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.deleteFile("test.txt");
        ftp.close();
    }
}

// FTPClient_Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClient_Test {
		
    @Test
    void testDeleteFile() throws IOException, FTPException {
        FTPClient ftp = new FTPClient("ftp.staldal.nu", 21, "anonymous", "anonymous", "/");
        ftp.deleteFile("test.txt");
        ftp.close();
    }
}

// FTPException.java
package nu.staldal.ftp;

/**
 * An FTP exception.
 */
public class FTPException extends Exception {

    public FTPException(String msg) {
        super(msg);
    }
}

// FTPAuthenticationException.java
package nu.staldal.ftp;

/**
 * An FTP authentication exception.
 */
public class FTPAuthenticationException extends FTPException {

    public FTPAuthenticationException(String msg) {
        super(msg);
    }
}

// FTPClient.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;

/**
 * An FTP client. See RFC-959.
 *
 * Pathnames must be specified using '/' for directory separator.
 * Passive mode will be used for all transfers.
 * <em>Not</em> thread-safe, i.e. you cannot start a new file while another one is in
 * progress.
 *
 * <strong>Note:</strong> This class will transmit password in clear text over
 * the network.
 */
public class FTPClient {

    private static final boolean DEBUG = false;

    private Socket control;

    private InputStream controlIn;

    private OutputStream controlOut;

    private String respString;

    private String lastPath = "";

    private int lastPathLen = 0;

    private void sendLine(String str) throws IOException;

    private String recvLine() throws EOFException, IOException;

    private int recvResponse() throws EOFException, IOException;

    /**
     * Connect to an FTP server and login.
     *
     * @param url  an URL specifying host, port, username and optionally
     *             an initial path to change to
     * @param password  the password to use for logging in
     *
     * @throws MalformedURLException  if there are any syntactic error in the URL
     * @throws UnknownHostException  if the hostname specified doesn't exist
     * @throws FTPAuthenticationException  if the password is wrong
     * @throws FTPException if any FTP protocol error occurs
     * @throws IOException if any other IO error occurs
     */
    public FTPClient(String url, String password) throws MalformedURLException, UnknownHostException, FTPAuthenticationException, FTPException, IOException {
    }

    /**
     * Connect to an FTP server and login.
     *
     * @param host  the host to connect to, may be a domain name or IP address
     * @param port  the control channel port (default 21)
     * @param username  the username to use for logging in
     * @param password  the password to use for logging in
     * @param path  initial path, realtive to home directory unless starting with '/',
     *              may be <code>null</code> to use home directory
     *
     * @throws UnknownHostException  if the hostname specified doesn't exist
     * @throws FTPAuthenticationException  if the password is wrong
     * @throws FTPException if any FTP protocol error occurs
     * @throws IOException if any other IO error occurs
     */
    public FTPClient(String host, int port, String username, String password, String path) throws UnknownHostException, FTPAuthenticationException, FTPException, IOException {
    }

    private void connect(String host, int port, String username, String password) throws UnknownHostException, FTPAuthenticationException, FTPException, IOException;

    private void initialDir(String path) throws FTPException, IOException;

    /**
     * Logout and disconnect from the FTP server.
     *
     * After this method has been invoked, no other method may be invoked.
     */
    public void close() throws IOException;

    /**
     * Change the current directory.
     *
     * @param dir  the directory to change into
     *
     * @return true if successful, false otherwise
     * @throws FTPException if any FTP protocol error occurs
     * @throws IOException if any other IO error occurs
     */
    private boolean chdir(String dir) throws FTPException, IOException;

    /**
     * Change the current directory to the parent directory.
     *
     * @return true if successful, false otherwise
     * @throws FTPException if any FTP protocol error occurs
     * @throws IOException if any other IO error occurs
     */
    private boolean cdup() throws FTPException, IOException;

    /**
     * Create a new directory.
     *
     * @param dir  the directory to create
     *
     * @return true if successful, false otherwise
     * @throws FTPException if any FTP protocol error occurs
     * @throws IOException if any other IO error occurs
     */
    private boolean mkdir(String dir) throws FTPException, IOException;

    /**
     * Create a new file, or overwrite an existing file.
     * Will create directories as nessesary.
     *
     * @param pathname  path to the file
     *
     * @return an OutputStream to write to, close() it when finished
     * @throws FTPException if any FTP protocol error occurs
     * @throws IOException if any other IO error occurs
     */
    public OutputStream store(String pathname) throws FTPException, IOException;

    /**
     * Create a new file, or overwrite an existing file.
     * Will create directories as nessesary.
     *
     * @param pathname  path to the file
     * @param last  close the FTPClient after transferring this file
     *
     * @return an OutputStream to write to, close() it when finished
     * @throws FTPException if any FTP protocol error occurs
     * @throws IOException if any other IO error occurs
     */
    public OutputStream store(String pathname, boolean last) throws FTPException, IOException;

    /**
     * Create a new file, or append to an existing file.
     * Will create directories as nessesary.
     *
     * @param pathname  path to the file
     *
     * @return an OutputStream to write to, close() it when finished
     * @throws FTPException if any FTP protocol error occurs
     * @throws IOException if any other IO error occurs