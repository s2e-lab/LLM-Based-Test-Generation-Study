// GameTest1.java
package lotus.core;

import lotus.core.card.Card;
import lotus.core.interfaces.UserInterface;
import lotus.core.phases.*;
import lotus.core.stack.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getNonPlayingPlayer()} method.
*/
class GameTest1 {

		/**
		* Test case 1 for {@link Game#getNonPlayingPlayer()}.
		* This test case checks if the method returns the correct player.
		*/
		@Test
		void testGetNonPlayingPlayer1() {
				Game.init(new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, "", "", new CardCollection(), new CardCollection());
				Game.playingPlayer = 1;
				assertEquals(Game.player2, Game.getNonPlayingPlayer());
		}
		
		/**
		* Test case 2 for {@link Game#getNonPlayingPlayer()}.
		* This test case checks if the method returns the correct player.
		*/
		@Test
		void testGetNonPlayingPlayer2() {
				Game.init(new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, "", "", new CardCollection(), new CardCollection());
				Game.playingPlayer = 2;
				assertEquals(Game.player1, Game.getNonPlayingPlayer());
		}
		
		/**
		* Test case 3 for {@link Game#getNonPlayingPlayer()}.
		* This test case checks if the method returns the correct player.
		*/
		@Test
		void testGetNonPlayingPlayer3() {
				Game.init(new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, "", "", new CardCollection(), new CardCollection());
				Game.playingPlayer = 1;
				assertNotEquals(Game.player1, Game.getNonPlayingPlayer());
		}
		
		/**
		* Test case 4 for {@link Game#getNonPlayingPlayer()}.
		* This test case checks if the method returns the correct player.
		*/
		@Test
		void testGetNonPlayingPlayer4() {
				Game.init(new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, "", "", new CardCollection(), new CardCollection());
				Game.playingPlayer = 2;
				assertNotEquals(Game.player2, Game.getNonPlayingPlayer());
		}
		
		/**
		* Test case 5 for {@link Game#getNonPlayingPlayer()}.
		* This test case checks if the method returns the correct player.
		*/
		@Test
		void testGetNonPlayingPlayer5() {
				Game.init(new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, "", "", new CardCollection(), new CardCollection());
				Game.playingPlayer = 1;
				assertNotEquals(Game.player2, Game.getNonPlayingPlayer());
		}
		
		/**
		* Test case 6 for {@link Game#getNonPlayingPlayer()}.
		* This test case checks if the method returns the correct player.
		*/
		@Test
		void testGetNonPlayingPlayer6() {
				Game.init(new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, "", "", new CardCollection(), new CardCollection());
				Game.playingPlayer = 2;
				assertNotEquals(Game.player1, Game.getNonPlayingPlayer());
		}
		
		/**
		* Test case 7 for {@link Game#getNonPlayingPlayer()}.
		* This test case checks if the method returns the correct player.
		*/
		@Test
		void testGetNonPlayingPlayer7() {
				Game.init(new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, new UserInterface() {
						@Override
						public void init(Player p) {
						}
						@Override
						public boolean letPlayerSpeak() {
								return false;
						}
				}, "", "", new CardCollection(), new CardCollection());
				Game.playingPlayer = 1;
				assertNot