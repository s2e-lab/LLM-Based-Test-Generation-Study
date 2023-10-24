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

    @Test
    void testOnscreenCanvas3D() {
        Component3DManager component3DManager = Component3DManager.getInstance();
        GraphicsConfiguration deviceConfiguration = component3DManager.getDefaultScreenConfiguration();
        Canvas3D canvas3D = component3DManager.getOnscreenCanvas3D();
        assertNotNull(canvas3D);
        assertEquals(deviceConfiguration, canvas3D.getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getGraphicsConfiguration());
        assertEquals(deviceConfiguration, canvas3D.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D