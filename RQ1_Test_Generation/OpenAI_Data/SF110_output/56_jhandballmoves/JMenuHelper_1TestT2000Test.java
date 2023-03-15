// JMenuHelper_1Test.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)} method.
*/
class JMenuHelper_1Test {

		/**
		* Test case for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}
		* with the following input parameters:
		* <ul>
		* <li>menu = null</li>
		* <li>s = "Test"</li>
		* <li>keyChar = 'T'</li>
		* <li>a = null</li>
		* <li>al = null</li>
		* </ul>
		*
		* <p>Expected: NullPointerException</p>
		*/
		@Test
		public void testAddMenuItem_1() {
			JMenu menu = null;
			String s = "Test";
			char keyChar = 'T';
			Action a = null;
			ActionListener al = null;
			try {
				JMenuHelper.addMenuItem(menu, s, keyChar, a, al);
				fail("NullPointerException expected");
			} catch (NullPointerException e) {
				assertNotNull(e.getMessage());
			}
		}
		
		/**
		* Test case for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}
		* with the following input parameters:
		* <ul>
		* <li>menu = new JMenu()</li>
		* <li>s = null</li>
		* <li>keyChar = 'T'</li>
		* <li>a = null</li>
		* <li>al = null</li>
		* </ul>
		*
		* <p>Expected: NullPointerException</p>
		*/
		@Test
		public void testAddMenuItem_2() {
			JMenu menu = new JMenu();
			String s = null;
			char keyChar = 'T';
			Action a = null;
			ActionListener al = null;
			try {
				JMenuHelper.addMenuItem(menu, s, keyChar, a, al);
				fail("NullPointerException expected");
			} catch (NullPointerException e) {
				assertNotNull(e.getMessage());
			}
		}
		
		/**
		* Test case for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}
		* with the following input parameters:
		* <ul>
		* <li>menu = new JMenu()</li>
		* <li>s = "Test"</li>
		* <li>keyChar = 'T'</li>
		* <li>a = null</li>
		* <li>al = null</li>
		* </ul>
		*
		* <p>Expected: JMenuItem</p>
		*/
		@Test
		public void testAddMenuItem_3() {
			JMenu menu = new JMenu();
			String s = "Test";
			char keyChar = 'T';
			Action a = null;
			ActionListener al = null;
			JMenuItem result = JMenuHelper.addMenuItem(menu, s, keyChar, a, al);
			assertNotNull(result);
		}
		
		/**
		* Test case for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}
		* with the following input parameters:
		* <ul>
		* <li>menu = new JMenu()</li>
		* <li>s = "Test"</li>
		* <li>keyChar = 'T'</li>
		* <li>a = new AbstractAction() { public void actionPerformed(ActionEvent e) {} }</li>
		* <li>al = null</li>
		* </ul>
		*
		* <p>Expected: JMenuItem</p>
		*/
		@Test
		public void testAddMenuItem_4() {
			JMenu menu = new JMenu();
			String s = "Test";
			char keyChar = 'T';
			Action a = new AbstractAction() { public void actionPerformed(ActionEvent e) {} };
			ActionListener al = null;
			JMenuItem result = JMenuHelper.addMenuItem(menu, s, keyChar, a, al);
			assertNotNull(result);
		}
		
		/**
		* Test case for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}
		* with the following input parameters:
		* <ul>
		* <li>menu = new JMenu()</li>
		* <li>s = "Test"</li>
		* <li>keyChar = 'T'</li>
		* <li>a = null</li>
		* <li>al = new ActionListener() { public void actionPerformed(ActionEvent e) {} }</li>
		* </ul>
		*
		* <p>Expected: JMenuItem</p>
		*/
		@Test
		public void testAddMenuItem_5() {
			JMenu menu = new JMenu();
			String s = "Test";
			char keyChar = 'T';
			Action a = null;
			ActionListener al = new ActionListener() { public void actionPerformed(ActionEvent e) {} };
			JMenuItem result = JMenuHelper.addMenuItem(menu, s, keyChar, a, al);
			assertNotNull(result);
		}
		
		/**
		* Test case for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}
		* with the following input parameters:
		* <ul>
		* <li>menu = new JMenu()</li>
		* <li>s = "Test"</li>
		* <li>keyChar = 'T'</li>
		* <li>a = new AbstractAction() { public void actionPerformed(ActionEvent e) {} }</li>
		* <li>al = new ActionListener() { public void actionPerformed(ActionEvent e) {} }</li>
		* </ul>
		*
		* <p>Expected: JMenuItem</p>
		*/
		@Test
		public void testAddMenuItem_6() {
			JMenu menu = new JMenu();
			String s = "Test";
			char keyChar = 'T';
			Action a = new AbstractAction() { public void actionPerformed(ActionEvent e) {} };
			ActionListener al = new ActionListener() { public void actionPerformed(ActionEvent e) {} };
			JMenuItem result = JMenuHelper.addMenuItem(menu, s, keyChar, a, al);
			assertNotNull(result);
		}
		
		/**
		* Test case for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}
		* with the following input parameters:
		* <ul>
		* <li>menu = new JMenu()</li>
		* <li>s = "Test"</li>
		* <li>keyChar = 'T'</li>
		* <li>a = null</li>
		* <li>al = null</li>
		* </ul>
		*
		* <p>Expected: JMenuItem</p>
		*/
		@Test
		public void testAddMenuItem_7() {
			JMenu menu = new JMenu();
