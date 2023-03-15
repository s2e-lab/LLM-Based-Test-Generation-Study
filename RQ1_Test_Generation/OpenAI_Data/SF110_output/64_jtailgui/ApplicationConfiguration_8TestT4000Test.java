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

	@Test
	void closeAction_should_return_a_new_instance_of_CloseAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNotNull(closeAction);
	}
	
	@Test
	void closeAction_should_return_a_singleton_instance_of_CloseAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_non_null_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNotNull(closeAction.getModel());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertSame(closeAction1.getModel(), closeAction2.getModel());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_jTailMainFrame() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertSame(closeAction.getModel(), jTailMainFrame.getModel());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_jTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertSame(closeAction.getModel(), jTailMainModel);
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_openFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		OpenFileModel openFileModel = applicationConfiguration.openFileModel();
		
		// Then
		assertSame(closeAction.getModel(), openFileModel);
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_openFileDialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertSame(closeAction.getModel(), openFileDialog.getModel());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_chooseFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertSame(closeAction.getModel(), chooseFileAction.getModel());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_selectIndexTypeListener() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
		
		// Then
		assertSame(closeAction.getModel(), selectIndexTypeListener.getModel());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_indexFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertSame(closeAction.getModel(), indexFileAction.getModel());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_openAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		OpenFileAction openAction = applicationConfiguration.openAction();
		
		// Then
		assertSame(closeAction.getModel(), openAction.getModel());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_closeAllAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertSame(closeAction.getModel(), closeAllAction.getModel());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_quitAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		QuitAction quitAction = applicationConfiguration.quitAction();
		
		// Then
		assertSame(closeAction.getModel(), quitAction.getModel());
	}
	
	@Test
	void closeAction_should_return_a_CloseAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_highlightAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		HighlightAction highlightAction = applicationConfiguration.highlightAction();
		
		// Then
		assertSame(closeAction.getModel(), highlightAction.getModel());
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAllAction()} method.
*/
class ApplicationConfiguration_9Test {
		
	@Test
	void closeAllAction_should_return_a_new_instance_of_CloseAllAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction);
	}
	
	@Test
	void closeAllAction_should_return_a_singleton_instance_of_CloseAllAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertSame(closeAllAction1, closeAllAction2);
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_non_null_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		
		// Then
		assertNotNull(closeAllAction.getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_singleton() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction1 = applicationConfiguration.closeAllAction();
		CloseAllAction closeAllAction2 = applicationConfiguration.closeAllAction();
		
		// Then
		assertSame(closeAllAction1.getModel(), closeAllAction2.getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_jTailMainFrame() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertSame(closeAllAction.getModel(), jTailMainFrame.getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_jTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// Then
		assertSame(closeAllAction.getModel(), jTailMainModel);
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_openFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		OpenFileModel openFileModel = applicationConfiguration.openFileModel();
		
		// Then
		assertSame(closeAllAction.getModel(), openFileModel);
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_openFileDialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertSame(closeAllAction.getModel(), openFileDialog.getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_chooseFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		ChooseFileAction chooseFileAction = applicationConfiguration.chooseFileAction();
		
		// Then
		assertSame(closeAllAction.getModel(), chooseFileAction.getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_selectIndexTypeListener() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		SelectIndexTypeListener selectIndexTypeListener = applicationConfiguration.selectIndexTypeListener();
		
		// Then
		assertSame(closeAllAction.getModel(), selectIndexTypeListener.getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_indexFileAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		IndexFileAction indexFileAction = applicationConfiguration.indexFileAction();
		
		// Then
		assertSame(closeAllAction.getModel(), indexFileAction.getModel());
	}
	
	@Test
	void closeAllAction_should_return_a_CloseAllAction_with_a_model_that_is_a_singleton_and_is_the_same_as_the_model_of_the_openAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAllAction closeAllAction = applicationConfiguration.closeAllAction();
		OpenFileAction openAction = applicationConfiguration.openAction();
		
		// Then
		assertSame(closeAllAction.getModel(), openAction.getModel());
	}
	
