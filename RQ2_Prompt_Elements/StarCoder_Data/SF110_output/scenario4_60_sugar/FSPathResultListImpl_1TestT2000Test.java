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
    * @throws IOException
    * @throws OperationNotPermittedException
    */
    @Test
    void testDelete() throws IOException, OperationNotPermittedException {
        FSPathResultListImpl fsPathResultList = new FSPathResultListImpl();
        FSPathResultImpl fsPathResult = new FSPathResultImpl();
        fsPathResult.setResult(new File("testDelete.txt"));
        fsPathResultList.add(fsPathResult);
        fsPathResultList.delete();
        assertEquals(1, fsPathResultList.size());
        assertEquals(true, fsPathResultList.get(0).isSuccess());
        assertEquals(false, fsPathResultList.get(0).isFailure());
        assertEquals(false, fsPathResultList.get(0).isSkipped());
        assertEquals(false, fsPathResultList.get(0).isIgnored());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
        assertEquals(false, fsPathResultList.get(0).isNoOp());
       