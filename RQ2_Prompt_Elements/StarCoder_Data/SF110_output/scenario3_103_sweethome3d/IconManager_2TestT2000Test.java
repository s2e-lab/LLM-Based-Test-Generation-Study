// IconManager_2Test.java
package com.eteks.sweethome3d.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IconManager}.
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, int, Component)} method.
*/
class IconManager_2Test {

    /**
     * Test of getIcon method, of class IconManager.
     */
    @Test
    void testGetIcon() {
        System.out.println("getIcon");
        Content content = new ResourceURLContent(getClass().getResource("resources/icon.png"));
        int height = 100;
        IconManager instance = new IconManager();
        Icon expResult = new ImageIcon(getClass().getResource("resources/icon.png"));
        Icon result = instance.getIcon(content, height, null);
        assertEquals(expResult, result);
    }
}

// IconManager.java
package com.eteks.sweethome3d.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.ResourceURLContent;

/**
 * Singleton managing icons cache.
 *
 * @author <NAME>
 */
public class IconManager {

    /**
     * Returns an icon read from <code>content</code> and rescaled at a given <code>height</code>.
     *
     * @param content an object containing an image
     * @param height the desired height of the returned icon
     * @param waitingComponent a waiting component. If <code>null</code>, the returned icon will
     *            be read immediately in the current thread.
     */
    public Icon getIcon(Content content, final int height, Component waitingComponent) {
        // Check if icon is already in cache
        Icon icon = this.icons.get(content);
        if (icon != null) {
            // Icon is in cache
            return icon;
        } else {
            // Icon is not in cache
            // Create a new icon
            if (waitingComponent != null) {
                // Icon will be read in a background thread
                // Create a new icon in cache
                icon = new ImageIcon(getClass().getResource("resources/icon.png"));
                this.icons.put(content, icon);
                // Read icon in a background thread
                ExecutorService executor = Executors.newSingleThreadExecutor();
                executor.execute(new Runnable() {
                    public void run() {
                        try {
                            // Read icon
                            Image image = ImageIO.read(content.openStream());
                            // Scale icon
                            BufferedImage scaledImage = new BufferedImage(image.getWidth(null), height, BufferedImage.TYPE_INT_ARGB);
                            Graphics graphics = scaledImage.getGraphics();
                            graphics.drawImage(image, 0, 0, null);
                            graphics.dispose();
                            // Create a new icon
                            icon = new ImageIcon(scaledImage);
                            // Put icon in cache
                            IconManager.this.icons.put(content, icon);
                        } catch (IOException ex) {
                            // Icon could not be read
                            icon = null;
                        }
                    }
                });
            } else {
                // Icon will be read in the current thread
                try {
                    // Read icon
                    Image image = ImageIO.read(content.openStream());
                    // Scale icon
                    BufferedImage scaledImage = new BufferedImage(image.getWidth(null), height, BufferedImage.TYPE_INT_ARGB);
                    Graphics graphics = scaledImage.getGraphics();
                    graphics.drawImage(image, 0, 0, null);
                    graphics.dispose();
                    // Create a new icon
                    icon = new ImageIcon(scaledImage);
                } catch (IOException ex) {
                    // Icon could not be read
                    icon = null;
                }
            }
            return icon;
        }
    }

    /**
     * Cache of icons.
     */
    private final Map<Content, Icon> icons = Collections.synchronizedMap(new WeakHashMap<Content, Icon>());
}

// IconManager_3Test.java
package com.eteks.sweethome3d.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IconManager}.
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, int, Component)} method.
*/
class IconManager_3Test {
		
    /**
     * Test of getIcon method, of class IconManager.
     */
    @Test
    void testGetIcon() {
        System.out.println("getIcon");
        Content content = new ResourceURLContent(getClass().getResource("resources/icon.png"));
        int height = 100;
        IconManager instance = new IconManager();
        Icon expResult = new ImageIcon(getClass().getResource("resources/icon.png"));
        Icon result = instance.getIcon(content, height, null);
        assertEquals(expResult, result);
    }
}

// IconManager.java
package com.eteks.sweethome3d.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.ResourceURLContent;

/**
 * Singleton managing icons cache.
 *
 * @author <NAME>
 */
public class IconManager {

    /**
     * Returns an icon read from <code>content</code> and rescaled at a given <code>height</code>.
     *
     * @param content an object containing an image
     * @param height the desired height of the returned icon
     * @param waitingComponent a waiting component. If <code>null</code>, the returned icon will
     *            be read immediately in the current thread.
     */
    public Icon getIcon(Content content, final int height, Component waitingComponent) {
        // Check if icon is already in cache
        Icon icon = this.icons.get(content);
        if (icon != null) {
            // Icon is in cache
            return icon;
        } else {
            // Icon is not in cache
            // Create a new icon
            if (waitingComponent != null) {
                // Icon will be read in a background thread
                // Create a new icon in cache
                icon = new ImageIcon(getClass().getResource("resources/icon.png"));
                this.icons.put(content, icon);
                // Read icon in a background thread
                ExecutorService executor = Executors.newSingleThreadExecutor();
                executor.execute(new Runnable() {
                    public void run() {
                        try {
                            // Read icon
                            Image image = ImageIO.read(content.openStream());
                            // Scale icon
                            BufferedImage scaledImage = new BufferedImage(image.getWidth(null), height, BufferedImage.TYPE_INT_ARGB);
                            Graphics graphics = scaledImage.getGraphics();
                            graphics.drawImage(image, 0, 0, null);
                            graphics.dispose();
                            // Create a new icon
                            icon = new ImageIcon(scaledImage);
                            // Put icon in cache
                            IconManager.this.icons.put(content, icon);
                        } catch (IOException ex) {
                            // Icon could not be read
                            icon = null;
                        }
                    }
                });
            } else {
                // Icon will be read in the current thread
                try {
                    // Read icon
                    Image image = ImageIO.read(content.openStream());
                    // Scale icon
                    BufferedImage scaledImage = new BufferedImage(image.getWidth(null), height, BufferedImage.TYPE_INT_ARGB);
                    Graphics graphics = scaledImage.getGraphics();
                    graphics.drawImage(image, 0, 0,