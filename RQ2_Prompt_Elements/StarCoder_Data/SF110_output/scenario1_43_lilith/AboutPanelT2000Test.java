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

    @Test
    void testGetToolTipText_mouseEvent_null() {
        AboutPanel aboutPanel = new AboutPanel();
        assertNull(aboutPanel.getToolTipText(null));
    }

    @Test
    void testGetToolTipText_mouseEvent_outside() {
        AboutPanel aboutPanel = new AboutPanel();
        MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
        assertNull(aboutPanel.getToolTipText(mouseEvent));
    }

    @Test
    void testGetToolTipText_mouseEvent_inside() {
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setScrollAreaToolTipText("scrollAreaToolTipText");
        MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
        assertEquals("scrollAreaToolTipText", aboutPanel.getToolTipText(mouseEvent));
    }

    @Test
    void testGetToolTipText_mouseEvent_inside_scrollArea() {
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setScrollAreaToolTipText("scrollAreaToolTipText");
        MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
        assertEquals("scrollAreaToolTipText", aboutPanel.getToolTipText(mouseEvent));
    }

    @Test
    void testGetToolTipText_mouseEvent_inside_scrollArea_scrollBar() {
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setScrollAreaToolTipText("scrollAreaToolTipText");
        MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
        assertEquals("scrollAreaToolTipText", aboutPanel.getToolTipText(mouseEvent));
    }

    @Test
    void testGetToolTipText_mouseEvent_inside_scrollArea_scrollBar_scrollBar() {
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setScrollAreaToolTipText("scrollAreaToolTipText");
        MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
        assertEquals("scrollAreaToolTipText", aboutPanel.getToolTipText(mouseEvent));
    }

    @Test
    void testGetToolTipText_mouseEvent_inside_scrollArea_scrollBar_scrollBar_scrollBar() {
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setScrollAreaToolTipText("scrollAreaToolTipText");
        MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
        assertEquals("scrollAreaToolTipText", aboutPanel.getToolTipText(mouseEvent));
    }

    @Test
    void testGetToolTipText_mouseEvent_inside_scrollArea_scrollBar_scrollBar_scrollBar_scrollBar() {
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setScrollAreaToolTipText("scrollAreaToolTipText");
        MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
        assertEquals("scrollAreaToolTipText", aboutPanel.getToolTipText(mouseEvent));
    }

    @Test
    void testGetToolTipText_mouseEvent_inside_scrollArea_scrollBar_scrollBar_scrollBar_scrollBar_scrollBar() {
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setScrollAreaToolTipText("scrollAreaToolTipText");
        MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
        assertEquals("scrollAreaToolTipText", aboutPanel.getToolTipText(mouseEvent));
    }

    @Test
    void testGetToolTipText_mouseEvent_inside_scrollArea_scrollBar_scrollBar_scrollBar_scrollBar_scrollBar_scrollBar() {
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setScrollAreaToolTipText("scrollAreaToolTipText");
        MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
        assertEquals("scrollAreaToolTipText", aboutPanel.getToolTipText(mouseEvent));
    }

    @Test
    void testGetToolTipText_mouseEvent_inside_scrollArea_scrollBar_scrollBar_scrollBar_scrollBar_scrollBar_scrollBar_scrollBar() {
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setScrollAreaToolTipText("scrollAreaToolTipText");
        MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
        assertEquals("scrollAreaToolTipText", aboutPanel.getToolTipText(mouseEvent));
    }

    @Test
    void testGetToolTipText_mouseEvent_inside_scrollArea_scrollBar_scrollBar_scrollBar_scrollBar_scrollBar_scrollBar_scrollBar_scrollBar() {
        AboutPanel aboutPanel = new AboutPanel();
        aboutPanel.setScrollAreaToolTipText("scrollAreaToolTipText");
        MouseEvent mouseEvent = new MouseEvent(aboutPanel, 0, 0, 0, 0, 0, 0, false);
        assertEquals("scrollAreaToolTipText", aboutPanel.getToolTipText(mouseEvent));
    }
}

// AboutPanel.java
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

/**
 * <code>AboutPanel</code> is a component which has a background-image and a
 * rectangle in which a given text is scrolling (the scroll-area). You may also
 * specify an Image (e.g. a png-file with alpha-channel) that is drawn before
 * the scroll-text itself. An optional version-string may be given that will be
 * painted centered relative to the scroll-area.
 *
 * @author <NAME>
 */
public class AboutPanel extends JComponent {

    public String getToolTipText(MouseEvent evt) {
        if (handleMouseEvent(evt)) {
            return scrollAreaToolTipText;
        }
        return null;
    }
}

// AboutPanel.java
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

/**
 * <code>AboutPanel</code> is a component which has a background-image and a
 * rectangle in which a given text is scrolling (the scroll-area). You may also
 * specify an Image (e.g. a png-file with alpha-channel) that is drawn before
 * the scroll-text itself. An optional version-string may be given that will be
 * painted centered relative to the scroll-area.
 *
 * @author <NAME>
 */
public class AboutPanel extends JComponent {

    public String getToolTipText(MouseEvent evt) {
        if (handleMouseEvent(evt)) {
            return scrollAreaToolTipText;
        }
        return null;