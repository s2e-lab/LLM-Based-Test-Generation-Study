// MapPreview_0Test.java
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
class MapPreview_0Test {

    private static final Logger logger = Logger.getLogger(MapPreview_0Test.class);

    /**
    * Test of {@link MapPreview#getMapPreview(int)} method, of class {@link MapPreview}.
    */
    @Test
    void testGetMapPreview() {
        logger.info("getMapPreview");
        Map map = new Map();
        MapPreview instance = new MapPreview(map);
        ImageIcon expResult = null;
        ImageIcon result = instance.getMapPreview(150);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link MapPreview#setImageSet(String)} method, of class {@link MapPreview}.
    */
    @Test
    void testSetImageSet() {
        logger.info("setImageSet");
        String imageSet = "";
        MapPreview instance = new MapPreview(new Map());
        instance.setImageSet(imageSet);
    }

    /**
    * Test of {@link MapPreview#drawTile(Graphics, Point, String, Boolean)} method, of class {@link MapPreview}.
    */
    @Test
    void testDrawTile() {
        logger.info("drawTile");
        Graphics g = null;
        Point position = null;
        String fileName = "";
        Boolean middle = false;
        MapPreview instance = new MapPreview(new Map());
        instance.drawTile(g, position, fileName, middle);
    }

    /**
    * Test of {@link MapPreview#LoadImage(String)} method, of class {@link MapPreview}.
    */
    @Test
    void testLoadImage() {
        logger.info("LoadImage");
        String fileName = "";
        MapPreview instance = new MapPreview(new Map());
        Image expResult = null;
        Image result = instance.LoadImage(fileName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link MapPreview#scale(BufferedImage, int)} method, of class {@link MapPreview}.
    */
    @Test
    void testScale() {
        logger.info("scale");
        BufferedImage bi = null;
        int targetWidth = 0;
        MapPreview instance = new MapPreview(new Map());
        BufferedImage expResult = null;
        BufferedImage result = instance.scale(bi, targetWidth);
        assertEquals(expResult, result);
    }
}

// MapPreview_1Test.java
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
class MapPreview_1Test {
		
    private static final Logger logger = Logger.getLogger(MapPreview_1Test.class);

    /**
    * Test of {@link MapPreview#getMapPreview(int)} method, of class {@link MapPreview}.
    */
    @Test
    void testGetMapPreview() {
        logger.info("getMapPreview");
        Map map = new Map();
        MapPreview instance = new MapPreview(map);
        ImageIcon expResult = null;
        ImageIcon result = instance.getMapPreview(150);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link MapPreview#setImageSet(String)} method, of class {@link MapPreview}.
    */
    @Test
    void testSetImageSet() {
        logger.info("setImageSet");
        String imageSet = "";
        MapPreview instance = new MapPreview(new Map());
        instance.setImageSet(imageSet);
    }

    /**
    * Test of {@link MapPreview#drawTile(Graphics, Point, String, Boolean)} method, of class {@link MapPreview}.
    */
    @Test
    void testDrawTile() {
        logger.info("drawTile");
        Graphics g = null;
        Point position = null;
        String fileName = "";
        Boolean middle = false;
        MapPreview instance = new MapPreview(new Map());
        instance.drawTile(g, position, fileName, middle);
    }

    /**
    * Test of {@link MapPreview#LoadImage(String)} method, of class {@link MapPreview}.
    */
    @Test
    void testLoadImage() {
        logger.info("LoadImage");
        String fileName = "";
        MapPreview instance = new MapPreview(new Map());
        Image expResult = null;
        Image result = instance.LoadImage(fileName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link MapPreview#scale(BufferedImage, int)} method, of class {@link MapPreview}.
    */
    @Test
    void testScale() {
        logger.info("scale");
        BufferedImage bi = null;
        int targetWidth = 0;
        MapPreview instance = new MapPreview(new Map());
        BufferedImage expResult = null;
        BufferedImage result = instance.scale(bi, targetWidth);
        assertEquals(expResult, result);
    }
}

// MapPreview_2Test.java
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
class MapPreview_2Test {
		
    private static final Logger logger = Logger.getLogger(MapPreview_2Test.class);

    /**
    * Test of {@link MapPreview#getMapPreview(int)} method, of class {@link MapPreview}.
    */
    @Test
    void testGetMapPreview() {
        logger.info("getMapPreview");
        Map map = new Map();
        MapPreview instance = new MapPreview(map);
        ImageIcon expResult = null;
        ImageIcon result = instance.getMapPreview(150);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link MapPreview#setImageSet(String)} method, of class {@link MapPreview}.
    */
    @Test
    void testSetImageSet() {
        logger.info("setImageSet");
        String imageSet = "";
        MapPreview instance = new MapPreview(new Map());
        instance.setImageSet(imageSet);
    }

    /**
    * Test of {@link MapPreview#drawTile(Graphics, Point, String, Boolean)} method, of class {@link MapPreview}.
    */
    @Test
    void testDrawTile() {
        logger.info("drawTile");
        Graphics g = null;
        Point position = null;
        String fileName = "";
        Boolean middle = false;
        MapPreview instance = new MapPreview(new Map());
        instance.drawTile(g, position, fileName, middle);
    }

    /**
    * Test of {@link MapPreview#LoadImage(String)} method, of class {@link MapPreview}.
    */
    @Test
    void testLoadImage() {
        logger.info("LoadImage");
        String fileName = "";
        MapPreview instance = new MapPreview(new Map());
        Image expResult = null;
        Image result = instance.LoadImage(fileName);
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link MapPreview#scale(BufferedImage, int)} method, of class {@link MapPreview}.
    */
    @Test
    void testScale() {
        logger.info("scale");
        BufferedImage bi = null;
        int targetWidth = 0;
        MapPreview instance = new MapPreview(new Map());
        BufferedImage expResult = null;
        BufferedImage result = instance.scale(bi, targetWidth);
        assertEquals(expResult, result);
    }
}

// MapPreview_3Test.java
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
import org.apache.log4j.