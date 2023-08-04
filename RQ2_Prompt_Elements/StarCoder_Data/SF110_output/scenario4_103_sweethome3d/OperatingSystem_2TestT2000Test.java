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
* It contains ten unit test cases for the {@link OperatingSystem#isMacOSX()} method.
*/
class OperatingSystem_2Test {

    /**
    * Test method for {@link OperatingSystem#isMacOSX()}.
    */
    @Test
    void testIsMacOSX() {
        // Test if the method returns true if the operating system is Mac OS X
        assertTrue(OperatingSystem.isMacOSX());
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
* It contains ten unit test cases for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
*/
class OperatingSystem_3Test {
		
    /**
    * Test method for {@link OperatingSystem#isMacOSXLeopardOrSuperior()}.
    */
    @Test
    void testIsMacOSXLeopardOrSuperior() {
        // Test if the method returns true if the operating system is Mac OS X 10.5 or superior
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
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
* It contains ten unit test cases for the {@link OperatingSystem#isLinux()} method.
*/
class OperatingSystem_4Test {
		
    /**
    * Test method for {@link OperatingSystem#isLinux()}.
    */
    @Test
    void testIsLinux() {
        // Test if the method returns true if the operating system is Linux
        assertTrue(OperatingSystem.isLinux());
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
* It contains ten unit test cases for the {@link OperatingSystem#isWindows()} method.
*/
class OperatingSystem_5Test {
		
    /**
    * Test method for {@link OperatingSystem#isWindows()}.
    */
    @Test
    void testIsWindows() {
        // Test if the method returns true if the operating system is Windows
        assertTrue(OperatingSystem.isWindows());
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
* It contains ten unit test cases for the {@link OperatingSystem#createTemporaryFile(String, String)} method.
*/
class OperatingSystem_6Test {
		
    /**
    * Test method for {@link OperatingSystem#createTemporaryFile(String, String)}.
    */
    @Test
    void testCreateTemporaryFile() {
        // Test if the method returns a temporary file that will be deleted when JVM will exit
        try {
            File temporaryFile = OperatingSystem.createTemporaryFile("test", ".tmp");
            assertTrue(temporaryFile.exists());
            temporaryFile.delete();
        } catch (IOException ex) {
            fail("Couldn't create temporary file");
        }
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
* It contains ten unit test cases for the {@link OperatingSystem#deleteTemporaryFiles()} method.
*/
class OperatingSystem_7Test {
		
    /**
    * Test method for {@link OperatingSystem#deleteTemporaryFiles()}.
    */
    @Test
    void testDeleteTemporaryFiles() {
        // Test if the method deletes all the temporary files created with createTemporaryFile
        try {
            File temporaryFile = OperatingSystem.createTemporaryFile("test", ".tmp");
            assertTrue(temporaryFile.exists());
            OperatingSystem.deleteTemporaryFiles();
            assertFalse(temporaryFile.exists());
        } catch (IOException ex) {
            fail("Couldn't create temporary file");
        }
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
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultTemporaryFolder(boolean)} method.
*/
class OperatingSystem_8Test {
		
    /**
    * Test method for {@link OperatingSystem#getDefaultTemporaryFolder(boolean)}.
    */
    @Test
    void testGetDefaultTemporaryFolder() {
        // Test if the method returns the default folder used to store temporary files created in the program
        try {
            File temporaryFolder = OperatingSystem.getDefaultTemporaryFolder(true);
            assertTrue(temporaryFolder.exists());
            temporaryFolder.delete();
        } catch (IOException ex) {
            fail("Couldn't create temporary folder");
        }
    }
}

// OperatingSystem_9Test.java
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
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class Operating