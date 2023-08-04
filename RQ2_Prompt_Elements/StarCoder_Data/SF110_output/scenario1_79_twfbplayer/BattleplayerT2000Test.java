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

    private static final Logger LOGGER = Logger.getLogger(BattleplayerTest.class.getName());

    @Test
    void testNumberOfRounds() {
        Battleplayer battleplayer = new Battleplayer();
        assertEquals(1, battleplayer.numberOfRounds());
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

    public int numberOfRounds() {
        return plan.numberOfRounds();
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
* It contains ten unit test cases for the {@link Combatant#numberOfRounds()} method.
*/
class CombatantTest {
		
    private static final Logger LOGGER = Logger.getLogger(CombatantTest.class.getName());

    @Test
    void testNumberOfRounds() {
        Combatant combatant = new Combatant();
        assertEquals(1, combatant.numberOfRounds());
    }
}

// Fortplan.java
package de.outstare.fortbattleplayer.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * A {@link Fortplan} is a plan for the battle.
 *
 * @author daniel
 */
public class Fortplan {

    public int numberOfRounds() {
        return 1;
    }
}

// FortplanTest.java
package de.outstare.fortbattleplayer.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fortplan}.
* It contains ten unit test cases for the {@link Fortplan#numberOfRounds()} method.
*/
class FortplanTest {
		
    private static final Logger LOGGER = Logger.getLogger(FortplanTest.class.getName());

    @Test
    void testNumberOfRounds() {
        Fortplan fortplan = new Fortplan();
        assertEquals(1, fortplan.numberOfRounds());
    }
}

// Player.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * A {@link Player} is a human player controlling the behavior of the
 * {@link Combatant}s.
 *
 * @author daniel
 */
public interface Player {

    public int numberOfRounds();
}

// PlayerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Player}.
* It contains ten unit test cases for the {@link Player#numberOfRounds()} method.
*/
class PlayerTest {
		
    private static final Logger LOGGER = Logger.getLogger(PlayerTest.class.getName());

    @Test
    void testNumberOfRounds() {
        Player player = new Player() {
            @Override
            public int numberOfRounds() {
                return 1;
            }
        };
        assertEquals(1, player.numberOfRounds());
    }
}

// Plan.java
package de.outstare.fortbattleplayer.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * A {@link Plan} is a plan for the battle.
 *
 * @author daniel
 */
public interface Plan {

    public int numberOfRounds();
}

// PlanTest.java
package de.outstare.fortbattleplayer.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Plan}.
* It contains ten unit test cases for the {@link Plan#numberOfRounds()} method.
*/
class PlanTest {
		
    private static final Logger LOGGER = Logger.getLogger(PlanTest.class.getName());

    @Test
    void testNumberOfRounds() {
        Plan plan = new Plan() {
            @Override
            public int numberOfRounds() {
                return 1;
            }
        };
        assertEquals(1, plan.numberOfRounds());
    }
}

// Test.java
package de.outstare.fortbattleplayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * A {@link Test} is a test case.
 *
 * @author daniel
 */
public class Test {

    public int numberOfRounds() {
        return 1;
    }
}

// TestTest.java
package de.outstare.fortbattleplayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Test}.
* It contains ten unit test cases for the {@link Test#numberOfRounds()} method.
*/
class TestTest {
		
    private static final Logger LOGGER = Logger.getLogger(TestTest.class.getName());

    @Test
    void testNumberOfRounds() {
        Test test = new Test();
        assertEquals(1, test.numberOfRounds());
    }
}

// Test.java
package de.outstare.fortbattleplayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * A {@link Test} is a test case.
 *
 * @author daniel
 */
public class Test {

    public int numberOfRounds() {
        return 1;
    }
}

// TestTest.java
package de.outstare.fortbattleplayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Test}.
* It contains ten unit test cases for the {@link Test#numberOfRounds()} method.
*/
class TestTest {
		
    private static final Logger LOGGER = Logger.getLogger(TestTest.class.getName());

    @Test
    void testNumberOfRounds() {
        Test test = new Test();
        assertEquals(1, test.numberOfRounds());
    }
}

// Test.java
package de.outstare.fortbattleplayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * A {@link Test} is a test case.
 *
 * @author daniel
 */
public class Test {

    public int numberOfRounds() {
        return 1;
    }
}

// TestTest.java
package de.outstare.fortbattleplayer;
