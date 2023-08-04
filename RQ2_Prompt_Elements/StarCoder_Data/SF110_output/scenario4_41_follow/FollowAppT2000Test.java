// FollowAppTest.java
package ghm.follow;

import ghm.follow.config.Configure;
import ghm.follow.config.FollowAppAttributes;
import ghm.follow.event.WindowTracker;
import ghm.follow.gui.About;
import ghm.follow.gui.Clear;
import ghm.follow.gui.ClearAll;
import ghm.follow.gui.Close;
import ghm.follow.gui.Debug;
import ghm.follow.gui.Delete;
import ghm.follow.gui.DeleteAll;
import ghm.follow.gui.DndFileOpener;
import ghm.follow.gui.Edit;
import ghm.follow.gui.Exit;
import ghm.follow.gui.FileFollowingPane;
import ghm.follow.gui.FollowAppAction;
import ghm.follow.gui.Menu;
import ghm.follow.gui.ComponentBuilder;
import ghm.follow.gui.Open;
import ghm.follow.gui.Pause;
import ghm.follow.gui.PopupMenu;
import ghm.follow.gui.Reset;
import ghm.follow.gui.StartupStatus;
import ghm.follow.gui.TabbedPane;
import ghm.follow.gui.ToolBar;
import ghm.follow.gui.FollowAppAction.ActionContext;
import ghm.follow.nav.Bottom;
import ghm.follow.nav.NextTab;
import ghm.follow.nav.PreviousTab;
import ghm.follow.nav.Top;
import ghm.follow.search.ClearAllHighlights;
import ghm.follow.search.ClearHighlights;
import ghm.follow.search.Find;
import ghm.follow.search.SearchableTextPane;
import ghm.follow.systemInterface.DefaultSystemInterface;
import ghm.follow.systemInterface.SystemInterface;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.awt.dnd.DropTarget;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FollowApp}.
* It contains ten unit test cases for the {@link FollowApp#getIcon(Class, String)} method.
*/
class FollowAppTest {

    /**
     * Test of {@link FollowApp#getIcon(Class, String)} method, of class FollowApp.
     */
    @Test
    void testGetIcon() {
        System.out.println("getIcon");
        Class<?> clazz = FollowApp.class;
        String iconNameKey = "icon.open";
        ImageIcon expResult = new ImageIcon(FollowApp.class.getResource("/ghm/follow/images/open.gif"));
        ImageIcon result = FollowApp.getIcon(clazz, iconNameKey);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FollowApp#getIcon(Class, String)} method, of class FollowApp.
     */
    @Test
    void testGetIcon2() {
        System.out.println("getIcon");
        Class<?> clazz = FollowApp.class;
        String iconNameKey = "icon.pause";
        ImageIcon expResult = new ImageIcon(FollowApp.class.getResource("/ghm/follow/images/pause.gif"));
        ImageIcon result = FollowApp.getIcon(clazz, iconNameKey);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FollowApp#getIcon(Class, String)} method, of class FollowApp.
     */
    @Test
    void testGetIcon3() {
        System.out.println("getIcon");
        Class<?> clazz = FollowApp.class;
        String iconNameKey = "icon.close";
        ImageIcon expResult = new ImageIcon(FollowApp.class.getResource("/ghm/follow/images/close.gif"));
        ImageIcon result = FollowApp.getIcon(clazz, iconNameKey);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FollowApp#getIcon(Class, String)} method, of class FollowApp.
     */
    @Test
    void testGetIcon4() {
        System.out.println("getIcon");
        Class<?> clazz = FollowApp.class;
        String iconNameKey = "icon.delete";
        ImageIcon expResult = new ImageIcon(FollowApp.class.getResource("/ghm/follow/images/delete.gif"));
        ImageIcon result = FollowApp.getIcon(clazz, iconNameKey);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FollowApp#getIcon(Class, String)} method, of class FollowApp.
     */
    @Test
    void testGetIcon5() {
        System.out.println("getIcon");
        Class<?> clazz = FollowApp.class;
        String iconNameKey = "icon.edit";
        ImageIcon expResult = new ImageIcon(FollowApp.class.getResource("/ghm/follow/images/edit.gif"));
        ImageIcon result = FollowApp.getIcon(clazz, iconNameKey);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FollowApp#getIcon(Class, String)} method, of class FollowApp.
     */
    @Test
    void testGetIcon6() {
        System.out.println("getIcon");
        Class<?> clazz = FollowApp.class;
        String iconNameKey = "icon.clear";
        ImageIcon expResult = new ImageIcon(FollowApp.class.getResource("/ghm/follow/images/clear.gif"));
        ImageIcon result = FollowApp.getIcon(clazz, iconNameKey);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FollowApp#getIcon(Class, String)} method, of class FollowApp.
     */
    @Test
    void testGetIcon7() {
        System.out.println("getIcon");
        Class<?> clazz = FollowApp.class;
        String iconNameKey = "icon.clearall";
        ImageIcon expResult = new ImageIcon(FollowApp.class.getResource("/ghm/follow/images/clearall.gif"));
        ImageIcon result = FollowApp.getIcon(clazz, iconNameKey);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FollowApp#getIcon(Class, String)} method, of class FollowApp.
     */
    @Test
    void testGetIcon8() {
        System.out.println("getIcon");
        Class<?> clazz = FollowApp.class;
        String iconNameKey = "icon.find";
        ImageIcon expResult = new ImageIcon(FollowApp.class.getResource("/ghm/follow/images/find.gif"));
        ImageIcon result = FollowApp.getIcon(clazz, iconNameKey);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FollowApp#getIcon(Class, String)} method, of class FollowApp.
     */
    @Test
    void testGetIcon9() {
        System.out.println("getIcon");
        Class<?> clazz = FollowApp.class;
        String iconNameKey = "icon.top";
        ImageIcon expResult = new ImageIcon(FollowApp.class.getResource("/ghm/follow/images/top.gif"));
        ImageIcon result = FollowApp.getIcon(clazz, iconNameKey);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link FollowApp#getIcon(Class, String)} method, of class FollowApp.
     */
    @Test
    void testGetIcon10() {
        System.out.println("getIcon");
        Class<?> clazz = FollowApp.class;
        String iconNameKey = "icon.bottom";
        ImageIcon expResult = new ImageIcon(FollowApp.class.getResource("/ghm/follow/images/bottom.gif"));
        ImageIcon result = FollowApp.getIcon(clazz, iconNameKey);
        assertEquals(expResult, result);
    }
}

// FollowApp.java
package ghm.follow;

import ghm.follow.config.Configure;
import ghm.follow.config.FollowAppAttributes;
import ghm.follow.event.WindowTracker;
import ghm.follow.gui.About;
import ghm.follow.gui.Clear;
import ghm.follow.gui.ClearAll;
import ghm.follow.gui.Close;
import ghm.follow.gui.Debug;
import ghm.follow.gui.Delete;
import ghm.follow.gui.DeleteAll;
import ghm.follow.gui.DndFileOpener;
import ghm.follow.gui.Edit;
import ghm.follow.gui.Exit;
import ghm.follow.gui.FileFollowingPane;
import ghm.follow.gui.FollowAppAction;
import ghm.follow.gui.Menu;
import ghm.follow.gui.ComponentBuilder;
import ghm.follow.gui.Open;
import ghm.follow.gui.Pause;
import ghm.follow.gui.PopupMenu;
import ghm.follow.gui.Reset;
import ghm.follow.gui.StartupStatus;
import ghm.follow.gui.TabbedPane;
import ghm.follow.gui.ToolBar;
import ghm.follow.gui.FollowAppAction.ActionContext;
import ghm.follow.nav.Bottom;
import ghm.follow.nav.NextTab;
import ghm.follow.nav.PreviousTab;
import ghm.follow.nav.Top;
import ghm.follow.search.ClearAllHighlights;
import ghm.follow.search.ClearHighlights;
import ghm.follow.search.Find;
import ghm.follow.search.SearchableTextPane;
import ghm.follow.systemInterface.DefaultSystemInterface;
import ghm.follow.systemInterface.SystemInterface;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.awt.dnd.DropTarget;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**