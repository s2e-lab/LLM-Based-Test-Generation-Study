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

    private static final String secToken = "<PASSWORD>";
    private static final String passwordEnc = "<PASSWORD>";
    private static final String serverName = "ModernChatServer";
    private static final String serverPort = "1099";
    private static final String serverURL = "rmi://localhost:" + serverPort + "/" + serverName;
    private static final String logFileName = "ModernChatServer.log";
    private static final String logFile = "logs/" + logFileName;
    private static final String logFileFormat = "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$-6s %2$s %5$s%6$s%n";
    private static final String logFileEncoding = "UTF-8";
    private static final String logFileCount = "5";
    private static final String logFileMaxSize = "1024000";
    private static final String logFileLevel = "FINE";
    private static final String logFileFormatter = "java.util.logging.SimpleFormatter";
    private static final String logFileHandler = "java.util.logging.FileHandler";
    private static final String logFileHandlerPattern = logFile;
    private static final String logFileHandlerLimit = logFileCount;
    private static final String logFileHandlerCount = "1";
    private static final String logFileHandlerLevel = logFileLevel;
    private static final String logFileHandlerFormatter = logFileFormatter;
    private static final String logFileHandlerEncoding = logFileEncoding;
    private static final String logFileHandlerAppend = "true";
    private static final String logFileHandlerFilter = "null";
    private static final String logFileHandlerHeader = "null";
    private static final String logFileHandlerFooter = "null";
    private static final String logFileHandlerEncodingErrors = "null";
    private static final String logFileHandlerDefer = "false";
    private static final String logFileHandlerSync = "false";
    private static final String logFileHandlerImmediateFlush = "false";
    private static final String logFileHandlerClose = "true";
    private static final String logFileHandlerEncodingName = "null";
    private static final String logFileHandlerEncodingLocale = "null";
    private static final String logFileHandlerEncodingCharset = "null";
    private static final String logFileHandlerEncodingVersion = "null";
    private static final String logFileHandlerEncodingPreamble = "null";
    private static final String logFileHandlerEncodingStandalone = "null";
    private static final String logFileHandlerEncodingInputEncoding = "null";
    private static final String logFileHandlerEncodingErrorChar = "null";
    private static final String logFileHandlerEncodingByteOrder = "null";
    private static final String logFileHandlerEncodingReplacement = "null";
    private static final String logFileHandlerEncodingMalformedInput = "null";
    private static final String logFileHandlerEncodingUnmappableInput = "null";
    private static final String logFileHandlerEncodingWriteReplace = "null";
    private static final String logFileHandlerEncodingSurrogate = "null";
    private static final String logFileHandlerEncodingMinimize = "null";
    private static final String logFileHandlerEncodingMaxBytesPerChar = "null";
    private static final String logFileHandlerEncodingMaxCharsPerByte = "null";
    private static final String logFileHandlerEncodingOld = "null";
    private static final String logFileHandlerEncodingNew = "null";
    private static final String logFileHandlerEncodingLineSeparator = "null";
    private static final String logFileHandlerEncodingEncoding = "null";
    private static final String logFileHandlerEncodingCharsetName = "null";
    private static final String logFileHandlerEncodingCharsetDecoder = "null";
    private static final String logFileHandlerEncodingCharsetEncoder = "null";
    private static final String logFileHandlerEncodingCharsetDisplayName = "null";
    private static final String logFileHandlerEncodingCharsetFamilyName = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetISOLanguages = "null";
    private static final String logFileHandlerEncodingCharsetISOCountries = "null";
    private static final String logFileHandlerEncodingCharsetISOLanguageCodes = "null";
    private static final String logFileHandlerEncodingCharsetISOCountryCodes = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "null";
    private static final String logFileHandlerEncodingCharsetAvailableCharsets = "