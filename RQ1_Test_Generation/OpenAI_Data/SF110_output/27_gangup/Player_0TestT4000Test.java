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
		* This test case tests the gangStrength method when the player is not in a gang.
		*/
		@Test
		void testGangStrength_1() {
				Player p = new Player();
				assertEquals(0, p.gangStrength());
		}
		
		/**
		* Test case 2 for {@link Player#gangStrength()}.
		* This test case tests the gangStrength method when the player is in a gang with one member.
		*/
		@Test
		void testGangStrength_2() {
				Player p = new Player();
				Player p2 = new Player();
				p.join(p2);
				assertEquals(1, p.gangStrength());
		}
		
		/**
		* Test case 3 for {@link Player#gangStrength()}.
		* This test case tests the gangStrength method when the player is in a gang with two members.
		*/
		@Test
		void testGangStrength_3() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				p.join(p2);
				p.join(p3);
				assertEquals(2, p.gangStrength());
		}
		
		/**
		* Test case 4 for {@link Player#gangStrength()}.
		* This test case tests the gangStrength method when the player is in a gang with three members.
		*/
		@Test
		void testGangStrength_4() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				p.join(p2);
				p.join(p3);
				p.join(p4);
				assertEquals(3, p.gangStrength());
		}
		
		/**
		* Test case 5 for {@link Player#gangStrength()}.
		* This test case tests the gangStrength method when the player is in a gang with four members.
		*/
		@Test
		void testGangStrength_5() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				Player p5 = new Player();
				p.join(p2);
				p.join(p3);
				p.join(p4);
				p.join(p5);
				assertEquals(4, p.gangStrength());
		}
		
		/**
		* Test case 6 for {@link Player#gangStrength()}.
		* This test case tests the gangStrength method when the player is in a gang with five members.
		*/
		@Test
		void testGangStrength_6() {
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
				assertEquals(5, p.gangStrength());
		}
		
		/**
		* Test case 7 for {@link Player#gangStrength()}.
		* This test case tests the gangStrength method when the player is in a gang with six members.
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
				p.join(p2);
				p.join(p3);
				p.join(p4);
				p.join(p5);
				p.join(p6);
				p.join(p7);
				assertEquals(6, p.gangStrength());
		}
		
		/**
		* Test case 8 for {@link Player#gangStrength()}.
		* This test case tests the gangStrength method when the player is in a gang with seven members.
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
				p.join(p2);
				p.join(p3);
				p.join(p4);
				p.join(p5);
				p.join(p6);
				p.join(p7);
				p.join(p8);
				assertEquals(7, p.gangStrength());
		}
		
		/**
		* Test case 9 for {@link Player#gangStrength()}.
		* This test case tests the gangStrength method when the player is in a gang with eight members.
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
				p.join(p2);
				p.join(p3);
				p.join(p4);
				p.join(p5);
				p.join(p6);
				p.join(p7);
				p.join(p8);
				p.join(p9);
				assertEquals(8, p.gangStrength());
		}
		
		/**
		* Test case 10 for {@link Player#gangStrength()}.
		* This test case tests the gangStrength method when the player is in a gang with nine members.
		*/
		@Test
		void testGangStrength_10() {
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
				p.join(p9);
				p.join(p10);
				assertEquals(9, p.gangStrength());
		}
}

// Player_1Test.java
package state;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Player}.
* It contains ten unit test cases for the {@link Player#isJoinOK(Player, boolean)} method.
*/
class Player_1Test {
		
		/**
		* Test case 1 for {@link Player#isJoinOK(Player, boolean)}.
		* This test case tests the isJoinOK method when the player is not in a gang.
		*/
		@Test
		void testIsJoinOK_1() {
				Player p = new Player();
				Player p2 = new Player();
				assertFalse(p.isJoinOK(p2, true));
		}
		
		/**
		* Test case 2 for {@link Player#isJoinOK(Player, boolean)}.
		* This test case tests the isJoinOK method when the player is in a gang with one member.
		*/
		@Test
		void testIsJoinOK_2() {
				Player p = new Player();
				Player p2 = new Player();
				p.join(p2);
				assertFalse(p.isJoinOK(p2, true));
		}
		
		/**
		* Test case 3 for {@link Player#isJoinOK(Player, boolean)}.
		* This test case tests the isJoinOK method when the player is in a gang with two members.
		*/
		@Test
		void testIsJoinOK_3() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				p.join(p2);
				p.join(p3);
				assertFalse(p.isJoinOK(p2, true));
		}
		
		/**
		* Test case 4 for {@link Player#isJoinOK(Player, boolean)}.
		* This test case tests the isJoinOK method when the player is in a gang with three members.
		*/
		@Test
		void testIsJoinOK_4() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				p.join(p2);
				p.join(p3);
				p.join(p4);
				assertFalse(p.isJoinOK(p2, true));
		}
		
		/**
		* Test case 5 for {@link Player#isJoinOK(Player, boolean)}.
		* This test case tests the isJoinOK method when the player is in a gang with four members.
		*/
		@Test
		void testIsJoinOK_5() {
				Player p = new Player();
				Player p2 = new Player();
				Player p3 = new Player();
				Player p4 = new Player();
				Player p5 = new Player();
				p.join(p2);
				p.join(p3);
				p.join(p4);
				p.join(p5);
				assertFalse(p.isJoinOK(p2, true));
		}
		
		/**
		* Test case 6 for {@link Player#isJoinOK(Player, boolean)}.
		* This test case tests the isJoinOK method when the player is in a gang with five members.
		*/
		@Test
		void testIsJoinOK_6() {
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
				assertFalse(p.isJoinOK(p2, true));
		}
		
		/**
		* Test case 7 for {@link Player#isJoinOK(Player, boolean)}.
		* This test case tests the isJoinOK method when the player is in a gang with six members.
		*/
		@Test
		void testIsJoinOK_7() {
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
				assertFalse(p.isJoinOK(p2, true));
		}
		
		/**
		* Test case 8 for {@link Player#isJoinOK(Player, boolean)}.
		* This test case tests the isJoinOK method when the player is in a gang with seven members.
		*/
		@Test
		void testIsJoinOK_8() {
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
				assertFalse(p.isJoinOK(p2, true));
		}
		
		/**
		* Test case 9 for {@link Player#isJoinOK(Player, boolean)}.
		* This test case tests the isJoinOK method when the player is in a gang with eight members.
		*/
		@Test
		void testIsJoinOK_9() {
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
		