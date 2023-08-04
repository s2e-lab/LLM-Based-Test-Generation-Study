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
* It contains ten unit test cases for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {

    /**
     * Test of {@link PlayerConfiguration#showShootline()} method, of class PlayerConfiguration.
     */
    @Test
    void testShowShootline() {
        System.out.println("showShootline");
        PlayerConfiguration instance = new PlayerConfiguration();
        boolean expResult = true;
        boolean result = instance.showShootline();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration_1.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * An instance of this will be used by the player to hold its tunable
 * parameters.
 *
 * @author daniel
 */
public class PlayerConfiguration implements Cloneable {

    private final Lock lock = new ReentrantLock();
    private boolean showShootline = true;

    /**
     * @return <code>true</code> if shooting lines should be displayed
     */
    public boolean showShootline() {
        lock.lock();
        try {
            return showShootline;
        } finally {
            lock.unlock();
        }
    }

    /**
     * @param showShootline <code>true</code> if shooting lines should be displayed
     */
    public void setShowShootline(boolean showShootline) {
        lock.lock();
        try {
            this.showShootline = showShootline;
        } finally {
            lock.unlock();
        }
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
* It contains ten unit test cases for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_1Test {
		
    /**
     * Test of {@link PlayerConfiguration#showShootline()} method, of class PlayerConfiguration.
     */
    @Test
    void testShowShootline() {
        System.out.println("showShootline");
        PlayerConfiguration instance = new PlayerConfiguration();
        boolean expResult = true;
        boolean result = instance.showShootline();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration_1.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * An instance of this will be used by the player to hold its tunable
 * parameters.
 *
 * @author daniel
 */
public class PlayerConfiguration implements Cloneable {

    private final Lock lock = new ReentrantLock();
    private boolean showShootline = true;

    /**
     * @return <code>true</code> if shooting lines should be displayed
     */
    public boolean showShootline() {
        lock.lock();
        try {
            return showShootline;
        } finally {
            lock.unlock();
        }
    }

    /**
     * @param showShootline <code>true</code> if shooting lines should be displayed
     */
    public void setShowShootline(boolean showShootline) {
        lock.lock();
        try {
            this.showShootline = showShootline;
        } finally {
            lock.unlock();
        }
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
* It contains ten unit test cases for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_1Test {
		
    /**
     * Test of {@link PlayerConfiguration#showShootline()} method, of class PlayerConfiguration.
     */
    @Test
    void testShowShootline() {
        System.out.println("showShootline");
        PlayerConfiguration instance = new PlayerConfiguration();
        boolean expResult = true;
        boolean result = instance.showShootline();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration_1.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * An instance of this will be used by the player to hold its tunable
 * parameters.
 *
 * @author daniel
 */
public class PlayerConfiguration implements Cloneable {

    private final Lock lock = new ReentrantLock();
    private boolean showShootline = true;

    /**
     * @return <code>true</code> if shooting lines should be displayed
     */
    public boolean showShootline() {
        lock.lock();
        try {
            return showShootline;
        } finally {
            lock.unlock();
        }
    }

    /**
     * @param showShootline <code>true</code> if shooting lines should be displayed
     */
    public void setShowShootline(boolean showShootline) {
        lock.lock();
        try {
            this.showShootline = showShootline;
        } finally {
            lock.unlock();
        }
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
* It contains ten unit test cases for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_1Test {
		
    /**
     * Test of {@link PlayerConfiguration#showShootline()} method, of class PlayerConfiguration.
     */
    @Test
    void testShowShootline() {
        System.out.println("showShootline");
        PlayerConfiguration instance = new PlayerConfiguration();
        boolean expResult = true;
        boolean result = instance.showShootline();
        assertEquals(expResult, result);
    }
}

// PlayerConfiguration_1.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;

/**
 * An instance of this will be used by the player to hold its tunable
 * parameters.
 *
 * @author daniel
 */
public class PlayerConfiguration implements Cloneable {

    private final Lock lock = new ReentrantLock();
    private boolean showShootline = true;

    /**
     * @return <code>true</code> if shooting lines should be displayed
     */
    public boolean showShootline() {
        lock.lock();
        try {
            return showShootline;
        } finally {
            lock.unlock();
        }
    }

    /**
     * @param showShootline <code>true</code> if shooting lines should be displayed
     */
    public void setShowShootline(boolean showShootline) {
        lock.lock();
        try {
            this.showShootline = showShootline;
        } finally {
            lock.unlock();
        }
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
* It contains