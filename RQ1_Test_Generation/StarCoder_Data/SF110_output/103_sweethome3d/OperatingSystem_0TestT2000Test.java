// OperatingSystem_0Test.java
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
class OperatingSystem_0Test {

    @Test
    void testIsLinux() {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        assertTrue(OperatingSystem.isLinux());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        assertFalse(OperatingSystem.isLinux());
        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        assertFalse(OperatingSystem.isLinux());
    }

    @Test
    void testIsWindows() {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        assertFalse(OperatingSystem.isWindows());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        assertTrue(OperatingSystem.isWindows());
        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        assertFalse(OperatingSystem.isWindows());
    }

    @Test
    void testIsMacOSX() {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        assertFalse(OperatingSystem.isMacOSX());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        assertFalse(OperatingSystem.isMacOSX());
        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        assertTrue(OperatingSystem.isMacOSX());
    }

    @Test
    void testIsMacOSXLeopardOrSuperior() {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
        // Test with Mac OS X 10.4
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.4");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
        // Test with Mac OS X 10.5
        System.setProperty("os.version", "10.5");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
        // Test with Mac OS X 10.6
        System.setProperty("os.version", "10.6");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    @Test
    void testCreateTemporaryFile() throws IOException {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        File temporaryFile = OperatingSystem.createTemporaryFile("test", ".tmp");
        assertTrue(temporaryFile.exists());
        assertTrue(temporaryFile.delete());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        temporaryFile = OperatingSystem.createTemporaryFile("test", ".tmp");
        assertTrue(temporaryFile.exists());
        assertTrue(temporaryFile.delete());
        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        temporaryFile = OperatingSystem.createTemporaryFile("test", ".tmp");
        assertTrue(temporaryFile.exists());
        assertTrue(temporaryFile.delete());
    }

    @Test
    void testDeleteTemporaryFiles() {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        OperatingSystem.deleteTemporaryFiles();
        // Test with Windows
        System.setProperty("os.name", "Windows");
        OperatingSystem.deleteTemporaryFiles();
        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        OperatingSystem.deleteTemporaryFiles();
    }

    @Test
    void testGetDefaultTemporaryFolder() throws IOException {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        File temporaryFolder = OperatingSystem.getDefaultTemporaryFolder(true);
        assertTrue(temporaryFolder.exists());
        assertTrue(temporaryFolder.delete());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        temporaryFolder = OperatingSystem.getDefaultTemporaryFolder(true);
        assertTrue(temporaryFolder.exists());
        assertTrue(temporaryFolder.delete());
        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        temporaryFolder = OperatingSystem.getDefaultTemporaryFolder(true);
        assertTrue(temporaryFolder.exists());
        assertTrue(temporaryFolder.delete());
    }

    @Test
    void testGetDefaultApplicationFolder() throws IOException {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        File applicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertTrue(applicationFolder.exists());
        assertTrue(applicationFolder.delete());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        applicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertTrue(applicationFolder.exists());
        assertTrue(applicationFolder.delete());
        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        applicationFolder = OperatingSystem.getDefaultApplicationFolder();
        assertTrue(applicationFolder.exists());
        assertTrue(applicationFolder.delete());
    }
}

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
		
    @Test
    void testIsLinux() {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        assertFalse(OperatingSystem.isLinux());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        assertTrue(OperatingSystem.isLinux());
        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        assertFalse(OperatingSystem.isLinux());
    }

    @Test
    void testIsWindows() {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        assertFalse(OperatingSystem.isWindows());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        assertTrue(OperatingSystem.isWindows());
        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        assertFalse(OperatingSystem.isWindows());
    }

    @Test
    void testIsMacOSX() {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        assertFalse(OperatingSystem.isMacOSX());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        assertFalse(OperatingSystem.isMacOSX());
        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        assertTrue(OperatingSystem.isMacOSX());
    }

    @Test
    void testIsMacOSXLeopardOrSuperior() {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
        // Test with Mac OS X 10.4
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.4");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
        // Test with Mac OS X 10.5
        System.setProperty("os.version", "10.5");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
        // Test with Mac OS X 10.6
        System.setProperty("os.version", "10.6");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
    }

    @Test
    void testCreateTemporaryFile() throws IOException {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        File temporaryFile = OperatingSystem.createTemporaryFile("test", ".tmp");
        assertTrue(temporaryFile.exists());
        assertTrue(temporaryFile.delete());
        // Test with Windows
        System.setProperty("os.name", "Windows");
        temporaryFile = OperatingSystem.createTemporaryFile("test", ".tmp");
        assertTrue(temporaryFile.exists());
        assertTrue(temporaryFile.delete());
        // Test with Mac OS X
        System.setProperty("os.name", "Mac OS X");
        temporaryFile = OperatingSystem.createTemporaryFile("test", ".tmp");
        assertTrue(temporaryFile.exists());
        assertTrue(temporaryFile.delete());
    }

    @Test
    void testDeleteTemporaryFiles() {
        // Test with Linux
        System.setProperty("os.name", "Linux");
        OperatingSystem.