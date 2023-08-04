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
import osa.ora.server.threads.SendKickOffMessageThread;
import osa.ora.server.threads.SendRefreshContactThread;
import osa.ora.server.threads.SendUserUpdatedStatusThread;
import osa.ora.server.utils.StringEncoder64;
import osa.ora.server.utils.StringEncrypter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModernChatServer}.
* It contains ten unit test cases for the {@link ModernChatServer#changePassword(String, String, String)} method.
*/
class ModernChatServer_3Test {

    /**
     * Test case for {@link ModernChatServer#changePassword(String, String, String)} method.
     * It tests the case when the user is not logged in.
     * @throws RemoteException
     */
    @Test
    void testChangePassword_1() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changePassword("<EMAIL>", "oldPass", "newPass");
        assertEquals(false, result.isResult());
    }

    /**
     * Test case for {@link ModernChatServer#changePassword(String, String, String)} method.
     * It tests the case when the user is logged in.
     * @throws RemoteException
     */
    @Test
    void testChangePassword_2() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        LoginBean loginBean = new LoginBean();
        loginBean.setEmail("<EMAIL>");
        loginBean.setPassword("<PASSWORD>");
        server.login(loginBean);
        ResultBean result = server.changePassword("<EMAIL>", "oldPass", "newPass");
        assertEquals(false, result.isResult());
    }

    /**
     * Test case for {@link ModernChatServer#changePassword(String, String, String)} method.
     * It tests the case when the user is logged in and the old password is correct.
     * @throws RemoteException
     */
    @Test
    void testChangePassword_3() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        LoginBean loginBean = new LoginBean();
        loginBean.setEmail("<EMAIL>");
        loginBean.setPassword("<PASSWORD>");
        server.login(loginBean);
        ResultBean result = server.changePassword("<EMAIL>", "oldPass", "newPass");
        assertEquals(true, result.isResult());
    }

    /**
     * Test case for {@link ModernChatServer#changePassword(String, String, String)} method.
     * It tests the case when the user is logged in and the old password is incorrect.
     * @throws RemoteException
     */
    @Test
    void testChangePassword_4() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        LoginBean loginBean = new LoginBean();
        loginBean.setEmail("<EMAIL>");
        loginBean.setPassword("<PASSWORD>");
        server.login(loginBean);
        ResultBean result = server.changePassword("<EMAIL>", "oldPass", "newPass");
        assertEquals(false, result.isResult());
    }

    /**
     * Test case for {@link ModernChatServer#changePassword(String, String, String)} method.
     * It tests the case when the user is logged in and the new password is incorrect.
     * @throws RemoteException
     */
    @Test
    void testChangePassword_5() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        LoginBean loginBean = new LoginBean();
        loginBean.setEmail("<EMAIL>");
        loginBean.setPassword("<PASSWORD>");
        server.login(loginBean);
        ResultBean result = server.changePassword("<EMAIL>", "oldPass", "newPass");
        assertEquals(false, result.isResult());
    }

    /**
     * Test case for {@link ModernChatServer#changePassword(String, String, String)} method.
     * It tests the case when the user is logged in and the new password is correct.
     * @throws RemoteException
     */
    @Test
    void testChangePassword_6() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        LoginBean loginBean = new LoginBean();
        loginBean.setEmail("<EMAIL>");
        loginBean.setPassword("<PASSWORD>");
        server.login(loginBean);
        ResultBean result = server.changePassword("<EMAIL>", "oldPass", "newPass");
        assertEquals(true, result.isResult());
    }

    /**
     * Test case for {@link ModernChatServer#changePassword(String, String, String)} method.
     * It tests the case when the user is logged in and the new password is correct.
     * @throws RemoteException
     */
    @Test
    void testChangePassword_7() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        LoginBean loginBean = new LoginBean();
        loginBean.setEmail("<EMAIL>");
        loginBean.setPassword("<PASSWORD>");
        server.login(loginBean);
        ResultBean result = server.changePassword("<EMAIL>", "oldPass", "newPass");
        assertEquals(false, result.isResult());
    }

    /**
     * Test case for {@link ModernChatServer#changePassword(String, String, String)} method.
     * It tests the case when the user is logged in and the new password is correct.
     * @throws RemoteException
     */
    @Test
    void testChangePassword_8() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        LoginBean loginBean = new LoginBean();
        loginBean.setEmail("<EMAIL>");
        loginBean.setPassword("<PASSWORD>");
        server.login(loginBean);
        ResultBean result = server.changePassword("<EMAIL>", "oldPass", "newPass");
        assertEquals(false, result.isResult());
    }

    /**
     * Test case for {@link ModernChatServer#changePassword(String, String, String)} method.
     * It tests the case when the user is logged in and the new password is correct.
     * @throws RemoteException
     */
    @Test
    void testChangePassword_9() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        LoginBean loginBean = new LoginBean();
        loginBean.setEmail("<EMAIL>");
        loginBean.setPassword("<PASSWORD>");
        server.login(loginBean);
        ResultBean result = server.changePassword("<EMAIL>", "oldPass", "newPass");
        assertEquals(false, result.isResult());
    }

    /**
     * Test case for {@link ModernChatServer#changePassword(String, String, String)} method.
     * It tests the case when the user is logged in and the new password is correct.
     * @throws RemoteException
     */
    @Test
    void testChangePassword_10() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        LoginBean loginBean = new LoginBean();
        loginBean.setEmail("<EMAIL>");
        loginBean.setPassword("<PASSWORD>");
        server.login(loginBean);
        ResultBean result = server.changePassword("<EMAIL>", "oldPass", "newPass");
        assertEquals(false, result.isResult());
    }
}

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
* It contains ten unit test cases for the {@link ModernChatServer#changePassword(String, String, String)} method.
*/
class ModernChatServer_4Test {
		
    /**
     * Test case for {@link ModernChatServer#changePassword(String, String, String)} method.
     * It tests the case when the user is not logged in.
     * @throws RemoteException
     */
    @Test
    void testChangePassword_1() throws RemoteException {
        ModernChatServer server = new ModernChatServer();
        ResultBean result = server.changePassword("<EMAIL>", "oldPass", "newPass");
        assertEquals(false, result.isResult());
    }

    /**
     * Test case for {@link ModernChatServer#changePassword(String,