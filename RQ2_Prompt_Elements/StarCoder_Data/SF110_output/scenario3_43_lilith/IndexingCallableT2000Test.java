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

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexingCallableTest.class);

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        IndexingCallable instance = new IndexingCallable(file);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_FileHeaderStrategy() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
        IndexingCallable instance = new IndexingCallable(file, fileHeaderStrategy);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_IndexStrategy() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        IndexStrategy indexStrategy = new DefaultIndexStrategy();
        IndexingCallable instance = new IndexingCallable(file, indexStrategy);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_DataStrategy() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        DataStrategy dataStrategy = new DefaultDataStrategy();
        IndexingCallable instance = new IndexingCallable(file, dataStrategy);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_FileHeaderStrategy_IndexStrategy() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
        IndexStrategy indexStrategy = new DefaultIndexStrategy();
        IndexingCallable instance = new IndexingCallable(file, fileHeaderStrategy, indexStrategy);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_FileHeaderStrategy_IndexStrategy_DataStrategy() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
        IndexStrategy indexStrategy = new DefaultIndexStrategy();
        DataStrategy dataStrategy = new DefaultDataStrategy();
        IndexingCallable instance = new IndexingCallable(file, fileHeaderStrategy, indexStrategy, dataStrategy);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_FileHeaderStrategy_IndexStrategy_DataStrategy_SparseDataStrategy() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
        IndexStrategy indexStrategy = new DefaultIndexStrategy();
        DataStrategy dataStrategy = new DefaultDataStrategy();
        SparseDataStrategy sparseDataStrategy = new SparseDataStrategy();
        IndexingCallable instance = new IndexingCallable(file, fileHeaderStrategy, indexStrategy, dataStrategy, sparseDataStrategy);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_FileHeaderStrategy_IndexStrategy_DataStrategy_SparseDataStrategy_File() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
        IndexStrategy indexStrategy = new DefaultIndexStrategy();
        DataStrategy dataStrategy = new DefaultDataStrategy();
        SparseDataStrategy sparseDataStrategy = new SparseDataStrategy();
        IndexingCallable instance = new IndexingCallable(file, fileHeaderStrategy, indexStrategy, dataStrategy, sparseDataStrategy, file);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_FileHeaderStrategy_IndexStrategy_DataStrategy_SparseDataStrategy_File_FileHeader() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
        IndexStrategy indexStrategy = new DefaultIndexStrategy();
        DataStrategy dataStrategy = new DefaultDataStrategy();
        SparseDataStrategy sparseDataStrategy = new SparseDataStrategy();
        FileHeader fileHeader = new FileHeader();
        IndexingCallable instance = new IndexingCallable(file, fileHeaderStrategy, indexStrategy, dataStrategy, sparseDataStrategy, file, fileHeader);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_FileHeaderStrategy_IndexStrategy_DataStrategy_SparseDataStrategy_File_FileHeader_RandomAccessFile() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
        IndexStrategy indexStrategy = new DefaultIndexStrategy();
        DataStrategy dataStrategy = new DefaultDataStrategy();
        SparseDataStrategy sparseDataStrategy = new SparseDataStrategy();
        FileHeader fileHeader = new FileHeader();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        IndexingCallable instance = new IndexingCallable(file, fileHeaderStrategy, indexStrategy, dataStrategy, sparseDataStrategy, file, fileHeader, randomAccessFile);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_FileHeaderStrategy_IndexStrategy_DataStrategy_SparseDataStrategy_File_FileHeader_RandomAccessFile_Long() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
        IndexStrategy indexStrategy = new DefaultIndexStrategy();
        DataStrategy dataStrategy = new DefaultDataStrategy();
        SparseDataStrategy sparseDataStrategy = new SparseDataStrategy();
        FileHeader fileHeader = new FileHeader();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        long offset = 0L;
        IndexingCallable instance = new IndexingCallable(file, fileHeaderStrategy, indexStrategy, dataStrategy, sparseDataStrategy, file, fileHeader, randomAccessFile, offset);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_FileHeaderStrategy_IndexStrategy_DataStrategy_SparseDataStrategy_File_FileHeader_RandomAccessFile_Long_Long() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
        IndexStrategy indexStrategy = new DefaultIndexStrategy();
        DataStrategy dataStrategy = new DefaultDataStrategy();
        SparseDataStrategy sparseDataStrategy = new SparseDataStrategy();
        FileHeader fileHeader = new FileHeader();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        long offset = 0L;
        long length = 0L;
        IndexingCallable instance = new IndexingCallable(file, fileHeaderStrategy, indexStrategy, dataStrategy, sparseDataStrategy, file, fileHeader, randomAccessFile, offset, length);
        Long expResult = 0L;
        Long result = instance.call();
        assertEquals(expResult, result);
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_FileHeaderStrategy_IndexStrategy_DataStrategy_SparseDataStrategy_File_FileHeader_RandomAccessFile_Long_Long_Long() throws Exception {
        LOGGER.info("call");
        File file = new File("test.txt");
        FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
        IndexStrategy indexStrategy = new DefaultIndexStrategy();
        DataStrategy dataStrategy = new DefaultDataStrategy();
        SparseDataStrategy sparseDataStrategy = new SparseDataStrategy();
        FileHeader fileHeader = new FileHeader();
        RandomAccessFile randomAccess