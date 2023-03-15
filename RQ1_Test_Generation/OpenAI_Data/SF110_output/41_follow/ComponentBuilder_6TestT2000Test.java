// ComponentBuilder_6Test.java
package ghm.follow.gui;

import ghm.follow.FollowApp;
import ghm.follow.config.Configure;
import ghm.follow.nav.Bottom;
import ghm.follow.nav.NextTab;
import ghm.follow.nav.PreviousTab;
import ghm.follow.nav.Top;
import ghm.follow.search.ClearAllHighlights;
import ghm.follow.search.ClearHighlights;
import ghm.follow.search.Find;
import java.util.HashMap;
import java.util.ResourceBundle;
import javax.swing.JMenuBar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ComponentBuilder}.
* It contains ten unit test cases for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
*/
class ComponentBuilder_6Test {

		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* It tests if the method returns a {@link PopupMenu} object.
		*/
		@Test
		void testBuildPopupMenu_1() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open());
				actions.put(Close.NAME, new Close());
				actions.put(Reset.NAME, new Reset());
				actions.put(Pause.NAME, new Pause());
				actions.put(Top.NAME, new Top());
				actions.put(Bottom.NAME, new Bottom());
				actions.put(Clear.NAME, new Clear());
				actions.put(Delete.NAME, new Delete());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertTrue(popupMenu instanceof PopupMenu);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* It tests if the method returns a {@link PopupMenu} object with the correct number of menu items.
		*/
		@Test
		void testBuildPopupMenu_2() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open());
				actions.put(Close.NAME, new Close());
				actions.put(Reset.NAME, new Reset());
				actions.put(Pause.NAME, new Pause());
				actions.put(Top.NAME, new Top());
				actions.put(Bottom.NAME, new Bottom());
				actions.put(Clear.NAME, new Clear());
				actions.put(Delete.NAME, new Delete());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertEquals(popupMenu.getComponentCount(), 10);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* It tests if the method returns a {@link PopupMenu} object with the correct number of menu items.
		*/
		@Test
		void testBuildPopupMenu_3() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open());
				actions.put(Close.NAME, new Close());
				actions.put(Reset.NAME, new Reset());
				actions.put(Pause.NAME, new Pause());
				actions.put(Top.NAME, new Top());
				actions.put(Bottom.NAME, new Bottom());
				actions.put(Clear.NAME, new Clear());
				actions.put(Delete.NAME, new Delete());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertEquals(popupMenu.getComponentCount(), 10);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* It tests if the method returns a {@link PopupMenu} object with the correct number of menu items.
		*/
		@Test
		void testBuildPopupMenu_4() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open());
				actions.put(Close.NAME, new Close());
				actions.put(Reset.NAME, new Reset());
				actions.put(Pause.NAME, new Pause());
				actions.put(Top.NAME, new Top());
				actions.put(Bottom.NAME, new Bottom());
				actions.put(Clear.NAME, new Clear());
				actions.put(Delete.NAME, new Delete());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertEquals(popupMenu.getComponentCount(), 10);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* It tests if the method returns a {@link PopupMenu} object with the correct number of menu items.
		*/
		@Test
		void testBuildPopupMenu_5() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open());
				actions.put(Close.NAME, new Close());
				actions.put(Reset.NAME, new Reset());
				actions.put(Pause.NAME, new Pause());
				actions.put(Top.NAME, new Top());
				actions.put(Bottom.NAME, new Bottom());
				actions.put(Clear.NAME, new Clear());
				actions.put(Delete.NAME, new Delete());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertEquals(popupMenu.getComponentCount(), 10);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* It tests if the method returns a {@link PopupMenu} object with the correct number of menu items.
		*/
		@Test
		void testBuildPopupMenu_6() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open());
				actions.put(Close.NAME, new Close());
				actions.put(Reset.NAME, new Reset());
				actions.put(Pause.NAME, new Pause());
				actions.put(Top.NAME, new Top());
				actions.put(Bottom.NAME, new Bottom());
				actions.put(Clear.NAME, new Clear());
				actions.put(Delete.NAME, new Delete());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertEquals(popupMenu.getComponentCount(), 10);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* It tests if the method returns a {@link PopupMenu} object with the correct number of menu items.
		*/
		@Test
		void testBuildPopupMenu_7() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open