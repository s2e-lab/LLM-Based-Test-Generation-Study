// IndexingCallableTest.java
package de.huxhorn.lilith.swing.callables;

import de.huxhorn.sulky.codec.filebuffer.DefaultDataStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultFileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultIndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.FileHeader;
import de.huxhorn.sulky.codec.filebuffer.FileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.IndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.SparseDataStrategy;
import de.huxhorn.sulky.tasks.AbstractProgressingCallable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IndexingCallable}.
* It contains ten unit test cases for the {@link IndexingCallable#call()} method.
*/
class IndexingCallableTest {

    private static final Logger logger = LoggerFactory.getLogger(IndexingCallableTest.class);

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall() throws Exception {
        File dataFile = new File("test.data");
        File indexFile = new File("test.index");
        IndexingCallable instance = new IndexingCallable(dataFile, indexFile);
        instance.call();
        assertTrue(indexFile.exists());
        assertTrue(indexFile.isFile());
        assertTrue(indexFile.length() > 0);
        dataFile.delete();
        indexFile.delete();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withSparseFile() throws Exception {
        File dataFile = new File("test.data");
        File indexFile = new File("test.index");
        IndexingCallable instance = new IndexingCallable(dataFile, indexFile);
        instance.call();
        assertTrue(indexFile.exists());
        assertTrue(indexFile.isFile());
        assertTrue(indexFile.length() > 0);
        dataFile.delete();
        indexFile.delete();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNonExistingFile() throws Exception {
        File dataFile = new File("test.data");
        File indexFile = new File("test.index");
        IndexingCallable instance = new IndexingCallable(dataFile, indexFile);
        instance.call();
        assertFalse(indexFile.exists());
        assertFalse(indexFile.isFile());
        assertEquals(0, indexFile.length());
        dataFile.delete();
        indexFile.delete();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNonFile() throws Exception {
        File dataFile = new File("test.data");
        File indexFile = new File("test.index");
        dataFile.createNewFile();
        IndexingCallable instance = new IndexingCallable(dataFile, indexFile);
        instance.call();
        assertFalse(indexFile.exists());
        assertFalse(indexFile.isFile());
        assertEquals(0, indexFile.length());
        dataFile.delete();
        indexFile.delete();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withEmptyFile() throws Exception {
        File dataFile = new File("test.data");
        File indexFile = new File("test.index");
        dataFile.createNewFile();
        IndexingCallable instance = new IndexingCallable(dataFile, indexFile);
        instance.call();
        assertFalse(indexFile.exists());
        assertFalse(indexFile.isFile());
        assertEquals(0, indexFile.length());
        dataFile.delete();
        indexFile.delete();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFile() throws Exception {
        File dataFile = new File("test.data");
        File indexFile = new File("test.index");
        IndexingCallable instance = new IndexingCallable(dataFile, indexFile);
        instance.call();
        assertFalse(indexFile.exists());
        assertFalse(indexFile.isFile());
        assertEquals(0, indexFile.length());
        dataFile.delete();
        indexFile.delete();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullIndexFile() throws Exception {
        File dataFile = new File("test.data");
        IndexingCallable instance = new IndexingCallable(dataFile, null);
        instance.call();
        assertFalse(dataFile.exists());
        assertFalse(dataFile.isFile());
        assertEquals(0, dataFile.length());
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullDataFile() throws Exception {
        File indexFile = new File("test.index");
        IndexingCallable instance = new IndexingCallable(null, indexFile);
        instance.call();
        assertFalse(indexFile.exists());
        assertFalse(indexFile.isFile());
        assertEquals(0, indexFile.length());
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile_withNullIndexFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile_withNullIndexFile_withNullDataFile() throws Exception {
        IndexingCallable instance = new IndexingCallable(null, null);
        instance.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_withNullFileAndNullIndexFile_withNullDataFile_withNullIndexFile_withNullData