// TreeBuilder_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilder_0Test {

    /**
    * Test method for {@link TreeBuilder#fileToInputSource(File)}.
    * @throws IOException if some I/O error occurs
    */
    @Test
    void testFileToInputSource() throws IOException {
        File file = new File("test.xml");
        InputSource inputSource = TreeBuilder.fileToInputSource(file);
        assertEquals("file:test.xml", inputSource.getSystemId());
    }
}

// TreeBuilder_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {
		
    /**
    * Test method for {@link TreeBuilder#parseXML(InputSource, boolean)}.
    * @throws IOException if some I/O error occurs
    */
    @Test
    void testParseXML() throws IOException {
        File file = new File("test.xml");
        InputSource inputSource = TreeBuilder.fileToInputSource(file);
        Element root = TreeBuilder.parseXML(inputSource, false);
        assertEquals("test", root.getName());
    }
}
