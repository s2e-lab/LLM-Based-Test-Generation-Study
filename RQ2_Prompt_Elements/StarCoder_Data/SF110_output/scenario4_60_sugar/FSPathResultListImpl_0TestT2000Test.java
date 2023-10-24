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
        FSPathResultListImpl fsPathResultList = new FSPathResultListImpl();
        fsPathResultList.add(new FSPathResultImpl(new File("test.txt")));
        fsPathResultList.add(new FSPathResultImpl(new File("test2.txt")));
        fsPathResultList.add(new FSPathResultImpl(new File("test3.txt")));
        fsPathResultList.add(new FSPathResultImpl(new File("test4.txt")));
        fsPathResultList.add(new FSPathResultImpl(new File("test5.txt")));
        fsPathResultList.add(new FSPathResultImpl(new File("test6.txt")));
        fsPathResultList.add(new FSPathResultImpl(new File("test7.txt")));
        fsPathResultList.add(new FSPathResultImpl(new File("test8.txt")));
        fsPathResultList.add(new FSPathResultImpl(new File("test9.txt")));
        fsPathResultList.add(new FSPathResultImpl(new File("test10.txt")));
        FSPathResultListImpl fsPathResultList2 = new FSPathResultListImpl();
        fsPathResultList2.add(new FSPathResultImpl(new File("test11.txt")));
        fsPathResultList2.add(new FSPathResultImpl(new File("test12.txt")));
        fsPathResultList2.add(new FSPathResultImpl(new File("test13.txt")));
        fsPathResultList2.add(new FSPathResultImpl(new File("test14.txt")));
        fsPathResultList2.add(new FSPathResultImpl(new File("test15.txt")));
        fsPathResultList2.add(new FSPathResultImpl(new File("test16.txt")));
        fsPathResultList2.add(new FSPathResultImpl(new File("test17.txt")));
        fsPathResultList2.add(new FSPathResultImpl(new File("test18.txt")));
        fsPathResultList2.add(new FSPathResultImpl(new File("test19.txt")));
        fsPathResultList2.add(new FSPathResultImpl(new File("test20.txt")));
        FSPathResultListImpl fsPathResultList3 = new FSPathResultListImpl();
        fsPathResultList3.add(new FSPathResultImpl(new File("test21.txt")));
        fsPathResultList3.add(new FSPathResultImpl(new File("test22.txt")));
        fsPathResultList3.add(new FSPathResultImpl(new File("test23.txt")));
        fsPathResultList3.add(new FSPathResultImpl(new File("test24.txt")));
        fsPathResultList3.add(new FSPathResultImpl(new File("test25.txt")));
        fsPathResultList3.add(new FSPathResultImpl(new File("test26.txt")));
        fsPathResultList3.add(new FSPathResultImpl(new File("test27.txt")));
        fsPathResultList3.add(new FSPathResultImpl(new File("test28.txt")));
        fsPathResultList3.add(new FSPathResultImpl(new File("test29.txt")));
        fsPathResultList3.add(new FSPathResultImpl(new File("test30.txt")));
        FSPathResultListImpl fsPathResultList4 = new FSPathResultListImpl();
        fsPathResultList4.add(new FSPathResultImpl(new File("test31.txt")));
        fsPathResultList4.add(new FSPathResultImpl(new File("test32.txt")));
        fsPathResultList4.add(new FSPathResultImpl(new File("test33.txt")));
        fsPathResultList4.add(new FSPathResultImpl(new File("test34.txt")));
        fsPathResultList4.add(new FSPathResultImpl(new File("test35.txt")));
        fsPathResultList4.add(new FSPathResultImpl(new File("test36.txt")));
        fsPathResultList4.add(new FSPathResultImpl(new File("test37.txt")));
        fsPathResultList4.add(new FSPathResultImpl(new File("test38.txt")));
        fsPathResultList4.add(new FSPathResultImpl(new File("test39.txt")));
        fsPathResultList4.add(new FSPathResultImpl(new File("test40.txt")));
        FSPathResultListImpl fsPathResultList5 = new FSPathResultListImpl();
        fsPathResultList5.add(new FSPathResultImpl(new File("test41.txt")));
        fsPathResultList5.add(new FSPathResultImpl(new File("test42.txt")));
        fsPathResultList5.add(new FSPathResultImpl(new File("test43.txt")));
        fsPathResultList5.add(new FSPathResultImpl(new File("test44.txt")));
        fsPathResultList5.add(new FSPathResultImpl(new File("test45.txt")));
        fsPathResultList5.add(new FSPathResultImpl(new File("test46.txt")));
        fsPathResultList5.add(new FSPathResultImpl(new File("test47.txt")));
        fsPathResultList5.add(new FSPathResultImpl(new File("test48.txt")));
        fsPathResultList5.add(new FSPathResultImpl(new File("test49.txt")));
        fsPathResultList5.add(new FSPathResultImpl(new File("test50.txt")));
        FSPathResultListImpl fsPathResultList6 = new FSPathResultListImpl();
        fsPathResultList6.add(new FSPathResultImpl(new File("test51.txt")));
        fsPathResultList6.add(new FSPathResultImpl(new File("test52.txt")));
        fsPathResultList6.add(new FSPathResultImpl(new File("test53.txt")));
        fsPathResultList6.add(new FSPathResultImpl(new File("test54.txt")));
        fsPathResultList6.add(new FSPathResultImpl(new File("test55.txt")));
        fsPathResultList6.add(new FSPathResultImpl(new File("test56.txt")));
        fsPathResultList6.add(new FSPathResultImpl(new File("test57.txt")));
        fsPathResultList6.add(new FSPathResultImpl(new File("test58.txt")));
        fsPathResultList6.add(new FSPathResultImpl(new File("test59.txt")));
        fsPathResultList6.add(new FSPathResultImpl(new File("test60.txt")));
        FSPathResultListImpl fsPathResultList7 = new FSPathResultListImpl();
        fsPathResultList7.add(new FSPathResultImpl(new File("test61.txt")));
        fsPathResultList7.add(new FSPathResultImpl(new File("test62.txt")));
        fsPathResultList7.add(new FSPathResultImpl(new File("test63.txt")));
        fsPathResultList7.add(new FSPathResultImpl(new File("test64.txt")));
        fsPathResultList7.add(new FSPathResultImpl(new File("test65.txt")));
        fsPathResultList7.add(new FSPathResultImpl(new File("test66.txt")));
        fsPathResultList7.add(new FSPathResultImpl(new File("test67.txt")));
        fsPathResultList7.add(new FSPathResultImpl(new File("test68.txt")));
        fsPathResultList7.add(new FSPathResultImpl(new File("test69.txt")));
        fsPathResultList7.add(new FSPathResultImpl(new File("test70.txt")));
        FSPathResultListImpl fsPathResultList8 = new FSPathResultListImpl();
        fsPathResultList8.add(new FSPathResultImpl(new File("test71.txt")));
        fsPathResultList8.add(new FSPathResultImpl(new File("test72.txt")));
        fsPathResultList8.add(new FSPathResultImpl(new File("test73.txt")));
        fsPathResultList8.add(new FSPathResultImpl(new File("test74.txt")));
        fsPathResultList8.add(new FSPathResultImpl(new File("test75.txt")));
        fsPathResultList8.add(new FSPathResultImpl(new File("test76.txt")));
        fsPathResultList8.add