// ModernChatServer_2Test.java
package osa.ora.server;

import java.net.URISyntaxException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import osa.ora.server.bd.UsersBD;
import osa.ora.server.beans.BinaryMessage;
import osa.ora.server.beans.Group;
import osa.ora.server.beans.IConstant;
import osa.ora.server.beans.LoginBean;
import osa.ora.server.beans.ResultBean;
import osa.ora.server.beans.Room;
import osa.ora.server.beans.ServerSettingBean;
import osa.ora.server.beans.TextMessage;
import osa.ora.server.beans.User;
import osa.ora.server.client.ClientInterface;
import osa.ora.server.threads.SendKickOffByLoginMessageThread;
import osa.ora.server.threads.SendKickOffMessageThread;
import osa.ora.server.threads.SendRefreshContactThread;
import osa.ora.server.threads.SendUserUpdatedStatusThread;
import osa.ora.server.utils.StringEncoder64;
import osa.ora.server.utils.StringEncrypter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModernChatServer}.
* It contains ten unit test cases for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
*/
class ModernChatServer_2Test {

    /**
     * Test of signIn method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSignIn() throws RemoteException {
        System.out.println("signIn");
        ClientInterface cf = null;
        String emailAddr = null;
        String password = null;
        String ipAddress = null;
        ModernChatServer instance = new ModernChatServer();
        LoginBean expResult = null;
        LoginBean result = instance.signIn(cf, emailAddr, password, ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSignIn1() throws RemoteException {
        System.out.println("signIn");
        ClientInterface cf = null;
        String emailAddr = null;
        String password = null;
        String ipAddress = null;
        ModernChatServer instance = new ModernChatServer();
        LoginBean expResult = null;
        LoginBean result = instance.signIn(cf, emailAddr, password, ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSignIn2() throws RemoteException {
        System.out.println("signIn");
        ClientInterface cf = null;
        String emailAddr = null;
        String password = null;
        String ipAddress = null;
        ModernChatServer instance = new ModernChatServer();
        LoginBean expResult = null;
        LoginBean result = instance.signIn(cf, emailAddr, password, ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSignIn3() throws RemoteException {
        System.out.println("signIn");
        ClientInterface cf = null;
        String emailAddr = null;
        String password = null;
        String ipAddress = null;
        ModernChatServer instance = new ModernChatServer();
        LoginBean expResult = null;
        LoginBean result = instance.signIn(cf, emailAddr, password, ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSignIn4() throws RemoteException {
        System.out.println("signIn");
        ClientInterface cf = null;
        String emailAddr = null;
        String password = null;
        String ipAddress = null;
        ModernChatServer instance = new ModernChatServer();
        LoginBean expResult = null;
        LoginBean result = instance.signIn(cf, emailAddr, password, ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSignIn5() throws RemoteException {
        System.out.println("signIn");
        ClientInterface cf = null;
        String emailAddr = null;
        String password = null;
        String ipAddress = null;
        ModernChatServer instance = new ModernChatServer();
        LoginBean expResult = null;
        LoginBean result = instance.signIn(cf, emailAddr, password, ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSignIn6() throws RemoteException {
        System.out.println("signIn");
        ClientInterface cf = null;
        String emailAddr = null;
        String password = null;
        String ipAddress = null;
        ModernChatServer instance = new ModernChatServer();
        LoginBean expResult = null;
        LoginBean result = instance.signIn(cf, emailAddr, password, ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSignIn7() throws RemoteException {
        System.out.println("signIn");
        ClientInterface cf = null;
        String emailAddr = null;
        String password = null;
        String ipAddress = null;
        ModernChatServer instance = new ModernChatServer();
        LoginBean expResult = null;
        LoginBean result = instance.signIn(cf, emailAddr, password, ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSignIn8() throws RemoteException {
        System.out.println("signIn");
        ClientInterface cf = null;
        String emailAddr = null;
        String password = null;
        String ipAddress = null;
        ModernChatServer instance = new ModernChatServer();
        LoginBean expResult = null;
        LoginBean result = instance.signIn(cf, emailAddr, password, ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSignIn9() throws RemoteException {
        System.out.println("signIn");
        ClientInterface cf = null;
        String emailAddr = null;
        String password = null;
        String ipAddress = null;
        ModernChatServer instance = new ModernChatServer();
        LoginBean expResult = null;
        LoginBean result = instance.signIn(cf, emailAddr, password, ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSignIn10() throws RemoteException {
        System.out.println("signIn");
        ClientInterface cf = null;
        String emailAddr = null;
        String password = null;
        String ipAddress = null;
        ModernChatServer instance = new ModernChatServer();
        LoginBean expResult = null;
        LoginBean result = instance.signIn(cf, emailAddr, password, ipAddress);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

// ModernChatServer_3Test.java
package osa.ora.server;

import java.net.URISyntaxException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import osa.ora.server.bd.UsersBD;
import osa.ora.server.beans.BinaryMessage;
import osa.ora.server.beans.Group;
import osa.ora.server.beans.IConstant;
import osa.ora.server.beans.LoginBean;
import osa.ora.server.beans.ResultBean;
import osa.ora.server.beans.Room;
import osa.ora.server.beans.ServerSettingBean;
import osa.ora.server.beans.TextMessage;
import osa.ora.server.beans.User;
import osa.ora.server.client.ClientInterface;
import osa.ora.server.threads.SendKickOffByLoginMessageThread;
import osa.ora.server.threads.SendKick