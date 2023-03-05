// InternalGmHeroFrameTest0.java
package dsachat.gm.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InternalGmHeroFrame}.
* It contains ten unit test cases for the {@link InternalGmHeroFrame#silent()} method.
*/
class InternalGmHeroFrameTest0 {

		/**
		* Test case for {@link InternalGmHeroFrame#silent()}.
		*/
		@Test
		void testSilent() {
				InternalGmHeroFrame internalGmHeroFrame = new InternalGmHeroFrame(new GmFrame(), new Vector<Hero>(), "Heros");
				assertFalse(internalGmHeroFrame.silent());
		}
}

// InternalGmHeroFrameTest1.java
package dsachat.gm.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InternalGmHeroFrame}.
* It contains ten unit test cases for the {@link InternalGmHeroFrame#getFrameName()} method.
*/
class InternalGmHeroFrameTest1 {
		
		/**
		* Test case for {@link InternalGmHeroFrame#getFrameName()}.
		*/
		@Test
		void testGetFrameName() {
				InternalGmHeroFrame internalGmHeroFrame = new InternalGmHeroFrame(new GmFrame(), new Vector<Hero>(), "Heros");
				assertEquals("Heros", internalGmHeroFrame.getFrameName());
		}
}

// InternalGmHeroFrameTest2.java
package dsachat.gm.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InternalGmHeroFrame}.
* It contains ten unit test cases for the {@link InternalGmHeroFrame#getData()} method.
*/
class InternalGmHeroFrameTest2 {
		
		/**
		* Test case for {@link InternalGmHeroFrame#getData()}.
		*/
		@Test
		void testGetData() {
				InternalGmHeroFrame internalGmHeroFrame = new InternalGmHeroFrame(new GmFrame(), new Vector<Hero>(), "Heros");
				assertEquals(new Vector<Hero>(), internalGmHeroFrame.getData());
		}
}

// InternalGmHeroFrameTest3.java
package dsachat.gm.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InternalGmHeroFrame}.
* It contains ten unit test cases for the {@link InternalGmHeroFrame#isAttack()} method.
*/
class InternalGmHeroFrameTest3 {
		
		/**
		* Test case for {@link InternalGmHeroFrame#isAttack()}.
		*/
		@Test
		void testIsAttack() {
				InternalGmHeroFrame internalGmHeroFrame = new InternalGmHeroFrame(new GmFrame(), new Vector<Hero>(), "Heros");
				assertFalse(internalGmHeroFrame.isAttack());
		}
}

// InternalGmHeroFrameTest4.java
package dsachat.gm.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InternalGmHeroFrame}.
* It contains ten unit test cases for the {@link InternalGmHeroFrame#getReceiver()} method.
*/
class InternalGmHeroFrameTest4 {
		
		/**
		* Test case for {@link InternalGmHeroFrame#getReceiver()}.
		*/
		@Test
		void testGetReceiver() {