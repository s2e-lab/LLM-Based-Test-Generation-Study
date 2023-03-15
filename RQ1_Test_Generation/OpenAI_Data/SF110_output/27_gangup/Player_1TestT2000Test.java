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
		* <p>
		* This test case checks if the method returns false when the player is not in the joinlist.
		*/
		@Test
		void testIsJoinOK_1() {
				Player player = new Player();
				Player joiner = new Player();
				assertFalse(player.isJoinOK(joiner, true));
		}
		
		/**
		* Test case 2 for {@link Player#isJoinOK(Player, boolean)}.
		* <p>
		* This test case checks if the method returns false when the player is in the joinlist but the time has expired.
		*/
		@Test
		void testIsJoinOK_2() {
				Player player = new Player();
				Player joiner = new Player();
				player.setJoinOK(joiner, true);
				try {
						Thread.sleep(15000);
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
				assertFalse(player.isJoinOK(joiner, true));
		}
		
		/**
		* Test case 3 for {@link Player#isJoinOK(Player, boolean)}.
		* <p>
		* This test case checks if the method returns false when the player is in the joinlist but the time has not expired.
		*/
		@Test
		void testIsJoinOK_3() {
				Player player = new Player();
				Player joiner = new Player();
				player.setJoinOK(joiner, true);
				assertFalse(player.isJoinOK(joiner, false));
		}
		
		/**
		* Test case 4 for {@link Player#isJoinOK(Player, boolean)}.
		* <p>
		* This test case checks if the method returns false when the player is in the joinlist but the time has expired.
		*/
		@Test
		void testIsJoinOK_4() {
				Player player = new Player();
				Player joiner = new Player();
				player.setJoinOK(joiner, true);
				try {
						Thread.sleep(15000);
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
				assertFalse(player.isJoinOK(joiner, false));
		}
		
		/**
		* Test case 5 for {@link Player#isJoinOK(Player, boolean)}.
		* <p>
		* This test case checks if the method returns false when the player is in the joinlist but the time has not expired.
		*/
		@Test
		void testIsJoinOK_5() {
				Player player = new Player();
				Player joiner = new Player();
				player.setJoinOK(joiner, false);
				assertFalse(player.isJoinOK(joiner, true));
		}
		
		/**
		* Test case 6 for {@link Player#isJoinOK(Player, boolean)}.
		* <p>
		* This test case checks if the method returns false when the player is in the joinlist but the time has expired.
		*/
		@Test
		void testIsJoinOK_6() {
				Player player = new Player();
				Player joiner = new Player();
				player.setJoinOK(joiner, false);
				try {
						Thread.sleep(15000);
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
				assertFalse(player.isJoinOK(joiner, true));
		}
		
		/**
		* Test case 7 for {@link Player#isJoinOK(Player, boolean)}.
		* <p>
		* This test case checks if the method returns false when the player is in the joinlist but the time has not expired.
		*/
		@Test
		void testIsJoinOK_7() {
				Player player = new Player();
				Player joiner = new Player();
				player.setJoinOK(joiner, false);
				assertFalse(player.isJoinOK(joiner, false));
		}
		
		/**
		* Test case 8 for {@link Player#isJoinOK(Player, boolean)}.
		* <p>
		* This test case checks if the method returns false when the player is in the joinlist but the time has expired.
		*/
		@Test
		void testIsJoinOK_8() {
				Player player = new Player();
				Player joiner = new Player();
				player.setJoinOK(joiner, false);
				try {
						Thread.sleep(15000);
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
				assertFalse(player.isJoinOK(joiner, false));
		}
		
		/**
		* Test case 9 for {@link Player#isJoinOK(Player, boolean)}.
		* <p>
		* This test case checks if the method returns true when the player is in the joinlist and the time has not expired.
		*/
		@Test
		void testIsJoinOK_9() {
				Player player = new Player();
				Player joiner = new Player();
				player.setJoinOK(joiner, true);
				assertTrue(player.isJoinOK(joiner, true));
		}
		
		/**
		* Test case 10 for {@link Player#isJoinOK(Player, boolean)}.
		* <p>
		* This test case checks if the method returns true when the player is in the joinlist and the time has not expired.
		*/
		@Test
		void testIsJoinOK_10() {
				Player player = new Player();
				Player joiner = new Player();
				player.setJoinOK(joiner, false);
				assertTrue(player.isJoinOK(joiner, false));
		}
}

// Player_2Test.java
package state;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Player}.
* It contains ten unit test cases for the {@link Player#setJoinOK(Player, boolean)} method.
*/
class Player_2Test {
		
		/**
		* Test case 1 for {@link Player#setJoinOK(Player, boolean)}.
		* <p>
		* This test case checks if the method adds the player to the joinlist.
		*/
		@Test
		void testSetJoinOK_1() {
				Player player = new Player();
				Player joiner = new Player();
				player.setJoinOK(joiner, true);
				assertTrue(player.isJoinOK(joiner, true));
		}
		
		/**
		* Test case 2 for {@link Player#setJoinOK(Player, boolean)}.
		* <p>
		* This test case checks if the method adds the player to the joinlist.
		*/
		@Test
		void testSetJoinOK_2() {
				Player player = new Player();
			