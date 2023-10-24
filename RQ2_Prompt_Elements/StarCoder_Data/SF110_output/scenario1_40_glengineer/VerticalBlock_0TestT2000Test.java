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

    @Test
    void extractSequentialSubblocks_0() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(0, result.size());
    }

    @Test
    void extractSequentialSubblocks_1() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(1, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)), result.get(0));
    }

    @Test
    void extractSequentialSubblocks_2() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)));
        block.add(new HorizontalBlock(new CharPosition1(0, 1), new CharPosition1(10, 2)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(2, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 1), new CharPosition1(10, 2)), result.get(1));
    }

    @Test
    void extractSequentialSubblocks_3() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)));
        block.add(new HorizontalBlock(new CharPosition1(0, 1), new CharPosition1(10, 2)));
        block.add(new HorizontalBlock(new CharPosition1(0, 2), new CharPosition1(10, 3)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(3, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 1), new CharPosition1(10, 2)), result.get(1));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 2), new CharPosition1(10, 3)), result.get(2));
    }

    @Test
    void extractSequentialSubblocks_4() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)));
        block.add(new HorizontalBlock(new CharPosition1(0, 1), new CharPosition1(10, 2)));
        block.add(new HorizontalBlock(new CharPosition1(0, 2), new CharPosition1(10, 3)));
        block.add(new HorizontalBlock(new CharPosition1(0, 3), new CharPosition1(10, 4)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(4, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 1), new CharPosition1(10, 2)), result.get(1));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 2), new CharPosition1(10, 3)), result.get(2));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 3), new CharPosition1(10, 4)), result.get(3));
    }

    @Test
    void extractSequentialSubblocks_5() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)));
        block.add(new HorizontalBlock(new CharPosition1(0, 1), new CharPosition1(10, 2)));
        block.add(new HorizontalBlock(new CharPosition1(0, 2), new CharPosition1(10, 3)));
        block.add(new HorizontalBlock(new CharPosition1(0, 3), new CharPosition1(10, 4)));
        block.add(new HorizontalBlock(new CharPosition1(0, 4), new CharPosition1(10, 5)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(5, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 1), new CharPosition1(10, 2)), result.get(1));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 2), new CharPosition1(10, 3)), result.get(2));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 3), new CharPosition1(10, 4)), result.get(3));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 4), new CharPosition1(10, 5)), result.get(4));
    }

    @Test
    void extractSequentialSubblocks_6() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)));
        block.add(new HorizontalBlock(new CharPosition1(0, 1), new CharPosition1(10, 2)));
        block.add(new HorizontalBlock(new CharPosition1(0, 2), new CharPosition1(10, 3)));
        block.add(new HorizontalBlock(new CharPosition1(0, 3), new CharPosition1(10, 4)));
        block.add(new HorizontalBlock(new CharPosition1(0, 4), new CharPosition1(10, 5)));
        block.add(new HorizontalBlock(new CharPosition1(0, 5), new CharPosition1(10, 6)));
        List<Block> result = block.extractSequentialSubblocks();
        assertEquals(6, result.size());
        assertEquals(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)), result.get(0));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 1), new CharPosition1(10, 2)), result.get(1));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 2), new CharPosition1(10, 3)), result.get(2));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 3), new CharPosition1(10, 4)), result.get(3));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 4), new CharPosition1(10, 5)), result.get(4));
        assertEquals(new HorizontalBlock(new CharPosition1(0, 5), new CharPosition1(10, 6)), result.get(5));
    }

    @Test
    void extractSequentialSubblocks_7() {
        VerticalBlock block = new VerticalBlock(new CharPosition1(0, 0), new CharPosition1(10, 10));
        block.add(new HorizontalBlock(new CharPosition1(0, 0), new CharPosition1(10, 1)));
        block.add(new HorizontalBlock(new CharPosition1(0, 1), new CharPosition1(10, 2)));
        block.add(new HorizontalBlock(new CharPosition1(0, 2), new CharPosition1(10, 3)));
        block.add(new HorizontalBlock(new CharPosition1(0, 3), new CharPosition1(10, 4)));
        block.add(new HorizontalBlock(