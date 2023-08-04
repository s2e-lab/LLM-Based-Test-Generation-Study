// ServerBombTest.java
package server;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.Vector;
import messages.round.BombExplodedMsg;
import org.apache.log4j.Logger;
import common.Bomb;
import common.Constants;
import common.GameObject;
import common.Player;
import common.PowerUp;
import common.Tile;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerBomb}.
* It contains ten unit test cases for the {@link ServerBomb#tick()} method.
*/
class ServerBombTest {

    private static final Logger logger = Logger.getLogger(ServerBombTest.class);

    private ServerGameSession session;

    private ServerBomb bomb;

    private Vector<GameObject> gameObjects;

    private int tickTime = 2500;

    private int tickFrames = tickTime / 16;

    private int diameter = 10;

    private int distance = (diameter * Constants.TILE_BORDER) / 2;

    private int top, bottom, left, right;

    private Rectangle horizontalHitBox, verticalHitBox;

    private Point position;

    private int id = 1;

    private int planterId = 1;

    private int tick = 0;

    private int tickFrames2 = tickTime / 16;

    private int tickFrames3 = tickTime / 16;

    private int tickFrames4 = tickTime / 16;

    private int tickFrames5 = tickTime / 16;

    private int tickFrames6 = tickTime / 16;

    private int tickFrames7 = tickTime / 16;

    private int tickFrames8 = tickTime / 16;

    private int tickFrames9 = tickTime / 16;

    private int tickFrames10 = tickTime / 16;

    private int tickFrames11 = tickTime / 16;

    private int tickFrames12 = tickTime / 16;

    private int tickFrames13 = tickTime / 16;

    private int tickFrames14 = tickTime / 16;

    private int tickFrames15 = tickTime / 16;

    private int tickFrames16 = tickTime / 16;

    private int tickFrames17 = tickTime / 16;

    private int tickFrames18 = tickTime / 16;

    private int tickFrames19 = tickTime / 16;

    private int tickFrames20 = tickTime / 16;

    private int tickFrames21 = tickTime / 16;

    private int tickFrames22 = tickTime / 16;

    private int tickFrames23 = tickTime / 16;

    private int tickFrames24 = tickTime / 16;

    private int tickFrames25 = tickTime / 16;

    private int tickFrames26 = tickTime / 16;

    private int tickFrames27 = tickTime / 16;

    private int tickFrames28 = tickTime / 16;

    private int tickFrames29 = tickTime / 16;

    private int tickFrames30 = tickTime / 16;

    private int tickFrames31 = tickTime / 16;

    private int tickFrames32 = tickTime / 16;

    private int tickFrames33 = tickTime / 16;

    private int tickFrames34 = tickTime / 16;

    private int tickFrames35 = tickTime / 16;

    private int tickFrames36 = tickTime / 16;

    private int tickFrames37 = tickTime / 16;

    private int tickFrames38 = tickTime / 16;

    private int tickFrames39 = tickTime / 16;

    private int tickFrames40 = tickTime / 16;

    private int tickFrames41 = tickTime / 16;

    private int tickFrames42 = tickTime / 16;

    private int tickFrames43 = tickTime / 16;

    private int tickFrames44 = tickTime / 16;

    private int tickFrames45 = tickTime / 16;

    private int tickFrames46 = tickTime / 16;

    private int tickFrames47 = tickTime / 16;

    private int tickFrames48 = tickTime / 16;

    private int tickFrames49 = tickTime / 16;

    private int tickFrames50 = tickTime / 16;

    private int tickFrames51 = tickTime / 16;

    private int tickFrames52 = tickTime / 16;

    private int tickFrames53 = tickTime / 16;

    private int tickFrames54 = tickTime / 16;

    private int tickFrames55 = tickTime / 16;

    private int tickFrames56 = tickTime / 16;

    private int tickFrames57 = tickTime / 16;

    private int tickFrames58 = tickTime / 16;

    private int tickFrames59 = tickTime / 16;

    private int tickFrames60 = tickTime / 16;

    private int tickFrames61 = tickTime / 16;

    private int tickFrames62 = tickTime / 16;

    private int tickFrames63 = tickTime / 16;

    private int tickFrames64 = tickTime / 16;

    private int tickFrames65 = tickTime / 16;

    private int tickFrames66 = tickTime / 16;

    private int tickFrames67 = tickTime / 16;

    private int tickFrames68 = tickTime / 16;

    private int tickFrames69 = tickTime / 16;

    private int tickFrames70 = tickTime / 16;

    private int tickFrames71 = tickTime / 16;

    private int tickFrames72 = tickTime / 16;

    private int tickFrames73 = tickTime / 16;

    private int tickFrames74 = tickTime / 16;

    private int tickFrames75 = tickTime / 16;

    private int tickFrames76 = tickTime / 16;

    private int tickFrames77 = tickTime / 16;

    private int tickFrames78 = tickTime / 16;

    private int tickFrames79 = tickTime / 16;

    private int tickFrames80 = tickTime / 16;

    private int tickFrames81 = tickTime / 16;

    private int tickFrames82 = tickTime / 16;

    private int tickFrames83 = tickTime / 16;

    private int tickFrames84 = tickTime / 16;

    private int tickFrames85 = tickTime / 16;

    private int tickFrames86 = tickTime / 16;

    private int tickFrames87 = tickTime / 16;

    private int tickFrames88 = tickTime / 16;

    private int tickFrames89 = tickTime / 16;

    private int tickFrames90 = tickTime / 16;

    private int tickFrames91 = tickTime / 16;

    private int tickFrames92 = tickTime / 16;

    private int tickFrames93 = tickTime / 16;

    private int tickFrames94 = tickTime / 16;

    private int tickFrames95 = tickTime / 16;

    private int tickFrames96 = tickTime / 16;

    private int tickFrames97 = tickTime / 16;

    private int tickFrames98 = tickTime / 16;

    private int tickFrames99 = tickTime / 16;

    private int tickFrames100 = tickTime / 16;

    private int tickFrames101 = tickTime / 16;

    private int tickFrames102 = tickTime / 16;

    private int tickFrames103 = tickTime / 16;

    private int tickFrames104 = tickTime / 16;

    private int tickFrames105 = tickTime / 16;

    private int tickFrames106 = tickTime / 16;

    private int tickFrames107 = tickTime / 16;

    private int tickFrames108 = tickTime / 16;

    private int tickFrames109 = tickTime / 16;

    private int tickFrames110 = tickTime / 16;

    private int tickFrames111 = tickTime / 16;

    private int tickFrames112 = tickTime / 16;

    private int tickFrames113 = tickTime / 16;

    private int tickFrames114 = tickTime / 16;

    private int tickFrames115 = tickTime / 16;

    private int tickFrames116 = tickTime / 16;

    private int tickFrames117 = tickTime / 16;

    private int tickFrames118 = tickTime / 16;

    private int tickFrames119 = tickTime / 16;

    private int tickFrames120 = tickTime / 16;

    private int tickFrames121 = tickTime / 16;

    private int tickFrames122 = tickTime / 16;

    private int tickFrames123 = tickTime / 16;

    private int tickFrames12