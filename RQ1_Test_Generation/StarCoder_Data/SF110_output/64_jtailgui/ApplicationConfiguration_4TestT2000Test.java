// ApplicationConfiguration_4Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#chooseFileAction()} method.
*/
class ApplicationConfiguration_4Test {

    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertNotNull(chooseFileAction);
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction_1() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(bundle.getString("action.file.chooseFile.label"), chooseFileAction.getText());
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction_2() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(bundle.getString("action.file.chooseFile.mnemonic"), chooseFileAction.getMnemonic());
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction_3() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(bundle.getString("action.file.chooseFile.tooltip"), chooseFileAction.getToolTip());
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction_4() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(bundle.getString("action.file.chooseFile.accelerator"), chooseFileAction.getAccelerator());
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction_5() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(bundle.getString("action.file.chooseFile.icon"), chooseFileAction.getIcon());
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction_6() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(bundle.getString("action.file.chooseFile.actionCommand"), chooseFileAction.getActionCommand());
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction_7() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(bundle.getString("action.file.chooseFile.actionListener"), chooseFileAction.getActionListeners().toString());
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction_8() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(bundle.getString("action.file.chooseFile.selected"), chooseFileAction.isSelected());
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction_9() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(bundle.getString("action.file.chooseFile.enabled"), chooseFileAction.isEnabled());
    }

    /**
    * Test method for {@link ApplicationConfiguration#chooseFileAction()}.
    */
    @Test
    void testChooseFileAction_10() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
        assertEquals(bundle.getString("action.file.chooseFile.visible"), chooseFileAction.isVisible());
    }
}

// ApplicationConfiguration_5Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#selectIndexTypeListener()} method.
*/
class ApplicationConfiguration_5Test {
		
    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void testSelectIndexTypeListener() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertNotNull(selectIndexTypeListener);
    }

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void testSelectIndexTypeListener_1() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertEquals(bundle.getString("action.file.selectIndexType.label"), selectIndexTypeListener.getText());
    }

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void testSelectIndexTypeListener_2() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertEquals(bundle.getString("action.file.selectIndexType.mnemonic"), selectIndexTypeListener.getMnemonic());
    }

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void testSelectIndexTypeListener_3() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertEquals(bundle.getString("action.file.selectIndexType.tooltip"), selectIndexTypeListener.getToolTip());
    }

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void testSelectIndexTypeListener_4() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertEquals(bundle.getString("action.file.selectIndexType.accelerator"), selectIndexTypeListener.getAccelerator());
    }

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void testSelectIndexTypeListener_5() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertEquals(bundle.getString("action.file.selectIndexType.icon"), selectIndexTypeListener.getIcon());
    }

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void testSelectIndexTypeListener_6() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertEquals(bundle.getString("action.file.selectIndexType.actionCommand"), selectIndexTypeListener.getActionCommand());
    }

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void testSelectIndexTypeListener_7() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertEquals(bundle.getString("action.file.selectIndexType.actionListener"), selectIndexTypeListener.getActionListeners().toString());
    }

    /**
    * Test method for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    */
    @Test
    void testSelectIndexTypeListener_8() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
        assertEquals(bundle.getString("action.file.selectIndexType.selected"), selectIndexTypeListener.isSelected());
    }

    /**
    * Test method for {@