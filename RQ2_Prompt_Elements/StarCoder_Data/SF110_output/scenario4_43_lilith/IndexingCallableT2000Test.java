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

    private final File dataFile = new File("data.dat");

    private final File indexFile = new File("index.dat");

    private final IndexingCallable callable = new IndexingCallable(dataFile, indexFile);

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall() throws Exception {
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsNull() throws Exception {
        callable.setDataFile(null);
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsNull() throws Exception {
        callable.setIndexFile(null);
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileDoesNotExist() throws Exception {
        callable.setDataFile(new File("data.dat"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileDoesNotExist() throws Exception {
        callable.setIndexFile(new File("index.dat"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsDirectory() throws Exception {
        callable.setDataFile(new File("src"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsDirectory() throws Exception {
        callable.setIndexFile(new File("src"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsFile() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsFile() throws Exception {
        callable.setIndexFile(new File("src/test/resources/index.dat"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsSymbolicLink() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat.link"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsSymbolicLink() throws Exception {
        callable.setIndexFile(new File("src/test/resources/index.dat.link"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsSymbolicLinkToDirectory() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat.link.dir"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsSymbolicLinkToDirectory() throws Exception {
        callable.setIndexFile(new File("src/test/resources/index.dat.link.dir"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsSymbolicLinkToFile() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat.link.file"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsSymbolicLinkToFile() throws Exception {
        callable.setIndexFile(new File("src/test/resources/index.dat.link.file"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsSymbolicLinkToNonExistingFile() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat.link.nonexisting"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsSymbolicLinkToNonExistingFile() throws Exception {
        callable.setIndexFile(new File("src/test/resources/index.dat.link.nonexisting"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsSymbolicLinkToNonExistingDirectory() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat.link.nonexisting.dir"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsSymbolicLinkToNonExistingDirectory() throws Exception {
        callable.setIndexFile(new File("src/test/resources/index.dat.link.nonexisting.dir"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsSymbolicLinkToNonExistingSymbolicLink() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat.link.nonexisting.link"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsSymbolicLinkToNonExistingSymbolicLink() throws Exception {
        callable.setIndexFile(new File("src/test/resources/index.dat.link.nonexisting.link"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsNonExistingFile() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat.nonexisting"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsNonExistingFile() throws Exception {
        callable.setIndexFile(new File("src/test/resources/index.dat.nonexisting"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsNonExistingDirectory() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat.nonexisting.dir"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsNonExistingDirectory() throws Exception {
        callable.setIndexFile(new File("src/test/resources/index.dat.nonexisting.dir"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsNonExistingSymbolicLink() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat.nonexisting.link"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsNonExistingSymbolicLink() throws Exception {
        callable.setIndexFile(new File("src/test/resources/index.dat.nonexisting.link"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsNonExistingNonExistingSymbolicLink() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat.nonexisting.nonexisting.link"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsNonExistingNonExistingSymbolicLink() throws Exception {
        callable.setIndexFile(new File("src/test/resources/index.dat.nonexisting.nonexisting.link"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_dataFileIsNonExistingNonExistingNonExistingSymbolicLink() throws Exception {
        callable.setDataFile(new File("src/test/resources/data.dat.nonexisting.nonexisting.nonexisting.link"));
        callable.call();
    }

    /**
     * Test of call method, of class IndexingCallable.
     */
    @Test
    void testCall_indexFileIsNonExistingNonExistingNonExistingSymbolicLink() throws Exception {
        callable.setIndex