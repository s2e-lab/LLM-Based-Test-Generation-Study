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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfiguration_8Test {

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_2() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_3() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_4() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_5() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_6() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_7() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_8() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_9() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_10() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_11() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_12() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_13() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_14() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_15() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_16() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_17() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It tests the {@link CloseAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAction_null_18() {
        // Arrange
        CloseAction closeAction = new CloseAction(jTailMainModel());
        // Act
        closeAction.actionPerformed(null);
        // Assert
        assertTrue(jTailMainModel().isClosed());
    }

    /**
    * Test case for the {@link ApplicationConfiguration#closeAction()} method.
    * It