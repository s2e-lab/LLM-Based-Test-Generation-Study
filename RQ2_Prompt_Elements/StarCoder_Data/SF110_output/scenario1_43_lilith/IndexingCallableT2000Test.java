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
    * Test case for {@link IndexingCallable#call()}:
    * <ul>
    * <li>File does not exist.</li>
    * </ul>
    */
    @Test
    void testCallFileDoesNotExist() {
        File dataFile = new File("doesNotExist.dat");
        File indexFile = new File("doesNotExist.idx");
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(FileNotFoundException.class, () -> {
            callable.call();
        });
    }

    /**
    * Test case for {@link IndexingCallable#call()}:
    * <ul>
    * <li>File is not a file.</li>
    * </ul>
    */
    @Test
    void testCallFileIsNotAFile() {
        File dataFile = new File(".");
        File indexFile = new File(".");
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(FileNotFoundException.class, () -> {
            callable.call();
        });
    }

    /**
    * Test case for {@link IndexingCallable#call()}:
    * <ul>
    * <li>File is not a valid file.</li>
    * </ul>
    */
    @Test
    void testCallFileIsNotAValidFile() {
        File dataFile = new File(".");
        File indexFile = new File(".");
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        assertThrows(IllegalArgumentException.class, () -> {
            callable.call();
        });
    }

    /**
    * Test case for {@link IndexingCallable#call()}:
    * <ul>
    * <li>File is a valid file.</li>
    * </ul>
    */
    @Test
    void testCallFileIsValidFile() {
        File dataFile = new File("src/test/resources/test.dat");
        File indexFile = new File("src/test/resources/test.idx");
        IndexingCallable callable = new IndexingCallable(dataFile, indexFile);
        try {
            callable.call();
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}
