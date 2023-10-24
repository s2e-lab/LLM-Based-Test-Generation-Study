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

    private final Logger logger = LoggerFactory.getLogger(IndexingCallableTest.class);

    private File dataFile;

    private File indexFile;

    @Test
    void testCall() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        callable.call();
        assertTrue(indexFile.exists());
        assertTrue(indexFile.isFile());
        assertTrue(indexFile.length() > 0);
        indexFile.delete();
    }

    @Test
    void testCall_dataFileDoesNotExist() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.delete();
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(FileNotFoundException.class, callable::call);
    }

    @Test
    void testCall_dataFileIsNotAFile() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.delete();
        dataFile.createNewFile();
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(FileNotFoundException.class, callable::call);
    }

    @Test
    void testCall_indexFileExists() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        indexFile.createNewFile();
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, callable::call);
    }

    @Test
    void testCall_indexFileIsDirectory() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        indexFile.mkdir();
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, callable::call);
    }

    @Test
    void testCall_dataFileIsEmpty() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.createNewFile();
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, callable::call);
    }

    @Test
    void testCall_dataFileIsTooShort() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.createNewFile();
        RandomAccessFile dataRAFile = null;
        try {
            dataRAFile = new RandomAccessFile(dataFile, "rw");
            dataRAFile.setLength(DefaultFileHeaderStrategy.FILE_HEADER_SIZE - 1);
        } finally {
            closeQuietly(dataRAFile);
        }
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, callable::call);
    }

    @Test
    void testCall_dataFileIsTooShort_sparse() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.createNewFile();
        RandomAccessFile dataRAFile = null;
        try {
            dataRAFile = new RandomAccessFile(dataFile, "rw");
            dataRAFile.setLength(DefaultFileHeaderStrategy.FILE_HEADER_SIZE + SparseDataStrategy.INDEX_SIZE - 1);
        } finally {
            closeQuietly(dataRAFile);
        }
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, callable::call);
    }

    @Test
    void testCall_dataFileIsTooShort_sparse_2() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.createNewFile();
        RandomAccessFile dataRAFile = null;
        try {
            dataRAFile = new RandomAccessFile(dataFile, "rw");
            dataRAFile.setLength(DefaultFileHeaderStrategy.FILE_HEADER_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE - 1);
        } finally {
            closeQuietly(dataRAFile);
        }
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, callable::call);
    }

    @Test
    void testCall_dataFileIsTooShort_sparse_3() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.createNewFile();
        RandomAccessFile dataRAFile = null;
        try {
            dataRAFile = new RandomAccessFile(dataFile, "rw");
            dataRAFile.setLength(DefaultFileHeaderStrategy.FILE_HEADER_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE + SparseDataStrategy.INDEX_SIZE - 1);
        } finally {
            closeQuietly(dataRAFile);
        }
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, callable::call);
    }

    @Test
    void testCall_dataFileIsTooShort_sparse_4() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.createNewFile();
        RandomAccessFile dataRAFile = null;
        try {
            dataRAFile = new RandomAccessFile(dataFile, "rw");
            dataRAFile.setLength(DefaultFileHeaderStrategy.FILE_HEADER_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE - 1);
        } finally {
            closeQuietly(dataRAFile);
        }
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, callable::call);
    }

    @Test
    void testCall_dataFileIsTooShort_sparse_5() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.createNewFile();
        RandomAccessFile dataRAFile = null;
        try {
            dataRAFile = new RandomAccessFile(dataFile, "rw");
            dataRAFile.setLength(DefaultFileHeaderStrategy.FILE_HEADER_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE + SparseDataStrategy.INDEX_SIZE - 1);
        } finally {
            closeQuietly(dataRAFile);
        }
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, callable::call);
    }

    @Test
    void testCall_dataFileIsTooShort_sparse_6() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.createNewFile();
        RandomAccessFile dataRAFile = null;
        try {
            dataRAFile = new RandomAccessFile(dataFile, "rw");
            dataRAFile.setLength(DefaultFileHeaderStrategy.FILE_HEADER_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE - 1);
        } finally {
            closeQuietly(dataRAFile);
        }
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, callable::call);
    }

    @Test
    void testCall_dataFileIsTooShort_sparse_7() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.createNewFile();
        RandomAccessFile dataRAFile = null;
        try {
            dataRAFile = new RandomAccessFile(dataFile, "rw");
            dataRAFile.setLength(DefaultFileHeaderStrategy.FILE_HEADER_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE + SparseDataStrategy.INDEX_SIZE + SparseDataStrategy.DATA_LENGTH_SIZE + SparseDataStrategy.INDEX_SIZE - 1);
        } finally {
            closeQuietly(dataRAFile);
        }
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, callable::call);
    }

    @Test
    void testCall_dataFileIsTooShort_sparse_8() throws Exception {
        dataFile = new File("test.data");
        indexFile = new File("test.index");
        dataFile.createNewFile();
        RandomAccessFile dataRAFile = null;
        try {
            dataRAFile = new RandomAccessFile(dataFile, "rw");
            dataRAFile.setLength(DefaultFileHeaderStrategy.FILE_