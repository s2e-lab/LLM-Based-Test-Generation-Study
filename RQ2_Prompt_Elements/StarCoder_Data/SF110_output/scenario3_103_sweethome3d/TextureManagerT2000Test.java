// TextureManagerTest.java
package com.eteks.sweethome3d.j3d;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.media.j3d.ImageComponent;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.Texture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.URLContent;
import com.sun.j3d.utils.image.TextureLoader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextureManager}.
* It contains ten unit test cases for the {@link TextureManager#getInstance()} method.
*/
class TextureManagerTest {

    /**
     * Test method for {@link TextureManager#getInstance()}.
     */
    @Test
    void testGetInstance() {
        // Test that the method returns the same instance
        TextureManager textureManager1 = TextureManager.getInstance();
        TextureManager textureManager2 = TextureManager.getInstance();
        assertEquals(textureManager1, textureManager2);
    }
}

// TextureManager.java
package com.eteks.sweethome3d.j3d;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.media.j3d.ImageComponent;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.Texture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.URLContent;
import com.sun.j3d.utils.image.TextureLoader;

/**
 * Singleton managing texture image cache.
 *
 * @author <NAME>
 */
public class TextureManager {

    /**
     * Returns an instance of this singleton.
     */
    public static TextureManager getInstance() {
        return textureManager;
    }

    private static final TextureManager textureManager = new TextureManager();

    private final Map<Content, WeakReference<Texture>> textures = new WeakHashMap<Content, WeakReference<Texture>>();
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    private TextureManager() {
    }

    /**
     * Returns a texture for the given content.
     */
    public Texture getTexture(Content content) {
        Texture texture = null;
        WeakReference<Texture> textureReference = textures.get(content);
        if (textureReference != null) {
            texture = textureReference.get();
        }
        if (texture == null) {
            texture = loadTexture(content);
            if (texture != null) {
                textures.put(content, new WeakReference<Texture>(texture));
            }
        }
        return texture;
    }

    /**
     * Loads a texture for the given content.
     */
    private Texture loadTexture(final Content content) {
        final Texture texture = new TextureLoader(content.getURL().toString(), executorService) {
            @Override
            protected void loadTexture(final ImageComponent2D imageComponent) {
                // Create a buffered image to draw the texture on it
                final BufferedImage bufferedImage = new BufferedImage(imageComponent.getWidth(), imageComponent.getHeight(), BufferedImage.TYPE_INT_ARGB);
                final Graphics2D graphics = bufferedImage.createGraphics();
                // Draw the texture on the buffered image
                graphics.setColor(Color.WHITE);
                graphics.fillRect(0, 0, imageComponent.getWidth(), imageComponent.getHeight());
                graphics.drawImage(imageComponent.getImage(), 0, 0, null);
                graphics.dispose();
                // Create an image component to display the buffered image
                final ImageComponent bufferedImageComponent = new ImageComponent(true, true);
                bufferedImageComponent.setImage(bufferedImage);
                // Set the buffered image component as the texture image
                imageComponent.setImage(bufferedImageComponent);
            }
        };
        try {
            texture.loadTexture();
        } catch (IOException ex) {
            // Ignore exception
        }
        return texture;
    }
}

// TextureManagerTest.java
package com.eteks.sweethome3d.j3d;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.media.j3d.ImageComponent;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.Texture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.URLContent;
import com.sun.j3d.utils.image.TextureLoader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextureManager}.
* It contains ten unit test cases for the {@link TextureManager#getTexture(Content)} method.
*/
class TextureManagerTest {
		
    /**
     * Test method for {@link TextureManager#getTexture(Content)}.
     */
    @Test
    void testGetTexture() {
        // Test that the method returns the same texture for the same content
        TextureManager textureManager = TextureManager.getInstance();
        Content content = new URLContent("http://www.eteks.com/images/logo.png");
        Texture texture1 = textureManager.getTexture(content);
        Texture texture2 = textureManager.getTexture(content);
        assertEquals(texture1, texture2);
    }

    /**
     * Test method for {@link TextureManager#getTexture(Content)}.
     */
    @Test
    void testGetTextureDifferentContent() {
        // Test that the method returns different textures for different contents
        TextureManager textureManager = TextureManager.getInstance();
        Content content1 = new URLContent("http://www.eteks.com/images/logo.png");
        Content content2 = new URLContent("http://www.eteks.com/images/logo.png");
        Texture texture1 = textureManager.getTexture(content1);
        Texture texture2 = textureManager.getTexture(content2);
        assertNotEquals(texture1, texture2);
    }

    /**
     * Test method for {@link TextureManager#getTexture(Content)}.
     */
    @Test
    void testGetTextureDifferentContentDifferentURL() {
        // Test that the method returns different textures for different contents
        TextureManager textureManager = TextureManager.getInstance();
        Content content1 = new URLContent("http://www.eteks.com/images/logo.png");
        Content content2 = new URLContent("http://www.eteks.com/images/logo.gif");
        Texture texture1 = textureManager.getTexture(content1);
        Texture texture2 = textureManager.getTexture(content2);
        assertNotEquals(texture1, texture2);
    }

    /**
     * Test method for {@link TextureManager#getTexture(Content)}.
     */
    @Test
    void testGetTextureDifferentContentDifferentURLDifferentContent() {
        // Test that the method returns different textures for different contents
        TextureManager textureManager = TextureManager.getInstance();
        Content content1 = new URLContent("http://www.eteks.com/images/logo.png");
        Content content2 = new URLContent("http://www.eteks.com/images/logo.gif");
        Texture texture1 = textureManager.getTexture(content1);
        Texture texture2 = textureManager.getTexture(content2);
        assertNotEquals(texture1, texture2);
    }

    /**
     * Test method for {@link TextureManager#getTexture(Content)}.
     */
    @Test
    void testGetTextureDifferentContentDifferentURLDifferentContentDifferentURL() {
        // Test that the method returns different textures for different contents
        TextureManager textureManager = TextureManager.getInstance();
        Content content1 = new URLContent("http://www.eteks.com/images/logo.png");
        Content content2 = new URLContent("http://www.eteks.com/images/logo.gif");
        Texture texture1 = textureManager.getTexture(content1);
        Texture texture2 = textureManager.getTexture(content2);
        assertNotEquals(texture1, texture2);
    }

    /**
     * Test method for {@link TextureManager#getTexture(Content)}.
     */
    @Test
    void testGetTextureDifferentContentDifferentURLDifferentContentDifferentURLDifferentContent() {
        // Test that the method returns different textures for different contents
        TextureManager textureManager = TextureManager.getInstance();
        Content content1 = new URLContent("http://www.eteks.com/images/logo.png");
        Content content2 = new URLContent("http://www.eteks.com/images/logo.gif");
        Texture texture1 = textureManager.getTexture(content1);