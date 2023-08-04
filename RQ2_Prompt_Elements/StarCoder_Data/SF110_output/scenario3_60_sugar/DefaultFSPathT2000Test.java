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
     *  Test case for the query method.
     *  This test case tests the query method with a simple expression.
     *  The expression is <code>/</code> which should return the root directory.
     *
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws XPathExpressionException
     */
    @Test
    void testQuery() throws IOException, ParserConfigurationException, XPathExpressionException {
        DefaultFSPath fsPath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fsPath.query("/");
        assertEquals(1, results.size());
        assertEquals(new File("/"), results.get(0).getValue());
    }

    /**
     *  Test case for the query method.
     *  This test case tests the query method with a simple expression.
     *  The expression is <code>/</code> which should return the root directory.
     *
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws XPathExpressionException
     */
    @Test
    void testQuery2() throws IOException, ParserConfigurationException, XPathExpressionException {
        DefaultFSPath fsPath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fsPath.query("/.");
        assertEquals(1, results.size());
        assertEquals(new File("/"), results.get(0).getValue());
    }

    /**
     *  Test case for the query method.
     *  This test case tests the query method with a simple expression.
     *  The expression is <code>/</code> which should return the root directory.
     *
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws XPathExpressionException
     */
    @Test
    void testQuery3() throws IOException, ParserConfigurationException, XPathExpressionException {
        DefaultFSPath fsPath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fsPath.query(".");
        assertEquals(1, results.size());
        assertEquals(new File("/"), results.get(0).getValue());
    }

    /**
     *  Test case for the query method.
     *  This test case tests the query method with a simple expression.
     *  The expression is <code>/</code> which should return the root directory.
     *
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws XPathExpressionException
     */
    @Test
    void testQuery4() throws IOException, ParserConfigurationException, XPathExpressionException {
        DefaultFSPath fsPath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fsPath.query("..");
        assertEquals(1, results.size());
        assertEquals(new File("/"), results.get(0).getValue());
    }

    /**
     *  Test case for the query method.
     *  This test case tests the query method with a simple expression.
     *  The expression is <code>/</code> which should return the root directory.
     *
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws XPathExpressionException
     */
    @Test
    void testQuery5() throws IOException, ParserConfigurationException, XPathExpressionException {
        DefaultFSPath fsPath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fsPath.query(".");
        assertEquals(1, results.size());
        assertEquals(new File("/"), results.get(0).getValue());
    }

    /**
     *  Test case for the query method.
     *  This test case tests the query method with a simple expression.
     *  The expression is <code>/</code> which should return the root directory.
     *
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws XPathExpressionException
     */
    @Test
    void testQuery6() throws IOException, ParserConfigurationException, XPathExpressionException {
        DefaultFSPath fsPath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fsPath.query("..");
        assertEquals(1, results.size());
        assertEquals(new File("/"), results.get(0).getValue());
    }

    /**
     *  Test case for the query method.
     *  This test case tests the query method with a simple expression.
     *  The expression is <code>/</code> which should return the root directory.
     *
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws XPathExpressionException
     */
    @Test
    void testQuery7() throws IOException, ParserConfigurationException, XPathExpressionException {
        DefaultFSPath fsPath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fsPath.query(".");
        assertEquals(1, results.size());
        assertEquals(new File("/"), results.get(0).getValue());
    }

    /**
     *  Test case for the query method.
     *  This test case tests the query method with a simple expression.
     *  The expression is <code>/</code> which should return the root directory.
     *
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws XPathExpressionException
     */
    @Test
    void testQuery8() throws IOException, ParserConfigurationException, XPathExpressionException {
        DefaultFSPath fsPath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fsPath.query("..");
        assertEquals(1, results.size());
        assertEquals(new File("/"), results.get(0).getValue());
    }

    /**
     *  Test case for the query method.
     *  This test case tests the query method with a simple expression.
     *  The expression is <code>/</code> which should return the root directory.
     *
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws XPathExpressionException
     */
    @Test
    void testQuery9() throws IOException, ParserConfigurationException, XPathExpressionException {
        DefaultFSPath fsPath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fsPath.query(".");
        assertEquals(1, results.size());
        assertEquals(new File("/"), results.get(0).getValue());
    }

    /**
     *  Test case for the query method.
     *  This test case tests the query method with a simple expression.
     *  The expression is <code>/</code> which should return the root directory.
     *
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws XPathExpressionException
     */
    @Test
    void testQuery10() throws IOException, ParserConfigurationException, XPathExpressionException {
        DefaultFSPath fsPath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fsPath.query("..");
        assertEquals(1, results.size());
        assertEquals(new File("/"), results.get(0).getValue());
    }
}

// DefaultFSPath.java
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

/**
 *  The default implementation of the FSPath interface.
 *  This class uses the JDK's XPath implementation as the basis for
 *  FSPath queries.
 *  On instantiation, a DOM is created of the filesystem metadata starting form the <code>rootDirectory</code>.
 *  This DOM can then be queried using standard XML tools.
 *  <br/>
 *  Whilst this approach has been relatively quick to implement, it is still tied to the limitations of XPath.
 *  Future implementations of this class are likely to implement the FSPath language fully themselves wthout relying on XPath.
 *  <br/>
 *  todo: develop some front end substitution to enable the short queries i.e. /var/www etc
 *
 * @author keith
 *  $Id$
 */
public class DefaultFSPath implements FSPath {

    /**
     *  Calls this.query(expression, XPathConstants.NODESET)
     *
     *  Note : This method MUST be passed an expression which returns a nodeset.
     *
     * @param expression the FSPath expression to execute.
     * @returns <code>FSPathResultList</code> the FSPathResult objects contained
     *  in this list will be of type <code>java.io.File</code>,
     *  <code>java.lang.Double</code>, <code>java.lang.Boolean</code>,
     *  <code>java.lang.String</code>
     */
    public FS