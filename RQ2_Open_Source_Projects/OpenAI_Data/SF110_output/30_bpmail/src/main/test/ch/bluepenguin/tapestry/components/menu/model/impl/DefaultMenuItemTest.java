// DefaultMenuItemTest.java
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3)
// Source File Name:   DefaultMenuItem.java
package ch.bluepenguin.tapestry.components.menu.model.impl;

import ch.bluepenguin.tapestry.components.menu.model.IMenuItem;
import ch.bluepenguin.tapestry.components.menu.renderer.IMenuItemRenderer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultMenuItem}.
* It contains ten unit test cases for the {@link DefaultMenuItem#isLeaf()} method.
*/
class DefaultMenuItemTest {

		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is true.
		*/
		@Test
		public void testIsLeafTrue() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(true);
				assertTrue(item.isLeaf());
		}
		
		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is false.
		*/
		@Test
		public void testIsLeafFalse() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(false);
				assertFalse(item.isLeaf());
		}
		
		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is null.
		*/
		@Test
		public void testIsLeafNull() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(null);
				assertFalse(item.isLeaf());
		}
		
		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is null.
		*/
		@Test
		public void testIsLeafNull2() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(null);
				assertFalse(item.isLeaf());
		}
		
		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is null.
		*/
		@Test
		public void testIsLeafNull3() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(null);
				assertFalse(item.isLeaf());
		}
		
		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is null.
		*/
		@Test
		public void testIsLeafNull4() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(null);
				assertFalse(item.isLeaf());
		}
		
		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is null.
		*/
		@Test
		public void testIsLeafNull5() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(null);
				assertFalse(item.isLeaf());
		}
		
		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is null.
		*/
		@Test
		public void testIsLeafNull6() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(null);
				assertFalse(item.isLeaf());
		}
		
		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is null.
		*/
		@Test
		public void testIsLeafNull7() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(null);
				assertFalse(item.isLeaf());
		}
		
		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is null.
		*/
		@Test
		public void testIsLeafNull8() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(null);
				assertFalse(item.isLeaf());
		}
		
		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is null.
		*/
		@Test
		public void testIsLeafNull9() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(null);
				assertFalse(item.isLeaf());
		}
		
		/**
		* Test case for {@link DefaultMenuItem#isLeaf()} method.
		* It tests the case that the leaf is null.
		*/
		@Test
		public void testIsLeafNull10() {
				DefaultMenuItem item = new DefaultMenuItem(null);
				item.setLeaf(null);
				assertFalse(item.isLeaf());
		}
}

// DefaultMenuItem.java
// Decompiled by DJ v3.8.8.85 Copyright 2005 Atanas Neshkov  Date: 16.05.2005 11:59:04
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3)
// Source File Name:   DefaultMenuItem.java
package ch.bluepenguin.tapestry.components.menu.model.impl;

import ch.bluepenguin.tapestry.components.menu.model.IMenuItem;
import ch.bluepenguin.tapestry.components.menu.renderer.IMenuItemRenderer;

public class DefaultMenuItem implements IMenuItem {

    public DefaultMenuItem(Object containedObject) {
        leaf = true;
        setContained(containedObject);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public void setRenderer(IMenuItemRenderer renderer) {
        this.renderer = renderer;
    }

    public IMenuItemRenderer getRenderer() {
        return renderer;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setContained(Object myObject) {
        this.myObject = myObject;
    }

    public Object getContained() {
        return myObject;
    }

    public void setParent(Object myParent) {
        this.myParent = myParent;
    }

    public Object getParent() {
        return myParent;
    }

    private int index;

    private int depth;

    private Object myObject;

    private Object myParent;

    private IMenuItem parent;

    private String name;

    private IMenuItemRenderer renderer;

    private boolean leaf;
}

// DefaultMenuItemTest.java
// Home Page : http://members.fortunecity.com/neshkov/dj.html  - Check often for new version!
// Decompiler options: packimports(3)
// Source File Name:   DefaultMenuItem.java
package ch.bluepenguin.tapestry.components.menu.model.impl;

import ch.bluepenguin.tapestry.components.menu.model.IMenuItem