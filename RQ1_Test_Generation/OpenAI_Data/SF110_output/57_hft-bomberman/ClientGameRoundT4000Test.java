// ClientGameRoundTest.java
package client;

import java.awt.Point;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import org.apache.log4j.Logger;
import client.controller.LocalControl;
import client.gui.StartFrame;
import client.network.ForwardingObserver;
import client.view.BombView;
import client.view.GameCanvas;
import client.view.GameView;
import client.view.GfxFactory;
import client.view.OffGamePainter;
import client.view.PlayerView;
import client.view.PowerUpView;
import client.view.StatusView;
import client.view.TileView;
import common.Bomb;
import common.Constants;
import common.GameModel;
import common.GameObject;
import common.GameRound;
import common.Map;
import common.Player;
import common.PowerUp;
import common.Tile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientGameRound}.
* It contains ten unit test cases for the {@link ClientGameRound#getGameObjectById(int)} method.
*/
class ClientGameRoundTest {

		private static final Logger logger = Logger.getLogger(ClientGameRoundTest.class);
		
		/**
		 * Test case for {@link ClientGameRound#getGameObjectById(int)}
		 * 
		 * @author Andi, Bj�rn
		 */
		@Test
		void testGetGameObjectById() {
				ClientGameRound clientGameRound = new ClientGameRound(null, null);
				
				// Test case 1
				GameObject gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(1);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(1));
				
				// Test case 2
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(2);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(2));
				
				// Test case 3
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(3);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(3));
				
				// Test case 4
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(4);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(4));
				
				// Test case 5
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(5);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(5));
				
				// Test case 6
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(6);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(6));
				
				// Test case 7
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(7);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(7));
				
				// Test case 8
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(8);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(8));
				
				// Test case 9
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(9);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(9));
				
				// Test case 10
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(10);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(10));
		}
}

// GameModel.java
/**
 */
package common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import org.apache.log4j.Logger;

/**
 * Represents the model of a game. This class contains all game objects that are
 * currently in the game.
 *
 * @author Andi, Bj�rn
 */
public class GameModel extends Observable {

    /**
     * The game objects that are currently in the game.
     */
    private HashMap<Integer, GameObject> gameObjects;

    /**
     * The time that has passed since the game started.
     */
    private long time;

    /**
     * The time that has passed since the last update.
     */
    private long deltaTime;

    /**
     * The time that has passed since the last update.
     */
    private long lastUpdateTime;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderTime;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime2;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime3;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime4;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime5;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime6;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime7;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime8;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime9;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime10;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime11;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime12;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime13;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime14;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime15;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime16;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime17;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime18;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime19;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime20;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime21;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime22;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime23;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime24;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime25;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime26;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime27;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime28;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime29;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime30;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime31;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime32;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime33;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime34;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime35;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime36;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime37;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime38;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime39;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime40;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime41;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime42;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime43;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime44;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime45;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime46;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime47;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime48;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime49;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime50;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime51;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime52;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime53;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime54;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime55;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime56;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime57;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime58;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime59;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime60;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime61;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime62;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime63;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime64;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime65;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime66;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime67;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime68;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime69;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime70;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime71;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime72;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime73;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime74;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime75;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime76;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime77;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime78;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime79;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime80;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime81;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime82;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime83;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime84;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime85;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime86;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime87;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime88;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime89;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime90;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime91;

    /**
     * The time that has passed since the last update.
     */
    private long lastRenderDeltaTime92;

    /**
     * The time that has passed since the last update.
     */
    private