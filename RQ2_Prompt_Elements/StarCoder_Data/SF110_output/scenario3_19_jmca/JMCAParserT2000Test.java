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
            File file = new File("src/test/resources/test.java");
            Reader rdr = new FileInputStream(file);
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
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

    /**
     * parse implements parse for Parser
     * precondition is the intermediatFile is set
     *
     * @param rdr Reader
     * @return ASTNode
     */
    public ASTNode parse(Reader rdr) {
        try {
            JavaParser parser = new JavaParser(rdr);
            ASTNode ast = parser.CompilationUnit();
            return ast;
        } catch (ParseException e) {
            System.err.println("ParseException: " + e.getMessage());
            return null;
        }
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
            JMCAParser parser = new JMCAParser();
            File file = new File("src/test/resources/test.java");
            Reader rdr = new FileInputStream(file);
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
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

    /**
     * parse implements parse for Parser
     * precondition is the intermediatFile is set
     *
     * @param rdr Reader
     * @return ASTNode
     */
    public ASTNode parse(Reader rdr) {
        try {
            JavaParser parser = new JavaParser(rdr);
            ASTNode ast = parser.CompilationUnit();
            return ast;
        } catch (ParseException e) {
            System.err.println("ParseException: " + e.getMessage());
            return null;
        }
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
            JMCAParser parser = new JMCAParser();
            File file = new File("src/test/resources/test.java");
            Reader rdr = new FileInputStream(file);
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
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

    /**
     * parse implements parse for Parser
     * precondition is the intermediatFile is set
     *
     * @param rdr Reader
     * @return ASTNode
     */
    public ASTNode parse(Reader rdr) {
        try {
            JavaParser parser = new JavaParser(rdr);
            ASTNode ast = parser.CompilationUnit();
            return ast;
        } catch (ParseException e) {
            System.err.println("ParseException: " + e.getMessage());
            return null;
        }
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
            JMCAParser parser = new JMCAParser();
            File file = new File("src/test/resources/test.java");
            Reader rdr = new FileInputStream(file);
            ASTNode ast = parser.parse(rdr);
            assertNotNull(ast);
        } catch (IOException e) {
            fail("IOException");
        }
    }
}

// JMCAParser.java
package com.soops.CEN4010.JMCA;

import java.io.Reader;
import com.soops.C