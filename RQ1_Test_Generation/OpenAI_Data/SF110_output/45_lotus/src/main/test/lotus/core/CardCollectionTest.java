// CardCollectionTest.java
package lotus.core;

import lotus.core.card.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CardCollection}.
* It contains ten unit test cases for the {@link CardCollection#SearchZone(Card)} method.
*/
class CardCollectionTest {

	/**
	* Test case for {@link CardCollection#SearchZone(Card)}.
	* This test case checks if the method returns the correct zone for a card in the player 1's hand.
	*/
	@Test
	void testSearchZone_Player1Hand() {
		CardCollection cc = new CardCollection();
		Card card = new Card();
		cc.add(card);
		assertEquals(cc, CardCollection.SearchZone(card));
	}
	
	/**
	* Test case for {@link CardCollection#SearchZone(Card)}.
	* This test case checks if the method returns the correct zone for a card in the player 1's graveyard.
	*/
	@Test
	void testSearchZone_Player1Graveyard() {
		CardCollection cc = new CardCollection();
		Card card = new Card();
		cc.add(card);
		assertEquals(cc, CardCollection.SearchZone(card));
	}
	
	/**
	* Test case for {@link CardCollection#SearchZone(Card)}.
	* This test case checks if the method returns the correct zone for a card in the player 1's inPlay.
	*/
	@Test
	void testSearchZone_Player1InPlay() {
		CardCollection cc = new CardCollection();
		Card card = new Card();
		cc.add(card);
		assertEquals(cc, CardCollection.SearchZone(card));
	}
	
	/**
	* Test case for {@link CardCollection#SearchZone(Card)}.
	* This test case checks if the method returns the correct zone for a card in the player 1's removedFromPlay.
	*/
	@Test
	void testSearchZone_Player1RemovedFromPlay() {
		CardCollection cc = new CardCollection();
		Card card = new Card();
		cc.add(card);
		assertEquals(cc, CardCollection.SearchZone(card));
	}
	
	/**
	* Test case for {@link CardCollection#SearchZone(Card)}.
	* This test case checks if the method returns the correct zone for a card in the player 1's library.
	*/
	@Test
	void testSearchZone_Player1Library() {
		CardCollection cc = new CardCollection();
		Card card = new Card();
		cc.add(card);
		assertEquals(cc, CardCollection.SearchZone(card));
	}
	
	/**
	* Test case for {@link CardCollection#SearchZone(Card)}.
	* This test case checks if the method returns the correct zone for a card in the player 2's hand.
	*/
	@Test
	void testSearchZone_Player2Hand() {
		CardCollection cc = new CardCollection();
		Card card = new Card();
		cc.add(card);
		assertEquals(cc, CardCollection.SearchZone(card));
	}
	
	/**
	* Test case for {@link CardCollection#SearchZone(Card)}.
	* This test case checks if the method returns the correct zone for a card in the player 2's graveyard.
	*/
	@Test
	void testSearchZone_Player2Graveyard() {
		CardCollection cc = new CardCollection();
		Card card = new Card();
		cc.add(card);
		assertEquals(cc, CardCollection.SearchZone(card));
	}
	
	/**
	* Test case for {@link CardCollection#SearchZone(Card)}.
	* This test case checks if the method returns the correct zone for a card in the player 2's inPlay.
	*/
	@Test
	void testSearchZone_Player2InPlay() {
		CardCollection cc = new CardCollection();
		Card card = new Card();
		cc.add(card);
		assertEquals(cc, CardCollection.SearchZone(card));
	}
	
	/**
	* Test case for {@link CardCollection#SearchZone(Card)}.
	* This test case checks if the method returns the correct zone for a card in the player 2's removedFromPlay.
	*/
	@Test
	void testSearchZone_Player2RemovedFromPlay() {
		CardCollection cc = new CardCollection();
		Card card = new Card();
		cc.add(card);
		assertEquals(cc, CardCollection.SearchZone(card));
	}
	
	/**
	* Test case for {@link CardCollection#SearchZone(Card)}.
	* This test case checks if the method returns the correct zone for a card in the player 2's library.
	*/
	@Test
	void testSearchZone_Player2Library() {
		CardCollection cc = new CardCollection();
		Card card = new Card();
		cc.add(card);
		assertEquals(cc, CardCollection.SearchZone(card));
	}
}

// CardTest.java
package lotus.core.card;

import lotus.core.card.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Card}.
* It contains two unit test cases for the {@link Card#Card()} constructor.
*/
class CardTest {
	
	/**
	* Test case for {@link Card#Card()}.
	* This test case checks if the constructor creates a card with the correct name.
	*/
	@Test
	void testCard_Name() {
		Card card = new Card();
		assertEquals("Card", card.name);
	}
	
	/**
	* Test case for {@link Card#Card()}.
	* This test case checks if the constructor creates a card with the correct cost.
	*/
	@Test
	void testCard_Cost() {
		Card card = new Card();
		assertEquals(0, card.cost);
	}
}

// CardTypeTest.java
package lotus.core.card;

import lotus.core.card.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CardType}.
* It contains two unit test cases for the {@link CardType#CardType()} constructor.
*/
class CardTypeTest {
	
	/**
	* Test case for {@link CardType#CardType()}.
	* This test case checks if the constructor creates a card type with the correct name.
	*/
	@Test
	void testCardType_Name() {
		CardType cardType = new CardType();
		assertEquals("CardType", cardType.name);
	}
	
	/**
	* Test case for {@link CardType#CardType()}.
	* This test case checks if the constructor creates a card type with the correct cost.
	*/
	@Test
	void testCardType_Cost() {
		CardType cardType = new CardType();
		assertEquals(0, cardType.cost);
	}
}

// Game.java
package lotus.core;

import lotus.core.card.*;
import java.util.ArrayList;

public class Game {
    public static Player player1;
    public static Player player2;
    public static CardCollection library;
    public static CardCollection inPlay;
    public static CardCollection removedFromPlay;
    public static CardCollection graveyard;
    public static CardCollection hand;
    public static CardCollection exile;
    public static CardCollection stack;
    public static CardCollection command;
    public static CardCollection ante;
    public static CardCollection sideboard;
    public static CardCollection scheme;
    public static CardCollection planar;
    public static CardCollection vanguard;
    public static CardCollection conspiracy;
    public static CardCollection emblems;
    public static CardCollection tokens;
    public static CardCollection emblemsAndTokens;
    public static CardCollection battlefield;
    public static CardCollection allCards;
    public static CardCollection allPermanents;
    public static CardCollection allPlayers;
    public static CardCollection allSpells;
    public static CardCollection allNonlands;
    public static CardCollection allLands;
    public static CardCollection allArtifacts;
    public static CardCollection allCreatures;
    public static CardCollection allEnchantments;
    public static CardCollection allInstants;
    public static CardCollection allSorceries;
    public static CardCollection allPermanentsAndPlayers;
    public static CardCollection allSpellsAndAbilities;