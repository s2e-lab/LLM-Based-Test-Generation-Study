// MultiHeroTreeModelTest.java
package dsachat.gm.gui;

import java.util.Vector;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import dsachat.share.hero.FightValue;
import dsachat.share.hero.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MultiHeroTreeModel}.
* It contains ten unit test cases for the {@link MultiHeroTreeModel#isLeaf(Object)} method.
*/
class MultiHeroTreeModelTest {

	/**
	 * Test case for {@link MultiHeroTreeModel#isLeaf(Object)}
	 * <p>
	 * Test method for {@link MultiHeroTreeModel#isLeaf(Object)}.
	 */
	@Test
	void testIsLeaf() {
		MultiHeroTreeModel mhtm = new MultiHeroTreeModel("root");
		assertFalse(mhtm.isLeaf("root"));
		Hero h = new Hero();
		assertFalse(mhtm.isLeaf(h));
		assertFalse(mhtm.isLeaf("Attributes"));
		assertFalse(mhtm.isLeaf("Talents"));
		assertFalse(mhtm.isLeaf("Weapons"));
		FightValue fv = new FightValue();
		assertFalse(mhtm.isLeaf(fv));
		assertTrue(mhtm.isLeaf("test"));
	}
}

// MultiHeroTreeModelTest.java
package dsachat.gm.gui;

import java.util.Vector;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import dsachat.share.hero.FightValue;
import dsachat.share.hero.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MultiHeroTreeModel}.
* It contains ten unit test cases for the {@link MultiHeroTreeModel#isLeaf(Object)} method.
*/
class MultiHeroTreeModelTest {
		
	/**
	 * Test case for {@link MultiHeroTreeModel#isLeaf(Object)}
	 * <p>
	 * Test method for {@link MultiHeroTreeModel#isLeaf(Object)}.
	 */
	@Test
	void testIsLeaf() {
		MultiHeroTreeModel mhtm = new MultiHeroTreeModel("root");
		assertFalse(mhtm.isLeaf("root"));
		Hero h = new Hero();
		assertFalse(mhtm.isLeaf(h));
		assertFalse(mhtm.isLeaf("Attributes"));
		assertFalse(mhtm.isLeaf("Talents"));
		assertFalse(mhtm.isLeaf("Weapons"));
		FightValue fv = new FightValue();
		assertFalse(mhtm.isLeaf(fv));
		assertTrue(mhtm.isLeaf("test"));
	}
}

// MultiHeroTreeModelTest.java
package dsachat.gm.gui;

import java.util.Vector;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import dsachat.share.hero.FightValue;
import dsachat.share.hero.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MultiHeroTreeModel}.
* It contains ten unit test cases for the {@link MultiHeroTreeModel#isLeaf(Object)} method.
*/
class MultiHeroTreeModelTest {
		
	/**
	 * Test case for {@link MultiHeroTreeModel#isLeaf(Object)}
	 * <p>
	 * Test method for {@link MultiHeroTreeModel#isLeaf(Object)}.
	 */
	@Test
	void testIsLeaf() {
		MultiHeroTreeModel mhtm = new MultiHeroTreeModel("root");
		assertFalse(mhtm.isLeaf("root"));
		Hero h = new Hero();
		assertFalse(mhtm.isLeaf(h));
		assertFalse(mhtm.isLeaf("Attributes"));
		assertFalse(mhtm.isLeaf("Talents"));
		assertFalse(mhtm.isLeaf("Weapons"));
		FightValue fv = new FightValue();
		assertFalse(mhtm.isLeaf(fv));
		assertTrue(mhtm.isLeaf("test"));
	}
}

// MultiHeroTreeModelTest.java
package dsachat.gm.gui;

import java.util.Vector;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import dsachat.share.hero.FightValue;
import dsachat.share.hero.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MultiHeroTreeModel}.
* It contains ten unit test cases for the {@link MultiHeroTreeModel#isLeaf(Object)} method.
*/
class MultiHeroTreeModelTest {
		
	/**
	 * Test case for {@link MultiHeroTreeModel#isLeaf(Object)}
	 * <p>
	 * Test method for {@link MultiHeroTreeModel#isLeaf(Object)}.
	 */
	@Test
	void testIsLeaf() {
		MultiHeroTreeModel mhtm = new MultiHeroTreeModel("root");
		assertFalse(mhtm.isLeaf("root"));
		Hero h = new Hero();
		assertFalse(mhtm.isLeaf(h));
		assertFalse(mhtm.isLeaf("Attributes"));
		assertFalse(mhtm.isLeaf("Talents"));
		assertFalse(mhtm.isLeaf("Weapons"));
		FightValue fv = new FightValue();
		assertFalse(mhtm.isLeaf(fv));
		assertTrue(mhtm.isLeaf("test"));
	}
}

// MultiHeroTreeModelTest.java
package dsachat.gm.gui;

import java.util.Vector;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import dsachat.share.hero.FightValue;
import dsachat.share.hero.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MultiHeroTreeModel}.
* It contains ten unit test cases for the {@link MultiHeroTreeModel#isLeaf(Object)} method.
*/
class MultiHeroTreeModelTest {
		
	/**
	 * Test case for {@link MultiHeroTreeModel#isLeaf(Object)}
	 * <p>
	 * Test method for {@link MultiHeroTreeModel#isLeaf(Object)}.
	 */
	@Test
	void testIsLeaf() {
		MultiHeroTreeModel mhtm = new MultiHeroTreeModel("root");
		assertFalse(mhtm.isLeaf("root"));
		Hero h = new Hero();
		assertFalse(mhtm.isLeaf(h));
		assertFalse(mhtm.isLeaf("Attributes"));
		assertFalse(mhtm.isLeaf("Talents"));
		assertFalse(mhtm.isLeaf("Weapons"));
		FightValue fv = new FightValue();
		assertFalse(mhtm.isLeaf(fv));
		assertTrue(mhtm.isLeaf("test"));
	}
}

// MultiHeroTreeModelTest.java
package dsachat.gm.gui;

import java.util.Vector;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import dsachat.share.hero.FightValue;
import dsachat.share.hero.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**