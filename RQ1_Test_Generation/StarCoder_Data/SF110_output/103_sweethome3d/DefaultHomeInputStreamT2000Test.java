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
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHome() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able to read home from a stream
        InputStream in = new DefaultHomeInputStream(new HomeOutputStream(home).writeHome());
        // Read home from stream
        Home readHome = new DefaultHomeInputStream(in).readHome();
        // Check home read from stream is equal to the home created
        assertEquals(home, readHome);
    }

    /**
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHomeWithContent() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able to read home from a stream
        InputStream in = new DefaultHomeInputStream(new HomeOutputStream(home).writeHome(), ContentRecording.INCLUDE_ALL_CONTENT);
        // Read home from stream
        Home readHome = new DefaultHomeInputStream(in).readHome();
        // Check home read from stream is equal to the home created
        assertEquals(home, readHome);
    }

    /**
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHomeWithContentAndTemporaryFile() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able to read home from a stream
        InputStream in = new DefaultHomeInputStream(new HomeOutputStream(home).writeHome(), ContentRecording.INCLUDE_ALL_CONTENT);
        // Read home from stream
        Home readHome = new DefaultHomeInputStream(in).readHome();
        // Check home read from stream is equal to the home created
        assertEquals(home, readHome);
    }

    /**
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHomeWithContentAndTemporaryFileAndContent() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able to read home from a stream
        InputStream in = new DefaultHomeInputStream(new HomeOutputStream(home).writeHome(), ContentRecording.INCLUDE_ALL_CONTENT);
        // Read home from stream
        Home readHome = new DefaultHomeInputStream(in).readHome();
        // Check home read from stream is equal to the home created
        assertEquals(home, readHome);
    }

    /**
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHomeWithContentAndTemporaryFileAndContentAndContentRecording() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able to read home from a stream
        InputStream in = new DefaultHomeInputStream(new HomeOutputStream(home).writeHome(), ContentRecording.INCLUDE_ALL_CONTENT);
        // Read home from stream
        Home readHome = new DefaultHomeInputStream(in).readHome();
        // Check home read from stream is equal to the home created
        assertEquals(home, readHome);
    }

    /**
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHomeWithContentAndTemporaryFileAndContentAndContentRecordingAndContentRecording() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able to read home from a stream
        InputStream in = new DefaultHomeInputStream(new HomeOutputStream(home).writeHome(), ContentRecording.INCLUDE_ALL_CONTENT);
        // Read home from stream
        Home readHome = new DefaultHomeInputStream(in).readHome();
        // Check home read from stream is equal to the home created
        assertEquals(home, readHome);
    }

    /**
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHomeWithContentAndTemporaryFileAndContentAndContentRecordingAndContentRecordingAndContentRecording() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able to read home from a stream
        InputStream in = new DefaultHomeInputStream(new HomeOutputStream(home).writeHome(), ContentRecording.INCLUDE_ALL_CONTENT);
        // Read home from stream
        Home readHome = new DefaultHomeInputStream(in).readHome();
        // Check home read from stream is equal to the home created
        assertEquals(home, readHome);
    }

    /**
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHomeWithContentAndTemporaryFileAndContentAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecording() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able to read home from a stream
        InputStream in = new DefaultHomeInputStream(new HomeOutputStream(home).writeHome(), ContentRecording.INCLUDE_ALL_CONTENT);
        // Read home from stream
        Home readHome = new DefaultHomeInputStream(in).readHome();
        // Check home read from stream is equal to the home created
        assertEquals(home, readHome);
    }

    /**
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHomeWithContentAndTemporaryFileAndContentAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecording() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able to read home from a stream
        InputStream in = new DefaultHomeInputStream(new HomeOutputStream(home).writeHome(), ContentRecording.INCLUDE_ALL_CONTENT);
        // Read home from stream
        Home readHome = new DefaultHomeInputStream(in).readHome();
        // Check home read from stream is equal to the home created
        assertEquals(home, readHome);
    }

    /**
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHomeWithContentAndTemporaryFileAndContentAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecording() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able to read home from a stream
        InputStream in = new DefaultHomeInputStream(new HomeOutputStream(home).writeHome(), ContentRecording.INCLUDE_ALL_CONTENT);
        // Read home from stream
        Home readHome = new DefaultHomeInputStream(in).readHome();
        // Check home read from stream is equal to the home created
        assertEquals(home, readHome);
    }

    /**
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHomeWithContentAndTemporaryFileAndContentAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecording() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able to read home from a stream
        InputStream in = new DefaultHomeInputStream(new HomeOutputStream(home).writeHome(), ContentRecording.INCLUDE_ALL_CONTENT);
        // Read home from stream
        Home readHome = new DefaultHomeInputStream(in).readHome();
        // Check home read from stream is equal to the home created
        assertEquals(home, readHome);
    }

    /**
     * Tests the {@link DefaultHomeInputStream#readHome()} method.
     */
    @Test
    void testReadHomeWithContentAndTemporaryFileAndContentAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecordingAndContentRecording() throws IOException, ClassNotFoundException {
        // Create a home with a single room
        Home home = new Home();
        home.addRoom(new com.eteks.sweethome3d.model.Room());
        // Create a home input stream filter able