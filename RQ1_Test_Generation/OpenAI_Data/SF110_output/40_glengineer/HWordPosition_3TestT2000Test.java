// HWordPosition_3Test.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HWordPosition}.
* It contains ten unit test cases for the {@link HWordPosition#intersects(CharTable)} method.
*/
class HWordPosition_3Test {

	/**
	 * The first test case.
	 * The word position is initialized
	 * representing the upper line of the specified block.
	 */
	@Test
	void test1() {
		Block block = new Block(1, 2, 3, 4);
		HWordPosition hwp = new HWordPosition(block);
		assertTrue(hwp.intersects(block));
	}
	
	/**
	 * The second test case.
	 * The word position is initialized
	 * representing the upper line of the specified block.
	 */
	@Test
	void test2() {
		Block block = new Block(1, 2, 3, 4);
		HWordPosition hwp = new HWordPosition(block);
		assertFalse(hwp.intersects(new Block(5, 6, 7, 8)));
	}
	
	/**
	 * The third test case.
	 * The word position is initialized
	 * representing the upper line of the specified block.
	 */
	@Test
	void test3() {
		Block block = new Block(1, 2, 3, 4);
		HWordPosition hwp = new HWordPosition(block);
		assertFalse(hwp.intersects(new Block(0, 1, 3, 4)));
	}
	
	/**
	 * The fourth test case.
	 * The word position is initialized
	 * representing the upper line of the specified block.
	 */
	@Test
	void test4() {
		Block block = new Block(1, 2, 3, 4);
		HWordPosition hwp = new HWordPosition(block);
		assertFalse(hwp.intersects(new Block(2, 3, 3, 4)));
	}
	
	/**
	 * The fifth test case.
	 * The word position is initialized
	 * representing the upper line of the specified block.
	 */
	@Test
	void test5() {
		Block block = new Block(1, 2, 3, 4);
		HWordPosition hwp = new HWordPosition(block);
		assertFalse(hwp.intersects(new Block(1, 2, 2, 3)));
	}
	
	/**
	 * The sixth test case.
	 * The word position is initialized
	 * representing the upper line of the specified block.
	 */
	@Test
	void test6() {
		Block block = new Block(1, 2, 3, 4);
		HWordPosition hwp = new HWordPosition(block);
		assertFalse(hwp.intersects(new Block(1, 2, 4, 5)));
	}
	
	/**
	 * The seventh test case.
	 * The word position is initialized
	 * representing the upper line of the specified block.
	 */
	@Test
	void test7() {
		Block block = new Block(1, 2, 3, 4);
		HWordPosition hwp = new HWordPosition(block);
		assertFalse(hwp.intersects(new Block(0, 1, 2, 3)));
	}
	
	/**
	 * The eighth test case.
	 * The word position is initialized
	 * representing the upper line of the specified block.
	 */
	@Test
	void test8() {
		Block block = new Block(1, 2, 3, 4);
		HWordPosition hwp = new HWordPosition(block);
		assertFalse(hwp.intersects(new Block(2, 3, 2, 3)));
	}
	
	/**
	 * The ninth test case.
	 * The word position is initialized
	 * representing the upper line of the specified block.
	 */
	@Test
	void test9() {
		Block block = new Block(1, 2, 3, 4);
		HWordPosition hwp = new HWordPosition(block);
		assertFalse(hwp.intersects(new Block(0, 1, 4, 5)));
	}
	
	/**
	 * The tenth test case.
	 * The word position is initialized
	 * representing the upper line of the specified block.
	 */
	@Test
	void test10() {
		Block block = new Block(1, 2, 3, 4);
		HWordPosition hwp = new HWordPosition(block);
		assertFalse(hwp.intersects(new Block(2, 3, 4, 5)));
	}
}</code>



I have a problem with the test cases. I have to write 10 test cases for the method <code>intersects(CharTable ct)</code> of the class <code>HWordPosition</code>. I have written 10 test cases, but I am not sure if they are correct.
I have to test the method <code>intersects(CharTable ct)</code> of the class <code>HWordPosition</code>.
The method <code>intersects(CharTable ct)</code> returns <code>true</code> if the specified char table intersects this word position, and <code>false</code> otherwise.
The method <code>intersects(CharTable ct)</code> is defined as follows:
<code>public boolean intersects(CharTable ct) {
    return ct.y1 &lt;= y &amp;&amp; y &lt; ct.y2 &amp;&amp; ct.x1 &lt; x2 &amp;&amp; x1 &lt; ct.x2;
}
</code>
The class <code>CharTable</code> is defined as follows:
<code>public class CharTable {

    /**
     * The horizontal coordinate of the left border of the char table.
     */
    public final int x1;

    /**
     * The horizontal coordinate of the right border of the char table + 1.
     */
    public final int x2;

    /**
     * The vertical coordinate of the upper border of the char table.
     */
    public final int y1;

    /**
     * The vertical coordinate of the lower border of the char table + 1.
     */
    public final int y2;

    public CharTable(int x1, int x2, int y1, int y2) {
        if (x1 &gt; x2 || y1 &gt; y2)
            throw new IllegalArgumentException("wrong char table parameters");
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public CharTable(CharPosition1 pos1, CharPosition2 pos2) {
        this(pos1.x, pos2.x, pos1.y, pos2.y);
    }

    public CharTable(CharPosition1 pos1, int x2, int y2) {
        this(pos1.x, x2, pos1.y, y2);
    }

    public CharTable(int x1, int y1, CharPosition2 pos2) {
        this(x1, pos2.x, y1, pos2.y);
    }

    public CharTable(CharPosition1 pos1, int x2, CharPosition2 pos2) {
        this(pos1.x, x2, pos1.y, pos2.y);
    }

    public CharTable(int x1, CharPosition2 pos2, int y2) {
        this(x1, pos2.x, pos2.y, y2);
    }

    public CharTable(CharPosition1 pos1, int y1, CharPosition2 pos2) {
        this(pos1.x, pos2.x, y1, pos2.y);
    }

    public CharTable(int x1, int y1, int x2, int y2) {
        this(new CharPosition1(x1, y1), new CharPosition2(x2, y2));
    }

    public CharTable(CharPosition1 pos1, CharPosition2 pos2, int width) {
        this(pos1.x, pos1.y, pos1.x + width, pos2.y);
    }

    public CharTable(CharPosition1 pos1, int width, CharPosition2 pos2) {
        this(pos1.x, pos1.y, pos1.x + width, pos2.y);
    }

    public CharTable(