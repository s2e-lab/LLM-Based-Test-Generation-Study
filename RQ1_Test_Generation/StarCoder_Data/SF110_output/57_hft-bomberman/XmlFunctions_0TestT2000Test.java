// XmlFunctions_0Test.java
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
* It contains ten unit test cases for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_0Test {

    private static final Logger logger = Logger.getLogger(XmlFunctions_0Test.class);

    private static final String XML_FILE_NAME = "src/test/resources/xml/XmlFunctions_0Test.xml";

    private static final String XML_PATH_0 = "/root/element0";

    private static final String XML_PATH_1 = "/root/element1";

    private static final String XML_PATH_2 = "/root/element2";

    private static final String XML_PATH_3 = "/root/element3";

    private static final String XML_PATH_4 = "/root/element4";

    private static final String XML_PATH_5 = "/root/element5";

    private static final String XML_PATH_6 = "/root/element6";

    private static final String XML_PATH_7 = "/root/element7";

    private static final String XML_PATH_8 = "/root/element8";

    private static final String XML_PATH_9 = "/root/element9";

    private static final String XML_PATH_10 = "/root/element10";

    private static final String XML_PATH_11 = "/root/element11";

    private static final String XML_PATH_12 = "/root/element12";

    private static final String XML_PATH_13 = "/root/element13";

    private static final String XML_PATH_14 = "/root/element14";

    private static final String XML_PATH_15 = "/root/element15";

    private static final String XML_PATH_16 = "/root/element16";

    private static final String XML_PATH_17 = "/root/element17";

    private static final String XML_PATH_18 = "/root/element18";

    private static final String XML_PATH_19 = "/root/element19";

    private static final String XML_PATH_20 = "/root/element20";

    private static final String XML_PATH_21 = "/root/element21";

    private static final String XML_PATH_22 = "/root/element22";

    private static final String XML_PATH_23 = "/root/element23";

    private static final String XML_PATH_24 = "/root/element24";

    private static final String XML_PATH_25 = "/root/element25";

    private static final String XML_PATH_26 = "/root/element26";

    private static final String XML_PATH_27 = "/root/element27";

    private static final String XML_PATH_28 = "/root/element28";

    private static final String XML_PATH_29 = "/root/element29";

    private static final String XML_PATH_30 = "/root/element30";

    private static final String XML_PATH_31 = "/root/element31";

    private static final String XML_PATH_32 = "/root/element32";

    private static final String XML_PATH_33 = "/root/element33";

    private static final String XML_PATH_34 = "/root/element34";

    private static final String XML_PATH_35 = "/root/element35";

    private static final String XML_PATH_36 = "/root/element36";

    private static final String XML_PATH_37 = "/root/element37";

    private static final String XML_PATH_38 = "/root/element38";

    private static final String XML_PATH_39 = "/root/element39";

    private static final String XML_PATH_40 = "/root/element40";

    private static final String XML_PATH_41 = "/root/element41";

    private static final String XML_PATH_42 = "/root/element42";

    private static final String XML_PATH_43 = "/root/element43";

    private static final String XML_PATH_44 = "/root/element44";

    private static final String XML_PATH_45 = "/root/element45";

    private static final String XML_PATH_46 = "/root/element46";

    private static final String XML_PATH_47 = "/root/element47";

    private static final String XML_PATH_48 = "/root/element48";

    private static final String XML_PATH_49 = "/root/element49";

    private static final String XML_PATH_50 = "/root/element50";

    private static final String XML_PATH_51 = "/root/element51";

    private static final String XML_PATH_52 = "/root/element52";

    private static final String XML_PATH_53 = "/root/element53";

    private static final String XML_PATH_54 = "/root/element54";

    private static final String XML_PATH_55 = "/root/element55";

    private static final String XML_PATH_56 = "/root/element56";

    private static final String XML_PATH_57 = "/root/element57";

    private static final String XML_PATH_58 = "/root/element58";

    private static final String XML_PATH_59 = "/root/element59";

    private static final String XML_PATH_60 = "/root/element60";

    private static final String XML_PATH_61 = "/root/element61";

    private static final String XML_PATH_62 = "/root/element62";

    private static final String XML_PATH_63 = "/root/element63";

    private static final String XML_PATH_64 = "/root/element64";

    private static final String XML_PATH_65 = "/root/element65";

    private static final String XML_PATH_66 = "/root/element66";

    private static final String XML_PATH_67 = "/root/element67";

    private static final String XML_PATH_68 = "/root/element68";

    private static final String XML_PATH_69 = "/root/element69";

    private static final String XML_PATH_70 = "/root/element70";

    private static final String XML_PATH_71 = "/root/element71";

    private static final String XML_PATH_72 = "/root/element72";

    private static final String XML_PATH_73 = "/root/element73";

    private static final String XML_PATH_74 = "/root/element74";

    private static final String XML_PATH_75 = "/root/element75";

    private static final String XML_PATH_76 = "/root/element76";

    private static final String XML_PATH_77 = "/root/element77";

    private static final String XML_PATH_78 = "/root/element78";

    private static final String XML_PATH_79 = "/root/element79";

    private static final String XML_PATH_80 = "/root/element80";

    private static final String XML_PATH_81 = "/root/element81";

    private static final String XML_PATH_82 = "/root/element82";

    private static final String XML_PATH_83 = "/root/element83";

    private static final String XML_PATH_84 = "/root/element84";

    private static final String XML_PATH_85 = "/root/element85";

    private static final String XML_PATH_86 = "/root/element86";

    private static final String XML_PATH_87 = "/root/element87";

    private static final String XML_PATH_88 = "/root/element88";

    private static final String XML_PATH_89 = "/root/element89";

    private static final String XML_PATH_90 = "/root/element90";

    private static final String XML_PATH_91 = "/root/element91";

    private static final String XML_PATH_92 = "/root/element92";

    private static final String XML_PATH_93 = "/root/element93";

    private static final String XML_PATH_94 = "/root/element94";

    private static final String XML_PATH_95 = "/root/element95";

    private static final String XML_PATH_96 = "/root/element96";

    private static final String XML_PATH_97 = "/root/element97";

    private static final String XML_PATH_98 = "/root/element98";

    private static final String XML_PATH_99 = "/root/element99";

    private static final String XML_PATH_100 = "/root/element100";

    private static final String XML_PATH_101 = "/root/element101";

    private static final String XML_PATH_102 = "/root/element102";

    private static final String XML_PATH_1