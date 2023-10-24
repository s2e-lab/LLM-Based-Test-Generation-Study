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
     * It adds a menu to a JMenuBar.
     */
    @Test
    void testAddMenuBarItem() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenu menu = menuBar.getMenu(0);
        assertEquals("File", menu.getText());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a menu to a JMenuBar with a mnemonic.
     */
    @Test
    void testAddMenuBarItemWithMnemonic() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File_");
        JMenu menu = menuBar.getMenu(0);
        assertEquals("File", menu.getText());
        assertEquals('F', menu.getMnemonic());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a menu to a JMenuBar with a mnemonic.
     */
    @Test
    void testAddMenuBarItemWithMnemonic2() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File_a");
        JMenu menu = menuBar.getMenu(0);
        assertEquals("File", menu.getText());
        assertEquals('a', menu.getMnemonic());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a menu to a JMenuBar with a mnemonic.
     */
    @Test
    void testAddMenuBarItemWithMnemonic3() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File_A");
        JMenu menu = menuBar.getMenu(0);
        assertEquals("File", menu.getText());
        assertEquals('A', menu.getMnemonic());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a menu to a JMenuBar with a mnemonic.
     */
    @Test
    void testAddMenuBarItemWithMnemonic4() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File_1");
        JMenu menu = menuBar.getMenu(0);
        assertEquals("File", menu.getText());
        assertEquals('1', menu.getMnemonic());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a menu to a JMenuBar with a mnemonic.
     */
    @Test
    void testAddMenuBarItemWithMnemonic5() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File_12");
        JMenu menu = menuBar.getMenu(0);
        assertEquals("File", menu.getText());
        assertEquals('1', menu.getMnemonic());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a menu to a JMenuBar with a mnemonic.
     */
    @Test
    void testAddMenuBarItemWithMnemonic6() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File_123");
        JMenu menu = menuBar.getMenu(0);
        assertEquals("File", menu.getText());
        assertEquals('1', menu.getMnemonic());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a menu to a JMenuBar with a mnemonic.
     */
    @Test
    void testAddMenuBarItemWithMnemonic7() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File_1234");
        JMenu menu = menuBar.getMenu(0);
        assertEquals("File", menu.getText());
        assertEquals('1', menu.getMnemonic());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a menu to a JMenuBar with a mnemonic.
     */
    @Test
    void testAddMenuBarItemWithMnemonic8() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File_12345");
        JMenu menu = menuBar.getMenu(0);
        assertEquals("File", menu.getText());
        assertEquals('1', menu.getMnemonic());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a menu to a JMenuBar with a mnemonic.
     */
    @Test
    void testAddMenuBarItemWithMnemonic9() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File_123456");
        JMenu menu = menuBar.getMenu(0);
        assertEquals("File", menu.getText());
        assertEquals('1', menu.getMnemonic());
    }

    /**
     * Test case for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
     * It adds a menu to a JMenuBar with a mnemonic.
     */
    @Test
    void testAddMenuBarItemWithMnemonic10() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File_1234567");
        JMenu menu = menuBar.getMenu(0);
        assertEquals("File", menu.getText());
        assertEquals('1', menu.getMnemonic());
    }
}
