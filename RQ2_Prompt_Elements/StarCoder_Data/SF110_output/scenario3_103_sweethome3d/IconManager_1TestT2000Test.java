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
     * Test case for the {@link IconManager#getIcon(Content, Component)} method.
     */
    @Test
    void testGetIcon() {
        // Test with a null content
        IconManager iconManager = new IconManager();
        assertNull(iconManager.getIcon(null, null));
        
        // Test with a null waiting component
        iconManager = new IconManager();
        assertNull(iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), null));
        
        // Test with a waiting component
        iconManager = new IconManager();
        assertNull(iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), new Component() {
            @Override
            public void paint(Graphics g) {
                // Do nothing
            }
        }));
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
     * Test case for the {@link IconManager#getIcon(Content, Component)} method.
     */
    @Test
    void testGetIcon() {
        // Test with a null content
        IconManager iconManager = new IconManager();
        assertNull(iconManager.getIcon(null, null));
        
        // Test with a null waiting component
        iconManager = new IconManager();
        assertNull(iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), null));
        
        // Test with a waiting component
        iconManager = new IconManager();
        assertNull(iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), new Component() {
            @Override
            public void paint(Graphics g) {
                // Do nothing
            }
        }));
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
     * Test case for the {@link IconManager#getIcon(Content, Component)} method.
     */
    @Test
    void testGetIcon() {
        // Test with a null content
        IconManager iconManager = new IconManager();
        assertNull(iconManager.getIcon(null, null));
        
        // Test with a null waiting component
        iconManager = new IconManager();
        assertNull(iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), null));
        
        // Test with a waiting component
        iconManager = new IconManager();
        assertNull(iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), new Component() {
            @Override
            public void paint(Graphics g) {
                // Do nothing
            }
        }));
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
     * Test case for the {@link IconManager#getIcon(Content, Component)} method.
     */
    @Test
    void testGetIcon() {
        // Test with a null content
        IconManager iconManager = new IconManager();
        assertNull(iconManager.getIcon(null, null));
        
        // Test with a null waiting component
        iconManager = new IconManager();
        assertNull(iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), null));
        
        // Test with a waiting component
        iconManager = new IconManager();
        assertNull(iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), new Component() {
            @Override
            public void paint(Graphics g) {
                // Do nothing
            }
        }));
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
import javax.swing.ImageIcon;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IconManager}.
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, Component)} method.
*/
class IconManager_5Test {
		
    /**
     * Test case for the {@link IconManager#getIcon(Content, Component)} method.
     */
    @Test
    void testGetIcon() {
        // Test with a null content
        IconManager iconManager = new IconManager();
        assertNull(iconManager.getIcon(null, null));
        
        // Test with a null waiting component
        iconManager = new IconManager();
        assertNull(iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), null));
        
        // Test with a waiting component
        iconManager = new IconManager();
        assertNull(iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), new Component() {
            @Override
            public void paint(Graphics g) {
                // Do nothing
            }
        }));
    }
}

// IconManager_6Test.java
package com.eteks.sweethome3d.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.