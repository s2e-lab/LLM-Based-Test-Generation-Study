// CurrentPlayersTest1.java
package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CurrentPlayers}.
* It contains ten unit test cases for the {@link CurrentPlayers#getKing()} method.
*/
class CurrentPlayersTest1 {

		/**
		* Test case for {@link CurrentPlayers#getKing()} method.
		* It tests if the method returns the correct king.
		*/
		@Test
		void testGetKing() {
				Knight king = CurrentPlayers.getKing();
				assertEquals("King Arthur", king.getName());
		}
}

// CurrentPlayersTest2.java
package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CurrentPlayers}.
* It contains ten unit test cases for the {@link CurrentPlayers#whosThere(String)} method.
*/
class CurrentPlayersTest2 {
		
		/**
		* Test case for {@link CurrentPlayers#whosThere(String)} method.
		* It tests if the method returns the correct players in a fief.
		*/
		@Test
		void testWhosThere() {
				ArrayList<String> players = CurrentPlayers.whosThere("Camelot");
				assertEquals("King Arthur", players.get(0));
				assertEquals("Sir Lancelot", players.get(1));
				assertEquals("Sir Gawain", players.get(2));
				assertEquals("Sir Percival", players.get(3));
				assertEquals("Sir Galahad", players.get(4));
				assertEquals("Sir Bedivere", players.get(5));
		}
}

// CurrentPlayersTest3.java
package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CurrentPlayers}.
* It contains ten unit test cases for the {@link CurrentPlayers#sides(String)} method.
*/
class CurrentPlayersTest3 {
		
		/**
		* Test case for {@link CurrentPlayers#sides(String)} method.
		* It tests if the method returns the correct players in a fief.
		*/
		@Test
		void testSides() {
				ArrayList<ArrayList<String>> sides = CurrentPlayers.sides("Camelot");
				assertEquals("King Arthur", sides.get(0).get(0));
				assertEquals("Sir Lancelot", sides.get(0).get(1));
				assertEquals("Sir Gawain", sides.get(0).get(2));
				assertEquals("Sir Percival", sides.get(0).get(3));
				assertEquals("Sir Galahad", sides.get(0).get(4));
				assertEquals("Sir Bedivere", sides.get(0).get(5));
		}
}</code>



I have tried to use the @BeforeAll and @AfterAll annotations but it doesn't seem to work.
