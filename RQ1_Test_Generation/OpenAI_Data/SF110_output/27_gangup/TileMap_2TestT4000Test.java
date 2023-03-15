// TileMap_2Test.java
package map;

import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TileMap}.
* It contains ten unit test cases for the {@link TileMap#search(int, int, int, int)} method.
*/
class TileMap_2Test {

	/**
	* Test case 1 for {@link TileMap#search(int, int, int, int)}.
	* It tests the case where the source and destination nodes are the same.
	* The expected result is an empty path.
	*/
	@Test
	void testSearch_1() throws IOException {
		TileMap map = new TileMap("map/test/test1.map", 32);
		Path path = map.search(0, 0, 0, 0);
		assertEquals(0, path.getLength());
	}
	
	/**
	* Test case 2 for {@link TileMap#search(int, int, int, int)}.
	* It tests the case where the source and destination nodes are adjacent.
	* The expected result is a path of length 1.
	*/
	@Test
	void testSearch_2() throws IOException {
		TileMap map = new TileMap("map/test/test1.map", 32);
		Path path = map.search(0, 0, 1, 0);
		assertEquals(1, path.getLength());
	}
	
	/**
	* Test case 3 for {@link TileMap#search(int, int, int, int)}.
	* It tests the case where the source and destination nodes are not adjacent.
	* The expected result is a path of length 2.
	*/
	@Test
	void testSearch_3() throws IOException {
		TileMap map = new TileMap("map/test/test1.map", 32);
		Path path = map.search(0, 0, 1, 1);
		assertEquals(2, path.getLength());
	}
	
	/**
	* Test case 4 for {@link TileMap#search(int, int, int, int)}.
	* It tests the case where the source and destination nodes are not adjacent.
	* The expected result is a path of length 3.
	*/
	@Test
	void testSearch_4() throws IOException {
		TileMap map = new TileMap("map/test/test1.map", 32);
		Path path = map.search(0, 0, 2, 2);
		assertEquals(3, path.getLength());
	}
	
	/**
	* Test case 5 for {@link TileMap#search(int, int, int, int)}.
	* It tests the case where the source and destination nodes are not adjacent.
	* The expected result is a path of length 4.
	*/
	@Test
	void testSearch_5() throws IOException {
		TileMap map = new TileMap("map/test/test1.map", 32);
		Path path = map.search(0, 0, 3, 3);
		assertEquals(4, path.getLength());
	}
	
	/**
	* Test case 6 for {@link TileMap#search(int, int, int, int)}.
	* It tests the case where the source and destination nodes are not adjacent.
	* The expected result is a path of length 5.
	*/
	@Test
	void testSearch_6() throws IOException {
		TileMap map = new TileMap("map/test/test1.map", 32);
		Path path = map.search(0, 0, 4, 4);
		assertEquals(5, path.getLength());
	}
	
	/**
	* Test case 7 for {@link TileMap#search(int, int, int, int)}.
	* It tests the case where the source and destination nodes are not adjacent.
	* The expected result is a path of length 6.
	*/
	@Test
	void testSearch_7() throws IOException {
		TileMap map = new TileMap("map/test/test1.map", 32);
		Path path = map.search(0, 0, 5, 5);
		assertEquals(6, path.getLength());
	}
	
	/**
	* Test case 8 for {@link TileMap#search(int, int, int, int)}.
	* It tests the case where the source and destination nodes are not adjacent.
	* The expected result is a path of length 7.
	*/
	@Test
	void testSearch_8() throws IOException {
		TileMap map = new TileMap("map/test/test1.map", 32);
		Path path = map.search(0, 0, 6, 6);
		assertEquals(7, path.getLength());
	}
	
	/**
	* Test case 9 for {@link TileMap#search(int, int, int, int)}.
	* It tests the case where the source and destination nodes are not adjacent.
	* The expected result is a path of length 8.
	*/
	@Test
	void testSearch_9() throws IOException {
		TileMap map = new TileMap("map/test/test1.map", 32);
		Path path = map.search(0, 0, 7, 7);
		assertEquals(8, path.getLength());
	}
	
	/**
	* Test case 10 for {@link TileMap#search(int, int, int, int)}.
	* It tests the case where the source and destination nodes are not adjacent.
	* The expected result is a path of length 9.
	*/
	@Test
	void testSearch_10() throws IOException {
		TileMap map = new TileMap("map/test/test1.map", 32);
		Path path = map.search(0, 0, 8, 8);
		assertEquals(9, path.getLength());
	}
}