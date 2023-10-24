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
     * Test of getOnscreenCanvas3D method, of class Component3DManager.
     */
    @Test
    void testGetOnscreenCanvas3D() {
        System.out.println("getOnscreenCanvas3D");
        RenderingObserver renderingObserver = new RenderingObserver();
        Canvas3D result = Component3DManager.getOnscreenCanvas3D(renderingObserver);
        assertNotNull(result);
        assertNotNull(result.getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D());
        assertNotNull(result.getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3D().getPhysicalScreen().getScreen3