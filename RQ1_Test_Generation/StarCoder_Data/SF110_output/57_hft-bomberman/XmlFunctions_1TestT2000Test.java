// XmlFunctions_1Test.java
package common;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlFunctions}.
* It contains ten unit test cases for the {@link XmlFunctions#findXmlNodes(String)} method.
*/
class XmlFunctions_1Test {

    private static final Logger logger = Logger.getLogger(XmlFunctions_1Test.class);

    private static final String XML_FILE_NAME = "src/test/resources/xml/XmlFunctions_1Test.xml";

    private static final String XML_PATH_1 = "/root/node1";

    private static final String XML_PATH_2 = "/root/node2";

    private static final String XML_PATH_3 = "/root/node3";

    private static final String XML_PATH_4 = "/root/node4";

    private static final String XML_PATH_5 = "/root/node5";

    private static final String XML_PATH_6 = "/root/node6";

    private static final String XML_PATH_7 = "/root/node7";

    private static final String XML_PATH_8 = "/root/node8";

    private static final String XML_PATH_9 = "/root/node9";

    private static final String XML_PATH_10 = "/root/node10";

    private static final String XML_PATH_11 = "/root/node11";

    private static final String XML_PATH_12 = "/root/node12";

    private static final String XML_PATH_13 = "/root/node13";

    private static final String XML_PATH_14 = "/root/node14";

    private static final String XML_PATH_15 = "/root/node15";

    private static final String XML_PATH_16 = "/root/node16";

    private static final String XML_PATH_17 = "/root/node17";

    private static final String XML_PATH_18 = "/root/node18";

    private static final String XML_PATH_19 = "/root/node19";

    private static final String XML_PATH_20 = "/root/node20";

    private static final String XML_PATH_21 = "/root/node21";

    private static final String XML_PATH_22 = "/root/node22";

    private static final String XML_PATH_23 = "/root/node23";

    private static final String XML_PATH_24 = "/root/node24";

    private static final String XML_PATH_25 = "/root/node25";

    private static final String XML_PATH_26 = "/root/node26";

    private static final String XML_PATH_27 = "/root/node27";

    private static final String XML_PATH_28 = "/root/node28";

    private static final String XML_PATH_29 = "/root/node29";

    private static final String XML_PATH_30 = "/root/node30";

    private static final String XML_PATH_31 = "/root/node31";

    private static final String XML_PATH_32 = "/root/node32";

    private static final String XML_PATH_33 = "/root/node33";

    private static final String XML_PATH_34 = "/root/node34";

    private static final String XML_PATH_35 = "/root/node35";

    private static final String XML_PATH_36 = "/root/node36";

    private static final String XML_PATH_37 = "/root/node37";

    private static final String XML_PATH_38 = "/root/node38";

    private static final String XML_PATH_39 = "/root/node39";

    private static final String XML_PATH_40 = "/root/node40";

    private static final String XML_PATH_41 = "/root/node41";

    private static final String XML_PATH_42 = "/root/node42";

    private static final String XML_PATH_43 = "/root/node43";

    private static final String XML_PATH_44 = "/root/node44";

    private static final String XML_PATH_45 = "/root/node45";

    private static final String XML_PATH_46 = "/root/node46";

    private static final String XML_PATH_47 = "/root/node47";

    private static final String XML_PATH_48 = "/root/node48";

    private static final String XML_PATH_49 = "/root/node49";

    private static final String XML_PATH_50 = "/root/node50";

    private static final String XML_PATH_51 = "/root/node51";

    private static final String XML_PATH_52 = "/root/node52";

    private static final String XML_PATH_53 = "/root/node53";

    private static final String XML_PATH_54 = "/root/node54";

    private static final String XML_PATH_55 = "/root/node55";

    private static final String XML_PATH_56 = "/root/node56";

    private static final String XML_PATH_57 = "/root/node57";

    private static final String XML_PATH_58 = "/root/node58";

    private static final String XML_PATH_59 = "/root/node59";

    private static final String XML_PATH_60 = "/root/node60";

    private static final String XML_PATH_61 = "/root/node61";

    private static final String XML_PATH_62 = "/root/node62";

    private static final String XML_PATH_63 = "/root/node63";

    private static final String XML_PATH_64 = "/root/node64";

    private static final String XML_PATH_65 = "/root/node65";

    private static final String XML_PATH_66 = "/root/node66";

    private static final String XML_PATH_67 = "/root/node67";

    private static final String XML_PATH_68 = "/root/node68";

    private static final String XML_PATH_69 = "/root/node69";

    private static final String XML_PATH_70 = "/root/node70";

    private static final String XML_PATH_71 = "/root/node71";

    private static final String XML_PATH_72 = "/root/node72";

    private static final String XML_PATH_73 = "/root/node73";

    private static final String XML_PATH_74 = "/root/node74";

    private static final String XML_PATH_75 = "/root/node75";

    private static final String XML_PATH_76 = "/root/node76";

    private static final String XML_PATH_77 = "/root/node77";

    private static final String XML_PATH_78 = "/root/node78";

    private static final String XML_PATH_79 = "/root/node79";

    private static final String XML_PATH_80 = "/root/node80";

    private static final String XML_PATH_81 = "/root/node81";

    private static final String XML_PATH_82 = "/root/node82";

    private static final String XML_PATH_83 = "/root/node83";

    private static final String XML_PATH_84 = "/root/node84";

    private static final String XML_PATH_85 = "/root/node85";

    private static final String XML_PATH_86 = "/root/node86";

    private static final String XML_PATH_87 = "/root/node87";

    private static final String XML_PATH_88 = "/root/node88";

    private static final String XML_PATH_89 = "/root/node89";

    private static final String XML_PATH_90 = "/root/node90";

    private static final String XML_PATH_91 = "/root/node91";

    private static final String XML_PATH_92 = "/root/node92";

    private static final String XML_PATH_93 = "/root/node93";

    private static final String XML_PATH_94 = "/root/node94";

    private static final String XML_PATH_95 = "/root/node95";

    private static final String XML_PATH_96 = "/root/node96";

    private static final String XML_PATH_97 = "/root/node97";

    private static final String XML_PATH_98 = "/root/node98";

    private static final String XML_PATH_99 = "/root/node99";

    private static final String XML_PATH_100 = "/root/node100";

    private static final String XML_PATH_101 = "/root/node101";

    private static final String XML_PATH_102 = "/root/node102";

    private static final String XML_PATH_103 = "/root/node103";

    private static final String XML