// ManaCostTest.java
package lotus.core.cost;

import lotus.core.Mana;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ManaCost}.
* It contains ten unit test cases for the {@link ManaCost#isPayable()} method.
*/
class ManaCostTest {

	@Test
	void testIsPayable() {
		//TODO
	}
}

// Player.java
package lotus.core;

import lotus.core.cost.Cost;
import lotus.core.cost.ManaCost;
import lotus.core.mana.ManaPool;

/*
 * A player is a type of entity that can play cards and pay costs
 */
public class Player extends Entity {

    public ManaPool manaPool;

    public Player(String name) {
        super(name);
        manaPool = new ManaPool();
    }

    public boolean canPay(Cost cost) {
        if (cost instanceof ManaCost) {
            return manaPool.canPay(((ManaCost) cost).manaCost);
        }
        return false;
    }

    public void pay(Cost cost) {
        if (cost instanceof ManaCost) {
            manaPool.pay(((ManaCost) cost).manaCost);
        }
    }
}

// PlayerTest.java
package lotus.core;

import lotus.core.cost.Cost;
import lotus.core.cost.ManaCost;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Player}.
* It contains ten unit test cases for the {@link Player#canPay(Cost)} and {@link Player#pay(Cost)} methods.
*/
class PlayerTest {
		
	@Test
	void testCanPay() {
		//TODO
	}
	
	@Test
	void testPay() {
		//TODO
	}
}

// Card.java
package lotus.core;

import lotus.core.cost.Cost;
import lotus.core.cost.ManaCost;

/*
 * A card is a type of entity that can be played
 */
public class Card extends Entity {

    public Cost cost;

    public Card(String name, Cost cost) {
        super(name);
        this.cost = cost;
    }

    public boolean canBePlayed(Player player) {
        return cost.isPayable(player);
    }

    public void play(Player player) {
        cost.payCost(player);
    }
}

// CardTest.java
package lotus.core;

import lotus.core.cost.Cost;
import lotus.core.cost.ManaCost;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Card}.
* It contains ten unit test cases for the {@link Card#canBePlayed(Player)} and {@link Card#play(Player)} methods.
*/
class CardTest {
		
	@Test
	void testCanBePlayed() {
		//TODO
	}
	
	@Test
	void testPlay() {
		//TODO
	}
}

// Game.java
package lotus.core;

import lotus.core.cost.Cost;
import lotus.core.cost.ManaCost;

/*
 * A game is a type of entity that can be played
 */
public class Game extends Entity {

    public Player player1;
    public Player player2;

    public Game(String name, Player player1, Player player2) {
        super(name);
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        //TODO
    }
}

// GameTest.java
package lotus.core;

import lotus.core.cost.Cost;
import lotus.core.cost.ManaCost;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains ten unit test cases for the {@link Game#play()} method.
*/
class GameTest {
		
	@Test
	void testPlay() {
		//TODO
	}
}

// Main.java
package lotus.core;

import lotus.core.cost.Cost;
import lotus.core.cost.ManaCost;

public class Main {

    public static void main(String[] args) {
        //TODO
    }
}