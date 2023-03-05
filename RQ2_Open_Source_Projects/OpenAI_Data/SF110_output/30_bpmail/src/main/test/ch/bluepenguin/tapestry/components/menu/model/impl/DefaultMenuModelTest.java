// DefaultMenuModelTest.java
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3)
// Source File Name:   DefaultMenuModel.java
package ch.bluepenguin.tapestry.components.menu.model.impl;

import ch.bluepenguin.tapestry.components.menu.model.*;
import ch.bluepenguin.tapestry.components.menu.renderer.IMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.HyperlinkMenuItemRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultMenuModel}.
* It contains ten unit test cases for the {@link DefaultMenuModel#displayMenuStructure()} method.
*/
class DefaultMenuModelTest {

		/**
		* Test case for the {@link DefaultMenuModel#displayMenuStructure()} method.
		* It tests the menu structure of a menu model with one menu item.
		*/
		@Test
		void testDisplayMenuStructureOneMenuItem() {
				DefaultMenuModel model = new DefaultMenuModel();
				IMenuItem item = new DefaultMenuItem("item1");
				model.addMenuItem(item);
				String expected = "item1";
				String actual = model.displayMenuStructure();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link DefaultMenuModel#displayMenuStructure()} method.
		* It tests the menu structure of a menu model with two menu items.
		*/
		@Test
		void testDisplayMenuStructureTwoMenuItems() {
				DefaultMenuModel model = new DefaultMenuModel();
				IMenuItem item1 = new DefaultMenuItem("item1");
				IMenuItem item2 = new DefaultMenuItem("item2");
				model.addMenuItem(item1);
				model.addMenuItem(item2);
				String expected = "item1\n   item2";
				String actual = model.displayMenuStructure();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link DefaultMenuModel#displayMenuStructure()} method.
		* It tests the menu structure of a menu model with three menu items.
		*/
		@Test
		void testDisplayMenuStructureThreeMenuItems() {
				DefaultMenuModel model = new DefaultMenuModel();
				IMenuItem item1 = new DefaultMenuItem("item1");
				IMenuItem item2 = new DefaultMenuItem("item2");
				IMenuItem item3 = new DefaultMenuItem("item3");
				model.addMenuItem(item1);
				model.addMenuItem(item2);
				model.addMenuItem(item3);
				String expected = "item1\n   item2\n   item3";
				String actual = model.displayMenuStructure();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link DefaultMenuModel#displayMenuStructure()} method.
		* It tests the menu structure of a menu model with four menu items.
		*/
		@Test
		void testDisplayMenuStructureFourMenuItems() {
				DefaultMenuModel model = new DefaultMenuModel();
				IMenuItem item1 = new DefaultMenuItem("item1");
				IMenuItem item2 = new DefaultMenuItem("item2");
				IMenuItem item3 = new DefaultMenuItem("item3");
				IMenuItem item4 = new DefaultMenuItem("item4");
				model.addMenuItem(item1);
				model.addMenuItem(item2);
				model.addMenuItem(item3);
				model.addMenuItem(item4);
				String expected = "item1\n   item2\n   item3\n   item4";
				String actual = model.displayMenuStructure();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link DefaultMenuModel#displayMenuStructure()} method.
		* It tests the menu structure of a menu model with five menu items.
		*/
		@Test
		void testDisplayMenuStructureFiveMenuItems() {
				DefaultMenuModel model = new DefaultMenuModel();
				IMenuItem item1 = new DefaultMenuItem("item1");
				IMenuItem item2 = new DefaultMenuItem("item2");
				IMenuItem item3 = new DefaultMenuItem("item3");
				IMenuItem item4 = new DefaultMenuItem("item4");
				IMenuItem item5 = new DefaultMenuItem("item5");
				model.addMenuItem(item1);
				model.addMenuItem(item2);
				model.addMenuItem(item3);
				model.addMenuItem(item4);
				model.addMenuItem(item5);
				String expected = "item1\n   item2\n   item3\n   item4\n   item5";
				String actual = model.displayMenuStructure();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link DefaultMenuModel#displayMenuStructure()} method.
		* It tests the menu structure of a menu model with six menu items.
		*/
		@Test
		void testDisplayMenuStructureSixMenuItems() {
				DefaultMenuModel model = new DefaultMenuModel();
				IMenuItem item1 = new DefaultMenuItem("item1");
				IMenuItem item2 = new DefaultMenuItem("item2");
				IMenuItem item3 = new DefaultMenuItem("item3");
				IMenuItem item4 = new DefaultMenuItem("item4");
				IMenuItem item5 = new DefaultMenuItem("item5");
				IMenuItem item6 = new DefaultMenuItem("item6");
				model.addMenuItem(item1);
				model.addMenuItem(item2);
				model.addMenuItem(item3);
				model.addMenuItem(item4);
				model.addMenuItem(item5);
				model.addMenuItem(item6);
				String expected = "item1\n   item2\n   item3\n   item4\n   item5\n   item6";
				String actual = model.displayMenuStructure();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link DefaultMenuModel#displayMenuStructure()} method.
		* It tests the menu structure of a menu model with seven menu items.
		*/
		@Test
		void testDisplayMenuStructureSevenMenuItems() {
				DefaultMenuModel model = new DefaultMenuModel();
				IMenuItem item1 = new DefaultMenuItem("item1");
				IMenuItem item2 = new DefaultMenuItem("item2");
				IMenuItem item3 = new DefaultMenuItem("item3");
				IMenuItem item4 = new DefaultMenuItem("item4");
				IMenuItem item5 = new DefaultMenuItem("item5");
				IMenuItem item6 = new DefaultMenuItem("item6");
				IMenuItem item7 = new DefaultMenuItem("item7");
				model.addMenuItem(item1);
				model.addMenuItem(item2);
				model.addMenuItem(item3);
				model.addMenuItem(item4);
				model.addMenuItem(item5);
				model.addMenuItem(item6);
				model.addMenuItem(item7);
				String expected = "item1\n   item2\n   item3\n   item4\n   item5\n   item6\n   item7";
				String actual = model.displayMenuStructure();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for the {@link DefaultMenuModel#displayMenuStructure()} method.
		* It tests the menu structure of a menu model with eight menu items.
		*/
		@Test
		void testDisplayMenuStructureEightMenuItems() {
				DefaultMenuModel model = new DefaultMenuModel();