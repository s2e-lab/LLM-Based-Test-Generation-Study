// SwingToolsTest.java
package com.eteks.sweethome3d.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.jnlp.BasicService;
import javax.jnlp.ServiceManager;
import javax.jnlp.UnavailableServiceException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.text.JTextComponent;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.tools.OperatingSystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SwingTools}.
* It contains ten unit test cases for the {@link SwingTools#getDropableComponentBorder()} method.
*/
class SwingToolsTest {

    @Test
    void testGetDropableComponentBorder() {
        // Test with a component that can be dropped
        JPanel panel = new JPanel();
        panel.setBorder(SwingTools.getDropableComponentBorder());
        assertEquals(SwingTools.getDropableComponentBorder(), panel.getBorder());
        // Test with a component that can't be dropped
        panel = new JPanel();
        panel.setBorder(SwingTools.getDropableComponentBorder());
        assertEquals(SwingTools.getDropableComponentBorder(), panel.getBorder());
    }
}

// SwingTools.java
package com.eteks.sweethome3d.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.jnlp.BasicService;
import javax.jnlp.ServiceManager;
import javax.jnlp.UnavailableServiceException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.text.JTextComponent;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.tools.OperatingSystem;

/**
 * Gathers some useful tools for Swing.
 *
 * @author <NAME>
 */
public class SwingTools {

    // Borders for focused views
    private static Border unfocusedViewBorder;

    private static Border focusedViewBorder;

    private SwingTools() {
    }

    /**
     * Updates the border of <code>component</code> with an empty border
     * changed to a colored border when it will gain focus.
     * If the <code>component</code> component is the child of a <code>JViewPort</code>
     * instance this border will be installed on its scroll pane parent.
     */
    public static void installFocusBorder(JComponent component) {
        if (component.getParent() instanceof JViewport) {
            JViewport viewport = (JViewport)component.getParent();
            JScrollPane scrollPane = (JScrollPane)viewport.getParent();
            scrollPane.setBorder(getFocusedViewBorder());
        } else {
            component.setBorder(getFocusedViewBorder());
        }
        component.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent ev) {
                if (ev.getSource() instanceof JComponent) {
                    JComponent component = (JComponent)ev.getSource();
                    if (component.getParent() instanceof JViewport) {
                        JViewport viewport = (JViewport)component.getParent();
                        JScrollPane scrollPane = (JScrollPane)viewport.getParent();
                        scrollPane.setBorder(getFocusedViewBorder());
                    } else {
                        component.setBorder(getFocusedViewBorder());
                    }
                }
            }

            public void focusLost(FocusEvent ev) {
                if (ev.getSource() instanceof JComponent) {
                    JComponent component = (JComponent)ev.getSource();
                    if (component.getParent() instanceof JViewport) {
                        JViewport viewport = (JViewport)component.getParent();
                        JScrollPane scrollPane = (JScrollPane)viewport.getParent();
                        scrollPane.setBorder(getUnfocusedViewBorder());
                    } else {
                        component.setBorder(getUnfocusedViewBorder());
                    }
                }
            }
        });
    }

    /**
     * Updates the Swing resource bundles in use from the current Locale and class loader.
     */
    public static void updateSwingResourceLanguage() {
        updateSwingResourceLanguage(Arrays.asList(SwingTools.class.getClassLoader()));
    }

    /**
     * Updates the Swing resource bundles in use from the current Locale and the class loaders of preferences.
     */
    public static void updateSwingResourceLanguage(UserPreferences preferences) {
        List<ClassLoader> classLoaders = new ArrayList<ClassLoader>();
        classLoaders.add(SwingTools.class.getClassLoader());
        classLoaders.add(preferences.getClass().getClassLoader());
        updateSwingResourceLanguage(classLoaders);
    }

    /**
     * Updates the Swing resource bundles in use from the current Locale and class loaders.
     */
    private static void updateSwingResourceLanguage(List<ClassLoader> classLoaders) {
        // Update resource bundle for Swing
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing", classLoaders);
        // Update resource bundle for Swing HTML
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html", classLoaders);
        // Update resource bundle for Swing HTML (JEditorPane)
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html.jeditorpane", classLoaders);
        // Update resource bundle for Swing HTML (JTextPane)
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html.jtextpane", classLoaders);
        // Update resource bundle for Swing HTML (JTree)
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html.jtree", classLoaders);
        // Update resource bundle for Swing HTML (JTable)
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html.jtable", classLoaders);
        // Update resource bundle for Swing HTML (JList)
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html.jlist", classLoaders);
        // Update resource bundle for Swing HTML (JComboBox)
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html.jcombobox", classLoaders);
        // Update resource bundle for Swing HTML (JCheckBox)
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html.jcheckbox", classLoaders);
        // Update resource bundle for Swing HTML (JRadioButton)
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html.jradiobutton", classLoaders);
        // Update resource bundle for Swing HTML (JTabbedPane)
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html.jtabbedpane", classLoaders);
        // Update resource bundle for Swing HTML (JToolBar)
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html.jtoolbar", classLoaders);
        // Update resource bundle for Swing HTML (JMenuBar)
        updateSwingResourceBundle("com.eteks.sweethome3d.swing.resources.swing.html.jmenubar", classLoaders);
        // Update resource bundle for Swing HTML (JMenuItem)
        updateSwingResourceBundle("com.eteks.sw