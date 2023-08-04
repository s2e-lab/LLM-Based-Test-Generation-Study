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

    /**
     * Test of {@link Battleplayer#numberOfRounds()} method, of class Battleplayer.
     */
    @Test
    void testNumberOfRounds() {
        Battleplayer instance = new Battleplayer();
        int expResult = 1;
        int result = instance.numberOfRounds();
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

    /**
     * @return the name of this {@link Combatant}
     */
    public String name() {
        return name;
    }

    /**
     * @return the number of hit points of this {@link Combatant}
     */
    public int hitPoints() {
        return hitPoints;
    }

    /**
     * @return the number of attack points of this {@link Combatant}
     */
    public int attackPoints() {
        return attackPoints;
    }

    /**
     * @return the number of defense points of this {@link Combatant}
     */
    public int defensePoints() {
        return defensePoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int magicPoints() {
        return magicPoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int magicDefensePoints() {
        return magicDefensePoints;
    }

    /**
     * @return the number of speed points of this {@link Combatant}
     */
    public int speedPoints() {
        return speedPoints;
    }

    /**
     * @return the number of luck points of this {@link Combatant}
     */
    public int luckPoints() {
        return luckPoints;
    }

    /**
     * @return the number of hit points of this {@link Combatant}
     */
    public int maxHitPoints() {
        return maxHitPoints;
    }

    /**
     * @return the number of attack points of this {@link Combatant}
     */
    public int maxAttackPoints() {
        return maxAttackPoints;
    }

    /**
     * @return the number of defense points of this {@link Combatant}
     */
    public int maxDefensePoints() {
        return maxDefensePoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int maxMagicPoints() {
        return maxMagicPoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int maxMagicDefensePoints() {
        return maxMagicDefensePoints;
    }

    /**
     * @return the number of speed points of this {@link Combatant}
     */
    public int maxSpeedPoints() {
        return maxSpeedPoints;
    }

    /**
     * @return the number of luck points of this {@link Combatant}
     */
    public int maxLuckPoints() {
        return maxLuckPoints;
    }

    /**
     * @return the number of hit points of this {@link Combatant}
     */
    public int currentHitPoints() {
        return currentHitPoints;
    }

    /**
     * @return the number of attack points of this {@link Combatant}
     */
    public int currentAttackPoints() {
        return currentAttackPoints;
    }

    /**
     * @return the number of defense points of this {@link Combatant}
     */
    public int currentDefensePoints() {
        return currentDefensePoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int currentMagicPoints() {
        return currentMagicPoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int currentMagicDefensePoints() {
        return currentMagicDefensePoints;
    }

    /**
     * @return the number of speed points of this {@link Combatant}
     */
    public int currentSpeedPoints() {
        return currentSpeedPoints;
    }

    /**
     * @return the number of luck points of this {@link Combatant}
     */
    public int currentLuckPoints() {
        return currentLuckPoints;
    }

    /**
     * @return the number of hit points of this {@link Combatant}
     */
    public int currentMaxHitPoints() {
        return currentMaxHitPoints;
    }

    /**
     * @return the number of attack points of this {@link Combatant}
     */
    public int currentMaxAttackPoints() {
        return currentMaxAttackPoints;
    }

    /**
     * @return the number of defense points of this {@link Combatant}
     */
    public int currentMaxDefensePoints() {
        return currentMaxDefensePoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int currentMaxMagicPoints() {
        return currentMaxMagicPoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int currentMaxMagicDefensePoints() {
        return currentMaxMagicDefensePoints;
    }

    /**
     * @return the number of speed points of this {@link Combatant}
     */
    public int currentMaxSpeedPoints() {
        return currentMaxSpeedPoints;
    }

    /**
     * @return the number of luck points of this {@link Combatant}
     */
    public int currentMaxLuckPoints() {
        return currentMaxLuckPoints;
    }

    /**
     * @return the number of hit points of this {@link Combatant}
     */
    public int currentRegenerationHitPoints() {
        return currentRegenerationHitPoints;
    }

    /**
     * @return the number of attack points of this {@link Combatant}
     */
    public int currentRegenerationAttackPoints() {
        return currentRegenerationAttackPoints;
    }

    /**
     * @return the number of defense points of this {@link Combatant}
     */
    public int currentRegenerationDefensePoints() {
        return currentRegenerationDefensePoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int currentRegenerationMagicPoints() {
        return currentRegenerationMagicPoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int currentRegenerationMagicDefensePoints() {
        return currentRegenerationMagicDefensePoints;
    }

    /**
     * @return the number of speed points of this {@link Combatant}
     */
    public int currentRegenerationSpeedPoints() {
        return currentRegenerationSpeedPoints;
    }

    /**
     * @return the number of luck points of this {@link Combatant}
     */
    public int currentRegenerationLuckPoints() {
        return currentRegenerationLuckPoints;
    }

    /**
     * @return the number of hit points of this {@link Combatant}
     */
    public int currentRegenerationMaxHitPoints() {
        return currentRegenerationMaxHitPoints;
    }

    /**
     * @return the number of attack points of this {@link Combatant}
     */
    public int currentRegenerationMaxAttackPoints() {
        return currentRegenerationMaxAttackPoints;
    }

    /**
     * @return the number of defense points of this {@link Combatant}
     */
    public int currentRegenerationMaxDefensePoints() {
        return currentRegenerationMaxDefensePoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int currentRegenerationMaxMagicPoints() {
        return currentRegenerationMaxMagicPoints;
    }

    /**
     * @return the number of magic points of this {@link Combatant}
     */
    public int currentRegenerationMaxMagicDefensePoints() {
        return currentRegenerationMaxMagicDefensePoints;
    }

    /**
     * @return the number of speed points of this {@link Combatant}
     */
    public int currentRegenerationMaxSpeedPoints() {
        return currentRegenerationMaxSpeedPoints;
    }

    /**
     * @return the number of luck points of this {@link Combatant}
     */
    public int currentRegenerationMaxLuckPoints() {
        return currentRegenerationMaxLuckPoints;
    }

    /**
     * @return the number of hit points of this {@link Combatant}
     */
    public int currentRegenerationCurrentHitPoints() {
        return currentRegenerationCurrentHitPoints;
    }

    /**
     * @return the number of attack points of this {@link Combatant}
     */
    public int currentRegenerationCurrentAttackPoints() {
        return currentRegenerationCurrentAttackPoints;
    }

    /**
     * @return the number of defense points of this {@link Combatant}
     */
    public int currentRegenerationCurrentDefensePoints()