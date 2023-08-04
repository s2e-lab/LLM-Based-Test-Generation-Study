// ModernChatServer_4Test.java
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
* It contains ten unit test cases for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
*/
class ModernChatServer_4Test {

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the old password is wrong.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_wrongOldPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", "wrong", "new");
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the new password is wrong.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_wrongNewPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", "old", "wrong");
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the new password is correct.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_correctNewPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", "old", "new");
        assertEquals(result.getStatus(), IConstant.SUCCESS);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the new password is empty.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_emptyNewPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", "old", "");
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the new password is null.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_nullNewPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", "old", null);
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the old password is empty.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_emptyOldPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", "", "new");
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the old password is null.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_nullOldPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", null, "new");
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the email is empty.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_emptyEmail() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("", "old", "new");
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the email is null.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_nullEmail() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword(null, "old", "new");
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }
}

// ModernChatServer_5Test.java
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
* It contains ten unit test cases for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
*/
class ModernChatServer_5Test {
		
    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the old password is wrong.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_wrongOldPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", "wrong", "new");
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the new password is wrong.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_wrongNewPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", "old", "wrong");
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the new password is correct.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_correctNewPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", "old", "new");
        assertEquals(result.getStatus(), IConstant.SUCCESS);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the new password is empty.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_emptyNewPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", "old", "");
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }

    /**
     * Test case for {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
     * It tests the case when the new password is null.
     * @throws RemoteException
     */
    @Test
    void testChangeAdminPassword_nullNewPassword() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changeAdminPassword("<EMAIL>", "old", null);
        assertEquals(result.getStatus(), IConstant.WRONG_PASSWORD);
    }

    /**
     * Test case for {@link Modern