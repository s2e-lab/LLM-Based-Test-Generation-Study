// HWordPositionTest.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HWordPosition}.
* It contains ten unit test cases for the {@link HWordPosition#textAt(CharTable)} method.
*/
class HWordPositionTest {

    /**
     * Tests the textAt method for a trivial word position.
     */
    @Test
    void testTextAtTrivial() {
        CharTable ct = new CharTable(10, 10);
        HWordPosition wp = new HWordPosition(new CharPosition(0, 0), new CharPosition(0, 0));
        assertEquals("", wp.textAt(ct));
    }

    /**
     * Tests the textAt method for a word position
     * which begins at the first character of the specified block.
     */
    @Test
    void testTextAtStartOfBlock() {
        CharTable ct = new CharTable(10, 10);
        ct.setCharAt(0, 0, 'a');
        ct.setCharAt(1, 0, 'b');
        ct.setCharAt(2, 0, 'c');
        ct.setCharAt(3, 0, 'd');
        ct.setCharAt(4, 0, 'e');
        ct.setCharAt(5, 0, 'f');
        ct.setCharAt(6, 0, 'g');
        ct.setCharAt(7, 0, 'h');
        ct.setCharAt(8, 0, 'i');
        ct.setCharAt(9, 0, 'j');
        HWordPosition wp = new HWordPosition(new Block(ct, 0, 0));
        assertEquals("abcdefghij", wp.textAt(ct));
    }

    /**
     * Tests the textAt method for a word position
     * which ends at the last character of the specified block.
     */
    @Test
    void testTextAtEndOfBlock() {
        CharTable ct = new CharTable(10, 10);
        ct.setCharAt(0, 0, 'a');
        ct.setCharAt(1, 0, 'b');
        ct.setCharAt(2, 0, 'c');
        ct.setCharAt(3, 0, 'd');
        ct.setCharAt(4, 0, 'e');
        ct.setCharAt(5, 0, 'f');
        ct.setCharAt(6, 0, 'g');
        ct.setCharAt(7, 0, 'h');
        ct.setCharAt(8, 0, 'i');
        ct.setCharAt(9, 0, 'j');
        HWordPosition wp = new HWordPosition(new Block(ct, 0, 0));
        assertEquals("abcdefghij", wp.textAt(ct));
    }

    /**
     * Tests the textAt method for a word position
     * which begins and ends at the first character of the specified block.
     */
    @Test
    void testTextAtStartAndEndOfBlock() {
        CharTable ct = new CharTable(10, 10);
        ct.setCharAt(0, 0, 'a');
        ct.setCharAt(1, 0, 'b');
        ct.setCharAt(2, 0, 'c');
        ct.setCharAt(3, 0, 'd');
        ct.setCharAt(4, 0, 'e');
        ct.setCharAt(5, 0, 'f');
        ct.setCharAt(6, 0, 'g');
        ct.setCharAt(7, 0, 'h');
        ct.setCharAt(8, 0, 'i');
        ct.setCharAt(9, 0, 'j');
        HWordPosition wp = new HWordPosition(new Block(ct, 0, 0));
        assertEquals("abcdefghij", wp.textAt(ct));
    }

    /**
     * Tests the textAt method for a word position
     * which begins and ends at the last character of the specified block.
     */
    @Test
    void testTextAtStartAndEndOfBlock2() {
        CharTable ct = new CharTable(10, 10);
        ct.setCharAt(0, 0, 'a');
        ct.setCharAt(1, 0, 'b');
        ct.setCharAt(2, 0, 'c');
        ct.setCharAt(3, 0, 'd');
        ct.setCharAt(4, 0, 'e');
        ct.setCharAt(5, 0, 'f');
        ct.setCharAt(6, 0, 'g');
        ct.setCharAt(7, 0, 'h');
        ct.setCharAt(8, 0, 'i');
        ct.setCharAt(9, 0, 'j');
        HWordPosition wp = new HWordPosition(new Block(ct, 0, 0));
        assertEquals("abcdefghij", wp.textAt(ct));
    }

    /**
     * Tests the textAt method for a word position
     * which begins and ends at the first character of the specified block.
     */
    @Test
    void testTextAtStartAndEndOfBlock3() {
        CharTable ct = new CharTable(10, 10);
        ct.setCharAt(0, 0, 'a');
        ct.setCharAt(1, 0, 'b');
        ct.setCharAt(2, 0, 'c');
        ct.setCharAt(3, 0, 'd');
        ct.setCharAt(4, 0, 'e');
        ct.setCharAt(5, 0, 'f');
        ct.setCharAt(6, 0, 'g');
        ct.setCharAt(7, 0, 'h');
        ct.setCharAt(8, 0, 'i');
        ct.setCharAt(9, 0, 'j');
        HWordPosition wp = new HWordPosition(new Block(ct, 0, 0));
        assertEquals("abcdefghij", wp.textAt(ct));
    }

    /**
     * Tests the textAt method for a word position
     * which begins and ends at the first character of the specified block.
     */
    @Test
    void testTextAtStartAndEndOfBlock4() {
        CharTable ct = new CharTable(10, 10);
        ct.setCharAt(0, 0, 'a');
        ct.setCharAt(1, 0, 'b');
        ct.setCharAt(2, 0, 'c');
        ct.setCharAt(3, 0, 'd');
        ct.setCharAt(4, 0, 'e');
        ct.setCharAt(5, 0, 'f');
        ct.setCharAt(6, 0, 'g');
        ct.setCharAt(7, 0, 'h');
        ct.setCharAt(8, 0, 'i');
        ct.setCharAt(9, 0, 'j');
        HWordPosition wp = new HWordPosition(new Block(ct, 0, 0));
        assertEquals("abcdefghij", wp.textAt(ct));
    }

    /**
     * Tests the textAt method for a word position
     * which begins and ends at the first character of the specified block.
     */
    @Test
    void testTextAtStartAndEndOfBlock5() {
        CharTable ct = new CharTable(10, 10);
        ct.setCharAt(0, 0, 'a');
        ct.setCharAt(1, 0, 'b');
        ct.setCharAt(2, 0, 'c');
        ct.setCharAt(3, 0, 'd');
        ct.setCharAt(4, 0, 'e');
        ct.setCharAt(5, 0, 'f');
        ct.setCharAt(6, 0, 'g');
        ct.setCharAt(7, 0, 'h');
        ct.setCharAt(8, 0, 'i');
        ct.setCharAt(9, 0, 'j');
        HWordPosition wp = new HWordPosition(new Block(ct, 0, 0));
        assertEquals("abcdefghij", wp.textAt(ct));
    }

    /**
     * Tests the textAt method for a word position
     * which begins and ends at the first character of the specified block.
     */
    @Test
    void testTextAtStartAndEndOfBlock6() {
        CharTable ct = new CharTable(10, 10);
        ct.setCharAt(0, 0, 'a');
        ct.setCharAt(1, 0, 'b');
        ct.setCharAt(2, 0, 'c');
        ct.setCharAt(3, 0, 'd');
        ct.setCharAt(4, 0, 'e');
        ct.setCharAt(5, 0, 'f');
        ct.setCharAt(6, 0, 'g');
        ct.setCharAt(7, 0, 'h');
        ct.setCharAt(