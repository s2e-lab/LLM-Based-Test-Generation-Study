// OperatingSystem_1Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#isWindows()} method.
*/
class OperatingSystem_1Test {

    /**
    * Test method for {@link OperatingSystem#isWindows()}.
    */
    @Test
    void testIsWindows() {
        // Test case 1
        assertTrue(OperatingSystem.isWindows());
    }
}

// OperatingSystem_2Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#isLinux()} method.
*/
class OperatingSystem_2Test {
		
    /**
    * Test method for {@link OperatingSystem#isLinux()}.
    */
    @Test
    void testIsLinux() {
        // Test case 1
        assertTrue(OperatingSystem.isLinux());
    }
}

// OperatingSystem_3Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#isMacOSX()} method.
*/
class OperatingSystem_3Test {
		
    /**
    * Test method for {@link OperatingSystem#isMacOSX()}.
    */
    @Test
    void testIsMacOSX() {
        // Test case 1
        assertTrue(OperatingSystem.isMacOSX());
    }
}

// OperatingSystem_4Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
*/
class OperatingSystem_4Test {
		
    /**
    * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
    */
    @Test
    void testIsMacOSXLeopardOrSuperior() {
        // Test case 1
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }
}

// OperatingSystem_5Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#createTemporaryFile(String, String) createTemporaryFile} method.
*/
class OperatingSystem_5Test {
		
    /**
    * Test method for {@link OperatingSystem#createTemporaryFile(String, String)}.
    */
    @Test
    void testCreateTemporaryFile() throws IOException {
        // Test case 1
        File file = OperatingSystem.createTemporaryFile("test", ".tmp");
        assertTrue(file.exists());
        assertTrue(file.delete());
    }
}

// OperatingSystem_6Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#deleteTemporaryFiles()} method.
*/
class OperatingSystem_6Test {
		
    /**
    * Test method for {@link OperatingSystem#deleteTemporaryFiles()}.
    */
    @Test
    void testDeleteTemporaryFiles() throws IOException {
        // Test case 1
        File file = OperatingSystem.createTemporaryFile("test", ".tmp");
        assertTrue(file.exists());
        OperatingSystem.deleteTemporaryFiles();
        assertFalse(file.exists());
    }
}

// OperatingSystem_7Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultTemporaryFolder(boolean) getDefaultTemporaryFolder} method.
*/
class OperatingSystem_7Test {
		
    /**
    * Test method for {@link OperatingSystem#getDefaultTemporaryFolder(boolean)}.
    */
    @Test
    void testGetDefaultTemporaryFolder() throws IOException {
        // Test case 1
        File temporaryFolder = OperatingSystem.getDefaultTemporaryFolder(true);
        assertTrue(temporaryFolder.exists());
        assertTrue(temporaryFolder.isDirectory());
        assertTrue(temporaryFolder.canWrite());
        assertTrue(temporaryFolder.canRead());
        assertTrue(temporaryFolder.canExecute());
        assertTrue(temporaryFolder.delete());
    }
}

// OperatingSystem_8Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultApplicationFolder() getDefaultApplicationFolder} method.
*/
class OperatingSystem_8Test {
		
    /**
    * Test method for {@link OperatingSystem#getDefaultApplicationFolder()}.
    */
    @Test
    void testGetDefaultApplicationFolder() throws IOException {
        // Test case 1
        File applicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertTrue(applicationFolder.exists());
        assertTrue(applicationFolder.isDirectory());
        assertTrue(applicationFolder.canWrite());
        assertTrue(applicationFolder.canRead());
        assertTrue(