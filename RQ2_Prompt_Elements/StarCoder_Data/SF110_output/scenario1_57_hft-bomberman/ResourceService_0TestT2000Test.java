// ResourceService_0Test.java
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
* It contains ten unit test cases for the {@link ResourceService#getImage(String)} method.
*/
class ResourceService_0Test {

    @Test
    void getImage_0() {
        Image image = ResourceService.getImage("images/player.png");
        assertNotNull(image);
    }

    @Test
    void getImage_1() {
        Image image = ResourceService.getImage("images/player.jpg");
        assertNotNull(image);
    }

    @Test
    void getImage_2() {
        Image image = ResourceService.getImage("images/player.gif");
        assertNotNull(image);
    }

    @Test
    void getImage_3() {
        Image image = ResourceService.getImage("images/player.bmp");
        assertNotNull(image);
    }

    @Test
    void getImage_4() {
        Image image = ResourceService.getImage("images/player.jpeg");
        assertNotNull(image);
    }

    @Test
    void getImage_5() {
        Image image = ResourceService.getImage("images/player.tiff");
        assertNotNull(image);
    }

    @Test
    void getImage_6() {
        Image image = ResourceService.getImage("images/player.tif");
        assertNotNull(image);
    }

    @Test
    void getImage_7() {
        Image image = ResourceService.getImage("images/player.ico");
        assertNotNull(image);
    }

    @Test
    void getImage_8() {
        Image image = ResourceService.getImage("images/player.icns");
        assertNotNull(image);
    }

    @Test
    void getImage_9() {
        Image image = ResourceService.getImage("images/player.svg");
        assertNotNull(image);
    }
}
