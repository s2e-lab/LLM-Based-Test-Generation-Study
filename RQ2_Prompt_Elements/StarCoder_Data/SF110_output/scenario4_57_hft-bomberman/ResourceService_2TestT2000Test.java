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
     * Test of {@link ResourceService#getInputStream(String)}
     * when the path is null.
     */
    @Test
    void testGetInputStream_nullPath() {
        ResourceService instance = new ResourceService();
        InputStream expResult = null;
        InputStream result = instance.getInputStream(null);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link ResourceService#getInputStream(String)}
     * when the path is empty.
     */
    @Test
    void testGetInputStream_emptyPath() {
        ResourceService instance = new ResourceService();
        InputStream expResult = null;
        InputStream result = instance.getInputStream("");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link ResourceService#getInputStream(String)}
     * when the path is not empty but the resource does not exist.
     */
    @Test
    void testGetInputStream_notExistingPath() {
        ResourceService instance = new ResourceService();
        InputStream expResult = null;
        InputStream result = instance.getInputStream("notExistingPath");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link ResourceService#getInputStream(String)}
     * when the path is not empty and the resource exists.
     */
    @Test
    void testGetInputStream_existingPath() {
        ResourceService instance = new ResourceService();
        InputStream result = instance.getInputStream("common/ResourceService.class");
        assertNotNull(result);
    }
}

// ResourceService_2.java
package common;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * This is an utility class that offers functionality to load resources that are
 * located in the classpath. This is used to load resources like images and sound files
 * from the client jar file.
 *
 * @author andi
 */
public class ResourceService {

    /**
     * Loads the {@link Image} that is located at the specified path.
     * @param path The location of the image within the classpath.
     * @return The loaded {@link Image} or null if there was an IOException while trying
     * to read the image from a stream.
     */
    public Image getImage(String path) {
        InputStream stream = getInputStream(path);
        if (stream == null) {
            return null;
        }
        try {
            return ImageIO.read(stream);
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * Loads the {@link ImageIcon} that is located at the specified path.
     * @param path The location of the image within the classpath.
     * @return The loaded {@link ImageIcon}
     */
    public ImageIcon getImageIcon(String path) {
        return new ImageIcon(getImage(path));
    }

    /**
     * Creates a connection to the resource that is located at the specified
     * path via an {@link InputStream}.
     * @param path The location of the resource within the classpath.
     * @return The {@link InputStream} that points the requested resource.
     */
    public InputStream getInputStream(String path) {
        return getClass().getClassLoader().getResourceAsStream(path);
    }
}

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
* It contains ten unit test cases for the {@link ResourceService#getImage(String)} method.
*/
class ResourceService_1Test {
		
    /**
     * Test of {@link ResourceService#getImage(String)}
     * when the path is null.
     */
    @Test
    void testGetImage_nullPath() {
        ResourceService instance = new ResourceService();
        Image expResult = null;
        Image result = instance.getImage(null);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link ResourceService#getImage(String)}
     * when the path is empty.
     */
    @Test
    void testGetImage_emptyPath() {
        ResourceService instance = new ResourceService();
        Image expResult = null;
        Image result = instance.getImage("");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link ResourceService#getImage(String)}
     * when the path is not empty but the resource does not exist.
     */
    @Test
    void testGetImage_notExistingPath() {
        ResourceService instance = new ResourceService();
        Image expResult = null;
        Image result = instance.getImage("notExistingPath");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link ResourceService#getImage(String)}
     * when the path is not empty and the resource exists.
     */
    @Test
    void testGetImage_existingPath() {
        ResourceService instance = new ResourceService();
        Image result = instance.getImage("common/ResourceService.class");
        assertNotNull(result);
    }
}

// ResourceService_1.java
package common;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * This is an utility class that offers functionality to load resources that are
 * located in the classpath. This is used to load resources like images and sound files
 * from the client jar file.
 *
 * @author andi
 */
public class ResourceService {

    /**
     * Loads the {@link Image} that is located at the specified path.
     * @param path The location of the image within the classpath.
     * @return The loaded {@link Image} or null if there was an IOException while trying
     * to read the image from a stream.
     */
    public Image getImage(String path) {
        InputStream stream = getInputStream(path);
        if (stream == null) {
            return null;
        }
        try {
            return ImageIO.read(stream);
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * Loads the {@link ImageIcon} that is located at the specified path.
     * @param path The location of the image within the classpath.
     * @return The loaded {@link ImageIcon}
     */
    public ImageIcon getImageIcon(String path) {
        return new ImageIcon(getImage(path));
    }

    /**
     * Creates a connection to the resource that is located at the specified
     * path via an {@link InputStream}.
     * @param path The location of the resource within the classpath.
     * @return The {@link InputStream} that points the requested resource.
     */
    public InputStream getInputStream(String path) {
        return getClass().getClassLoader().getResourceAsStream(path);
    }
}

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
* It contains ten unit test cases for the {@link ResourceService#getImageIcon(String)} method.
*/
class ResourceService_0Test {
		
    /**
     * Test of {@link ResourceService#getImageIcon(String)}
     * when the path is null.
     */
    @Test
    void testGetImageIcon_nullPath() {
        ResourceService instance = new ResourceService();
        ImageIcon expResult = null;
        ImageIcon result = instance.getImageIcon(null);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link ResourceService#getImageIcon(String)}
     * when the path is empty.
     */
    @Test
    void testGetImageIcon_emptyPath() {
        ResourceService instance = new ResourceService();
        ImageIcon expResult = null;
        ImageIcon result = instance.getImageIcon("");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link ResourceService#getImageIcon(String)}
     * when the path is not empty but the resource does not exist.
     */
    @Test
    void testGetImageIcon_notExistingPath() {
        ResourceService instance = new ResourceService();
        ImageIcon expResult = null;
        ImageIcon result = instance.getImageIcon("notExistingPath");
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link ResourceService#getImageIcon(String)}
     * when the path is not empty and the resource exists.
     */
    @Test
    void testGetImageIcon_existingPath() {
        ResourceService instance = new ResourceService();
        ImageIcon result = instance.getImageIcon("common/ResourceService.class");
        assertNotNull(