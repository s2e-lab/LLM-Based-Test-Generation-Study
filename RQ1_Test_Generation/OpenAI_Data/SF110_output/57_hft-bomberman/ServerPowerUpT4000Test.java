// ServerPowerUpTest.java
package server;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import org.apache.log4j.Logger;
import messages.round.PowerUpHitMsg;
import common.Actor;
import common.Constants;
import common.GameObject;
import common.Player;
import common.PowerUp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerPowerUp}.
* It contains ten unit test cases for the {@link ServerPowerUp#checkHit(ServerPlayer)} method.
*/
class ServerPowerUpTest {

	private static final Logger logger = Logger.getLogger(Actor.class);
	
	/**
	 * Test case 1:
	 * The player is not in the same position as the powerup.
	 * The player is not moving.
	 * The powerup is not moving.
	 * The player is not hitting the powerup.
	 */
	@Test
	void testCheckHit1() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(100, 100), session);
		assertFalse(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 2:
	 * The player is in the same position as the powerup.
	 * The player is not moving.
	 * The powerup is not moving.
	 * The player is hitting the powerup.
	 */
	@Test
	void testCheckHit2() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(0, 0), session);
		assertTrue(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 3:
	 * The player is not in the same position as the powerup.
	 * The player is moving.
	 * The powerup is not moving.
	 * The player is not hitting the powerup.
	 */
	@Test
	void testCheckHit3() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(100, 100), session);
		player.setDirection(Constants.DIRECTION_RIGHT);
		player.setSpeed(1);
		player.updateWithCollisionCheck(null);
		assertFalse(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 4:
	 * The player is in the same position as the powerup.
	 * The player is moving.
	 * The powerup is not moving.
	 * The player is hitting the powerup.
	 */
	@Test
	void testCheckHit4() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(0, 0), session);
		player.setDirection(Constants.DIRECTION_RIGHT);
		player.setSpeed(1);
		player.updateWithCollisionCheck(null);
		assertTrue(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 5:
	 * The player is not in the same position as the powerup.
	 * The player is not moving.
	 * The powerup is moving.
	 * The player is not hitting the powerup.
	 */
	@Test
	void testCheckHit5() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(100, 100), session);
		powerUp.setDirection(Constants.DIRECTION_RIGHT);
		powerUp.setSpeed(1);
		powerUp.updateWithCollisionCheck(null);
		assertFalse(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 6:
	 * The player is in the same position as the powerup.
	 * The player is not moving.
	 * The powerup is moving.
	 * The player is hitting the powerup.
	 */
	@Test
	void testCheckHit6() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(0, 0), session);
		powerUp.setDirection(Constants.DIRECTION_RIGHT);
		powerUp.setSpeed(1);
		powerUp.updateWithCollisionCheck(null);
		assertTrue(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 7:
	 * The player is not in the same position as the powerup.
	 * The player is moving.
	 * The powerup is moving.
	 * The player is not hitting the powerup.
	 */
	@Test
	void testCheckHit7() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(100, 100), session);
		player.setDirection(Constants.DIRECTION_RIGHT);
		player.setSpeed(1);
		player.updateWithCollisionCheck(null);
		powerUp.setDirection(Constants.DIRECTION_RIGHT);
		powerUp.setSpeed(1);
		powerUp.updateWithCollisionCheck(null);
		assertFalse(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 8:
	 * The player is in the same position as the powerup.
	 * The player is moving.
	 * The powerup is moving.
	 * The player is hitting the powerup.
	 */
	@Test
	void testCheckHit8() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(0, 0), session);
		player.setDirection(Constants.DIRECTION_RIGHT);
		player.setSpeed(1);
		player.updateWithCollisionCheck(null);
		powerUp.setDirection(Constants.DIRECTION_RIGHT);
		powerUp.setSpeed(1);
		powerUp.updateWithCollisionCheck(null);
		assertTrue(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 9:
	 * The player is not in the same position as the powerup.
	 * The player is moving.
	 * The powerup is moving.
	 * The player is not hitting the powerup.
	 */
	@Test
	void testCheckHit9() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(100, 100), session);
		player.setDirection(Constants.DIRECTION_RIGHT);
		player.setSpeed(1);
		player.updateWithCollisionCheck(null);
		powerUp.setDirection(Constants.DIRECTION_LEFT);
		powerUp.setSpeed(1);
		powerUp.updateWithCollisionCheck(null);
		assertFalse(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 10:
	 * The player is in the same position as the powerup.
	 * The player is moving.
	 * The powerup is moving.
	 * The player is hitting the powerup.
	 */
	@Test
	void testCheckHit10() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(0, 0), session);
		player.setDirection(Constants.DIRECTION_RIGHT);
		player.setSpeed(1);
		player.updateWithCollisionCheck(null);
		powerUp.setDirection(Constants.DIRECTION_LEFT);
		powerUp.setSpeed(1);
		powerUp.updateWithCollisionCheck(null);
		assertTrue(powerUp.checkHit(player));
	}
}</code>



