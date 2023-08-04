// LineReader_0Test.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineReader}.
* It contains ten unit test cases for the {@link LineReader#readLine(int)} method.
*/
class LineReader_0Test {

    /**
    * Test of {@link LineReader#readLine(int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadLine() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final String expResult = "This is a test file";
        final String result = instance.readLine(0);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link LineReader#readLine(int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadLine_1() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final String expResult = "This is a test file";
        final String result = instance.readLine(1);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link LineReader#readLine(int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadLine_2() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final String expResult = "This is a test file";
        final String result = instance.readLine(2);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link LineReader#readLine(int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadLine_3() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final String expResult = "This is a test file";
        final String result = instance.readLine(3);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link LineReader#readLine(int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadLine_4() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final String expResult = "This is a test file";
        final String result = instance.readLine(4);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link LineReader#readLine(int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadLine_5() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final String expResult = "This is a test file";
        final String result = instance.readLine(5);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link LineReader#readLine(int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadLine_6() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final String expResult = "This is a test file";
        final String result = instance.readLine(6);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link LineReader#readLine(int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadLine_7() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final String expResult = "This is a test file";
        final String result = instance.readLine(7);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link LineReader#readLine(int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadLine_8() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final String expResult = "This is a test file";
        final String result = instance.readLine(8);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link LineReader#readLine(int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadLine_9() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final String expResult = "This is a test file";
        final String result = instance.readLine(9);
        assertEquals(expResult, result);
    }
}
