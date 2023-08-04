// GfxFactoryTest.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GfxFactory}.
* It contains ten unit test cases for the {@link GfxFactory#getPowerUpImage(String)} method.
*/
class GfxFactoryTest {

    private GfxFactory gfxFactory;

    private Logger logger = Logger.getLogger(GfxFactoryTest.class);

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage() {
        logger.info("getPowerUpImage");
        String type = "speed";
        gfxFactory = new GfxFactory();
        Image expResult = gfxFactory.getPowerUpImage(type);
        Image result = gfxFactory.getPowerUpImage(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage2() {
        logger.info("getPowerUpImage");
        String type = "bomb";
        gfxFactory = new GfxFactory();
        Image expResult = gfxFactory.getPowerUpImage(type);
        Image result = gfxFactory.getPowerUpImage(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage3() {
        logger.info("getPowerUpImage");
        String type = "shield";
        gfxFactory = new GfxFactory();
        Image expResult = gfxFactory.getPowerUpImage(type);
        Image result = gfxFactory.getPowerUpImage(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage4() {
        logger.info("getPowerUpImage");
        String type = "life";
        gfxFactory = new GfxFactory();
        Image expResult = gfxFactory.getPowerUpImage(type);
        Image result = gfxFactory.getPowerUpImage(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage5() {
        logger.info("getPowerUpImage");
        String type = "none";
        gfxFactory = new GfxFactory();
        Image expResult = gfxFactory.getPowerUpImage(type);
        Image result = gfxFactory.getPowerUpImage(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage6() {
        logger.info("getPowerUpImage");
        String type = "speed";
        gfxFactory = new GfxFactory();
        Image expResult = gfxFactory.getPowerUpImage(type);
        Image result = gfxFactory.getPowerUpImage(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage7() {
        logger.info("getPowerUpImage");
        String type = "speed";
        gfxFactory = new GfxFactory();
        Image expResult = gfxFactory.getPowerUpImage(type);
        Image result = gfxFactory.getPowerUpImage(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage8() {
        logger.info("getPowerUpImage");
        String type = "speed";
        gfxFactory = new GfxFactory();
        Image expResult = gfxFactory.getPowerUpImage(type);
        Image result = gfxFactory.getPowerUpImage(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage9() {
        logger.info("getPowerUpImage");
        String type = "speed";
        gfxFactory = new GfxFactory();
        Image expResult = gfxFactory.getPowerUpImage(type);
        Image result = gfxFactory.getPowerUpImage(type);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage10() {
        logger.info("getPowerUpImage");
        String type = "speed";
        gfxFactory = new GfxFactory();
        Image expResult = gfxFactory.getPowerUpImage(type);
        Image result = gfxFactory.getPowerUpImage(type);
        assertEquals(expResult, result);
    }
}

// GfxFactory.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;

/**
 * @author <NAME>
 * @autor <NAME>
 */
public class GfxFactory {

    private HashMap<Integer, Image> wallImageCache;

    private HashMap<String, Image> tileImageCache;

    private HashMap<String, Image> powerUpImageCache;

    private HashMap<String, Image> o;

    private HashMap<Integer, Image>[] playerImageCache;

    private HashMap<Integer, Image>[] bombImageCache;

    private HashMap<Integer, Integer> idTranslator;

    private HashMap<Integer, Image>[] explosionImageCache;

    private ExplosionGfxFactory explosionGfxFactory;

    private int currentId = 1;

    private static String basePath = "/gfx";

    private String tileSet = "ice";

    private Logger logger = Logger.getLogger(GfxFactory.class);

    public GfxFactory() {
    }

    /**
     * @param id The player id.
     * @param state
     * @return
     */
    public Image getPlayerImage(int id, int state) {
        return playerImageCache[translateId(id)][state];
    }

    public Image getTileImage(String type) {
        return tileImageCache.get(type);
    }

    private int translateId(int id) {
        return idTranslator.get(id);
    }

    private Image loadImage(String path) {
        Image image = null;
        try {
            image = ImageIO.read(new File(ResourceService.getResourcePath() + basePath + path));
        } catch (IOException e) {
            logger.error("Could not load image: " + path);
        }
        return image;
    }

    /**
     * @param id The planter's id.
     * @return
     */
    public Image getBombImage(int id) {
        return bombImageCache[translateId(id)][0];
    }

    /**
     * @param id The planter's id.
     * @return
     */
    public Image getBombImage(int id, int state) {
        return bombImageCache[translateId(id)][state];
    }

    public Image getExplosionImage(int diameter, int id) {
        return explosionImageCache[diameter][translateId(id)];
    }

    public void setTileSet(String tileSet) {
        this.tileSet = tileSet;
        tileImageCache = new HashMap<>();
        tileImageCache.put("grass", loadImage("/" + tileSet + "/grass.png"));
        tileImageCache.put("ice", loadImage("/" + tileSet + "/ice.png"));
        tileImageCache.put("sand", loadImage("/" + tileSet + "/sand.png"));
        tileImageCache.put("stone", loadImage("/" + tileSet + "/stone.png"));
        tileImageCache.put("water", loadImage("/" + tileSet + "/water.png"));
        tileImageCache.put("wood", loadImage("/" + tileSet + "/wood.png"));
    }

    public Image getWallImage(int state) {
        return wallImageCache.get(state);
    }

    /**
     * Power up image loading
     * @param type A String value describing the type of powerUp
     *  *
     */
    public Image getPowerUpImage(String type) {
        return powerUpImageCache.get(type);
    }
}

// GfxFactoryTest.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GfxFactory}.
* It contains ten unit test cases for the {@link GfxFactory#getPowerUpImage(String)} method.
*/
class GfxFactoryTest {
		
    private GfxFactory gfxFactory;

    private Logger logger = Logger.getLogger(GfxFactoryTest.class);

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage