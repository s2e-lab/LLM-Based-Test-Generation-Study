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

    /**
     * Test method for {@link FSPathResultListImpl#each(Callback)}.
     * @throws IOException
     */
    @Test
    void testEach() throws IOException {
        FSPathResultListImpl list = new FSPathResultListImpl();
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.each(new Callback() {
            public void call(FSPathResult result) throws IOException {
                File file = result.getFile();
                FileWriter writer = new FileWriter(file);
                writer.write("test");
                writer.close();
            }
        });
        for (FSPathResult result : list) {
            File file = result.getFile();
            FileReader reader = new FileReader(file);
            char[] buffer = new char[4];
            reader.read(buffer);
            assertEquals("test", new String(buffer));
            reader.close();
        }
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
		
    /**
     * Test method for {@link FSPathResultListImpl#each(Callback)}.
     * @throws IOException
     */
    @Test
    void testEach() throws IOException {
        FSPathResultListImpl list = new FSPathResultListImpl();
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.each(new Callback() {
            public void call(FSPathResult result) throws IOException {
                File file = result.getFile();
                FileWriter writer = new FileWriter(file);
                writer.write("test");
                writer.close();
            }
        });
        for (FSPathResult result : list) {
            File file = result.getFile();
            FileReader reader = new FileReader(file);
            char[] buffer = new char[4];
            reader.read(buffer);
            assertEquals("test", new String(buffer));
            reader.close();
        }
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
		
    /**
     * Test method for {@link FSPathResultListImpl#each(Callback)}.
     * @throws IOException
     */
    @Test
    void testEach() throws IOException {
        FSPathResultListImpl list = new FSPathResultListImpl();
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.each(new Callback() {
            public void call(FSPathResult result) throws IOException {
                File file = result.getFile();
                FileWriter writer = new FileWriter(file);
                writer.write("test");
                writer.close();
            }
        });
        for (FSPathResult result : list) {
            File file = result.getFile();
            FileReader reader = new FileReader(file);
            char[] buffer = new char[4];
            reader.read(buffer);
            assertEquals("test", new String(buffer));
            reader.close();
        }
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
		
    /**
     * Test method for {@link FSPathResultListImpl#each(Callback)}.
     * @throws IOException
     */
    @Test
    void testEach() throws IOException {
        FSPathResultListImpl list = new FSPathResultListImpl();
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.add(new FSPathResultImpl(new File("test.txt")));
        list.each(new Callback() {
            public void call(FSPathResult result) throws IOException {
                File file = result.getFile();
                FileWriter writer = new FileWriter(file);
                writer.write("test");
                writer.close();
            }
        });
        for (FSPathResult result : list) {
            File file = result.getFile();
            FileReader reader = new FileReader(file);
            char[] buffer = new char[4];
            reader.read(buffer);
            assertEquals("test", new String(buffer));
            reader.close();
        }
    }
}

// FSPathResultListImpl_4Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern