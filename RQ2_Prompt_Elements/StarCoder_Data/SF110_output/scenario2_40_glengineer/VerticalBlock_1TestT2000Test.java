// VerticalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains ten unit test cases for the {@link VerticalBlock#extractParallelSubblocks()} method.
*/
class VerticalBlock_1Test {

    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two subblocks,
     * each of which contains a single line.
     */
    @Test
    void testExtractParallelSubblocks_1() {
        Block block = new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(1, 2));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(1, 1)), subblocks.get(0));
        assertEquals(new VerticalBlock(new VWordPosition(1, 2), new VWordPosition(1, 2)), subblocks.get(1));
    }

    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two subblocks,
     * each of which contains two lines.
     */
    @Test
    void testExtractParallelSubblocks_2() {
        Block block = new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(2, 2));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(1, 1)), subblocks.get(0));
        assertEquals(new VerticalBlock(new VWordPosition(2, 2), new VWordPosition(2, 2)), subblocks.get(1));
    }

    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two subblocks,
     * each of which contains three lines.
     */
    @Test
    void testExtractParallelSubblocks_3() {
        Block block = new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(3, 3));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(1, 1)), subblocks.get(0));
        assertEquals(new VerticalBlock(new VWordPosition(3, 3), new VWordPosition(3, 3)), subblocks.get(1));
    }

    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two subblocks,
     * each of which contains four lines.
     */
    @Test
    void testExtractParallelSubblocks_4() {
        Block block = new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(4, 4));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(1, 1)), subblocks.get(0));
        assertEquals(new VerticalBlock(new VWordPosition(4, 4), new VWordPosition(4, 4)), subblocks.get(1));
    }

    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two subblocks,
     * each of which contains five lines.
     */
    @Test
    void testExtractParallelSubblocks_5() {
        Block block = new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(5, 5));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(1, 1)), subblocks.get(0));
        assertEquals(new VerticalBlock(new VWordPosition(5, 5), new VWordPosition(5, 5)), subblocks.get(1));
    }

    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two subblocks,
     * each of which contains six lines.
     */
    @Test
    void testExtractParallelSubblocks_6() {
        Block block = new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(6, 6));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(1, 1)), subblocks.get(0));
        assertEquals(new VerticalBlock(new VWordPosition(6, 6), new VWordPosition(6, 6)), subblocks.get(1));
    }

    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two subblocks,
     * each of which contains seven lines.
     */
    @Test
    void testExtractParallelSubblocks_7() {
        Block block = new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(7, 7));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(1, 1)), subblocks.get(0));
        assertEquals(new VerticalBlock(new VWordPosition(7, 7), new VWordPosition(7, 7)), subblocks.get(1));
    }

    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two subblocks,
     * each of which contains eight lines.
     */
    @Test
    void testExtractParallelSubblocks_8() {
        Block block = new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(8, 8));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(1, 1)), subblocks.get(0));
        assertEquals(new VerticalBlock(new VWordPosition(8, 8), new VWordPosition(8, 8)), subblocks.get(1));
    }

    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two subblocks,
     * each of which contains nine lines.
     */
    @Test
    void testExtractParallelSubblocks_9() {
        Block block = new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(9, 9));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(1, 1)), subblocks.get(0));
        assertEquals(new VerticalBlock(new VWordPosition(9, 9), new VWordPosition(9, 9)), subblocks.get(1));
    }

    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two subblocks,
     * each of which contains ten lines.
     */
    @Test
    void testExtractParallelSubblocks_10() {
        Block block = new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(10, 10));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(new VWordPosition(1, 1), new VWordPosition(1, 1)), subblocks.get(0));
        assertEquals(new VerticalBlock(new VWordPosition(10, 10), new VWordPosition(10, 10)), subblocks.get(1));
    }
}

// VerticalBlock_2Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains ten unit test cases for the {@link VerticalBlock#extractParallelSubblocks()} method.
*/
class VerticalBlock_2Test {
		
    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The block is divided into two subblocks,
     * each of which contains a single line