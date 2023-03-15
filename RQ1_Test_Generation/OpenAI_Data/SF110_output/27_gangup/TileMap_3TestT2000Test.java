// TileMap_3Test.java
package map;

import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TileMap}.
* It contains ten unit test cases for the {@link TileMap#search(Node, Node)} method.
*/
class TileMap_3Test {

		/**
		* Test case 1 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is the same as the target node.
		* The expected result is a path with only one node.
		*/
		@Test
		void testSearch_1() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 1);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(0, 0);
				Path path = map.search(source, target);
				assertEquals(1, path.getLength());
		}
		
		/**
		* Test case 2 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is adjacent to the target node.
		* The expected result is a path with two nodes.
		*/
		@Test
		void testSearch_2() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 1);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(1, 0);
				Path path = map.search(source, target);
				assertEquals(2, path.getLength());
		}
		
		/**
		* Test case 3 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is not adjacent to the target node.
		* The expected result is a path with three nodes.
		*/
		@Test
		void testSearch_3() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 1);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(2, 0);
				Path path = map.search(source, target);
				assertEquals(3, path.getLength());
		}
		
		/**
		* Test case 4 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is not adjacent to the target node.
		* The expected result is a path with four nodes.
		*/
		@Test
		void testSearch_4() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 1);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(3, 0);
				Path path = map.search(source, target);
				assertEquals(4, path.getLength());
		}
		
		/**
		* Test case 5 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is not adjacent to the target node.
		* The expected result is a path with five nodes.
		*/
		@Test
		void testSearch_5() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 1);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(4, 0);
				Path path = map.search(source, target);
				assertEquals(5, path.getLength());
		}
		
		/**
		* Test case 6 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is not adjacent to the target node.
		* The expected result is a path with six nodes.
		*/
		@Test
		void testSearch_6() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 1);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(5, 0);
				Path path = map.search(source, target);
				assertEquals(6, path.getLength());
		}
		
		/**
		* Test case 7 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is not adjacent to the target node.
		* The expected result is a path with seven nodes.
		*/
		@Test
		void testSearch_7() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 1);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(6, 0);
				Path path = map.search(source, target);
				assertEquals(7, path.getLength());
		}
		
		/**
		* Test case 8 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is not adjacent to the target node.
		* The expected result is a path with eight nodes.
		*/
		@Test
		void testSearch_8() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 1);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(7, 0);
				Path path = map.search(source, target);
				assertEquals(8, path.getLength());
		}
		
		/**
		* Test case 9 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is not adjacent to the target node.
		* The expected result is a path with nine nodes.
		*/
		@Test
		void testSearch_9() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 1);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(8, 0);
				Path path = map.search(source, target);
				assertEquals(9, path.getLength());
		}
		
		/**
		* Test case 10 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is not adjacent to the target node.
		* The expected result is a path with ten nodes.
		*/
		@Test
		void testSearch_10() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 1);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(9, 0);
				Path path = map.search(source, target);
				assertEquals(10, path.getLength());
		}
}