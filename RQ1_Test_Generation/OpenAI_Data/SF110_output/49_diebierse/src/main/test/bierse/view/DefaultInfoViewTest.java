// DefaultInfoViewTest.java
package bierse.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.text.DecimalFormat;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;
import bierse.model.Drink;
import bierse.model.Model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultInfoView}.
* It contains ten unit test cases for the {@link DefaultInfoView#imageUpdate(Image, int, int, int, int, int)} method.
*/
class DefaultInfoViewTest {

		/**
		* Test case for {@link DefaultInfoView#imageUpdate(Image, int, int, int, int, int)}
		* with the following input:
		* <ul>
		* <li>img: null</li>
		* <li>infoflags: 0</li>
		* <li>x: 0</li>
		* <li>y: 0</li>
		* <li>w: 0</li>
		* <li>h: 0</li>
		* </ul>
		* and the expected output:
		* <ul>
		* <li>return value: true</li>
		* </ul>
		*/
		@Test
		public void testImageUpdate_1() {
			// create test object
			Model model = new Model();
			DefaultInfoView defaultInfoView = new DefaultInfoView(model);
			// set input values
			Image img = null;
			int infoflags = 0;
			int x = 0;
			int y = 0;
			int w = 0;
			int h = 0;
			// call method to test
			boolean returnValue = defaultInfoView.imageUpdate(img, infoflags, x, y, w, h);
			// check return value
			assertEquals(true, returnValue);
		}
		
		/**
		* Test case for {@link DefaultInfoView#imageUpdate(Image, int, int, int, int, int)}
		* with the following input:
		* <ul>
		* <li>img: null</li>
		* <li>infoflags: 0</li>
		* <li>x: 0</li>
		* <li>y: 0</li>
		* <li>w: 0</li>
		* <li>h: 0</li>
		* </ul>
		* and the expected output:
		* <ul>
		* <li>return value: true</li>
		* </ul>
		*/
		@Test
		public void testImageUpdate_2() {
			// create test object
			Model model = new Model();
			DefaultInfoView defaultInfoView = new DefaultInfoView(model);
			// set input values
			Image img = null;
			int infoflags = 0;
			int x = 0;
			int y = 0;
			int w = 0;
			int h = 0;
			// call method to test
			boolean returnValue = defaultInfoView.imageUpdate(img, infoflags, x, y, w, h);
			// check return value
			assertEquals(true, returnValue);
		}
		
		/**
		* Test case for {@link DefaultInfoView#imageUpdate(Image, int, int, int, int, int)}
		* with the following input:
		* <ul>
		* <li>img: null</li>
		* <li>infoflags: 0</li>
		* <li>x: 0</li>
		* <li>y: 0</li>
		* <li>w: 0</li>
		* <li>h: 0</li>
		* </ul>
		* and the expected output:
		* <ul>
		* <li>return value: true</li>
		* </ul>
		*/
		@Test
		public void testImageUpdate_3() {
			// create test object
			Model model = new Model();
			DefaultInfoView defaultInfoView = new DefaultInfoView(model);
			// set input values
			Image img = null;
			int infoflags = 0;
			int x = 0;
			int y = 0;
			int w = 0;
			int h = 0;
			// call method to test
			boolean returnValue = defaultInfoView.imageUpdate(img, infoflags, x, y, w, h);
			// check return value
			assertEquals(true, returnValue);
		}
		
		/**
		* Test case for {@link DefaultInfoView#imageUpdate(Image, int, int, int, int, int)}
		* with the following input:
		* <ul>
		* <li>img: null</li>
		* <li>infoflags: 0</li>
		* <li>x: 0</li>
		* <li>y: 0</li>
		* <li>w: 0</li>
		* <li>h: 0</li>
		* </ul>
		* and the expected output:
		* <ul>
		* <li>return value: true</li>
		* </ul>
		*/
		@Test
		public void testImageUpdate_4() {
			// create test object
			Model model = new Model();
			DefaultInfoView defaultInfoView = new DefaultInfoView(model);
			// set input values
			Image img = null;
			int infoflags = 0;
			int x = 0;
			int y = 0;
			int w = 0;
			int h = 0;
			// call method to test
			boolean returnValue = defaultInfoView.imageUpdate(img, infoflags, x, y, w, h);
			// check return value
			assertEquals(true, returnValue);
		}
		
		/**
		* Test case for {@link DefaultInfoView#imageUpdate(Image, int, int, int, int, int)}
		* with the following input:
		* <ul>
		* <li>img: null</li>
		* <li>infoflags: 0</li>
		* <li>x: 0</li>
		* <li>y: 0</li>
		* <li>w: 0</li>
		* <li>h: 0</li>
		* </ul>
		* and the expected output:
		* <ul>
		* <li>return value: true</li>
		* </ul>
		*/
		@Test
		public void testImageUpdate_5() {
			// create test object
			Model model = new Model();
			DefaultInfoView defaultInfoView = new DefaultInfoView(model);
			// set input values
			Image img = null;
			int infoflags = 0;
			int x = 0;
			int y = 0;
			int w = 0;
			int h = 0;
			// call method to test
			boolean returnValue = defaultInfoView.imageUpdate(img, infoflags, x, y, w, h);
			// check return value
			assertEquals(true, returnValue);
		}
		
		/**
		* Test case for {@link DefaultInfoView#imageUpdate(Image, int, int, int, int, int)}
		* with the following input:
		* <ul>
		* <li>img: null</li>
		* <li>infoflags: 0</li>
		* <li>x: 0</li>
		* <li>y: 0</li>
		* <li>w: 0</li>
		* <li>h: 0</li>
		* </ul>
		* and the expected output:
		* <ul>
		* <li>return value: true</li>
		* </ul>
		*/
		@Test
		public void testImageUpdate_6() {
			// create test object
			Model model = new Model();
			DefaultInfoView defaultInfoView = new DefaultInfoView