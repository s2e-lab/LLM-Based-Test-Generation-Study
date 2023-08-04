// ApplicationConfiguration_10Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfiguration_10Test {

    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#quitAction()}.
    */
    @Test
    void quitAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
        OpenFileModel openFileModel = applicationConfiguration.openFileModel();
        MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
        OpenFileAction openFileAction = applicationConfiguration.openAction();
        CloseAction closeAction = applicationConfiguration.closeAction();
        CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
        //
        // Test case 1:
        //
        // The application is not running.
        //
        assertFalse(jTailMainModel.isRunning());
        //
        // The "quit" action is not enabled.
        //
        assertFalse(applicationConfiguration.quitAction().isEnabled());
        //
        // The "file" menu is not enabled.
        //
        assertFalse(fileMenuAction.isEnabled());
        //
        // The "tools" menu is not enabled.
        //
        assertFalse(toolsMenuAction.isEnabled());
        //
        // The "choose a file" action is not enabled.
        //
        assertFalse(chooseFileAction.isEnabled());
        //
        // The "select index type" action is not enabled.
        //
        assertFalse(selectIndexTypeListener.isEnabled());
        //
        // The "index file" action is not enabled.
        //
        assertFalse(indexFileAction.isEnabled());
        //
        // The "open" action is not enabled.
        //
        assertFalse(openFileAction.isEnabled());
        //
        // The "close" action is not enabled.
        //
        assertFalse(closeAction.isEnabled());
        //
        // The "close all" action is not enabled.
        //
        assertFalse(closeAllAction.isEnabled());
        //
        // The "highlight" action is not enabled.
        //
        assertFalse(highlightAction.isEnabled());
        //
        // The main frame is not visible.
        //
        assertFalse(jTailMainFrame.isVisible());
        //
        // The "open file" dialog is not visible.
        //
        assertFalse(openFileDialog.isVisible());
        //
        // The "open file" dialog is not modal.
        //
        assertFalse(openFileDialog.isModal());
        //
        // The "open file" dialog is not resizable.
        //
        assertFalse(openFileDialog.isResizable());
        //
        // The "open file" dialog is not closable.
        //
        assertFalse(openFileDialog.isClosable());
        //
        // The "open file" dialog is not maximizable.
        //
        assertFalse(openFileDialog.isMaximizable());
        //
        // The "open file" dialog is not minimizable.
        //
        assertFalse(openFileDialog.isMinimizable());
        //
        // The "open file" dialog is not undecorated.
        //
        assertFalse(openFileDialog.isUndecorated());
        //
        // The "open file" dialog is not always on top.
        //
        assertFalse(openFileDialog.isAlwaysOnTop());
        //
        // The "open file" dialog is not centered.
        //
        assertFalse(openFileDialog.isCentered());
        //
        // The "open file" dialog is not maximized.
        //
        assertFalse(openFileDialog.isMaximized());
        //
        // The "open file" dialog is not minimized.
        //
        assertFalse(openFileDialog.isMinimized());
        //
        // The "open file" dialog is not full screen.
        //
        assertFalse(openFileDialog.isFullScreen());
        //
        // The "open file" dialog is not iconified.
        //
        assertFalse(openFileDialog.isIconified());
        //
        // The "open file" dialog is not closed.
        //
        assertFalse(openFileDialog.isClosed());
        //
        // The "open file" dialog is not disposed.
        //
        assertFalse(openFileDialog.isDisposed());
        //
        // The "open file" dialog is not showing.
        //
        assertFalse(openFileDialog.isShowing());
        //
        // The "open file" dialog is not hidden.
        //
        assertFalse(openFileDialog.isHidden());
        //
        // The "open file" dialog is not iconified.
        //
        assertFalse(openFileDialog.isIconified());
        //
        // The "open file" dialog is not maximized.
        //
        assertFalse(openFileDialog.isMaximized());
        //
        // The "open file" dialog is not minimized.
        //
        assertFalse(openFileDialog.isMinimized());
        //
        // The "open file" dialog is not full screen.
        //
        assertFalse(openFileDialog.isFullScreen());
        //
        // The "open file" dialog is not iconified.
        //
        assertFalse(openFileDialog.isIconified());
        //
        // The "open file" dialog is not closed.
        //
        assertFalse(openFileDialog.isClosed());
        //
        // The "open file" dialog is not disposed.
        //
        assertFalse(openFileDialog.isDisposed());
        //
        // The "open file" dialog is not showing.
        //
        assertFalse(openFileDialog.isShowing());
        //
        // The "open file" dialog is not hidden.
        //
        assertFalse(openFileDialog.isHidden());
        //
        // The "open file" dialog is not iconified.
        //
        assertFalse(openFileDialog.isIconified());
        //
        // The "open file" dialog is not maximized.
        //
        assertFalse(openFileDialog.isMaximized());
        //
        // The "open file" dialog is not minimized.
        //
        assertFalse(openFileDialog.isMinimized());
        //
        // The "open file" dialog is not full screen.
        //
        assertFalse(openFileDialog.isFullScreen());
        //
        // The "open file" dialog is not iconified.
        //
        assertFalse(openFileDialog.isIconified());
        //
        // The "open file" dialog is not closed.
        //
        assertFalse(openFileDialog.isClosed());
        //
        // The "open file" dialog is not disposed.
        //
        assertFalse(openFileDialog.isDisposed());
        //
        // The "open file" dialog is not showing.
        //
        assertFalse(openFileDialog.isShowing());
        //
        // The "open file" dialog is not hidden.
        //
        assertFalse(openFileDialog.isHidden());
        //
        // The "open file" dialog is not iconified.
        //
        assertFalse(openFileDialog.isIconified());
        //
        // The "open file" dialog is not maximized.
        //
        assertFalse(openFileDialog.isMaximized());
        //
        // The "open file" dialog is not minimized.
        //
        assertFalse(openFileDialog.isMinimized());
        //
        // The "open file" dialog is not full screen.
        //
        assertFalse(openFileDialog.isFullScreen());
        //
        // The "open file" dialog is not iconified.
        //
        assertFalse(openFileDialog.isIconified());
        //
        // The "open file" dialog is not closed.
        //
        assertFalse(openFileDialog.isClosed());
        //
        // The "open file" dialog is not disposed.
        //
        assertFalse(openFileDialog.isDisposed());
        //
        // The "open file" dialog is not showing.
        //
        assertFalse(openFileDialog.isShowing());
        //
        // The "open file" dialog is not hidden.
        //
        assertFalse(openFileDialog.isHidden());
        //
        // The "open file" dialog is not iconified.
        //
        assertFalse(openFileDialog.isIconified());
        //
        // The "open file" dialog is not maximized.
        //
        assertFalse(openFileDialog.isMaximized());
        //
        // The "open file" dialog is not minimized.
        //
        assertFalse(openFileDialog.isMinimized());
        //
        // The "open file" dialog is not full screen.
        //
        assertFalse(openFileDialog.isFullScreen());
        //
        // The "open file" dialog is not iconified.
        //
        assertFalse(openFileDialog.isIconified());
        //
        // The "open file" dialog is not closed.
        //
        assertFalse(openFileDialog.isClosed());
        //
        // The "open file" dialog is not disposed.
        //
        assertFalse(openFileDialog.isDisposed());
        //
        // The "open file" dialog is not showing.
        //
        assertFalse(openFileDialog.isShowing());
        //
        // The "open file" dialog is not hidden.
        //
        assertFalse(openFileDialog.isHidden());
        //
        // The "open file" dialog is not iconified.
        //
        assertFalse(openFileDialog.isIconified());
        //
        // The "open file" dialog is not maximized.
        //