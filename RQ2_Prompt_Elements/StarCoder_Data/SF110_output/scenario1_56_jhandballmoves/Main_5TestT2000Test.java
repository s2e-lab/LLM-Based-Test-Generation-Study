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
* It contains ten unit test cases for the {@link Main#deepCopy(Object)} method.
*/
class Main_5Test {

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link Color} object.
    */
    @Test
    void testDeepCopyColor() {
        Color color = new Color(255, 0, 0);
        Color colorCopy = null;
        try {
            colorCopy = (Color) Main.deepCopy(color);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(color, colorCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link Dimension} object.
    */
    @Test
    void testDeepCopyDimension() {
        Dimension dimension = new Dimension(100, 200);
        Dimension dimensionCopy = null;
        try {
            dimensionCopy = (Dimension) Main.deepCopy(dimension);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(dimension, dimensionCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link ImageIcon} object.
    */
    @Test
    void testDeepCopyImageIcon() {
        ImageIcon imageIcon = new ImageIcon(Resources.class.getResource("images/icon.png"));
        ImageIcon imageIconCopy = null;
        try {
            imageIconCopy = (ImageIcon) Main.deepCopy(imageIcon);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(imageIcon, imageIconCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link JFrame} object.
    */
    @Test
    void testDeepCopyJFrame() {
        JFrame frame = new JFrame();
        JFrame frameCopy = null;
        try {
            frameCopy = (JFrame) Main.deepCopy(frame);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(frame, frameCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link JInternalFrame} object.
    */
    @Test
    void testDeepCopyJInternalFrame() {
        JInternalFrame internalFrame = new JInternalFrame();
        JInternalFrame internalFrameCopy = null;
        try {
            internalFrameCopy = (JInternalFrame) Main.deepCopy(internalFrame);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(internalFrame, internalFrameCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link JScrollPane} object.
    */
    @Test
    void testDeepCopyJScrollPane() {
        JScrollPane scrollPane = new JScrollPane();
        JScrollPane scrollPaneCopy = null;
        try {
            scrollPaneCopy = (JScrollPane) Main.deepCopy(scrollPane);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(scrollPane, scrollPaneCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link JTable} object.
    */
    @Test
    void testDeepCopyJTable() {
        JTable table = new JTable();
        JTable tableCopy = null;
        try {
            tableCopy = (JTable) Main.deepCopy(table);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(table, tableCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link JToolBar} object.
    */
    @Test
    void testDeepCopyJToolBar() {
        JToolBar toolBar = new JToolBar();
        JToolBar toolBarCopy = null;
        try {
            toolBarCopy = (JToolBar) Main.deepCopy(toolBar);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(toolBar, toolBarCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link JPanel} object.
    */
    @Test
    void testDeepCopyJPanel() {
        JPanel panel = new JPanel();
        JPanel panelCopy = null;
        try {
            panelCopy = (JPanel) Main.deepCopy(panel);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(panel, panelCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link JDesktopPane} object.
    */
    @Test
    void testDeepCopyJDesktopPane() {
        JDesktopPane desktopPane = new JDesktopPane();
        JDesktopPane desktopPaneCopy = null;
        try {
            desktopPaneCopy = (JDesktopPane) Main.deepCopy(desktopPane);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(desktopPane, desktopPaneCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link JMenuBar} object.
    */
    @Test
    void testDeepCopyJMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenuBar menuBarCopy = null;
        try {
            menuBarCopy = (JMenuBar) Main.deepCopy(menuBar);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(menuBar, menuBarCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link JMenu} object.
    */
    @Test
    void testDeepCopyJMenu() {
        JMenu menu = new JMenu();
        JMenu menuCopy = null;
        try {
            menuCopy = (JMenu) Main.deepCopy(menu);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(menu, menuCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link JMenu} object.
    */
    @Test
    void testDeepCopyJMenuHelper() {
        JMenuHelper menuHelper = new JMenuHelper();
        JMenuHelper menuHelperCopy = null;
        try {
            menuHelperCopy = (JMenuHelper) Main.deepCopy(menuHelper);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(menuHelper, menuHelperCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link MouseController} object.
    */
    @Test
    void testDeepCopyMouseController() {
        MouseController mouseController = new MouseController();
        MouseController mouseControllerCopy = null;
        try {
            mouseControllerCopy = (MouseController) Main.deepCopy(mouseController);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(mouseController, mouseControllerCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link TableHandballModel} object.
    */
    @Test
    void testDeepCopyTableHandballModel() {
        TableHandballModel tableHandballModel = new TableHandballModel();
        TableHandballModel tableHandballModelCopy = null;
        try {
            tableHandballModelCopy = (TableHandballModel) Main.deepCopy(tableHandballModel);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(tableHandballModel, tableHandballModelCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link TableSelectionListener} object.
    */
    @Test
    void testDeepCopyTableSelectionListener() {
        TableSelectionListener tableSelectionListener = new TableSelectionListener();
        TableSelectionListener tableSelectionListenerCopy = null;
        try {
            tableSelectionListenerCopy = (TableSelectionListener) Main.deepCopy(tableSelectionListener);
        } catch (Exception e) {
            fail("Exception in deepCopy: " + e);
        }
        assertEquals(tableSelectionListener, tableSelectionListenerCopy);
    }

    /**
    * Test case for the {@link Main#deepCopy(Object)} method.
    * It tests the deep copy of a {@link StatusBar} object.
    */
    @Test
    void