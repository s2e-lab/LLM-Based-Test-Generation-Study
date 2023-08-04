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
    * Test of {@link FSPathResultListImpl#delete()} method, of class {@link FSPathResultListImpl}.
    * @throws IOException
    * @throws OperationNotPermittedException
    */
    @Test
    void testDelete() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("test.txt")));
        instance.add(new FSPathResult(new File("test2.txt")));
        FSPathResultModificationList result = instance.delete();
        assertEquals(2, result.getSuccesses().size());
        assertEquals(0, result.getFailures().size());
    }

    /**
    * Test of {@link FSPathResultListImpl#delete()} method, of class {@link FSPathResultListImpl}.
    * @throws IOException
    * @throws OperationNotPermittedException
    */
    @Test
    void testDelete_1() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("test.txt")));
        instance.add(new FSPathResult(new File("test2.txt")));
        instance.add(new FSPathResult(new File("test3.txt")));
        FSPathResultModificationList result = instance.delete();
        assertEquals(2, result.getSuccesses().size());
        assertEquals(1, result.getFailures().size());
    }

    /**
    * Test of {@link FSPathResultListImpl#delete()} method, of class {@link FSPathResultListImpl}.
    * @throws IOException
    * @throws OperationNotPermittedException
    */
    @Test
    void testDelete_2() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("test.txt")));
        instance.add(new FSPathResult(new File("test2.txt")));
        instance.add(new FSPathResult(new File("test3.txt")));
        instance.add(new FSPathResult(new File("test4.txt")));
        FSPathResultModificationList result = instance.delete();
        assertEquals(2, result.getSuccesses().size());
        assertEquals(2, result.getFailures().size());
    }

    /**
    * Test of {@link FSPathResultListImpl#delete()} method, of class {@link FSPathResultListImpl}.
    * @throws IOException
    * @throws OperationNotPermittedException
    */
    @Test
    void testDelete_3() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("test.txt")));
        instance.add(new FSPathResult(new File("test2.txt")));
        instance.add(new FSPathResult(new File("test3.txt")));
        instance.add(new FSPathResult(new File("test4.txt")));
        instance.add(new FSPathResult(new File("test5.txt")));
        FSPathResultModificationList result = instance.delete();
        assertEquals(2, result.getSuccesses().size());
        assertEquals(3, result.getFailures().size());
    }

    /**
    * Test of {@link FSPathResultListImpl#delete()} method, of class {@link FSPathResultListImpl}.
    * @throws IOException
    * @throws OperationNotPermittedException
    */
    @Test
    void testDelete_4() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("test.txt")));
        instance.add(new FSPathResult(new File("test2.txt")));
        instance.add(new FSPathResult(new File("test3.txt")));
        instance.add(new FSPathResult(new File("test4.txt")));
        instance.add(new FSPathResult(new File("test5.txt")));
        instance.add(new FSPathResult(new File("test6.txt")));
        FSPathResultModificationList result = instance.delete();
        assertEquals(2, result.getSuccesses().size());
        assertEquals(4, result.getFailures().size());
    }

    /**
    * Test of {@link FSPathResultListImpl#delete()} method, of class {@link FSPathResultListImpl}.
    * @throws IOException
    * @throws OperationNotPermittedException
    */
    @Test
    void testDelete_5() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("test.txt")));
        instance.add(new FSPathResult(new File("test2.txt")));
        instance.add(new FSPathResult(new File("test3.txt")));
        instance.add(new FSPathResult(new File("test4.txt")));
        instance.add(new FSPathResult(new File("test5.txt")));
        instance.add(new FSPathResult(new File("test6.txt")));
        instance.add(new FSPathResult(new File("test7.txt")));
        FSPathResultModificationList result = instance.delete();
        assertEquals(2, result.getSuccesses().size());
        assertEquals(5, result.getFailures().size());
    }

    /**
    * Test of {@link FSPathResultListImpl#delete()} method, of class {@link FSPathResultListImpl}.
    * @throws IOException
    * @throws OperationNotPermittedException
    */
    @Test
    void testDelete_6() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("test.txt")));
        instance.add(new FSPathResult(new File("test2.txt")));
        instance.add(new FSPathResult(new File("test3.txt")));
        instance.add(new FSPathResult(new File("test4.txt")));
        instance.add(new FSPathResult(new File("test5.txt")));
        instance.add(new FSPathResult(new File("test6.txt")));
        instance.add(new FSPathResult(new File("test7.txt")));
        instance.add(new FSPathResult(new File("test8.txt")));
        FSPathResultModificationList result = instance.delete();
        assertEquals(2, result.getSuccesses().size());
        assertEquals(6, result.getFailures().size());
    }

    /**
    * Test of {@link FSPathResultListImpl#delete()} method, of class {@link FSPathResultListImpl}.
    * @throws IOException
    * @throws OperationNotPermittedException
    */
    @Test
    void testDelete_7() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("test.txt")));
        instance.add(new FSPathResult(new File("test2.txt")));
        instance.add(new FSPathResult(new File("test3.txt")));
        instance.add(new FSPathResult(new File("test4.txt")));
        instance.add(new FSPathResult(new File("test5.txt")));
        instance.add(new FSPathResult(new File("test6.txt")));
        instance.add(new FSPathResult(new File("test7.txt")));
        instance.add(new FSPathResult(new File("test8.txt")));
        instance.add(new FSPathResult(new File("test9.txt")));
        FSPathResultModificationList result = instance.delete();
        assertEquals(2, result.getSuccesses().size());
        assertEquals(7, result.getFailures().size());
    }

    /**
    * Test of {@link FSPathResultListImpl#delete()} method, of class {@link FSPathResultListImpl}.
    * @throws IOException
    * @throws OperationNotPermittedException
    */
    @Test
    void testDelete_8() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl instance = new FSPathResultListImpl();
        instance.add(new FSPathResult(new File("test.txt")));
        instance.add(new FSPathResult(new File("test2.txt")));
        instance.add(new FSPathResult(new File("test3.txt")));
        instance.add(new FSPathResult(new File("test4.txt")));
        instance.add(new FSPathResult(new File("test5.txt")));
        instance.add(new FSPathResult(new File("test6.txt")));
        instance.add(new FSPathResult(new File("test7.txt")));
        instance.add(new FSPathResult(new File("test8.txt")));
        instance.add(new FSPathResult(new File("test9.txt")));
        instance.add(new FSPathResult(new File("test10.txt")));
        FSPathResultModificationList result = instance.delete();
        assertEquals(2, result.getSuccesses().size