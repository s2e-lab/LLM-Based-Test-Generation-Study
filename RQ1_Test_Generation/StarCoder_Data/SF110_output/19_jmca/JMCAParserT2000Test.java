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
     * It tests the parse method with a valid Java program.
     */
    @Test
    void testParse() {
        JMCAParser parser = new JMCAParser();
        Reader rdr = null;
        try {
            rdr = new java.io.FileReader("test/com/soops/CEN4010/JMCA/test/Test.java");
            ASTNode root = parser.parse(rdr);
            assertNotNull(root);
        } catch (IOException e) {
            fail("IOException thrown");
        } finally {
            try {
                if (rdr != null)
                    rdr.close();
            } catch (IOException ie) {
                fail("IOException thrown");
            }
        }
    }

    /**
     * Test case for {@link JMCAParser#parse(Reader)}.
     * It tests the parse method with an invalid Java program.
     */
    @Test
    void testParseInvalid() {
        JMCAParser parser = new JMCAParser();
        Reader rdr = null;
        try {
            rdr = new java.io.FileReader("test/com/soops/CEN4010/JMCA/test/TestInvalid.java");
            ASTNode root = parser.parse(rdr);
            assertNull(root);
        } catch (IOException e) {
            fail("IOException thrown");
        } finally {
            try {
                if (rdr != null)
                    rdr.close();
            } catch (IOException ie) {
                fail("IOException thrown");
            }
        }
    }
}
