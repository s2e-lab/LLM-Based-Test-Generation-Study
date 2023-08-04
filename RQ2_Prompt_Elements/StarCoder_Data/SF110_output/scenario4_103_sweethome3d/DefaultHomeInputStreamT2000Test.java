// DefaultHomeInputStreamTest.java
package com.eteks.sweethome3d.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.URLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultHomeInputStream}.
* It contains ten unit test cases for the {@link DefaultHomeInputStream#readHome()} method.
*/
class DefaultHomeInputStreamTest {

    /**
    * Test method for {@link DefaultHomeInputStream#readHome()}.
    */
    @Test
    void testReadHome() throws IOException, ClassNotFoundException {
        // Create a temporary file
        File tempFile = File.createTempFile("sweethome3d", ".sh3d");
        // Create a home
        Home home = new Home();
        // Create a home output stream
        try (OutputStream out = new FileOutputStream(tempFile)) {
            new DefaultHomeOutputStream(out).writeHome(home);
        }
        // Create a home input stream
        try (InputStream in = new FileInputStream(tempFile)) {
            Home readHome = new DefaultHomeInputStream(in).readHome();
            assertEquals(home, readHome);
        }
    }
}

// DefaultHomeOutputStream.java
package com.eteks.sweethome3d.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.URLContent;

/**
 * An <code>OutputStream</code> filter that writes a home to a stream
 * at .sh3d file format.
 *
 * @see DefaultHomeInputStream
 */
public class DefaultHomeOutputStream extends FilterOutputStream {

    private final ContentRecording contentRecording;

    private File tempFile;

    /**
     * Creates a home output stream filter able to write a home and its content
     * to <code>out</code>.
     */
    public DefaultHomeOutputStream(OutputStream out) throws IOException {
    }

    /**
     * Creates a home output stream filter able to write a home and its content
     * to <code>out</code>.
     */
    public DefaultHomeOutputStream(OutputStream out, ContentRecording contentRecording) throws IOException {
    }

    /**
     * Throws an <code>InterruptedRecorderException</code> exception
     * if current thread is interrupted. The interrupted status of the current thread
     * is cleared when an exception is thrown.
     */
    private static void checkCurrentThreadIsntInterrupted() throws InterruptedIOException;

    /**
     * Writes home to a zipped stream.
     */
    public void writeHome(Home home) throws IOException;

    /**
     * <code>ObjectOutputStream</code> that replaces temporary <code>URLContent</code>
     * objects by <code>URLContent</code> objects that points to file.
     */
    private class HomeObjectOutputStream extends ObjectOutputStream {

        public HomeObjectOutputStream(OutputStream out) throws IOException {
            super(out);
            if (contentRecording != ContentRecording.INCLUDE_NO_CONTENT) {
                enableReplaceObject(true);
            }
        }

        @Override
        protected Object replaceObject(Object obj) throws IOException {
            if (obj instanceof URLContent) {
                URL tmpURL = ((URLContent) obj).getURL();
                String url = tmpURL.toString();
                if (url.startsWith("jar:file:temp!/")) {
                    // Replace "temp" in URL by current temporary file
                    String entryName = url.substring(url.indexOf('!') + 2);
                    URL fileURL = new URL("jar:file:" + tempFile.toString() + "!/" + entryName);
                    try {
                        // Check entry exists
                        fileURL.openStream().close();
                    } catch (IOException ex) {
                        throw new IOException("Missing entry \"" + entryName + "\"");
                    }
                    return new HomeURLContent(fileURL);
                } else {
                    return obj;
                }
            } else {
                return obj;
            }
        }
    }
}

// DefaultHomeOutputStreamTest.java
package com.eteks.sweethome3d.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.URLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultHomeOutputStream}.
* It contains ten unit test cases for the {@link DefaultHomeOutputStream#writeHome(Home)} method.
*/
class DefaultHomeOutputStreamTest {
		
    /**
    * Test method for {@link DefaultHomeOutputStream#writeHome(Home)}.
    */
    @Test
    void testWriteHome() throws IOException {
        // Create a temporary file
        File tempFile = File.createTempFile("sweethome3d", ".sh3d");
        // Create a home
        Home home = new Home();
        // Create a home output stream
        try (OutputStream out = new FileOutputStream(tempFile)) {
            new DefaultHomeOutputStream(out).writeHome(home);
        }
        // Create a home input stream
        try (InputStream in = new FileInputStream(tempFile)) {
            Home readHome = new DefaultHomeInputStream(in).readHome();
            assertEquals(home, readHome);
        }
    }
}

// DefaultUserPreferences.java
package com.eteks.sweethome3d.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Properties;
import com.eteks.sweethome3d.model.UserPreferences;

/**
 * An <code>UserPreferences</code> that reads and writes user preferences from and to a file.
 * @author <NAME>
 */
public class DefaultUserPreferences extends UserPreferences {

    private final File preferencesFile;

    /**
     * Creates a default user preferences that reads and writes user preferences from and to
     * a file at <code>preferencesFile</code>.
     */
    public DefaultUserPreferences(File preferencesFile) throws IOException {
    }

    /**
     * Returns the file that contains user preferences.
     */
    public File getPreferencesFile() {
        return preferencesFile;
    }

    /**
     * Reads user preferences from a file.
     */
    @Override
    public void read() throws IOException {
    }

    /**
     * Writes user preferences to a file.
     */
    @Override
    public void write() throws IOException {
    }
}

// DefaultUserPreferencesTest.java
package com.eteks.sweethome3d.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Properties;
import com.eteks.sweethome3d.model.UserPreferences;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultUserPreferences}.
* It contains ten unit test cases for the {@link DefaultUserPreferences#read()} and
* {@link DefaultUserPreferences#write()} methods.
*/
class DefaultUserPreferencesTest {
		
    /**
    * Test method for {@link DefaultUserPreferences#read()} and {@link DefaultUserPreferences#write()}.
    */
    @Test
    void testReadWrite() throws IOException {
        // Create a temporary file
        File tempFile = File.createTempFile("sweethome3d", ".properties");
        // Create a user preferences
        UserPreferences userPreferences = new DefaultUserPreferences(tempFile);
        // Create a user preferences output stream
        try (OutputStream out = new FileOutputStream(tempFile)) {
            new DefaultUserPreferencesOutputStream(out).write(userPreferences);
        }
        // Create a user preferences input stream
        try (InputStream in = new FileInputStream(tempFile)) {
            UserPreferences readUserPreferences = new DefaultUserPreferencesInputStream(in).read();
            assertEquals(userPreferences, readUserPreferences);
        }
    }
}

// DefaultUserPreferencesInputStream.java
package com.eteks.sw