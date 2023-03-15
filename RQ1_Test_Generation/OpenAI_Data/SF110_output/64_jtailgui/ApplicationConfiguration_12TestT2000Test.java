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
* It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainFrame()} method.
*/
class ApplicationConfiguration_12Test {

	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame);
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_non_null_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getModel());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_non_null_file_menu_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getFileMenuAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_non_null_open_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getOpenAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_non_null_close_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getCloseAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_non_null_close_all_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getCloseAllAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_non_null_quit_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getQuitAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_non_null_tools_menu_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getToolsMenuAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_non_null_highlight_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getHighlightAction());
	}
	
	@Test
	void test_jTailMainFrame_should_return_a_new_JTailMainFrame_instance_with_a_non_null_open_file_dialog() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		JTailMainFrame jTailMainFrame = applicationConfiguration.jTailMainFrame();
		
		// Then
		assertNotNull(jTailMainFrame.getOpenFileDialog());
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
		
	@Test
	void test_openFileDialog_should_return_a_new_OpenFileDialog_instance() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_OpenFileDialog_instance_with_a_non_null_model() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog.getModel());
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_OpenFileDialog_instance_with_a_non_null_choose_file_action() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog.getChooseFileAction());
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_OpenFileDialog_instance_with_a_non_null_select_index_type_listener() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog.getSelectIndexTypeListener());
	}
	
	@Test
	void test_openFileDialog_should_return_a_new_OpenFileDialog_instance_with_a_non_null_index_file_action() {
		