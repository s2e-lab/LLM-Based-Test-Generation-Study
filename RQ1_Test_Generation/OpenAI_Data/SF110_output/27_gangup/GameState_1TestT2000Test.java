// GameState_1Test.java
package state;

import java.util.*;
import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameState}.
* It contains ten unit test cases for the {@link GameState#player(int)} method.
*/
class GameState_1Test {

		/**
		* Test case for {@link GameState#player(int)} method.
		* This test case tests the method with a negative value.
		*/
		@Test
		void testPlayer_1() {
				GameState gs = new GameState();
				assertNull(gs.player(-1));
		}
		
		/**
		* Test case for {@link GameState#player(int)} method.
		* This test case tests the method with a value equal to the maximum number of players.
		*/
		@Test
		void testPlayer_2() {
				GameState gs = new GameState();
				assertNull(gs.player(GameState.MAX_PLAYER_LIMIT));
		}
		
		/**
		* Test case for {@link GameState#player(int)} method.
		* This test case tests the method with a value greater than the maximum number of players.
		*/
		@Test
		void testPlayer_3() {
				GameState gs = new GameState();
				assertNull(gs.player(GameState.MAX_PLAYER_LIMIT + 1));
		}
		
		/**
		* Test case for {@link GameState#player(int)} method.
		* This test case tests the method with a value equal to the maximum number of players minus one.
		*/
		@Test
		void testPlayer_4() {
				GameState gs = new GameState();
				assertNull(gs.player(GameState.MAX_PLAYER_LIMIT - 1));
		}
		
		/**
		* Test case for {@link GameState#player(int)} method.
		* This test case tests the method with a value equal to zero.
		*/
		@Test
		void testPlayer_5() {
				GameState gs = new GameState();
				assertNull(gs.player(0));
		}
		
		/**
		* Test case for {@link GameState#player(int)} method.
		* This test case tests the method with a value equal to one.
		*/
		@Test
		void testPlayer_6() {
				GameState gs = new GameState();
				assertNull(gs.player(1));
		}
		
		/**
		* Test case for {@link GameState#player(int)} method.
		* This test case tests the method with a value equal to the maximum number of players divided by two.
		*/
		@Test
		void testPlayer_7() {
				GameState gs = new GameState();
				assertNull(gs.player(GameState.MAX_PLAYER_LIMIT / 2));
		}
		
		/**
		* Test case for {@link GameState#player(int)} method.
		* This test case tests the method with a value equal to the maximum number of players divided by two plus one.
		*/
		@Test
		void testPlayer_8() {
				GameState gs = new GameState();
				assertNull(gs.player(GameState.MAX_PLAYER_LIMIT / 2 + 1));
		}
		
		/**
		* Test case for {@link GameState#player(int)} method.
		* This test case tests the method with a value equal to the maximum number of players divided by two minus one.
		*/
		@Test
		void testPlayer_9() {
				GameState gs = new GameState();
				assertNull(gs.player(GameState.MAX_PLAYER_LIMIT / 2 - 1));
		}
		
		/**
		* Test case for {@link GameState#player(int)} method.
		* This test case tests the method with a value equal to the maximum number of players divided by two minus two.
		*/
		@Test
		void testPlayer_10() {
				GameState gs = new GameState();
				assertNull(gs.player(GameState.MAX_PLAYER_LIMIT / 2 - 2));
		}
}

// GameState_2Test.java
package state;

import java.util.*;
import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameState}.
* It contains ten unit test cases for the {@link GameState#addPlayer(Player)} method.
*/
class GameState_2Test {
		
		/**
		* Test case for {@link GameState#addPlayer(Player)} method.
		* This test case tests the method with a null value.
		*/
		@Test
		void testAddPlayer_1() {
				GameState gs = new GameState();
				gs.addPlayer(null);
				assertEquals(0, gs.getNumOfPlayers());
		}
		
		/**
		* Test case for {@link GameState#addPlayer(Player)} method.
		* This test case tests the method with a player with id equal to the maximum number of players.
		*/
		@Test
		void testAddPlayer_2() {
				GameState gs = new GameState();
				gs.addPlayer(new Player(GameState.MAX_PLAYER_LIMIT));
				assertEquals(0, gs.getNumOfPlayers());
		}
		
		/**
		* Test case for {@link GameState#addPlayer(Player)} method.
		* This test case tests the method with a player with id greater than the maximum number of players.
		*/
		@Test
		void testAddPlayer_3() {
				GameState gs = new GameState();
				gs.addPlayer(new Player(GameState.MAX_PLAYER_LIMIT + 1));
				assertEquals(0, gs.getNumOfPlayers());
		}
		
		/**
		* Test case for {@link GameState#addPlayer(Player)} method.
		* This test case tests the method with a player with id equal to the maximum number of players minus one.
		*/
		@Test
		void testAddPlayer_4() {
				GameState gs = new GameState();
				gs.addPlayer(new Player(GameState.MAX_PLAYER_LIMIT - 1));
				assertEquals(1, gs.getNumOfPlayers());
		}
		
		/**
		* Test case for {@link GameState#addPlayer(Player)} method.
		* This test case tests the method with a player with id equal to zero.
		*/
		@Test
		void testAddPlayer_5() {
				GameState gs = new GameState();
				gs.addPlayer(new Player(0));
				assertEquals(1, gs.getNumOfPlayers());
		}
		
		/**
		* Test case for {@link GameState#addPlayer(Player)} method.
		* This test case tests the method with a player with id equal to one.
		*/
		@Test
		void testAddPlayer_6() {
				GameState gs = new GameState();
				gs.addPlayer(new Player(1));
				assertEquals(1, gs.getNumOfPlayers());
		}
		
		/**
		* Test case for {@link GameState#addPlayer(Player)} method.
		* This test case tests the method with a player with id equal to the maximum number of players divided by two.
		*/
		@Test
		void testAddPlayer_