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
* It contains ten unit test cases for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_1Test {

    @Test
    void testDelete() throws IOException, OperationNotPermittedException {
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
        FSPathResultModificationList deletionList = list.delete();
        assertEquals(10, deletionList.size());
        assertEquals(10, list.size());
        assertEquals(0, deletionList.getFailures().size());
        assertEquals(10, deletionList.getSuccesses().size());
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
* It contains ten unit test cases for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_2Test {
		
    @Test
    void testDelete() throws IOException, OperationNotPermittedException {
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
        FSPathResultModificationList deletionList = list.delete();
        assertEquals(10, deletionList.size());
        assertEquals(10, list.size());
        assertEquals(0, deletionList.getFailures().size());
        assertEquals(10, deletionList.getSuccesses().size());
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
* It contains ten unit test cases for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_3Test {
		
    @Test
    void testDelete() throws IOException, OperationNotPermittedException {
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
        FSPathResultModificationList deletionList = list.delete();
        assertEquals(10, deletionList.size());
        assertEquals(10, list.size());
        assertEquals(0, deletionList.getFailures().size());
        assertEquals(10, deletionList.getSuccesses().size());
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
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_4Test {
		
    @Test
    void testDelete() throws IOException, OperationNotPermittedException {
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
        FSPathResultModificationList deletionList = list.delete();
        assertEquals(10, deletionList.size());
        assertEquals(10, list.size());
        assertEquals(0, deletionList.getFailures().size());
        assertEquals(10, deletionList.getSuccesses().size());
    }
}

// FSPathResultListImpl_5Test.java
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
class FSPathResultListImpl_5Test {
		
    @Test
    void testDelete() throws IOException, OperationNotPermittedException {
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
        FSPathResultModificationList deletionList = list.delete();
        assertEquals(10, deletionList.size());