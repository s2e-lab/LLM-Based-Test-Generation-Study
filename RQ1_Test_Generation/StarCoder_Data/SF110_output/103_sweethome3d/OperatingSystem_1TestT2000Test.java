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
    void testIsWindows() {
        // Test with Windows 7
        System.setProperty("os.name", "Windows 7");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 98
        System.setProperty("os.name", "Windows 98");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2000
        System.setProperty("os.name", "Windows 2000");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows XP
        System.setProperty("os.name", "Windows XP");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2003
        System.setProperty("os.name", "Windows 2003");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows Vista
        System.setProperty("os.name", "Windows Vista");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2008
        System.setProperty("os.name", "Windows 2008");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 7
        System.setProperty("os.name", "Windows 7");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 98
        System.setProperty("os.name", "Windows 98");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2000
        System.setProperty("os.name", "Windows 2000");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows XP
        System.setProperty("os.name", "Windows XP");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2003
        System.setProperty("os.name", "Windows 2003");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows Vista
        System.setProperty("os.name", "Windows Vista");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2008
        System.setProperty("os.name", "Windows 2008");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 7
        System.setProperty("os.name", "Windows 7");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 98
        System.setProperty("os.name", "Windows 98");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2000
        System.setProperty("os.name", "Windows 2000");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows XP
        System.setProperty("os.name", "Windows XP");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2003
        System.setProperty("os.name", "Windows 2003");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows Vista
        System.setProperty("os.name", "Windows Vista");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2008
        System.setProperty("os.name", "Windows 2008");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 7
        System.setProperty("os.name", "Windows 7");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 98
        System.setProperty("os.name", "Windows 98");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2000
        System.setProperty("os.name", "Windows 2000");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows XP
        System.setProperty("os.name", "Windows XP");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2003
        System.setProperty("os.name", "Windows 2003");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows Vista
        System.setProperty("os.name", "Windows Vista");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2008
        System.setProperty("os.name", "Windows 2008");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 7
        System.setProperty("os.name", "Windows 7");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 98
        System.setProperty("os.name", "Windows 98");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2000
        System.setProperty("os.name", "Windows 2000");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows XP
        System.setProperty("os.name", "Windows XP");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2003
        System.setProperty("os.name", "Windows 2003");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows Vista
        System.setProperty("os.name", "Windows Vista");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2008
        System.setProperty("os.name", "Windows 2008");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 7
        System.setProperty("os.name", "Windows 7");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 98
        System.setProperty("os.name", "Windows 98");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2000
        System.setProperty("os.name", "Windows 2000");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows XP
        System.setProperty("os.name", "Windows XP");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2003
        System.setProperty("os.name", "Windows 2003");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows Vista
        System.setProperty("os.name", "Windows Vista");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2008
        System.setProperty("os.name", "Windows 2008");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 7
        System.setProperty("os.name", "Windows 7");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 98
        System.setProperty("os.name", "Windows 98");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2000
        System.setProperty("os.name", "Windows 2000");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows XP
        System.setProperty("os.name", "Windows XP");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2003
        System.setProperty("os.name", "Windows 2003");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows Vista
        System.setProperty("os.name", "Windows Vista");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2008
        System.setProperty("os.name", "Windows 2008");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 7
        System.setProperty("os.name", "Windows 7");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 98
        System.setProperty("os.name", "Windows 98");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2000
        System.setProperty("os.name", "Windows 2000");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows XP
        System.setProperty("os.name", "Windows XP");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2003
        System.setProperty("os.name", "Windows 2003");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows Vista
        System.setProperty("os.name", "Windows Vista");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2008
        System.setProperty("os.name", "Windows 2008");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 7
        System.setProperty("os.name", "Windows 7");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 98
        System.setProperty("os.name", "Windows 98");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2000
        System.setProperty("os.name", "Windows 2000");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows XP
        System.setProperty("os.name", "Windows XP");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows 2003
        System.setProperty("os.name", "Windows 2003");
        assertTrue(OperatingSystem.isWindows());
        // Test with Windows Vista
        System.setProperty("os.name", "Windows Vista");
       