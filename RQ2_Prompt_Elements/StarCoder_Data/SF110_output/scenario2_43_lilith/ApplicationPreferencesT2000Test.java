// ApplicationPreferencesTest.java
package de.huxhorn.lilith.swing;

import de.huxhorn.lilith.Lilith;
import de.huxhorn.lilith.LilithSounds;
import de.huxhorn.lilith.data.access.HttpStatus;
import de.huxhorn.lilith.data.logging.LoggingEvent;
import de.huxhorn.lilith.swing.filefilters.GroovyConditionFileFilter;
import de.huxhorn.lilith.swing.preferences.SavedCondition;
import de.huxhorn.lilith.swing.table.ColorScheme;
import de.huxhorn.lilith.swing.table.model.PersistentTableColumnModel;
import de.huxhorn.sulky.conditions.Condition;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.*;
import java.beans.Encoder;
import java.beans.Expression;
import java.beans.PersistenceDelegate;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationPreferences}.
* It contains ten unit test cases for the {@link ApplicationPreferences#getMD5(InputStream)} method.
*/
class ApplicationPreferencesTest {

    /**
     * Test method for {@link ApplicationPreferences#getMD5(InputStream)}.
     */
    @Test
    void testGetMD5() {
        final Logger logger = LoggerFactory.getLogger(ApplicationPreferencesTest.class);
        final String[] testStrings = { "test", "test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", "test9", "test10" };
        final byte[][] testMD5s = { { -107, -113, -108, -110, -107, -113, -108, -110, -107, -113, -108, -110 },
                { -107, -113, -108, -110, -107, -113, -108, -110, -107, -113, -108, -110 },
                { -107, -113, -108, -110, -107, -113, -108, -110, -107, -113, -108, -110 },
                { -107, -113, -108, -110, -107, -113, -108, -110, -107, -113, -108, -110 },
                { -107, -113, -108, -110, -107, -113, -108, -110, -107, -113, -108, -110 },
                { -107, -113, -108, -110, -107, -113, -108, -110, -107, -113, -108, -110 },
                { -107, -113, -108, -110, -107, -113, -108, -110, -107, -113, -108, -110 },
                { -107, -113, -108, -110, -107, -113, -108, -110, -107, -113, -108, -110 },
                { -107, -113, -108, -110, -107, -113, -108, -110, -107, -113, -108, -110 },
                { -107, -113, -108, -110, -107, -113, -108, -110, -107, -113, -108, -110 },
                { -107, -113, -108, -110, -107, -113, -108, -110, -107, -113, -108, -110 } };
        for (int i = 0; i < testStrings.length; i++) {
            final byte[] md5 = ApplicationPreferences.getMD5(new ByteArrayInputStream(testStrings[i].getBytes()));
            if (logger.isDebugEnabled())
                logger.debug("MD5 of \"" + testStrings[i] + "\" is " + Arrays.toString(md5));
            assertArrayEquals(testMD5s[i], md5);
        }
    }
}

// ApplicationPreferences.java
package de.huxhorn.lilith.swing;

import de.huxhorn.lilith.Lilith;
import de.huxhorn.lilith.LilithSounds;
import de.huxhorn.lilith.data.access.HttpStatus;
import de.huxhorn.lilith.data.logging.LoggingEvent;
import de.huxhorn.lilith.swing.filefilters.GroovyConditionFileFilter;
import de.huxhorn.lilith.swing.preferences.SavedCondition;
import de.huxhorn.lilith.swing.table.ColorScheme;
import de.huxhorn.lilith.swing.table.model.PersistentTableColumnModel;
import de.huxhorn.sulky.conditions.Condition;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.*;
import java.beans.Encoder;
import java.beans.Expression;
import java.beans.PersistenceDelegate;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.*;

public class ApplicationPreferences {

    /**
     * Quick & dirty MD5 checksum function.
     * Returns null in case of error.
     *
     * @param input the input
     * @return the checksum
     */
    public static byte[] getMD5(InputStream input) {
        if (input == null) {
            return null;
        }
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            byte[] buffer = new byte[1024];
            for (; ; ) {
                int read = input.read(buffer);
                if (read < 0) {
                    break;
                }
                messageDigest.update(buffer, 0, read);
            }
            return messageDigest.digest();
        } catch (Throwable t) {
            final Logger logger = LoggerFactory.getLogger(ApplicationPreferences.class);
            if (logger.isWarnEnabled())
                logger.warn("Exception while calculating checksum!", t);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                // ignore
            }
        }
        return null;
    }
}

// ApplicationPreferencesTest.java
package de.huxhorn.lilith.swing;

import de.huxhorn.lilith.Lilith;
import de.huxhorn.lilith.LilithSounds;
import de.huxhorn.lilith.data.access.HttpStatus;
import de.huxhorn.lilith.data.logging.LoggingEvent;
import de.huxhorn.lilith.swing.filefilters.GroovyConditionFileFilter;
import de.huxhorn.lilith.swing.preferences.SavedCondition;
import de.huxhorn.lilith.swing.table.ColorScheme;
import de.huxhorn.lilith.swing.table.model.PersistentTableColumnModel;
import de.huxhorn.sulky.conditions.Condition;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.*;
import java.beans.Encoder;
import java.beans.Expression;
import java.beans.PersistenceDelegate;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java