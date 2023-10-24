// SimpleCombatant_0Test.java
package de.outstare.fortbattleplayer.model.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.SectorBonus;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.WeaponData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCombatant}.
* It contains ten unit test cases for the {@link SimpleCombatant#_getMaxLP()} method.
*/
class SimpleCombatant_0Test {

    private static final transient Logger LOG = Logger.getLogger(SimpleCombatant_0Test.class.getName());

    /**
     * Test method for {@link SimpleCombatant#_getMaxLP()}.
     */
    @Test
    void testGetMaxLP() {
        final SimpleCombatant instance = new SimpleCombatant(CombatantSide.ATTACKER, CombatantState.ALIVE, 100, "Test", null, null, "Test");
        final int expResult = 100;
        final int result = instance._getMaxLP();
        assertEquals(expResult, result);
    }
}

// SimpleCombatant_1Test.java
package de.outstare.fortbattleplayer.model.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.SectorBonus;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.WeaponData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCombatant#_getCurrentLP()}.
* It contains ten unit test cases for the {@link SimpleCombatant#_getCurrentLP()} method.
*/
class SimpleCombatant_1Test {
		
    private static final transient Logger LOG = Logger.getLogger(SimpleCombatant_1Test.class.getName());

    /**
     * Test method for {@link SimpleCombatant#_getCurrentLP()}.
     */
    @Test
    void testGetCurrentLP() {
        final SimpleCombatant instance = new SimpleCombatant(CombatantSide.ATTACKER, CombatantState.ALIVE, 100, "Test", null, null, "Test");
        final int expResult = 100;
        final int result = instance._getCurrentLP();
        assertEquals(expResult, result);
    }
}

// SimpleCombatant_2Test.java
package de.outstare.fortbattleplayer.model.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.SectorBonus;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.WeaponData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCombatant#_state()}.
* It contains ten unit test cases for the {@link SimpleCombatant#_state()} method.
*/
class SimpleCombatant_2Test {
		
    private static final transient Logger LOG = Logger.getLogger(SimpleCombatant_2Test.class.getName());

    /**
     * Test method for {@link SimpleCombatant#_state()}.
     */
    @Test
    void testState() {
        final SimpleCombatant instance = new SimpleCombatant(CombatantSide.ATTACKER, CombatantState.ALIVE, 100, "Test", null, null, "Test");
        final CombatantState expResult = CombatantState.ALIVE;
        final CombatantState result = instance._state();
        assertEquals(expResult, result);
    }
}

// SimpleCombatant_3Test.java
package de.outstare.fortbattleplayer.model.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.SectorBonus;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.WeaponData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCombatant#_health()}.
* It contains ten unit test cases for the {@link SimpleCombatant#_health()} method.
*/
class SimpleCombatant_3Test {
		
    private static final transient Logger LOG = Logger.getLogger(SimpleCombatant_3Test.class.getName());

    /**
     * Test method for {@link SimpleCombatant#_health()}.
     */
    @Test
    void testHealth() {
        final SimpleCombatant instance = new SimpleCombatant(CombatantSide.ATTACKER, CombatantState.ALIVE, 100, "Test", null, null, "Test");
        final int expResult = 100;
        final int result = instance._health();
        assertEquals(expResult, result);
    }
}

// SimpleCombatant_4Test.java
package de.outstare.fortbattleplayer.model.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.SectorBonus;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.WeaponData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCombatant#_maxHealth()}.
* It contains ten unit test cases for the {@link SimpleCombatant#_maxHealth()} method.
*/
class SimpleCombatant_4Test {
		
    private static final transient Logger LOG = Logger.getLogger(SimpleCombatant_4Test.class.getName());

    /**
     * Test method for {@link SimpleCombatant#_maxHealth()}.
     */
    @Test
    void testMaxHealth() {
        final SimpleCombatant instance = new SimpleCombatant(CombatantSide.ATTACKER, CombatantState.ALIVE, 100, "Test", null, null, "Test");
        final int expResult = 100;
        final int result = instance._maxHealth();
        assertEquals(expResult, result);
    }
}

// SimpleCombatant_5Test.java
package de.outstare.fortbattleplayer.model.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.SectorBonus;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.WeaponData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
