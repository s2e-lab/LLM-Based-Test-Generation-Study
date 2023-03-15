// Map_1Test.java
package gui;

import static java.lang.Math.max;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Hashtable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StreamTokenizer;
import java.io.IOException;
import java.awt.*;
import state.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains ten unit test cases for the {@link Map#lookup(int, int)} method.
*/
class Map_1Test {

		/**
		* Test case 1 for {@link Map#lookup(int, int)}.
		* It tests if the method returns null when the coordinates are out of bounds.
		*/
		@Test
		void testLookup1() {
				Map map = new Map("maps/testmap.map");
				assertNull(map.lookup(0, 0));
		}
		
		/**
		* Test case 2 for {@link Map#lookup(int, int)}.
		* It tests if the method returns null when the coordinates are out of bounds.
		*/
		@Test
		void testLookup2() {
				Map map = new Map("maps/testmap.map");
				assertNull(map.lookup(0, 1));
		}
		
		/**
		* Test case 3 for {@link Map#lookup(int, int)}.
		* It tests if the method returns null when the coordinates are out of bounds.
		*/
		@Test
		void testLookup3() {
				Map map = new Map("maps/testmap.map");
				assertNull(map.lookup(1, 0));
		}
		
		/**
		* Test case 4 for {@link Map#lookup(int, int)}.
		* It tests if the method returns null when the coordinates are out of bounds.
		*/
		@Test
		void testLookup4() {
				Map map = new Map("maps/testmap.map");
				assertNull(map.lookup(1, 1));
		}
		
		/**
		* Test case 5 for {@link Map#lookup(int, int)}.
		* It tests if the method returns null when the coordinates are out of bounds.
		*/
		@Test
		void testLookup5() {
				Map map = new Map("maps/testmap.map");
				assertNull(map.lookup(2, 0));
		}
		
		/**
		* Test case 6 for {@link Map#lookup(int, int)}.
		* It tests if the method returns null when the coordinates are out of bounds.
		*/
		@Test
		void testLookup6() {
				Map map = new Map("maps/testmap.map");
				assertNull(map.lookup(2, 1));
		}
		
		/**
		* Test case 7 for {@link Map#lookup(int, int)}.
		* It tests if the method returns null when the coordinates are out of bounds.
		*/
		@Test
		void testLookup7() {
				Map map = new Map("maps/testmap.map");
				assertNull(map.lookup(3, 0));
		}
		
		/**
		* Test case 8 for {@link Map#lookup(int, int)}.
		* It tests if the method returns null when the coordinates are out of bounds.
		*/
		@Test
		void testLookup8() {
				Map map = new Map("maps/testmap.map");
				assertNull(map.lookup(3, 1));
		}
		
		/**
		* Test case 9 for {@link Map#lookup(int, int)}.
		* It tests if the method returns null when the coordinates are out of bounds.
		*/
		@Test
		void testLookup9() {
				Map map = new Map("maps/testmap.map");
				assertNull(map.lookup(4, 0));
		}
		
		/**
		* Test case 10 for {@link Map#lookup(int, int)}.
		* It tests if the method returns null when the coordinates are out of bounds.
		*/
		@Test
		void testLookup10() {
				Map map = new Map("maps/testmap.map");
				assertNull(map.lookup(4, 1));
		}
}