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

    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#highlightAction()}.
    */
    @Test
    void testHighlightAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertNotNull(highlightAction);
        assertEquals(bundle.getString("action.highlight.label"), highlightAction.getLabel());
        assertEquals(bundle.getString("action.highlight.mnemonic"), highlightAction.getMnemonic());
        assertEquals(highlightAction, applicationConfiguration.highlightAction());
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#indexFileAction()} method.
*/
class ApplicationConfiguration_12Test {
		
    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#indexFileAction()}.
    */
    @Test
    void testIndexFileAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
        assertNotNull(indexFileAction);
        assertEquals(bundle.getString("action.index.label"), indexFileAction.getLabel());
        assertEquals(bundle.getString("action.index.mnemonic"), indexFileAction.getMnemonic());
        assertEquals(indexFileAction, applicationConfiguration.indexFileAction());
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openFileDialog()} method.
*/
class ApplicationConfiguration_13Test {
		
    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#openFileDialog()}.
    */
    @Test
    void testOpenFileDialog() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
        assertNotNull(openFileDialog);
        assertEquals(bundle.getString("action.open.label"), openFileDialog.getLabel());
        assertEquals(bundle.getString("action.open.mnemonic"), openFileDialog.getMnemonic());
        assertEquals(openFileDialog, applicationConfiguration.openFileDialog());
    }
}

// ApplicationConfiguration_14Test.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_14Test {
		
    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#openAction()}.
    */
    @Test
    void testOpenAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileAction openAction = applicationConfiguration.openAction();
        assertNotNull(openAction);
        assertEquals(bundle.getString("action.open.label"), openAction.getLabel());
        assertEquals(bundle.getString("action.open.mnemonic"), openAction.getMnemonic());
        assertEquals(openAction, applicationConfiguration.openAction());
    }
}

// ApplicationConfiguration_15Test.java
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
class ApplicationConfiguration_15Test {
		
    protected static final ResourceBundle //NON-NLS
    bundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.language");

    /**
    * Test method for {@link ApplicationConfiguration#closeAllAction()}.
    */
    @Test
    void testCloseAllAction() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
        assertNotNull(closeAllAction);
        assertEquals(bundle.getString("action.closeall.label"), closeAllAction.getLabel());
        assertEquals(bundle.getString("action.closeall.mnemonic"), closeAllAction.getMnemonic());
        assertEquals(closeAllAction, applicationConfiguration.closeAllAction());
    }
}

// ApplicationConfiguration_16Test.java
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
import