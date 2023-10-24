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
     * Test method for {@link ClientPlayer#canBowlBombs()}.
     */
    @Test
    void testCanBowlBombs() {
        ClientPlayer player = new ClientPlayer(new Point(0, 0), 0);
        player.setBowlBombs();
        assertTrue(player.canBowlBombs());
        player.resetBowlBombs();
        assertFalse(player.canBowlBombs());
    }
}
