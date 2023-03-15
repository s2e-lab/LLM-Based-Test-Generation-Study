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
				TileMap map = new TileMap("map/test/test1.map", 10);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(0, 0);
				Path path = map.search(source, target);
				assertEquals(1, path.getLength());
		}
		
		/**
		* Test case 2 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is the same as the target node.
		* The expected result is a path with only one node.
		*/
		@Test
		void testSearch_2() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 10);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(0, 0);
				Path path = map.search(source, target);
				assertEquals(1, path.getLength());
		}
		
		/**
		* Test case 3 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is the same as the target node.
		* The expected result is a path with only one node.
		*/
		@Test
		void testSearch_3() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 10);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(0, 0);
				Path path = map.search(source, target);
				assertEquals(1, path.getLength());
		}
		
		/**
		* Test case 4 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is the same as the target node.
		* The expected result is a path with only one node.
		*/
		@Test
		void testSearch_4() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 10);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(0, 0);
				Path path = map.search(source, target);
				assertEquals(1, path.getLength());
		}
		
		/**
		* Test case 5 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is the same as the target node.
		* The expected result is a path with only one node.
		*/
		@Test
		void testSearch_5() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 10);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(0, 0);
				Path path = map.search(source, target);
				assertEquals(1, path.getLength());
		}
		
		/**
		* Test case 6 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is the same as the target node.
		* The expected result is a path with only one node.
		*/
		@Test
		void testSearch_6() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 10);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(0, 0);
				Path path = map.search(source, target);
				assertEquals(1, path.getLength());
		}
		
		/**
		* Test case 7 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is the same as the target node.
		* The expected result is a path with only one node.
		*/
		@Test
		void testSearch_7() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 10);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(0, 0);
				Path path = map.search(source, target);
				assertEquals(1, path.getLength());
		}
		
		/**
		* Test case 8 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is the same as the target node.
		* The expected result is a path with only one node.
		*/
		@Test
		void testSearch_8() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 10);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(0, 0);
				Path path = map.search(source, target);
				assertEquals(1, path.getLength());
		}
		
		/**
		* Test case 9 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is the same as the target node.
		* The expected result is a path with only one node.
		*/
		@Test
		void testSearch_9() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 10);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(0, 0);
				Path path = map.search(source, target);
				assertEquals(1, path.getLength());
		}
		
		/**
		* Test case 10 for {@link TileMap#search(Node, Node)}.
		* It tests the case where the source node is the same as the target node.
		* The expected result is a path with only one node.
		*/
		@Test
		void testSearch_10() throws IOException {
				TileMap map = new TileMap("map/test/test1.map", 10);
				Node source = map.getNodeAt(0, 0);
				Node target = map.getNodeAt(0, 0);
				Path path = map.search(source, target);
				assertEquals(1, path.getLength());
		}
}