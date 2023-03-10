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
		* It tests if the method returns false when the password field is empty.
		*/
		@Test
		void testValidator1() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("");
				assertFalse(editUser.validator());
		}
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* It tests if the method returns true when the password field is not empty.
		*/
		@Test
		void testValidator2() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("password");
				assertTrue(editUser.validator());
		}
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* It tests if the method returns false when the password field is empty.
		*/
		@Test
		void testValidator3() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("");
				assertFalse(editUser.validator());
		}
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* It tests if the method returns true when the password field is not empty.
		*/
		@Test
		void testValidator4() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("password");
				assertTrue(editUser.validator());
		}
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* It tests if the method returns false when the password field is empty.
		*/
		@Test
		void testValidator5() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("");
				assertFalse(editUser.validator());
		}
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* It tests if the method returns true when the password field is not empty.
		*/
		@Test
		void testValidator6() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("password");
				assertTrue(editUser.validator());
		}
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* It tests if the method returns false when the password field is empty.
		*/
		@Test
		void testValidator7() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("");
				assertFalse(editUser.validator());
		}
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* It tests if the method returns true when the password field is not empty.
		*/
		@Test
		void testValidator8() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("password");
				assertTrue(editUser.validator());
		}
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* It tests if the method returns false when the password field is empty.
		*/
		@Test
		void testValidator9() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("");
				assertFalse(editUser.validator());
		}
		
		/**
		* Test case for {@link EditUser#validator()} method.
		* It tests if the method returns true when the password field is not empty.
		*/
		@Test
		void testValidator10() {
				EditUser editUser = new EditUser();
				editUser.passwdTxt.setText("password");
				assertTrue(editUser.validator());
		}
}

// EditUserTest2.java
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
class EditUserTest2 {
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* It tests if the method returns false when there is no king.
		*/
		@Test
		void testIsThereKing1() {
				EditUser editUser = new EditUser();
				assertFalse(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* It tests if the method returns true when there is a king.
		*/
		@Test
		void testIsThereKing2() {
				EditUser editUser = new EditUser();
				assertTrue(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* It tests if the method returns false when there is no king.
		*/
		@Test
		void testIsThereKing3() {
				EditUser editUser = new EditUser();
				assertFalse(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		* It tests if the method returns true when there is a king.
		*/
		@Test
		void testIsThereKing4() {
				EditUser editUser = new EditUser();
				assertTrue(editUser.isThereKing());
		}
		
		/**
		* Test case for {@link EditUser#isThereKing()} method.
		