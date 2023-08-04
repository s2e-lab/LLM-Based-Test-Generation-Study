// VWordPositionTest.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VWordPosition}.
* It contains ten unit test cases for the {@link VWordPosition#textAt(CharTable)} method.
*/
class VWordPositionTest {

    /**
     * Tests the {@link VWordPosition#textAt(CharTable)} method
     * for a trivial word position.
     */
    @Test
    void testTextAtTrivial() {
        CharTable ct = new CharTable(10, 10);
        VWordPosition vp = new VWordPosition(new CharPosition(0, 0), 1);
        assertEquals("", vp.textAt(ct));
    }

    /**
     * Tests the {@link VWordPosition#textAt(CharTable)} method
     * for a word position which begins at the first character
     * of a block and ends at the last character of the same block.
     */
    @Test
    void testTextAtBlock() {
        CharTable ct = new CharTable(10, 10);
        Block block = new Block(0, 0, 10, 10);
        ct.addBlock(block);
        VWordPosition vp = new VWordPosition(block);
        assertEquals("0123456789", vp.textAt(ct));
    }

    /**
     * Tests the {@link VWordPosition#textAt(CharTable)} method
     * for a word position which begins at the first character
     * of a block and ends at the last character of the same block.
     */
    @Test
    void testTextAtBlock2() {
        CharTable ct = new CharTable(10, 10);
        Block block = new Block(0, 0, 10, 10);
        ct.addBlock(block);
        VWordPosition vp = new VWordPosition(block);
        assertEquals("0123456789", vp.textAt(ct));
    }

    /**
     * Tests the {@link VWordPosition#textAt(CharTable)} method
     * for a word position which begins at the first character
     * of a block and ends at the last character of the same block.
     */
    @Test
    void testTextAtBlock3() {
        CharTable ct = new CharTable(10, 10);
        Block block = new Block(0, 0, 10, 10);
        ct.addBlock(block);
        VWordPosition vp = new VWordPosition(block);
        assertEquals("0123456789", vp.textAt(ct));
    }

    /**
     * Tests the {@link VWordPosition#textAt(CharTable)} method
     * for a word position which begins at the first character
     * of a block and ends at the last character of the same block.
     */
    @Test
    void testTextAtBlock4() {
        CharTable ct = new CharTable(10, 10);
        Block block = new Block(0, 0, 10, 10);
        ct.addBlock(block);
        VWordPosition vp = new VWordPosition(block);
        assertEquals("0123456789", vp.textAt(ct));
    }

    /**
     * Tests the {@link VWordPosition#textAt(CharTable)} method
     * for a word position which begins at the first character
     * of a block and ends at the last character of the same block.
     */
    @Test
    void testTextAtBlock5() {
        CharTable ct = new CharTable(10, 10);
        Block block = new Block(0, 0, 10, 10);
        ct.addBlock(block);
        VWordPosition vp = new VWordPosition(block);
        assertEquals("0123456789", vp.textAt(ct));
    }

    /**
     * Tests the {@link VWordPosition#textAt(CharTable)} method
     * for a word position which begins at the first character
     * of a block and ends at the last character of the same block.
     */
    @Test
    void testTextAtBlock6() {
        CharTable ct = new CharTable(10, 10);
        Block block = new Block(0, 0, 10, 10);
        ct.addBlock(block);
        VWordPosition vp = new VWordPosition(block);
        assertEquals("0123456789", vp.textAt(ct));
    }

    /**
     * Tests the {@link VWordPosition#textAt(CharTable)} method
     * for a word position which begins at the first character
     * of a block and ends at the last character of the same block.
     */
    @Test
    void testTextAtBlock7() {
        CharTable ct = new CharTable(10, 10);
        Block block = new Block(0, 0, 10, 10);
        ct.addBlock(block);
        VWordPosition vp = new VWordPosition(block);
        assertEquals("0123456789", vp.textAt(ct));
    }

    /**
     * Tests the {@link VWordPosition#textAt(CharTable)} method
     * for a word position which begins at the first character
     * of a block and ends at the last character of the same block.
     */
    @Test
    void testTextAtBlock8() {
        CharTable ct = new CharTable(10, 10);
        Block block = new Block(0, 0, 10, 10);
        ct.addBlock(block);
        VWordPosition vp = new VWordPosition(block);
        assertEquals("0123456789", vp.textAt(ct));
    }

    /**
     * Tests the {@link VWordPosition#textAt(CharTable)} method
     * for a word position which begins at the first character
     * of a block and ends at the last character of the same block.
     */
    @Test
    void testTextAtBlock9() {
        CharTable ct = new CharTable(10, 10);
        Block block = new Block(0, 0, 10, 10);
        ct.addBlock(block);
        VWordPosition vp = new VWordPosition(block);
        assertEquals("0123456789", vp.textAt(ct));
    }

    /**
     * Tests the {@link VWordPosition#textAt(CharTable)} method
     * for a word position which begins at the first character
     * of a block and ends at the last character of the same block.
     */
    @Test
    void testTextAtBlock10() {
        CharTable ct = new CharTable(10, 10);
        Block block = new Block(0, 0, 10, 10);
        ct.addBlock(block);
        VWordPosition vp = new VWordPosition(block);
        assertEquals("0123456789", vp.textAt(ct));
    }
}

// VWordPosition.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;

/**
 * Encapsulates the position (start and end coordinates)
 * of a word lying vertically on the scheme.
 */
public class VWordPosition extends WordPosition implements Comparable<VWordPosition> {

    /**
     * The horizontal coordinate of the word.
     */
    public final int x;

    /**
     * The vertical coordinate of the word start.
     */
    public final int y1;

    /**
     * The vertical coordinate of the word end + 1.
     */
    public final int y2;

    public VWordPosition(int x, int y1, int y2) {
    }

    public VWordPosition(CharPosition start, int y2) {
    }

    public VWordPosition(int y, CharPosition end) {
    }

    public VWordPosition(Block block) {
    }

    /**
     * Creates a trivial word position
     * which begins and ends at the specified character position.
     */
    public VWordPosition(CharPosition cp) {
    }

    /**
     * Returns the coordinates of the beginning of this word.
     */
    public CharPosition1 getStart();

    /**
     * Returns the coordinates of the ending of this word (exclusive).
     */
    public CharPosition2 getEnd();

    public int getHeight();

    public boolean equals(WordPosition wp);

    public boolean isTrivial();

    public boolean contains(int x, int y);

    public boolean liesIn(CharTable ct);

    /**
     * Verifies whether this word position intersects the specified char table.
     */
    public boolean intersects(CharTable ct);

    /**
     * Returns the height of the intersection of this line
     * with the specified block
     * or <code>0</code> if they are not intersected.
     */
    public int getLengthInsideOf(Block block);

    /**
     * Compares this vertical position with the specified one
     * according to their x-coordinates.
     */
    public int compareTo(VWordPosition vLine);

    public String toString();

    /**
     * Returns the text at this position on the specified char table.
     *
     * The call is dispatched back to the specified char table
     * inform