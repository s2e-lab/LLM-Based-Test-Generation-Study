// ModernChatServer_7Test.java
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
* It contains ten unit test cases for the {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_7Test {

    /**
     * Test of sendSecureBinaryMessage method, of class ModernChatServer.
     * @throws java.rmi.RemoteException
     */
    @Test
    void testSendSecureBinaryMessage() throws RemoteException {
        System.out.println("sendSecureBinaryMessage");
        BinaryMessage msg = new BinaryMessage();
        msg.setAction(IConstant.REQUEST);
        msg.setFromUserId(1);
        msg.setToUserId(2);
        msg.setRoomId(1);
        msg.setMsgId(1);
        msg.setMsgDate(Calendar.getInstance().getTime());
        msg.setMsgSize(100);
        msg.setMsgData(new byte[100]);
        msg.setMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusBy(1);
        msg.setMsgStatusMsg(null);
        msg.setMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatus(IConstant.ONLINE);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusBy(1);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsg(null);
        msg.setMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgStatusMsgDate(Calendar.getInstance().getTime());
       