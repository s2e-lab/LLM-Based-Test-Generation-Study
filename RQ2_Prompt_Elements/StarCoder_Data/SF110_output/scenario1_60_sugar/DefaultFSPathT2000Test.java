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
    * Test case for {@link DefaultFSPath#query(String)}.
    * It tests the query for the root directory.
    * @throws Exception
    */
    @Test
    void testQueryRoot() throws Exception {
        DefaultFSPath fspath = new DefaultFSPath(new File("/"));
        FSPathResultList result = fspath.query("/");
        assertEquals(1, result.size());
        assertEquals("/", result.get(0).getPath());
        assertEquals("/", result.get(0).getName());
        assertEquals("/", result.get(0).getFullName());
        assertEquals("/", result.get(0).getRelativePath());
        assertEquals("/", result.get(0).getRelativePath(new File("/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt")));
        assertEquals("/", result.get(0).getRelativePath(new File("/home/keith/tmp/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/