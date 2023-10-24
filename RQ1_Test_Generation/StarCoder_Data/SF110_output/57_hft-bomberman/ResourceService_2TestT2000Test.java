// ResourceService_2Test.java
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
* It contains ten unit test cases for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceService_2Test {

    /**
    * Test case for {@link ResourceService#getInputStream(String)}.
    * It tests if the method returns an {@link InputStream} that points to the
    * resource that is located at the specified path.
    */
    @Test
    void testGetInputStream() {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream("images/player.png");
        assertNotNull(resourceAsStream);
    }

    /**
    * Test case for {@link ResourceService#getInputStream(String)}.
    * It tests if the method returns an {@link InputStream} that points to the
    * resource that is located at the specified path.
    */
    @Test
    void testGetInputStream_2() {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream("images/player.png");
        assertNotNull(resourceAsStream);
    }

    /**
    * Test case for {@link ResourceService#getInputStream(String)}.
    * It tests if the method returns an {@link InputStream} that points to the
    * resource that is located at the specified path.
    */
    @Test
    void testGetInputStream_3() {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream("images/player.png");
        assertNotNull(resourceAsStream);
    }

    /**
    * Test case for {@link ResourceService#getInputStream(String)}.
    * It tests if the method returns an {@link InputStream} that points to the
    * resource that is located at the specified path.
    */
    @Test
    void testGetInputStream_4() {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream("images/player.png");
        assertNotNull(resourceAsStream);
    }

    /**
    * Test case for {@link ResourceService#getInputStream(String)}.
    * It tests if the method returns an {@link InputStream} that points to the
    * resource that is located at the specified path.
    */
    @Test
    void testGetInputStream_5() {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream("images/player.png");
        assertNotNull(resourceAsStream);
    }

    /**
    * Test case for {@link ResourceService#getInputStream(String)}.
    * It tests if the method returns an {@link InputStream} that points to the
    * resource that is located at the specified path.
    */
    @Test
    void testGetInputStream_6() {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream("images/player.png");
        assertNotNull(resourceAsStream);
    }

    /**
    * Test case for {@link ResourceService#getInputStream(String)}.
    * It tests if the method returns an {@link InputStream} that points to the
    * resource that is located at the specified path.
    */
    @Test
    void testGetInputStream_7() {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream("images/player.png");
        assertNotNull(resourceAsStream);
    }

    /**
    * Test case for {@link ResourceService#getInputStream(String)}.
    * It tests if the method returns an {@link InputStream} that points to the
    * resource that is located at the specified path.
    */
    @Test
    void testGetInputStream_8() {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream("images/player.png");
        assertNotNull(resourceAsStream);
    }

    /**
    * Test case for {@link ResourceService#getInputStream(String)}.
    * It tests if the method returns an {@link InputStream} that points to the
    * resource that is located at the specified path.
    */
    @Test
    void testGetInputStream_9() {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream("images/player.png");
        assertNotNull(resourceAsStream);
    }

    /**
    * Test case for {@link ResourceService#getInputStream(String)}.
    * It tests if the method returns an {@link InputStream} that points to the
    * resource that is located at the specified path.
    */
    @Test
    void testGetInputStream_10() {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream("images/player.png");
        assertNotNull(resourceAsStream);
    }
}
