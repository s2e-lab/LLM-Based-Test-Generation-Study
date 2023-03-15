// FollowAppAttributes_0Test.java
package ghm.follow.config;

import ghm.follow.FollowApp;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FollowAppAttributes}.
* It contains ten unit test cases for the {@link FollowAppAttributes#followedFileListContains(File)} method.
*/
class FollowAppAttributes_0Test {

		private static final Logger log = Logger.getLogger(FollowAppAttributes_0Test.class.getName());
		
		private EnumeratedProperties properties;
		
		private EnumeratedProperties defaultProperties;
		
		private FollowAppAttributes defaultAttributes;
		
		static final String userHome = System.getProperty("user.home");
		
		public static final String PROPERTY_FILE_NAME = ".followApp.properties";
		
		static final String defaultPropertyFileName = userHome + FollowApp.FILE_SEPARATOR + PROPERTY_FILE_NAME;
		
		private File propertyFile;
		
		public static final String PROPERTY_PROTOTYPE_FILE_NAME = "followApp.properties.prototype";
		
		public static final int BUFFER_SIZE = 32768;
		
		public static final String HEIGHT_KEY = "height";
		
		public static final String WIDTH_KEY = "width";
		
		public static final String X_KEY = "x";
		
		public static final String Y_KEY = "y";
		
		public static final String FOLLOWED_FILES_KEY = "followedFiles";
		
		public static final String TAB_PLACEMENT_KEY = "tabs.placement";
		
		public static final String SELECTED_TAB_INDEX_KEY = "tabs.selectedIndex";
		
		public static final String LAST_FILE_CHOOSER_DIR_KEY = "fileChooser.lastDir";
		
		public static final String BUFFER_SIZE_KEY = "bufferSize";
		
		public static final String LATENCY_KEY = "latency";
		
		public static final String ATTRIBUTES_VERSION_KEY = "attributesVersion";
		
		public static final String FONT_FAMILY_KEY = "fontFamily";
		
		public static final String FONT_STYLE_KEY = "fontStyle";
		
		public static final String FONT_SIZE_KEY = "fontSize";
		
		public static final String CONFIRM_DELETE_KEY = "confirmDelete";
		
		public static final String CONFIRM_DELETE_ALL_KEY = "confirmDeleteAll";
		
		public static final String AUTO_SCROLL_KEY = "autoScroll";
		
		public static final String EDITOR_KEY = "editor";
		
		public static final String TAB_SIZE_KEY = "tabSize";
		
		public static final String RECENT_FILES_MAX_KEY = "recentFilesMax";
		
		public static final String RECENT_FILES_KEY = "recentFiles";
		
		// Versions
		public static final int UNVERSIONED = 0;
		
		public static final int v1_1 = 1;
		
		public static final int v1_2 = 2;
		
		public static final int v1_3 = 3;
		
		public static final int v1_3_2 = 4;
		
		public static final int v1_4 = 5;
		
		public static final int v1_5_0 = 6;
		
		public static final int v1_6_0 = 7;
		
		private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
		
		public FollowAppAttributes() throws IOException {
				// have to cast null so that the constructor call isn't ambiguous
				this((File) null);
		}
		
		public FollowAppAttributes(File exitingPropertyFile) throws IOException {
				if (exitingPropertyFile != null) {
						propertyFile = exitingPropertyFile;
				} else {
						propertyFile = new File(defaultPropertyFileName);
				}
				if (!(propertyFile.exists())) {
						// If the property file doesn't exist, we create a default property
						// file using a prototype property file stored somewhere on the
						// classpath
						log.info("No property file for the Follow application is present; creating " + propertyFile.getAbsolutePath() + " (with default values) ...");
						properties = (EnumeratedProperties) getDefaultProperties().clone();
						log.info("... property file created successfully.");
				} else {
						properties = new EnumeratedProperties();
						FileInputStream fis = new FileInputStream(propertyFile);
						properties.load(fis);
						switch(getAttributesVersion()) {
								case UNVERSIONED:
										// Migrate unversioned attributes to 1.1 attributes
										log.info("Migrating pre-v1.1 properties to v1.1.");
										setAttributesVersion(v1_1);
										setTabPlacement(getDefaultAttributes().getTabPlacement());
								case v1_1:
										// Migrate 1.1 attributes to 1.2 attributes
										log.info("Migrating v1.1 properties to v1.2.");
										setAttributesVersion(v1_2);
										setFont(getDefaultAttributes().getFont());
								case v1_2:
										// Migrate 1.2 attributes to 1.3 attributes
										log.info("Migrating v1.2 properties to v1.3.");
										setAttributesVersion(v1_3);
										setConfirmDelete(true);
										setConfirmDeleteAll(true);
										// Additionally, it is necessary to warn the user about the changes to
										// Clear and ClearAll and the introduction of Delete and DeleteAll
										JOptionPane.showMessageDialog(null, FollowApp.getResourceString("v1.3.warning.text"), FollowApp.getResourceString("v1.3.warning.title"), JOptionPane.WARNING_MESSAGE);
								case v1_3:
								case v1_3_2:
										// Migrate 1.3 attributes to 1.4 attributes
										log.info("Migrating v1.3 properties to v1.4.");
										setAttributesVersion(v1_4);
										setAutoScroll(true);
										// Inform the user of the new AutoScroll feature
										JOptionPane.showMessageDialog(null, FollowApp.getResourceString("v1.4.info.text"), FollowApp.getResourceString("v1.4.info.title"), JOptionPane.INFORMATION_MESSAGE);
								case v1_4:
										// Migrate 1.4 attributes to 1.5 attributes
										log.info("Migrating v1.4 properties to v.1.5.");
										setAttributesVersion(v1_5_0);
										setTabSize(4);
								case v1_5_0:
