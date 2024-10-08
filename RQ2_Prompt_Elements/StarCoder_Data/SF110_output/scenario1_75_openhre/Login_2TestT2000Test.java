// Login_2Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains ten unit test cases for the {@link Login#getSecurityLogFilePath()} method.
*/
class Login_2Test {

    private static final String SECURITY_LOG_FILE_PATH = "security.log";
    private static final String SECURITY_LOG_FILE_PATH_2 = "security.log.2";
    private static final String SECURITY_LOG_FILE_PATH_3 = "security.log.3";
    private static final String SECURITY_LOG_FILE_PATH_4 = "security.log.4";
    private static final String SECURITY_LOG_FILE_PATH_5 = "security.log.5";
    private static final String SECURITY_LOG_FILE_PATH_6 = "security.log.6";
    private static final String SECURITY_LOG_FILE_PATH_7 = "security.log.7";
    private static final String SECURITY_LOG_FILE_PATH_8 = "security.log.8";
    private static final String SECURITY_LOG_FILE_PATH_9 = "security.log.9";
    private static final String SECURITY_LOG_FILE_PATH_10 = "security.log.10";
    private static final String SECURITY_LOG_FILE_PATH_11 = "security.log.11";
    private static final String SECURITY_LOG_FILE_PATH_12 = "security.log.12";
    private static final String SECURITY_LOG_FILE_PATH_13 = "security.log.13";
    private static final String SECURITY_LOG_FILE_PATH_14 = "security.log.14";
    private static final String SECURITY_LOG_FILE_PATH_15 = "security.log.15";
    private static final String SECURITY_LOG_FILE_PATH_16 = "security.log.16";
    private static final String SECURITY_LOG_FILE_PATH_17 = "security.log.17";
    private static final String SECURITY_LOG_FILE_PATH_18 = "security.log.18";
    private static final String SECURITY_LOG_FILE_PATH_19 = "security.log.19";
    private static final String SECURITY_LOG_FILE_PATH_20 = "security.log.20";
    private static final String SECURITY_LOG_FILE_PATH_21 = "security.log.21";
    private static final String SECURITY_LOG_FILE_PATH_22 = "security.log.22";
    private static final String SECURITY_LOG_FILE_PATH_23 = "security.log.23";
    private static final String SECURITY_LOG_FILE_PATH_24 = "security.log.24";
    private static final String SECURITY_LOG_FILE_PATH_25 = "security.log.25";
    private static final String SECURITY_LOG_FILE_PATH_26 = "security.log.26";
    private static final String SECURITY_LOG_FILE_PATH_27 = "security.log.27";
    private static final String SECURITY_LOG_FILE_PATH_28 = "security.log.28";
    private static final String SECURITY_LOG_FILE_PATH_29 = "security.log.29";
    private static final String SECURITY_LOG_FILE_PATH_30 = "security.log.30";
    private static final String SECURITY_LOG_FILE_PATH_31 = "security.log.31";
    private static final String SECURITY_LOG_FILE_PATH_32 = "security.log.32";
    private static final String SECURITY_LOG_FILE_PATH_33 = "security.log.33";
    private static final String SECURITY_LOG_FILE_PATH_34 = "security.log.34";
    private static final String SECURITY_LOG_FILE_PATH_35 = "security.log.35";
    private static final String SECURITY_LOG_FILE_PATH_36 = "security.log.36";
    private static final String SECURITY_LOG_FILE_PATH_37 = "security.log.37";
    private static final String SECURITY_LOG_FILE_PATH_38 = "security.log.38";
    private static final String SECURITY_LOG_FILE_PATH_39 = "security.log.39";
    private static final String SECURITY_LOG_FILE_PATH_40 = "security.log.40";
    private static final String SECURITY_LOG_FILE_PATH_41 = "security.log.41";
    private static final String SECURITY_LOG_FILE_PATH_42 = "security.log.42";
    private static final String SECURITY_LOG_FILE_PATH_43 = "security.log.43";
    private static final String SECURITY_LOG_FILE_PATH_44 = "security.log.44";
    private static final String SECURITY_LOG_FILE_PATH_45 = "security.log.45";
    private static final String SECURITY_LOG_FILE_PATH_46 = "security.log.46";
    private static final String SECURITY_LOG_FILE_PATH_47 = "security.log.47";
    private static final String SECURITY_LOG_FILE_PATH_48 = "security.log.48";
    private static final String SECURITY_LOG_FILE_PATH_49 = "security.log.49";
    private static final String SECURITY_LOG_FILE_PATH_50 = "security.log.50";
    private static final String SECURITY_LOG_FILE_PATH_51 = "security.log.51";
    private static final String SECURITY_LOG_FILE_PATH_52 = "security.log.52";
    private static final String SECURITY_LOG_FILE_PATH_53 = "security.log.53";
    private static final String SECURITY_LOG_FILE_PATH_54 = "security.log.54";
    private static final String SECURITY_LOG_FILE_PATH_55 = "security.log.55";
    private static final String SECURITY_LOG_FILE_PATH_56 = "security.log.56";
    private static final String SECURITY_LOG_FILE_PATH_57 = "security.log.57";
    private static final String SECURITY_LOG_FILE_PATH_58 = "security.log.58";
    private static final String SECURITY_LOG_FILE_PATH_59 = "security.log.59";
    private static final String SECURITY_LOG_FILE_PATH_60 = "security.log.60";
    private static final String SECURITY_LOG_FILE_PATH_61 = "security.log.61";
    private static final String SECURITY_LOG_FILE_PATH_62 = "security.log.62";
    private static final String SECURITY_LOG_FILE_PATH_63 = "security.log.63";
    private static final String SECURITY_LOG_FILE_PATH_64 = "security.log.64";
    private static final String SECURITY_LOG_FILE_PATH_65 = "security.log.65";
    private static final String SECURITY_LOG_FILE_PATH_66 = "security.log.66";
    private static final String SECURITY_LOG_FILE_PATH_67 = "security.log.67";
    private static final String SECURITY_LOG_FILE_PATH_68 = "security.log.68";
    private static final String SECURITY_LOG_FILE_PATH_69 = "security.log.69";
    private static final String SECURITY_LOG_FILE_PATH_70 = "security.log.70";
    private static final String SECURITY_LOG_FILE_PATH_71 = "security.log.71";
    private static final String SECURITY_LOG_FILE_PATH_72 = "security.log.72";
    private static final String SECURITY_LOG_FILE_PATH_73 = "security.log.73";
    private static final String SECURITY_LOG_FILE_PATH_74 = "security.log.74";
    private static final String SECURITY_LOG_FILE_PATH_75 = "security.log.75";
    private static final String SECURITY_LOG_FILE_PATH_76 = "security.log.76";
    private static final String SECURITY_LOG_FILE_PATH_77 = "security.log.77";
    private static final String SECURITY_LOG_FILE_PATH_78 = "security.log.78";
    private static final String SECURITY_LOG_FILE_PATH_79 = "security.log.79";
    private static final String SECURITY_LOG_FILE_PATH_80 = "security.log.80";
    private static final String SECURITY_LOG_FILE_PATH_81 = "security.log.81";
    private static final String SECURITY_LOG_FILE_PATH_82 = "security.log.82";
    private static final String SECURITY_LOG_FILE_PATH_83 = "security.log.83";
    private static final String SECURITY_LOG_FILE_PATH_84 = "security.log.84";
    private static final String SECURITY