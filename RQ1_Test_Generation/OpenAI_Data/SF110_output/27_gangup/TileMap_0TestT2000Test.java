// TileMap_0Test.java
package map;

import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TileMap}.
* It contains ten unit test cases for the {@link TileMap#getNodeAt(int, int)} method.
*/
class TileMap_0Test {

		/**
		* Test case for {@link TileMap#getNodeAt(int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>x = 0</li>
		* <li>y = 0</li>
		* </ul>
		*
		* @throws IOException if an error occurs while reading the map file.
		*/
		@Test
		void testGetNodeAt_0() throws IOException {
				TileMap tileMap = new TileMap("map/test/test.map", 15);
				Node node = tileMap.getNodeAt(0, 0);
				assertEquals(0, node.getX());
				assertEquals(0, node.getY());
		}
		
		/**
		* Test case for {@link TileMap#getNodeAt(int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>x = 0</li>
		* <li>y = 1</li>
		* </ul>
		*
		* @throws IOException if an error occurs while reading the map file.
		*/
		@Test
		void testGetNodeAt_1() throws IOException {
				TileMap tileMap = new TileMap("map/test/test.map", 15);
				Node node = tileMap.getNodeAt(0, 1);
				assertEquals(0, node.getX());
				assertEquals(1, node.getY());
		}
		
		/**
		* Test case for {@link TileMap#getNodeAt(int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>x = 0</li>
		* <li>y = 2</li>
		* </ul>
		*
		* @throws IOException if an error occurs while reading the map file.
		*/
		@Test
		void testGetNodeAt_2() throws IOException {
				TileMap tileMap = new TileMap("map/test/test.map", 15);
				Node node = tileMap.getNodeAt(0, 2);
				assertEquals(0, node.getX());
				assertEquals(2, node.getY());
		}
		
		/**
		* Test case for {@link TileMap#getNodeAt(int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>x = 0</li>
		* <li>y = 3</li>
		* </ul>
		*
		* @throws IOException if an error occurs while reading the map file.
		*/
		@Test
		void testGetNodeAt_3() throws IOException {
				TileMap tileMap = new TileMap("map/test/test.map", 15);
				Node node = tileMap.getNodeAt(0, 3);
				assertEquals(0, node.getX());
				assertEquals(3, node.getY());
		}
		
		/**
		* Test case for {@link TileMap#getNodeAt(int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>x = 0</li>
		* <li>y = 4</li>
		* </ul>
		*
		* @throws IOException if an error occurs while reading the map file.
		*/
		@Test
		void testGetNodeAt_4() throws IOException {
				TileMap tileMap = new TileMap("map/test/test.map", 15);
				Node node = tileMap.getNodeAt(0, 4);
				assertEquals(0, node.getX());
				assertEquals(4, node.getY());
		}
		
		/**
		* Test case for {@link TileMap#getNodeAt(int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>x = 0</li>
		* <li>y = 5</li>
		* </ul>
		*
		* @throws IOException if an error occurs while reading the map file.
		*/
		@Test
		void testGetNodeAt_5() throws IOException {
				TileMap tileMap = new TileMap("map/test/test.map", 15);
				Node node = tileMap.getNodeAt(0, 5);
				assertEquals(0, node.getX());
				assertEquals(5, node.getY());
		}
		
		/**
		* Test case for {@link TileMap#getNodeAt(int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>x = 0</li>
		* <li>y = 6</li>
		* </ul>
		*
		* @throws IOException if an error occurs while reading the map file.
		*/
		@Test
		void testGetNodeAt_6() throws IOException {
				TileMap tileMap = new TileMap("map/test/test.map", 15);
				Node node = tileMap.getNodeAt(0, 6);
				assertEquals(0, node.getX());
				assertEquals(6, node.getY());
		}
		
		/**
		* Test case for {@link TileMap#getNodeAt(int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>x = 0</li>
		* <li>y = 7</li>
		* </ul>
		*
		* @throws IOException if an error occurs while reading the map file.
		*/
		@Test
		void testGetNodeAt_7() throws IOException {
				TileMap tileMap = new TileMap("map/test/test.map", 15);
				Node node = tileMap.getNodeAt(0, 7);
				assertEquals(0, node.getX());
				assertEquals(7, node.getY());
		}
		
		/**
		* Test case for {@link TileMap#getNodeAt(int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>x = 0</li>
		* <li>y = 8</li>
		* </ul>
		*
		* @throws IOException if an error occurs while reading the map file.
		*/
		@Test
		void testGetNodeAt_8() throws IOException {
				TileMap tileMap = new TileMap("map/test/test.map", 15);
				Node node = tileMap.getNodeAt(0, 8);
				assertEquals(0, node.getX());
				assertEquals(8, node.getY());
		}
		
		/**
		* Test case for {@link TileMap#getNodeAt(int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>x = 0</li>
		* <li>y = 9</li>
		* </ul>
		*
		* @throws IOException if an error occurs while reading the map file.
		*/
		@Test
		void testGetNodeAt_9() throws IOException {
	