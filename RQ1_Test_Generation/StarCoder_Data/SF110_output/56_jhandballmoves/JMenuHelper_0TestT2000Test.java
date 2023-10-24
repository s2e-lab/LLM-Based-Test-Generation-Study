// JMenuHelper_0Test.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuBarItem(JMenuBar, String)} method.
*/
class JMenuHelper_0Test {

    /**
    * Test method for {@link JMenuHelper#addMenuBarItem(JMenuBar, String)}.
    */
    @Test
    void testAddMenuBarItem() {
        JMenuBar menuBar = new JMenuBar();
        JMenuHelper.addMenuBarItem(menuBar, "File");
        JMenuHelper.addMenuBarItem(menuBar, "Edit");
        JMenuHelper.addMenuBarItem(menuBar, "View");
        JMenuHelper.addMenuBarItem(menuBar, "Help");
        assertEquals(4, menuBar.getMenuCount());
    }
}

// JMenuHelper_1Test.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)} method.
*/
class JMenuHelper_1Test {
		
    /**
    * Test method for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}.
    */
    @Test
    void testAddMenuItem() {
        JMenu menu = new JMenu("File");
        JMenuHelper.addMenuItem(menu, "New", 'N', null, null);
        JMenuHelper.addMenuItem(menu, "Open", 'O', null, null);
        JMenuHelper.addMenuItem(menu, "Save", 'S', null, null);
        JMenuHelper.addMenuItem(menu, "Save As", 'A', null, null);
        JMenuHelper.addMenuItem(menu, "Exit", 'X', null, null);
        assertEquals(5, menu.getItemCount());
    }
}

// JMenuHelper_2Test.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)} method.
*/
class JMenuHelper_2Test {
		
    /**
    * Test method for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}.
    */
    @Test
    void testAddMenuItem() {
        JMenu menu = new JMenu("File");
        JMenuHelper.addMenuItem(menu, "New", 'N', null, null);
        JMenuHelper.addMenuItem(menu, "Open", 'O', null, null);
        JMenuHelper.addMenuItem(menu, "Save", 'S', null, null);
        JMenuHelper.addMenuItem(menu, "Save As", 'A', null, null);
        JMenuHelper.addMenuItem(menu, "Exit", 'X', null, null);
        assertEquals(5, menu.getItemCount());
    }
}

// JMenuHelper_3Test.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)} method.
*/
class JMenuHelper_3Test {
		
    /**
    * Test method for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}.
    */
    @Test
    void testAddMenuItem() {
        JMenu menu = new JMenu("File");
        JMenuHelper.addMenuItem(menu, "New", 'N', null, null);
        JMenuHelper.addMenuItem(menu, "Open", 'O', null, null);
        JMenuHelper.addMenuItem(menu, "Save", 'S', null, null);
        JMenuHelper.addMenuItem(menu, "Save As", 'A', null, null);
        JMenuHelper.addMenuItem(menu, "Exit", 'X', null, null);
        assertEquals(5, menu.getItemCount());
    }
}

// JMenuHelper_4Test.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)} method.
*/
class JMenuHelper_4Test {
		
    /**
    * Test method for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}.
    */
    @Test
    void testAddMenuItem() {
        JMenu menu = new JMenu("File");
        JMenuHelper.addMenuItem(menu, "New", 'N', null, null);
        JMenuHelper.addMenuItem(menu, "Open", 'O', null, null);
        JMenuHelper.addMenuItem(menu, "Save", 'S', null, null);
        JMenuHelper.addMenuItem(menu, "Save As", 'A', null, null);
        JMenuHelper.addMenuItem(menu, "Exit", 'X', null, null);
        assertEquals(5, menu.getItemCount());
    }
}

// JMenuHelper_5Test.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)} method.
*/
class JMenuHelper_5Test {
		
    /**
    * Test method for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}.
    */
    @Test
    void testAddMenuItem() {
        JMenu menu = new JMenu("File");
        JMenuHelper.addMenuItem(menu, "New", 'N', null, null);
        JMenuHelper.addMenuItem(menu, "Open", 'O', null, null);
        JMenuHelper.addMenuItem(menu, "Save", 'S', null, null);
        JMenuHelper.addMenuItem(menu, "Save As", 'A', null, null);
        JMenuHelper.addMenuItem(menu, "Exit", 'X', null, null);
        assertEquals(5, menu.getItemCount());
    }
}

// JMenuHelper_6Test.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)} method.
*/
class JMenuHelper_6Test {
		
    /**
    * Test method for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}.
    */
    @Test
    void testAddMenuItem() {
        JMenu menu = new JMenu("File");
        JMenuHelper.addMenuItem(menu, "New", 'N', null, null);
        JMenuHelper.addMenuItem(menu, "Open", 'O', null, null);
        JMenuHelper.addMenuItem(menu, "Save", 'S', null, null);
        JMenuHelper.addMenuItem(menu, "Save As", 'A', null, null);
        JMenuHelper.addMenuItem(menu, "Exit", 'X', null, null);
        assertEquals(5, menu.getItemCount());
    }
}

// JMenuHelper_7Test.java
package visu.handball.moves.controller;

import java.awt.event.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JMenuHelper}.
* It contains ten unit test cases for the {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)} method.
*/
class JMenuHelper_7Test {
		
    /**
    * Test method for {@link JMenuHelper#addMenuItem(JMenu, String, char, Action, ActionListener)}.
    */
    @Test
    void testAddMenuItem() {
        JMenu