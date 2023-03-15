// VWordPosition_5Test.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VWordPosition}.
* It contains ten unit test cases for the {@link VWordPosition#compareTo(VWordPosition)} method.
*/
class VWordPosition_5Test {

	@Test
	void testCompareTo() {
		CharTable ct = new CharTable(0, 0, 10, 10);
		Block b1 = new Block(ct, new CharPosition(0, 0), new CharPosition(9, 9));
		Block b2 = new Block(ct, new CharPosition(1, 1), new CharPosition(8, 8));
		Block b3 = new Block(ct, new CharPosition(2, 2), new CharPosition(7, 7));
		Block b4 = new Block(ct, new CharPosition(3, 3), new CharPosition(6, 6));
		Block b5 = new Block(ct, new CharPosition(4, 4), new CharPosition(5, 5));
		
		VWordPosition v1 = new VWordPosition(b1);
		VWordPosition v2 = new VWordPosition(b2);
		VWordPosition v3 = new VWordPosition(b3);
		VWordPosition v4 = new VWordPosition(b4);
		VWordPosition v5 = new VWordPosition(b5);
		
		assertEquals(0, v1.compareTo(v1));
		assertEquals(-1, v1.compareTo(v2));
		assertEquals(-1, v1.compareTo(v3));
		assertEquals(-1, v1.compareTo(v4));
		assertEquals(-1, v1.compareTo(v5));
		
		assertEquals(+1, v2.compareTo(v1));
		assertEquals(0, v2.compareTo(v2));
		assertEquals(-1, v2.compareTo(v3));
		assertEquals(-1, v2.compareTo(v4));
		assertEquals(-1, v2.compareTo(v5));
		
		assertEquals(+1, v3.compareTo(v1));
		assertEquals(+1, v3.compareTo(v2));
		assertEquals(0, v3.compareTo(v3));
		assertEquals(-1, v3.compareTo(v4));
		assertEquals(-1, v3.compareTo(v5));
		
		assertEquals(+1, v4.compareTo(v1));
		assertEquals(+1, v4.compareTo(v2));
		assertEquals(+1, v4.compareTo(v3));
		assertEquals(0, v4.compareTo(v4));
		assertEquals(-1, v4.compareTo(v5));
		
		assertEquals(+1, v5.compareTo(v1));
		assertEquals(+1, v5.compareTo(v2));
		assertEquals(+1, v5.compareTo(v3));
		assertEquals(+1, v5.compareTo(v4));
		assertEquals(0, v5.compareTo(v5));
	}
}</code></pre>
</div>
</div>

</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">VWordPosition_5Test</span><span class="o">.</span><span class="n">testCompareTo</span><span class="p">()</span>
</pre></div>

    </div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area">

    <div class="prompt"></div>




</div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h3 id="Проверка-позиции-горизонтального-слова">Проверка позиции горизонтального слова<a class="anchor-link" href="#Проверка-позиции-горизонтального-слова">&#182;</a></h3>
</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="c1">// HWordPosition.java</span>
<span class="k">package</span> <span class="n">glengineer</span><span class="o">.</span><span class="na">positions</span><span class="o">;</span>

<span class="k">import</span> <span class="n">glengineer</span><span class="o">.</span><span class="na">blocks</span><span class="o">.</span><span class="na">Block</span><span class="o">;</span>
<span class="k">import</span> <span class="n">glengineer</span><span class="o">.</span><span class="na">blocks</span><span class="o">.</span><span class="na">CharTable</span><span class="o">;</span>

<span class="c1">/**</span>
<span class="c1"> * Encapsulates the position (start and end coordinates)</span>
<span class="c1"> * of a word lying horizontally on the scheme.</span>
<span class="c1"> */</span>
<span class="k">public</span> <span class="k">class</span> <span class="nc">HWordPosition</span> <span class="k">extends</span> <span class="n">WordPosition</span> <span class="k">implements</span> <span class="n">Comparable</span><span class="o">&lt;</span><span class="n">HWordPosition</span><span class="o">&gt;</span> <span class="o">{</span>

    <span class="c1">/**</span>
<span class="c1">     * The vertical coordinate of the word.</span>
<span class="c1">     */</span>
    <span class="k">public</span> <span class="k">final</span> <span class="kt">int</span> <span class="n">y</span><span class="o">;</span>

    <span class="c1">/**</span>
<span class="c1">     * The horizontal coordinate of the word start.</span>
<span class="c1">     */</span>
    <span class="k">public</span> <span class="k">final</span> <span class="kt">int</span> <span class="n">x1</span><span class="o">;</span>

    <span class="c1">/**</span>
<span class="c1">     * The horizontal coordinate of the word end + 1.</span>
<span class="c1">     */</span>
    <span class="k">public</span> <span class="k">final</span> <span class="kt">int</span> <span class="n">x2</span><span class="o">;</span>

    <span class="