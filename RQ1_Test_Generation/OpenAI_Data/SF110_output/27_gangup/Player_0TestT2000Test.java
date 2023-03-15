// Player_0Test.java
package state;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Player}.
* It contains ten unit test cases for the {@link Player#gangStrength()} method.
*/
class Player_0Test {

		/**
		* Test case 1 for {@link Player#gangStrength()}.
		* This test case tests the gang strength of a player with no gang.
		*/
		@Test
		void testGangStrength_0() {
				Player p = new Player();
				assertEquals(1, p.gangStrength());
		}
		
		/**
		* Test case 2 for {@link Player#gangStrength()}.
		* This test case tests the gang strength of a player with a gang of one.
		*/
		@Test
		void testGangStrength_1() {
				Player p = new Player();
				Player p2 = new Player();
				p.join(p2);
				assertEquals(2, p.gangStrength());
		}
		
		/**
		* Test case 3 for {@link Player#gangStrength()}.
		* This test case tests the gang strength of a player with a gang of two.
		*/
		@Test
		void testGangStrength_2() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				p.join(p2);
				p.join(p3);
				assertEquals(3, p.gangStrength());
		}
		
		/**
		* Test case 4 for {@link Player#gangStrength()}.
		* This test case tests the gang strength of a player with a gang of three.
		*/
		@Test
		void testGangStrength_3() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				p.join(p2);
				p.join(p3);
				p.join(p4);
				assertEquals(4, p.gangStrength());
		}
		
		/**
		* Test case 5 for {@link Player#gangStrength()}.
		* This test case tests the gang strength of a player with a gang of four.
		*/
		@Test
		void testGangStrength_4() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				Player p5 = new Player();
				p.join(p2);
				p.join(p3);
				p.join(p4);
				p.join(p5);
				assertEquals(5, p.gangStrength());
		}
		
		/**
		* Test case 6 for {@link Player#gangStrength()}.
		* This test case tests the gang strength of a player with a gang of five.
		*/
		@Test
		void testGangStrength_5() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				Player p5 = new Player();
				Player p6 = new Player();
				p.join(p2);
				p.join(p3);
				p.join(p4);
				p.join(p5);
				p.join(p6);
				assertEquals(6, p.gangStrength());
		}
		
		/**
		* Test case 7 for {@link Player#gangStrength()}.
		* This test case tests the gang strength of a player with a gang of six.
		*/
		@Test
		void testGangStrength_6() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				Player p5 = new Player();
				Player p6 = new Player();
				Player p7 = new Player();
				p.join(p2);
				p.join(p3);
				p.join(p4);
				p.join(p5);
				p.join(p6);
				p.join(p7);
				assertEquals(7, p.gangStrength());
		}
		
		/**
		* Test case 8 for {@link Player#gangStrength()}.
		* This test case tests the gang strength of a player with a gang of seven.
		*/
		@Test
		void testGangStrength_7() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				Player p5 = new Player();
				Player p6 = new Player();
				Player p7 = new Player();
				Player p8 = new Player();
				p.join(p2);
				p.join(p3);
				p.join(p4);
				p.join(p5);
				p.join(p6);
				p.join(p7);
				p.join(p8);
				assertEquals(8, p.gangStrength());
		}
		
		/**
		* Test case 9 for {@link Player#gangStrength()}.
		* This test case tests the gang strength of a player with a gang of eight.
		*/
		@Test
		void testGangStrength_8() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				Player p5 = new Player();
				Player p6 = new Player();
				Player p7 = new Player();
				Player p8 = new Player();
				Player p9 = new Player();
				p.join(p2);
				p.join(p3);
				p.join(p4);
				p.join(p5);
				p.join(p6);
				p.join(p7);
				p.join(p8);
				p.join(p9);
				assertEquals(9, p.gangStrength());
		}
		
		/**
		* Test case 10 for {@link Player#gangStrength()}.
		* This test case tests the gang strength of a player with a gang of nine.
		*/
		@Test
		void testGangStrength_9() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				Player p5 = new Player();
				Player p6 = new Player();
				Player p7 = new Player();
				Player p8 = new Player();
				Player p9 = new Player();
				Player p10 = new Player();
				p.join(p2);
				p.join(p3);
				p.join(p4);
				p.join(p5);
				p.join(p6);
				p.join(p7);
				p.join(p8);
				p.join(