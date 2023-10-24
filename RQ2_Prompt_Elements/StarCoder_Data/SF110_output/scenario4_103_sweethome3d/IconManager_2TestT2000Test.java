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
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, int, Component)} method.
*/
class IconManager_2Test {

    @Test
    void testGetIcon() {
        IconManager iconManager = IconManager.getInstance();
        // Test with a null content
        Icon icon = iconManager.getIcon(null, 10, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null waiting component
        icon = iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), 10, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null error icon
        icon = iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), 10, new Component() {
            @Override
            public void repaint() {
            }
        });
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null wait icon
        icon = iconManager.getIcon(new ResourceURLContent(getClass().getResource("test.png")), 10, new Component() {
            @Override
            public void repaint() {
            }
        }, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon
        icon = iconManager.getIcon(null, 10, null, null, null);
        assertTrue(iconManager.isWaitIcon(icon));
        // Test with a null content and a null waiting component and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and a null error icon and a null wait icon and