// LogEvents_0Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.LogItem;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogEvents}.
* It contains ten unit test cases for the {@link LogEvents#hasNext()} method.
*/
class LogEvents_0Test {

    private static final String USER_NAME = "TestUser";
    private static final String USER_NAME_2 = "TestUser2";
    private static final String USER_NAME_3 = "TestUser3";
    private static final String USER_NAME_4 = "TestUser4";
    private static final String USER_NAME_5 = "TestUser5";
    private static final String USER_NAME_6 = "TestUser6";
    private static final String USER_NAME_7 = "TestUser7";
    private static final String USER_NAME_8 = "TestUser8";
    private static final String USER_NAME_9 = "TestUser9";
    private static final String USER_NAME_10 = "TestUser10";
    private static final String USER_NAME_11 = "TestUser11";
    private static final String USER_NAME_12 = "TestUser12";
    private static final String USER_NAME_13 = "TestUser13";
    private static final String USER_NAME_14 = "TestUser14";
    private static final String USER_NAME_15 = "TestUser15";
    private static final String USER_NAME_16 = "TestUser16";
    private static final String USER_NAME_17 = "TestUser17";
    private static final String USER_NAME_18 = "TestUser18";
    private static final String USER_NAME_19 = "TestUser19";
    private static final String USER_NAME_20 = "TestUser20";
    private static final String USER_NAME_21 = "TestUser21";
    private static final String USER_NAME_22 = "TestUser22";
    private static final String USER_NAME_23 = "TestUser23";
    private static final String USER_NAME_24 = "TestUser24";
    private static final String USER_NAME_25 = "TestUser25";
    private static final String USER_NAME_26 = "TestUser26";
    private static final String USER_NAME_27 = "TestUser27";
    private static final String USER_NAME_28 = "TestUser28";
    private static final String USER_NAME_29 = "TestUser29";
    private static final String USER_NAME_30 = "TestUser30";
    private static final String USER_NAME_31 = "TestUser31";
    private static final String USER_NAME_32 = "TestUser32";
    private static final String USER_NAME_33 = "TestUser33";
    private static final String USER_NAME_34 = "TestUser34";
    private static final String USER_NAME_35 = "TestUser35";
    private static final String USER_NAME_36 = "TestUser36";
    private static final String USER_NAME_37 = "TestUser37";
    private static final String USER_NAME_38 = "TestUser38";
    private static final String USER_NAME_39 = "TestUser39";
    private static final String USER_NAME_40 = "TestUser40";
    private static final String USER_NAME_41 = "TestUser41";
    private static final String USER_NAME_42 = "TestUser42";
    private static final String USER_NAME_43 = "TestUser43";
    private static final String USER_NAME_44 = "TestUser44";
    private static final String USER_NAME_45 = "TestUser45";
    private static final String USER_NAME_46 = "TestUser46";
    private static final String USER_NAME_47 = "TestUser47";
    private static final String USER_NAME_48 = "TestUser48";
    private static final String USER_NAME_49 = "TestUser49";
    private static final String USER_NAME_50 = "TestUser50";
    private static final String USER_NAME_51 = "TestUser51";
    private static final String USER_NAME_52 = "TestUser52";
    private static final String USER_NAME_53 = "TestUser53";
    private static final String USER_NAME_54 = "TestUser54";
    private static final String USER_NAME_55 = "TestUser55";
    private static final String USER_NAME_56 = "TestUser56";
    private static final String USER_NAME_57 = "TestUser57";
    private static final String USER_NAME_58 = "TestUser58";
    private static final String USER_NAME_59 = "TestUser59";
    private static final String USER_NAME_60 = "TestUser60";
    private static final String USER_NAME_61 = "TestUser61";
    private static final String USER_NAME_62 = "TestUser62";
    private static final String USER_NAME_63 = "TestUser63";
    private static final String USER_NAME_64 = "TestUser64";
    private static final String USER_NAME_65 = "TestUser65";
    private static final String USER_NAME_66 = "TestUser66";
    private static final String USER_NAME_67 = "TestUser67";
    private static final String USER_NAME_68 = "TestUser68";
    private static final String USER_NAME_69 = "TestUser69";
    private static final String USER_NAME_70 = "TestUser70";
    private static final String USER_NAME_71 = "TestUser71";
    private static final String USER_NAME_72 = "TestUser72";
    private static final String USER_NAME_73 = "TestUser73";
    private static final String USER_NAME_74 = "TestUser74";
    private static final String USER_NAME_75 = "TestUser75";
    private static final String USER_NAME_76 = "TestUser76";
    private static final String USER_NAME_77 = "TestUser77";
    private static final String USER_NAME_78 = "TestUser78";
    private static final String USER_NAME_79 = "TestUser79";
    private static final String USER_NAME_80 = "TestUser80";
    private static final String USER_NAME_81 = "TestUser81";
    private static final String USER_NAME_82 = "TestUser82";
    private static final String USER_NAME_83 = "TestUser83";
    private static final String USER_NAME_84 = "TestUser84";
    private static final String USER_NAME_85 = "TestUser85";
    private static final String USER_NAME_86 = "TestUser86";
    private static final String USER_NAME_87 = "TestUser87";
    private static final String USER_NAME_88 = "TestUser88";
    private static final String USER_NAME_89 = "TestUser89";
    private static final String USER_NAME_90 = "TestUser90";
    private static final String USER_NAME_91 = "TestUser91";
    private static final String USER_NAME_92 = "TestUser92";
    private static final String USER_NAME_93 = "TestUser93";
    private static final String USER_NAME_94 = "TestUser94";
    private static final String USER_NAME_95 = "TestUser95";
    private static final String USER_NAME_96 = "TestUser96";
    private static final String USER_NAME_97 = "TestUser97";
    private static final String USER_NAME_98 = "TestUser98";
    private static final String USER_NAME_99 = "TestUser99";
    private static final String USER_NAME_100 = "TestUser100";
    private static final String USER_NAME_101 = "TestUser101";
    private static final String USER_NAME_102 = "TestUser102";
    private static final String USER_NAME_103 = "TestUser103";
    private static final String USER_NAME_104 = "TestUser104";
    private static final String USER_NAME_105 = "TestUser105";
    private static final String USER_NAME_106 = "TestUser106";
    private static final String USER_NAME_107 = "TestUser107";
    private static final String USER_NAME_108 = "TestUser108";
    private static final String USER_NAME_109 = "TestUser109";
    private static final String USER_NAME_110 = "TestUser110";
    private static final String USER_NAME_111 = "TestUser111