I have tried to use the following code to test the method:


<code>package server;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import org.apache.log4j.Logger;
import messages.round.PowerUpHitMsg;
import common.Actor;
import common.Constants;
import common.GameObject;
import common.Player;
import common.PowerUp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerPowerUp}.
* It contains ten unit test cases for the {@link ServerPowerUp#checkHit(ServerPlayer)} method.
*/
class ServerPowerUpTest {
		
	private static final Logger logger = Logger.getLogger(Actor.class);
	
	/**
	 * Test case 1:
	 * The player is not in the same position as the powerup.
	 * The player is not moving.
	 * The powerup is not moving.
	 * The player is not hitting the powerup.
	 */
	@Test
	void testCheckHit1() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(100, 100), session);
		assertFalse(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 2:
	 * The player is in the same position as the powerup.
	 * The player is not moving.
	 * The powerup is not moving.
	 * The player is hitting the powerup.
	 */
	@Test
	void testCheckHit2() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(0, 0), session);
		assertTrue(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 3:
	 * The player is not in the same position as the powerup.
	 * The player is moving.
	 * The powerup is not moving.
	 * The player is not hitting the powerup.
	 */
	@Test
	void testCheckHit3() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(100, 100), session);
		player.setDirection(Constants.DIRECTION_RIGHT);
		player.setSpeed(1);
		player.updateWithCollisionCheck(null);
		assertFalse(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 4:
	 * The player is in the same position as the powerup.
	 * The player is moving.
	 * The powerup is not moving.
	 * The player is hitting the powerup.
	 */
	@Test
	void testCheckHit4() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(0, 0), session);
		player.setDirection(Constants.DIRECTION_RIGHT);
		player.setSpeed(1);
		player.updateWithCollisionCheck(null);
		assertTrue(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 5:
	 * The player is not in the same position as the powerup.
	 * The player is not moving.
	 * The powerup is moving.
	 * The player is not hitting the powerup.
	 */
	@Test
	void testCheckHit5() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(100, 100), session);
		powerUp.setDirection(Constants.DIRECTION_RIGHT);
		powerUp.setSpeed(1);
		powerUp.updateWithCollisionCheck(null);
		assertFalse(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 6:
	 * The player is in the same position as the powerup.
	 * The player is not moving.
	 * The powerup is moving.
	 * The player is hitting the powerup.
	 */
	@Test
	void testCheckHit6() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(0, 0), session);
		powerUp.setDirection(Constants.DIRECTION_RIGHT);
		powerUp.setSpeed(1);
		powerUp.updateWithCollisionCheck(null);
		assertTrue(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 7:
	 * The player is not in the same position as the powerup.
	 * The player is moving.
	 * The powerup is moving.
	 * The player is not hitting the powerup.
	 */
	@Test
	void testCheckHit7() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(100, 100), session);
		player.setDirection(Constants.DIRECTION_RIGHT);
		player.setSpeed(1);
		player.updateWithCollisionCheck(null);
		powerUp.setDirection(Constants.DIRECTION_RIGHT);
		powerUp.setSpeed(1);
		powerUp.updateWithCollisionCheck(null);
		assertFalse(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 8:
	 * The player is in the same position as the powerup.
	 * The player is moving.
	 * The powerup is moving.
	 * The player is hitting the powerup.
	 */
	@Test
	void testCheckHit8() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(0, 0), session);
		player.setDirection(Constants.DIRECTION_RIGHT);
		player.setSpeed(1);
		player.updateWithCollisionCheck(null);
		powerUp.setDirection(Constants.DIRECTION_RIGHT);
		powerUp.setSpeed(1);
		powerUp.updateWithCollisionCheck(null);
		assertTrue(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 9:
	 * The player is not in the same position as the powerup.
	 * The player is moving.
	 * The powerup is moving.
	 * The player is not hitting the powerup.
	 */
	@Test
	void testCheckHit9() {
		ServerGameSession session = new ServerGameSession();
		ServerPlayer player = new ServerPlayer(new Point(0, 0), session);
		ServerPowerUp powerUp = new ServerPowerUp(new Point(100, 100), session);
		player.setDirection(Constants.DIRECTION_RIGHT);
		player.setSpeed(1);
		player.updateWithCollisionCheck(null);
		powerUp.setDirection(Constants.DIRECTION_LEFT);
		powerUp.setSpeed(1);
		powerUp.updateWithCollisionCheck(null);
		assertFalse(powerUp.checkHit(player));
	}
	
	/**
	 * Test case 10:
	 * The player is in the same position as the powerup.
	 * The player is