// TreeModelHelperTest.java
package ch.bluepenguin.email.client.tapestry.helpers;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tapestry.IComponent;
import org.apache.tapestry.IRequestCycle;
import org.apache.tapestry.contrib.tree.model.ITreeDataModel;
import ch.bluepenguin.email.client.Folder;
import ch.bluepenguin.tapestry.components.menu.model.IMenuItem;
import ch.bluepenguin.tapestry.components.menu.model.IMenuModel;
import ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuItem;
import ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeModelHelper}.
* It contains ten unit test cases for the {@link TreeModelHelper#buildFolderModel(Folder[], IComponent, IRequestCycle)} method.
*/
class TreeModelHelperTest {

	/**
	 * Test case for {@link TreeModelHelper#buildFolderModel(Folder[], IComponent, IRequestCycle)}
	 * with a null value for the folders parameter.
	 */
	@Test
	void testBuildFolderModel_NullFolders() {
		Folder[] folders = null;
		IComponent component = null;
		IRequestCycle cycle = null;
		TreeModelHelper treeModelHelper = new TreeModelHelper();
		IMenuModel result = treeModelHelper.buildFolderModel(folders, component, cycle);
		assertNotNull(result);
		assertEquals(0, result.getMenuItems().size());
	}
	
	/**
	 * Test case for {@link TreeModelHelper#buildFolderModel(Folder[], IComponent, IRequestCycle)}
	 * with an empty array for the folders parameter.
	 */
	@Test
	void testBuildFolderModel_EmptyFolders() {
		Folder[] folders = new Folder[0];
		IComponent component = null;
		IRequestCycle cycle = null;
		TreeModelHelper treeModelHelper = new TreeModelHelper();
		IMenuModel result = treeModelHelper.buildFolderModel(folders, component, cycle);
		assertNotNull(result);
		assertEquals(0, result.getMenuItems().size());
	}
	
	/**
	 * Test case for {@link TreeModelHelper#buildFolderModel(Folder[], IComponent, IRequestCycle)}
	 * with a single folder in the folders parameter.
	 */
	@Test
	void testBuildFolderModel_SingleFolder() {
		Folder[] folders = new Folder[1];
		folders[0] = new Folder("folder1");
		IComponent component = null;
		IRequestCycle cycle = null;
		TreeModelHelper treeModelHelper = new TreeModelHelper();
		IMenuModel result = treeModelHelper.buildFolderModel(folders, component, cycle);
		assertNotNull(result);
		assertEquals(1, result.getMenuItems().size());
		IMenuItem item = (IMenuItem)result.getMenuItems().get(0);
		assertEquals("folder1", item.getName());
	}
	
	/**
	 * Test case for {@link TreeModelHelper#buildFolderModel(Folder[], IComponent, IRequestCycle)}
	 * with two folders in the folders parameter.
	 */
	@Test
	void testBuildFolderModel_TwoFolders() {
		Folder[] folders = new Folder[2];
		folders[0] = new Folder("folder1");
		folders[1] = new Folder("folder2");
		IComponent component = null;
		IRequestCycle cycle = null;
		TreeModelHelper treeModelHelper = new TreeModelHelper();
		IMenuModel result = treeModelHelper.buildFolderModel(folders, component, cycle);
		assertNotNull(result);
		assertEquals(2, result.getMenuItems().size());
		IMenuItem item = (IMenuItem)result.getMenuItems().get(0);
		assertEquals("folder1", item.getName());
		item = (IMenuItem)result.getMenuItems().get(1);
		assertEquals("folder2", item.getName());
	}
	
	/**
	 * Test case for {@link TreeModelHelper#buildFolderModel(Folder[], IComponent, IRequestCycle)}
	 * with three folders in the folders parameter.
	 */
	@Test
	void testBuildFolderModel_ThreeFolders() {
		Folder[] folders = new Folder[3];
		folders[0] = new Folder("folder1");
		folders[1] = new Folder("folder2");
		folders[2] = new Folder("folder3");
		IComponent component = null;
		IRequestCycle cycle = null;
		TreeModelHelper treeModelHelper = new TreeModelHelper();
		IMenuModel result = treeModelHelper.buildFolderModel(folders, component, cycle);
		assertNotNull(result);
		assertEquals(3, result.getMenuItems().size());
		IMenuItem item = (IMenuItem)result.getMenuItems().get(0);
		assertEquals("folder1", item.getName());
		item = (IMenuItem)result.getMenuItems().get(1);
		assertEquals("folder2", item.getName());
		item = (IMenuItem)result.getMenuItems().get(2);
		assertEquals("folder3", item.getName());
	}
	
	/**
	 * Test case for {@link TreeModelHelper#buildFolderModel(Folder[], IComponent, IRequestCycle)}
	 * with four folders in the folders parameter.
	 */
	@Test
	void testBuildFolderModel_FourFolders() {
		Folder[] folders = new Folder[4];
		folders[0] = new Folder("folder1");
		folders[1] = new Folder("folder2");
		folders[2] = new Folder("folder3");
		folders[3] = new Folder("folder4");
		IComponent component = null;
		IRequestCycle cycle = null;
		TreeModelHelper treeModelHelper = new TreeModelHelper();
		IMenuModel result = treeModelHelper.buildFolderModel(folders, component, cycle);
		assertNotNull(result);
		assertEquals(4, result.getMenuItems().size());
		IMenuItem item = (IMenuItem)result.getMenuItems().get(0);
		assertEquals("folder1", item.getName());
		item = (IMenuItem)result.getMenuItems().get(1);
		assertEquals("folder2", item.getName());
		item = (IMenuItem)result.getMenuItems().get(2);
		assertEquals("folder3", item.getName());
		item = (IMenuItem)result.getMenuItems().get(3);
		assertEquals("folder4", item.getName());
	}
	
	/**
	 * Test case for {@link TreeModelHelper#buildFolderModel(Folder[], IComponent, IRequestCycle)}
	 * with five folders in the folders parameter.
	 */
	@Test
	void testBuildFolderModel_FiveFolders() {
		Folder[] folders = new Folder[5];
		folders[0] = new Folder("folder1");
		folders[1] = new Folder("folder2");
		folders[2] = new Folder("folder3");
		folders[3] = new Folder("folder4");
		folders[4] = new Folder("folder5");
		IComponent component = null;
		IRequestCycle cycle = null;
		TreeModelHelper treeModelHelper = new TreeModelHelper();
		IMenuModel result = treeModelHelper.buildFolderModel(folders, component, cycle);
		assertNotNull(result);
		assertEquals(5, result.getMenuItems().size());
		IMenuItem item = (IMenuItem)result.getMenuItems().get(0);
		assertEquals("folder1", item.getName());
		item = (IMenuItem)result.getMenuItems().get(1);
		assertEquals("folder2", item.getName());
		item = (IMenuItem)result.getMenuItems().get(2);
		assertEquals("folder3", item.getName());
		item = (IMenuItem)result.getMenuItems().get(3);
		assertEquals("folder4", item.getName());
		item = (IMenuItem)result.getMenuItems().get(4);
		assertEquals("folder5", item.getName());
	}
	
	/**
	 * Test case for {@link TreeModelHelper#buildFolderModel(Folder[], IComponent, IRequestCycle)}
	 * with six folders in the folders parameter.
	 */
	@Test
	void testBuildFolderModel_SixFolders() {
		Folder[] folders = new Folder[6];
		folders[0] = new Folder("folder1");
		folders[1] = new Folder("folder