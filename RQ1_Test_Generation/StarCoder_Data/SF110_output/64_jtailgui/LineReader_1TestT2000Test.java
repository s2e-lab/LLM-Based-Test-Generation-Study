// LineReader_1Test.java
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
* It contains ten unit test cases for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_1Test {

    /**
    * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadBlock_01() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(0, 1);
        assertEquals(1, result.size());
        assertEquals("This is a test file", result.get(0));
        instance.close();
    }

    /**
    * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadBlock_02() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(0, 2);
        assertEquals(2, result.size());
        assertEquals("This is a test file", result.get(0));
        assertEquals("This is the second line", result.get(1));
        instance.close();
    }

    /**
    * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadBlock_03() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(0, 3);
        assertEquals(3, result.size());
        assertEquals("This is a test file", result.get(0));
        assertEquals("This is the second line", result.get(1));
        assertEquals("This is the third line", result.get(2));
        instance.close();
    }

    /**
    * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadBlock_04() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(0, 4);
        assertEquals(4, result.size());
        assertEquals("This is a test file", result.get(0));
        assertEquals("This is the second line", result.get(1));
        assertEquals("This is the third line", result.get(2));
        assertEquals("This is the fourth line", result.get(3));
        instance.close();
    }

    /**
    * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadBlock_05() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(0, 5);
        assertEquals(5, result.size());
        assertEquals("This is a test file", result.get(0));
        assertEquals("This is the second line", result.get(1));
        assertEquals("This is the third line", result.get(2));
        assertEquals("This is the fourth line", result.get(3));
        assertEquals("This is the fifth line", result.get(4));
        instance.close();
    }

    /**
    * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadBlock_06() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(0, 6);
        assertEquals(6, result.size());
        assertEquals("This is a test file", result.get(0));
        assertEquals("This is the second line", result.get(1));
        assertEquals("This is the third line", result.get(2));
        assertEquals("This is the fourth line", result.get(3));
        assertEquals("This is the fifth line", result.get(4));
        assertEquals("This is the sixth line", result.get(5));
        instance.close();
    }

    /**
    * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadBlock_07() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(0, 7);
        assertEquals(7, result.size());
        assertEquals("This is a test file", result.get(0));
        assertEquals("This is the second line", result.get(1));
        assertEquals("This is the third line", result.get(2));
        assertEquals("This is the fourth line", result.get(3));
        assertEquals("This is the fifth line", result.get(4));
        assertEquals("This is the sixth line", result.get(5));
        assertEquals("This is the seventh line", result.get(6));
        instance.close();
    }

    /**
    * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadBlock_08() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(0, 8);
        assertEquals(8, result.size());
        assertEquals("This is a test file", result.get(0));
        assertEquals("This is the second line", result.get(1));
        assertEquals("This is the third line", result.get(2));
        assertEquals("This is the fourth line", result.get(3));
        assertEquals("This is the fifth line", result.get(4));
        assertEquals("This is the sixth line", result.get(5));
        assertEquals("This is the seventh line", result.get(6));
        assertEquals("This is the eighth line", result.get(7));
        instance.close();
    }

    /**
    * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
    * @throws java.io.FileNotFoundException if the file does not exist
    * @throws java.io.IOException if an I/O error occurs
    */
    @Test
    void testReadBlock_09() throws FileNotFoundException, IOException {
        final File file = new File("src/test/resources/test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(0, 9);
        assertEquals(9, result.size());
        assertEquals("This is a test file", result.get(0));
        assertEquals("This is the second line", result.get(1));
        assertEquals("This is the third line", result.get(2));
        assertEquals("This is the fourth line", result.get(3));