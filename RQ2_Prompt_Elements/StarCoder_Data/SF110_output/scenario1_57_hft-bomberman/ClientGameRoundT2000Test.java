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

    /**
     * Test of {@link ClientGameRound#getGameObjectById(int)} method.
     */
    @Test
    void testGetGameObjectById() {
        ClientGameRound instance = new ClientGameRound();
        instance.model = new GameModel();
        instance.model.setMap(new Map(10, 10));
        instance.model.getMap().setTile(new Tile(1, 1, 1));
        instance.model.getMap().setTile(new Tile(2, 2, 2));
        instance.model.getMap().setTile(new Tile(3, 3, 3));
        instance.model.getMap().setTile(new Tile(4, 4, 4));
        instance.model.getMap().setTile(new Tile(5, 5, 5));
        instance.model.getMap().setTile(new Tile(6, 6, 6));
        instance.model.getMap().setTile(new Tile(7, 7, 7));
        instance.model.getMap().setTile(new Tile(8, 8, 8));
        instance.model.getMap().setTile(new Tile(9, 9, 9));
        instance.model.getMap().setTile(new Tile(10, 10, 10));
        instance.model.getMap().setTile(new Tile(11, 11, 11));
        instance.model.getMap().setTile(new Tile(12, 12, 12));
        instance.model.getMap().setTile(new Tile(13, 13, 13));
        instance.model.getMap().setTile(new Tile(14, 14, 14));
        instance.model.getMap().setTile(new Tile(15, 15, 15));
        instance.model.getMap().setTile(new Tile(16, 16, 16));
        instance.model.getMap().setTile(new Tile(17, 17, 17));
        instance.model.getMap().setTile(new Tile(18, 18, 18));
        instance.model.getMap().setTile(new Tile(19, 19, 19));
        instance.model.getMap().setTile(new Tile(20, 20, 20));
        instance.model.getMap().setTile(new Tile(21, 21, 21));
        instance.model.getMap().setTile(new Tile(22, 22, 22));
        instance.model.getMap().setTile(new Tile(23, 23, 23));
        instance.model.getMap().setTile(new Tile(24, 24, 24));
        instance.model.getMap().setTile(new Tile(25, 25, 25));
        instance.model.getMap().setTile(new Tile(26, 26, 26));
        instance.model.getMap().setTile(new Tile(27, 27, 27));
        instance.model.getMap().setTile(new Tile(28, 28, 28));
        instance.model.getMap().setTile(new Tile(29, 29, 29));
        instance.model.getMap().setTile(new Tile(30, 30, 30));
        instance.model.getMap().setTile(new Tile(31, 31, 31));
        instance.model.getMap().setTile(new Tile(32, 32, 32));
        instance.model.getMap().setTile(new Tile(33, 33, 33));
        instance.model.getMap().setTile(new Tile(34, 34, 34));
        instance.model.getMap().setTile(new Tile(35, 35, 35));
        instance.model.getMap().setTile(new Tile(36, 36, 36));
        instance.model.getMap().setTile(new Tile(37, 37, 37));
        instance.model.getMap().setTile(new Tile(38, 38, 38));
        instance.model.getMap().setTile(new Tile(39, 39, 39));
        instance.model.getMap().setTile(new Tile(40, 40, 40));
        instance.model.getMap().setTile(new Tile(41, 41, 41));
        instance.model.getMap().setTile(new Tile(42, 42, 42));
        instance.model.getMap().setTile(new Tile(43, 43, 43));
        instance.model.getMap().setTile(new Tile(44, 44, 44));
        instance.model.getMap().setTile(new Tile(45, 45, 45));
        instance.model.getMap().setTile(new Tile(46, 46, 46));
        instance.model.getMap().setTile(new Tile(47, 47, 47));
        instance.model.getMap().setTile(new Tile(48, 48, 48));
        instance.model.getMap().setTile(new Tile(49, 49, 49));
        instance.model.getMap().setTile(new Tile(50, 50, 50));
        instance.model.getMap().setTile(new Tile(51, 51, 51));
        instance.model.getMap().setTile(new Tile(52, 52, 52));
        instance.model.getMap().setTile(new Tile(53, 53, 53));
        instance.model.getMap().setTile(new Tile(54, 54, 54));
        instance.model.getMap().setTile(new Tile(55, 55, 55));
        instance.model.getMap().setTile(new Tile(56, 56, 56));
        instance.model.getMap().setTile(new Tile(57, 57, 57));
        instance.model.getMap().setTile(new Tile(58, 58, 58));
        instance.model.getMap().setTile(new Tile(59, 59, 59));
        instance.model.getMap().setTile(new Tile(60, 60, 60));
        instance.model.getMap().setTile(new Tile(61, 61, 61));
        instance.model.getMap().setTile(new Tile(62, 62, 62));
        instance.model.getMap().setTile(new Tile(63, 63, 63));
        instance.model.getMap().setTile(new Tile(64, 64, 64));
        instance.model.getMap().setTile(new Tile(65, 65, 65));
        instance.model.getMap().setTile(new Tile(66, 66, 66));
        instance.model.getMap().setTile(new Tile(67, 67, 67));
        instance.model.getMap().setTile(new Tile(68, 68, 68));
        instance.model.getMap().setTile(new Tile(69, 69, 69));
        instance.model.getMap().setTile(new Tile(70, 70, 70));
        instance.model.getMap().setTile(new Tile(71, 71, 71));
        instance.model.getMap().setTile(new Tile(72, 72, 72));
        instance.model.getMap().setTile(new Tile(73, 73, 73));
        instance.model.getMap().setTile(new Tile(74, 74, 74));
        instance.model.getMap().setTile(new Tile(75, 75, 75));
        instance.model.getMap().setTile(new Tile(76, 76, 76));
        instance.model.getMap().setTile(new Tile(77, 77, 77));
        instance.model.getMap().setTile(new Tile(78, 78, 78));
        instance.model.getMap().setTile(new Tile(79, 79, 79));
        instance.model.getMap().setTile(new Tile(80, 80, 80));
        instance.model.getMap().setTile(new Tile(81, 81, 81));
        instance.model.getMap().setTile(new Tile(