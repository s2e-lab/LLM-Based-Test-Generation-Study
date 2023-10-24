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

    @Test
    void extractSequentialSubblocks_0() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(1, result.size());
        assertEquals(block, result.get(0));
    }

    @Test
    void extractSequentialSubblocks_1() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(1, result.size());
        assertEquals(block, result.get(0));
    }

    @Test
    void extractSequentialSubblocks_2() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(1, result.size());
        assertEquals(block, result.get(0));
    }

    @Test
    void extractSequentialSubblocks_3() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(2, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(1));
    }

    @Test
    void extractSequentialSubblocks_4() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(2, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(1));
    }

    @Test
    void extractSequentialSubblocks_5() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(3, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(1));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(2));
    }

    @Test
    void extractSequentialSubblocks_6() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(3, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)), result.get(1));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(2));
    }

    @Test
    void extractSequentialSubblocks_7() {
        HorizontalBlock block = new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 0));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)));
        block.add(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(4, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(5, 0)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(5, 0), new CharPosition1(10, 0