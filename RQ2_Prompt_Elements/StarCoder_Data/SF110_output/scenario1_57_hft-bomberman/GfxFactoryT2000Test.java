// GfxFactoryTest.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GfxFactory}.
* It contains ten unit test cases for the {@link GfxFactory#getPowerUpImage(String)} method.
*/
class GfxFactoryTest {

    private static final Logger log = Logger.getLogger(GfxFactoryTest.class);
    private static final String POWER_UP_PATH = "/gfx/powerUps/";
    private static final String POWER_UP_TYPE = "shield";
    private static final String POWER_UP_TYPE_INVALID = "invalid";
    private static final String POWER_UP_TYPE_INVALID_NULL = null;
    private static final String POWER_UP_TYPE_INVALID_EMPTY = "";
    private static final String POWER_UP_TYPE_INVALID_SPACE = " ";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR = "a@";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_2 = "a#";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_3 = "a$";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_4 = "a%";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_5 = "a^";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_6 = "a&";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_7 = "a*";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_8 = "a(";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_9 = "a)";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_10 = "a-";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_11 = "a+";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_12 = "a=";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_13 = "a[";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_14 = "a]";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_15 = "a{";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_16 = "a}";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_17 = "a|";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_18 = "a\\";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_19 = "a/";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_20 = "a;";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_21 = "a'";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_22 = "a\"";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_23 = "a,";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_24 = "a.";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_25 = "a<";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_26 = "a>";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_27 = "a?";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_28 = "a~";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_29 = "a`";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_30 = "a ";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_31 = "a\t";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_32 = "a\n";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_33 = "a\r";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_34 = "a\f";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_35 = "a\b";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_36 = "a\u0000";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_37 = "a\u0001";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_38 = "a\u0002";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_39 = "a\u0003";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_40 = "a\u0004";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_41 = "a\u0005";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_42 = "a\u0006";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_43 = "a\u0007";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_44 = "a\u0008";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_45 = "a\u0009";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_46 = "a\u000A";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_47 = "a\u000B";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_48 = "a\u000C";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_49 = "a\u000D";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_50 = "a\u000E";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_51 = "a\u000F";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_52 = "a\u0010";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_53 = "a\u0011";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_54 = "a\u0012";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_55 = "a\u0013";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_56 = "a\u0014";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_57 = "a\u0015";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_58 = "a\u0016";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_59 = "a\u0017";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_60 = "a\u0018";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_61 = "a\u0019";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_62 = "a\u001A";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_63 = "a\u001B";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_64 = "a\u001C";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_65 = "a\u001D";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_66 = "a\u001E";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_67 = "a\u001F";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_68 = "a\u007F";
    private static final String POWER_UP_TYPE_INVALID_SPECIAL_CHAR_69 = "a\u0080