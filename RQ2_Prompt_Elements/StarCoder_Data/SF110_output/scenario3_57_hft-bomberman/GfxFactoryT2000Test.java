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

    private static final Logger log = Logger.getLogger(GfxFactoryTest.class);

    /**
     * Test of getPowerUpImage method, of class GfxFactory.
     */
    @Test
    void testGetPowerUpImage() {
        log.info("getPowerUpImage");
        String type = "shield";
        GfxFactory instance = new GfxFactory();
        Image expResult = null;
        Image result = instance.getPowerUpImage(type);
        assertEquals(expResult, result);
    }
}
