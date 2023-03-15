// MovePageTest.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.StringReader;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MovePage}.
* It contains ten unit test cases for the {@link MovePage#processReturningText(String, HttpAction)} method.
*/
class MovePageTest {

		private static final String TEST_TEXT = "== Test ==\n" + "Test";
		
		private static final String TEST_TEXT_NEW = "== Test ==\n" + "Test new";
		
		private static final String TEST_TEXT_NEW_2 = "== Test ==\n" + "Test new 2";
		
		private static final String TEST_TEXT_NEW_3 = "== Test ==\n" + "Test new 3";
		
		private static final String TEST_TEXT_NEW_4 = "== Test ==\n" + "Test new 4";
		
		private static final String TEST_TEXT_NEW_5 = "== Test ==\n" + "Test new 5";
		
		private static final String TEST_TEXT_NEW_6 = "== Test ==\n" + "Test new 6";
		
		private static final String TEST_TEXT_NEW_7 = "== Test ==\n" + "Test new 7";
		
		private static final String TEST_TEXT_NEW_8 = "== Test ==\n" + "Test new 8";
		
		private static final String TEST_TEXT_NEW_9 = "== Test ==\n" + "Test new 9";
		
		private static final String TEST_TEXT_NEW_10 = "== Test ==\n" + "Test new 10";
		
		private static final String TEST_TEXT_NEW_11 = "== Test ==\n" + "Test new 11";
		
		private static final String TEST_TEXT_NEW_12 = "== Test ==\n" + "Test new 12";
		
		private static final String TEST_TEXT_NEW_13 = "== Test ==\n" + "Test new 13";
		
		private static final String TEST_TEXT_NEW_14 = "== Test ==\n" + "Test new 14";
		
		private static final String TEST_TEXT_NEW_15 = "== Test ==\n" + "Test new 15";
		
		private static final String TEST_TEXT_NEW_16 = "== Test ==\n" + "Test new 16";
		
		private static final String TEST_TEXT_NEW_17 = "== Test ==\n" + "Test new 17";
		
		private static final String TEST_TEXT_NEW_18 = "== Test ==\n" + "Test new 18";
		
		private static final String TEST_TEXT_NEW_19 = "== Test ==\n" + "Test new 19";
		
		private static final String TEST_TEXT_NEW_20 = "== Test ==\n" + "Test new 20";
		
		private static final String TEST_TEXT_NEW_21 = "== Test ==\n" + "Test new 21";
		
		private static final String TEST_TEXT_NEW_22 = "== Test ==\n" + "Test new 22";
		
		private static final String TEST_TEXT_NEW_23 = "== Test ==\n" + "Test new 23";
		
		private static final String TEST_TEXT_NEW_24 = "== Test ==\n" + "Test new 24";
		
		private static final String TEST_TEXT_NEW_25 = "== Test ==\n" + "Test new 25";
		
		private static final String TEST_TEXT_NEW_26 = "== Test ==\n" + "Test new 26";
		
		private static final String TEST_TEXT_NEW_27 = "== Test ==\n" + "Test new 27";
		
		private static final String TEST_TEXT_NEW_28 = "== Test ==\n" + "Test new 28";
		
		private static final String TEST_TEXT_NEW_29 = "== Test ==\n" + "Test new 29";
		
		private static final String TEST_TEXT_NEW_30 = "== Test ==\n" + "Test new 30";
		
		private static final String TEST_TEXT_NEW_31 = "== Test ==\n" + "Test new 31";
		
		private static final String TEST_TEXT_NEW_32 = "== Test ==\n" + "Test new 32";
		
		private static final String TEST_TEXT_NEW_33 = "== Test ==\n" + "Test new 33";
		
		private static final String TEST_TEXT_NEW_34 = "== Test ==\n" + "Test new 34";
		
		private static final String TEST_TEXT_NEW_35 = "== Test ==\n" + "Test new 35";
		
		private static final String TEST_TEXT_NEW_36 = "== Test ==\n" + "Test new 36";
		
		private static final String TEST_TEXT_NEW_37 = "== Test ==\n" + "Test new 37";
		
		private static final String TEST_TEXT_NEW_38 = "== Test ==\n" + "Test new 38";
		
		private static final String TEST_TEXT_NEW_39 = "== Test ==\n" + "Test new 39";
		
		private static final String TEST_TEXT_NEW_40 = "== Test ==\n" + "Test new 40";
		
		private static final String TEST_TEXT_NEW_41 = "== Test ==\n" + "Test new 41";
		
		private static final String TEST_TEXT_NEW_42 = "== Test ==\n" + "Test new 42";
		
		private static final String TEST_TEXT_NEW_43 = "== Test ==\n" + "Test new 43";
		
		private static final String TEST_TEXT_NEW_44 = "== Test ==\n" + "Test new 44";
		
		private static final String TEST_TEXT_NEW_45 = "== Test ==\n" + "Test new 45";
		
		private static final String TEST_TEXT_NEW_46 = "== Test ==\n" + "Test new 46";
		
		private static final String TEST_TEXT_NEW_47 = "== Test ==\n" + "Test new 47";
		
		private static final String TEST_TEXT_NEW_48 = "== Test ==\n" + "Test new 48";
		
		private static final String TEST_TEXT_NEW_49 = "== Test ==\n" + "Test new 49";
		
		private static final String TEST_TEXT_NEW_50 = "== Test ==\n" + "Test new 50";
		
		private static final String TEST_TEXT_NEW_51 = "== Test ==\n" + "Test new 51";
		
		private static final String TEST_TEXT_NEW_52 = "== Test ==\n" + "Test new 52";
		
		private static final String TEST_TEXT_NEW_53 = "== Test ==\n" + "Test new 53";
		
		private static final String TEST_TEXT_NEW_54 = "== Test ==\n" + "Test new 54";
		
		private static final String TEST_TEXT_NEW_55 = "== Test ==\n" + "Test new 55";
		
		private static final String TEST_TEXT_NEW_56 = "== Test ==\n" + "Test new 56";
		
		private static final String TEST_TEXT_NEW_57 = "== Test ==\n" + "Test new 57";
		
		private static final String TEST_TEXT_NEW_58 = "== Test ==\n" + "Test new 58";
		
		private static final String TEST_TEXT_NEW_59 = "== Test ==\n" + "Test new 59";
		
		private static final String TEST_TEXT_NEW_60 = "== Test ==\n" + "Test new 60";
		
		private static final String TEST_TEXT_NEW_61 = "== Test ==\n" + "Test new 61";
		
		private static final String TEST_TEXT_NEW_62 = "== Test ==\n" + "Test new 62";
		
		private static final String TEST_TEXT_NEW_63 = "== Test ==\n" + "Test new 63";
		
		private static final String TEST_TEXT_NEW_64 = "== Test ==\n" + "Test new 64";
		
		private static final String TEST_TEXT_NEW_65 = "== Test ==\n" + "Test new 65";
		
		private static final String TEST_TEXT_NEW_66 = "== Test ==\n" + "Test new 66";
		
		private static final String TEST_TEXT_NEW_67 = "== Test ==\n" + "Test new 67";
		
		private static final String TEST_TEXT_NEW_68 = "== Test ==\n" + "Test new 68";
		
		private static final String TEST_TEXT_NEW_69 = "== Test ==\n" + "Test new 69";
		
		private static final String TEST_TEXT_NEW_70 = "== Test ==\n" + "Test new 70";
		
		private static final String TEST_TEXT_NEW_71 = "== Test ==\n" + "Test new 71";
		
		private static final String TEST_TEXT_NEW_72 = "== Test ==\n" + "Test new 72";
		
		private static final String TEST_TEXT_NEW_73 = "== Test ==\n" + "Test new 73";
		
		private static final String TEST_TEXT_NEW_74 = "== Test ==\n" + "Test new 74";
		
		private static final String TEST_TEXT_NEW_75 = "== Test ==\n" + "Test new 75";
		
		private static final String TEST_TEXT_NEW_76 = "== Test ==\n" + "Test new 76";
		
		private static final String TEST_TEXT_NEW_77 = "== Test ==\n" + "Test new 77";
		
		private static final String TEST_TEXT_NEW_78 = "== Test ==\n" + "Test new 78";
		
		private static final String TEST_TEXT_NEW_79 = "== Test ==\n" + "Test new 79";
		
		private static final String TEST_TEXT_NEW_80 = "== Test ==\n" + "Test new 80";
		
		private static final String TEST_TEXT_NEW_81 = "== Test ==\n" + "Test new 81";
		
		private static final String TEST_TEXT_NEW_82 = "== Test ==\n" + "Test new 82";
		
		private static final String TEST_TEXT_NEW_83 = "== Test ==\n" + "Test new 83";
		
		private static final String TEST_TEXT_NEW_84 = "== Test ==\n" + "Test new 84";
		
		private static final String TEST_TEXT_NEW_85 = "== Test ==\n" + "Test new 85";
		
		private static final String TEST_TEXT_NEW_86 = "== Test ==\n" + "Test new 86";
		
		private static final String TEST_TEXT_NEW_87 = "== Test ==\n" + "Test new 87";
		
		private static final String TEST_TEXT_NEW_88 = "== Test ==\n" + "Test new 88";
		
		private static final String TEST_TEXT_NEW_89 = "== Test ==\n" + "Test new 89";
		
		private static final String TEST_TEXT_NEW_90 = "== Test ==\n" + "Test new 90";
		
		private static final String TEST_TEXT_NEW_91 = "== Test ==\n" + "Test new 91";
		
		private static final String TEST_TEXT_NEW_92 = "== Test ==\n" + "Test new 92";
		
		private static final String TEST_TEXT_NEW_93 = "== Test ==\n" + "Test new 93";
		
		private static final String TEST_TEXT_NEW_94 = "== Test ==\n" + "Test new 94";
		
		private static final String TEST_TEXT_NEW_95 = "== Test ==\n" + "Test new 95";
		
		private static final String TEST_TEXT_NEW_96 = "== Test ==\n" + "Test new 96";
		
		private static final String TEST_TEXT_NEW_97 = "== Test ==\n" + "Test new 97";
		
		private static final String TEST_TEXT_NEW_98 = "== Test ==\n" + "Test new 98";
		
		private static final String TEST_TEXT_NEW_99 = "== Test ==\n" + "Test new 99";
		
		private static final String TEST_TEXT_NEW_100 = "== Test ==\n" + "Test new 100";
		
		private static final String TEST_TEXT_NEW_101 = "== Test ==\n" + "Test new 101";
		
		private static final String TEST_TEXT_NEW_102 = "== Test ==\n" + "Test new 102";
		
		private static final String TEST_TEXT_NEW_103 = "== Test ==\n" + "Test new 103";
		
		private static final String TEST_TEXT_NEW_104 = "== Test ==\n" + "Test new 104";
		
		private static final String TEST_TEXT_NEW_105 = "== Test ==\n" + "Test new 105";
		
		private static final String TEST_TEXT_NEW_106 = "== Test ==\n" + "Test new 106";
		
		private static final String TEST_TEXT_NEW_107 = "== Test ==\n" + "Test new 107";
		
		private static final String TEST_TEXT_NEW_108 = "== Test ==\n" + "Test new 108";
		
		private static final String TEST_TEXT_NEW_109 = "== Test ==\n" + "Test new 109";
		
		private static final String TEST_TEXT_NEW_110 = "== Test ==\n" + "Test new 110";
		
		private static final String TEST_TEXT_NEW_111 = "== Test ==\n" + "Test new 111";
		
		private static final String TEST_TEXT_NEW_112 = "== Test ==\n" + "Test new 112";
		
		private static final String TEST_TEXT_NEW_113 = "== Test ==\n" + "Test new 113";
		
		private static final String TEST_TEXT_NEW_114 = "== Test ==\n" + "Test new 114";
		
		private static final String TEST_TEXT_NEW_115 = "== Test ==\n" + "Test new 115";
		
		private static final String TEST_TEXT_NEW_116 = "== Test ==\n" + "Test new 116";
		
		private static final String TEST_TEXT_NEW_117 = "== Test ==\n" + "Test new 117";
		
		private static final String TEST_TEXT_NEW_118 = "== Test ==\n" + "Test new 118";
		
		private static final String TEST_TEXT_NEW_119 = "== Test ==\n" + "Test new 119";
		
		private static final String TEST_TEXT_NEW_120 = "== Test ==\n" + "Test new 120";
		
		private static final String TEST_TEXT_NEW_121 = "== Test ==\n" + "Test new 121";
		
		private static final String TEST_TEXT_NEW_122 = "== Test ==\n" + "Test new 122";
		
		private static final String TEST_TEXT_NEW_123 = "== Test ==\n" + "Test new 123";
		
		private static final String TEST_TEXT_NEW_124 = "== Test ==\n" + "Test new 124";
		
		private static final String TEST_TEXT_NEW_125 = "== Test ==\n" + "Test new 125";
		
		private static final String TEST_TEXT_NEW_126 = "== Test ==\n" + "Test new 126";
		
		private static final String TEST_TEXT_NEW_127 = "== Test ==\n" + "Test new 127";
		
		private static final String TEST_TEXT_NEW_128 = "== Test ==\n" + "Test new 128";
		
		private static final String TEST_TEXT