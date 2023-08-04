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

    /**
     * Test case for the {@link ApplicationConfiguration#chooseFileAction()} method.
     * It tests the {@link ChooseFileAction#actionPerformed(java.awt.event.ActionEvent)} method.
     */
    @Test
    void testChooseFileAction() {
        // Create the "choose a file" action that will be used by menus and buttons.
        ChooseFileAction chooseFileAction = new ChooseFileAction();
        // Create a mock JTailMainFrame.
        JTailMainFrame jTailMainFrame = new JTailMainFrame();
        // Create a mock OpenFileDialog.
        OpenFileDialog openFileDialog = new OpenFileDialog(jTailMainFrame);
        // Create a mock OpenFileModel.
        OpenFileModel openFileModel = new OpenFileModel();
        // Create a mock JTailMainModel.
        JTailMainModel jTailMainModel = new JTailMainModel();
        // Create a mock ResourceBundle.
        ResourceBundle resourceBundle = ResourceBundle.getBundle("fr.pingtimeout.jtail.gui.view.Bundle");
        // Create a mock SelectIndexTypeListener.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(jTailMainModel, openFileModel, resourceBundle);
        // Set the mock OpenFileDialog to the mock JTailMainFrame.
        jTailMainFrame.setOpenFileDialog(openFileDialog);
        // Set the mock OpenFileModel to the mock JTailMainFrame.
        jTailMainFrame.setOpenFileModel(openFileModel);
        // Set the mock JTailMainModel to the mock JTailMainFrame.
        jTailMainFrame.setJTailMainModel(jTailMainModel);
        // Set the mock ResourceBundle to the mock JTailMainFrame.
        jTailMainFrame.setResourceBundle(resourceBundle);
        // Set the mock SelectIndexTypeListener to the mock JTailMainFrame.
        jTailMainFrame.setSelectIndexTypeListener(selectIndexTypeListener);
        // Set the mock JTailMainFrame to the mock OpenFileDialog.
        openFileDialog.setJTailMainFrame(jTailMainFrame);
        // Set the mock JTailMainFrame to the mock OpenFileModel.
        openFileModel.setJTailMainFrame(jTailMainFrame);
        // Set the mock JTailMainFrame to the mock JTailMainModel.
        jTailMainModel.setJTailMainFrame(jTailMainFrame);
        // Set the mock JTailMainFrame to the mock ResourceBundle.
        resourceBundle.setJTailMainFrame(jTailMainFrame);
        // Set the mock JTailMainFrame to the mock SelectIndexTypeListener.
        selectIndexTypeListener.setJTailMainFrame(jTailMainFrame);
        // Call the "choose a file" action.
        chooseFileAction.actionPerformed(null);
        // Check that the mock OpenFileDialog was called.
        assertTrue(openFileDialog.isCalled());
    }
}
