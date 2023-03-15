// ComponentBuilder_0Test.java
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
* It contains ten unit test cases for the {@link ComponentBuilder#buildMenuBar(ResourceBundle, HashMap)} method.
*/
class ComponentBuilder_0Test {

		/**
		* Test case for the {@link ComponentBuilder#buildMenuBar(ResourceBundle, HashMap)} method.
		* This test case checks if the menu bar contains the file menu.
		*/
		@Test
		void testBuildMenuBar_0() {
				ResourceBundle resources = ResourceBundle.getBundle("ghm.follow.gui.resources.FollowApp");
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Open.icon")));
				actions.put(Close.NAME, new Close(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Close.icon")));
				actions.put(Reset.NAME, new Reset(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Reset.icon")));
				actions.put(Pause.NAME, new Pause(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Pause.icon")));
				actions.put(Exit.NAME, new Exit(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Exit.icon")));
				actions.put(Find.NAME, new Find(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.Find.icon")));
				actions.put(ClearHighlights.NAME, new ClearHighlights(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.ClearHighlights.icon")));
				actions.put(ClearAllHighlights.NAME, new ClearAllHighlights(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.ClearAllHighlights.icon")));
				actions.put(Configure.NAME, new Configure(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.Configure.icon")));
				actions.put(Top.NAME, new Top(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Top.icon")));
				actions.put(Bottom.NAME, new Bottom(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Bottom.icon")));
				actions.put(Clear.NAME, new Clear(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Clear.icon")));
				actions.put(ClearAll.NAME, new ClearAll(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.ClearAll.icon")));
				actions.put(Delete.NAME, new Delete(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Delete.icon")));
				actions.put(DeleteAll.NAME, new DeleteAll(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.DeleteAll.icon")));
				actions.put(Edit.NAME, new Edit(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Edit.icon")));
				actions.put(NextTab.NAME, new NextTab(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Window.NextTab.icon")));
				actions.put(PreviousTab.NAME, new PreviousTab(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Window.PreviousTab.icon")));
				actions.put(About.NAME, new About(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Help.About.icon")));
				JMenuBar jMenuBar = ComponentBuilder.buildMenuBar(resources, actions);
				assertTrue(jMenuBar.getMenu(0).getText().equals("File"));
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildMenuBar(ResourceBundle, HashMap)} method.
		* This test case checks if the menu bar contains the edit menu.
		*/
		@Test
		void testBuildMenuBar_1() {
				ResourceBundle resources = ResourceBundle.getBundle("ghm.follow.gui.resources.FollowApp");
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Open.icon")));
				actions.put(Close.NAME, new Close(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Close.icon")));
				actions.put(Reset.NAME, new Reset(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Reset.icon")));
				actions.put(Pause.NAME, new Pause(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Pause.icon")));
				actions.put(Exit.NAME, new Exit(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Exit.icon")));
				actions.put(Find.NAME, new Find(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.Find.icon")));
				actions.put(ClearHighlights.NAME, new ClearHighlights(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.ClearHighlights.icon")));
				actions.put(ClearAllHighlights.NAME, new ClearAllHighlights(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.ClearAllHighlights.icon")));
				actions.put(Configure.NAME, new Configure(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.Configure.icon")));
				actions.put(Top.NAME, new Top(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Top.icon")));
				actions.put(Bottom.NAME, new Bottom(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Bottom.icon")));
				actions.put(Clear.NAME, new Clear(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Clear.icon")));
				actions.put(ClearAll.NAME, new ClearAll(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.ClearAll.icon")));
				actions.put(Delete.NAME, new Delete(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Delete.icon")));
				actions.put(DeleteAll.NAME, new DeleteAll(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.DeleteAll.icon")));
				actions.put(Edit.NAME, new Edit(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Edit.icon")));
				actions.put(NextTab.NAME, new NextTab(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Window.NextTab.icon")));
				actions.put(PreviousTab.NAME, new PreviousTab(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Window.PreviousTab.icon")));
				actions.put(About.NAME, new About(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Help.About.icon")));
				JMenuBar jMenuBar = ComponentBuilder.buildMenuBar(resources, actions);
				assertTrue(jMenuBar.getMenu(1).getText().equals("Edit"));
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildMenuBar(ResourceBundle, HashMap)} method.
		* This test case checks if the menu bar contains the tools menu.
		*/
		@Test
		void testBuildMenuBar_2() {
				ResourceBundle resources = ResourceBundle.getBundle("ghm.follow.gui.resources.FollowApp");
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Open.icon")));
				actions.put(Close.NAME, new Close(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Close.icon")));
				actions.put(Reset.NAME, new Reset(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Reset.icon")));
				actions.put(Pause.NAME, new Pause(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Pause.icon")));
				actions.put(Exit.NAME, new Exit(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Exit.icon")));
				actions.put(Find.NAME, new Find(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.Find.icon")));
				actions.put(ClearHighlights.NAME, new ClearHighlights(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.ClearHighlights.icon")));
				actions.put(ClearAllHighlights.NAME, new ClearAllHighlights(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.ClearAllHighlights.icon")));
				actions.put(Configure.NAME, new Configure(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.Configure.icon")));
				actions.put(Top.NAME, new Top(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Top.icon")));
				actions.put(Bottom.NAME, new Bottom(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Bottom.icon")));
				actions.put(Clear.NAME, new Clear(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Clear.icon")));
				actions.put(ClearAll.NAME, new ClearAll(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.ClearAll.icon")));
				actions.put(Delete.NAME, new Delete(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Delete.icon")));
				actions.put(DeleteAll.NAME, new DeleteAll(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.DeleteAll.icon")));
				actions.put(Edit.NAME, new Edit(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Edit.icon")));
				actions.put(NextTab.NAME, new NextTab(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Window.NextTab.icon")));
				actions.put(PreviousTab.NAME, new PreviousTab(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Window.PreviousTab.icon")));
				actions.put(About.NAME, new About(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Help.About.icon")));
				JMenuBar jMenuBar = ComponentBuilder.buildMenuBar(resources, actions);
				assertTrue(jMenuBar.getMenu(2).getText().equals("Tools"));
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildMenuBar(ResourceBundle, HashMap)} method.
		* This test case checks if the menu bar contains the window menu.
		*/
		@Test
		void testBuildMenuBar_3() {
				ResourceBundle resources = ResourceBundle.getBundle("ghm.follow.gui.resources.FollowApp");
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Open.icon")));
				actions.put(Close.NAME, new Close(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Close.icon")));
				actions.put(Reset.NAME, new Reset(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Reset.icon")));
				actions.put(Pause.NAME, new Pause(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Pause.icon")));
				actions.put(Exit.NAME, new Exit(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Exit.icon")));
				actions.put(Find.NAME, new Find(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.Find.icon")));
				actions.put(ClearHighlights.NAME, new ClearHighlights(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.ClearHighlights.icon")));
				actions.put(ClearAllHighlights.NAME, new ClearAllHighlights(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.ClearAllHighlights.icon")));
				actions.put(Configure.NAME, new Configure(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Edit.Configure.icon")));
				actions.put(Top.NAME, new Top(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Top.icon")));
				actions.put(Bottom.NAME, new Bottom(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Bottom.icon")));
				actions.put(Clear.NAME, new Clear(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Clear.icon")));
				actions.put(ClearAll.NAME, new ClearAll(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.ClearAll.icon")));
				actions.put(Delete.NAME, new Delete(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Delete.icon")));
				actions.put(DeleteAll.NAME, new DeleteAll(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.DeleteAll.icon")));
				actions.put(Edit.NAME, new Edit(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Tools.Edit.icon")));
				actions.put(NextTab.NAME, new NextTab(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Window.NextTab.icon")));
				actions.put(PreviousTab.NAME, new PreviousTab(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Window.PreviousTab.icon")));
				actions.put(About.NAME, new About(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.Help.About.icon")));
				JMenuBar jMenuBar = ComponentBuilder.buildMenuBar(resources, actions);
				assertTrue(jMenuBar.getMenu(3).getText().equals("Window"));
		}
		
		/**
		* Test case for the {@link ComponentBuilder#buildMenuBar(ResourceBundle, HashMap)} method.
		* This test case checks if the menu bar contains the help menu.
		*/
		@Test
		void testBuildMenuBar_4() {
				ResourceBundle resources = ResourceBundle.getBundle("ghm.follow.gui.resources.FollowApp");
				HashMap<String, FollowAppAction> actions = new HashMap<String, FollowAppAction>();
				actions.put(Open.NAME, new Open(resources, FollowApp.getIcon(ComponentBuilder.class, "menu.File.Open.icon")));
				actions.put(Close.