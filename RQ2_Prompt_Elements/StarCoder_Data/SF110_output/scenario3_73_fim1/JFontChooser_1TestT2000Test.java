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
* It contains ten unit test cases for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
*/
class JFontChooser_1Test {

    /**
    * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null
    * <li>title: "Font Chooser"
    * <li>modal: true
    * <li>okListener: null
    * <li>cancelListener: null
    * </ul>
    */
    @Test
    void testCreateDialog01() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Font Chooser", true, null, null);
        assertNotNull(dialog);
    }

    /**
    * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null
    * <li>title: "Font Chooser"
    * <li>modal: true
    * <li>okListener: null
    * <li>cancelListener: null
    * </ul>
    */
    @Test
    void testCreateDialog02() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Font Chooser", true, null, null);
        assertNotNull(dialog);
    }

    /**
    * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null
    * <li>title: "Font Chooser"
    * <li>modal: true
    * <li>okListener: null
    * <li>cancelListener: null
    * </ul>
    */
    @Test
    void testCreateDialog03() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Font Chooser", true, null, null);
        assertNotNull(dialog);
    }

    /**
    * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null
    * <li>title: "Font Chooser"
    * <li>modal: true
    * <li>okListener: null
    * <li>cancelListener: null
    * </ul>
    */
    @Test
    void testCreateDialog04() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Font Chooser", true, null, null);
        assertNotNull(dialog);
    }

    /**
    * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null
    * <li>title: "Font Chooser"
    * <li>modal: true
    * <li>okListener: null
    * <li>cancelListener: null
    * </ul>
    */
    @Test
    void testCreateDialog05() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Font Chooser", true, null, null);
        assertNotNull(dialog);
    }

    /**
    * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null
    * <li>title: "Font Chooser"
    * <li>modal: true
    * <li>okListener: null
    * <li>cancelListener: null
    * </ul>
    */
    @Test
    void testCreateDialog06() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Font Chooser", true, null, null);
        assertNotNull(dialog);
    }

    /**
    * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null
    * <li>title: "Font Chooser"
    * <li>modal: true
    * <li>okListener: null
    * <li>cancelListener: null
    * </ul>
    */
    @Test
    void testCreateDialog07() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Font Chooser", true, null, null);
        assertNotNull(dialog);
    }

    /**
    * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null
    * <li>title: "Font Chooser"
    * <li>modal: true
    * <li>okListener: null
    * <li>cancelListener: null
    * </ul>
    */
    @Test
    void testCreateDialog08() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Font Chooser", true, null, null);
        assertNotNull(dialog);
    }

    /**
    * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null
    * <li>title: "Font Chooser"
    * <li>modal: true
    * <li>okListener: null
    * <li>cancelListener: null
    * </ul>
    */
    @Test
    void testCreateDialog09() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Font Chooser", true, null, null);
        assertNotNull(dialog);
    }

    /**
    * Test case for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)}.
    * It tests the method with the following parameters:
    * <ul>
    * <li>parent component: null
    * <li>title: "Font Chooser"
    * <li>modal: true
    * <li>okListener: null
    * <li>cancelListener: null
    * </ul>
    */
    @Test
    void testCreateDialog10() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Font Chooser", true, null, null);
        assertNotNull(dialog);
    }
}

// JFontChooser_2Test.java
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
* It contains ten unit test cases for the {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)} method.
*/
class JFontChooser_2Test {
		
    /**
    * Test case for {@link JFontChooser#createDialog(Component,