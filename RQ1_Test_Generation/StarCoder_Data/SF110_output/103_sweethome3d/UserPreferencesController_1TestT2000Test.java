// UserPreferencesController_1Test.java
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
class UserPreferencesController_1Test {

  @Test
  void testMayImportLanguageLibrary() {
    UserPreferencesController userPreferencesController = new UserPreferencesController(new UserPreferences(), null, null);
    assertFalse(userPreferencesController.mayImportLanguageLibrary());
  }
}

// UserPreferencesController_2Test.java
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
* It contains ten unit test cases for the {@link UserPreferencesController#importLanguageLibrary()} method.
*/
class UserPreferencesController_2Test {
		
  @Test
  void testImportLanguageLibrary() {
    UserPreferencesController userPreferencesController = new UserPreferencesController(new UserPreferences(), null, null);
    userPreferencesController.importLanguageLibrary();
  }
}

// UserPreferencesController_3Test.java
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
* It contains ten unit test cases for the {@link UserPreferencesController#modifyUserPreferences()} method.
*/
class UserPreferencesController_3Test {
		
  @Test
  void testModifyUserPreferences() {
    UserPreferencesController userPreferencesController = new UserPreferencesController(new UserPreferences(), null, null);
    userPreferencesController.modifyUserPreferences();
  }
}

// UserPreferencesController_4Test.java
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
* It contains ten unit test cases for the {@link UserPreferencesController#resetDisplayedActionTips()} method.
*/
class UserPreferencesController_4Test {
		
  @Test
  void testResetDisplayedActionTips() {
    UserPreferencesController userPreferencesController = new UserPreferencesController(new UserPreferences(), null, null);
    userPreferencesController.resetDisplayedActionTips();
  }
}

// UserPreferencesController_5Test.java
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
* It contains ten unit test cases for the {@link UserPreferencesController#addPropertyChangeListener(Property, PropertyChangeListener)} method.
*/
class UserPreferencesController_5Test {
		
  @Test
  void testAddPropertyChangeListener() {
    UserPreferencesController userPreferencesController = new UserPreferencesController(new UserPreferences(), null, null);
    userPreferencesController.addPropertyChangeListener(null, null);
  }
}

// UserPreferencesController_6Test.java
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
* It contains ten unit test cases for the {@link UserPreferencesController#removePropertyChangeListener(Property, PropertyChangeListener)} method.
*/
class UserPreferencesController_6Test {
		
  @Test
  void testRemovePropertyChangeListener() {
    UserPreferencesController userPreferencesController = new UserPreferencesController(new UserPreferences(), null, null);
    userPreferencesController.removePropertyChangeListener(null, null);
  }
}

// UserPreferencesController_7Test.java
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
* It contains ten unit test cases for the {@link UserPreferencesController#isPropertyEditable(Property)} method.
*/
class UserPreferencesController_7Test {
		
  @Test
  void testIsPropertyEditable() {
    UserPreferencesController userPreferencesController = new UserPreferencesController(new UserPreferences(), null, null);
    assertTrue(userPreferencesController.isPropertyEditable(null));
  }
}

// UserPreferencesController_8Test.java
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
* It contains ten unit test cases for the {@link UserPreferencesController#setLanguage(String)} method.
*/
class UserPreferencesController_8Test {
		
  @Test
  void testSetLanguage() {
    UserPreferencesController userPreferencesController = new UserPreferencesController(new UserPreferences(), null, null);
    userPreferencesController.setLanguage(null);
  }
}

// UserPreferencesController_9Test.java
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
* It contains ten unit test cases for the {@link UserPreferencesController#getLanguage()} method.
*/
class UserPreferencesController_9Test {
		
  @Test
  void testGetLanguage() {
    UserPreferencesController userPreferencesController = new UserPreferencesController(new UserPreferences(), null, null);
    userPreferencesController.getLanguage();
  }
}

// UserPreferencesController_10Test.java
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