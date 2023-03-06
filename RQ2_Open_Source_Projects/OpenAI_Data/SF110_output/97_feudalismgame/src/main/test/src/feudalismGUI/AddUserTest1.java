// AddUserTest1.java
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
* It contains ten unit test cases for the {@link AddUser#validator(Knight)} method.
*/
class AddUserTest1 {

		/**
		* Test case 1 for {@link AddUser#validator(Knight)}.
		* It tests if the method returns false when the username is empty.
		*/
		@Test
		void testValidator1() {
				Knight player = new Knight("", "knight", "password");
				AddUser addUser = new AddUser();
				assertFalse(addUser.validator(player));
		}
		
		/**
		* Test case 2 for {@link AddUser#validator(Knight)}.
		* It tests if the method returns false when the username is null.
		*/
		@Test
		void testValidator2() {
				Knight player = new Knight(null, "knight", "password");
				AddUser addUser = new AddUser();
				assertFalse(addUser.validator(player));
		}
		
		/**
		* Test case 3 for {@link AddUser#validator(Knight)}.
		* It tests if the method returns false when the password is empty.
		*/
		@Test
		void testValidator3() {
				Knight player = new Knight("username", "knight", "");
				AddUser addUser = new AddUser();
				assertFalse(addUser.validator(player));
		}
		
		/**
		* Test case 4 for {@link AddUser#validator(Knight)}.
		* It tests if the method returns false when the password is null.
		*/
		@Test
		void testValidator4() {
				Knight player = new Knight("username", "knight", null);
				AddUser addUser = new AddUser();
				assertFalse(addUser.validator(player));
		}
		
		/**
		* Test case 5 for {@link AddUser#validator(Knight)}.
		* It tests if the method returns false when the username is already in use.
		*/
		@Test
		void testValidator5() {
				Knight player = new Knight("username", "knight", "password");
				AddUser addUser = new AddUser();
				addUser.allPlayers.put("username", player);
				assertFalse(addUser.validator(player));
		}
		
		/**
		* Test case 6 for {@link AddUser#validator(Knight)}.
		* It tests if the method returns true when the username is not empty, not null, not already in use and the password is not empty and not null.
		*/
		@Test
		void testValidator6() {
				Knight player = new Knight("username", "knight", "password");
				AddUser addUser = new AddUser();
				assertTrue(addUser.validator(player));
		}
		
		/**
		* Test case 7 for {@link AddUser#validator(Knight)}.
		* It tests if the method returns false when the username is not empty, not null, not already in use and the password is empty.
		*/
		@Test
		void testValidator7() {
				Knight player = new Knight("username", "knight", "");
				AddUser addUser = new AddUser();
				assertFalse(addUser.validator(player));
		}
		
		/**
		* Test case 8 for {@link AddUser#validator(Knight)}.
		* It tests if the method returns false when the username is not empty, not null, not already in use and the password is null.
		*/
		@Test
		void testValidator8() {
				Knight player = new Knight("username", "knight", null);
				AddUser addUser = new AddUser();
				assertFalse(addUser.validator(player));
		}
		
		/**
		* Test case 9 for {@link AddUser#validator(Knight)}.
		* It tests if the method returns false when the username is empty, not null, not already in use and the password is not empty and not null.
		*/
		@Test
		void testValidator9() {
				Knight player = new Knight("", "knight", "password");
				AddUser addUser = new AddUser();
				assertFalse(addUser.validator(player));
		}
		
		/**
		* Test case 10 for {@link AddUser#validator(Knight)}.
		* It tests if the method returns false when the username is null, not null, not already in use and the password is not empty and not null.
		*/
		@Test
		void testValidator10() {
				Knight player = new Knight(null, "knight", "password");
				AddUser addUser = new AddUser();
				assertFalse(addUser.validator(player));
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

</