// GameState_3Test.java
package state;

import java.util.*;
import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameState}.
* It contains ten unit test cases for the {@link GameState#pack()} method.
*/
class GameState_3Test {

		/**
		* Test case for {@link GameState#pack()} method.
		* It tests the case when the game state is waiting for players to join.
		*/
		@Test
		void testPack_1() {
				GameState gs = new GameState();
				gs.setGameState(GameState.STATE_WAITING);
				byte[] b = gs.pack();
				assertEquals(b[0], 0x3B);
				assertEquals(b[1], 0xBA);
				assertEquals(b[2], GameState.STATE_WAITING);
				assertEquals(b[3], 0);
		}
		
		/**
		* Test case for {@link GameState#pack()} method.
		* It tests the case when the game state is in warmup.
		*/
		@Test
		void testPack_2() {
				GameState gs = new GameState();
				gs.setGameState(GameState.STATE_WARMUP);
				byte[] b = gs.pack();
				assertEquals(b[0], 0x3B);
				assertEquals(b[1], 0xBA);
				assertEquals(b[2], GameState.STATE_WARMUP);
				assertEquals(b[3], 0);
		}
		
		/**
		* Test case for {@link GameState#pack()} method.
		* It tests the case when the game state is playing.
		*/
		@Test
		void testPack_3() {
				GameState gs = new GameState();
				gs.setGameState(GameState.STATE_PLAYING);
				byte[] b = gs.pack();
				assertEquals(b[0], 0x3B);
				assertEquals(b[1], 0xBA);
				assertEquals(b[2], GameState.STATE_PLAYING);
				assertEquals(b[3], 0);
		}
		
		/**
		* Test case for {@link GameState#pack()} method.
		* It tests the case when the game state is ended.
		*/
		@Test
		void testPack_4() {
				GameState gs = new GameState();
				gs.setGameState(GameState.STATE_ENDED);
				byte[] b = gs.pack();
				assertEquals(b[0], 0x3B);
				assertEquals(b[1], 0xBA);
				assertEquals(b[2], GameState.STATE_ENDED);
				assertEquals(b[3], 0);
		}
		
		/**
		* Test case for {@link GameState#pack()} method.
		* It tests the case when the game state is waiting for players to join and there is one player.
		*/
		@Test
		void testPack_5() {
				GameState gs = new GameState();
				gs.setGameState(GameState.STATE_WAITING);
				Player p = new Player(0);
				gs.addPlayer(p);
				byte[] b = gs.pack();
				assertEquals(b[0], 0x3B);
				assertEquals(b[1], 0xBA);
				assertEquals(b[2], GameState.STATE_WAITING);
				assertEquals(b[3], 1);
				assertEquals(b[4], 0x3B);
				assertEquals(b[5], 0xBA);
				assertEquals(b[6], 0);
				assertEquals(b[7], 0);
				assertEquals(b[8], 0);
				assertEquals(b[9], 0);
				assertEquals(b[10], 0);
				assertEquals(b[11], 0);
				assertEquals(b[12], 0);
				assertEquals(b[13], 0);
				assertEquals(b[14], 0);
				assertEquals(b[15], 0);
				assertEquals(b[16], 0);
				assertEquals(b[17], 0);
				assertEquals(b[18], 0);
				assertEquals(b[19], 0);
				assertEquals(b[20], 0);
				assertEquals(b[21], 0);
				assertEquals(b[22], 0);
				assertEquals(b[23], 0);
				assertEquals(b[24], 0);
				assertEquals(b[25], 0);
				assertEquals(b[26], 0);
				assertEquals(b[27], 0);
				assertEquals(b[28], 0);
				assertEquals(b[29], 0);
				assertEquals(b[30], 0);
				assertEquals(b[31], 0);
				assertEquals(b[32], 0);
				assertEquals(b[33], 0);
				assertEquals(b[34], 0);
				assertEquals(b[35], 0);
				assertEquals(b[36], 0);
				assertEquals(b[37], 0);
				assertEquals(b[38], 0);
				assertEquals(b[39], 0);
				assertEquals(b[40], 0);
				assertEquals(b[41], 0);
				assertEquals(b[42], 0);
				assertEquals(b[43], 0);
				assertEquals(b[44], 0);
				assertEquals(b[45], 0);
				assertEquals(b[46], 0);
				assertEquals(b[47], 0);
				assertEquals(b[48], 0);
				assertEquals(b[49], 0);
				assertEquals(b[50], 0);
				assertEquals(b[51], 0);
				assertEquals(b[52], 0);
				assertEquals(b[53], 0);
				assertEquals(b[54], 0);
				assertEquals(b[55], 0);
				assertEquals(b[56], 0);
				assertEquals(b[57], 0);
				assertEquals(b[58], 0);
				assertEquals(b[59], 0);
				assertEquals(b[60], 0);
				assertEquals(b[61], 0);
				assertEquals(b[62], 0);
				assertEquals(b[63], 0);
				assertEquals(b[64], 0);
				assertEquals(b[65], 0);
				assertEquals(b[66], 0);
				assertEquals(b[67], 0);
				assertEquals(b[68], 0);
				assertEquals(b[69], 0);
				assertEquals(b[70], 0);
				assertEquals(b[71], 0);
				assertEquals(b[72], 0);
				assertEquals(b[73], 0);
		