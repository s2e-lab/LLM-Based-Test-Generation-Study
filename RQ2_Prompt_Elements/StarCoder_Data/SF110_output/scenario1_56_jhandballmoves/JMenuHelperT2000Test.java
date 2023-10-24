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

    @Test
    void testAddMenuBarItem() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = JMenuHelper.addMenuBarItem(menuBar, "File");
        assertEquals(menuBar.getMenuCount(), 1);
        assertEquals(menuBar.getMenu(0), menu);
        assertEquals(menu.getText(), "File");
        assertEquals(menu.getMnemonic(), 'F');
        menu = JMenuHelper.addMenuBarItem(menuBar, "Edit");
        assertEquals(menuBar.getMenuCount(), 2);
        assertEquals(menuBar.getMenu(1), menu);
        assertEquals(menu.getText(), "Edit");
        assertEquals(menu.getMnemonic(), 'E');
        menu = JMenuHelper.addMenuBarItem(menuBar, "Help");
        assertEquals(menuBar.getMenuCount(), 3);
        assertEquals(menuBar.getMenu(2), menu);
        assertEquals(menu.getText(), "Help");
        assertEquals(menu.getMnemonic(), 'H');
        menu = JMenuHelper.addMenuBarItem(menuBar, "File_");
        assertEquals(menuBar.getMenuCount(), 4);
        assertEquals(menuBar.getMenu(3), menu);
        assertEquals(menu.getText(), "File");
        assertEquals(menu.getMnemonic(), 'F');
        menu = JMenuHelper.addMenuBarItem(menuBar, "Edit_");
        assertEquals(menuBar.getMenuCount(), 5);
        assertEquals(menuBar.getMenu(4), menu);
        assertEquals(menu.getText(), "Edit");
        assertEquals(menu.getMnemonic(), 'E');
        menu = JMenuHelper.addMenuBarItem(menuBar, "Help_");
        assertEquals(menuBar.getMenuCount(), 6);
        assertEquals(menuBar.getMenu(5), menu);
        assertEquals(menu.getText(), "Help");
        assertEquals(menu.getMnemonic(), 'H');
        menu = JMenuHelper.addMenuBarItem(menuBar, "File__");
        assertEquals(menuBar.getMenuCount(), 7);
        assertEquals(menuBar.getMenu(6), menu);
        assertEquals(menu.getText(), "File");
        assertEquals(menu.getMnemonic(), 'F');
        menu = JMenuHelper.addMenuBarItem(menuBar, "Edit__");
        assertEquals(menuBar.getMenuCount(), 8);
        assertEquals(menuBar.getMenu(7), menu);
        assertEquals(menu.getText(), "Edit");
        assertEquals(menu.getMnemonic(), 'E');
        menu = JMenuHelper.addMenuBarItem(menuBar, "Help__");
        assertEquals(menuBar.getMenuCount(), 9);
        assertEquals(menuBar.getMenu(8), menu);
        assertEquals(menu.getText(), "Help");
        assertEquals(menu.getMnemonic(), 'H');
        menu = JMenuHelper.addMenuBarItem(menuBar, "File___");
        assertEquals(menuBar.getMenuCount(), 10);
        assertEquals(menuBar.getMenu(9), menu);
        assertEquals(menu.getText(), "File");
        assertEquals(menu.getMnemonic(), 'F');
        menu = JMenuHelper.addMenuBarItem(menuBar, "Edit___");
        assertEquals(menuBar.getMenuCount(), 11);
        assertEquals(menuBar.getMenu(10), menu);
        assertEquals(menu.getText(), "Edit");
        assertEquals(menu.getMnemonic(), 'E');
        menu = JMenuHelper.addMenuBarItem(menuBar, "Help___");
        assertEquals(menuBar.getMenuCount(), 12);
        assertEquals(menuBar.getMenu(11), menu);
        assertEquals(menu.getText(), "Help");
        assertEquals(menu.getMnemonic(), 'H');
    }
}
