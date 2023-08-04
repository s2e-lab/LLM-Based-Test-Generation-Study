// XmlIO_1Test.java
package com.allenstudio.ir.util;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlIO}.
* It contains ten unit test cases for the {@link XmlIO#load(URL)} method.
*/
class XmlIO_1Test {

    private static final Logger LOG = Logger.getLogger(XmlIO_1Test.class.getName());

    private static final String ROOT_XML_ELEMENT_NAME = "root";
    private static final String TEST_XML_FILE_NAME = "test.xml";
    private static final String TEST_XML_FILE_PATH = "src/test/resources/com/allenstudio/ir/util/";
    private static final String TEST_XML_FILE_PATH_2 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_3 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_4 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_5 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_6 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_7 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_8 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_9 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_10 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_11 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_12 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_13 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_14 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_15 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_16 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_17 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_18 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_19 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_20 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_21 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_22 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_23 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_24 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_25 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_26 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_27 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_28 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_29 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_30 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_31 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_32 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_33 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_34 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_35 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_36 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_37 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_38 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_39 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_40 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_41 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_42 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_43 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_44 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_45 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_46 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_47 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_48 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_49 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_50 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_51 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_52 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_53 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_54 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_55 =