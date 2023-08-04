// ResourceService_1Test.java
package common;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ResourceService}.
* It contains ten unit test cases for the {@link ResourceService#getImageIcon(String)} method.
*/
class ResourceService_1Test {

    /**
    * Test case for {@link ResourceService#getImageIcon(String)}.
    * It tests the method with a valid path.
    */
    @Test
    void getImageIcon_1() {
        ImageIcon imageIcon = ResourceService.getImageIcon("images/icon.png");
        assertNotNull(imageIcon);
    }

    /**
    * Test case for {@link ResourceService#getImageIcon(String)}.
    * It tests the method with a valid path.
    */
    @Test
    void getImageIcon_2() {
        ImageIcon imageIcon = ResourceService.getImageIcon("images/icon.jpg");
        assertNotNull(imageIcon);
    }

    /**
    * Test case for {@link ResourceService#getImageIcon(String)}.
    * It tests the method with a valid path.
    */
    @Test
    void getImageIcon_3() {
        ImageIcon imageIcon = ResourceService.getImageIcon("images/icon.gif");
        assertNotNull(imageIcon);
    }

    /**
    * Test case for {@link ResourceService#getImageIcon(String)}.
    * It tests the method with a valid path.
    */
    @Test
    void getImageIcon_4() {
        ImageIcon imageIcon = ResourceService.getImageIcon("images/icon.bmp");
        assertNotNull(imageIcon);
    }

    /**
    * Test case for {@link ResourceService#getImageIcon(String)}.
    * It tests the method with a valid path.
    */
    @Test
    void getImageIcon_5() {
        ImageIcon imageIcon = ResourceService.getImageIcon("images/icon.jpeg");
        assertNotNull(imageIcon);
    }

    /**
    * Test case for {@link ResourceService#getImageIcon(String)}.
    * It tests the method with a valid path.
    */
    @Test
    void getImageIcon_6() {
        ImageIcon imageIcon = ResourceService.getImageIcon("images/icon.ico");
        assertNotNull(imageIcon);
    }

    /**
    * Test case for {@link ResourceService#getImageIcon(String)}.
    * It tests the method with a valid path.
    */
    @Test
    void getImageIcon_7() {
        ImageIcon imageIcon = ResourceService.getImageIcon("images/icon.tif");
        assertNotNull(imageIcon);
    }

    /**
    * Test case for {@link ResourceService#getImageIcon(String)}.
    * It tests the method with a valid path.
    */
    @Test
    void getImageIcon_8() {
        ImageIcon imageIcon = ResourceService.getImageIcon("images/icon.tiff");
        assertNotNull(imageIcon);
    }

    /**
    * Test case for {@link ResourceService#getImageIcon(String)}.
    * It tests the method with a valid path.
    */
    @Test
    void getImageIcon_9() {
        ImageIcon imageIcon = ResourceService.getImageIcon("images/icon.svg");
        assertNotNull(imageIcon);
    }

    /**
    * Test case for {@link ResourceService#getImageIcon(String)}.
    * It tests the method with a valid path.
    */
    @Test
    void getImageIcon_10() {
        ImageIcon imageIcon = ResourceService.getImageIcon("images/icon.svgz");
        assertNotNull(imageIcon);
    }
}
