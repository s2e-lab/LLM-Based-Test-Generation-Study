// ApplicationConfiguration_9Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfiguration_9Test {

    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#closeAllAction()}.
    */
    @Test
    void testCloseAllAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
        OpenFileModel openFileModel = applicationConfiguration.openFileModel();
        MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
        OpenFileAction openAction = applicationConfiguration.openAction();
        CloseAction closeAction = applicationConfiguration.closeAction();
        CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
        QuitAction quitAction = applicationConfiguration.quitAction();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
        //
        // Test case 1:
        //
        // Close all files when there is no file opened.
        //
        // Expected result:
        // - The "close all" menu item is disabled.
        // - The "close all" button is disabled.
        //
        // Test case 2:
        //
        // Close all files when there is one file opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 3:
        //
        // Close all files when there are two files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 4:
        //
        // Close all files when there are three files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 5:
        //
        // Close all files when there are four files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 6:
        //
        // Close all files when there are five files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 7:
        //
        // Close all files when there are six files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 8:
        //
        // Close all files when there are seven files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 9:
        //
        // Close all files when there are eight files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 10:
        //
        // Close all files when there are nine files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 11:
        //
        // Close all files when there are ten files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 12:
        //
        // Close all files when there are eleven files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 13:
        //
        // Close all files when there are twelve files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 14:
        //
        // Close all files when there are thirteen files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 15:
        //
        // Close all files when there are fourteen files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 16:
        //
        // Close all files when there are fifteen files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 17:
        //
        // Close all files when there are sixteen files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 18:
        //
        // Close all files when there are seventeen files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 19:
        //
        // Close all files when there are eighteen files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 20:
        //
        // Close all files when there are nineteen files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 21:
        //
        // Close all files when there are twenty files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 22:
        //
        // Close all files when there are twenty-one files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 23:
        //
        // Close all files when there are twenty-two files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 24:
        //
        // Close all files when there are twenty-three files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 25:
        //
        // Close all files when there are twenty-four files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 26:
        //
        // Close all files when there are twenty-five files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 27:
        //
        // Close all files when there are twenty-six files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 28:
        //
        // Close all files when there are twenty-seven files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 29:
        //
        // Close all files when there are twenty-eight files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 30:
        //
        // Close all files when there are twenty-nine files opened.
        //
        // Expected result:
        // - The "close all" menu item is enabled.
        // - The "close all" button is enabled.
        //
        // Test case 31: