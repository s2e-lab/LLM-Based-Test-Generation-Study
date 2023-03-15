// Main_8Test.java
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
class Main_8Test {

		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link HandballModel}.
		*/
		@Test
		void testDeepCopy_HandballModel() throws Exception {
				HandballModel model = new HandballModel();
				HandballModel clone = (HandballModel) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link ColorModel}.
		*/
		@Test
		void testDeepCopy_ColorModel() throws Exception {
				ColorModel model = new ColorModel();
				ColorModel clone = (ColorModel) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link StatusBar}.
		*/
		@Test
		void testDeepCopy_StatusBar() throws Exception {
				StatusBar model = new StatusBar(new HandballModel());
				StatusBar clone = (StatusBar) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link JMenuBar}.
		*/
		@Test
		void testDeepCopy_JMenuBar() throws Exception {
				JMenuBar model = new JMenuBar();
				JMenuBar clone = (JMenuBar) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link JMenu}.
		*/
		@Test
		void testDeepCopy_JMenu() throws Exception {
				JMenu model = new JMenu();
				JMenu clone = (JMenu) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link JPanel}.
		*/
		@Test
		void testDeepCopy_JPanel() throws Exception {
				JPanel model = new JPanel();
				JPanel clone = (JPanel) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link JDesktopPane}.
		*/
		@Test
		void testDeepCopy_JDesktopPane() throws Exception {
				JDesktopPane model = new JDesktopPane();
				JDesktopPane clone = (JDesktopPane) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link JInternalFrame}.
		*/
		@Test
		void testDeepCopy_JInternalFrame() throws Exception {
				JInternalFrame model = new JInternalFrame();
				JInternalFrame clone = (JInternalFrame) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link JScrollPane}.
		*/
		@Test
		void testDeepCopy_JScrollPane() throws Exception {
				JScrollPane model = new JScrollPane();
				JScrollPane clone = (JScrollPane) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link JTable}.
		*/
		@Test
		void testDeepCopy_JTable() throws Exception {
				JTable model = new JTable();
				JTable clone = (JTable) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link JToolBar}.
		*/
		@Test
		void testDeepCopy_JToolBar() throws Exception {
				JToolBar model = new JToolBar();
				JToolBar clone = (JToolBar) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link Color}.
		*/
		@Test
		void testDeepCopy_Color() throws Exception {
				Color model = new Color(0, 0, 0);
				Color clone = (Color) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link Dimension}.
		*/
		@Test
		void testDeepCopy_Dimension() throws Exception {
				Dimension model = new Dimension(0, 0);
				Dimension clone = (Dimension) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link URL}.
		*/
		@Test
		void testDeepCopy_URL() throws Exception {
				URL model = new URL("http://www.google.de");
				URL clone = (URL) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link ImageIcon}.
		*/
		@Test
		void testDeepCopy_ImageIcon() throws Exception {
				ImageIcon model = new ImageIcon();
				ImageIcon clone = (ImageIcon) Main.deepCopy(model);
				assertNotSame(model, clone);
				assertEquals(model, clone);
		}
		
		/**
		* Test case for {@link Main#deepCopy(Object)} method.
		* Tested object is {@link Component}.
		*/
		@Test
		void