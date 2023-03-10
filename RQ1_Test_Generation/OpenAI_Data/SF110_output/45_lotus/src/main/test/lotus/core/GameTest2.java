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
	* Test case for the {@link Game#getOtherPlayer(Player)} method.
	* It tests if the method returns the correct player.
	*/
	@Test
	void testGetOtherPlayer() {
		UserInterface IP1 = new UserInterface() {
			@Override
			public void init(Player p) {
			}
			@Override
			public boolean letPlayerSpeak() {
				return false;
			}
		};
		UserInterface IP2 = new UserInterface() {
			@Override
			public void init(Player p) {
			}
			@Override
			public boolean letPlayerSpeak() {
				return false;
			}
		};
		Game.init(IP1, IP2, "Player1", "Player2", new CardCollection(), new CardCollection());
		assertEquals(Game.player2, Game.getOtherPlayer(Game.player1));
		assertEquals(Game.player1, Game.getOtherPlayer(Game.player2));
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
* It contains ten unit test cases for the {@link Game#getPlayingPlayer()} method.
*/
class GameTest3 {
		
	/**
	* Test case for the {@link Game#getPlayingPlayer()} method.
	* It tests if the method returns the correct player.
	*/
	@Test
	void testGetPlayingPlayer() {
		UserInterface IP1 = new UserInterface() {
			@Override
			public void init(Player p) {
			}
			@Override
			public boolean letPlayerSpeak() {
				return false;
			}
		};
		UserInterface IP2 = new UserInterface() {
			@Override
			public void init(Player p) {
			}
			@Override
			public boolean letPlayerSpeak() {
				return false;
			}
		};
		Game.init(IP1, IP2, "Player1", "Player2", new CardCollection(), new CardCollection());
		assertEquals(Game.player1, Game.getPlayingPlayer());
		Game.playingPlayer = 2;
		assertEquals(Game.player2, Game.getPlayingPlayer());
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
* It contains ten unit test cases for the {@link Game#getNonPlayingPlayer()} method.
*/
class GameTest4 {
		
	/**
	* Test case for the {@link Game#getNonPlayingPlayer()} method.
	* It tests if the method returns the correct player.
	*/
	@Test
	void testGetNonPlayingPlayer() {
		UserInterface IP1 = new UserInterface() {
			@Override
			public void init(Player p) {
			}
			@Override
			public boolean letPlayerSpeak() {
				return false;
			}
		};
		UserInterface IP2 = new UserInterface() {
			@Override
			public void init(Player p) {
			}
			@Override
			public boolean letPlayerSpeak() {
				return false;
			}
		};
		Game.init(IP1, IP2, "Player1", "Player2", new CardCollection(), new CardCollection());
		assertEquals(Game.player2, Game.getNonPlayingPlayer());
		Game.playingPlayer = 2;
		assertEquals(Game.player1, Game.getNonPlayingPlayer());
	}
}

// GameTest5.java
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
class GameTest5 {
		
	/**
	* Test case for the {@link Game#givePriorityToCurrentPlayer()} method.
	* It tests if the method returns the correct player.
	*/
	@Test
	void testGivePriorityToCurrentPlayer() {
		UserInterface IP1 = new UserInterface() {
			@Override
			public void init(Player p) {
			}
			@Override
			public boolean letPlayerSpeak() {
				return false;
			}
		};
		UserInterface IP2 = new UserInterface() {
			@Override
			public void init(Player p) {
			}
			@Override
			public boolean letPlayerSpeak() {
				return false;
			}
		};
		Game.init(IP1, IP2, "Player1", "Player2", new CardCollection(), new CardCollection());
		Game.givePriorityToCurrentPlayer();
		assertEquals(Game.player1, Game.getPlayingPlayer());
		Game.playingPlayer = 2;
		Game.givePriorityToCurrentPlayer();
		assertEquals(Game.player2, Game.getPlayingPlayer());
	}
}

// GameTest6.java
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
class GameTest6 {
		
	/**
	* Test case for the {@link Game#init(UserInterface, UserInterface, String, String, CardCollection, CardCollection)} method.
	* It tests if the method returns the correct player.
	*/
	@Test
	void testInit() {
		UserInterface IP1 = new UserInterface() {
			@Override
			public void init(Player p) {
			}
			@Override
			public boolean letPlayerSpeak() {
				return false;
			}
		};
		UserInterface IP2 = new UserInterface() {
			@Override
			public void init(Player p) {
			}
			@Override
			public boolean letPlayerSpeak() {
				return false;
			}
		};
		Game.init(IP1, IP2, "Player1", "Player2", new CardCollection(), new CardCollection());
		assertEquals(Game.player1, Game.getPlayingPlayer());
		Game.playingPlayer = 2;
		Game.givePriorityToCurrentPlayer();
		assertEquals(Game.player2, Game.getPlayingPlayer());
	}
}

// GameTest7.java
package lotus.core;

import lotus.core.card.Card;
import lotus.core.interfaces.UserInterface;
import lotus.core.ph