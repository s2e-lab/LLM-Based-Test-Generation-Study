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
     * Creates a char table from the specified two-dimensional array.
     */
    public CharTable(char[][] table) {
        this(table, 0, table[0].length, 0, table.length);
    }

    /**
     * Creates a char table from the specified two-dimensional array
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
     * Creates a char table from the specified two-dimensional array
     * and the specified coordinates of the table.
     */
    public CharTable(char[][] table, CharPosition start, CharPosition end) {
        this(table, start.x, end.x, start.y, end.y);
    }

    /**
     * Creates a char table from the specified two-dimensional array
     * and the specified coordinates of the table.
     */
    public CharTable(char[][] table, Block block) {
        this(table, block.getPos1(), block.getPos2());
    }

    /**
     * Returns the width of this char table.
     */
    public int getWidth() {
        return x2 - x1;
    }

    /**
     * Returns the height of this char table.
     */
    public int getHeight() {
        return y2 - y1;
    }

    /**
     * Returns the character at the specified position.
     */
    public char charAt(int x, int y) {
        return table[y][x];
    }

    /**
     * Returns the character at the specified position.
     */
    public char charAt(CharPosition cp) {
        return charAt(cp.x, cp.y);
    }

    /**
     * Returns the text at the specified horizontal word position.
     */
    public String textAt(HWordPosition hwp) {
        StringBuilder sb = new StringBuilder();
        for (int y = hwp.y1; y &lt; hwp.y2; y++)
            sb.append(table[y][hwp.x]);
        return sb.toString();
    }

    /**
     * Returns the text at the specified vertical word position.
     */
    public String textAt(VWordPosition vwp) {
        StringBuilder sb = new StringBuilder();
        for (int x = vwp.y1; x &lt; vwp.y2; x++)
            sb.append(table[x][vwp.x]);
        return sb.toString();
    }

    /**
     * Returns the text at the specified word position.
     */
    public String textAt(WordPosition wp) {
        if (wp instanceof HWordPosition)
            return textAt((HWordPosition) wp);
        else if (wp instanceof VWordPosition)
            return textAt((VWordPosition) wp);
        else
            throw new IllegalArgumentException("unknown word position type");
    }

    /**
     * Returns the list of horizontal words in this char table.
     */
    public List&lt;HWordPosition&gt; getHWords() {
        List&lt;HWordPosition&gt; result = new ArrayList&lt;&gt;();
        for (int y = y1; y &lt; y2; y++) {
            int x1 = x1;
            while (x1 &lt; x2 &amp;&amp; table[y][x1] == ' ')
                x1++;
            if (x1 &lt; x2) {
                int x2 = x1 + 1;
                while (x2 &lt; x2 &amp;&amp; table[y][x2] != ' ')
                    x2++;
                result.add(new HWordPosition(x1, y, x2));
            }
        }
        return result;
    }

    /**
     * Returns the list of vertical words in this char table.
     */
    public List&lt;VWordPosition&gt; getVWords() {
        List&lt;VWordPosition&gt; result = new ArrayList&lt;&gt;();
        for (int x = x1; x &lt; x2; x++) {
            int y1 = y1;
            while (y1 &lt; y2 &amp;&amp; table[y1][x] == ' ')
                y1++;
            if (y1 &lt; y2) {
                int y2 = y1 + 1;
                while (y2 &lt; y2 &amp;&amp; table[y2][x] != ' ')
                    y2++;
                result.add(new VWordPosition(x, y1, y2));
            }
        }
        return result;
    }

    /**
     * Returns the list of words in this char table.
     */
    public List&lt;WordPosition&gt; getWords() {
        List&lt;WordPosition&gt; result = new ArrayList&lt;&gt;();
        result.addAll(getHWords());
        result.addAll(getVWords());
        return result;
    }

    /**
     * Returns the list of blocks in this char table.
     */
    public List&lt;Block&gt; getBlocks() {
        List&lt;Block&gt; result = new ArrayList&lt;&gt;();
        for (int y = y1; y &lt; y2; y++) {
            int x1 = x1;
            while (x1 &lt; x2 &amp;&amp; table[y][x1] == ' ')
                x1++;
            if (x1 &lt; x2) {
                int x2 = x1 + 1;
                while (x2 &lt; x2 &amp;&amp; table[y][x2] != ' ')
                    x2++;
                result.add(new Block(x1, y, x2, y + 1));
            }
        }
        return result;
    }
}</code>



Вот код класса <code>Block</code>:


<code>// Block.java
package glengineer.blocks;

import glengineer.positions.CharPosition;
import glengineer.positions.HWordPosition;
import glengineer.positions.VWordPosition;
import glengineer.positions.WordPosition;

/**
 * Encapsulates a rectangular block of characters.
 */
public class Block {

    /**
     * The horizontal coordinate of the block start.
     */
    public final int x1;

    /**
     * The horizontal coordinate of the block end + 1.
     */
    public final int x2;

    /**
     * The vertical coordinate of the block start.
     */
    public final int y1;

    /**
     * The vertical coordinate of the block end + 1.
     */
    public final int y2;

    /**
     * Creates a block from the specified coordinates.
     */
    public Block(int x1, int y1, int x2, int y2) {
        if (x1 &gt; x2 || y1 &gt; y2)
            throw new IllegalArgumentException("wrong block parameters");
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /**
     * Creates a block from the specified coordinates.
     */
    public Block(CharPosition start, CharPosition end) {
        this(start.x, start.y, end.x, end.y);
    }

    /**
     * Creates a block from the specified coordinates.
     */
    public Block(WordPosition wp) {
        if (wp instanceof HWordPosition) {
            HWordPosition hwp = (HWordPosition) wp;
            this.x1 = hwp.x;
            this.x2 = hwp.x + 1;
            this.y1 = hwp.y1;
            this.y2 = hwp.y2;
        } else if (wp instanceof VWordPosition) {
            VWordPosition vwp = (VWordPosition) wp;
            this.x1 = vwp.x;
            this.x2 = vwp.x + 1;
            this.y1 = vwp.y1;
            this.y2 = vwp.y2;
        } else {
            throw new IllegalArgumentException("unknown word position type");
        }
    }

    /**
     * Returns the width of this block.
     */
    public int getWidth() {
        return x2 - x1;
    }

    /**
     * Returns the height of this block.
     */
    public int getHeight() {
        return y2 - y1;
    }

    /**
     * Returns the coordinates of the beginning of this block.
     */
