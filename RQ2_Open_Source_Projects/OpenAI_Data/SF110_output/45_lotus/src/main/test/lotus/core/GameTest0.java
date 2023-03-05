// GameTest0.java
package lotus.core;

import lotus.core.card.Card;
import lotus.core.interfaces.UserInterface;
import lotus.core.phases.*;
import lotus.core.stack.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getPlayingPlayer()} method.
*/
class GameTest0 {

		/**
		* Test case for {@link Game#getPlayingPlayer()}.
		* It tests if the method returns the correct player.
		*/
		@Test
		void testGetPlayingPlayer() {
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
				assertEquals(Game.player1, Game.getPlayingPlayer());
		}
}

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
		* Test case for {@link Game#getNonPlayingPlayer()}.
		* It tests if the method returns the correct player.
		*/
		@Test
		void testGetNonPlayingPlayer() {
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
				assertEquals(Game.player2, Game.getNonPlayingPlayer());
		}
}

// GameTest2.java
package lotus.core;

import lotus.core.card.Card;
import lotus.core.interfaces.UserInterface;
import lotus.core.phases.*;
import lotus.core.stack.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#getOtherPlayer(Player)} method.
*/
class GameTest2 {
		
		/**
		* Test case for {@link Game#getOtherPlayer(Player)}.
		* It tests if the method returns the correct player.
		*/
		@Test
		void testGetOtherPlayer() {
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
				assertEquals(Game.player2, Game.getOtherPlayer(Game.player1));
		}
}

// GameTest3.java
package lotus.core;

import lotus.core.card.Card;
import lotus.core.interfaces.UserInterface;
import lotus.core.phases.*;
import lotus.core.stack.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#init(UserInterface, UserInterface, String, String, CardCollection, CardCollection)} method.
*/
class GameTest3 {
		
		/**
		* Test case for {@link Game#init(UserInterface, UserInterface, String, String, CardCollection, CardCollection)}.
		* It tests if the method initializes the game correctly.
		*/
		@Test
		void testInit() {
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
				assertEquals(Game.player1, Game.getPlayingPlayer());
		}
}

// GameTest4.java
package lotus.core;

import lotus.core.card.Card;
import lotus.core.interfaces.UserInterface;
import lotus.core.phases.*;
import lotus.core.stack.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#givePriorityToCurrentPlayer()} method.
*/
class GameTest4 {
		
		/**
		* Test case for {@link Game#givePriorityToCurrentPlayer()}.
		* It tests if the method gives the priority to the current player correctly.
		*/
		@Test
		void testGivePriorityToCurrentPlayer() {
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
				Game.givePriorityToCurrentPlayer();
				assertEquals(Game.player1, Game.getPlayingPlayer());
		}
}

// Player.java
package lotus.core;

import lotus.core.card.Card;
import lotus.core.card.CardCollection;
import lotus.core.interfaces.User