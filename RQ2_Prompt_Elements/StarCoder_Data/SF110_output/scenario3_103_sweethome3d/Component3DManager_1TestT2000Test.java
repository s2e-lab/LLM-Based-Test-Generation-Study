// Component3DManager_1Test.java
package com.eteks.sweethome3d.j3d;

import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.IllegalRenderingStateException;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.RenderingError;
import javax.media.j3d.RenderingErrorListener;
import javax.media.j3d.Screen3D;
import javax.media.j3d.View;
import javax.media.j3d.VirtualUniverse;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.Viewer;
import com.sun.j3d.utils.universe.ViewingPlatform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Component3DManager}.
* It contains ten unit test cases for the {@link Component3DManager#getOnscreenCanvas3D(RenderingObserver)} method.
*/
class Component3DManager_1Test {

    /**
     * Test method for {@link Component3DManager#getOnscreenCanvas3D(RenderingObserver)}.
     */
    @Test
    void testGetOnscreenCanvas3D() {
        // Create a new on screen canvas 3D
        Canvas3D canvas3D = new Component3DManager().getOnscreenCanvas3D(new RenderingObserver() {
            @Override
            public void onRenderingStarted(Canvas3D canvas3D) {
                // Do nothing
            }

            @Override
            public void onRenderingStopped(Canvas3D canvas3D) {
                // Do nothing
            }

            @Override
            public void onRenderingErrorOccurred(Canvas3D canvas3D, RenderingError error) {
                // Do nothing
            }
        });
        // Check that the canvas 3D is not null
        assertNotNull(canvas3D);
        // Check that the canvas 3D is associated with the default screen device
        assertEquals(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice(), 
                     canvas3D.getScreen3D().getGraphicsConfiguration().getScreenDevice());
    }
}

// Component3DManager_2Test.java
package com.eteks.sweethome3d.j3d;

import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.IllegalRenderingStateException;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.RenderingError;
import javax.media.j3d.RenderingErrorListener;
import javax.media.j3d.Screen3D;
import javax.media.j3d.View;
import javax.media.j3d.VirtualUniverse;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.Viewer;
import com.sun.j3d.utils.universe.ViewingPlatform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Component3DManager}.
* It contains ten unit test cases for the {@link Component3DManager#getOnscreenCanvas3D(RenderingObserver)} method.
*/
class Component3DManager_2Test {
		
    /**
     * Test method for {@link Component3DManager#getOnscreenCanvas3D(RenderingObserver)}.
     */
    @Test
    void testGetOnscreenCanvas3D() {
        // Create a new on screen canvas 3D
        Canvas3D canvas3D = new Component3DManager().getOnscreenCanvas3D(new RenderingObserver() {
            @Override
            public void onRenderingStarted(Canvas3D canvas3D) {
                // Do nothing
            }

            @Override
            public void onRenderingStopped(Canvas3D canvas3D) {
                // Do nothing
            }

            @Override
            public void onRenderingErrorOccurred(Canvas3D canvas3D, RenderingError error) {
                // Do nothing
            }
        });
        // Check that the canvas 3D is not null
        assertNotNull(canvas3D);
        // Check that the canvas 3D is associated with the default screen device
        assertEquals(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice(), 
                     canvas3D.getScreen3D().getGraphicsConfiguration().getScreenDevice());
    }
}

// Component3DManager_3Test.java
package com.eteks.sweethome3d.j3d;

import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.IllegalRenderingStateException;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.RenderingError;
import javax.media.j3d.RenderingErrorListener;
import javax.media.j3d.Screen3D;
import javax.media.j3d.View;
import javax.media.j3d.VirtualUniverse;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.Viewer;
import com.sun.j3d.utils.universe.ViewingPlatform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Component3DManager}.
* It contains ten unit test cases for the {@link Component3DManager#getOnscreenCanvas3D(RenderingObserver)} method.
*/
class Component3DManager_3Test {
		
    /**
     * Test method for {@link Component3DManager#getOnscreenCanvas3D(RenderingObserver)}.
     */
    @Test
    void testGetOnscreenCanvas3D() {
        // Create a new on screen canvas 3D
        Canvas3D canvas3D = new Component3DManager().getOnscreenCanvas3D(new RenderingObserver() {
            @Override
            public void onRenderingStarted(Canvas3D canvas3D) {
                // Do nothing
            }

            @Override
            public void onRenderingStopped(Canvas3D canvas3D) {
                // Do nothing
            }

            @Override
            public void onRenderingErrorOccurred(Canvas3D canvas3D, RenderingError error) {
                // Do nothing
            }
        });
        // Check that the canvas 3D is not null
        assertNotNull(canvas3D);
        // Check that the canvas 3D is associated with the default screen device
        assertEquals(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice(), 
                     canvas3D.getScreen3D().getGraphicsConfiguration().getScreenDevice());
    }
}

// Component3DManager_4Test.java
package com.eteks.sweethome3d.j3d;

import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.GraphicsConfigTemplate3D;
import javax.media.j3d.IllegalRenderingStateException;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.RenderingError;
import javax.media.j3d.RenderingErrorListener;
import javax.media.j3d.Screen3D;
import javax.media.j3d.View;
import javax.media.j3d.VirtualUniverse;
import com.sun.j3d.utils.universe.SimpleUniverse;
import com.sun.j3d.utils.universe.Viewer;
import com.sun.j3d.utils.universe.ViewingPlatform;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Component3DManager}.
* It contains ten unit test cases for the {@link Component3DManager#getOnscreenCanvas3D(RenderingObserver)} method.
*/
class Component3DManager_4Test {
		
    /**
     * Test method for {@link Component3DManager#getOnscreenCanvas3D(RenderingObserver)}.
     */
    @Test
    void testGetOnscreenCanvas3D() {
        // Create a new on screen canvas 3D
        Canvas3D canvas3D = new Component3DManager().getOnscreenCanvas3D(new RenderingObserver() {
            @Override
            public void onRenderingStarted(Canvas3D canvas3D) {
                // Do nothing
            }

            @Override
            public void onRenderingStopped(Canvas3D canvas3D) {
                // Do nothing
            }

            @Override
            public void onRenderingErrorOccurred(Canvas3D canvas3D, RenderingError error) {
                // Do nothing
            }
        });
        // Check that the canvas 3D is not null
        assertNotNull(canvas3D);
        // Check that the canvas 3D is associated with the default screen device
        assertEquals(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice(), 
                     canvas3D.getScreen3D().getGraphicsConfiguration().getScreenDevice());
    }
}

// Component3DManager_5Test.java
package com.