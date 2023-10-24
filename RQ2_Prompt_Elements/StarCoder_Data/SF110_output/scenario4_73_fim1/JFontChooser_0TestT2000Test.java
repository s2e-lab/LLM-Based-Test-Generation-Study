// JFontChooser_0Test.java
package osa.ora.server.client.ui.utils;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JFontChooser}.
* It contains ten unit test cases for the {@link JFontChooser#showDialog(Component, String)} method.
*/
class JFontChooser_0Test {

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null</li>
    * <li>title: "Font Chooser"</li>
    * </ul>
    */
    @Test
    void testShowDialog_0() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(null, "Font Chooser");
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null</li>
    * <li>title: ""</li>
    * </ul>
    */
    @Test
    void testShowDialog_1() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(null, "");
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null</li>
    * <li>title: null</li>
    * </ul>
    */
    @Test
    void testShowDialog_2() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(null, null);
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: new JPanel()</li>
    * <li>title: "Font Chooser"</li>
    * </ul>
    */
    @Test
    void testShowDialog_3() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(new JPanel(), "Font Chooser");
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: new JPanel()</li>
    * <li>title: ""</li>
    * </ul>
    */
    @Test
    void testShowDialog_4() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(new JPanel(), "");
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: new JPanel()</li>
    * <li>title: null</li>
    * </ul>
    */
    @Test
    void testShowDialog_5() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(new JPanel(), null);
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: new JDialog()</li>
    * <li>title: "Font Chooser"</li>
    * </ul>
    */
    @Test
    void testShowDialog_6() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(new JDialog(), "Font Chooser");
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: new JDialog()</li>
    * <li>title: ""</li>
    * </ul>
    */
    @Test
    void testShowDialog_7() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(new JDialog(), "");
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: new JDialog()</li>
    * <li>title: null</li>
    * </ul>
    */
    @Test
    void testShowDialog_8() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(new JDialog(), null);
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: new JFrame()</li>
    * <li>title: "Font Chooser"</li>
    * </ul>
    */
    @Test
    void testShowDialog_9() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(new JFrame(), "Font Chooser");
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: new JFrame()</li>
    * <li>title: ""</li>
    * </ul>
    */
    @Test
    void testShowDialog_10() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(new JFrame(), "");
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: new JFrame()</li>
    * <li>title: null</li>
    * </ul>
    */
    @Test
    void testShowDialog_11() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(new JFrame(), null);
        assertNull(font);
    }
}

// JFontChooser_1Test.java
package osa.ora.server.client.ui.utils;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JFontChooser}.
* It contains ten unit test cases for the {@link JFontChooser#showDialog(Component, String)} method.
*/
class JFontChooser_1Test {
		
    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null</li>
    * <li>title: "Font Chooser"</li>
    * </ul>
    */
    @Test
    void testShowDialog_0() {
        JFontChooser fontChooser = new JFontChooser();
        Font font = fontChooser.showDialog(null, "Font Chooser");
        assertNull(font);
    }

    /**
    * Test method for {@link JFontChooser#showDialog(Component, String)}.
    * It tests the method with the following parameters:
    *