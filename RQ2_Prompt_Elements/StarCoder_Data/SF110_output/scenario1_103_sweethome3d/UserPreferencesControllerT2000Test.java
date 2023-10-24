// UserPreferencesControllerTest.java
package com.eteks.sweethome3d.viewcontroller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UserPreferencesController}.
* It contains ten unit test cases for the {@link UserPreferencesController#mayImportLanguageLibrary()} method.
*/
class UserPreferencesControllerTest {

    @Test
    void testMayImportLanguageLibrary() {
        UserPreferencesController userPreferencesController = new UserPreferencesController();
        userPreferencesController.setHomeController(null);
        assertFalse(userPreferencesController.mayImportLanguageLibrary());
        userPreferencesController.setHomeController(new HomeController());
        assertTrue(userPreferencesController.mayImportLanguageLibrary());
    }
}

// UserPreferencesView.java
package com.eteks.sweethome3d.viewcontroller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;

/**
 * A MVC view for user preferences.
 * @author <NAME>
 */
public class UserPreferencesView extends UserPreferencesController {

    public boolean mayImportLanguageLibrary() {
        return this.homeController != null;
    }
}

// UserPreferencesViewTest.java
package com.eteks.sweethome3d.viewcontroller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UserPreferencesView}.
* It contains ten unit test cases for the {@link UserPreferencesView#mayImportLanguageLibrary()} method.
*/
class UserPreferencesViewTest {
		
    @Test
    void testMayImportLanguageLibrary() {
        UserPreferencesView userPreferencesView = new UserPreferencesView();
        userPreferencesView.setHomeController(null);
        assertFalse(userPreferencesView.mayImportLanguageLibrary());
        userPreferencesView.setHomeController(new HomeController());
        assertTrue(userPreferencesView.mayImportLanguageLibrary());
    }
}

// UserPreferences.java
package com.eteks.sweethome3d.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.util.prefs.Preferences;

/**
 * User preferences.
 * @author <NAME>
 */
public class UserPreferences implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final String LANGUAGE_LIBRARY_FILE_NAME = "languageLibrary.ser";

    private static final String LANGUAGE_LIBRARY_FILE_PATH = "languageLibrary";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_SEPARATOR = "/";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_EXTENSION = ".properties";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REGEX = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REGEX = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REGEX = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = " ";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REGEX = "_";

    private static final String LANGUAGE_LIBRARY_FILE_PATH_LANGUAGE_SEPARATOR_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACEMENT_REPLACE