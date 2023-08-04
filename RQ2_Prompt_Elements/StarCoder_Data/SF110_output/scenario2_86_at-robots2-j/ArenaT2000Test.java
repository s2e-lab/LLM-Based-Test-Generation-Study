// ArenaTest.java
package net.virtualinfinity.atrobots.arena;

import net.virtualinfinity.atrobots.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.arenaobjects.ArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.CollidableArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.DamageInflicter;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.radio.RadioDispatcher;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Arena}.
* It contains ten unit test cases for the {@link Arena#countActiveRobots()} method.
*/
class ArenaTest {

    /**
    * Test case for {@link Arena#countActiveRobots()} method.
    * It tests the method with an empty arena.
    */
    @Test
    void testCountActiveRobotsEmptyArena() {
        final Arena arena = new Arena();
        assertEquals(0, arena.countActiveRobots());
    }

    /**
    * Test case for {@link Arena#countActiveRobots()} method.
    * It tests the method with an arena with one robot.
    */
    @Test
    void testCountActiveRobotsOneRobot() {
        final Arena arena = new Arena();
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        assertEquals(1, arena.countActiveRobots());
    }

    /**
    * Test case for {@link Arena#countActiveRobots()} method.
    * It tests the method with an arena with two robots.
    */
    @Test
    void testCountActiveRobotsTwoRobots() {
        final Arena arena = new Arena();
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        assertEquals(2, arena.countActiveRobots());
    }

    /**
    * Test case for {@link Arena#countActiveRobots()} method.
    * It tests the method with an arena with two robots, one of which is destroyed.
    */
    @Test
    void testCountActiveRobotsTwoRobotsOneDestroyed() {
        final Arena arena = new Arena();
        final ArenaObject robot = new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        };
        arena.addRobot(robot);
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        robot.destroy();
        assertEquals(1, arena.countActiveRobots());
    }

    /**
    * Test case for {@link Arena#countActiveRobots()} method.
    * It tests the method with an arena with two robots, one of which is destroyed.
    */
    @Test
    void testCountActiveRobotsTwoRobotsOneDestroyedAndOneDestroyed() {
        final Arena arena = new Arena();
        final ArenaObject robot = new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        };
        arena.addRobot(robot);
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        robot.destroy();
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        assertEquals(1, arena.countActiveRobots());
    }
}

// Arena.java
package net.virtualinfinity.atrobots.arena;

import net.virtualinfinity.atrobots.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.arenaobjects.ArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.CollidableArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.DamageInflicter;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.radio.RadioDispatcher;
import java.util.*;

/**
 * The Arena is the virtual world within which the simulation occurs.
 *
 * @author <NAME>
 */
public class Arena {

    /**
     * Get the number of robots still active in the arena.
     *
     * @return the number of robots still active in the arena.
     */
    public int countActiveRobots() {
        return activeRobots.size();
    }
}

// ArenaTest.java
package net.virtualinfinity.atrobots.arena;

import net.virtualinfinity.atrobots.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.arenaobjects.ArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.CollidableArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.DamageInflicter;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.radio.RadioDispatcher;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Arena}.
* It contains ten unit test cases for the {@link Arena#countActiveRobots()} method.
*/
class ArenaTest {
		
    /**
    * Test case for {@link Arena#countActiveRobots()} method.
    * It tests the method with an empty arena.
    */
    @Test
    void testCountActiveRobotsEmptyArena() {
        final Arena arena = new Arena();
        assertEquals(0, arena.countActiveRobots());
    }

    /**
    * Test case for {@link Arena#countActiveRobots()} method.
    * It tests the method with an arena with one robot.
    */
    @Test
    void testCountActiveRobotsOneRobot() {
        final Arena arena = new Arena();
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        assertEquals(1, arena.countActiveRobots());
    }

    /**
    * Test case for {@link Arena#countActiveRobots()} method.
    * It tests the method with an arena with two robots.
    */
    @Test
    void testCountActiveRobotsTwoRobots() {
        final Arena arena = new Arena();
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        assertEquals(2, arena.countActiveRobots());
    }

    /**
    * Test case for {@link Arena#countActiveRobots()} method.
    * It tests the method with an arena with two robots, one of which is destroyed.
    */
    @Test
    void testCountActiveRobotsTwoRobotsOneDestroyed() {
        final Arena arena = new Arena();
        final ArenaObject robot = new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        };
        arena.addRobot(robot);
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        robot.destroy();
        assertEquals(1, arena.countActiveRobots());
    }

    /**
    * Test case for {@link Arena#countActiveRobots()} method.
    * It tests the method with an arena with two robots, one of which is destroyed.
    */
    @Test
    void testCountActiveRobotsTwoRobotsOneDestroyedAndOneDestroyed() {
        final Arena arena = new Arena();
        final ArenaObject robot = new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        };
        arena.addRobot(robot);
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        robot.destroy();
        arena.addRobot(new ArenaObject() {
            @Override
            public void acceptVisitor(ArenaObjectVisitor visitor) {
            }
        });
        assertEquals(1, arena.countActiveRobots());
    }
}

// Arena.java
package net.virtualinfinity.atrobots.arena;

import net.virtualinfinity.atrobots.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.arenaobjects.ArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.CollidableArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.DamageInflicter;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.radio.RadioDispatcher;
import java.util.*;

/**
 * The Arena is the virtual world within which the simulation occurs.
 *
 * @author <NAME>
 */
public class Arena {

    /**
     * Get the number of robots still active in the arena.
     *
     * @return the number of robots still active in the arena.
     */
    public int countActiveRobots() {
        return activeRobots.size();
    }
}

// ArenaTest.java
package net.virtualinfinity.atrobots.arena;

import net.virtualinfinity.atrobots.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.arenaobjects.ArenaObject;
import net.virtualinfinity