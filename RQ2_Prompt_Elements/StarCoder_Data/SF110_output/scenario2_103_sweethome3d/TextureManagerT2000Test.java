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
        if (instance == null) {
            instance = new TextureManager();
        }
        return instance;
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
        if (instance == null) {
            instance = new TextureManager();
        }
        return instance;
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
        if (instance == null) {
            instance = new TextureManager();
        }
        return instance;
    }
}

// TextureManagerTest.java
package com.eteks.sweethome3d.j3d;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.