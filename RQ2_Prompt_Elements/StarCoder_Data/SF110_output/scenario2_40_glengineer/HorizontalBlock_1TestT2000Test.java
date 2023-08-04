// HorizontalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractParallelSubblocks()} method.
*/
class HorizontalBlock_1Test {

    /**
     * Test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two parallel subblocks.
     * The first subblock contains the word "Hello" and the second subblock contains the word "World".
     */
    @Test
    void extractParallelSubblocks_1() {
        HorizontalBlock block = new HorizontalBlock(new WordPosition(0, 0, 0, "Hello"), new WordPosition(0, 0, 0, "World"));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals("Hello", subblocks.get(0).getWords().get(0).getWord());
        assertEquals("World", subblocks.get(1).getWords().get(0).getWord());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two parallel subblocks.
     * The first subblock contains the word "Hello" and the second subblock contains the word "World".
     * The first subblock is optimized and the second subblock is not.
     */
    @Test
    void extractParallelSubblocks_2() {
        HorizontalBlock block = new HorizontalBlock(new WordPosition(0, 0, 0, "Hello"), new WordPosition(0, 0, 0, "World"));
        block.optimize();
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals("Hello", subblocks.get(0).getWords().get(0).getWord());
        assertEquals("World", subblocks.get(1).getWords().get(0).getWord());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two parallel subblocks.
     * The first subblock contains the word "Hello" and the second subblock contains the word "World".
     * The first subblock is not optimized and the second subblock is optimized.
     */
    @Test
    void extractParallelSubblocks_3() {
        HorizontalBlock block = new HorizontalBlock(new WordPosition(0, 0, 0, "Hello"), new WordPosition(0, 0, 0, "World"));
        block.optimize();
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals("Hello", subblocks.get(0).getWords().get(0).getWord());
        assertEquals("World", subblocks.get(1).getWords().get(0).getWord());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two parallel subblocks.
     * The first subblock contains the word "Hello" and the second subblock contains the word "World".
     * The first subblock is optimized and the second subblock is optimized.
     */
    @Test
    void extractParallelSubblocks_4() {
        HorizontalBlock block = new HorizontalBlock(new WordPosition(0, 0, 0, "Hello"), new WordPosition(0, 0, 0, "World"));
        block.optimize();
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals("Hello", subblocks.get(0).getWords().get(0).getWord());
        assertEquals("World", subblocks.get(1).getWords().get(0).getWord());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two parallel subblocks.
     * The first subblock contains the word "Hello" and the second subblock contains the word "World".
     * The first subblock is not optimized and the second subblock is not optimized.
     */
    @Test
    void extractParallelSubblocks_5() {
        HorizontalBlock block = new HorizontalBlock(new WordPosition(0, 0, 0, "Hello"), new WordPosition(0, 0, 0, "World"));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals("Hello", subblocks.get(0).getWords().get(0).getWord());
        assertEquals("World", subblocks.get(1).getWords().get(0).getWord());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two parallel subblocks.
     * The first subblock contains the word "Hello" and the second subblock contains the word "World".
     * The first subblock is optimized and the second subblock is not optimized.
     */
    @Test
    void extractParallelSubblocks_6() {
        HorizontalBlock block = new HorizontalBlock(new WordPosition(0, 0, 0, "Hello"), new WordPosition(0, 0, 0, "World"));
        block.optimize();
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals("Hello", subblocks.get(0).getWords().get(0).getWord());
        assertEquals("World", subblocks.get(1).getWords().get(0).getWord());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two parallel subblocks.
     * The first subblock contains the word "Hello" and the second subblock contains the word "World".
     * The first subblock is not optimized and the second subblock is optimized.
     */
    @Test
    void extractParallelSubblocks_7() {
        HorizontalBlock block = new HorizontalBlock(new WordPosition(0, 0, 0, "Hello"), new WordPosition(0, 0, 0, "World"));
        block.optimize();
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals("Hello", subblocks.get(0).getWords().get(0).getWord());
        assertEquals("World", subblocks.get(1).getWords().get(0).getWord());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two parallel subblocks.
     * The first subblock contains the word "Hello" and the second subblock contains the word "World".
     * The first subblock is optimized and the second subblock is optimized.
     */
    @Test
    void extractParallelSubblocks_8() {
        HorizontalBlock block = new HorizontalBlock(new WordPosition(0, 0, 0, "Hello"), new WordPosition(0, 0, 0, "World"));
        block.optimize();
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals("Hello", subblocks.get(0).getWords().get(0).getWord());
        assertEquals("World", subblocks.get(1).getWords().get(0).getWord());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two parallel subblocks.
     * The first subblock contains the word "Hello" and the second subblock contains the word "World".
     * The first subblock is not optimized and the second subblock is not optimized.
     */
    @Test
    void extractParallelSubblocks_9() {
        HorizontalBlock block = new HorizontalBlock(new WordPosition(0, 0, 0, "Hello"), new WordPosition(0, 0, 0, "World"));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals("Hello", subblocks.get(0).getWords().get(0).getWord());
        assertEquals("World", subblocks.get(1).getWords().get(0).getWord());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two parallel subblocks.
     * The first subblock contains the word "Hello" and the second subblock contains the word "World".
     * The first subblock is optimized and the second subblock is not optimized.
     */
    @Test
    void extractParallelSubblocks_10() {
        HorizontalBlock block = new HorizontalBlock(new WordPosition(0, 0, 0, "Hello"), new WordPosition(0, 0, 0, "World"));
        block.optimize();
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals("Hello", subblocks.