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

    /**
    * Test method for {@link FSPathResultListImpl#delete()}.
    * @throws IOException - NOTE this method does not currently thrown an IOException
    * @throws OperationNotPermittedException - this exception will be thrown if<br/>
    *  The FSPathResult objects contained in this FSPathResultList don't contain<br/>
    *  java.io.File objects<br/>
    *  (i.e the FSPath query was written to return Boolean, String nor numerical results).
    */
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
        FSPathResultModificationListImpl deletionList = (FSPathResultModificationListImpl) list.delete();
        assertEquals(10, deletionList.getSuccessCount());
        assertEquals(0, deletionList.getFailureCount());
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
		
    /**
    * Test method for {@link FSPathResultListImpl#delete()}.
    * @throws IOException - NOTE this method does not currently thrown an IOException
    * @throws OperationNotPermittedException - this exception will be thrown if<br/>
    *  The FSPathResult objects contained in this FSPathResultList don't contain<br/>
    *  java.io.File objects<br/>
    *  (i.e the FSPath query was written to return Boolean, String nor numerical results).
    */
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
        FSPathResultModificationListImpl deletionList = (FSPathResultModificationListImpl) list.delete();
        assertEquals(10, deletionList.getSuccessCount());
        assertEquals(0, deletionList.getFailureCount());
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
		
    /**
    * Test method for {@link FSPathResultListImpl#delete()}.
    * @throws IOException - NOTE this method does not currently thrown an IOException
    * @throws OperationNotPermittedException - this exception will be thrown if<br/>
    *  The FSPathResult objects contained in this FSPathResultList don't contain<br/>
    *  java.io.File objects<br/>
    *  (i.e the FSPath query was written to return Boolean, String nor numerical results).
    */
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
        FSPathResultModificationListImpl deletionList = (FSPathResultModificationListImpl) list.delete();
        assertEquals(10, deletionList.getSuccessCount());
        assertEquals(0, deletionList.getFailureCount());
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
		
    /**
    * Test method for {@link FSPathResultListImpl#delete()}.
    * @throws IOException - NOTE this method does not currently thrown an IOException
    * @throws OperationNotPermittedException - this exception will be thrown if<br/>
    *  The FSPathResult objects contained in this FSPathResultList don't contain<br/>
    *  java.io.File objects<br/>
    *  (i.e the FSPath query was written to return Boolean, String nor numerical results).
    */
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
        FSPathResultModificationListImpl deletionList = (FSPathResultModificationListImpl) list.delete();
        assertEquals(10, deletionList.getSuccessCount());
        assertEquals(0, deletionList.getFailureCount());
    }
}

// FSPathResultListImpl_5Test.java
package net.sf.sugar.fspath;

