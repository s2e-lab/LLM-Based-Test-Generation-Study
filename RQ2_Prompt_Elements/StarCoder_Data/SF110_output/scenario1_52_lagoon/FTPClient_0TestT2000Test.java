// FTPClient_0Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#store(String)} method.
*/
class FTPClient_0Test {

    @Test
    void testStore() throws Exception {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.store("/tmp/test.txt");
        client.disconnect();
    }
}

// FTPClient_1Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#store(String)} method.
*/
class FTPClient_1Test {
		
    @Test
    void testStore() throws Exception {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.store("/tmp/test.txt");
        client.disconnect();
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
* It contains ten unit test cases for the {@link FTPClient#store(String)} method.
*/
class FTPClient_2Test {
		
    @Test
    void testStore() throws Exception {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.store("/tmp/test.txt");
        client.disconnect();
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
* It contains ten unit test cases for the {@link FTPClient#store(String)} method.
*/
class FTPClient_3Test {
		
    @Test
    void testStore() throws Exception {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.store("/tmp/test.txt");
        client.disconnect();
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
* It contains ten unit test cases for the {@link FTPClient#store(String)} method.
*/
class FTPClient_4Test {
		
    @Test
    void testStore() throws Exception {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.store("/tmp/test.txt");
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
* It contains ten unit test cases for the {@link FTPClient#store(String)} method.
*/
class FTPClient_5Test {
		
    @Test
    void testStore() throws Exception {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.store("/tmp/test.txt");
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
* It contains ten unit test cases for the {@link FTPClient#store(String)} method.
*/
class FTPClient_6Test {
		
    @Test
    void testStore() throws Exception {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.store("/tmp/test.txt");
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
* It contains ten unit test cases for the {@link FTPClient#store(String)} method.
*/
class FTPClient_7Test {
		
    @Test
    void testStore() throws Exception {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.store("/tmp/test.txt");
        client.disconnect();
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
* It contains ten unit test cases for the {@link FTPClient#store(String)} method.
*/
class FTPClient_8Test {
		
    @Test
    void testStore() throws Exception {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.store("/tmp/test.txt");
        client.disconnect();
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
* It contains ten unit test cases for the {@link FTPClient#store(String)} method.
*/
class FTPClient_9Test {
		
    @Test
    void testStore() throws Exception {
        FTPClient client = new FTPClient();
        client.connect("ftp.staldal.nu", 21);
        client.login("anonymous", "<EMAIL>");
        client.store("/tmp/test.txt");
        client.disconnect();
    }
}

// FTPException.java
package nu.staldal.ftp;

/**
 * An exception thrown by the FTP client.
 */
public class FTPException extends Exception {

    public FTPException(String message) {
        super(message);
    }
}

// FTPServer.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * An FTP server. See RFC-959.
 *
 * Pathnames must be specified using '/' for directory separator.
 * Passive mode will be used for all transfers.
 * <em>Not</em> thread-safe, i.e. you cannot start a new file while another one is in
 * progress.
 *
 * <strong>Note:</strong> This class will transmit password in clear text over
 * the network.
 */
public class FTPServer {

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(21);
        while (true) {
            Socket socket = serverSocket.accept();
            new FTPConnection(socket);
        }
    }
}

// FTPServer_0Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPServer}.
* It contains ten unit test cases for the {@link FTPServer#start()} method.
*/
class FTPServer_0Test {
		
    @Test
    void testStart() throws Exception {
        FTPServer server = new FTPServer();
        server.start();
    }
}

// FTPServer_1Test.java
package nu.staldal.ftp;

