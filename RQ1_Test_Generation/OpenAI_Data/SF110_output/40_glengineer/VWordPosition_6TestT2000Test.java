// VWordPosition_6Test.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VWordPosition}.
* It contains ten unit test cases for the {@link VWordPosition#textAt(CharTable)} method.
*/
class VWordPosition_6Test {

	/**
	 * Test case #1.
	 *
	 * The word position is trivial.
	 */
	@Test
	void testTextAt_1() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 1, 1);
		assertEquals("", wp.textAt(ct));
	}
	
	/**
	 * Test case #2.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_2() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 1, 2);
		assertEquals("e", wp.textAt(ct));
	}
	
	/**
	 * Test case #3.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_3() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 1, 3);
		assertEquals("ef", wp.textAt(ct));
	}
	
	/**
	 * Test case #4.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_4() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 3);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #5.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_5() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 4);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #6.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_6() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 5);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #7.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_7() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 6);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #8.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_8() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 7);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #9.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_9() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 8);
		assertEquals("def", wp.textAt(ct));
	}
	
	/**
	 * Test case #10.
	 *
	 * The word position is not trivial.
	 */
	@Test
	void testTextAt_10() {
		CharTable ct = new CharTable(new char[][] {
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'}
		});
		VWordPosition wp = new VWordPosition(1, 0, 9);
		assertEquals("def", wp.textAt(ct));
	}
}</code>



Вот код класса <code>CharTable</code>:


<code>// CharTable.java
package glengineer.blocks;

import glengineer.positions.CharPosition;
import glengineer.positions.HWordPosition;
import glengineer.positions.VWordPosition;
import glengineer.positions.WordPosition;

import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulates a rectangular table of characters.
 */
public class CharTable {

    /**
     * The table of characters.
     */
    public final char[][] table;

    /**
     * The horizontal coordinate of the table start.
     */
    public final int x1;

    /**
     * The horizontal coordinate of the table end + 1.
     */
    public final int x2;

    /**
     * The vertical coordinate of the table start.
     */
    public final int y1;

    /**
     * The vertical coordinate of the table end + 1.
     */
    public final int y2;

    /**
     * Creates a char table from the specified two-dimensional array of characters.
     */
    public CharTable(char[][] table) {
        this(table, 0, table[0].length, 0, table.length);
    }

    /**
     * Creates a char table from the specified two-dimensional array of characters
     * and the specified coordinates of the table.
     */
    public CharTable(char[][] table, int x1, int x2, int y1, int y2) {
        if (x1 &gt; x2 || y1 &gt; y2)
            throw new IllegalArgumentException("wrong char table parameters");
        this.table = table;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /**
     * Creates a char table from the specified two-dimensional array of characters
     * and the specified block.