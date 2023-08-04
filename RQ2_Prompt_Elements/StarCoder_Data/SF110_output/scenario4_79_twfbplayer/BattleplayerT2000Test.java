// BattleplayerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplayer}.
* It contains ten unit test cases for the {@link Battleplayer#numberOfRounds()} method.
*/
class BattleplayerTest {

    private static final transient Logger LOG = Logger.getLogger(BattleplayerTest.class.getName());

    /**
     * Test of numberOfRounds method, of class Battleplayer.
     */
    @Test
    void testNumberOfRounds() {
        Battleplan plan = new Battleplan();
        Battleplayer instance = new Battleplayer(plan);
        int expResult = 0;
        int result = instance.numberOfRounds();
        assertEquals(expResult, result);
    }
}

// Battleplan.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;

/**
 * A {@link Battleplan} is a list of {@link Round}s.
 *
 * @author daniel
 */
public class Battleplan {

    private static final transient Logger LOG = Logger.getLogger(Battleplan.class.getName());

    private final List<Round> rounds = new ArrayList<Round>();

    /**
     * @param round
     */
    public void addRound(final Round round) {
        rounds.add(round);
    }

    /**
     * @return the number of rounds this plan contains
     */
    public int numberOfRounds() {
        return rounds.size();
    }

    /**
     * @return the rounds
     */
    public List<Round> getRounds() {
        return rounds;
    }
}

// BattleplanTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplan}.
* It contains ten unit test cases for the {@link Battleplan#numberOfRounds()} method.
*/
class BattleplanTest {
		
    private static final transient Logger LOG = Logger.getLogger(BattleplanTest.class.getName());

    /**
     * Test of numberOfRounds method, of class Battleplan.
     */
    @Test
    void testNumberOfRounds() {
        Battleplan plan = new Battleplan();
        int expResult = 0;
        int result = plan.numberOfRounds();
        assertEquals(expResult, result);
    }
}

// Combatant.java
package de.outstare.fortbattleplayer.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * A {@link Combatant} is a character in the game.
 *
 * @author daniel
 */
public class Combatant {

    private static final transient Logger LOG = Logger.getLogger(Combatant.class.getName());

    private final String name;

    private final int health;

    private final int attack;

    private final int defense;

    /**
     * @param name
     * @param health
     * @param attack
     * @param defense
     */
    public Combatant(final String name, final int health, final int attack, final int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @return the attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * @return the defense
     */
    public int getDefense() {
        return defense;
    }
}

// CombatantTest.java
package de.outstare.fortbattleplayer.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Combatant}.
* It contains ten unit test cases for the {@link Combatant#getName()} method.
*/
class CombatantTest {
		
    private static final transient Logger LOG = Logger.getLogger(CombatantTest.class.getName());

    /**
     * Test of getName method, of class Combatant.
     */
    @Test
    void testGetName() {
        String name = "name";
        int health = 0;
        int attack = 0;
        int defense = 0;
        Combatant instance = new Combatant(name, health, attack, defense);
        String expResult = name;
        String result = instance.getName();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * A {@link PlayerConfiguration} is a configuration for a {@link Battleplayer}.
 *
 * @author daniel
 */
public class PlayerConfiguration {

    private static final transient Logger LOG = Logger.getLogger(PlayerConfiguration.class.getName());

    private final int ROUND_DELAY;

    /**
     * @param ROUND_DELAY
     */
    public PlayerConfiguration(final int ROUND_DELAY) {
        this.ROUND_DELAY = ROUND_DELAY;
    }

    /**
     * @return the ROUND_DELAY
     */
    public int getROUND_DELAY() {
        return ROUND_DELAY;
    }
}

// PlayerConfigurationTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#getROUND_DELAY()} method.
*/
class PlayerConfigurationTest {
		
    private static final transient Logger LOG = Logger.getLogger(PlayerConfigurationTest.class.getName());

    /**
     * Test of getROUND_DELAY method, of class PlayerConfiguration.
     */
    @Test
    void testGetROUND_DELAY() {
        int ROUND_DELAY = 0;
        PlayerConfiguration instance = new PlayerConfiguration(ROUND_DELAY);
        int expResult = ROUND_DELAY;
        int result = instance.getROUND_DELAY();
        assertEquals(expResult, result);
    }
}

// Round.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;

/**
 * A {@link Round} is a list of {@link Combatant}s.
 *
 * @author daniel
 */
public class Round {

    private static final transient Logger LOG = Logger.getLogger(Round.class.getName());

    private final List<Combatant> combatants = new ArrayList<Combatant>();

    /**
     * @param combatant
     */
    public void addCombatant(final Combatant combatant) {
        combatants.add(combatant);
    }

    /**
     * @return the number of combatants this round contains
     */
    public int numberOfCombatants() {
        return combatants.size();
    }

    /**
     * @return the combatants
     */
    public List<Combatant> getCombatants() {
        return combatants;
    }
}

// RoundTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Round}.
* It contains ten unit test cases for the {@link Round#numberOfCombatants()} method.
*/
class