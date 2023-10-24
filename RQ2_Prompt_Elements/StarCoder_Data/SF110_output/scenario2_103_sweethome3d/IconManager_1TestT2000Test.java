// IconManager_1Test.java
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
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, Component)} method.
*/
class IconManager_1Test {

    /**
     * Test of getIcon method, of class IconManager.
     */
    @Test
    void testGetIcon() {
        System.out.println("getIcon");
        Content content = new ResourceURLContent(getClass().getResource("resources/icon.png"));
        IconManager instance = new IconManager();
        Icon icon = instance.getIcon(content, null);
        assertNotNull(icon);
        assertTrue(icon instanceof ImageIcon);
        ImageIcon imageIcon = (ImageIcon)icon;
        assertEquals(16, imageIcon.getIconWidth());
        assertEquals(16, imageIcon.getIconHeight());
        Image image = imageIcon.getImage();
        assertTrue(image instanceof BufferedImage);
        BufferedImage bufferedImage = (BufferedImage)image;
        assertEquals(16, bufferedImage.getWidth());
        assertEquals(16, bufferedImage.getHeight());
        assertEquals(1, bufferedImage.getTransparency());
        assertEquals(0, bufferedImage.getRGB(0, 0));
        assertEquals(0, bufferedImage.getRGB(15, 0));
        assertEquals(0, bufferedImage.getRGB(0, 15));
        assertEquals(0, bufferedImage.getRGB(15, 15));
    }
}

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
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, Component)} method.
*/
class IconManager_2Test {
		
    /**
     * Test of getIcon method, of class IconManager.
     */
    @Test
    void testGetIcon() {
        System.out.println("getIcon");
        Content content = new ResourceURLContent(getClass().getResource("resources/icon.png"));
        IconManager instance = new IconManager();
        Icon icon = instance.getIcon(content, null);
        assertNotNull(icon);
        assertTrue(icon instanceof ImageIcon);
        ImageIcon imageIcon = (ImageIcon)icon;
        assertEquals(16, imageIcon.getIconWidth());
        assertEquals(16, imageIcon.getIconHeight());
        Image image = imageIcon.getImage();
        assertTrue(image instanceof BufferedImage);
        BufferedImage bufferedImage = (BufferedImage)image;
        assertEquals(16, bufferedImage.getWidth());
        assertEquals(16, bufferedImage.getHeight());
        assertEquals(1, bufferedImage.getTransparency());
        assertEquals(0, bufferedImage.getRGB(0, 0));
        assertEquals(0, bufferedImage.getRGB(15, 0));
        assertEquals(0, bufferedImage.getRGB(0, 15));
        assertEquals(0, bufferedImage.getRGB(15, 15));
    }
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
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, Component)} method.
*/
class IconManager_3Test {
		
    /**
     * Test of getIcon method, of class IconManager.
     */
    @Test
    void testGetIcon() {
        System.out.println("getIcon");
        Content content = new ResourceURLContent(getClass().getResource("resources/icon.png"));
        IconManager instance = new IconManager();
        Icon icon = instance.getIcon(content, null);
        assertNotNull(icon);
        assertTrue(icon instanceof ImageIcon);
        ImageIcon imageIcon = (ImageIcon)icon;
        assertEquals(16, imageIcon.getIconWidth());
        assertEquals(16, imageIcon.getIconHeight());
        Image image = imageIcon.getImage();
        assertTrue(image instanceof BufferedImage);
        BufferedImage bufferedImage = (BufferedImage)image;
        assertEquals(16, bufferedImage.getWidth());
        assertEquals(16, bufferedImage.getHeight());
        assertEquals(1, bufferedImage.getTransparency());
        assertEquals(0, bufferedImage.getRGB(0, 0));
        assertEquals(0, bufferedImage.getRGB(15, 0));
        assertEquals(0, bufferedImage.getRGB(0, 15));
        assertEquals(0, bufferedImage.getRGB(15, 15));
    }
}

// IconManager_4Test.java
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
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, Component)} method.
*/
class IconManager_4Test {
		
    /**
     * Test of getIcon method, of class IconManager.
     */
    @Test
    void testGetIcon() {
        System.out.println("getIcon");
        Content content = new ResourceURLContent(getClass().getResource("resources/icon.png"));
        IconManager instance = new IconManager();
        Icon icon = instance.getIcon(content, null);
        assertNotNull(icon);
        assertTrue(icon instanceof ImageIcon);
        ImageIcon imageIcon = (ImageIcon)icon;
        assertEquals(16, imageIcon.getIconWidth());
        assertEquals(16, imageIcon.getIconHeight());
        Image image = imageIcon.getImage();
        assertTrue(image instanceof BufferedImage);
        BufferedImage bufferedImage = (BufferedImage)image;
        assertEquals(16, bufferedImage.getWidth());
        assertEquals(16, bufferedImage.getHeight());
        assertEquals(1, bufferedImage.getTransparency());
        assertEquals(0, bufferedImage.getRGB(0, 0));
        assertEquals(0, bufferedImage.getRGB(15, 0));
        assertEquals(0, bufferedImage.getRGB(0, 15));
        assertEquals(0, bufferedImage.getRGB(15, 15));
    }
}

// IconManager_5Test.java
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
import javax.