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
     *
     * @param s a String
     *
     * @return a JMenu
     */
    @Test
    void testAddMenuBarItem() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(menuBar.getMenuCount(), 1);
        assertEquals(menu.getText(), "File");
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     *
     * @param s a String
     *
     * @return a JMenu
     */
    @Test
    void testAddMenuBarItem2() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(menuBar.getMenuCount(), 1);
        assertEquals(menu.getText(), "File");
        assertEquals(menu2, menu);
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     *
     * @param s a String
     *
     * @return a JMenu
     */
    @Test
    void testAddMenuBarItem3() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(menuBar.getMenuCount(), 1);
        assertEquals(menu.getText(), "File");
        assertEquals(menu2, menu);
        assertEquals(menu3, menu);
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     *
     * @param s a String
     *
     * @return a JMenu
     */
    @Test
    void testAddMenuBarItem4() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu4 = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(menuBar.getMenuCount(), 1);
        assertEquals(menu.getText(), "File");
        assertEquals(menu2, menu);
        assertEquals(menu3, menu);
        assertEquals(menu4, menu);
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     *
     * @param s a String
     *
     * @return a JMenu
     */
    @Test
    void testAddMenuBarItem5() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu4 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu5 = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(menuBar.getMenuCount(), 1);
        assertEquals(menu.getText(), "File");
        assertEquals(menu2, menu);
        assertEquals(menu3, menu);
        assertEquals(menu4, menu);
        assertEquals(menu5, menu);
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     *
     * @param s a String
     *
     * @return a JMenu
     */
    @Test
    void testAddMenuBarItem6() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu4 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu5 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu6 = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(menuBar.getMenuCount(), 1);
        assertEquals(menu.getText(), "File");
        assertEquals(menu2, menu);
        assertEquals(menu3, menu);
        assertEquals(menu4, menu);
        assertEquals(menu5, menu);
        assertEquals(menu6, menu);
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     *
     * @param s a String
     *
     * @return a JMenu
     */
    @Test
    void testAddMenuBarItem7() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu4 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu5 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu6 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu7 = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(menuBar.getMenuCount(), 1);
        assertEquals(menu.getText(), "File");
        assertEquals(menu2, menu);
        assertEquals(menu3, menu);
        assertEquals(menu4, menu);
        assertEquals(menu5, menu);
        assertEquals(menu6, menu);
        assertEquals(menu7, menu);
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     *
     * @param s a String
     *
     * @return a JMenu
     */
    @Test
    void testAddMenuBarItem8() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu4 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu5 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu6 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu7 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu8 = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(menuBar.getMenuCount(), 1);
        assertEquals(menu.getText(), "File");
        assertEquals(menu2, menu);
        assertEquals(menu3, menu);
        assertEquals(menu4, menu);
        assertEquals(menu5, menu);
        assertEquals(menu6, menu);
        assertEquals(menu7, menu);
        assertEquals(menu8, menu);
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     *
     * @param s a String
     *
     * @return a JMenu
     */
    @Test
    void testAddMenuBarItem9() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu2 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu3 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu4 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu5 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu6 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu7 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu8 = JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu9 = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(menuBar.getMenuCount(), 1);
        assertEquals(menu.getText(), "File");
        assertEquals(menu2, menu);
        assertEquals(menu3, menu);
        assertEquals(menu4, menu);
        assertEquals(menu5, menu);
        assertEquals(menu6, menu);
        assertEquals(menu7, menu);
        assertEquals(menu8, menu);
        assertEquals(menu9, menu);
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String