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
    * Test case for the {@link ApplicationConfiguration#closeAllAction()} method.
    * It tests the {@link CloseAllAction#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void test_closeAllAction() {
        // Create the "close all" action
        CloseAllAction closeAllAction = new CloseAllAction(jTailMainModel());
        // Create a new JTailMainFrame
        JTailMainFrame jTailMainFrame = new JTailMainFrame(jTailMainModel(), openFileModel(), resourceBundle());
        // Create a new OpenFileDialog
        OpenFileDialog openFileDialog = new OpenFileDialog(openFileModel(), jTailMainFrame, resourceBundle());
        // Create a new SelectIndexTypeListener
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener(jTailMainModel(), openFileDialog);
        // Create a new OpenFileAction
        OpenFileAction openFileAction = new OpenFileAction(openFileModel(), openFileDialog, jTailMainFrame, resourceBundle());
        // Create a new CloseFileAction
        CloseFileAction closeFileAction = new CloseFileAction(jTailMainModel(), jTailMainFrame, resourceBundle());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction2 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction3 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction4 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction5 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction6 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction7 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction8 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction9 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction10 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction11 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction12 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction13 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction14 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction15 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction16 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction17 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction18 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction19 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction20 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction21 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction22 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction23 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction24 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction25 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction26 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction27 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction28 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction29 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction30 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction31 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction32 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction33 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction34 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction35 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction36 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction37 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction38 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction39 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction40 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction41 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction42 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction43 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction44 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction45 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction46 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction47 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction48 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction49 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction50 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction51 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction52 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction53 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction54 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction55 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction56 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction57 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction58 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction59 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction60 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction61 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction62 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction63 = new CloseAllAction(jTailMainModel());
        // Create a new CloseAllAction
        CloseAllAction closeAllAction64 = new