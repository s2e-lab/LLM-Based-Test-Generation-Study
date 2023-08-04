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

    @Test
    void testExtractParallelSubblocks_1() {
        Block b = new Block(new VWordPosition(0, 0), new VWordPosition(0, 1));
        List<Block> blocks = b.extractParallelSubblocks();
        assertEquals(1, blocks.size());
        assertEquals(b, blocks.get(0));
    }

    @Test
    void testExtractParallelSubblocks_2() {
        Block b = new Block(new VWordPosition(0, 0), new VWordPosition(0, 1));
        Block b2 = new Block(new VWordPosition(0, 1), new VWordPosition(0, 2));
        b.add(b2);
        List<Block> blocks = b.extractParallelSubblocks();
        assertEquals(2, blocks.size());
        assertEquals(b, blocks.get(0));
        assertEquals(b2, blocks.get(1));
    }

    @Test
    void testExtractParallelSubblocks_3() {
        Block b = new Block(new VWordPosition(0, 0), new VWordPosition(0, 1));
        Block b2 = new Block(new VWordPosition(0, 1), new VWordPosition(0, 2));
        Block b3 = new Block(new VWordPosition(0, 2), new VWordPosition(0, 3));
        b.add(b2);
        b.add(b3);
        List<Block> blocks = b.extractParallelSubblocks();
        assertEquals(3, blocks.size());
        assertEquals(b, blocks.get(0));
        assertEquals(b2, blocks.get(1));
        assertEquals(b3, blocks.get(2));
    }

    @Test
    void testExtractParallelSubblocks_4() {
        Block b = new Block(new VWordPosition(0, 0), new VWordPosition(0, 1));
        Block b2 = new Block(new VWordPosition(0, 1), new VWordPosition(0, 2));
        Block b3 = new Block(new VWordPosition(0, 2), new VWordPosition(0, 3));
        Block b4 = new Block(new VWordPosition(0, 3), new VWordPosition(0, 4));
        b.add(b2);
        b.add(b3);
        b.add(b4);
        List<Block> blocks = b.extractParallelSubblocks();
        assertEquals(4, blocks.size());
        assertEquals(b, blocks.get(0));
        assertEquals(b2, blocks.get(1));
        assertEquals(b3, blocks.get(2));
        assertEquals(b4, blocks.get(3));
    }

    @Test
    void testExtractParallelSubblocks_5() {
        Block b = new Block(new VWordPosition(0, 0), new VWordPosition(0, 1));
        Block b2 = new Block(new VWordPosition(0, 1), new VWordPosition(0, 2));
        Block b3 = new Block(new VWordPosition(0, 2), new VWordPosition(0, 3));
        Block b4 = new Block(new VWordPosition(0, 3), new VWordPosition(0, 4));
        Block b5 = new Block(new VWordPosition(0, 4), new VWordPosition(0, 5));
        b.add(b2);
        b.add(b3);
        b.add(b4);
        b.add(b5);
        List<Block> blocks = b.extractParallelSubblocks();
        assertEquals(5, blocks.size());
        assertEquals(b, blocks.get(0));
        assertEquals(b2, blocks.get(1));
        assertEquals(b3, blocks.get(2));
        assertEquals(b4, blocks.get(3));
        assertEquals(b5, blocks.get(4));
    }

    @Test
    void testExtractParallelSubblocks_6() {
        Block b = new Block(new VWordPosition(0, 0), new VWordPosition(0, 1));
        Block b2 = new Block(new VWordPosition(0, 1), new VWordPosition(0, 2));
        Block b3 = new Block(new VWordPosition(0, 2), new VWordPosition(0, 3));
        Block b4 = new Block(new VWordPosition(0, 3), new VWordPosition(0, 4));
        Block b5 = new Block(new VWordPosition(0, 4), new VWordPosition(0, 5));
        Block b6 = new Block(new VWordPosition(0, 5), new VWordPosition(0, 6));
        b.add(b2);
        b.add(b3);
        b.add(b4);
        b.add(b5);
        b.add(b6);
        List<Block> blocks = b.extractParallelSubblocks();
        assertEquals(6, blocks.size());
        assertEquals(b, blocks.get(0));
        assertEquals(b2, blocks.get(1));
        assertEquals(b3, blocks.get(2));
        assertEquals(b4, blocks.get(3));
        assertEquals(b5, blocks.get(4));
        assertEquals(b6, blocks.get(5));
    }

    @Test
    void testExtractParallelSubblocks_7() {
        Block b = new Block(new VWordPosition(0, 0), new VWordPosition(0, 1));
        Block b2 = new Block(new VWordPosition(0, 1), new VWordPosition(0, 2));
        Block b3 = new Block(new VWordPosition(0, 2), new VWordPosition(0, 3));
        Block b4 = new Block(new VWordPosition(0, 3), new VWordPosition(0, 4));
        Block b5 = new Block(new VWordPosition(0, 4), new VWordPosition(0, 5));
        Block b6 = new Block(new VWordPosition(0, 5), new VWordPosition(0, 6));
        Block b7 = new Block(new VWordPosition(0, 6), new VWordPosition(0, 7));
        b.add(b2);
        b.add(b3);
        b.add(b4);
        b.add(b5);
        b.add(b6);
        b.add(b7);
        List<Block> blocks = b.extractParallelSubblocks();
        assertEquals(7, blocks.size());
        assertEquals(b, blocks.get(0));
        assertEquals(b2, blocks.get(1));
        assertEquals(b3, blocks.get(2));
        assertEquals(b4, blocks.get(3));
        assertEquals(b5, blocks.get(4));
        assertEquals(b6, blocks.get(5));
        assertEquals(b7, blocks.get(6));
    }

    @Test
    void testExtractParallelSubblocks_8() {
        Block b = new Block(new VWordPosition(0, 0), new VWordPosition(0, 1));
        Block b2 = new Block(new VWordPosition(0, 1), new VWordPosition(0, 2));
        Block b3 = new Block(new VWordPosition(0, 2), new VWordPosition(0, 3));
        Block b4 = new Block(new VWordPosition(0, 3), new VWordPosition(0, 4));
        Block b5 = new Block(new VWordPosition(0, 4), new VWordPosition(0, 5));
        Block b6 = new Block(new VWordPosition(0, 5), new VWordPosition(0, 6));
        Block b7 = new Block(new VWordPosition(0, 6), new VWordPosition(0, 7));
        Block b8 = new Block(new VWordPosition(0, 7), new VWordPosition(0, 8));
        b.add(b2);
        b.add(b3);
        b.add(b4);
        b.add(b5);
        b.add(b6);
        b.add(b7);
        b.add(b8);
        List<Block> blocks = b.extractParallelSubblocks();
        assertEquals(8, blocks.size());
        assertEquals(b, blocks.get(0));
        assertEquals(b2, blocks.get(1));
        assertEquals(b3, blocks.get(2));
        assertEquals(b4, blocks.get(3));
        assertEquals(b5, blocks.get(4));
        assertEquals(b6, blocks.get(5));
        assertEquals(b7, blocks.get(6));
        assertEquals(b8, blocks.get(7));
    }

    @Test
    void testExtractParallelSubblocks_9() {
        Block b = new Block(new VWordPosition(0, 0), new VWordPosition(0, 1