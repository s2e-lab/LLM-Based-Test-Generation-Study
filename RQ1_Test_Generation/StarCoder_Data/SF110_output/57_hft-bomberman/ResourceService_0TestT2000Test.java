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

    /**
    * Test case for {@link ResourceService#getImage(String)}.
    * It tests the loading of an image that is located in the root of the classpath.
    */
    @Test
    void getImage_0() {
        Image image = ResourceService.getImage("images/image.png");
        assertNotNull(image);
    }

    /**
    * Test case for {@link ResourceService#getImage(String)}.
    * It tests the loading of an image that is located in a subfolder of the classpath.
    */
    @Test
    void getImage_1() {
        Image image = ResourceService.getImage("images/subfolder/image.png");
        assertNotNull(image);
    }

    /**
    * Test case for {@link ResourceService#getImage(String)}.
    * It tests the loading of an image that is located in a subfolder of the classpath.
    */
    @Test
    void getImage_2() {
        Image image = ResourceService.getImage("images/subfolder/subsubfolder/image.png");
        assertNotNull(image);
    }

    /**
    * Test case for {@link ResourceService#getImage(String)}.
    * It tests the loading of an image that is located in a subfolder of the classpath.
    */
    @Test
    void getImage_3() {
        Image image = ResourceService.getImage("images/subfolder/subsubfolder/subsubsubfolder/image.png");
        assertNotNull(image);
    }

    /**
    * Test case for {@link ResourceService#getImage(String)}.
    * It tests the loading of an image that is located in a subfolder of the classpath.
    */
    @Test
    void getImage_4() {
        Image image = ResourceService.getImage("images/subfolder/subsubfolder/subsubsubfolder/subsubsubsubfolder/image.png");
        assertNotNull(image);
    }

    /**
    * Test case for {@link ResourceService#getImage(String)}.
    * It tests the loading of an image that is located in a subfolder of the classpath.
    */
    @Test
    void getImage_5() {
        Image image = ResourceService.getImage("images/subfolder/subsubfolder/subsubsubfolder/subsubsubsubfolder/subsubsubsubsubfolder/image.png");
        assertNotNull(image);
    }

    /**
    * Test case for {@link ResourceService#getImage(String)}.
    * It tests the loading of an image that is located in a subfolder of the classpath.
    */
    @Test
    void getImage_6() {
        Image image = ResourceService.getImage("images/subfolder/subsubfolder/subsubsubfolder/subsubsubsubfolder/subsubsubsubsubfolder/subsubsubsubsubsubfolder/image.png");
        assertNotNull(image);
    }

    /**
    * Test case for {@link ResourceService#getImage(String)}.
    * It tests the loading of an image that is located in a subfolder of the classpath.
    */
    @Test
    void getImage_7() {
        Image image = ResourceService.getImage("images/subfolder/subsubfolder/subsubsubfolder/subsubsubsubfolder/subsubsubsubsubfolder/subsubsubsubsubsubfolder/subsubsubsubsubsubsubfolder/image.png");
        assertNotNull(image);
    }

    /**
    * Test case for {@link ResourceService#getImage(String)}.
    * It tests the loading of an image that is located in a subfolder of the classpath.
    */
    @Test
    void getImage_8() {
        Image image = ResourceService.getImage("images/subfolder/subsubfolder/subsubsubfolder/subsubsubsubfolder/subsubsubsubsubfolder/subsubsubsubsubsubfolder/subsubsubsubsubsubsubfolder/subsubsubsubsubsubsubsubfolder/image.png");
        assertNotNull(image);
    }

    /**
    * Test case for {@link ResourceService#getImage(String)}.
    * It tests the loading of an image that is located in a subfolder of the classpath.
    */
    @Test
    void getImage_9() {
        Image image = ResourceService.getImage("images/subfolder/subsubfolder/subsubsubfolder/subsubsubsubfolder/subsubsubsubsubfolder/subsubsubsubsubsubfolder/subsubsubsubsubsubsubfolder/subsubsubsubsubsubsubsubfolder/subsubsubsubsubsubsubsubsubfolder/image.png");
        assertNotNull(image);
    }
}
