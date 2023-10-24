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

    /**
     * Test of getIcon method, of class IconManager.
     */
    @Test
    void testGetIcon() {
        System.out.println("getIcon");
        Content content = new ResourceURLContent(IconManager_2Test.class.getResource("test.png"));
        IconManager instance = new IconManager();
        Icon icon = instance.getIcon(content, 100, null);
        assertNotNull(icon);
        assertEquals(100, icon.getIconHeight());
        assertEquals(100, icon.getIconWidth());
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = image.getGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();
        assertEquals(0, image.getRGB(0, 0));
        assertEquals(0, image.getRGB(99, 0));
        assertEquals(0, image.getRGB(0, 99));
        assertEquals(0, image.getRGB(99, 99));
        assertEquals(0, image.getRGB(50, 50));
        assertEquals(0, image.getRGB(49, 50));
        assertEquals(0, image.getRGB(50, 49));
        assertEquals(0, image.getRGB(49, 49));
        assertEquals(0, image.getRGB(50, 51));
        assertEquals(0, image.getRGB(51, 50));
        assertEquals(0, image.getRGB(50, 52));
        assertEquals(0, image.getRGB(52, 50));
        assertEquals(0, image.getRGB(51, 51));
        assertEquals(0, image.getRGB(51, 52));
        assertEquals(0, image.getRGB(52, 51));
        assertEquals(0, image.getRGB(52, 52));
        assertEquals(0, image.getRGB(51, 53));
        assertEquals(0, image.getRGB(53, 51));
        assertEquals(0, image.getRGB(52, 53));
        assertEquals(0, image.getRGB(53, 52));
        assertEquals(0, image.getRGB(53, 53));
        assertEquals(0, image.getRGB(54, 54));
        assertEquals(0, image.getRGB(55, 55));
        assertEquals(0, image.getRGB(56, 56));
        assertEquals(0, image.getRGB(57, 57));
        assertEquals(0, image.getRGB(58, 58));
        assertEquals(0, image.getRGB(59, 59));
        assertEquals(0, image.getRGB(60, 60));
        assertEquals(0, image.getRGB(61, 61));
        assertEquals(0, image.getRGB(62, 62));
        assertEquals(0, image.getRGB(63, 63));
        assertEquals(0, image.getRGB(64, 64));
        assertEquals(0, image.getRGB(65, 65));
        assertEquals(0, image.getRGB(66, 66));
        assertEquals(0, image.getRGB(67, 67));
        assertEquals(0, image.getRGB(68, 68));
        assertEquals(0, image.getRGB(69, 69));
        assertEquals(0, image.getRGB(70, 70));
        assertEquals(0, image.getRGB(71, 71));
        assertEquals(0, image.getRGB(72, 72));
        assertEquals(0, image.getRGB(73, 73));
        assertEquals(0, image.getRGB(74, 74));
        assertEquals(0, image.getRGB(75, 75));
        assertEquals(0, image.getRGB(76, 76));
        assertEquals(0, image.getRGB(77, 77));
        assertEquals(0, image.getRGB(78, 78));
        assertEquals(0, image.getRGB(79, 79));
        assertEquals(0, image.getRGB(80, 80));
        assertEquals(0, image.getRGB(81, 81));
        assertEquals(0, image.getRGB(82, 82));
        assertEquals(0, image.getRGB(83, 83));
        assertEquals(0, image.getRGB(84, 84));
        assertEquals(0, image.getRGB(85, 85));
        assertEquals(0, image.getRGB(86, 86));
        assertEquals(0, image.getRGB(87, 87));
        assertEquals(0, image.getRGB(88, 88));
        assertEquals(0, image.getRGB(89, 89));
        assertEquals(0, image.getRGB(90, 90));
        assertEquals(0, image.getRGB(91, 91));
        assertEquals(0, image.getRGB(92, 92));
        assertEquals(0, image.getRGB(93, 93));
        assertEquals(0, image.getRGB(94, 94));
        assertEquals(0, image.getRGB(95, 95));
        assertEquals(0, image.getRGB(96, 96));
        assertEquals(0, image.getRGB(97, 97));
        assertEquals(0, image.getRGB(98, 98));
        assertEquals(0, image.getRGB(99, 99));
        assertEquals(0, image.getRGB(100, 100));
        assertEquals(0, image.getRGB(101, 101));
        assertEquals(0, image.getRGB(102, 102));
        assertEquals(0, image.getRGB(103, 103));
        assertEquals(0, image.getRGB(104, 104));
        assertEquals(0, image.getRGB(105, 105));
        assertEquals(0, image.getRGB(106, 106));
        assertEquals(0, image.getRGB(107, 107));
        assertEquals(0, image.getRGB(108, 108));
        assertEquals(0, image.getRGB(109, 109));
        assertEquals(0, image.getRGB(110, 110));
        assertEquals(0, image.getRGB(111, 111));
        assertEquals(0, image.getRGB(112, 112));
        assertEquals(0, image.getRGB(113, 113));
        assertEquals(0, image.getRGB(114, 114));
        assertEquals(0, image.getRGB(115, 115));
        assertEquals(0, image.getRGB(116, 116));
        assertEquals(0, image.getRGB(117, 117));
        assertEquals(0, image.getRGB(118, 118));
        assertEquals(0, image.getRGB(119, 119));
        assertEquals(0, image.getRGB(120, 120));
        assertEquals(0, image.getRGB(121, 121));
        assertEquals(0, image.getRGB(122, 122));
        assertEquals(0, image.getRGB(123, 123));
        assertEquals(0, image.getRGB(124, 124));
        assertEquals(0, image.getRGB(125, 125));
        assertEquals(0, image.getRGB(126, 126));
        assertEquals(0, image.getRGB(127, 127));
        assertEquals(0, image.getRGB(128, 128));
        assertEquals(0, image.getRGB(129, 129));
        assertEquals(0, image.getRGB(130, 130));
        assertEquals(0, image.getRGB(131, 131));
        assertEquals(0, image.getRGB(132, 132));
        assertEquals(0, image.getRGB(133, 133));
        assertEquals(0, image.getRGB(134, 134));
        assertEquals(0, image.getRGB(135, 135));
        assertEquals(0, image.getRGB(