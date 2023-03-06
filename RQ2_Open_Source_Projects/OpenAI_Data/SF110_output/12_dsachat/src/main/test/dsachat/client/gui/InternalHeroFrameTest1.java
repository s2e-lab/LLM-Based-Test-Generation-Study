// InternalHeroFrameTest1.java
package dsachat.client.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeSelectionModel;
import dsachat.share.hero.FightValue;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InternalHeroFrame}.
* It contains ten unit test cases for the {@link InternalHeroFrame#isAttack()} method.
*/
class InternalHeroFrameTest1 {

		/**
		* Test case for {@link InternalHeroFrame#isAttack()} method.
		* Test if the method returns true if the attack radio button is selected.
		*/
		@Test
		void testIsAttack1() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				ihf.radAttack.setSelected(true);
				assertTrue(ihf.isAttack());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#isAttack()} method.
		* Test if the method returns false if the defense radio button is selected.
		*/
		@Test
		void testIsAttack2() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				ihf.radDefense.setSelected(true);
				assertFalse(ihf.isAttack());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#isAttack()} method.
		* Test if the method returns false if the attack radio button is not selected.
		*/
		@Test
		void testIsAttack3() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				assertFalse(ihf.isAttack());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#isAttack()} method.
		* Test if the method returns false if the defense radio button is not selected.
		*/
		@Test
		void testIsAttack4() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				assertFalse(ihf.isAttack());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#isAttack()} method.
		* Test if the method returns false if the attack radio button is not selected and the defense radio button is selected.
		*/
		@Test
		void testIsAttack5() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				ihf.radDefense.setSelected(true);
				assertFalse(ihf.isAttack());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#isAttack()} method.
		* Test if the method returns false if the attack radio button is selected and the defense radio button is not selected.
		*/
		@Test
		void testIsAttack6() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				ihf.radAttack.setSelected(true);
				assertTrue(ihf.isAttack());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#isAttack()} method.
		* Test if the method returns false if the attack radio button is not selected and the defense radio button is not selected.
		*/
		@Test
		void testIsAttack7() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				assertFalse(ihf.isAttack());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#isAttack()} method.
		* Test if the method returns false if the attack radio button is selected and the defense radio button is selected.
		*/
		@Test
		void testIsAttack8() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				ihf.radAttack.setSelected(true);
				ihf.radDefense.setSelected(true);
				assertTrue(ihf.isAttack());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#isAttack()} method.
		* Test if the method returns false if the attack radio button is not selected and the defense radio button is selected.
		*/
		@Test
		void testIsAttack9() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				ihf.radDefense.setSelected(true);
				assertFalse(ihf.isAttack());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#isAttack()} method.
		* Test if the method returns false if the attack radio button is selected and the defense radio button is not selected.
		*/
		@Test
		void testIsAttack10() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				ihf.radAttack.setSelected(true);
				assertTrue(ihf.isAttack());
		}
}

// InternalHeroFrameTest2.java
package dsachat.client.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeSelectionModel;
import dsachat.share.hero.FightValue;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InternalHeroFrame}.
* It contains ten unit test cases for the {@link InternalHeroFrame#getMod()} method.
*/
class InternalHeroFrameTest2 {
		
		/**
		* Test case for {@link InternalHeroFrame#getMod()} method.
		* Test if the method returns 0 if the spinner is set to 0.
		*/
		@Test
		void testGetMod1() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				ihf.spnMod.setValue(0);
				assertEquals(0, ihf.getMod());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#getMod()} method.
		* Test if the method returns 1 if the spinner is set to 1.
		*/
		@Test
		void testGetMod2() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				ihf.spnMod.setValue(1);
				assertEquals(1, ihf.getMod());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#getMod()} method.
		* Test if the method returns -1 if the spinner is set to -1.
		*/
		@Test
		void testGetMod3() {
				InternalHeroFrame ihf = new InternalHeroFrame(null, null);
				ihf.spnMod.setValue(-1);
				assertEquals(-1, ihf.getMod());
		}
		
		/**
		* Test case for {@link InternalHeroFrame#get