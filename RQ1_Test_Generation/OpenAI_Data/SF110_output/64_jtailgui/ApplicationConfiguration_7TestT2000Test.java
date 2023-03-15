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

	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction = applicationConfiguration.openAction();
		
		// Then
		assertNotNull(openAction);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1, openAction2);
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_jTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction = applicationConfiguration.openAction();
		
		// Then
		assertNotNull(openAction.getJTailMainModel());
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_openFileModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction = applicationConfiguration.openAction();
		
		// Then
		assertNotNull(openAction.getOpenFileModel());
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_openFileDialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction = applicationConfiguration.openAction();
		
		// Then
		assertNotNull(openAction.getOpenFileDialog());
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_jTailMainModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1.getJTailMainModel(), openAction2.getJTailMainModel());
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_openFileModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1.getOpenFileModel(), openAction2.getOpenFileModel());
	}
	
	@Test
	void test_openAction_should_return_a_new_OpenFileAction_instance_with_a_non_null_openFileDialog_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileAction openAction1 = applicationConfiguration.openAction();
		OpenFileAction openAction2 = applicationConfiguration.openAction();
		
		// Then
		assertNotSame(openAction1.getOpenFileDialog(), openAction2.getOpenFileDialog());
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#closeAction()} method.
*/
class ApplicationConfiguration_8Test {
		
	@Test
	void test_closeAction_should_return_a_new_CloseAction_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNotNull(closeAction);
	}
	
	@Test
	void test_closeAction_should_return_a_new_CloseAction_instance_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1, closeAction2);
	}
	
	@Test
	void test_closeAction_should_return_a_new_CloseAction_instance_with_a_non_null_jTailMainModel() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction = applicationConfiguration.closeAction();
		
		// Then
		assertNotNull(closeAction.getJTailMainModel());
	}
	
	@Test
	void test_closeAction_should_return_a_new_CloseAction_instance_with_a_non_null_jTailMainModel_each_time_it_is_called() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		CloseAction closeAction1 = applicationConfiguration.closeAction();
		CloseAction closeAction2 = applicationConfiguration.closeAction();
		
		// Then
		assertNotSame(closeAction1.getJTailMainModel(), closeAction2.getJTailMainModel());
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
