// ApplicationConfiguration_2Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#fileMenuAction()} method.
*/
class ApplicationConfiguration_2Test {

    /**
    * Test method for {@link ApplicationConfiguration#fileMenuAction()}.
    */
    @Test
    void fileMenuAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction menuAction = applicationConfiguration.fileMenuAction();
        assertNotNull(menuAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#toolsMenuAction()}.
    */
    @Test
    void toolsMenuAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction menuAction = applicationConfiguration.toolsMenuAction();
        assertNotNull(menuAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void chooseFileAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertNotNull(chooseFileAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void selectIndexTypeListener() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertNotNull(selectIndexTypeListener);
    }

    /**
    * Test method for {@link ApplicationConfiguration#indexFileAction()}.
    */
    @Test
    void indexFileAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
        assertNotNull(indexFileAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#openAction()}.
    */
    @Test
    void openAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileAction openFileAction = applicationConfiguration.openAction();
        assertNotNull(openFileAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#closeAction()}.
    */
    @Test
    void closeAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        CloseAction closeAction = applicationConfiguration.closeAction();
        assertNotNull(closeAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#closeAllAction()}.
    */
    @Test
    void closeAllAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
        assertNotNull(closeAllAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#quitAction()}.
    */
    @Test
    void quitAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        assertNotNull(quitAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#highlightAction()}.
    */
    @Test
    void highlightAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertNotNull(highlightAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#openFileDialog()}.
    */
    @Test
    void openFileDialog() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
        assertNotNull(openFileDialog);
    }
}

// ApplicationConfiguration_3Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainModel()} method.
*/
class ApplicationConfiguration_3Test {
		
    /**
    * Test method for {@link ApplicationConfiguration#jTailMainModel()}.
    */
    @Test
    void jTailMainModel() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
        assertNotNull(jTailMainModel);
    }

    /**
    * Test method for {@link ApplicationConfiguration#openFileModel()}.
    */
    @Test
    void openFileModel() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileModel openFileModel = applicationConfiguration.openFileModel();
        assertNotNull(openFileModel);
    }

    /**
    * Test method for {@link ApplicationConfiguration#fileMenuAction()}.
    */
    @Test
    void fileMenuAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction menuAction = applicationConfiguration.fileMenuAction();
        assertNotNull(menuAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#toolsMenuAction()}.
    */
    @Test
    void toolsMenuAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction menuAction = applicationConfiguration.toolsMenuAction();
        assertNotNull(menuAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void chooseFileAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertNotNull(chooseFileAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void selectIndexTypeListener() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertNotNull(selectIndexTypeListener);
    }

    /**
    * Test method for {@link ApplicationConfiguration#indexFileAction()}.
    */
    @Test
    void indexFileAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
        assertNotNull(indexFileAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#openAction()}.
    */
    @Test
    void openAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileAction openFileAction = applicationConfiguration.openAction();
        assertNotNull(openFileAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#closeAction()}.
    */
    @Test
    void closeAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        CloseAction closeAction = applicationConfiguration.closeAction();
        assertNotNull(closeAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#closeAllAction()}.
    */
    @Test
    void closeAllAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
        assertNotNull(closeAllAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#quitAction()}.
    */
    @Test
    void quitAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        assertNotNull(quitAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#highlightAction()}.
    */
    @Test
    void highlightAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertNotNull(highlightAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertNotNull(jTailMainFrame);
    }

    /**
    * Test method for {@link ApplicationConfiguration#openFileDialog()}.
    */
    @Test
    void openFileDialog() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
        assertNotNull(openFileDialog);
    }
}

// ApplicationConfiguration_4Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.springframework.beans.factory.config.BeanDefinition;
