// HorizontalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_0Test {

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of a single subblock.
     */
    @Test
    void extractSequentialSubblocks_0() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(1, result.size());
        assertEquals(block, result.get(0));
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of two subblocks.
     */
    @Test
    void extractSequentialSubblocks_1() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(2, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(1));
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of three subblocks.
     */
    @Test
    void extractSequentialSubblocks_2() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(3, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(1));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0)), result.get(2));
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of four subblocks.
     */
    @Test
    void extractSequentialSubblocks_3() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(4, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(1));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(2));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(3));
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of five subblocks.
     */
    @Test
    void extractSequentialSubblocks_4() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(5, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(1));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(2));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(3));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0)), result.get(4));
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of six subblocks.
     */
    @Test
    void extractSequentialSubblocks_5() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(6, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(1));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(2));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(3));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(4));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(5));
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of seven subblocks.
     */
    @Test
    void extractSequentialSubblocks_6() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        List<Block> result = block.extractSequentialSubblocks();
       