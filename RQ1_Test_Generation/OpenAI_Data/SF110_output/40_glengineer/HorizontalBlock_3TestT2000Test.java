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
		Scheme scheme = new Scheme("|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 2);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 2), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 2), result.get(2));
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
		Scheme scheme = new Scheme("|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 2);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 2), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 2), result.get(2));
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
		Scheme scheme = new Scheme("|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 2);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 2), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 2), result.get(2));
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
		Scheme scheme = new Scheme("|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 2);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 2), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 2), result.get(2));
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
		Scheme scheme = new Scheme("|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 2);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 2), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 2), result.get(2));
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
		Scheme scheme = new Scheme("|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 2);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0, 1, 3, 2), result.get(1));
		assertEquals(new HorizontalBlock(scheme, 3, 0, 5, 2), result.get(2));
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
		Scheme scheme = new Scheme("|---|\n|---|");
		HorizontalBlock block = new HorizontalBlock(scheme, 0, 0, 5, 2);
		List<Block> result = block.extractParallelSubblocks();
		assertEquals(3, result.size());
		assertEquals(new HorizontalBlock(scheme, 0, 0, 3, 1), result.get(0));
		assertEquals(new HorizontalBlock(scheme, 0,