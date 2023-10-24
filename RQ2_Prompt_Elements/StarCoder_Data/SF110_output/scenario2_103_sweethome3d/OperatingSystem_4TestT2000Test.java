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
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystem_4Test {

    /**
     * Test case for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
     */
    @Test
    void testGetDefaultApplicationFolder() throws IOException {
        // Test case for Mac OS X
        if (OperatingSystem.isMacOSX()) {
            File userApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
            assertEquals(new File(FileManager.getApplicationSupportFolder(), EDITOR_SUB_FOLDER + File.separator + APPLICATION_SUB_FOLDER), userApplicationFolder);
        }
        // Test case for Windows
        if (OperatingSystem.isWindows()) {
            File userApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
            assertEquals(new File(System.getProperty("user.home"), "Application Data" + File.separator + EDITOR_SUB_FOLDER + File.separator + APPLICATION_SUB_FOLDER), userApplicationFolder);
        }
        // Test case for Unix
        if (OperatingSystem.isUnix()) {
            File userApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
            assertEquals(new File(System.getProperty("user.home"), EDITOR_SUB_FOLDER + File.separator + APPLICATION_SUB_FOLDER), userApplicationFolder);
        }
    }
}
