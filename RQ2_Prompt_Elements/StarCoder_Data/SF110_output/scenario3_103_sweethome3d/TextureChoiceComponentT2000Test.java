// TextureChoiceComponentTest.java
package com.eteks.sweethome3d.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.CollectionEvent;
import com.eteks.sweethome3d.model.CollectionListener;
import com.eteks.sweethome3d.model.HomeTexture;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.TexturesCatalog;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.viewcontroller.TextureChoiceController;
import com.eteks.sweethome3d.viewcontroller.TextureChoiceView;
import com.eteks.sweethome3d.viewcontroller.View;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextureChoiceComponent}.
* It contains ten unit test cases for the {@link TextureChoiceComponent#confirmDeleteSelectedCatalogTexture()} method.
*/
class TextureChoiceComponentTest {

    /**
     * Test case for the {@link TextureChoiceComponent#confirmDeleteSelectedCatalogTexture()} method.
     */
    @Test
    void testConfirmDeleteSelectedCatalogTexture() {
        // Create a new texture choice component
        final TextureChoiceComponent textureChoiceComponent = new TextureChoiceComponent(new TextureChoiceController(new UserPreferences()) {
            @Override
            public void displayView(View view) {
            }
        });
        // Create a new texture choice controller
        final TextureChoiceController textureChoiceController = new TextureChoiceController(new UserPreferences()) {
            @Override
            public void displayView(View view) {
            }
        };
        // Create a new texture choice view
        final TextureChoiceView textureChoiceView = new TextureChoiceView() {
            @Override
            public void setController(TextureChoiceController controller) {
            }

            @Override
            public void setTexturesCatalog(TexturesCatalog texturesCatalog) {
            }

            @Override
            public void setSelectedCatalogTexture(CatalogTexture catalogTexture) {
            }

            @Override
            public void setSelectedHomeTexture(HomeTexture homeTexture) {
            }

            @Override
            public void setTextureChoiceActionsEnabled(boolean enabled) {
            }

            @Override
            public void setTextureChoiceActionsVisible(boolean visible) {
            }

            @Override
            public void setTextureChoiceActionsToolTipText(String toolTipText) {
            }

            @Override
            public void setTextureChoiceActionsBackground(Color background) {
            }

            @Override
            public void setTextureChoiceActionsForeground(Color foreground) {
            }

            @Override
            public void setTextureChoiceActionsFont(Font font) {
            }

            @Override
            public void setTextureChoiceActionsBorder(BorderFactory.BorderUIResource border) {
            }

            @Override
            public void setTextureChoiceActionsIcon(Icon icon) {
            }

            @Override
            public void setTextureChoiceActionsText(String text) {
            }

            @Override
            public void setTextureChoiceActionsMnemonic(int mnemonic) {
            }

            @Override
            public void setTextureChoiceActionsDisplayedMnemonicIndex(int displayedMnemonicIndex) {
            }

            @Override
            public void setTextureChoiceActionsToolTipText(int actionIndex, String toolTipText) {
            }

            @Override
            public void setTextureChoiceActionsBackground(int actionIndex, Color background) {
            }

            @Override
            public void setTextureChoiceActionsForeground(int actionIndex, Color foreground) {
            }

            @Override
            public void setTextureChoiceActionsFont(int actionIndex, Font font) {
            }

            @Override
            public void setTextureChoiceActionsBorder(int actionIndex, BorderFactory.BorderUIResource border) {
            }

            @Override
            public void setTextureChoiceActionsIcon(int actionIndex, Icon icon) {
            }

            @Override
            public void setTextureChoiceActionsText(int actionIndex, String text) {
            }

            @Override
            public void setTextureChoiceActionsMnemonic(int actionIndex, int mnemonic) {
            }

            @Override
            public void setTextureChoiceActionsDisplayedMnemonicIndex(int actionIndex, int displayedMnemonicIndex) {
            }

            @Override
            public void setTextureChoiceActionsEnabled(int actionIndex, boolean enabled) {
            }

            @Override
            public void setTextureChoiceActionsVisible(int actionIndex, boolean visible) {
            }

            @Override
            public void setTextureChoiceActionsEnabled(int actionIndex, boolean enabled, boolean runInEventDispatchThread) {
            }

            @Override
            public void setTextureChoiceActionsVisible(int actionIndex, boolean visible, boolean runInEventDispatchThread) {
            }

            @Override
            public void setTextureChoiceActionsToolTipText(int actionIndex, String toolTipText, boolean runInEventDispatchThread) {
            }

            @Override
            public void setTextureChoiceActionsBackground(int actionIndex, Color background, boolean runInEventDispatchThread) {
            }

            @Override
            public void setTextureChoiceActionsForeground(int actionIndex, Color foreground, boolean runInEventDispatchThread) {
            }

            @Override
            public void setTextureChoiceActionsFont(int actionIndex, Font font, boolean runInEventDispatchThread) {
            }

            @Override
            public void setTextureChoiceActionsBorder(int actionIndex, BorderFactory.BorderUIResource border, boolean runInEventDispatchThread) {
            }

            @Override
            public void setTextureChoiceActionsIcon(int actionIndex, Icon icon, boolean runInEventDispatchThread) {
            }

            @Override
            public void setTextureChoiceActionsText(int actionIndex, String text, boolean runInEventDispatchThread) {
            }

            @Override
            public void setTextureChoiceActionsMnemonic(int actionIndex, int mnemonic, boolean runInEventDispatchThread) {
            }

            @Override
            public void setTextureChoiceActionsDisplayedMnemonicIndex(int actionIndex, int displayedMnemonicIndex, boolean runInEventDispatchThread) {
            }

            @Override
            public void setTextureChoiceActionsEnabled(int actionIndex, boolean enabled, boolean runInEventDispatchThread, boolean updateView) {
            }

            @Override
            public void setTextureChoiceActionsVisible(int actionIndex, boolean visible, boolean runInEventDispatchThread, boolean updateView) {
            }

            @Override
            public void setTextureChoiceActionsToolTipText(int actionIndex, String toolTipText, boolean runInEventDispatchThread, boolean updateView) {
            }

            @Override
            public void setTextureChoiceActionsBackground(int actionIndex, Color background, boolean runInEventDispatchThread, boolean updateView) {
            }

            @Override
            public void setTextureChoiceActionsForeground(int actionIndex, Color foreground, boolean runInEventDispatchThread, boolean updateView) {
            }

            @Override
            public void setTextureChoiceActionsFont(int actionIndex, Font font, boolean runInEventDispatchThread, boolean updateView) {
            }

            @Override
            public void setTextureChoiceActionsBorder(int actionIndex, BorderFactory.BorderUIResource border, boolean runInEventDispatchThread, boolean updateView) {
            }

            @Override
            public void setTextureChoiceActionsIcon(int actionIndex, Icon icon, boolean runInEventDispatchThread, boolean updateView) {
            }

            @Override
            public void setTextureChoiceActionsText(int actionIndex, String text, boolean runInEventDispatchThread, boolean updateView) {
            }

            @Override
            public void setTextureChoiceActionsMnemonic(int actionIndex, int mnemonic, boolean runInEventDispatchThread, boolean updateView) {
            }

            @Override
            public void setTextureChoiceActionsDisplayedMnemonicIndex(int actionIndex, int displayedMnemonicIndex, boolean runInEventDispatchThread, boolean updateView) {
            }

            @Override
            public void setTextureChoiceActionsEnabled(int actionIndex, boolean enabled, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences) {
            }

            @Override
            public void setTextureChoiceActionsVisible(int actionIndex, boolean visible, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences) {
            }

            @Override
            public void setTextureChoiceActionsToolTipText(int actionIndex, String toolTipText, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences) {
            }

            @Override
            public void setTextureChoiceActionsBackground(int actionIndex, Color background, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences) {
            }

            @Override
            public void setTextureChoiceActionsForeground(int actionIndex, Color foreground, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences) {
            }

            @Override
            public void setTextureChoiceActionsFont(int actionIndex, Font font, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences) {
            }

            @Override
            public void setTextureChoiceActionsBorder(int actionIndex, BorderFactory.BorderUIResource border, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences) {
            }

            @Override
            public void setTextureChoiceActionsIcon(int actionIndex, Icon icon, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences) {
            }

            @Override
            public void setTextureChoiceActionsText(int actionIndex, String text, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences) {
            }

            @Override
            public void setTextureChoiceActionsMnemonic(int actionIndex, int mnemonic, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences) {
            }

            @Override
            public void setTextureChoiceActionsDisplayedMnemonicIndex(int actionIndex, int displayedMnemonicIndex, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences) {
            }

            @Override
            public void setTextureChoiceActionsEnabled(int actionIndex, boolean enabled, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences, boolean updateUndoManager) {
            }

            @Override
            public void setTextureChoiceActionsVisible(int actionIndex, boolean visible, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences, boolean updateUndoManager) {
            }

            @Override
            public void setTextureChoiceActionsToolTipText(int actionIndex, String toolTipText, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences, boolean updateUndoManager) {
            }

            @Override
            public void setTextureChoiceActionsBackground(int actionIndex, Color background, boolean runInEventDispatchThread, boolean updateView, boolean updatePreferences, boolean updateUndoManager) {
            }

            @Override
            public void setTextureChoiceActionsForeground(int actionIndex,