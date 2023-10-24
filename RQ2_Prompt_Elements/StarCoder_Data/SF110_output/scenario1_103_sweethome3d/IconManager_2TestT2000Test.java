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
        // Test with null content
        IconManager iconManager = new IconManager();
        Icon icon = iconManager.getIcon(null, 10, null);
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("error.png")), 10, null);
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with wait icon content
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("wait.gif")), 10, null);
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("error.png")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with wait icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("wait.gif")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("error.png")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with wait icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("wait.gif")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("error.png")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with wait icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("wait.gif")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("error.png")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with wait icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("wait.gif")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("error.png")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with wait icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("wait.gif")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("error.png")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with wait icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("wait.gif")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("error.png")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with wait icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("wait.gif")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("error.png")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with wait icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("wait.gif")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("error.png")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with wait icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("wait.gif")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("error.png")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with wait icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(IconManager.class.getResource("wait.gif")), 10, new Component() {
            public void paint(Graphics g) {
            }
        });
        assertEquals(10, icon.getIconWidth());
        assertEquals(10, icon.getIconHeight());
        // Test with error icon content and waiting component
        iconManager = new IconManager();
        icon = iconManager.getIcon(new ResourceURLContent(Icon