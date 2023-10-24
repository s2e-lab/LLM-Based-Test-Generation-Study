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

    /**
     * Test case for the {@link UserPreferencesController#mayImportLanguageLibrary()} method.
     */
    @Test
    void testMayImportLanguageLibrary() {
        UserPreferencesController userPreferencesController = new UserPreferencesController();
        UserPreferences userPreferences = new UserPreferences();
        userPreferencesController.setUserPreferences(userPreferences);
        userPreferences.setLanguageLibrary(null);
        assertFalse(userPreferencesController.mayImportLanguageLibrary());
        userPreferences.setLanguageLibrary(new TextureImage(null, null));
        assertTrue(userPreferencesController.mayImportLanguageLibrary());
    }
}

// UserPreferencesController.java
package com.eteks.sweethome3d.viewcontroller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;

/**
 * A MVC controller for user preferences view.
 *
 * @author <NAME>
 */
public class UserPreferencesController implements Controller {

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private UserPreferences userPreferences;

    /**
     * Sets the user preferences edited by this controller.
     */
    public void setUserPreferences(UserPreferences userPreferences) {
        if (this.userPreferences != null) {
            this.userPreferences.removePropertyChangeListener(UserPreferences.Property.LANGUAGE_LIBRARY, languageLibraryChangeListener);
        }
        this.userPreferences = userPreferences;
        if (this.userPreferences != null) {
            this.userPreferences.addPropertyChangeListener(UserPreferences.Property.LANGUAGE_LIBRARY, languageLibraryChangeListener);
        }
    }

    /**
     * Returns <code>true</code> if language libraries can be imported.
     */
    public boolean mayImportLanguageLibrary() {
        return this.userPreferences != null 
            && this.userPreferences.getLanguageLibrary() != null;
    }

    /**
     * Adds the property change <code>listener</code> in parameter to this controller.
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Removes the property change <code>listener</code> in parameter from this controller.
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private final PropertyChangeListener languageLibraryChangeListener = new PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent ev) {
            propertyChangeSupport.firePropertyChange(UserPreferencesController.Property.LANGUAGE_LIBRARY.name(), null, null);
        }
    };
}

// UserPreferencesController.java
package com.eteks.sweethome3d.viewcontroller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;

/**
 * A MVC controller for user preferences view.
 *
 * @author <NAME>
 */
public class UserPreferencesController implements Controller {

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private UserPreferences userPreferences;

    /**
     * Sets the user preferences edited by this controller.
     */
    public void setUserPreferences(UserPreferences userPreferences) {
        if (this.userPreferences != null) {
            this.userPreferences.removePropertyChangeListener(UserPreferences.Property.LANGUAGE_LIBRARY, languageLibraryChangeListener);
        }
        this.userPreferences = userPreferences;
        if (this.userPreferences != null) {
            this.userPreferences.addPropertyChangeListener(UserPreferences.Property.LANGUAGE_LIBRARY, languageLibraryChangeListener);
        }
    }

    /**
     * Returns <code>true</code> if language libraries can be imported.
     */
    public boolean mayImportLanguageLibrary() {
        return this.userPreferences != null 
            && this.userPreferences.getLanguageLibrary() != null;
    }

    /**
     * Adds the property change <code>listener</code> in parameter to this controller.
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Removes the property change <code>listener</code> in parameter from this controller.
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private final PropertyChangeListener languageLibraryChangeListener = new PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent ev) {
            propertyChangeSupport.firePropertyChange(UserPreferencesController.Property.LANGUAGE_LIBRARY.name(), null, null);
        }
    };
}

// UserPreferencesController.java
package com.eteks.sweethome3d.viewcontroller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;

/**
 * A MVC controller for user preferences view.
 *
 * @author <NAME>
 */
public class UserPreferencesController implements Controller {

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private UserPreferences userPreferences;

    /**
     * Sets the user preferences edited by this controller.
     */
    public void setUserPreferences(UserPreferences userPreferences) {
        if (this.userPreferences != null) {
            this.userPreferences.removePropertyChangeListener(UserPreferences.Property.LANGUAGE_LIBRARY, languageLibraryChangeListener);
        }
        this.userPreferences = userPreferences;
        if (this.userPreferences != null) {
            this.userPreferences.addPropertyChangeListener(UserPreferences.Property.LANGUAGE_LIBRARY, languageLibraryChangeListener);
        }
    }

    /**
     * Returns <code>true</code> if language libraries can be imported.
     */
    public boolean mayImportLanguageLibrary() {
        return this.userPreferences != null 
            && this.userPreferences.getLanguageLibrary() != null;
    }

    /**
     * Adds the property change <code>listener</code> in parameter to this controller.
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Removes the property change <code>listener</code> in parameter from this controller.
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private final PropertyChangeListener languageLibraryChangeListener = new PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent ev) {
            propertyChangeSupport.firePropertyChange(UserPreferencesController.Property.LANGUAGE_LIBRARY.name(), null, null);
        }
    };
}

// UserPreferencesController.java
package com.eteks.sweethome3d.viewcontroller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;

/**
 * A MVC controller for user preferences view.
 *
 * @author <NAME>
 */
public class UserPreferencesController implements Controller {

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private UserPreferences userPreferences;

    /**
     * Sets the user preferences edited by this controller.
     */
    public void setUserPreferences(UserPreferences userPreferences) {
        if (this.userPreferences != null) {
            this.userPreferences.removePropertyChangeListener(UserPreferences.Property.LANGUAGE_LIBRARY, languageLibraryChangeListener);
        }
        this.userPreferences = userPreferences;
        if (this.userPreferences != null) {
            this.userPreferences.addPropertyChangeListener(UserPreferences.Property.LANGUAGE_LIBRARY, languageLibraryChangeListener);
        }
    }

    /**
     * Returns <code>true</code> if language libraries can be imported.
     */
    public boolean mayImportLanguageLibrary() {
        return this.userPreferences != null 
            && this.userPreferences.getLanguageLibrary() != null;
    }

    /**
     * Adds the property change <code>listener</code> in parameter to this controller.
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Removes the property change <code>listener</code> in parameter from this controller.
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private final PropertyChangeListener languageLibraryChangeListener = new PropertyChangeListener()