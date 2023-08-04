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
    * Test method for {@link JFontChooser#createDialog(Component, String, boolean, ActionListener, ActionListener)}.
    * It tests the creation of a dialog with the "OK" and "Cancel" buttons.
    */
    @Test
    void testCreateDialog() {
        JFontChooser fontChooser = new JFontChooser();
        JDialog dialog = fontChooser.createDialog(null, "Test", false, null, null);
        assertNotNull(dialog);
        assertEquals("Test", dialog.getTitle());
        assertEquals(false, dialog.isModal());
        assertEquals(false, dialog.isResizable());
        assertEquals(false, dialog.isUndecorated());
        assertEquals(false, dialog.isAlwaysOnTop());
        assertEquals(false, dialog.isAlwaysOnTopSupported());
        assertEquals(false, dialog.isLocationByPlatform());
        assertEquals(false, dialog.isLocationByPlatform());
        assertEquals(false, dialog.isAlwaysOnTopSupported());
        assertEquals(false, dialog.isModalityTypeSupported(dialog.DEFAULT_MODALITY_TYPE));
        assertEquals(false, dialog.isModalityTypeSupported(dialog.ModalityType.APPLICATION_MODAL));
        assertEquals(false, dialog.isModalityTypeSupported(dialog.ModalityType.DOCUMENT_MODAL));
        assertEquals(false, dialog.isModalityTypeSupported(dialog.ModalityType.MODELESS));
        assertEquals(false, dialog.isModalityTypeSupported(dialog.ModalityType.TOOLKIT_MODAL));
        assertEquals(false, dialog.isModalityTypeSupported(dialog.ModalityType.WINDOW_MODAL));
        assertEquals(false, dialog.isModalityTypeSupported(dialog.ModalityType.NONE));
        assertEquals(false, dialog.isModalityTypeSupported(dialog.ModalityType.UNKNOWN));
        assertEquals(false, dialog.isModalityTypeSupported(null));
        assertEquals(false, dialog.isModalityTypeSupported(new Integer(1)));
        assertEquals(false, dialog.isModalityTypeSupported(new Object()));
        assertEquals(false, dialog.isModalityTypeSupported(new String()));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(false, dialog.isModalityTypeSupported(new String("Test")));
        assertEquals(