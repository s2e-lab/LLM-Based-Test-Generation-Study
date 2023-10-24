// AboutPanelTest.java
package de.huxhorn.lilith.swing;

import de.huxhorn.sulky.swing.GraphicsUtilities;
import de.huxhorn.sulky.swing.filters.ColorTintFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AboutPanel}.
* It contains ten unit test cases for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
*/
class AboutPanelTest {

    private static final Logger logger = LoggerFactory.getLogger(AboutPanelTest.class);

    /**
     * Test case for the {@link AboutPanel#getToolTipText(MouseEvent)} method.
     * It tests the case when the point of the <code>MouseEvent</code> is inside the scroll-area.
     */
    @Test
    void testGetToolTipText_insideScrollArea() {
        logger.info("testGetToolTipText_insideScrollArea");
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setScrollAreaToolTipText("scrollAreaToolTipText");
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle(0, 0, 100, 100));
        aboutPanel.setScrollArea(new Rectangle