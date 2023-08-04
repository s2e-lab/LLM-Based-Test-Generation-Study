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

    @Test
    void test_1() {
        HorizontalBlock block = new HorizontalBlock(new Block(new HWordPosition(0, 0), new HWordPosition(1, 0)));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(new Block(new HWordPosition(0, 0), new HWordPosition(1, 0)), subblocks.get(0));
    }

    @Test
    void test_2() {
        HorizontalBlock block = new HorizontalBlock(new Block(new HWordPosition(0, 0), new HWordPosition(1, 0)), new Block(new HWordPosition(1, 0), new HWordPosition(2, 0)));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(new Block(new HWordPosition(0, 0), new HWordPosition(2, 0)), subblocks.get(0));
    }

    @Test
    void test_3() {
        HorizontalBlock block = new HorizontalBlock(new Block(new HWordPosition(0, 0), new HWordPosition(1, 0)), new Block(new HWordPosition(1, 0), new HWordPosition(2, 0)), new Block(new HWordPosition(2, 0), new HWordPosition(3, 0)));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(new Block(new HWordPosition(0, 0), new HWordPosition(3, 0)), subblocks.get(0));
    }

    @Test
    void test_4() {
        HorizontalBlock block = new HorizontalBlock(new Block(new HWordPosition(0, 0), new HWordPosition(1, 0)), new Block(new HWordPosition(1, 0), new HWordPosition(2, 0)), new Block(new HWordPosition(2, 0), new HWordPosition(3, 0)), new Block(new HWordPosition(3, 0), new HWordPosition(4, 0)));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(new Block(new HWordPosition(0, 0), new HWordPosition(4, 0)), subblocks.get(0));
    }

    @Test
    void test_5() {
        HorizontalBlock block = new HorizontalBlock(new Block(new HWordPosition(0, 0), new HWordPosition(1, 0)), new Block(new HWordPosition(1, 0), new HWordPosition(2, 0)), new Block(new HWordPosition(2, 0), new HWordPosition(3, 0)), new Block(new HWordPosition(3, 0), new HWordPosition(4, 0)), new Block(new HWordPosition(4, 0), new HWordPosition(5, 0)));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(new Block(new HWordPosition(0, 0), new HWordPosition(5, 0)), subblocks.get(0));
    }

    @Test
    void test_6() {
        HorizontalBlock block = new HorizontalBlock(new Block(new HWordPosition(0, 0), new HWordPosition(1, 0)), new Block(new HWordPosition(1, 0), new HWordPosition(2, 0)), new Block(new HWordPosition(2, 0), new HWordPosition(3, 0)), new Block(new HWordPosition(3, 0), new HWordPosition(4, 0)), new Block(new HWordPosition(4, 0), new HWordPosition(5, 0)), new Block(new HWordPosition(5, 0), new HWordPosition(6, 0)));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(new Block(new HWordPosition(0, 0), new HWordPosition(6, 0)), subblocks.get(0));
    }

    @Test
    void test_7() {
        HorizontalBlock block = new HorizontalBlock(new Block(new HWordPosition(0, 0), new HWordPosition(1, 0)), new Block(new HWordPosition(1, 0), new HWordPosition(2, 0)), new Block(new HWordPosition(2, 0), new HWordPosition(3, 0)), new Block(new HWordPosition(3, 0), new HWordPosition(4, 0)), new Block(new HWordPosition(4, 0), new HWordPosition(5, 0)), new Block(new HWordPosition(5, 0), new HWordPosition(6, 0)), new Block(new HWordPosition(6, 0), new HWordPosition(7, 0)));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(new Block(new HWordPosition(0, 0), new HWordPosition(7, 0)), subblocks.get(0));
    }

    @Test
    void test_8() {
        HorizontalBlock block = new HorizontalBlock(new Block(new HWordPosition(0, 0), new HWordPosition(1, 0)), new Block(new HWordPosition(1, 0), new HWordPosition(2, 0)), new Block(new HWordPosition(2, 0), new HWordPosition(3, 0)), new Block(new HWordPosition(3, 0), new HWordPosition(4, 0)), new Block(new HWordPosition(4, 0), new HWordPosition(5, 0)), new Block(new HWordPosition(5, 0), new HWordPosition(6, 0)), new Block(new HWordPosition(6, 0), new HWordPosition(7, 0)), new Block(new HWordPosition(7, 0), new HWordPosition(8, 0)));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(new Block(new HWordPosition(0, 0), new HWordPosition(8, 0)), subblocks.get(0));
    }

    @Test
    void test_9() {
        HorizontalBlock block = new HorizontalBlock(new Block(new HWordPosition(0, 0), new HWordPosition(1, 0)), new Block(new HWordPosition(1, 0), new HWordPosition(2, 0)), new Block(new HWordPosition(2, 0), new HWordPosition(3, 0)), new Block(new HWordPosition(3, 0), new HWordPosition(4, 0)), new Block(new HWordPosition(4, 0), new HWordPosition(5, 0)), new Block(new HWordPosition(5, 0), new HWordPosition(6, 0)), new Block(new HWordPosition(6, 0), new HWordPosition(7, 0)), new Block(new HWordPosition(7, 0), new HWordPosition(8, 0)), new Block(new HWordPosition(8, 0), new HWordPosition(9, 0)));
        List<Block> subblocks = block.extractParallelSubblocks();
        assertEquals(1, subblocks.size());
        assertEquals(new Block(new HWordPosition(0, 0), new HWordPosition(9, 0)), subblocks.get(0));
    }

    @Test
    void test_10() {
        HorizontalBlock block = new HorizontalBlock(new Block(new HWordPosition(0, 0), new HWordPosition(1, 0)), new Block(new HWordPosition(1, 0), new HWordPosition(2, 0)), new Block(new HWordPosition(2, 0), new HWordPosition(3, 0)), new Block(new HWordPosition(3, 0), new HWordPosition(4, 0)), new Block(new HWordPosition(4, 0), new HWordPosition(5, 0)), new Block(new HWordPosition(5, 0), new HWordPosition(6, 0)), new Block(new HWordPosition(6, 0), new HWordPosition(7, 0)), new Block(new HWordPosition(7, 0), new HWordPosition(8, 0)), new Block(new HWordPosition(8, 0), new HWordPosition(9, 0)), new Block(new HWordPosition(9, 0), new HWordPosition(10, 0)));
        List<