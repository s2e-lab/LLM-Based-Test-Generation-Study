// DefaultFSPathTest.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import net.sf.sugar.fspath.xpath.RegexFunctionResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultFSPath}.
* It contains ten unit test cases for the {@link DefaultFSPath#query(String)} method.
*/
class DefaultFSPathTest {

    /**
     *  The date format used to correspond to the xs:date format i.e. yyyy-MM-dd'T'HH:mm:ss.SSS
     */
    private DateFormat format;

    private DefaultFSPath defaultFSPath;

    private File rootDirectory;

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(File rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest() {
        this.rootDirectory = new File(".");
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(String rootDirectory) {
        this.rootDirectory = new File(rootDirectory);
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(String rootDirectory, String format) {
        this.rootDirectory = new File(rootDirectory);
        this.format = new SimpleDateFormat(format);
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(File rootDirectory, DateFormat format) {
        this.rootDirectory = rootDirectory;
        this.format = format;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(File rootDirectory, String format) {
        this.rootDirectory = rootDirectory;
        this.format = new SimpleDateFormat(format);
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(String rootDirectory, DateFormat format) {
        this.rootDirectory = new File(rootDirectory);
        this.format = format;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(String rootDirectory, String format, DateFormat format) {
        this.rootDirectory = new File(rootDirectory);
        this.format = format;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(File rootDirectory, DateFormat format, Map escapeChars) {
        this.rootDirectory = rootDirectory;
        this.format = format;
        this.escapeChars = escapeChars;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(File rootDirectory, String format, Map escapeChars) {
        this.rootDirectory = rootDirectory;
        this.format = new SimpleDateFormat(format);
        this.escapeChars = escapeChars;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(String rootDirectory, DateFormat format, Map escapeChars) {
        this.rootDirectory = new File(rootDirectory);
        this.format = format;
        this.escapeChars = escapeChars;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(String rootDirectory, String format, Map escapeChars) {
        this.rootDirectory = new File(rootDirectory);
        this.format = new SimpleDateFormat(format);
        this.escapeChars = escapeChars;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(File rootDirectory, DateFormat format, Map escapeChars, DocumentBuilder documentBuilder) {
        this.rootDirectory = rootDirectory;
        this.format = format;
        this.escapeChars = escapeChars;
        this.documentBuilder = documentBuilder;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(File rootDirectory, String format, Map escapeChars, DocumentBuilder documentBuilder) {
        this.rootDirectory = rootDirectory;
        this.format = new SimpleDateFormat(format);
        this.escapeChars = escapeChars;
        this.documentBuilder = documentBuilder;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(String rootDirectory, DateFormat format, Map escapeChars, DocumentBuilder documentBuilder) {
        this.rootDirectory = new File(rootDirectory);
        this.format = format;
        this.escapeChars = escapeChars;
        this.documentBuilder = documentBuilder;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(String rootDirectory, String format, Map escapeChars, DocumentBuilder documentBuilder) {
        this.rootDirectory = new File(rootDirectory);
        this.format = new SimpleDateFormat(format);
        this.escapeChars = escapeChars;
        this.documentBuilder = documentBuilder;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(File rootDirectory, DateFormat format, Map escapeChars, DocumentBuilder documentBuilder, XPath xpath) {
        this.rootDirectory = rootDirectory;
        this.format = format;
        this.escapeChars = escapeChars;
        this.documentBuilder = documentBuilder;
        this.xpath = xpath;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(File rootDirectory, String format, Map escapeChars, DocumentBuilder documentBuilder, XPath xpath) {
        this.rootDirectory = rootDirectory;
        this.format = new SimpleDateFormat(format);
        this.escapeChars = escapeChars;
        this.documentBuilder = documentBuilder;
        this.xpath = xpath;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(String rootDirectory, DateFormat format, Map escapeChars, DocumentBuilder documentBuilder, XPath xpath) {
        this.rootDirectory = new File(rootDirectory);
        this.format = format;
        this.escapeChars = escapeChars;
        this.documentBuilder = documentBuilder;
        this.xpath = xpath;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(String rootDirectory, String format, Map escapeChars, DocumentBuilder documentBuilder, XPath xpath) {
        this.rootDirectory = new File(rootDirectory);
        this.format = new SimpleDateFormat(format);
        this.escapeChars = escapeChars;
        this.documentBuilder = documentBuilder;
        this.xpath = xpath;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(File rootDirectory, DateFormat format, Map escapeChars, DocumentBuilder documentBuilder, XPath xpath, Document dom) {
        this.rootDirectory = rootDirectory;
        this.format = format;
        this.escapeChars = escapeChars;
        this.documentBuilder = documentBuilder;
        this.xpath = xpath;
        this.dom = dom;
    }

    /**
     *  Creates a new instance of DefaultFSPathTest.
     *
     *  @param rootDirectory the root directory of the filesystem to be used for testing.
     */
    public DefaultFSPathTest(File rootDirectory, String format, Map escapeChars, DocumentBuilder document