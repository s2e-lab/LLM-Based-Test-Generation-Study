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
        assertNotNull(applicationConfiguration);
        assertNotNull(jTailMainModel);
        assertNotNull(openFileModel);
        assertNotNull(fileMenuAction);
        assertNotNull(toolsMenuAction);
        assertNotNull(chooseFileAction);
        assertNotNull(selectIndexTypeListener);
        assertNotNull(indexFileAction);
        assertNotNull(openAction);
        assertNotNull(closeAction);
        assertNotNull(closeAllAction);
        assertNotNull(quitAction);
        assertNotNull(highlightAction);
        assertNotNull(jTailMainFrame);
        assertNotNull(openFileDialog);
    }
}

// ApplicationConfiguration_8Test.java
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
* It contains nine unit test cases for the {@link ApplicationConfiguration#highlightAction()} method.
*/
class ApplicationConfiguration_8Test {
		
    /**
    * Test method for {@link ApplicationConfiguration#highlightAction()}.
    */
    @Test
    void testHighlightAction() {
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
        assertNotNull(applicationConfiguration);
        assertNotNull(jTailMainModel);
        assertNotNull(openFileModel);
        assertNotNull(fileMenuAction);
        assertNotNull(toolsMenuAction);
        assertNotNull(chooseFileAction);
        assertNotNull(selectIndexTypeListener);
        assertNotNull(indexFileAction);
        assertNotNull(openAction);
        assertNotNull(closeAction);
        assertNotNull(closeAllAction);
        assertNotNull(quitAction);
        assertNotNull(highlightAction);
        assertNotNull(jTailMainFrame);
        assertNotNull(openFileDialog);
    }
}

// ApplicationConfiguration_7Test.java
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
* It contains eight unit test cases for the {@link ApplicationConfiguration#quitAction()} method.
*/
class ApplicationConfiguration_7Test {
		
    /**
    * Test method for {@link ApplicationConfiguration#quitAction()}.
    */
    @Test
    void testQuitAction() {
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
        assertNotNull(applicationConfiguration);
        assertNotNull(jTailMainModel);
        assertNotNull(openFileModel);
        assertNotNull(fileMenuAction);
        assertNotNull(toolsMenuAction);
        assertNotNull(chooseFileAction);
        assertNotNull(selectIndexTypeListener);
        assertNotNull(indexFileAction);
        assertNotNull(openAction);
        assertNotNull(closeAction);
        assertNotNull(closeAllAction);
        assertNotNull(quitAction);
        assertNotNull(highlightAction);
        assertNotNull(jTailMainFrame);
        assertNotNull(openFileDialog);
    }
}

// ApplicationConfiguration_6Test.java
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
* It contains seven unit test cases for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfiguration_6Test {
		
    /**
    * Test method for {@link ApplicationConfiguration#closeAction()}.
    */
    @Test
    void testCloseAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
        OpenFileModel openFileModel = applicationConfiguration.openFileModel();
        MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        IndexFileAction indexFileAction = applicationConfiguration.index