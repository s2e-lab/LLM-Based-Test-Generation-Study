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
        // Test that the method returns a singleton
        TextureManager textureManager1 = TextureManager.getInstance();
        TextureManager textureManager2 = TextureManager.getInstance();
        assertEquals(textureManager1, textureManager2);
    }

    /**
    * Test method for {@link TextureManager#clear()}.
    */
    @Test
    void testClear() {
        // Test that the method doesn't throw an exception
        TextureManager textureManager = TextureManager.getInstance();
        textureManager.clear();
    }

    /**
    * Test method for {@link TextureManager#getColoredImageTexture(Color)}.
    */
    @Test
    void testGetColoredImageTexture() {
        // Test that the method returns a texture image of one pixel of the given color
        TextureManager textureManager = TextureManager.getInstance();
        Texture texture = textureManager.getColoredImageTexture(Color.RED);
        assertEquals(1, texture.getNumImages());
        assertEquals(1, texture.getImage(0).getWidth());
        assertEquals(1, texture.getImage(0).getHeight());
        assertEquals(Texture.RGBA, texture.getFormat());
        assertEquals(Texture.BASE_LEVEL, texture.getBaseLevel());
        assertEquals(Texture.BASE_LEVEL, texture.getMinFilter());
        assertEquals(Texture.BASE_LEVEL, texture.getMagFilter());
        assertEquals(Texture.WRAP, texture.getWrapModeS());
        assertEquals(Texture.WRAP, texture.getWrapModeT());
        assertEquals(Texture.WRAP, texture.getWrapModeR());
        assertEquals(Texture.MODULATE, texture.getCombineRgb());
        assertEquals(Texture.ADD, texture.getCombineAlpha());
        assertEquals(Texture.REPLACE, texture.getCombineRgbScale());
        assertEquals(Texture.REPLACE, texture.getCombineAlphaScale());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp0Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp1Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp2Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp0Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp1Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp2Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineScaleExt());
        assertEquals(Texture.REPLACE, texture.getCombineBiasExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp0RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp1RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp2RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp0AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp1AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp2AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineScaleExt());
        assertEquals(Texture.REPLACE, texture.getCombineBiasExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp0Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp1Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp2Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp0Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp1Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp2Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineScaleExt());
        assertEquals(Texture.REPLACE, texture.getCombineBiasExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp0RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp1RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp2RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp0AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp1AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp2AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineScaleExt());
        assertEquals(Texture.REPLACE, texture.getCombineBiasExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp0Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp1Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp2Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp0Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp1Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp2Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineScaleExt());
        assertEquals(Texture.REPLACE, texture.getCombineBiasExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp0RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp1RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp2RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp0AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp1AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp2AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineScaleExt());
        assertEquals(Texture.REPLACE, texture.getCombineBiasExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp0Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp1Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp2Rgb());
        assertEquals(Texture.REPLACE, texture.getCombineOp0Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp1Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineOp2Alpha());
        assertEquals(Texture.REPLACE, texture.getCombineScaleExt());
        assertEquals(Texture.REPLACE, texture.getCombineBiasExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2RgbExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc0AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc1AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineSrc2AlphaExt());
        assertEquals(Texture.REPLACE, texture.getCombineOp0RgbExt());
        assertEquals