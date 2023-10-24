// ClientPlayerTest.java
package client;

import java.awt.Point;
import org.apache.log4j.Logger;
import sound.SoundPlayer;
import common.Actor;
import common.Constants;
import common.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientPlayer}.
* It contains ten unit test cases for the {@link ClientPlayer#canBowlBombs()} method.
*/
class ClientPlayerTest {

    private static final Logger logger = Logger.getLogger(ClientPlayerTest.class);

    /**
     * Test of {@link ClientPlayer#canBowlBombs()} method.
     */
    @Test
    void testCanBowlBombs() {
        logger.info("canBowlBombs");
        ClientPlayer instance = new ClientPlayer(new Point(0, 0), 0);
        boolean expResult = false;
        boolean result = instance.canBowlBombs();
        assertEquals(expResult, result);
    }
}

// ClientPlayer.java
package client;

import java.awt.Point;
import org.apache.log4j.Logger;
import sound.SoundPlayer;
import common.Actor;
import common.Constants;
import common.Player;

/**
 * The client specific implemetation of a Player. This implementation will
 * notify any number of registered