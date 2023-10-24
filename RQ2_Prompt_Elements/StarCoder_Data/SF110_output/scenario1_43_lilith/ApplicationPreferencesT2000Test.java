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

    @Test
    void testNull() {
        assertNull(ApplicationPreferences.getMD5(null));
    }

    @Test
    void testEmpty() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[0]);
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testOneByte() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testTwoBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testThreeBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testFourBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testFiveBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testSixBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testSevenBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testEightBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testNineBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testTenBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testElevenBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testTwelveBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testThirteenBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testFourteenBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testFifteenBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testSixteenBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128, -128, -128, -128 }, ApplicationPreferences.getMD5(input));
    }

    @Test
    void testSeventeenBytes() throws IOException {
        final InputStream input = new ByteArrayInputStream(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 });
        assertArrayEquals(new byte[] { -128, -128, -128, -128, -128,