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
    * It tests the query method with a simple expression.
    *
    * @throws XPathExpressionException if the expression is invalid.
    */
    @Test
    void testQuery() throws XPathExpressionException {
        DefaultFSPath fspath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fspath.query("/home/keith/test");
        assertEquals(1, results.size());
        assertEquals(new File("/home/keith/test"), results.get(0).getValue());
    }

    /**
    * Test case for {@link DefaultFSPath#query(String)}.
    * It tests the query method with a simple expression.
    *
    * @throws XPathExpressionException if the expression is invalid.
    */
    @Test
    void testQuery2() throws XPathExpressionException {
        DefaultFSPath fspath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fspath.query("/home/keith/test/test.txt");
        assertEquals(1, results.size());
        assertEquals(new File("/home/keith/test/test.txt"), results.get(0).getValue());
    }

    /**
    * Test case for {@link DefaultFSPath#query(String)}.
    * It tests the query method with a simple expression.
    *
    * @throws XPathExpressionException if the expression is invalid.
    */
    @Test
    void testQuery3() throws XPathExpressionException {
        DefaultFSPath fspath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fspath.query("/home/keith/test/test.txt/test.txt");
        assertEquals(1, results.size());
        assertEquals(new File("/home/keith/test/test.txt/test.txt"), results.get(0).getValue());
    }

    /**
    * Test case for {@link DefaultFSPath#query(String)}.
    * It tests the query method with a simple expression.
    *
    * @throws XPathExpressionException if the expression is invalid.
    */
    @Test
    void testQuery4() throws XPathExpressionException {
        DefaultFSPath fspath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fspath.query("/home/keith/test/test.txt/test.txt/test.txt");
        assertEquals(1, results.size());
        assertEquals(new File("/home/keith/test/test.txt/test.txt/test.txt"), results.get(0).getValue());
    }

    /**
    * Test case for {@link DefaultFSPath#query(String)}.
    * It tests the query method with a simple expression.
    *
    * @throws XPathExpressionException if the expression is invalid.
    */
    @Test
    void testQuery5() throws XPathExpressionException {
        DefaultFSPath fspath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fspath.query("/home/keith/test/test.txt/test.txt/test.txt/test.txt");
        assertEquals(1, results.size());
        assertEquals(new File("/home/keith/test/test.txt/test.txt/test.txt/test.txt"), results.get(0).getValue());
    }

    /**
    * Test case for {@link DefaultFSPath#query(String)}.
    * It tests the query method with a simple expression.
    *
    * @throws XPathExpressionException if the expression is invalid.
    */
    @Test
    void testQuery6() throws XPathExpressionException {
        DefaultFSPath fspath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fspath.query("/home/keith/test/test.txt/test.txt/test.txt/test.txt/test.txt");
        assertEquals(1, results.size());
        assertEquals(new File("/home/keith/test/test.txt/test.txt/test.txt/test.txt/test.txt"), results.get(0).getValue());
    }

    /**
    * Test case for {@link DefaultFSPath#query(String)}.
    * It tests the query method with a simple expression.
    *
    * @throws XPathExpressionException if the expression is invalid.
    */
    @Test
    void testQuery7() throws XPathExpressionException {
        DefaultFSPath fspath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fspath.query("/home/keith/test/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt");
        assertEquals(1, results.size());
        assertEquals(new File("/home/keith/test/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt"), results.get(0).getValue());
    }

    /**
    * Test case for {@link DefaultFSPath#query(String)}.
    * It tests the query method with a simple expression.
    *
    * @throws XPathExpressionException if the expression is invalid.
    */
    @Test
    void testQuery8() throws XPathExpressionException {
        DefaultFSPath fspath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fspath.query("/home/keith/test/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt");
        assertEquals(1, results.size());
        assertEquals(new File("/home/keith/test/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt"), results.get(0).getValue());
    }

    /**
    * Test case for {@link DefaultFSPath#query(String)}.
    * It tests the query method with a simple expression.
    *
    * @throws XPathExpressionException if the expression is invalid.
    */
    @Test
    void testQuery9() throws XPathExpressionException {
        DefaultFSPath fspath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fspath.query("/home/keith/test/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt");
        assertEquals(1, results.size());
        assertEquals(new File("/home/keith/test/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt"), results.get(0).getValue());
    }

    /**
    * Test case for {@link DefaultFSPath#query(String)}.
    * It tests the query method with a simple expression.
    *
    * @throws XPathExpressionException if the expression is invalid.
    */
    @Test
    void testQuery10() throws XPathExpressionException {
        DefaultFSPath fspath = new DefaultFSPath(new File("/"));
        FSPathResultList results = fspath.query("/home/keith/test/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt");
        assertEquals(1, results.size());
        assertEquals(new File("/home/keith/test/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt/test.txt"), results.get(0).getValue());
    }
}

// FSPath.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *  The FSPath interface.
 *  This interface defines the methods that are required to implement a
 *  filesystem path.
 *  <br/>
 *  The FSPath interface is designed to be used with the {@link DefaultFSPath}
 *  class.
 *  <br/>
 *  todo: develop some front end substitution to enable the short queries i.e. /var/www etc
 *
 * @author keith
 *  $Id$
 */
public interface FSPath {

    /**
     *  Executes the FSPath expression and returns the results.
     *
     * @param expression the FSPath expression to execute.
     * @param returnType the type of object to return.
     * @returns <code>FSPathResultList</code> the FSPathResult objects contained
     *  in this list will be of type <code>java.io.File</code>,
     *  <code>java.lang.Double</code>, <code>java.lang.Boolean</code>,
     *  <code>java.lang.String</code>
     */
    public FSPathResultList query(String expression, QName returnType);
}

// FSPathResult.java
package net.sf.sugar.fspath;

/**
 *  The FSPathResult interface.
 *  This interface defines the methods that are required to implement a
 *  filesystem path result.
 *  <br/>
 *  The FSPathResult interface is designed to