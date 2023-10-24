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
     *
     * @throws java.io.IOException if an I/O error occurs
     */
    @Test
    void testReadBlock() throws IOException {
        final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_1Test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(1, 10);
        final List<String> expResult = new ArrayList<String>();
        expResult.add("1");
        expResult.add("2");
        expResult.add("3");
        expResult.add("4");
        expResult.add("5");
        expResult.add("6");
        expResult.add("7");
        expResult.add("8");
        expResult.add("9");
        expResult.add("10");
        assertEquals(expResult, result);
    }
}

// LineReader_2Test.java
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
class LineReader_2Test {
		
    /**
     * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
     *
     * @throws java.io.IOException if an I/O error occurs
     */
    @Test
    void testReadBlock() throws IOException {
        final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_2Test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(1, 10);
        final List<String> expResult = new ArrayList<String>();
        expResult.add("1");
        expResult.add("2");
        expResult.add("3");
        expResult.add("4");
        expResult.add("5");
        expResult.add("6");
        expResult.add("7");
        expResult.add("8");
        expResult.add("9");
        expResult.add("10");
        assertEquals(expResult, result);
    }
}

// LineReader_3Test.java
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
class LineReader_3Test {
		
    /**
     * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
     *
     * @throws java.io.IOException if an I/O error occurs
     */
    @Test
    void testReadBlock() throws IOException {
        final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_3Test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(1, 10);
        final List<String> expResult = new ArrayList<String>();
        expResult.add("1");
        expResult.add("2");
        expResult.add("3");
        expResult.add("4");
        expResult.add("5");
        expResult.add("6");
        expResult.add("7");
        expResult.add("8");
        expResult.add("9");
        expResult.add("10");
        assertEquals(expResult, result);
    }
}

// LineReader_4Test.java
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
class LineReader_4Test {
		
    /**
     * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
     *
     * @throws java.io.IOException if an I/O error occurs
     */
    @Test
    void testReadBlock() throws IOException {
        final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_4Test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(1, 10);
        final List<String> expResult = new ArrayList<String>();
        expResult.add("1");
        expResult.add("2");
        expResult.add("3");
        expResult.add("4");
        expResult.add("5");
        expResult.add("6");
        expResult.add("7");
        expResult.add("8");
        expResult.add("9");
        expResult.add("10");
        assertEquals(expResult, result);
    }
}

// LineReader_5Test.java
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
class LineReader_5Test {
		
    /**
     * Test of {@link LineReader#readBlock(int, int)} method, of class {@link LineReader}.
     *
     * @throws java.io.IOException if an I/O error occurs
     */
    @Test
    void testReadBlock() throws IOException {
        final File file = new File("src/test/resources/fr/pingtimeout/jtail/io/LineReader_5Test.txt");
        final FileIndex index = new FileIndex(file);
        final LineReader instance = new LineReader(file, index);
        final List<String> result = instance.readBlock(1, 10);
        final List<String> expResult = new ArrayList<String>();
        expResult.add("1");
        expResult.add("2");
        expResult.add("3");
        expResult.add("4");
        expResult.add("5");
        expResult.add("6");
        expResult.add("7");
        expResult.add("8");
        expResult.add("9");
        expResult.add("10");
        assertEquals(expResult, result);
    }
}

// LineReader_6Test.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io