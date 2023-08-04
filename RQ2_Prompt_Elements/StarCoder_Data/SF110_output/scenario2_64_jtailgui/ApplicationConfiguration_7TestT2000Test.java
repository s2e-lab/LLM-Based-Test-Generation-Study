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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_7Test {

    /**
     * Test case for the {@link ApplicationConfiguration#openAction()} method.
     * It tests the {@link OpenFileAction#actionPerformed(java.awt.event.ActionEvent)} method.
     */
    @Test
    void openAction_actionPerformed() {
        // Arrange
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileAction openFileAction = applicationConfiguration.openAction();
        OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
        OpenFileModel openFileModel = applicationConfiguration.openFileModel();
        JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        // Act
        openFileAction.actionPerformed(null);
        // Assert
        assertEquals(openFileDialog, openFileAction.getOpenFileDialog());
        assertEquals(openFileModel, openFileAction.getOpenFileModel());
        assertEquals(jTailMainModel, openFileAction.getJTailMainModel());
        assertEquals(jTailMainFrame, openFileAction.getJTailMainFrame());
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_8Test {
		
    /**
     * Test case for the {@link ApplicationConfiguration#openAction()} method.
     * It tests the {@link OpenFileAction#actionPerformed(java.awt.event.ActionEvent)} method.
     */
    @Test
    void openAction_actionPerformed() {
        // Arrange
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileAction openFileAction = applicationConfiguration.openAction();
        OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
        OpenFileModel openFileModel = applicationConfiguration.openFileModel();
        JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        // Act
        openFileAction.actionPerformed(null);
        // Assert
        assertEquals(openFileDialog, openFileAction.getOpenFileDialog());
        assertEquals(openFileModel, openFileAction.getOpenFileModel());
        assertEquals(jTailMainModel, openFileAction.getJTailMainModel());
        assertEquals(jTailMainFrame, openFileAction.getJTailMainFrame());
    }
}

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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_9Test {
		
    /**
     * Test case for the {@link ApplicationConfiguration#openAction()} method.
     * It tests the {@link OpenFileAction#actionPerformed(java.awt.event.ActionEvent)} method.
     */
    @Test
    void openAction_actionPerformed() {
        // Arrange
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileAction openFileAction = applicationConfiguration.openAction();
        OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
        OpenFileModel openFileModel = applicationConfiguration.openFileModel();
        JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        // Act
        openFileAction.actionPerformed(null);
        // Assert
        assertEquals(openFileDialog, openFileAction.getOpenFileDialog());
        assertEquals(openFileModel, openFileAction.getOpenFileModel());
        assertEquals(jTailMainModel, openFileAction.getJTailMainModel());
        assertEquals(jTailMainFrame, openFileAction.getJTailMainFrame());
    }
}

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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openAction()} method.
*/
class ApplicationConfiguration_10Test {
		
    /**
     * Test case for the {@link ApplicationConfiguration#openAction()} method.
     * It tests the {@link OpenFileAction#actionPerformed(java.awt.event.ActionEvent)} method.
     */
    @Test
    void openAction_actionPerformed() {
        // Arrange
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        OpenFileAction openFileAction = applicationConfiguration.openAction();
        OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
        OpenFileModel openFileModel = applicationConfiguration.openFileModel();
        JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
        JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
        // Act
        openFileAction.actionPerformed(null);
        // Assert
        assertEquals(openFileDialog, openFileAction.getOpenFileDialog());
        assertEquals(openFileModel, openFileAction.getOpenFileModel());
        assertEquals(jTailMainModel, openFileAction.getJTailMainModel());
        assertEquals(jTailMainFrame, openFileAction.getJTailMainFrame());
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#open