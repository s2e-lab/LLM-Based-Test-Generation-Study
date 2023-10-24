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

    /**
     * Test case for {@link ConfigurationManager#getProperty(String)}
     * when the key is "window.size".
     */
    @Test
    void testGetPropertyWindowSize() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String size = cm.getProperty("window.size");
        assertEquals("1024x768", size);
    }

    /**
     * Test case for {@link ConfigurationManager#getProperty(String)}
     * when the key is "window.location".
     */
    @Test
    void testGetPropertyWindowLocation() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String location = cm.getProperty("window.location");
        assertEquals("100,100", location);
    }

    /**
     * Test case for {@link ConfigurationManager#getProperty(String)}
     * when the key is "window.title".
     */
    @Test
    void testGetPropertyWindowTitle() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String title = cm.getProperty("window.title");
        assertEquals("Inspirento", title);
    }

    /**
     * Test case for {@link ConfigurationManager#getProperty(String)}
     * when the key is "window.icon".
     */
    @Test
    void testGetPropertyWindowIcon() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String icon = cm.getProperty("window.icon");
        assertEquals("icon.png", icon);
    }

    /**
     * Test case for {@link ConfigurationManager#getProperty(String)}
     * when the key is "window.background".
     */
    @Test
    void testGetPropertyWindowBackground() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String background = cm.getProperty("window.background");
        assertEquals("background.png", background);
    }

    /**
     * Test case for {@link ConfigurationManager#getProperty(String)}
     * when the key is "window.font".
     */
    @Test
    void testGetPropertyWindowFont() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String font = cm.getProperty("window.font");
        assertEquals("font.ttf", font);
    }

    /**
     * Test case for {@link ConfigurationManager#getProperty(String)}
     * when the key is "window.font.size".
     */
    @Test
    void testGetPropertyWindowFontSize() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String fontSize = cm.getProperty("window.font.size");
        assertEquals("12", fontSize);
    }

    /**
     * Test case for {@link ConfigurationManager#getProperty(String)}
     * when the key is "window.font.color".
     */
    @Test
    void testGetPropertyWindowFontColor() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String fontColor = cm.getProperty("window.font.color");
        assertEquals("0x000000", fontColor);
    }

    /**
     * Test case for {@link ConfigurationManager#getProperty(String)}
     * when the key is "window.font.style".
     */
    @Test
    void testGetPropertyWindowFontStyle() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String fontStyle = cm.getProperty("window.font.style");
        assertEquals("PLAIN", fontStyle);
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

    /**
     * Uses XML parser to get the specified property.
     * If there is no such a key, the method returns
     * <code>null</code>.
     *
     * @param key the key of the property
     * @return the property value
     */
    @Override
    public synchronized String getProperty(String key) {
        String value = super.getProperty(key);
        if (value == null) {
            value = default.getProperty(key);
        }
        return value;
    }

    /**
     * The default settings.
     */
    protected static Properties default = new Properties();

    /**
     * The singleton instance.
     */
    protected static ConfigurationManager instance = null;

    /**
     * Gets the singleton instance.
     *
     * @return the singleton instance
     */
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    /**
     * Loads the configuration from the configuration file.
     */
    protected ConfigurationManager() {
        try {
            String path = "config/config.xml";
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
                FileOutputStream fos = new FileOutputStream(file);
                default.storeToXML(fos, "Inspirento Configuration");
                fos.close();
            }
            FileInputStream fis = new FileInputStream(file);
            loadFromXML(fis);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    /**
     * Uses XML parser to get the specified property.
     * If there is no such a key, the method returns
     * <code>null</code>.
     *
     * @param key the key of the property
     * @return the property value
     */
    @Override
    public synchronized String getProperty(String key) {
        String value = super.getProperty(key);
        if (value == null) {
            value = default.getProperty(key);
        }
        return value;
    }

    /**
     * The default settings.
     */
    protected static Properties default = new Properties();

    /**
     * The singleton instance.
     */
    protected static ConfigurationManager instance = null;

    /**
     * Gets the singleton instance.
     *
     * @return the singleton instance
     */
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    /**
     * Loads the configuration from the configuration file.
     */
    protected ConfigurationManager() {
        try {
            String path = "config/config.xml";
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
                FileOutputStream fos = new FileOutputStream(file);
                default.storeToXML(fos, "Inspirento Configuration");
                fos.close();
            }
            FileInputStream fis = new FileInputStream(file);
            loadFromXML(fis);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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