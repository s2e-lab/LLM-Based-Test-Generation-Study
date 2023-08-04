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
    void getOnscreenCanvas3D() {
        Component3DManager component3DManager = new Component3DManager();
        RenderingObserver renderingObserver = new RenderingObserver();
        Canvas3D canvas3D = component3DManager.getOnscreenCanvas3D(renderingObserver);
        assertNotNull(canvas3D);
        assertTrue(canvas3D.isOnscreen());
        assertTrue(canvas3D.isAutoDepthBuffer());
        assertTrue(canvas3D.isDoubleBuffered());
        assertTrue(canvas3D.isHardwareAccelerated());
        assertTrue(canvas3D.isIgnoreRepaint());
        assertTrue(canvas3D.isOffscreen());
        assertTrue(canvas3D.isStereo());
        assertTrue(canvas3D.isTransparent());
        assertTrue(canvas3D.isUniverseSet());
        assertTrue(canvas3D.isViewSet());
        assertTrue(canvas3D.isOffscreenAutoRedraw());
        assertTrue(canvas3D.isOffscreenDoubleBuffered());
        assertTrue(canvas3D.isOffscreenUniverseSet());
        assertTrue(canvas3D.isOffscreenViewSet());
        assertTrue(canvas3D.isOffscreenStereo());
        assertTrue(canvas3D.isOffscreenTransparent());
        assertTrue(canvas3D.isOffscreenAutoDepthBuffer());
        assertTrue(canvas3D.isOffscreenIgnoreRepaint());
        assertTrue(canvas3D.isOffscreenHardwareAccelerated());
        assertTrue(canvas3D.isOffscreenOnscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenView());
        assertTrue(canvas3D.isOffscreenAutoOnscreenUniverse());
        assertTrue(canvas3D.isOffscreenAutoOnscreenStereo());
        assertTrue(canvas3D.isOffscreenAutoOnscreenTransparent());
        assertTrue(canvas3D.isOffscreenAutoOnscreenDepthBuffer());
        assertTrue(canvas3D.isOffscreenAutoOnscreenIgnoreRepaint());
        assertTrue(canvas3D.isOffscreenAutoOnscreenHardwareAccelerated());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenView());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenUniverse());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenStereo());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenTransparent());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenDepthBuffer());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenIgnoreRepaint());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenHardwareAccelerated());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenOnscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenView());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenUniverse());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenStereo());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenTransparent());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenDepthBuffer());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenIgnoreRepaint());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenHardwareAccelerated());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenView());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenUniverse());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenStereo());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenTransparent());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenDepthBuffer());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenIgnoreRepaint());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenHardwareAccelerated());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenOnscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenView());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenUniverse());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenStereo());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenTransparent());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenDepthBuffer());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenIgnoreRepaint());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenHardwareAccelerated());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenView());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenUniverse());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenStereo());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenTransparent());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenDepthBuffer());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenIgnoreRepaint());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenHardwareAccelerated());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenOnscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenView());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenUniverse());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenStereo());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenTransparent());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenDepthBuffer());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenIgnoreRepaint());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenHardwareAccelerated());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenView());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenUniverse());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenStereo());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenTransparent());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenDepthBuffer());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenIgnoreRepaint());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenHardwareAccelerated());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenOnscreen());
        assertTrue(canvas3D.isOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreenAutoOnscreenOffscreen