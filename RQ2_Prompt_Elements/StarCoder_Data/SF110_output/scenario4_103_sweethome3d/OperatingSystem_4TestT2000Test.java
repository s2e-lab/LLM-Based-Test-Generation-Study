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
    * Test method for {@link OperatingSystem#getDefaultApplicationFolder()}.
    */
    @Test
    void testGetDefaultApplicationFolder() throws IOException {
        // Test case 1
        File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertNotNull(defaultApplicationFolder);
        assertTrue(defaultApplicationFolder.exists());
        assertTrue(defaultApplicationFolder.isDirectory());
        assertTrue(defaultApplicationFolder.canRead());
        assertTrue(defaultApplicationFolder.canWrite());
        assertTrue(defaultApplicationFolder.canExecute());
        assertTrue(defaultApplicationFolder.getAbsolutePath().endsWith(".app"));

        // Test case 2
        File defaultApplicationFolder2 = OperatingSystem.getDefaultApplicationFolder();
        assertEquals(defaultApplicationFolder, defaultApplicationFolder2);

        // Test case 3
        File defaultApplicationFolder3 = new File(OperatingSystem.getDefaultApplicationFolder(), "Contents");
        assertTrue(defaultApplicationFolder3.exists());
        assertTrue(defaultApplicationFolder3.isDirectory());
        assertTrue(defaultApplicationFolder3.canRead());
        assertTrue(defaultApplicationFolder3.canWrite());
        assertTrue(defaultApplicationFolder3.canExecute());
        assertTrue(defaultApplicationFolder3.getAbsolutePath().endsWith(".app/Contents"));

        // Test case 4
        File defaultApplicationFolder4 = new File(OperatingSystem.getDefaultApplicationFolder(), "Contents/Resources");
        assertTrue(defaultApplicationFolder4.exists());
        assertTrue(defaultApplicationFolder4.isDirectory());
        assertTrue(defaultApplicationFolder4.canRead());
        assertTrue(defaultApplicationFolder4.canWrite());
        assertTrue(defaultApplicationFolder4.canExecute());
        assertTrue(defaultApplicationFolder4.getAbsolutePath().endsWith(".app/Contents/Resources"));

        // Test case 5
        File defaultApplicationFolder5 = new File(OperatingSystem.getDefaultApplicationFolder(), "Contents/Resources/Java");
        assertTrue(defaultApplicationFolder5.exists());
        assertTrue(defaultApplicationFolder5.isDirectory());
        assertTrue(defaultApplicationFolder5.canRead());
        assertTrue(defaultApplicationFolder5.canWrite());
        assertTrue(defaultApplicationFolder5.canExecute());
        assertTrue(defaultApplicationFolder5.getAbsolutePath().endsWith(".app/Contents/Resources/Java"));

        // Test case 6
        File defaultApplicationFolder6 = new File(OperatingSystem.getDefaultApplicationFolder(), "Contents/Resources/Java/com");
        assertTrue(defaultApplicationFolder6.exists());
        assertTrue(defaultApplicationFolder6.isDirectory());
        assertTrue(defaultApplicationFolder6.canRead());
        assertTrue(defaultApplicationFolder6.canWrite());
        assertTrue(defaultApplicationFolder6.canExecute());
        assertTrue(defaultApplicationFolder6.getAbsolutePath().endsWith(".app/Contents/Resources/Java/com"));

        // Test case 7
        File defaultApplicationFolder7 = new File(OperatingSystem.getDefaultApplicationFolder(), "Contents/Resources/Java/com/eteks");
        assertTrue(defaultApplicationFolder7.exists());
        assertTrue(defaultApplicationFolder7.isDirectory());
        assertTrue(defaultApplicationFolder7.canRead());
        assertTrue(defaultApplicationFolder7.canWrite());
        assertTrue(defaultApplicationFolder7.canExecute());
        assertTrue(defaultApplicationFolder7.getAbsolutePath().endsWith(".app/Contents/Resources/Java/com/eteks"));

        // Test case 8
        File defaultApplicationFolder8 = new File(OperatingSystem.getDefaultApplicationFolder(), "Contents/Resources/Java/com/eteks/sweethome3d");
        assertTrue(defaultApplicationFolder8.exists());
        assertTrue(defaultApplicationFolder8.isDirectory());
        assertTrue(defaultApplicationFolder8.canRead());
        assertTrue(defaultApplicationFolder8.canWrite());
        assertTrue(defaultApplicationFolder8.canExecute());
        assertTrue(defaultApplicationFolder8.getAbsolutePath().endsWith(".app/Contents/Resources/Java/com/eteks/sweethome3d"));

        // Test case 9
        File defaultApplicationFolder9 = new File(OperatingSystem.getDefaultApplicationFolder(), "Contents/Resources/Java/com/eteks/sweethome3d/tools");
        assertTrue(defaultApplicationFolder9.exists());
        assertTrue(defaultApplicationFolder9.isDirectory());
        assertTrue(defaultApplicationFolder9.canRead());
        assertTrue(defaultApplicationFolder9.canWrite());
        assertTrue(defaultApplicationFolder9.canExecute());
        assertTrue(defaultApplicationFolder9.getAbsolutePath().endsWith(".app/Contents/Resources/Java/com/eteks/sweethome3d/tools"));

        // Test case 10
        File defaultApplicationFolder10 = new File(OperatingSystem.getDefaultApplicationFolder(), "Contents/Resources/Java/com/eteks/sweethome3d/tools/OperatingSystem_4Test.class");
        assertTrue(defaultApplicationFolder10.exists());
        assertTrue(defaultApplicationFolder10.isFile());
        assertTrue(defaultApplicationFolder10.canRead());
        assertTrue(defaultApplicationFolder10.canWrite());
        assertTrue(defaultApplicationFolder10.canExecute());
        assertTrue(defaultApplicationFolder10.getAbsolutePath().endsWith(".app/Contents/Resources/Java/com/eteks/sweethome3d/tools/OperatingSystem_4Test.class"));
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
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultTemporaryFolder(boolean)} method.
*/
class OperatingSystem_5Test {
		
    /**
    * Test method for {@link OperatingSystem#getDefaultTemporaryFolder(boolean)}.
    */
    @Test
    void testGetDefaultTemporaryFolder() throws IOException {
        // Test case 1
        File defaultTemporaryFolder = OperatingSystem.getDefaultTemporaryFolder(true);
        assertNotNull(defaultTemporaryFolder);
        assertTrue(defaultTemporaryFolder.exists());
        assertTrue(defaultTemporaryFolder.isDirectory());
        assertTrue(defaultTemporaryFolder.canRead());
        assertTrue(defaultTemporaryFolder.canWrite());
        assertTrue(defaultTemporaryFolder.canExecute());
        assertTrue(defaultTemporaryFolder.getAbsolutePath().endsWith(".app/Contents/Resources/Java/com/eteks/sweethome3d/tools/tmp"));

        // Test case 2
        File defaultTemporaryFolder2 = OperatingSystem.getDefaultTemporaryFolder(true);
        assertEquals(defaultTemporaryFolder, defaultTemporaryFolder2);

        // Test case 3
        File defaultTemporaryFolder3 = new File(OperatingSystem.getDefaultTemporaryFolder(true), "tmp");
        assertTrue(defaultTemporaryFolder3.exists());
        assertTrue(defaultTemporaryFolder3.isDirectory());
        assertTrue(defaultTemporaryFolder3.canRead());
        assertTrue(defaultTemporaryFolder3.canWrite());
        assertTrue(defaultTemporaryFolder3.canExecute());
        assertTrue(defaultTemporaryFolder3.getAbsolutePath().endsWith(".app/Contents/Resources/Java/com/eteks/sweethome3d/tools/tmp/tmp"));

        // Test case 4
        File defaultTemporaryFolder4 = new File(OperatingSystem.getDefaultTemporaryFolder(true), "tmp/tmp");
        assertTrue(defaultTemporaryFolder4.exists());
        assertTrue(defaultTemporaryFolder4.isDirectory());
        assertTrue(defaultTemporaryFolder4.canRead());
        assertTrue(defaultTemporaryFolder4.canWrite());
        assertTrue(defaultTemporaryFolder4.canExecute());
        assertTrue(defaultTemporaryFolder4.getAbsolutePath().endsWith(".app/Contents/Resources/Java/com/eteks/sweethome3d/tools/tmp/tmp/tmp"));

        // Test case 5
        File defaultTemporaryFolder5 = new File(OperatingSystem.getDefaultTemporaryFolder(true), "tmp/tmp/tmp");
        assertTrue(defaultTemporaryFolder5.exists());
        assertTrue(defaultTemporaryFolder5.isDirectory());
        assertTrue(defaultTemporaryFolder5.canRead());
        assertTrue(defaultTemporaryFolder5.canWrite());
        assertTrue(defaultTemporaryFolder5.canExecute());
        assertTrue(defaultTemporaryFolder5.getAbsolutePath().endsWith(".app/Contents/Resources/Java/com/eteks/sweethome3d/tools/tmp/tmp/tmp/tmp"));

        // Test case 6
        File defaultTemporaryFolder6 = new File(OperatingSystem.getDefaultTemporaryFolder(true), "tmp/tmp/tmp/tmp");
        assertTrue(defaultTemporaryFolder6.exists());
        assertTrue(defaultTemporaryFolder6.isDirectory());
        assertTrue(defaultTemporaryFolder6.canRead());
        assertTrue(defaultTemporaryFolder6.canWrite());
        assertTrue(defaultTemporaryFolder6.canExecute());
        assertTrue(defaultTemporaryFolder6.getAbsolutePath().endsWith(".app/Contents/Resources/Java/com/eteks/sweethome3d/tools/tmp/tmp/tmp/tmp/tmp"));

        // Test case 7
        File defaultTemporaryFolder7 = new File(OperatingSystem.getDefaultTemporaryFolder(true), "tmp/tmp/tmp/tmp