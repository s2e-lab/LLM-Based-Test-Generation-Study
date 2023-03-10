// AddUserTest0.java
package src.feudalismGUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import src.CurrentPlayers;
import src.GameAutoActions;
import src.Knight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddUser}.
* It contains ten unit test cases for the {@link AddUser#isThereKing()} method.
*/
class AddUserTest0 {

		/**
		* Test case for {@link AddUser#isThereKing()} method.
		* It tests if the method returns true when there is a king in the game.
		*/
		@Test
		void testIsThereKing0() {
				Knight king = new Knight("king", "king", "king");
				CurrentPlayers.setKing(king);
				AddUser addUser = new AddUser();
				assertTrue(addUser.isThereKing());
		}
		
		/**
		* Test case for {@link AddUser#isThereKing()} method.
		* It tests if the method returns false when there is no king in the game.
		*/
		@Test
		void testIsThereKing1() {
				AddUser addUser = new AddUser();
				assertFalse(addUser.isThereKing());
		}
		
		/**
		* Test case for {@link AddUser#isThereKing()} method.
		* It tests if the method returns false when there is no king in the game.
		*/
		@Test
		void testIsThereKing2() {
				AddUser addUser = new AddUser();
				assertFalse(addUser.isThereKing());
		}
		
		/**
		* Test case for {@link AddUser#isThereKing()} method.
		* It tests if the method returns false when there is no king in the game.
		*/
		@Test
		void testIsThereKing3() {
				AddUser addUser = new AddUser();
				assertFalse(addUser.isThereKing());
		}
		
		/**
		* Test case for {@link AddUser#isThereKing()} method.
		* It tests if the method returns false when there is no king in the game.
		*/
		@Test
		void testIsThereKing4() {
				AddUser addUser = new AddUser();
				assertFalse(addUser.isThereKing());
		}
		
		/**
		* Test case for {@link AddUser#isThereKing()} method.
		* It tests if the method returns false when there is no king in the game.
		*/
		@Test
		void testIsThereKing5() {
				AddUser addUser = new AddUser();
				assertFalse(addUser.isThereKing());
		}
		
		/**
		* Test case for {@link AddUser#isThereKing()} method.
		* It tests if the method returns false when there is no king in the game.
		*/
		@Test
		void testIsThereKing6() {
				AddUser addUser = new AddUser();
				assertFalse(addUser.isThereKing());
		}
		
		/**
		* Test case for {@link AddUser#isThereKing()} method.
		* It tests if the method returns false when there is no king in the game.
		*/
		@Test
		void testIsThereKing7() {
				AddUser addUser = new AddUser();
				assertFalse(addUser.isThereKing());
		}
		
		/**
		* Test case for {@link AddUser#isThereKing()} method.
		* It tests if the method returns false when there is no king in the game.
		*/
		@Test
		void testIsThereKing8() {
				AddUser addUser = new AddUser();
				assertFalse(addUser.isThereKing());
		}
		
		/**
		* Test case for {@link AddUser#isThereKing()} method.
		* It tests if the method returns false when there is no king in the game.
		*/
		@Test
		void testIsThereKing9() {
				AddUser addUser = new AddUser();
				assertFalse(addUser.isThereKing());
		}
}</code></pre>
</div>
</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div>

</div