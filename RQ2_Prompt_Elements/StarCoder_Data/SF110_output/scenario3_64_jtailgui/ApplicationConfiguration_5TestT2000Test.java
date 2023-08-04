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

    /**
    * Test case for {@link ApplicationConfiguration#selectIndexTypeListener()}.
    * It tests the {@link SelectIndexTypeListener#actionPerformed(java.awt.event.ActionEvent)} method.
    */
    @Test
    void testSelectIndexTypeListener() {
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener = new SelectIndexTypeListener();
        // Create the "open file" action that will be used by menus and buttons.
        OpenFileAction openFileAction = new OpenFileAction();
        // Create the "open file" model that will be used by menus and buttons.
        OpenFileModel openFileModel = new OpenFileModel();
        // Create the "open file" dialog that will be used by menus and buttons.
        OpenFileDialog openFileDialog = new OpenFileDialog();
        // Create the "jtail main" model that will be used by menus and buttons.
        JTailMainModel jTailMainModel = new JTailMainModel();
        // Create the "jtail main" frame that will be used by menus and buttons.
        JTailMainFrame jTailMainFrame = new JTailMainFrame();
        // Create the "tail" action that will be used by menus and buttons.
        TailAction tailAction = new TailAction();
        // Create the "tail" model that will be used by menus and buttons.
        TailModel tailModel = new TailModel();
        // Create the "tail" dialog that will be used by menus and buttons.
        TailDialog tailDialog = new TailDialog();
        // Create the "stop" action that will be used by menus and buttons.
        StopAction stopAction = new StopAction();
        // Create the "stop" model that will be used by menus and buttons.
        StopModel stopModel = new StopModel();
        // Create the "stop" dialog that will be used by menus and buttons.
        StopDialog stopDialog = new StopDialog();
        // Create the "pause" action that will be used by menus and buttons.
        PauseAction pauseAction = new PauseAction();
        // Create the "pause" model that will be used by menus and buttons.
        PauseModel pauseModel = new PauseModel();
        // Create the "pause" dialog that will be used by menus and buttons.
        PauseDialog pauseDialog = new PauseDialog();
        // Create the "resume" action that will be used by menus and buttons.
        ResumeAction resumeAction = new ResumeAction();
        // Create the "resume" model that will be used by menus and buttons.
        ResumeModel resumeModel = new ResumeModel();
        // Create the "resume" dialog that will be used by menus and buttons.
        ResumeDialog resumeDialog = new ResumeDialog();
        // Create the "close" action that will be used by menus and buttons.
        CloseAction closeAction = new CloseAction();
        // Create the "close" model that will be used by menus and buttons.
        CloseModel closeModel = new CloseModel();
        // Create the "close" dialog that will be used by menus and buttons.
        CloseDialog closeDialog = new CloseDialog();
        // Create the "exit" action that will be used by menus and buttons.
        ExitAction exitAction = new ExitAction();
        // Create the "exit" model that will be used by menus and buttons.
        ExitModel exitModel = new ExitModel();
        // Create the "exit" dialog that will be used by menus and buttons.
        ExitDialog exitDialog = new ExitDialog();
        // Create the "about" action that will be used by menus and buttons.
        AboutAction aboutAction = new AboutAction();
        // Create the "about" model that will be used by menus and buttons.
        AboutModel aboutModel = new AboutModel();
        // Create the "about" dialog that will be used by menus and buttons.
        AboutDialog aboutDialog = new AboutDialog();
        // Create the "preferences" action that will be used by menus and buttons.
        PreferencesAction preferencesAction = new PreferencesAction();
        // Create the "preferences" model that will be used by menus and buttons.
        PreferencesModel preferencesModel = new PreferencesModel();
        // Create the "preferences" dialog that will be used by menus and buttons.
        PreferencesDialog preferencesDialog = new PreferencesDialog();
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener2 = new SelectIndexTypeListener();
        // Create the "select index type" model that will be used by menus and buttons.
        SelectIndexTypeModel selectIndexTypeModel = new SelectIndexTypeModel();
        // Create the "select index type" dialog that will be used by menus and buttons.
        SelectIndexTypeDialog selectIndexTypeDialog = new SelectIndexTypeDialog();
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener3 = new SelectIndexTypeListener();
        // Create the "select index type" model that will be used by menus and buttons.
        SelectIndexTypeModel selectIndexTypeModel2 = new SelectIndexTypeModel();
        // Create the "select index type" dialog that will be used by menus and buttons.
        SelectIndexTypeDialog selectIndexTypeDialog2 = new SelectIndexTypeDialog();
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener4 = new SelectIndexTypeListener();
        // Create the "select index type" model that will be used by menus and buttons.
        SelectIndexTypeModel selectIndexTypeModel3 = new SelectIndexTypeModel();
        // Create the "select index type" dialog that will be used by menus and buttons.
        SelectIndexTypeDialog selectIndexTypeDialog3 = new SelectIndexTypeDialog();
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener5 = new SelectIndexTypeListener();
        // Create the "select index type" model that will be used by menus and buttons.
        SelectIndexTypeModel selectIndexTypeModel4 = new SelectIndexTypeModel();
        // Create the "select index type" dialog that will be used by menus and buttons.
        SelectIndexTypeDialog selectIndexTypeDialog4 = new SelectIndexTypeDialog();
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener6 = new SelectIndexTypeListener();
        // Create the "select index type" model that will be used by menus and buttons.
        SelectIndexTypeModel selectIndexTypeModel5 = new SelectIndexTypeModel();
        // Create the "select index type" dialog that will be used by menus and buttons.
        SelectIndexTypeDialog selectIndexTypeDialog5 = new SelectIndexTypeDialog();
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener7 = new SelectIndexTypeListener();
        // Create the "select index type" model that will be used by menus and buttons.
        SelectIndexTypeModel selectIndexTypeModel6 = new SelectIndexTypeModel();
        // Create the "select index type" dialog that will be used by menus and buttons.
        SelectIndexTypeDialog selectIndexTypeDialog6 = new SelectIndexTypeDialog();
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener8 = new SelectIndexTypeListener();
        // Create the "select index type" model that will be used by menus and buttons.
        SelectIndexTypeModel selectIndexTypeModel7 = new SelectIndexTypeModel();
        // Create the "select index type" dialog that will be used by menus and buttons.
        SelectIndexTypeDialog selectIndexTypeDialog7 = new SelectIndexTypeDialog();
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener9 = new SelectIndexTypeListener();
        // Create the "select index type" model that will be used by menus and buttons.
        SelectIndexTypeModel selectIndexTypeModel8 = new SelectIndexTypeModel();
        // Create the "select index type" dialog that will be used by menus and buttons.
        SelectIndexTypeDialog selectIndexTypeDialog8 = new SelectIndexTypeDialog();
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener10 = new SelectIndexTypeListener();
        // Create the "select index type" model that will be used by menus and buttons.
        SelectIndexTypeModel selectIndexTypeModel9 = new SelectIndexTypeModel();
        // Create the "select index type" dialog that will be used by menus and buttons.
        SelectIndexTypeDialog selectIndexTypeDialog9 = new SelectIndexTypeDialog();
        // Create the "select index type" action that will be used by menus and buttons.
        SelectIndexTypeListener selectIndexTypeListener11 = new SelectIndexTypeListener();
        // Create the "select index type" model that will be used by menus and buttons.
        SelectIndexTypeModel selectIndexTypeModel10 = new SelectIndexTypeModel();
        // Create the "select index type" dialog that will be used by menus and buttons.
        SelectIndexTypeDialog selectIndexTypeDialog10 = new SelectIndexTypeDialog();
        // Create the "select index type" action that will be used by menus and buttons.