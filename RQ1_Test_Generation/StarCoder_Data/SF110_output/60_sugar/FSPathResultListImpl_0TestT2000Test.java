// FSPathResultListImpl_0Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
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
     * Test of each method, of class FSPathResultListImpl.
     * @throws java.io.IOException
     */
    @Test
    void testEach() throws IOException {
        System.out.println("each");
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("a.txt")));
        instance.add(new FSPathResult(new File("b.txt")));
        instance.add(new FSPathResult(new File("c.txt")));
        instance.each(new Callback() {
            public void call(FSPathResult result) {
                System.out.println(result.getFile().getName());
            }
        });
    }
}

// FSPathResultListImpl_1Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
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
* It contains ten unit test cases for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_1Test {
		
    /**
     * Test of delete method, of class FSPathResultListImpl.
     * @throws java.io.IOException
     */
    @Test
    void testDelete() throws IOException {
        System.out.println("delete");
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("a.txt")));
        instance.add(new FSPathResult(new File("b.txt")));
        instance.add(new FSPathResult(new File("c.txt")));
        FSPathResultModificationListImpl result = (FSPathResultModificationListImpl) instance.delete();
        assertEquals(3, result.getSuccesses().size());
        assertEquals(0, result.getFailures().size());
    }
}

// FSPathResultListImpl_2Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
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
* It contains ten unit test cases for the {@link FSPathResultListImpl#copy(String)} method.
*/
class FSPathResultListImpl_2Test {
		
    /**
     * Test of copy method, of class FSPathResultListImpl.
     * @throws java.io.IOException
     */
    @Test
    void testCopy() throws IOException {
        System.out.println("copy");
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("a.txt")));
        instance.add(new FSPathResult(new File("b.txt")));
        instance.add(new FSPathResult(new File("c.txt")));
        FSPathResultModificationListImpl result = (FSPathResultModificationListImpl) instance.copy("c:\\temp");
        assertEquals(3, result.getSuccesses().size());
        assertEquals(0, result.getFailures().size());
    }
}

// FSPathResultListImpl_3Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
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
* It contains ten unit test cases for the {@link FSPathResultListImpl#rename(String, String)} method.
*/
class FSPathResultListImpl_3Test {
		
    /**
     * Test of rename method, of class FSPathResultListImpl.
     * @throws java.io.IOException
     */
    @Test
    void testRename() throws IOException {
        System.out.println("rename");
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("a.txt")));
        instance.add(new FSPathResult(new File("b.txt")));
        instance.add(new FSPathResult(new File("c.txt")));
        FSPathResultModificationListImpl result = (FSPathResultModificationListImpl) instance.rename("(.*)\.txt", "$1.bak");
        assertEquals(3, result.getSuccesses().size());
        assertEquals(0, result.getFailures().size());
    }
}

// FSPathResultListImpl_4Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
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
* It contains ten unit test cases for the {@link FSPathResultListImpl#move(String)} method.
*/
class FSPathResultListImpl_4Test {
		
    /**
     * Test of move method, of class FSPathResultListImpl.
     * @throws java.io.IOException
     */
    @Test
    void testMove() throws IOException {
        System.out.println("move");
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("a.txt")));
        instance.add(new FSPathResult(new File("b.txt")));
        instance.add(new FSPathResult(new File("c.txt")));
        FSPathResultModificationListImpl result = (FSPathResultModificationListImpl) instance.move("c:\\temp");
        assertEquals(3, result.getSuccesses().size());
        assertEquals(0, result.getFailures().size());
    }
}

// FSPathResultListImpl_5Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
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
* It contains ten unit test cases for the {@link FSPathResultListImpl#isListOfFiles()} method.
*/
class FSPathResultListImpl_5Test {
		
    /**
     * Test of isListOfFiles method, of class FSPathResultListImpl.
     * @throws java.io.IOException
     */
    @Test
    void testIsListOfFiles() throws IOException {
        System.out.println("isListOfFiles");
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("a.txt")));
        instance.add(new FSPathResult(new File("b.txt")));
        instance.add(new FSPathResult(new File("c.txt")));
        boolean expResult = true;
        boolean result = instance.isListOfFiles();
        assertEquals(expResult, result);
    }
}

// FSPathResultListImpl_6Test.