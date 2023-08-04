// Main_4Test.java
package visu.handball.moves;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import visu.handball.moves.actions.AboutAction;
import visu.handball.moves.actions.ChangeColorsAction;
import visu.handball.moves.actions.CloseAction;
import visu.handball.moves.actions.CreateMovePdfAction;
import visu.handball.moves.actions.DeleteEventAction;
import visu.handball.moves.actions.NewAction;
import visu.handball.moves.actions.NewMoveEventAction;
import visu.handball.moves.actions.NewPassEventAction;
import visu.handball.moves.actions.NewSequenceAction;
import visu.handball.moves.actions.OpenAction;
import visu.handball.moves.actions.PauseAnimationAction;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.actions.PrintMoveAction;
import visu.handball.moves.actions.SaveAction;
import visu.handball.moves.actions.SetMoveNameAction;
import visu.handball.moves.actions.StartAnimationAction;
import visu.handball.moves.actions.StartOneSequenceAnimationAction;
import visu.handball.moves.actions.StopAnimationAction;
import visu.handball.moves.controller.CommentController;
import visu.handball.moves.controller.JMenuHelper;
import visu.handball.moves.controller.MouseController;
import visu.handball.moves.model.ColorModel;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.TableHandballModel;
import visu.handball.moves.model.TableSelectionListener;
import visu.handball.moves.resources.Resources;
import visu.handball.moves.views.CommentView;
import visu.handball.moves.views.EventTableCellDelayEditor;
import visu.handball.moves.views.EventTableCellRenderer;
import visu.handball.moves.views.Field;
import visu.handball.moves.views.PlayerToolBar;
import visu.handball.moves.views.StatusBar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#getCloseAction()} method.
*/
class Main_4Test {

    /**
     * Test of getCloseAction method, of class Main.
     */
    @Test
    void testGetCloseAction() {
        System.out.println("getCloseAction");
        CloseAction expResult = new CloseAction();
        CloseAction result = Main.getCloseAction();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSaveAction method, of class Main.
     */
    @Test
    void testGetSaveAction() {
        System.out.println("getSaveAction");
        SaveAction expResult = new SaveAction();
        SaveAction result = Main.getSaveAction();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSetNameAction method, of class Main.
     */
    @Test
    void testGetSetNameAction() {
        System.out.println("getSetNameAction");
        SetMoveNameAction expResult = new SetMoveNameAction();
        SetMoveNameAction result = Main.getSetNameAction();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVersion method, of class Main.
     */
    @Test
    void testGetVersion() {
        System.out.println("getVersion");
        String expResult = "1.0";
        String result = Main.getVersion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWindow method, of class Main.
     */
    @Test
    void testGetWindow() {
        System.out.println("getWindow");
        JFrame expResult = new JFrame();
        JFrame result = Main.getWindow();
        assertEquals(expResult, result);
    }

    /**
     * Test of getField method, of class Main.
     */
    @Test
    void testGetField() {
        System.out.println("getField");
        Field expResult = new Field();
        Field result = Main.getField();
        assertEquals(expResult, result);
    }

    /**
     * Test of deepCopy method, of class Main.
     */
    @Test
    void testDeepCopy() {
        System.out.println("deepCopy");
        Object oldObj = new Object();
        try {
            Object expResult = new Object();
            Object result = Main.deepCopy(oldObj);
            assertEquals(expResult, result);
        } catch (Exception ex) {
            fail("Exception thrown");
        }
    }
}

// Main_5Test.java
package visu.handball.moves;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import visu.handball.moves.actions.AboutAction;
import visu.handball.moves.actions.ChangeColorsAction;
import visu.handball.moves.actions.CloseAction;
import visu.handball.moves.actions.CreateMovePdfAction;
import visu.handball.moves.actions.DeleteEventAction;
import visu.handball.moves.actions.NewAction;
import visu.handball.moves.actions.NewMoveEventAction;
import visu.handball.moves.actions.NewPassEventAction;
import visu.handball.moves.actions.NewSequenceAction;
import visu.handball.moves.actions.OpenAction;
import visu.handball.moves.actions.PauseAnimationAction;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.actions.PrintMoveAction;
import visu.handball.moves.actions.SaveAction;
import visu.handball.moves.actions.SetMoveNameAction;
import visu.handball.moves.actions.StartAnimationAction;
import visu.handball.moves.actions.StartOneSequenceAnimationAction;
import visu.handball.moves.actions.StopAnimationAction;
import visu.handball.moves.controller.CommentController;
import visu.handball.moves.controller.JMenuHelper;
import visu.handball.moves.controller.MouseController;
import visu.handball.moves.model.ColorModel;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.TableHandballModel;
import visu.handball.moves.model.TableSelectionListener;
import visu.handball.moves.resources.Resources;
import visu.handball.moves.views.CommentView;
import visu.handball.moves.views.EventTableCellDelayEditor;
import visu.handball.moves.views.EventTableCellRenderer;
import visu.handball.moves.views.Field;
import visu.handball.moves.views.PlayerToolBar;
import visu.handball.moves.views.StatusBar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#getResource(java.lang.String)} method.
*/
class Main_5Test {
		
    /**
     * Test of getResource method, of class Main.
     */
    @Test
    void testGetResource() {
        System.out.println("getResource");
        String path = "resources/images/logo.png";
        URL expResult = Resources.class.getResource(path);
        URL result = Main.getResource(path);
        assertEquals(expResult, result);
    }

    /**
     * Test of createImageIcon method, of class Main.
     */
    @Test
    void testCreateImageIcon() {
        System.out.println("createImageIcon");
        String path = "resources/images/logo.png";
        String description = "Logo";
        ImageIcon expResult = new ImageIcon(Resources.class.getResource(path));
        ImageIcon result = Main.createImageIcon(path, description);
        assertEquals(expResult, result);
    }

    /**
     * Test of locateOnScreenCenter method, of class Main.
     */
    @Test
    void testLocateOnScreenCenter() {
        System.out.println("locateOnScreenCenter");
        Component component = new JPanel();
        Main.locateOnScreenCenter(component);
    }

    /**
     * Test of createHandballModel method, of class Main.
     */
    @Test
    void testCreateHandballModel() {
        System.out.println("createHandballModel");
        HandballModel expResult = new TableHandballModel();
        HandballModel result = Main.createHandballModel();
        assertEquals(expResult, result);
    }
}

// Main_6Test.java
package visu.handball.moves;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import visu.handball.moves.actions.AboutAction;
import visu.handball.moves.actions.ChangeColorsAction;
import visu.handball.moves.actions.CloseAction;
import visu.handball.moves.actions.CreateMovePdfAction;
import visu.handball.moves.actions.DeleteEventAction;
import visu.handball.moves.actions.NewAction;
import visu.handball.moves.actions.NewMoveEventAction;
import visu.handball.moves.actions.NewPassEventAction;
import visu.handball.moves.actions.NewSequenceAction;
import visu.handball.moves