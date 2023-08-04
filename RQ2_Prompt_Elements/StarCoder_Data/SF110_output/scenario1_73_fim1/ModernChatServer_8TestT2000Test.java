// ModernChatServer_8Test.java
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
* It contains ten unit test cases for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
*/
class ModernChatServer_8Test {

    /**
     * Test of sendSecureTextAnnouncement method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSendSecureTextAnnouncement() throws RemoteException {
        System.out.println("sendSecureTextAnnouncement");
        TextMessage msg = new TextMessage();
        msg.setFromUserId(1);
        msg.setToUserId(2);
        msg.setMsg("test");
        msg.setMsgId(1);
        msg.setMsgDate(Calendar.getInstance().getTime());
        msg.setMsgTime(Calendar.getInstance().getTime());
        msg.setMsgStatus(IConstant.MSG_STATUS_SENT);
        msg.setMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserId(1);
        msg.setMsgStatusUserName("test");
        msg.setMsgStatusUserType(IConstant.USER_TYPE_ADMIN);
        msg.setMsgStatusUserStatus(IConstant.USER_STATUS_ONLINE);
        msg.setMsgStatusUserStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsg("test");
        msg.setMsgStatusUserStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatus(IConstant.MSG_STATUS_SENT);
        msg.setMsgStatusUserStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserId(1);
        msg.setMsgStatusUserStatusMsgStatusUserName("test");
        msg.setMsgStatusUserStatusMsgStatusUserType(IConstant.USER_TYPE_ADMIN);
        msg.setMsgStatusUserStatusMsgStatusUserStatus(IConstant.USER_STATUS_ONLINE);
        msg.setMsgStatusUserStatusMsgStatusUserStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsg("test");
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatus(IConstant.MSG_STATUS_SENT);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserId(1);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserName("test");
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserType(IConstant.USER_TYPE_ADMIN);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatus(IConstant.USER_STATUS_ONLINE);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsg("test");
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatus(IConstant.MSG_STATUS_SENT);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserId(1);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserName("test");
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserType(IConstant.USER_TYPE_ADMIN);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatus(IConstant.USER_STATUS_ONLINE);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsg("test");
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatus(IConstant.MSG_STATUS_SENT);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserId(1);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserName("test");
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserType(IConstant.USER_TYPE_ADMIN);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatus(IConstant.USER_STATUS_ONLINE);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsg("test");
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatus(IConstant.MSG_STATUS_SENT);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserId(1);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserName("test");
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserType(IConstant.USER_TYPE_ADMIN);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatus(IConstant.USER_STATUS_ONLINE);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsg("test");
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgTime(Calendar.getInstance().getTime());
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatus(IConstant.MSG_STATUS_SENT);
        msg.setMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusUserStatusMsgStatusDate(Calendar.getInstance().getTime