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
	void closeAction_should_return_a_new_instance_of_CloseAction_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_instance_of_CloseAction_each_time_it_is_called_even_if_the_underlying_JTailMainModel_is_the_same() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_instance_of_CloseAction_each_time_it_is_called_even_if_the_underlying_JTailMainModel_is_the_same_and_the_same_instance_is_used_to_create_the_CloseAction() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_instance_of_CloseAction_each_time_it_is_called_even_if_the_underlying_JTailMainModel_is_the_same_and_the_same_instance_is_used_to_create_the_CloseAction_and_the_CloseAction_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_instance_of_CloseAction_each_time_it_is_called_even_if_the_underlying_JTailMainModel_is_the_same_and_the_same_instance_is_used_to_create_the_CloseAction_and_the_CloseAction_is_called_and_the_JTailMainModel_is_modified() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		jTailMainModel.setFileName("fileName");
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_instance_of_CloseAction_each_time_it_is_called_even_if_the_underlying_JTailMainModel_is_the_same_and_the_same_instance_is_used_to_create_the_CloseAction_and_the_CloseAction_is_called_and_the_JTailMainModel_is_modified_and_the_CloseAction_is_called_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		jTailMainModel.setFileName("fileName");
		closeAction2.actionPerformed(null);
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_instance_of_CloseAction_each_time_it_is_called_even_if_the_underlying_JTailMainModel_is_the_same_and_the_same_instance_is_used_to_create_the_CloseAction_and_the_CloseAction_is_called_and_the_JTailMainModel_is_modified_and_the_CloseAction_is_called_again_and_the_JTailMainModel_is_modified_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		jTailMainModel.setFileName("fileName");
		closeAction2.actionPerformed(null);
		jTailMainModel.setFileName("fileName2");
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_instance_of_CloseAction_each_time_it_is_called_even_if_the_underlying_JTailMainModel_is_the_same_and_the_same_instance_is_used_to_create_the_CloseAction_and_the_CloseAction_is_called_and_the_JTailMainModel_is_modified_and_the_CloseAction_is_called_again_and_the_JTailMainModel_is_modified_again_and_the_CloseAction_is_called_again() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		JTailMainModel jTailMainModel = applicationConfiguration.jTailMainModel();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		closeAction1.actionPerformed(null);
		jTailMainModel.setFileName("fileName");
		closeAction2.actionPerformed(null);
		jTailMainModel.setFileName("fileName2");
		closeAction1.actionPerformed(null);
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void closeAction_should_return_a_new_instance_of_CloseAction_each_time_it_is_called_even_if_the_underlying_JTailMainModel_is_the_same_and_the_same_instance_is_used_to_create_the_CloseAction_and_the_CloseAction_is_called_and_the_JTailMainModel_is_modified_and_the_CloseAction_is_called_again_and