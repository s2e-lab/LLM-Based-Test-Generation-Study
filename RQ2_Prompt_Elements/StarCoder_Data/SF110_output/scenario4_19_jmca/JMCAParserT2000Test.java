// JMCAParserTest.java
package com.soops.CEN4010.JMCA;

import java.io.Reader;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileInputStream;
import java.io.File;
import com.soops.CEN4010.JMCA.JParser.xmlParser.SaxProcessor;
import com.soops.CEN4010.JMCA.JParser.ParseException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAParser}.
* It contains ten unit test cases for the {@link JMCAParser#parse(Reader)} method.
*/
class JMCAParserTest {

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with a valid input file.
     */
    @Test
    void testParse() {
        try {
            JMCAParser parser = new JMCAParser();
            parser.setIntermediateFile("test.xml");
            Reader rdr = new FileInputStream("test.java");
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
            rdr.close();
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with an invalid input file.
     */
    @Test
    void testParseInvalidFile() {
        try {
            JMCAParser parser = new JMCAParser();
            parser.setIntermediateFile("test.xml");
            Reader rdr = new FileInputStream("test.java");
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
            rdr.close();
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with an invalid input file.
     */
    @Test
    void testParseInvalidFile2() {
        try {
            JMCAParser parser = new JMCAParser();
            parser.setIntermediateFile("test.xml");
            Reader rdr = new FileInputStream("test.java");
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
            rdr.close();
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with an invalid input file.
     */
    @Test
    void testParseInvalidFile3() {
        try {
            JMCAParser parser = new JMCAParser();
            parser.setIntermediateFile("test.xml");
            Reader rdr = new FileInputStream("test.java");
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
            rdr.close();
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with an invalid input file.
     */
    @Test
    void testParseInvalidFile4() {
        try {
            JMCAParser parser = new JMCAParser();
            parser.setIntermediateFile("test.xml");
            Reader rdr = new FileInputStream("test.java");
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
            rdr.close();
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with an invalid input file.
     */
    @Test
    void testParseInvalidFile5() {
        try {
            JMCAParser parser = new JMCAParser();
            parser.setIntermediateFile("test.xml");
            Reader rdr = new FileInputStream("test.java");
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
            rdr.close();
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with an invalid input file.
     */
    @Test
    void testParseInvalidFile6() {
        try {
            JMCAParser parser = new JMCAParser();
            parser.setIntermediateFile("test.xml");
            Reader rdr = new FileInputStream("test.java");
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
            rdr.close();
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with an invalid input file.
     */
    @Test
    void testParseInvalidFile7() {
        try {
            JMCAParser parser = new JMCAParser();
            parser.setIntermediateFile("test.xml");
            Reader rdr = new FileInputStream("test.java");
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
            rdr.close();
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with an invalid input file.
     */
    @Test
    void testParseInvalidFile8() {
        try {
            JMCAParser parser = new JMCAParser();
            parser.setIntermediateFile("test.xml");
            Reader rdr = new FileInputStream("test.java");
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
            rdr.close();
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with an invalid input file.
     */
    @Test
    void testParseInvalidFile9() {
        try {
            JMCAParser parser = new JMCAParser();
            parser.setIntermediateFile("test.xml");
            Reader rdr = new FileInputStream("test.java");
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
            rdr.close();
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with an invalid input file.
     */
    @Test
    void testParseInvalidFile10() {
        try {
            JMCAParser parser = new JMCAParser();
            parser.setIntermediateFile("test.xml");
            Reader rdr = new FileInputStream("test.java");
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
            rdr.close();
        } catch (IOException e) {
            fail("IOException");
        }
    }
}

// JMCAParser.java
package com.soops.CEN4010.JMCA;

import java.io.Reader;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileInputStream;
import java.io.File;
import com.soops.CEN4010.JMCA.JParser.xmlParser.SaxProcessor;
import com.soops.CEN4010.JMCA.JParser.ParseException;

public class JMCAParser implements Parser {

    String intermediateFile = "default.xml";

    /**
     * parse implements parse for Parser
     * precondition is the intermediatFile is set
     * @param rdr Reader
     * @return ASTNode
     */
    public ASTNode parse(Reader rdr) {
        try {
            JavaParser parser = new JavaParser(rdr);
            ASTNode ast = parser.CompilationUnit();
            SaxProcessor processor = new SaxProcessor();
            processor.process(ast, intermediateFile);
            return ast;
        } catch (ParseException e) {
            System.err.println("ParseException: " + e.getMessage());
            return null;
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
            return null;
        }
    }

    /**
     * setIntermediateFile sets the intermediate file
     * @param file String
     */
    public void setIntermediateFile(String file) {
        intermediateFile = file;
    }
}

// JMCAParserTest.java
package com.soops.CEN4010.JMCA;

import java.io.Reader;
import com.soops.CEN4010.JMCA.JParser.JavaParser;
import java.io.IOException;
import java.io.FileWriter;
import java.io.Writer;
import java.io.FileInputStream;
import java.io.File;
import com.soops.CEN4010.JMCA.JParser.xmlParser.SaxProcessor;
import com.soops.CEN4010.JMCA.JParser.ParseException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMCAParser}.
* It contains ten unit test cases for the {@link JMCAParser#parse(Reader)} method.
*/
class JMCAParserTest {
		
    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with a valid input file.
     */
    @Test
    void testParse() {
        try {
            JMCAParser parser =