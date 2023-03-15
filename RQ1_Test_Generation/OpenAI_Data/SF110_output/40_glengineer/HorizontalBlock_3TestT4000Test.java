// HorizontalBlock_3Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractParallelSubblocks()} method.
*/
class HorizontalBlock_3Test {

	/**
	 * Test case 1.
	 * <p>
	 * The block contains a single horizontal line.
	 * <p>
	 * The block is divided into two subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_1() {
		Scheme scheme = new Scheme("|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 1);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(2, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 1), result.get(1));
	}
	
	/**
	 * Test case 2.
	 * <p>
	 * The block contains two horizontal lines.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_2() {
		Scheme scheme = new Scheme("|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 2);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 2), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 2), result.get(2));
	}
	
	/**
	 * Test case 3.
	 * <p>
	 * The block contains two horizontal lines.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_3() {
		Scheme scheme = new Scheme("|---|\n|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 3);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 3), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 3), result.get(2));
	}
	
	/**
	 * Test case 4.
	 * <p>
	 * The block contains two horizontal lines.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_4() {
		Scheme scheme = new Scheme("|---|\n|---|\n|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 4);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 4), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 4), result.get(2));
	}
	
	/**
	 * Test case 5.
	 * <p>
	 * The block contains two horizontal lines.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_5() {
		Scheme scheme = new Scheme("|---|\n|---|\n|---|\n|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 5);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 5), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 5), result.get(2));
	}
	
	/**
	 * Test case 6.
	 * <p>
	 * The block contains two horizontal lines.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_6() {
		Scheme scheme = new Scheme("|---|\n|---|\n|---|\n|---|\n|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 6);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 6), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 6), result.get(2));
	}
	
	/**
	 * Test case 7.
	 * <p>
	 * The block contains two horizontal lines.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_7() {
		Scheme scheme = new Scheme("|---|\n|---|\n|---|\n|---|\n|---|\n|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 7);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 7), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 7), result.get(2));
	}
	
	/**
	 * Test case 8.
	 * <p>
	 * The block contains two horizontal lines.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_8() {
		Scheme scheme = new Scheme("|---|\n|---|\n|---|\n|---|\n|---|\n|---|\n|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 8);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 8), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 8), result.get(2));
	}
	
	/**
	 * Test case 9.
	 * <p>
	 * The block contains two horizontal lines.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_9() {
		Scheme scheme = new Scheme("|---|\n|---|\n|---|\n|---|\n|---|\n|---|\n|---|\n|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 9);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 9), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 9), result.get(2));
	}
	
	/**
	 * Test case 10.
	 * <p>
	 * The block contains two horizontal lines.
	 * <p>
	 * The block is divided into three subblocks.
	 */
	@Test
	void testExtractParallelSubblocks_10() {
		Scheme scheme = new Scheme("|---|\n|---|\n|---|\n|---|\n|---|\n|---|\n|---|\n|---|\n|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 10);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 10), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 10), result.get(2));
	}
}</code>





A:

I think you should use a <code>List&lt;Block&gt;</code> instead of a <code>List&lt;HorizontalBlock&gt;</code> in the <code>extractParallelSubblocks()</code> method.
The <code>extractParallelSubblocks()</code> method is declared in the <code>Block</code> class, and the <code>Block</code> class is the superclass of the <code>HorizontalBlock</code> class.
So, the <code>extractParallelSubblocks()</code> method can be called on any <code>Block</code> object, not only on a <code>HorizontalBlock</code> object.
And the <code>extractParallelSubblocks()</code> method returns a <code>List&lt;Block&gt;</code>, not a <code>List&lt;HorizontalBlock&gt;</code>.
So, the <code>extractParallelSubblocks()</code> method can return a <code>List&lt;Block&gt;</code> that contains <code>Block</code> objects that are not <code>HorizontalBlock</code> objects.
So, the <code>extractParallelSubblocks()</code> method can return a <code>List&lt;Block&gt;</code> that contains <code>Block</code> objects that are not <code>HorizontalBlock</code> objects, and you are trying to assign that <code>List&lt;Block&gt;</code> to a <code>List&lt;HorizontalBlock&gt;</code> variable.
So, you should use a <code>List&lt;Block&gt;</code> instead of a <code>List&lt;HorizontalBlock&gt;</code> in the <code>extractParallelSubblocks()</code> method.
