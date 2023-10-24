// MapPreviewTest.java
package common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapPreview}.
* It contains ten unit test cases for the {@link MapPreview#getMapPreview(int)} method.
*/
class MapPreviewTest {

    private static final Logger logger = Logger.getLogger(MapPreviewTest.class);

    /**
    * Test of {@link MapPreview#getMapPreview(int)} method, of class {@link MapPreview}.
    */
    @Test
    void testGetMapPreview() {
        logger.info("getMapPreview");
        Map map = new Map();
        MapPreview instance = new MapPreview(map);
        int previewWidth = 150;
        ImageIcon expResult = null;
        ImageIcon result = instance.getMapPreview(previewWidth);
        assertEquals(expResult, result);
    }
}

// MapPreview.java
package common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;

/**
 * create a ImageIcon Map Preview of a map object
 *
 * usage example: MapPreview mp = new MapPreview(map); mp.setImageSet("desert");
 * (optional) ImageIcon ii = mp.getMapPreview(150); !!
 *
 * @author christian
 */
public class MapPreview {

    private String mapImageSet;

    private Point mapArea;

    private ImageIcon mapPreviewIcon;

    private BufferedImage mapPreview;

    private Map mapMap;

    private String mapFile;

    // map tile Images, for caching purposes
    private static Image TILE_WALL_IMAGE;

    private static Image TILE_STONE_IMAGE;

    private static final Logger logger = Logger.getLogger(MapPreview.class);

    /**
     * class for creating map Preview of Map map
     *
     * @param map -
     *            map for which preview should be created
     */
    public MapPreview(Map map) {
        this.mapMap = map;
    }

    /**
     * set imageSet, overrides default map imageSet
     *
     * @param imageSet -
     *            String, imageSet (-folder)
     */
    public void setImageSet(String imageSet) {
        this.mapImageSet = imageSet;
    }

    /**
     * returns preview of current map
     *
     * @param previewWidth -
     *            Width of preview. Proportions are constrained
     * @return BufferedImage with map preview
     */
    public ImageIcon getMapPreview(int previewWidth) {
        if (mapPreviewIcon == null) {
            mapPreview = new BufferedImage(previewWidth, previewWidth, BufferedImage.TYPE_INT_ARGB);
            Graphics g = mapPreview.getGraphics();
            drawMap(g);
            mapPreviewIcon = new ImageIcon(mapPreview);
        }
        return mapPreviewIcon;
    }

    /**
     * draws all map tiles to Graphics object
     */
    private void drawMap(Graphics g) {
        int mapWidth = mapMap.getWidth();
        int mapHeight = mapMap.getHeight();
        int tileWidth = mapMap.getTileWidth();
        int tileHeight = mapMap.getTileHeight();
        int tileSize = mapMap.getTileSize();
        int mapAreaWidth = mapWidth * tileSize;
        int mapAreaHeight = mapHeight * tileSize;
        int mapAreaX = (previewWidth - mapAreaWidth) / 2;
        int mapAreaY = (previewWidth - mapAreaHeight) / 2;
        mapArea = new Point(mapAreaX, mapAreaY);
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                int tileX = x * tileSize;
                int tileY = y * tileSize;
                int tileType = mapMap.getTileType(x, y);
                String tileFileName = mapMap.getTileFileName(x, y);
                drawTile(g, new Point(tileX, tileY), tileFileName, false);
            }
        }
    }

    /**
     * method for scaling/resizing BufferedImages to target width
     *
     * @param bi -
     *            BufferedImage
     * @param targetWidth -
     *            target width of resized image
     * @return BufferedImage - with map preview
     */
    private BufferedImage scale(BufferedImage bi, int targetWidth) {
        int imageWidth = bi.getWidth();
        int imageHeight = bi.getHeight();
        double scale = (double) targetWidth / (double) imageWidth;
        int scaledWidth = (int) (imageWidth * scale);
        int scaledHeight = (int) (imageHeight * scale);
        BufferedImage scaledBI = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics g = scaledBI.getGraphics();
        g.drawImage(bi, 0, 0, scaledWidth, scaledHeight, null);
        return scaledBI;
    }

    public Image LoadImage(String fileName) {
        Image image = null;
        try {
            image = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            logger.error("Could not load image " + fileName);
        }
        return image;
    }

    /**
     * draws tile at specific position
     *
     * @param g2d -
     *            Graphics2D object
     * @param position -
     *            Point, coordinates
     * @param fileName -
     *            String, name of file, w/o path and ending
     * @param middle -
     *            is the position of element set to middle, correct the upper
     *            left coordinate
     */
    public void drawTile(Graphics g, Point position, String fileName, Boolean middle) {
        Image image = null;
        if (fileName.equals("wall")) {
            if (TILE_WALL_IMAGE == null) {
                TILE_WALL_IMAGE = LoadImage("images/wall.png");
            }
            image = TILE_WALL_IMAGE;
        } else if (fileName.equals("stone")) {
            if (TILE_STONE_IMAGE == null) {
                TILE_STONE_IMAGE = LoadImage("images/stone.png");
            }
            image = TILE_STONE_IMAGE;
        } else {
            image = LoadImage("images/" + mapImageSet + "/" + fileName + ".png");
        }
        if (image != null) {
            int imageWidth = image.getWidth(null);
            int imageHeight = image.getHeight(null);
            int tileSize = mapMap.getTileSize();
            int tileX = position.x;
            int tileY = position.y;
            if (middle) {
                tileX = tileX + (tileSize - imageWidth) / 2;
                tileY = tileY + (tileSize - imageHeight) / 2;
            }
            g.drawImage(image, tileX, tileY, null);
        }
    }
}

// MapPreviewTest.java
package common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapPreview}.
* It contains ten unit test cases for the {@link MapPreview#getMapPreview(int)} method.
*/
class MapPreviewTest {
		
    private static final Logger logger = Logger.getLogger(MapPreviewTest.class);

    /**
    * Test of {@link MapPreview#getMapPreview(int)} method, of class {@link MapPreview}.
    */
    @Test
    void testGetMapPreview() {
        logger.info("getMapPreview");
        Map map = new Map();
        MapPreview instance = new MapPreview(map);
        int previewWidth = 150;
        ImageIcon expResult = null;
        ImageIcon result = instance.getMapPreview(previewWidth);
        assertEquals(expResult, result);
    }
}

// MapPreview.java
package common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;

