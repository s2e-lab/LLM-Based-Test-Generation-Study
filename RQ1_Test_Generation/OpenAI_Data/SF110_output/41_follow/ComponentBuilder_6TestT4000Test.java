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
		* This test case checks if the method returns a non-null value.
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
				actions.put(ClearAll.NAME, new ClearAll());
				actions.put(Delete.NAME, new Delete());
				actions.put(DeleteAll.NAME, new DeleteAll());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertNotNull(popupMenu);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* This test case checks if the method returns a non-null value.
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
				actions.put(ClearAll.NAME, new ClearAll());
				actions.put(Delete.NAME, new Delete());
				actions.put(DeleteAll.NAME, new DeleteAll());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertNotNull(popupMenu);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* This test case checks if the method returns a non-null value.
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
				actions.put(ClearAll.NAME, new ClearAll());
				actions.put(Delete.NAME, new Delete());
				actions.put(DeleteAll.NAME, new DeleteAll());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertNotNull(popupMenu);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* This test case checks if the method returns a non-null value.
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
				actions.put(ClearAll.NAME, new ClearAll());
				actions.put(Delete.NAME, new Delete());
				actions.put(DeleteAll.NAME, new DeleteAll());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertNotNull(popupMenu);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* This test case checks if the method returns a non-null value.
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
				actions.put(ClearAll.NAME, new ClearAll());
				actions.put(Delete.NAME, new Delete());
				actions.put(DeleteAll.NAME, new DeleteAll());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertNotNull(popupMenu);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* This test case checks if the method returns a non-null value.
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
				actions.put(ClearAll.NAME, new ClearAll());
				actions.put(Delete.NAME, new Delete());
				actions.put(DeleteAll.NAME, new DeleteAll());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertNotNull(popupMenu);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* This test case checks if the method returns a non-null value.
		*/
		@Test
		void testBuildPopupMenu_7() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open());
				actions.put(Close.NAME, new Close());
				actions.put(Reset.NAME, new Reset());
				actions.put(Pause.NAME, new Pause());
				actions.put(Top.NAME, new Top());
				actions.put(Bottom.NAME, new Bottom());
				actions.put(Clear.NAME, new Clear());
				actions.put(ClearAll.NAME, new ClearAll());
				actions.put(Delete.NAME, new Delete());
				actions.put(DeleteAll.NAME, new DeleteAll());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertNotNull(popupMenu);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* This test case checks if the method returns a non-null value.
		*/
		@Test
		void testBuildPopupMenu_8() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open());
				actions.put(Close.NAME, new Close());
				actions.put(Reset.NAME, new Reset());
				actions.put(Pause.NAME, new Pause());
				actions.put(Top.NAME, new Top());
				actions.put(Bottom.NAME, new Bottom());
				actions.put(Clear.NAME, new Clear());
				actions.put(ClearAll.NAME, new ClearAll());
				actions.put(Delete.NAME, new Delete());
				actions.put(DeleteAll.NAME, new DeleteAll());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertNotNull(popupMenu);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* This test case checks if the method returns a non-null value.
		*/
		@Test
		void testBuildPopupMenu_9() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open());
				actions.put(Close.NAME, new Close());
				actions.put(Reset.NAME, new Reset());
				actions.put(Pause.NAME, new Pause());
				actions.put(Top.NAME, new Top());
				actions.put(Bottom.NAME, new Bottom());
				actions.put(Clear.NAME, new Clear());
				actions.put(ClearAll.NAME, new ClearAll());
				actions.put(Delete.NAME, new Delete());
				actions.put(DeleteAll.NAME, new DeleteAll());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertNotNull(popupMenu);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildPopupMenu(HashMap)} method.
		* This test case checks if the method returns a non-null value.
		*/
		@Test
		void testBuildPopupMenu_10() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open());
				actions.put(Close.NAME, new Close());
				actions.put(Reset.NAME, new Reset());
				actions.put(Pause.NAME, new Pause());
				actions.put(Top.NAME, new Top());
				actions.put(Bottom.NAME, new Bottom());
				actions.put(Clear.NAME, new Clear());
				actions.put(ClearAll.NAME, new ClearAll());
				actions.put(Delete.NAME, new Delete());
				actions.put(DeleteAll.NAME, new DeleteAll());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				PopupMenu popupMenu = ComponentBuilder.buildPopupMenu(actions);
				assertNotNull(popupMenu);
		}
}

// ComponentBuilder_7Test.java
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
* It contains ten unit test cases for the {@link ComponentBuilder#buildToolBar(HashMap)} method.
*/
class ComponentBuilder_7Test {
		
		/**
		* Test case for the {@link ComponentBuilder#buildToolBar(HashMap)} method.
		* This test case checks if the method returns a non-null value.
		*/
		@Test
		void testBuildToolBar_1() {
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open());
				actions.put(Close.NAME, new Close());
				actions.put(Reset.NAME, new Reset());
				actions.put(Pause.NAME, new Pause());
				actions.put(Top.NAME, new Top());
				actions.put(Bottom.NAME, new Bottom());
				actions.put(Clear.NAME, new Clear());
				actions.put(ClearAll.NAME, new ClearAll());
				actions.put(Delete.NAME, new Delete());
				actions.put(DeleteAll.NAME, new DeleteAll());
				actions.put(Configure.NAME, new Configure());
				actions.put(Edit.NAME, new Edit());
				ToolBar toolBar = ComponentBuilder.buildToolBar(actions);
				assertNotNull(toolBar);
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildToolBar(HashMap)} method.
		* This test case checks if the method returns a non-null value.
		*/
		@Test
		void testBuildToolBar_2() {
		