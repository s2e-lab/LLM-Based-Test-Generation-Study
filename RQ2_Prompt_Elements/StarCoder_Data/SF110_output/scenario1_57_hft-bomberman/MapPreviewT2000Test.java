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

    @Test
    void testGetMapPreview() {
        MapPreview mp = new MapPreview("test", new Point(0, 0), new Point(10, 10));
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }

    @Test
    void testGetMapPreview2() {
        MapPreview mp = new MapPreview("test", new Point(0, 0), new Point(10, 10));
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }

    @Test
    void testGetMapPreview3() {
        MapPreview mp = new MapPreview("test", new Point(0, 0), new Point(10, 10));
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }

    @Test
    void testGetMapPreview4() {
        MapPreview mp = new MapPreview("test", new Point(0, 0), new Point(10, 10));
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }

    @Test
    void testGetMapPreview5() {
        MapPreview mp = new MapPreview("test", new Point(0, 0), new Point(10, 10));
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }

    @Test
    void testGetMapPreview6() {
        MapPreview mp = new MapPreview("test", new Point(0, 0), new Point(10, 10));
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }

    @Test
    void testGetMapPreview7() {
        MapPreview mp = new MapPreview("test", new Point(0, 0), new Point(10, 10));
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }

    @Test
    void testGetMapPreview8() {
        MapPreview mp = new MapPreview("test", new Point(0, 0), new Point(10, 10));
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }

    @Test
    void testGetMapPreview9() {
        MapPreview mp = new MapPreview("test", new Point(0, 0), new Point(10, 10));
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }

    @Test
    void testGetMapPreview10() {
        MapPreview mp = new MapPreview("test", new Point(0, 0), new Point(10, 10));
        ImageIcon ii = mp.getMapPreview(150);
        assertNotNull(ii);
    }
}
