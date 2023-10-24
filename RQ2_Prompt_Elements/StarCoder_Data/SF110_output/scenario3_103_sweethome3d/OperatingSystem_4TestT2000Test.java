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
        // Test case for Windows
        if (OperatingSystem.isWindows()) {
            // Test case for 32 bits Windows
            if (OperatingSystem.is32BitsWindows()) {
                assertEquals(new File("C:\\Program Files\\Sweet Home 3D"), OperatingSystem.getDefaultApplicationFolder());
            } else {
                assertEquals(new File("C:\\Program Files (x86)\\Sweet Home 3D"), OperatingSystem.getDefaultApplicationFolder());
            }
        } else if (OperatingSystem.isMacOSX()) {
            assertEquals(new File("/Applications/Sweet Home 3D.app"), OperatingSystem.getDefaultApplicationFolder());
        } else if (OperatingSystem.isLinux()) {
            assertEquals(new File("/usr/share/Sweet Home 3D"), OperatingSystem.getDefaultApplicationFolder());
        } else {
            fail("Operating system not supported");
        }
    }
}

// OperatingSystem.java
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

/**
 * Tools used to test current user operating system.
 *
 * @author <NAME>
 */
public class OperatingSystem {

    /**
     * Returns default application folder.
     */
    public static File getDefaultApplicationFolder() throws IOException {
        // Test case for Windows
        if (isWindows()) {
            // Test case for 32 bits Windows
            if (is32BitsWindows()) {
                return new File("C:\\Program Files\\Sweet Home 3D");
            } else {
                return new File("C:\\Program Files (x86)\\Sweet Home 3D");
            }
        } else if (isMacOSX()) {
            return new File("/Applications/Sweet Home 3D.app");
        } else if (isLinux()) {
            return new File("/usr/share/Sweet Home 3D");
        } else {
            throw new IOException("Operating system not supported");
        }
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
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystem_4Test {
		
    /**
     * Test case for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
     */
    @Test
    void testGetDefaultApplicationFolder() throws IOException {
        // Test case for Windows
        if (OperatingSystem.isWindows()) {
            // Test case for 32 bits Windows
            if (OperatingSystem.is32BitsWindows()) {
                assertEquals(new File("C:\\Program Files\\Sweet Home 3D"), OperatingSystem.getDefaultApplicationFolder());
            } else {
                assertEquals(new File("C:\\Program Files (x86)\\Sweet Home 3D"), OperatingSystem.getDefaultApplicationFolder());
            }
        } else if (OperatingSystem.isMacOSX()) {
            assertEquals(new File("/Applications/Sweet Home 3D.app"), OperatingSystem.getDefaultApplicationFolder());
        } else if (OperatingSystem.isLinux()) {
            assertEquals(new File("/usr/share/Sweet Home 3D"), OperatingSystem.getDefaultApplicationFolder());
        } else {
            fail("Operating system not supported");
        }
    }
}

// OperatingSystem.java
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

/**
 * Tools used to test current user operating system.
 *
 * @author <NAME>
 */
public class OperatingSystem {

    /**
     * Returns default application folder.
     */
    public static File getDefaultApplicationFolder() throws IOException {
        // Test case for Windows
        if (isWindows()) {
            // Test case for 32 bits Windows
            if (is32BitsWindows()) {
                return new File("C:\\Program Files\\Sweet Home 3D");
            } else {
                return new File("C:\\Program Files (x86)\\Sweet Home 3D");
            }
        } else if (isMacOSX()) {
            return new File("/Applications/Sweet Home 3D.app");
        } else if (isLinux()) {
            return new File("/usr/share/Sweet Home 3D");
        } else {
            throw new IOException("Operating system not supported");
        }
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
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystem_4Test {
		
    /**
     * Test case for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
     */
    @Test
    void testGetDefaultApplicationFolder() throws IOException {
        // Test case for Windows
        if (OperatingSystem.isWindows()) {
            // Test case for 32 bits Windows
            if (OperatingSystem.is32BitsWindows()) {
                assertEquals(new File("C:\\Program Files\\Sweet Home 3D"), OperatingSystem.getDefaultApplicationFolder());
            } else {
                assertEquals(new File("C:\\Program Files (x86)\\Sweet Home 3D"), OperatingSystem.getDefaultApplicationFolder());
            }
        } else if (OperatingSystem.isMacOSX()) {
            assertEquals(new File("/Applications/Sweet Home 3D.app"), OperatingSystem.getDefaultApplicationFolder());
        } else if (OperatingSystem.isLinux()) {
            assertEquals(new File("/usr/share/Sweet Home 3D"), OperatingSystem.getDefaultApplicationFolder());
        } else {
            fail("Operating system not supported");
        }
    }
}

// OperatingSystem.java
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

/**
 * Tools used to test current user operating system.
 *
 * @author <NAME>
 */
public class OperatingSystem {

    /**
     * Returns default application folder.
     */
    public static File getDefaultApplicationFolder() throws IOException {
        // Test case for Windows
        if (isWindows()) {
            // Test case for 32 bits Windows
            if (is32BitsWindows()) {
                return new File("C:\\Program Files\\Sweet Home 3D");
            } else {
                return new File("C:\\Program Files (x86)\\Sweet Home 3D");
            }