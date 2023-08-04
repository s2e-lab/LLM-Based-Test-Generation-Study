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
     * Test of getMapPreview method, of class MapPreview.
     */
    @Test
    void testGetMapPreview() {
        logger.info("getMapPreview");
        MapPreview instance = new MapPreview();
        int previewWidth = 150;
        ImageIcon expResult = null;
        ImageIcon result = instance.getMapPreview(previewWidth);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
