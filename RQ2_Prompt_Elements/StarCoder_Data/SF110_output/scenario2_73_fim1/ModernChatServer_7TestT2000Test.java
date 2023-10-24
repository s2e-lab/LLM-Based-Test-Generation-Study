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
        msg.setFileName("test.txt");
        msg.setFileSize(100);
        msg.setFileData(new byte[100]);
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
        msg.setFileData(StringEncoder64.encode("test".getBytes()));
       