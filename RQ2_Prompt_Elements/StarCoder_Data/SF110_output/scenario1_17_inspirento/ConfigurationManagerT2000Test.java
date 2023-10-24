// ConfigurationManagerTest.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains ten unit test cases for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManagerTest {

    @Test
    void testGetProperty() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        assertEquals("100", cm.getProperty("window.size.width"));
        assertEquals("100", cm.getProperty("window.size.height"));
        assertEquals("100", cm.getProperty("window.location.x"));
        assertEquals("100", cm.getProperty("window.location.y"));
        assertEquals("100", cm.getProperty("window.location.width"));
        assertEquals("100", cm.getProperty("window.location.height"));
        assertEquals("100", cm.getProperty("window.location.x"));
        assertEquals("100", cm.getProperty("window.location.y"));
        assertEquals("100", cm.getProperty("window.location.width"));
        assertEquals("100", cm.getProperty("window.location.height"));
        assertEquals("100", cm.getProperty("window.location.x"));
        assertEquals("100", cm.getProperty("window.location.y"));
        assertEquals("100", cm.getProperty("window.location.width"));
        assertEquals("100", cm.getProperty("window.location.height"));
    }
}

// ConfigurationManager.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;

/**
 * Manages the configuration for Inspirento.<br>
 * This manager uses XML format to store information.
 * The configuration file is, by default, saved in the
 * "config" directory and named "config.xml". Clearly,
 * this class should be a singleton, so we use
 * {@link #getInstance()} to get an instance and call
 * other instance methods to get the settings needed
 * by Inspirento, such as "window.size", "window.location",
 * and etc.<br>
 * The program first tries to get the configuration from
 * this <code>ConfigurationManager</code>. If it fails to
 * get any key, it uses the default settings presetted in
 * the protected <code>default</code> field.
 *
 * @author Allen Chue
 */
public class ConfigurationManager extends Properties {

    @Override
    public synchronized String getProperty(String key) {
        String value = xmlIO.getRoot().getElement(Constants.PROJECT_NAME + "." + getPath(key)[0]).getAttribute