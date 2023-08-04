// FSPathResultListImpl_0Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_0Test {

    @Test
    void testEach() throws IOException {
        FSPathResultListImpl list = new FSPathResultListImpl();
        list.add(new FSPathResult(new File("a"), "a"));
        list.add(new FSPathResult(new File("b"), "b"));
        list.add(new FSPathResult(new File("c"), "c"));
        list.add(new FSPathResult(new File("d"), "d"));
        list.add(new FSPathResult(new File("e"), "e"));
        list.add(new FSPathResult(new File("f"), "f"));
        list.add(new FSPathResult(new File("g"), "g"));
        list.add(new FSPathResult(new File("h"), "h"));
        list.add(new FSPathResult(new File("i"), "i"));
        list.add(new FSPathResult(new File("j"), "j"));
        list.each(new Callback() {
            public void call(FSPathResult result) {
                result.setPath(result.getPath().toUpperCase());
            }
        });
        assertEquals("A", list.get(0).getPath());
        assertEquals("B", list.get(1).getPath());
        assertEquals("C", list.get(2).getPath());
        assertEquals("D", list.get(3).getPath());
        assertEquals("E", list.get(4).getPath());
        assertEquals("F", list.get(5).getPath());
        assertEquals("G", list.get(6).getPath());
        assertEquals("H", list.get(7).getPath());
        assertEquals("I", list.get(8).getPath());
        assertEquals("J", list.get(9).getPath());
    }
}

// FSPathResultListImpl_1Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_1Test {
		
    @Test
    void testEach() throws IOException {
        FSPathResultListImpl list = new FSPathResultListImpl();
        list.add(new FSPathResult(new File("a"), "a"));
        list.add(new FSPathResult(new File("b"), "b"));
        list.add(new FSPathResult(new File("c"), "c"));
        list.add(new FSPathResult(new File("d"), "d"));
        list.add(new FSPathResult(new File("e"), "e"));
        list.add(new FSPathResult(new File("f"), "f"));
        list.add(new FSPathResult(new File("g"), "g"));
        list.add(new FSPathResult(new File("h"), "h"));
        list.add(new FSPathResult(new File("i"), "i"));
        list.add(new FSPathResult(new File("j"), "j"));
        list.each(new Callback() {
            public void call(FSPathResult result) {
                result.setPath(result.getPath().toUpperCase());
            }
        });
        assertEquals("A", list.get(0).getPath());
        assertEquals("B", list.get(1).getPath());
        assertEquals("C", list.get(2).getPath());
        assertEquals("D", list.get(3).getPath());
        assertEquals("E", list.get(4).getPath());
        assertEquals("F", list.get(5).getPath());
        assertEquals("G", list.get(6).getPath());
        assertEquals("H", list.get(7).getPath());
        assertEquals("I", list.get(8).getPath());
        assertEquals("J", list.get(9).getPath());
    }
}

// FSPathResultListImpl_2Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_2Test {
		
    @Test
    void testEach() throws IOException {
        FSPathResultListImpl list = new FSPathResultListImpl();
        list.add(new FSPathResult(new File("a"), "a"));
        list.add(new FSPathResult(new File("b"), "b"));
        list.add(new FSPathResult(new File("c"), "c"));
        list.add(new FSPathResult(new File("d"), "d"));
        list.add(new FSPathResult(new File("e"), "e"));
        list.add(new FSPathResult(new File("f"), "f"));
        list.add(new FSPathResult(new File("g"), "g"));
        list.add(new FSPathResult(new File("h"), "h"));
        list.add(new FSPathResult(new File("i"), "i"));
        list.add(new FSPathResult(new File("j"), "j"));
        list.each(new Callback() {
            public void call(FSPathResult result) {
                result.setPath(result.getPath().toUpperCase());
            }
        });
        assertEquals("A", list.get(0).getPath());
        assertEquals("B", list.get(1).getPath());
        assertEquals("C", list.get(2).getPath());
        assertEquals("D", list.get(3).getPath());
        assertEquals("E", list.get(4).getPath());
        assertEquals("F", list.get(5).getPath());
        assertEquals("G", list.get(6).getPath());
        assertEquals("H", list.get(7).getPath());
        assertEquals("I", list.get(8).getPath());
        assertEquals("J", list.get(9).getPath());
    }
}

// FSPathResultListImpl_3Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_3Test {
		
    @Test
    void testEach() throws IOException {
        FSPathResultListImpl list = new FSPathResultListImpl();
        list.add(new FSPathResult(new File("a"), "a"));
        list.add(new FSPathResult(new File("b"), "b"));
        list.add(new FSPathResult(new File("c"), "c"));
        list.add(new FSPathResult(new File("d"), "d"));
        list.add(new FSPathResult(new File("e"), "e"));
        list.add(new FSPathResult(new File("f"), "f"));
        list.add(new FSPathResult(new File("g"), "g"));
        list.add(new FSPathResult(new File("h"), "h"));
        list.add(new FSPathResult(new File("i"), "i"));
        list.add(new FSPathResult(new File("j"), "j"));
        list.each(new Callback() {
            public void call(FSPathResult result) {
                result.setPath(result.getPath().toUpperCase());
            }
        });
        assertEquals("A", list.get(0).getPath());
        assertEquals("B", list.get(1).getPath());
        assertEquals("C", list.get(2).getPath());
        assertEquals("D", list.get(3).getPath());
        assertEquals("E", list.get(4).getPath());
        assertEquals("F", list.get(5).getPath());
        assertEquals("G", list.get(6).getPath());
        assertEquals("H", list.get(7).getPath());
        assertEquals("I", list.get(8).getPath());
        assertEquals("J", list.get(9).getPath());
    }
}
