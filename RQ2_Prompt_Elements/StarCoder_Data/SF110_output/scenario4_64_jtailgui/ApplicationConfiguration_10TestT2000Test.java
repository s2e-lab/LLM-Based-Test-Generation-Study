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
        OpenFileAction openAction = applicationConfiguration.openAction();
        CloseAction closeAction = applicationConfiguration.closeAction();
        CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
        QuitAction quitAction = applicationConfiguration.quitAction();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
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

// ApplicationConfiguration_11Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#highlightAction()} method.
*/
class ApplicationConfiguration_11Test {
		
    /**
    * Test method for {@link ApplicationConfiguration#highlightAction()}.
    */
    @Test
    void highlightAction() {
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

// ApplicationConfiguration_12Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openFileDialog()} method.
*/
class ApplicationConfiguration_12Test {
		
    /**
    * Test method for {@link ApplicationConfiguration#openFileDialog()}.
    */
    @Test
    void openFileDialog() {
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

// ApplicationConfiguration_13Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfiguration_13Test {
		
    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void jTailMainFrame() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
        OpenFileModel openFileModel = applicationConfiguration.openFileModel();
        MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
        OpenFileAction openAction = applicationConfiguration.