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

    /**
     * Creates a view for user preferences.
     */
    public UserPreferencesView() {
        // Empty
    }

    /**
     * Returns <code>true</code> if language libraries can be imported.
     */
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
		
    /**
     * Test case for the {@link UserPreferencesView#mayImportLanguageLibrary()} method.
     */
    @Test
    void testMayImportLanguageLibrary() {
        UserPreferencesView userPreferencesView = new UserPreferencesView();
        userPreferencesView.setHomeController(null);
        assertFalse(userPreferencesView.mayImportLanguageLibrary());
        userPreferencesView.setHomeController(new HomeController());
        assertTrue(userPreferencesView.mayImportLanguageLibrary());
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

    /**
     * Returns <code>true</code> if language libraries can be imported.
     */
    public boolean mayImportLanguageLibrary() {
        return this.homeController != null;
    }
}

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

    /**
     * Creates a view for user preferences.
     */
    public UserPreferencesView() {
        // Empty
    }

    /**
     * Returns <code>true</code> if language libraries can be imported.
     */
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
		
    /**
     * Test case for the {@link UserPreferencesView#mayImportLanguageLibrary()} method.
     */
    @Test
    void testMayImportLanguageLibrary() {
        UserPreferencesView userPreferencesView = new UserPreferencesView();
        userPreferencesView.setHomeController(null);
        assertFalse(userPreferencesView.mayImportLanguageLibrary());
        userPreferencesView.setHomeController(new HomeController());
        assertTrue(userPreferencesView.mayImportLanguageLibrary());
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

    /**
     * Returns <code>true</code> if language libraries can be imported.
     */
    public boolean mayImportLanguageLibrary() {
        return this.homeController != null;
    }
}

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
import com.et