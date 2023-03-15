// GUIModuleTest.java
package module;

// Skin Look and Feel support - http://www.l2fprod.com/
import com.l2fprod.gui.plaf.skin.SkinLookAndFeel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTree;
import javax.swing.JFrame;
import javax.swing.ListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Observer;
import java.util.ResourceBundle;
import java.util.Locale;
import java.io.*;
import gui.GUIFrame;
import state.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GUIModule}.
* It contains ten unit test cases for the {@link GUIModule#getPicturePath(int)} method.
*/
class GUIModuleTest {

		/**
		* Test case for {@link GUIModule#getPicturePath(int)} method.
		* It tests if the method returns the correct picture path for a given picture id.
		*/
		@Test
		void testGetPicturePath() {
				GUIModule gm = new GUIModule();
				assertEquals("data/pictures/player/player1.png", gm.getPicturePath(0));
				assertEquals("data/pictures/player/player2.png", gm.getPicturePath(1));
				assertEquals("data/pictures/player/player3.png", gm.getPicturePath(2));
				assertEquals("data/pictures/player/player4.png", gm.getPicturePath(3));
				assertEquals("data/pictures/player/player5.png", gm.getPicturePath(4));
				assertEquals("data/pictures/player/player6.png", gm.getPicturePath(5));
				assertEquals("data/pictures/player/player7.png", gm.getPicturePath(6));
				assertEquals("data/pictures/player/player8.png", gm.getPicturePath(7));
				assertEquals("data/pictures/player/player9.png", gm.getPicturePath(8));
				assertEquals("data/pictures/player/player10.png", gm.getPicturePath(9));
		}
}