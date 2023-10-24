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
        msg.setSender("sender");
        msg.setReceiver("receiver");
        msg.setMsg("msg");
        msg.setMsgId(1);
        msg.setMsgDate(Calendar.getInstance().getTime());
        msg.setMsgStatus(IConstant.MSG_STATUS_SENT);
        msg.setMsgStatusDate(Calendar.getInstance().getTime());
        msg.setMsgStatusBy("msgStatusBy");
        msg.setMsgStatusByDate(Calendar.getInstance().getTime());
        msg.setMsgStatusByIp("msgStatusByIp");
        msg.setMsgStatusByHost("msgStatusByHost");
        msg.setMsgStatusByOs("msgStatusByOs");
        msg.setMsgStatusByBrowser("msgStatusByBrowser");
        msg.setMsgStatusByCountry("msgStatusByCountry");
        msg.setMsgStatusByRegion("msgStatusByRegion");
        msg.setMsgStatusByCity("msgStatusByCity");
        msg.setMsgStatusByZip("msgStatusByZip");
        msg.setMsgStatusByTimeZone("msgStatusByTimeZone");
        msg.setMsgStatusByLat("msgStatusByLat");
        msg.setMsgStatusByLon("msgStatusByLon");
        msg.setMsgStatusByOrg("msgStatusByOrg");
        msg.setMsgStatusByIsp("msgStatusByIsp");
        msg.setMsgStatusByAs("msgStatusByAs");
        msg.setMsgStatusByAsname("msgStatusByAsname");
        msg.setMsgStatusByReverse("msgStatusByReverse");
        msg.setMsgStatusByMobile("msgStatusByMobile");
        msg.setMsgStatusByProxy("msgStatusByProxy");
        msg.setMsgStatusByProxyType("msgStatusByProxyType");
        msg.setMsgStatusByProxyBy("msgStatusByProxyBy");
        msg.setMsgStatusByProxyByDate(Calendar.getInstance().getTime());
        msg.setMsgStatusByProxyByIp("msgStatusByProxyByIp");
        msg.setMsgStatusByProxyByHost("msgStatusByProxyByHost");
        msg.setMsgStatusByProxyByOs("msgStatusByProxyByOs");
        msg.setMsgStatusByProxyByBrowser("msgStatusByProxyByBrowser");
        msg.setMsgStatusByProxyByCountry("msgStatusByProxyByCountry");
        msg.setMsgStatusByProxyByRegion("msgStatusByProxyByRegion");
        msg.setMsgStatusByProxyByCity("msgStatusByProxyByCity");
        msg.setMsgStatusByProxyByZip("msgStatusByProxyByZip");
        msg.setMsgStatusByProxyByTimeZone("msgStatusByProxyByTimeZone");
        msg.setMsgStatusByProxyByLat("msgStatusByProxyByLat");
        msg.setMsgStatusByProxyByLon("msgStatusByProxyByLon");
        msg.setMsgStatusByProxyByOrg("msgStatusByProxyByOrg");
        msg.setMsgStatusByProxyByIsp("msgStatusByProxyByIsp");
        msg.setMsgStatusByProxyByAs("msgStatusByProxyByAs");
        msg.setMsgStatusByProxyByAsname("msgStatusByProxyByAsname");
        msg.setMsgStatusByProxyByReverse("msgStatusByProxyByReverse");
        msg.setMsgStatusByProxyByMobile("msgStatusByProxyByMobile");
        msg.setMsgStatusByProxyByProxy("msgStatusByProxyByProxy");
        msg.setMsgStatusByProxyByProxyType("msgStatusByProxyByProxyType");
        msg.setMsgStatusByProxyByProxyBy("msgStatusByProxyByProxyBy");
        msg.setMsgStatusByProxyByProxyByDate(Calendar.getInstance().getTime());
        msg.setMsgStatusByProxyByProxyByIp("msgStatusByProxyByProxyByIp");
        msg.setMsgStatusByProxyByProxyByHost("msgStatusByProxyByProxyByHost");
        msg.setMsgStatusByProxyByProxyByOs("msgStatusByProxyByProxyByOs");
        msg.setMsgStatusByProxyByProxyByBrowser("msgStatusByProxyByProxyByBrowser");
        msg.setMsgStatusByProxyByProxyByCountry("msgStatusByProxyByProxyByCountry");
        msg.setMsgStatusByProxyByProxyByRegion("msgStatusByProxyByProxyByRegion");
        msg.setMsgStatusByProxyByProxyByCity("msgStatusByProxyByProxyByCity");
        msg.setMsgStatusByProxyByProxyByZip("msgStatusByProxyByProxyByZip");
        msg.setMsgStatusByProxyByProxyByTimeZone("msgStatusByProxyByProxyByTimeZone");
        msg.setMsgStatusByProxyByProxyByLat("msgStatusByProxyByProxyByLat");
        msg.setMsgStatusByProxyByProxyByLon("msgStatusByProxyByProxyByLon");
        msg.setMsgStatusByProxyByProxyByOrg("msgStatusByProxyByProxyByOrg");
        msg.setMsgStatusByProxyByProxyByIsp("msgStatusByProxyByProxyByIsp");
        msg.setMsgStatusByProxyByProxyByAs("msgStatusByProxyByProxyByAs");
        msg.setMsgStatusByProxyByProxyByAsname("msgStatusByProxyByProxyByAsname");
        msg.setMsgStatusByProxyByProxyByReverse("msgStatusByProxyByProxyByReverse");
        msg.setMsgStatusByProxyByProxyByMobile("msgStatusByProxyByProxyByMobile");
        msg.setMsgStatusByProxyByProxyByProxy("msgStatusByProxyByProxyByProxy");
        msg.setMsgStatusByProxyByProxyByProxyType("msgStatusByProxyByProxyByProxyType");
        msg.setMsgStatusByProxyByProxyByProxyBy("msgStatusByProxyByProxyByProxyBy");
        msg.setMsgStatusByProxyByProxyByProxyByDate(Calendar.getInstance().getTime());
        msg.setMsgStatusByProxyByProxyByProxyByIp("msgStatusByProxyByProxyByProxyByIp");
        msg.setMsgStatusByProxyByProxyByProxyByHost("msgStatusByProxyByProxyByProxyByHost");
        msg.setMsgStatusByProxyByProxyByProxyByOs("msgStatusByProxyByProxyByProxyByOs");
        msg.setMsgStatusByProxyByProxyByProxyByBrowser("msgStatusByProxyByProxyByProxyByBrowser");
        msg.setMsgStatusByProxyByProxyByProxyByCountry("msgStatusByProxyByProxyByProxyByCountry");
        msg.setMsgStatusByProxyByProxyByProxyByRegion("msgStatusByProxyByProxyByProxyByRegion");
        msg.setMsgStatusByProxyByProxyByProxyByCity("msgStatusByProxyByProxyByProxyByCity");
        msg.setMsgStatusByProxyByProxyByProxyByZip("msgStatusByProxyByProxyByProxyByZip");
        msg.setMsgStatusByProxyByProxyByProxyByTimeZone("msgStatusByProxyByProxyByProxyByTimeZone");
        msg.setMsgStatusByProxyByProxyByProxyByLat("msgStatusByProxyByProxyByProxyByLat");
        msg.setMsgStatusByProxyByProxyByProxyByLon("msgStatusByProxyByProxyByProxyByLon");
        msg.setMsgStatusByProxyByProxyByProxyByOrg("msgStatusByProxyByProxyByProxyByOrg");
        msg.setMsgStatusByProxyByProxyByProxyByIsp("msgStatusByProxyByProxyByProxyByIsp");
        msg.setMsgStatusByProxyByProxyByProxyByAs("msgStatusByProxyByProxyByProxyByAs");
        msg.setMsgStatusByProxyByProxyByProxyByAsname("msgStatusByProxyByProxyByProxyByAsname");
        msg.setMsgStatusByProxyByProxyByProxyByReverse("msgStatusByProxyByProxyByProxyByReverse");
        msg.setMsgStatusByProxyByProxyByProxyByMobile("msgStatusByProxyByProxyByProxyByMobile");
        msg.setMsgStatusByProxyByProxyByProxyByProxy("msgStatusByProxyByProxyByProxyByProxy");
        msg.setMsgStatusByProxyByProxyByProxyByProxyType("msgStatusByProxyByProxyByProxyByProxyType");
        msg.setMsgStatusByProxyByProxyByProxyByProxyBy("msgStatusByProxyByProxyByProxyByProxyBy");
        msg.setMsgStatusByProxyByProxyByProxyByProxyByDate(Calendar.getInstance().getTime());
        msg.setMsgStatusByProxyByProxyByProxyByProxyByIp("msgStatusByProxyByProxyByProxyByProxyByIp");
        msg.setMsgStatusByProxyByProxyByProxyByProxyByHost("msgStatusByProxyByProxyByProxyByProxyByHost");
        msg.setMsgStatusByProxyByProxyByProxyByProxyByOs("msgStatusByProxyByProxyByProxyByProxyByOs");
        msg.setMsgStatusByProxyByProxyByProxyByProxyByBrowser("msgStatusByProxyByProxyByProxyByProxy