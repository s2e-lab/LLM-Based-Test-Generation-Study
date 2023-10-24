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

    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 1099;
    private static final String SERVER_NAME = "ModernChatServer";
    private static final String SERVER_URL = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME;
    private static final String SERVER_URL_2 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_2";
    private static final String SERVER_URL_3 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_3";
    private static final String SERVER_URL_4 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_4";
    private static final String SERVER_URL_5 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_5";
    private static final String SERVER_URL_6 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_6";
    private static final String SERVER_URL_7 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_7";
    private static final String SERVER_URL_8 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_8";
    private static final String SERVER_URL_9 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_9";
    private static final String SERVER_URL_10 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_10";
    private static final String SERVER_URL_11 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_11";
    private static final String SERVER_URL_12 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_12";
    private static final String SERVER_URL_13 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_13";
    private static final String SERVER_URL_14 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_14";
    private static final String SERVER_URL_15 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_15";
    private static final String SERVER_URL_16 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_16";
    private static final String SERVER_URL_17 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_17";
    private static final String SERVER_URL_18 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_18";
    private static final String SERVER_URL_19 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_19";
    private static final String SERVER_URL_20 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_20";
    private static final String SERVER_URL_21 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_21";
    private static final String SERVER_URL_22 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_22";
    private static final String SERVER_URL_23 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_23";
    private static final String SERVER_URL_24 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_24";
    private static final String SERVER_URL_25 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_25";
    private static final String SERVER_URL_26 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_26";
    private static final String SERVER_URL_27 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_27";
    private static final String SERVER_URL_28 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_28";
    private static final String SERVER_URL_29 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_29";
    private static final String SERVER_URL_30 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_30";
    private static final String SERVER_URL_31 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_31";
    private static final String SERVER_URL_32 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_32";
    private static final String SERVER_URL_33 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_33";
    private static final String SERVER_URL_34 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_34";
    private static final String SERVER_URL_35 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_35";
    private static final String SERVER_URL_36 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_36";
    private static final String SERVER_URL_37 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_37";
    private static final String SERVER_URL_38 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_38";
    private static final String SERVER_URL_39 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_39";
    private static final String SERVER_URL_40 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_40";
    private static final String SERVER_URL_41 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_41";
    private static final String SERVER_URL_42 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_42";
    private static final String SERVER_URL_43 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_43";
    private static final String SERVER_URL_44 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_44";
    private static final String SERVER_URL_45 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_45";
    private static final String SERVER_URL_46 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_46";
    private static final String SERVER_URL_47 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_47";
    private static final String SERVER_URL_48 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_48";
    private static final String SERVER_URL_49 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_49";
    private static final String SERVER_URL_50 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_50";
    private static final String SERVER_URL_51 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_51";
    private static final String SERVER_URL_52 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_52";
    private static final String SERVER_URL_53 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_53";
    private static final String SERVER_URL_54 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER_NAME + "_54";
    private static final String SERVER_URL_55 = "rmi://" + SERVER_IP + ":" + SERVER_PORT + "/" + SERVER