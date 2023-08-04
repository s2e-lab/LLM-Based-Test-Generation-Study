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

    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#fileMenuAction()}.
    */
    @Test
    void testFileMenuAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
        assertEquals(bundle.getString("action.file.label"), fileMenuAction.getLabel());
        assertEquals(bundle.getString("action.file.mnemonic"), fileMenuAction.getMnemonic());
    }

    /**
    * Test method for {@link ApplicationConfiguration#toolsMenuAction()}.
    */
    @Test
    void testToolsMenuAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        assertEquals(bundle.getString("action.tools.label"), toolsMenuAction.getLabel());
        assertEquals(bundle.getString("action.tools.mnemonic"), toolsMenuAction.getMnemonic());
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(openFileModel(), chooseFileAction.getOpenFileModel());
    }

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void testSelectIndexTypeListener() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertEquals(openFileModel(), selectIndexTypeListener.getOpenFileModel());
    }

    /**
    * Test method for {@link ApplicationConfiguration#indexFileAction()}.
    */
    @Test
    void testIndexFileAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
        assertEquals(jTailMainModel(), indexFileAction.getJTailMainModel());
        assertEquals(openFileModel(), indexFileAction.getOpenFileModel());
    }

    /**
    * Test method for {@link ApplicationConfiguration#openAction()}.
    */
    @Test
    void testOpenAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileAction openFileAction = applicationConfiguration.openAction();
        assertEquals(jTailMainModel(), openFileAction.getJTailMainModel());
        assertEquals(openFileModel(), openFileAction.getOpenFileModel());
        assertEquals(openFileDialog(), openFileAction.getOpenFileDialog());
    }

    /**
    * Test method for {@link ApplicationConfiguration#closeAction()}.
    */
    @Test
    void testCloseAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        CloseAction closeAction = applicationConfiguration.closeAction();
        assertEquals(jTailMainModel(), closeAction.getJTailMainModel());
    }

    /**
    * Test method for {@link ApplicationConfiguration#closeAllAction()}.
    */
    @Test
    void testCloseAllAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
        assertEquals(jTailMainModel(), closeAllAction.getJTailMainModel());
    }

    /**
    * Test method for {@link ApplicationConfiguration#quitAction()}.
    */
    @Test
    void testQuitAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        QuitAction quitAction = applicationConfiguration.quitAction();
        assertEquals(jTailMainModel(), quitAction.getJTailMainModel());
    }

    /**
    * Test method for {@link ApplicationConfiguration#highlightAction()}.
    */
    @Test
    void testHighlightAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertEquals(jTailMainModel(), highlightAction.getJTailMainModel());
    }

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainFrame()}.
    */
    @Test
    void testJTailMainFrame() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        assertEquals(jTailMainModel(), jTailMainFrame.getJTailMainModel());
        assertEquals(fileMenuAction(), jTailMainFrame.getFileMenuAction());
        assertEquals(openAction(), jTailMainFrame.getOpenAction());
        assertEquals(closeAction(), jTailMainFrame.getCloseAction());
        assertEquals(closeAllAction(), jTailMainFrame.getCloseAllAction());
        assertEquals(quitAction(), jTailMainFrame.getQuitAction());
        assertEquals(toolsMenuAction(), jTailMainFrame.getToolsMenuAction());
        assertEquals(highlightAction(), jTailMainFrame.getHighlightAction());
    }

    /**
    * Test method for {@link ApplicationConfiguration#openFileDialog()}.
    */
    @Test
    void testOpenFileDialog() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
        assertEquals(openFileModel(), openFileDialog.getOpenFileModel());
        assertEquals(chooseFileAction(), openFileDialog.getChooseFileAction());
        assertEquals(selectIndexTypeListener(), openFileDialog.getSelectIndexTypeListener());
        assertEquals(indexFileAction(), openFileDialog.getIndexFileAction());
    }
    // @see http://static.springsource.org/spring/docs/3.0.0.M3/spring-framework-reference/html/ch04s12.html
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
		
    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#jTailMainModel()}.
    */
    @Test
    void testJTailMainModel() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
        assertEquals(bundle.getString("action.file.label"), jTailMainModel.getBundle().getString("action.file.label"));
        assertEquals(bundle.getString("action.file.mnemonic"), jTailMainModel.getBundle().getString("action.file.mnemonic"));
    }

    /**
    * Test method for {@link ApplicationConfiguration#openFileModel()}.
    */
    @Test
    void testOpenFileModel() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileModel openFileModel = applicationConfiguration.openFileModel();
        assertEquals(bundle.getString("action.file.label"), openFileModel.getBundle().getString("action.file.label"));
        assertEquals(bundle.getString("action.file.mnemonic"), openFileModel.getBundle().getString("action.file.mnemonic"));
    }

    /**
    * Test method for {@link ApplicationConfiguration#fileMenuAction()}.
    */
    @Test
    void testFileMenuAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction fileMenuAction = applicationConfiguration.fileMenuAction();
        assertEquals(bundle.getString("action.file.label"), fileMenuAction.getLabel());
        assertEquals(bundle.getString("action.file.mnemonic"), fileMenuAction.getMnemonic());
    }

    /**
    * Test method for {@link ApplicationConfiguration#toolsMenuAction()}.
    */
    @Test
    void testToolsMenuAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        MenuAction toolsMenuAction = applicationConfiguration.toolsMenuAction();
        assertEquals(bundle.getString("action.tools.label"), toolsMenuAction.getLabel());
        assertEquals(bundle.getString("action.tools.mnemonic"), toolsMenuAction.getMnemonic());
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(openFileModel(), chooseFileAction.getOpenFileModel());
    }

    /**
    * Test method for {@link ApplicationConfiguration#