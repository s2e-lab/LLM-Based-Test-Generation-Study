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
        Component3DManager component3DManager = Component3DManager.getInstance();
        // Test with null rendering observer
        Canvas3D canvas3D = component3DManager.getOnscreenCanvas3D(null);
        assertNotNull(canvas3D);
        // Test with rendering observer
        final CountDownLatch latch = new CountDownLatch(1);
        RenderingObserver renderingObserver = new RenderingObserver() {

            public void canvas3DPreRendered(Canvas3D canvas3D) {
                latch.countDown();
            }

            public void canvas3DPostRendered(Canvas3D canvas3D) {
            }

            public void canvas3DSwapped(Canvas3D canvas3D) {
            }
        };
        canvas3D = component3DManager.getOnscreenCanvas3D(renderingObserver);
        assertNotNull(canvas3D);
        // Check that rendering observer was called
        try {
            latch.await(10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException ex) {
            fail("Rendering observer wasn't called");
        }
    }

    /**
    * Test method for {@link Component3DManager#getOnscreenCanvas3D(GraphicsConfiguration, RenderingObserver)}.
    */
    @Test
    void testGetOnscreenCanvas3DWithDeviceConfiguration() {
        Component3DManager component3DManager = Component3DManager.getInstance();
        // Test with null rendering observer
        Canvas3D canvas3D = component3DManager.getOnscreenCanvas3D(null, null);
        assertNotNull(canvas3D);
        // Test with rendering observer
        final CountDownLatch latch = new CountDownLatch(1);
        RenderingObserver renderingObserver = new RenderingObserver() {

            public void canvas3DPreRendered(Canvas3D canvas3D) {
                latch.countDown();
            }

            public void canvas3DPostRendered(Canvas3D canvas3D) {
            }

            public void canvas3DSwapped(Canvas3D canvas3D) {
            }
        };
        canvas3D = component3DManager.getOnscreenCanvas3D(null, renderingObserver);
        assertNotNull(canvas3D);
        // Check that rendering observer was called
        try {
            latch.await(10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException ex) {
            fail("Rendering observer wasn't called");
        }
    }

    /**
    * Test method for {@link Component3DManager#getOffScreenCanvas3D(int, int)}.
    */
    @Test
    void testGetOffScreenCanvas3D() {
        Component3DManager component3DManager = Component3DManager.getInstance();
        // Test with null rendering observer
        Canvas3D canvas3D = component3DManager.getOffScreenCanvas3D(1, 1);
        assertNotNull(canvas3D);
        // Test with rendering observer
        final CountDownLatch latch = new CountDownLatch(1);
        RenderingObserver renderingObserver = new RenderingObserver() {

            public void canvas3DPreRendered(Canvas3D canvas3D) {
                latch.countDown();
            }

            public void canvas3DPostRendered(Canvas3D canvas3D) {
            }

            public void canvas3DSwapped(Canvas3D canvas3D) {
            }
        };
        canvas3D = component3DManager.getOffScreenCanvas3D(1, 1);
        assertNotNull(canvas3D);
        // Check that rendering observer was called
        try {
            latch.await(10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException ex) {
            fail("Rendering observer wasn't called");
        }
    }

    /**
    * Test method for {@link Component3DManager#getOffScreenImage(View, int, int)}.
    */
    @Test
    void testGetOffScreenImage() {
        Component3DManager component3DManager = Component3DManager.getInstance();
        // Test with null rendering observer
        Canvas3D canvas3D = component3DManager.getOffScreenCanvas3D(1, 1);
        assertNotNull(canvas3D);
        View view = new View();
        view.addCanvas3D(canvas3D);
        BufferedImage image = component3DManager.getOffScreenImage(view, 1, 1);
        assertNotNull(image);
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
* It contains ten unit test cases for the {@link Component3DManager#getOnscreenCanvas3D()} method.
*/
class Component3DManager_2Test {
		
    /**
    * Test method for {@link Component3DManager#getOnscreenCanvas3D()}.
    */
    @Test
    void testGetOnscreenCanvas3D() {
        Component3DManager component3DManager = Component3DManager.getInstance();
        // Test with null rendering observer
        Canvas3D canvas3D = component3DManager.getOnscreenCanvas3D();
        assertNotNull(canvas3D);
    }

    /**
    * Test method for {@link Component3DManager#getOnscreenCanvas3D(GraphicsConfiguration)}.
    */
    @Test
    void testGetOnscreenCanvas3DWithDeviceConfiguration() {
        Component3DManager component3DManager = Component3DManager.getInstance();
        // Test with null rendering observer
        Canvas3D canvas3D = component3DManager.getOnscreenCanvas3D(null);
        assertNotNull(canvas3D);
    }

    /**
    * Test method for {@link Component3DManager#getOffScreenCanvas3D(int, int)}.
    */
    @Test
    void testGetOffScreenCanvas3D() {
        Component3DManager component3DManager = Component3DManager.getInstance();
        // Test with null rendering observer
        Canvas3D canvas3D = component3DManager.getOffScreenCanvas3D(1, 1);
        assertNotNull(canvas3D);
    }

    /**
    * Test method for {@link Component3DManager#getOffScreenImage(View, int, int)}.
    */
    @Test
    void testGetOffScreenImage() {
        Component3DManager component3DManager = Component3DManager.getInstance();
        // Test with null rendering observer
        Canvas3D canvas3D = component3DManager.getOffScreenCanvas3D(1, 1);
        assertNotNull(canvas3D);
        View view = new View();
        view.addCanvas3D(canvas3D);
        BufferedImage image = component3DManager.getOffScreenImage(view, 1, 1);
        assertNotNull(image);
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
import com.sun.j3d.utils.universe.View