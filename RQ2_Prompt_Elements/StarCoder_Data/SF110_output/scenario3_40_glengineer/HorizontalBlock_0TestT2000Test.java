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
     * It tests the case where the current block is empty.
     */
    @Test
    void testExtractSequentialSubblocks_0() {
        HorizontalBlock block = new HorizontalBlock();
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(0, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains only one subblock.
     */
    @Test
    void testExtractSequentialSubblocks_1() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(1, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains two subblocks.
     */
    @Test
    void testExtractSequentialSubblocks_2() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(2, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains three subblocks.
     */
    @Test
    void testExtractSequentialSubblocks_3() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(3, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains four subblocks.
     */
    @Test
    void testExtractSequentialSubblocks_4() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(4, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains five subblocks.
     */
    @Test
    void testExtractSequentialSubblocks_5() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(5, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains six subblocks.
     */
    @Test
    void testExtractSequentialSubblocks_6() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(6, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains seven subblocks.
     */
    @Test
    void testExtractSequentialSubblocks_7() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(7, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains eight subblocks.
     */
    @Test
    void testExtractSequentialSubblocks_8() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(8, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains nine subblocks.
     */
    @Test
    void testExtractSequentialSubblocks_9() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(9, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains ten subblocks.
     */
    @Test
    void testExtractSequentialSubblocks_10() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(10, subblocks.size());
    }
}

// HorizontalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
*/
class HorizontalBlock_1Test {
		
    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains two subblocks,
     * where the first subblock is empty.
     */
    @Test
    void testExtractSequentialSubblocks_0() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(2, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains two subblocks,
     * where the second subblock is empty.
     */
    @Test
    void testExtractSequentialSubblocks_1() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(2, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains three subblocks,
     * where the first subblock is empty.
     */
    @Test
    void testExtractSequentialSubblocks_2() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(3, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where the current block contains three subblocks,
     * where the second subblock is empty.
     */
    @Test
    void testExtractSequentialSubblocks_3() {
        HorizontalBlock block = new HorizontalBlock();
        block.add(new Block());
        block.add(new Block());
        block.add(new Block());
        List<Block> subblocks = block.extractSequentialSubblocks();
        assertEquals(3, subblocks.size());
    }

    /**
     * Test case for the {@link HorizontalBlock#extractSequentialSubblocks()} method.
     * It tests the case where