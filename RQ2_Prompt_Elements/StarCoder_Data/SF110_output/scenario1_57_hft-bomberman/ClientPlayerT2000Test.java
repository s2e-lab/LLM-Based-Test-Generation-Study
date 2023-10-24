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

    private static final Logger log = Logger.getLogger(ClientPlayerTest.class);

    /**
     * Test of {@link ClientPlayer#canBowlBombs()} method, of class {@link ClientPlayer}.
     */
    @Test
    void testCanBowlBombs() {
        log.info("canBowlBombs");
        ClientPlayer instance = new ClientPlayer();
        boolean expResult = false;
        boolean result = instance.canBowlBombs();
        assertEquals(exp