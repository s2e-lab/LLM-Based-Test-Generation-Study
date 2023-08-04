// PlayerConfiguration_0Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_0Test {

    /**
     * Test of copy method, of class PlayerConfiguration.
     */
    @Test
    void testCopy() throws CloneNotSupportedException {
        System.out.println("copy");
        PlayerConfiguration instance = new PlayerConfiguration();
        PlayerConfiguration expResult = new PlayerConfiguration();
        PlayerConfiguration result = instance.copy();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration_1Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_1Test {
		
    /**
     * Test of copy method, of class PlayerConfiguration.
     */
    @Test
    void testCopy() throws CloneNotSupportedException {
        System.out.println("copy");
        PlayerConfiguration instance = new PlayerConfiguration();
        instance.setPlayerName("PlayerName");
        PlayerConfiguration expResult = new PlayerConfiguration();
        expResult.setPlayerName("PlayerName");
        PlayerConfiguration result = instance.copy();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration_2Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_2Test {
		
    /**
     * Test of copy method, of class PlayerConfiguration.
     */
    @Test
    void testCopy() throws CloneNotSupportedException {
        System.out.println("copy");
        PlayerConfiguration instance = new PlayerConfiguration();
        instance.setPlayerName("PlayerName");
        instance.setPlayerColor(Configuration.PlayerColor.BLACK);
        PlayerConfiguration expResult = new PlayerConfiguration();
        expResult.setPlayerName("PlayerName");
        expResult.setPlayerColor(Configuration.PlayerColor.BLACK);
        PlayerConfiguration result = instance.copy();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration_3Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_3Test {
		
    /**
     * Test of copy method, of class PlayerConfiguration.
     */
    @Test
    void testCopy() throws CloneNotSupportedException {
        System.out.println("copy");
        PlayerConfiguration instance = new PlayerConfiguration();
        instance.setPlayerName("PlayerName");
        instance.setPlayerColor(Configuration.PlayerColor.BLACK);
        instance.setPlayerType(Configuration.PlayerType.HUMAN);
        PlayerConfiguration expResult = new PlayerConfiguration();
        expResult.setPlayerName("PlayerName");
        expResult.setPlayerColor(Configuration.PlayerColor.BLACK);
        expResult.setPlayerType(Configuration.PlayerType.HUMAN);
        PlayerConfiguration result = instance.copy();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration_4Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_4Test {
		
    /**
     * Test of copy method, of class PlayerConfiguration.
     */
    @Test
    void testCopy() throws CloneNotSupportedException {
        System.out.println("copy");
        PlayerConfiguration instance = new PlayerConfiguration();
        instance.setPlayerName("PlayerName");
        instance.setPlayerColor(Configuration.PlayerColor.BLACK);
        instance.setPlayerType(Configuration.PlayerType.HUMAN);
        instance.setPlayerStrategy(Configuration.PlayerStrategy.RANDOM);
        PlayerConfiguration expResult = new PlayerConfiguration();
        expResult.setPlayerName("PlayerName");
        expResult.setPlayerColor(Configuration.PlayerColor.BLACK);
        expResult.setPlayerType(Configuration.PlayerType.HUMAN);
        expResult.setPlayerStrategy(Configuration.PlayerStrategy.RANDOM);
        PlayerConfiguration result = instance.copy();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration_5Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_5Test {
		
    /**
     * Test of copy method, of class PlayerConfiguration.
     */
    @Test
    void testCopy() throws CloneNotSupportedException {
        System.out.println("copy");
        PlayerConfiguration instance = new PlayerConfiguration();
        instance.setPlayerName("PlayerName");
        instance.setPlayerColor(Configuration.PlayerColor.BLACK);
        instance.setPlayerType(Configuration.PlayerType.HUMAN);
        instance.setPlayerStrategy(Configuration.PlayerStrategy.RANDOM);
        instance.setPlayerMoveDelay(100);
        PlayerConfiguration expResult = new PlayerConfiguration();
        expResult.setPlayerName("PlayerName");
        expResult.setPlayerColor(Configuration.PlayerColor.BLACK);
        expResult.setPlayerType(Configuration.PlayerType.HUMAN);
        expResult.setPlayerStrategy(Configuration.PlayerStrategy.RANDOM);
        expResult.setPlayerMoveDelay(100);
        PlayerConfiguration result = instance.copy();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration_6Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_6Test {
		
    /**
     * Test of copy method, of class PlayerConfiguration.
     */
    @Test
    void testCopy() throws CloneNotSupportedException {
        System.out.println("copy");
        PlayerConfiguration instance = new PlayerConfiguration();
        instance.setPlayerName("PlayerName");
        instance.setPlayerColor(Configuration.PlayerColor.BLACK);
        instance.setPlayerType(Configuration.PlayerType.HUMAN);
        instance.setPlayerStrategy(Configuration.PlayerStrategy.RANDOM);
        instance.setPlayerMoveDelay(100);
        instance.setPlayerMoveDelayDeviation(10);
        PlayerConfiguration expResult = new PlayerConfiguration();
        expResult.setPlayerName("PlayerName");
        expResult.setPlayerColor(Configuration.PlayerColor.BLACK);
        expResult.setPlayerType(Configuration.PlayerType.HUMAN);
        expResult.setPlayerStrategy(Configuration.PlayerStrategy.RANDOM);
        expResult.setPlayerMoveDelay(100);
        expResult.setPlayerMoveDelayDeviation(10);
        PlayerConfiguration result = instance.copy();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration_7Test