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

    @Test
    void getDefaultApplicationFolder() throws IOException {
        File userApplicationFolder;
        if (OperatingSystem.isMacOSX()) {
            userApplicationFolder = new File(MacOSXFileManager.getApplicationSupportFolder());
        } else if (OperatingSystem.isWindows()) {
            userApplicationFolder = new File(System.getProperty("user.home"), "Application Data");
            // If user Application Data directory doesn't exist, use user home
            if (!userApplicationFolder.exists()) {
                userApplicationFolder = new File(System.getProperty("user.home"));
            }
        } else {
            // Unix
            userApplicationFolder = new File(System.getProperty("user.home"));
        }
        assertEquals(new File(userApplicationFolder, "Sweet Home 3D" + File.separator + "Application"), OperatingSystem.getDefaultApplicationFolder());
    }
}

// MacOSXFileManager.java
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
public class MacOSXFileManager {

    public static File getApplicationSupportFolder() throws IOException {
        return new File(FileManager.getApplicationSupportFolder());
    }
}

// MacOSXFileManager_4Test.java
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
* Test class of {@link MacOSXFileManager}.
* It contains one unit test case for the {@link MacOSXFileManager#getApplicationSupportFolder()} method.
*/
class MacOSXFileManager_4Test {
		
    @Test
    void getApplicationSupportFolder() throws IOException {
        assertEquals(new File(System.getProperty("user.home"), "Library" + File.separator + "Application Support"), MacOSXFileManager.getApplicationSupportFolder());
    }
}

// WindowsFileManager.java
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
public class WindowsFileManager {

    public static File getApplicationSupportFolder() throws IOException {
        return new File(System.getenv("APPDATA"));
    }
}

// WindowsFileManager_4Test.java
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
* Test class of {@link WindowsFileManager}.
* It contains one unit test case for the {@link WindowsFileManager#getApplicationSupportFolder()} method.
*/
class WindowsFileManager_4Test {
		
    @Test
    void getApplicationSupportFolder() throws IOException {
        assertEquals(new File(System.getProperty("user.home"), "Application Data"), WindowsFileManager.getApplicationSupportFolder());
    }
}

// UnixFileManager.java
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
public class UnixFileManager {

    public static File getApplicationSupportFolder() throws IOException {
        return new File(System.getProperty("user.home"));
    }
}

// UnixFileManager_4Test.java
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
* Test class of {@link UnixFileManager}.
* It contains one unit test case for the {@link UnixFileManager#getApplicationSupportFolder()} method.
*/
class UnixFileManager_4Test {
		
    @Test
    void getApplicationSupportFolder() throws IOException {
        assertEquals(new File(System.getProperty("user.home")), UnixFileManager.getApplicationSupportFolder());
    }
}

// Test.java
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
public class Test {

    public static void main(String[] args) throws IOException {
        System.out.println(OperatingSystem.getDefaultApplicationFolder());
    }
}

// Test_4Test.java
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
* Test class of {@link Test}.
* It contains one unit test case for the {@link Test#main(String[])} method.
*/
class Test_4Test {
		
    @Test
    void main() throws IOException {
        assertEquals(new File(System.getProperty("user.home"), "Sweet Home 3D" + File.separator + "Application"), Test.main(null));
    }
}

// Test_4Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.