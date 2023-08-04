// DefaultFSPath_0Test.java
/*
 * DefaultFSPath.java
 *
 * Created on 18 September 2006, 00:25
 *
 */
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
class DefaultFSPath_0Test {

    /**
    * Test of {@link DefaultFSPath#query(String)} method, of class {@link DefaultFSPath}.
    */
    @Test
    void testQuery() {
        System.out.println("query");
        String expression = "/";
        DefaultFSPath instance = new DefaultFSPath();
        FSPathResultList expResult = new FSPathResultListImpl();
        expResult.add(new FSPathResult(new File("/")));
        FSPathResultList result = instance.query(expression);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link DefaultFSPath#query(String)} method, of class {@link DefaultFSPath}.
    */
    @Test
    void testQuery_0args() {
        System.out.println("query");
        DefaultFSPath instance = new DefaultFSPath();
        FSPathResultList expResult = new FSPathResultListImpl();
        expResult.add(new FSPathResult(new File("/")));
        FSPathResultList result = instance.query();
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link DefaultFSPath#query(String)} method, of class {@link DefaultFSPath}.
    */
    @Test
    void testQuery_String() {
        System.out.println("query");
        String expression = "/";
        DefaultFSPath instance = new DefaultFSPath();
        FSPathResultList expResult = new FSPathResultListImpl();
        expResult.add(new FSPathResult(new File("/")));
        FSPathResultList result = instance.query(expression);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link DefaultFSPath#query(String)} method, of class {@link DefaultFSPath}.
    */
    @Test
    void testQuery_String_QName() {
        System.out.println("query");
        String expression = "/";
        QName returnType = XPathConstants.NODESET;
        DefaultFSPath instance = new DefaultFSPath();
        FSPathResultList expResult = new FSPathResultListImpl();
        expResult.add(new FSPathResult(new File("/")));
        FSPathResultList result = instance.query(expression, returnType);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link DefaultFSPath#query(String)} method, of class {@link DefaultFSPath}.
    */
    @Test
    void testQuery_String_QName_0args() {
        System.out.println("query");
        String expression = "/";
        QName returnType = XPathConstants.NODESET;
        DefaultFSPath instance = new DefaultFSPath();
        FSPathResultList expResult = new FSPathResultListImpl();
        expResult.add(new FSPathResult(new File("/")));
        FSPathResultList result = instance.query(expression, returnType);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link DefaultFSPath#query(String)} method, of class {@link DefaultFSPath}.
    */
    @Test
    void testQuery_String_QName_String() {
        System.out.println("query");
        String expression = "/";
        QName returnType = XPathConstants.NODESET;
        String namespace = "http://www.w3.org/1999/xhtml";
        DefaultFSPath instance = new DefaultFSPath();
        FSPathResultList expResult = new FSPathResultListImpl();
        expResult.add(new FSPathResult(new File("/")));
        FSPathResultList result = instance.query(expression, returnType, namespace);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link DefaultFSPath#query(String)} method, of class {@link DefaultFSPath}.
    */
    @Test
    void testQuery_String_QName_String_0args() {
        System.out.println("query");
        String expression = "/";
        QName returnType = XPathConstants.NODESET;
        String namespace = "http://www.w3.org/1999/xhtml";
        DefaultFSPath instance = new DefaultFSPath();
        FSPathResultList expResult = new FSPathResultListImpl();
        expResult.add(new FSPathResult(new File("/")));
        FSPathResultList result = instance.query(expression, returnType, namespace);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link DefaultFSPath#query(String)} method, of class {@link DefaultFSPath}.
    */
    @Test
    void testQuery_String_QName_String_Map() {
        System.out.println("query");
        String expression = "/";
        QName returnType = XPathConstants.NODESET;
        String namespace = "http://www.w3.org/1999/xhtml";
        Map<String, String> namespaces = new HashMap<String, String>();
        namespaces.put("xhtml", "http://www.w3.org/1999/xhtml");
        DefaultFSPath instance = new DefaultFSPath();
        FSPathResultList expResult = new FSPathResultListImpl();
        expResult.add(new FSPathResult(new File("/")));
        FSPathResultList result = instance.query(expression, returnType, namespace, namespaces);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link DefaultFSPath#query(String)} method, of class {@link DefaultFSPath}.
    */
    @Test
    void testQuery_String_QName_String_Map_0args() {
        System.out.println("query");
        String expression = "/";
        QName returnType = XPathConstants.NODESET;
        String namespace = "http://www.w3.org/1999/xhtml";
        Map<String, String> namespaces = new HashMap<String, String>();
        namespaces.put("xhtml", "http://www.w3.org/1999/xhtml");
        DefaultFSPath instance = new DefaultFSPath();
        FSPathResultList expResult = new FSPathResultListImpl();
        expResult.add(new FSPathResult(new File("/")));
        FSPathResultList result = instance.query(expression, returnType, namespace, namespaces);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link DefaultFSPath#query(String)} method, of class {@link DefaultFSPath}.
    */
    @Test
    void testQuery_String_QName_String_Map_Map() {
        System.out.println("query");
        String expression = "/";
        QName returnType = XPathConstants.NODESET;
        String namespace = "http://www.w3.org/1999/xhtml";
        Map<String, String> namespaces = new HashMap<String, String>();
        namespaces.put("xhtml", "http://www.w3.org/1999/xhtml");
        Map<String, String> variables = new HashMap<String, String>();
        variables.put("var", "value");
        DefaultFSPath instance = new DefaultFSPath();
        FSPathResultList expResult = new FSPathResultListImpl();
        expResult.add(new FSPathResult(new File("/")));
        FSPathResultList result = instance.query(expression, returnType, namespace, namespaces, variables);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link DefaultFSPath#query(String)} method, of class {@link DefaultFSPath}.
    */
    @Test
    void testQuery_String_QName_String_Map_Map_0args() {
        System.out.println("query");
        String expression = "/";
        QName returnType = XPathConstants.NODESET;
        String namespace = "http://www.w3.org/1999/xhtml";
        Map<String, String> namespaces = new HashMap<String, String>();
        namespaces.put("xhtml", "http://www.w3.org/1999/xhtml");
        Map<String, String> variables = new HashMap<String, String>();
        variables.put("var", "value");
        DefaultFSPath instance = new DefaultFSPath();
        FSPathResultList expResult = new FSPathResultListImpl();
        expResult.add(new FSPathResult(new File("/")));
        FSPathResultList result = instance.query(expression, returnType, namespace, namespaces, variables);
        assertEquals(expResult, result);
    }
}

// DefaultFSPath_1Test.java
/*
 * DefaultFSPath.java
 *
 * Created on 18 September 2006, 00:25
 *
 */
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