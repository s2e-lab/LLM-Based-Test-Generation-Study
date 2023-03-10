// EditUserTest0.java
package src.feudalismGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.MutableComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import src.CurrentPlayers;
import src.GameAutoActions;
import src.Knight;
import src.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditUser}.
* It contains ten unit test cases for the {@link EditUser#isThereKing()} method.
*/
class EditUserTest0 {

		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* Test case for the scenario when there is no king.
		*/
		@Test
		void testIsThereKing0() {
				EditUser editUser = new EditUser();
				assertFalse(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* Test case for the scenario when there is a king.
		*/
		@Test
		void testIsThereKing1() {
				EditUser editUser = new EditUser();
				Knight knight = new Knight("knight", "password", "king", 0, 0);
				CurrentPlayers.setKing(knight);
				assertTrue(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* Test case for the scenario when there is a king.
		*/
		@Test
		void testIsThereKing2() {
				EditUser editUser = new EditUser();
				Knight knight = new Knight("knight", "password", "king", 0, 0);
				CurrentPlayers.setKing(knight);
				assertTrue(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* Test case for the scenario when there is a king.
		*/
		@Test
		void testIsThereKing3() {
				EditUser editUser = new EditUser();
				Knight knight = new Knight("knight", "password", "king", 0, 0);
				CurrentPlayers.setKing(knight);
				assertTrue(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* Test case for the scenario when there is a king.
		*/
		@Test
		void testIsThereKing4() {
				EditUser editUser = new EditUser();
				Knight knight = new Knight("knight", "password", "king", 0, 0);
				CurrentPlayers.setKing(knight);
				assertTrue(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* Test case for the scenario when there is a king.
		*/
		@Test
		void testIsThereKing5() {
				EditUser editUser = new EditUser();
				Knight knight = new Knight("knight", "password", "king", 0, 0);
				CurrentPlayers.setKing(knight);
				assertTrue(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* Test case for the scenario when there is a king.
		*/
		@Test
		void testIsThereKing6() {
				EditUser editUser = new EditUser();
				Knight knight = new Knight("knight", "password", "king", 0, 0);
				CurrentPlayers.setKing(knight);
				assertTrue(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* Test case for the scenario when there is a king.
		*/
		@Test
		void testIsThereKing7() {
				EditUser editUser = new EditUser();
				Knight knight = new Knight("knight", "password", "king", 0, 0);
				CurrentPlayers.setKing(knight);
				assertTrue(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* Test case for the scenario when there is a king.
		*/
		@Test
		void testIsThereKing8() {
				EditUser editUser = new EditUser();
				Knight knight = new Knight("knight", "password", "king", 0, 0);
				CurrentPlayers.setKing(knight);
				assertTrue(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* Test case for the scenario when there is a king.
		*/
		@Test
		void testIsThereKing9() {
				EditUser editUser = new EditUser();
				Knight knight = new Knight("knight", "password", "king", 0, 0);
				CurrentPlayers.setKing(knight);
				assertTrue(editUser.isThereKing());
		}
}

// EditUserTest1.java
package src.feudalismGUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.MutableComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import src.CurrentPlayers;
import src.GameAutoActions;
import src.Knight;
import src.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditUser}.
* It contains ten unit test cases for the {@link EditUser#validator()} method.
*/
class EditUserTest1 {
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* Test case for the scenario when the password is empty.
		*/
		@Test
		void testValidator0() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("");
				assertFalse(editUser.validator());
		}
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* Test case for the scenario when the password is not empty.
		*/
		@Test
		void testValidator1() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("password");
				assertTrue(editUser.validator());
		}
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* Test case for the scenario when the