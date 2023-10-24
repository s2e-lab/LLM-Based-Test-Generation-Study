// VerticalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains ten unit test cases for the {@link VerticalBlock#extractSequentialSubblocks()} method.
*/
class VerticalBlock_0Test {

    /**
     * Test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of a single subblock.
     */
    @Test
    void extractSequentialSubblocks_0() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(1, result.size());
        assertEquals(block, result.get(0));
    }

    /**
     * Test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of two subblocks.
     */
    @Test
    void extractSequentialSubblocks_1() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 20));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(2, result.size());
        assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10)), result.get(0));
        assertEquals(new VerticalBlock(new CharPosition1(0, 10), new CharPosition1(10, 20)), result.get(1));
    }

    /**
     * Test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of three subblocks.
     */
    @Test
    void extractSequentialSubblocks_2() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 30));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(3, result.size());
        assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10)), result.get(0));
        assertEquals(new VerticalBlock(new CharPosition1(0, 10), new CharPosition1(10, 20)), result.get(1));
        assertEquals(new VerticalBlock(new CharPosition1(0, 20), new CharPosition1(10, 30)), result.get(2));
    }

    /**
     * Test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of four subblocks.
     */
    @Test
    void extractSequentialSubblocks_3() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 40));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(4, result.size());
        assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10)), result.get(0));
        assertEquals(new VerticalBlock(new CharPosition1(0, 10), new CharPosition1(10, 20)), result.get(1));
        assertEquals(new VerticalBlock(new CharPosition1(0, 20), new CharPosition1(10, 30)), result.get(2));
        assertEquals(new VerticalBlock(new CharPosition1(0, 30), new CharPosition1(10, 40)), result.get(3));
    }

    /**
     * Test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of five subblocks.
     */
    @Test
    void extractSequentialSubblocks_4() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 50));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(5, result.size());
        assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10)), result.get(0));
        assertEquals(new VerticalBlock(new CharPosition1(0, 10), new CharPosition1(10, 20)), result.get(1));
        assertEquals(new VerticalBlock(new CharPosition1(0, 20), new CharPosition1(10, 30)), result.get(2));
        assertEquals(new VerticalBlock(new CharPosition1(0, 30), new CharPosition1(10, 40)), result.get(3));
        assertEquals(new VerticalBlock(new CharPosition1(0, 40), new CharPosition1(10, 50)), result.get(4));
    }

    /**
     * Test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of six subblocks.
     */
    @Test
    void extractSequentialSubblocks_5() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 60));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(6, result.size());
        assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10)), result.get(0));
        assertEquals(new VerticalBlock(new CharPosition1(0, 10), new CharPosition1(10, 20)), result.get(1));
        assertEquals(new VerticalBlock(new CharPosition1(0, 20), new CharPosition1(10, 30)), result.get(2));
        assertEquals(new VerticalBlock(new CharPosition1(0, 30), new CharPosition1(10, 40)), result.get(3));
        assertEquals(new VerticalBlock(new CharPosition1(0, 40), new CharPosition1(10, 50)), result.get(4));
        assertEquals(new VerticalBlock(new CharPosition1(0, 50), new CharPosition1(10, 60)), result.get(5));
    }

    /**
     * Test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of seven subblocks.
     */
    @Test
    void extractSequentialSubblocks_6() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 70));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(7, result.size());
        assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10)), result.get(0));
        assertEquals(new VerticalBlock(new CharPosition1(0, 10), new CharPosition1(10, 20)), result.get(1));
        assertEquals(new VerticalBlock(new CharPosition1(0, 20), new CharPosition1(10, 30)), result.get(2));
        assertEquals(new VerticalBlock(new CharPosition1(0, 30), new CharPosition1(10, 40)), result.get(3));
        assertEquals(new VerticalBlock(new CharPosition1(0, 40), new CharPosition1(10, 50)), result.get(4));
        assertEquals(new VerticalBlock(new CharPosition1(0, 50), new CharPosition1(10, 60)), result.get(5));
        assertEquals(new VerticalBlock(new CharPosition1(0, 60), new CharPosition1(10, 70)), result.get(6));
    }

    /**
     * Test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
     * It tests the extraction of eight subblocks.
     */
    @Test
    void extractSequentialSubblocks_7() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 80));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(8, result.size());
        assertEquals(new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10)), result.get(0));
        assertEquals(new VerticalBlock(new CharPosition1(0, 10), new CharPosition1(10, 20)), result.get(1));
        assertEquals(new VerticalBlock(new CharPosition1(0, 20), new CharPosition1(10, 30)), result.get(2));
        assertEquals(new VerticalBlock(new CharPosition1(0, 30), new CharPosition1(10, 40)), result.get(3));
        assertEquals(new VerticalBlock(new CharPosition1(0, 40), new CharPosition1(10, 50)), result.get(4));
        assertEquals(new VerticalBlock(new CharPosition1(0, 50), new CharPosition1(10, 60