// XmlIO_0Test.java
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
* It contains ten unit test cases for the {@link XmlIO#load(InputStream)} method.
*/
class XmlIO_0Test {

    private static final Logger LOG = Logger.getLogger(XmlIO_0Test.class.getName());

    private static final String ROOT_XML_ELEMENT_NAME = "root";
    private static final String TEST_XML_FILE_NAME = "test.xml";
    private static final String TEST_XML_FILE_PATH = "src/test/resources/com/allenstudio/ir/util/";
    private static final String TEST_XML_FILE_PATH_0 = "src/test/resources/com/allenstudio/ir/util/test.xml";
    private static final String TEST_XML_FILE_PATH_1 = "src/test/resources/com/allenstudio/ir/util/test_0.xml";
    private static final String TEST_XML_FILE_PATH_2 = "src/test/resources/com/allenstudio/ir/util/test_1.xml";
    private static final String TEST_XML_FILE_PATH_3 = "src/test/resources/com/allenstudio/ir/util/test_2.xml";
    private static final String TEST_XML_FILE_PATH_4 = "src/test/resources/com/allenstudio/ir/util/test_3.xml";
    private static final String TEST_XML_FILE_PATH_5 = "src/test/resources/com/allenstudio/ir/util/test_4.xml";
    private static final String TEST_XML_FILE_PATH_6 = "src/test/resources/com/allenstudio/ir/util/test_5.xml";
    private static final String TEST_XML_FILE_PATH_7 = "src/test/resources/com/allenstudio/ir/util/test_6.xml";
    private static final String TEST_XML_FILE_PATH_8 = "src/test/resources/com/allenstudio/ir/util/test_7.xml";
    private static final String TEST_XML_FILE_PATH_9 = "src/test/resources/com/allenstudio/ir/util/test_8.xml";
    private static final String TEST_XML_FILE_PATH_10 = "src/test/resources/com/allenstudio/ir/util/test_9.xml";
    private static final String TEST_XML_FILE_PATH_11 = "src/test/resources/com/allenstudio/ir/util/test_10.xml";
    private static final String TEST_XML_FILE_PATH_12 = "src/test/resources/com/allenstudio/ir/util/test_11.xml";
    private static final String TEST_XML_FILE_PATH_13 = "src/test/resources/com/allenstudio/ir/util/test_12.xml";
    private static final String TEST_XML_FILE_PATH_14 = "src/test/resources/com/allenstudio/ir/util/test_13.xml";
    private static final String TEST_XML_FILE_PATH_15 = "src/test/resources/com/allenstudio/ir/util/test_14.xml";
    private static final String TEST_XML_FILE_PATH_16 = "src/test/resources/com/allenstudio/ir/util/test_15.xml";
    private static final String TEST_XML_FILE_PATH_17 = "src/test/resources/com/allenstudio/ir/util/test_16.xml";
    private static final String TEST_XML_FILE_PATH_18 = "src/test/resources/com/allenstudio/ir/util/test_17.xml";
    private static final String TEST_XML_FILE_PATH_19 = "src/test/resources/com/allenstudio/ir/util/test_18.xml";
    private static final String TEST_XML_FILE_PATH_20 = "src/test/resources/com/allenstudio/ir/util/test_19.xml";
    private static final String TEST_XML_FILE_PATH_21 = "src/test/resources/com/allenstudio/ir/util/test_20.xml";
    private static final String TEST_XML_FILE_PATH_22 = "src/test/resources/com/allenstudio/ir/util/test_21.xml";
    private static final String TEST_XML_FILE_PATH_23 = "src/test/resources/com/allenstudio/ir/util/test_22.xml";
    private static final String TEST_XML_FILE_PATH_24 = "src/test/resources/com/allenstudio/ir/util/test_23.xml";
    private static final String TEST_XML_FILE_PATH_25 = "src/test/resources/com/allenstudio/ir/util/test_24.xml";
    private static final String TEST_XML_FILE_PATH_26 = "src/test/resources/com/allenstudio/ir/util/test_25.xml";
    private static final String TEST_XML_FILE_PATH_27 = "src/test/resources/com/allenstudio/ir/util/test_26.xml";
    private static final String TEST_XML_FILE_PATH_28 = "src/test/resources/com/allenstudio/ir/util/test_27.xml";
    private static final String TEST_XML_FILE_PATH_29 = "src/test/resources/com/allenstudio/ir/util/test_28.xml";
    private static final String TEST_XML_FILE_PATH_30 = "src/test/resources/com/allenstudio/ir/util/test_29.xml";
    private static final String TEST_XML_FILE_PATH_31 = "src/test/resources/com/allenstudio/ir/util/test_30.xml";
    private static final String TEST_XML_FILE_PATH_32 = "src/test/resources/com/allenstudio/ir/util/test_31.xml";
    private static final String TEST_XML_FILE_PATH_33 = "src/test/resources/com/allenstudio/ir/util/test_32.xml";
    private static final String TEST_XML_FILE_PATH_34 = "src/test/resources/com/allenstudio/ir/util/test_33.xml";
    private static final String TEST_XML_FILE_PATH_35 = "src/test/resources/com/allenstudio/ir/util/test_34.xml";
    private static final String TEST_XML_FILE_PATH_36 = "src/test/resources/com/allenstudio/ir/util/test_35.xml";
    private static final String TEST_XML_FILE_PATH_37 = "src/test/resources/com/allenstudio/ir/util/test_36.xml";
    private static final String TEST_XML_FILE_PATH_38 = "src/test/resources/com/allenstudio/ir/util/test_37.xml";
    private static final String TEST_XML_FILE_PATH_39 = "src/test/resources/com/allenstudio/ir/util/test_38.xml";
    private static final String TEST_XML_FILE_PATH_40 = "src/test/resources/com/allenstudio/ir/util/test_39.xml";
    private static final String TEST_XML_FILE_PATH_41 = "src/test/resources/com/allenstudio/ir/util/test_40.xml";
    private static final String TEST_XML_FILE_PATH_42 = "src/test/resources/com/allenstudio/ir/util/test_41.xml";
    private static final String TEST_XML_FILE_PATH_43 = "src/test/resources/com/allenstudio/ir/util/test_42.xml";
    private static final String TEST_XML_FILE_PATH_44 = "src/test/resources/com/allenstudio/ir/util/test_43.xml";
    private static final String TEST_XML_FILE_PATH_45 = "src/test/resources/com/allenstudio/ir/util/test_44.xml";
    private static final String TEST_XML_FILE_PATH_46 = "src/test/resources/com/allenstudio/ir/util/test_45.xml";
    private static final String TEST_XML_FILE_PATH_47 = "src/test/resources/com/allenstudio/ir/util/test_46.xml";
    private static final String TEST_XML_FILE_PATH_48 = "src/test/resources/com/allenstudio/ir/util/test_47.xml";
    private static final String TEST_XML_FILE_PATH_49 = "src/test/resources/com/allenstudio/