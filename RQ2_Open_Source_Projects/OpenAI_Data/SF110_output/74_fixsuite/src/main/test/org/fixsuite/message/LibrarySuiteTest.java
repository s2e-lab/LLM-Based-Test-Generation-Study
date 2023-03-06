// LibrarySuiteTest.java
package org.fixsuite.message;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import org.apache.log4j.PropertyConfigurator;
import org.fixsuite.message.view.AboutDialog;
import org.fixsuite.message.view.DetailsPanel;
import org.fixsuite.message.view.ListView;
import org.fixsuite.message.view.LoadingSplashScreen;
import org.fixsuite.message.view.TreeView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LibrarySuite}.
* It contains ten unit test cases for the {@link LibrarySuite#getInstance()} method.
*/
class LibrarySuiteTest {

		private static Logger logger = LoggerFactory.getLogger(LibrarySuiteTest.class);
		
		private static final long serialVersionUID = 1L;
		
		private static LibrarySuite instance;
		
		// GUI
		private JMenuBar menuBar;
		
		private JMenu fileMenu;
		
		private JMenu helpMenu;
		
		private JMenuItem exitMenuItem;
		
		private JMenuItem aboutMenuItem;
		
		private JSplitPane mainSplitPane;
		
		private JTabbedPane viewsTabbedPane;
		
		private LoadingSplashScreen splashScreen;
		
		private TreeView treeView;
		
		private ListView listView;
		
		private DetailsPanel detailsPanel;
		
		private AboutDialog aboutDialog;
		
		// Attributes
		private Library library;
		
		/**
		 * Creates a new LibrarySuite
		 */
		public LibrarySuite() {
				super();
				library = new Library();
				// Show the splash screen
				splashScreen = new LoadingSplashScreen();
				splashScreen.splash();
				// Load the dictionary
				new Thread(new LibraryLoader()).start();
		}
		
		private void initGUI() {
				try {
						// Set the layout
						setLayout(new BorderLayout());
						// Setup the menu bar
						menuBar = new JMenuBar();
						// File Menu
						fileMenu = new JMenu("File");
						fileMenu.setMnemonic('F');
						menuBar.add(fileMenu);
						// Exit
						exitMenuItem = new JMenuItem("Exit");
						exitMenuItem.setMnemonic('x');
						exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
						exitMenuItem.addActionListener(this);
						fileMenu.add(exitMenuItem);
						// Help Menu
						helpMenu = new JMenu("Help");
						helpMenu.setMnemonic('H');
						menuBar.add(helpMenu);
						// About
						aboutMenuItem = new JMenuItem("About");
						aboutMenuItem.setMnemonic('A');
						aboutMenuItem.addActionListener(this);
						helpMenu.add(aboutMenuItem);
						// About dialog
						aboutDialog = new AboutDialog();
						// Main split pane
						mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
						mainSplitPane.setOneTouchExpandable(true);
						mainSplitPane.setPreferredSize(new Dimension(1024, 768));
						mainSplitPane.setContinuousLayout(true);
						mainSplitPane.setResizeWeight(0);
						mainSplitPane.setDividerSize(10);
						// Left component
						viewsTabbedPane = new JTabbedPane();
						listView = new ListView(library);
						viewsTabbedPane.add(listView, "List View");
						treeView = new TreeView(library);
						viewsTabbedPane.add(treeView, "Tree View");
						mainSplitPane.setLeftComponent(viewsTabbedPane);
						// Right component
						detailsPanel = new DetailsPanel();
						mainSplitPane.setRightComponent(detailsPanel);
						getContentPane().add(mainSplitPane, BorderLayout.CENTER);
						// Setup the minimum sizes
						mainSplitPane.getRightComponent().setMinimumSize(new Dimension(512, 768));
						mainSplitPane.getLeftComponent().setMinimumSize(new Dimension(512, 768));
						// Setup the frame
						setJMenuBar(menuBar);
						setTitle(TITLE + " (" + VERSION + ")");
						setIconImage(new ImageIcon(".\\resources\\logo.gif").getImage());
						setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
						addWindowListener(new WindowAdapter() {
								
								public void windowClosing(WindowEvent event) {
										exitFrame();
								}
						});
						// Show the frame
						pack();
						setLocationRelativeTo(null);
						setVisible(true);
				} catch (Exception ex) {
						logger.error("An error occured while initializing the UI: " + ex.getMessage(), ex);
						System.exit(1);
				}
		}
		
		public static void main(String[] args) {
				PropertyConfigurator.configure(".\\resources\\log4j.properties");
				try {
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception ex) {
						logger.warn("Unable to switch to native look and feel.");
				}
				SwingUtilities.invokeLater(new Runnable() {
						
						public void run() {
								logger.info("Starting FixSuite - Library...");
								instance = new LibrarySuite();
						}
				});
		}
		
		public static LibrarySuite getInstance() {
				return instance;
		}
		
		public void actionPerformed(ActionEvent event) {
				if (event.getSource().equals(exitMenuItem)) {
						exitFrame();
				} else if (event.getSource().equals(aboutMenuItem)) {
						aboutDialog.setLocationRelativeTo(null);
						aboutDialog.setVisible(true);
				}
		}
		
		public DetailsPanel getDetailsPanel() {
				return detailsPanel;
		}
		
		private void exitFrame() {
				int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
						logger.info("FIX Suite - Library shutting down...");
						System.exit(0);
				}
		}
		
		private class LibraryLoader implements Runnable {
				
				public void run() {
						library.loadFromDirectory(".\\resources\\libraryFpl");
						// Dispose splash screen
						splashScreen.unSplash();
						// Initialize the GUI