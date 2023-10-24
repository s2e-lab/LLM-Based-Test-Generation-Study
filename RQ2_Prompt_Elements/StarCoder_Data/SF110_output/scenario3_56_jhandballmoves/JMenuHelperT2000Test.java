// JMenuHelperTest.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
*/
class JMenuHelperTest {

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a JMenu to a JMenuBar.
     */
    @Test
    void testAddMenuBarItem() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(1, menuBar.getMenuCount());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a JMenu to a JMenuBar.
     */
    @Test
    void testAddMenuBarItem2() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(1, menuBar.getMenuCount());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a JMenu to a JMenuBar.
     */
    @Test
    void testAddMenuBarItem3() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        assertEquals(2, menuBar.getMenuCount());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a JMenu to a JMenuBar.
     */
    @Test
    void testAddMenuBarItem4() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(2, menuBar.getMenuCount());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a JMenu to a JMenuBar.
     */
    @Test
    void testAddMenuBarItem5() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        assertEquals(2, menuBar.getMenuCount());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a JMenu to a JMenuBar.
     */
    @Test
    void testAddMenuBarItem6() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(2, menuBar.getMenuCount());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a JMenu to a JMenuBar.
     */
    @Test
    void testAddMenuBarItem7() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        assertEquals(2, menuBar.getMenuCount());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a JMenu to a JMenuBar.
     */
    @Test
    void testAddMenuBarItem8() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(2, menuBar.getMenuCount());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a JMenu to a JMenuBar.
     */
    @Test
    void testAddMenuBarItem9() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        assertEquals(2, menuBar.getMenuCount());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a JMenu to a JMenuBar.
     */
    @Test
    void testAddMenuBarItem10() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(2, menuBar.getMenuCount());
    }
}
