// ChatPanelTest.java
package gui;

import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.util.ResourceBundle;
import java.util.Locale;
import java.util.Hashtable;
import module.GUIModule;
import module.Kernel;
import module.AbstractModule;
import module.Message;
import module.ModuleRegisterException;
import module.Module;
import module.MessageProcessingException;
import module.MessageDeliveryException;
import static module.MessageFactory.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChatPanel}.
* It contains ten unit test cases for the {@link ChatPanel#addTab(Object)} method.
*/
class ChatPanelTest {

	/**
	* Test case 1 for the {@link ChatPanel#addTab(Object)} method.
	* This test case checks if the method returns null when the hashtable already contains the key.
	*/
	@Test
	void testAddTab1() {
		ChatPanel chatPanel = new ChatPanel(new GUIModule(new Kernel()));
		Object id = new Object();
		chatPanel.addTab(id);
		assertNull(chatPanel.addTab(id));
	}
	
	/**
	* Test case 2 for the {@link ChatPanel#addTab(Object)} method.
	* This test case checks if the method returns null when the hashtable already contains the key.
	*/
	@Test
	void testAddTab2() {
		ChatPanel chatPanel = new ChatPanel(new GUIModule(new Kernel()));
		Object id = new Object();
		chatPanel.addTab(id);
		assertNull(chatPanel.addTab(id));
	}
	
	/**
	* Test case 3 for the {@link ChatPanel#addTab(Object)} method.
	* This test case checks if the method returns null when the hashtable already contains the key.
	*/
	@Test
	void testAddTab3() {
		ChatPanel chatPanel = new ChatPanel(new GUIModule(new Kernel()));
		Object id = new Object();
		chatPanel.addTab(id);
		assertNull(chatPanel.addTab(id));
	}
	
	/**
	* Test case 4 for the {@link ChatPanel#addTab(Object)} method.
	* This test case checks if the method returns null when the hashtable already contains the key.
	*/
	@Test
	void testAddTab4() {
		ChatPanel chatPanel = new ChatPanel(new GUIModule(new Kernel()));
		Object id = new Object();
		chatPanel.addTab(id);
		assertNull(chatPanel.addTab(id));
	}
	
	/**
	* Test case 5 for the {@link ChatPanel#addTab(Object)} method.
	* This test case checks if the method returns null when the hashtable already contains the key.
	*/
	@Test
	void testAddTab5() {
		ChatPanel chatPanel = new ChatPanel(new GUIModule(new Kernel()));
		Object id = new Object();
		chatPanel.addTab(id);
		assertNull(chatPanel.addTab(id));
	}
	
	/**
	* Test case 6 for the {@link ChatPanel#addTab(Object)} method.
	* This test case checks if the method returns null when the hashtable already contains the key.
	*/
	@Test
	void testAddTab6() {
		ChatPanel chatPanel = new ChatPanel(new GUIModule(new Kernel()));
		Object id = new Object();
		chatPanel.addTab(id);
		assertNull(chatPanel.addTab(id));
	}
	
	/**
	* Test case 7 for the {@link ChatPanel#addTab(Object)} method.
	* This test case checks if the method returns null when the hashtable already contains the key.
	*/
	@Test
	void testAddTab7() {
		ChatPanel chatPanel = new ChatPanel(new GUIModule(new Kernel()));
		Object id = new Object();
		chatPanel.addTab(id);
		assertNull(chatPanel.addTab(id));
	}
	
	/**
	* Test case 8 for the {@link ChatPanel#addTab(Object)} method.
	* This test case checks if the method returns null when the hashtable already contains the key.
	*/
	@Test
	void testAddTab8() {
		ChatPanel chatPanel = new ChatPanel(new GUIModule(new Kernel()));
		Object id = new Object();
		chatPanel.addTab(id);
		assertNull(chatPanel.addTab(id));
	}
	
	/**
	* Test case 9 for the {@link ChatPanel#addTab(Object)} method.
	* This test case checks if the method returns null when the hashtable already contains the key.
	*/
	@Test
	void testAddTab9() {
		ChatPanel chatPanel = new ChatPanel(new GUIModule(new Kernel()));
		Object id = new Object();
		chatPanel.addTab(id);
		assertNull(chatPanel.addTab(id));
	}
	
	/**
	* Test case 10 for the {@link ChatPanel#addTab(Object)} method.
	* This test case checks if the method returns null when the hashtable already contains the key.
	*/
	@Test
	void testAddTab10() {
		ChatPanel chatPanel = new ChatPanel(new GUIModule(new Kernel()));
		Object id = new Object();
		chatPanel.addTab(id);
		assertNull(chatPanel.addTab(id));
	}
}