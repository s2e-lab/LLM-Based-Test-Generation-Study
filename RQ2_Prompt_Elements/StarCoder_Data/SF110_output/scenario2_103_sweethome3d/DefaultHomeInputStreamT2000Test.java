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
    // Create a home
    Home home = new Home();
    // Create a temporary file
    File tempFile = OperatingSystem.createTemporaryFile("home", ".sh3d");
    // Write home in it
    OutputStream out = new FileOutputStream(tempFile);
    try {
      new DefaultHomeOutputStream(out).writeHome(home);
    } finally {
      out.close();
    }
    // Read home from it
    InputStream in = new FileInputStream(tempFile);
    try {
      Home readHome = new DefaultHomeInputStream(in).readHome();
      // Check home
      assertEquals(home, readHome);
    } finally {
      in.close();
    }
  }
  
  /**
  * Tests the {@link DefaultHomeInputStream#readHome()} method.
  */
  @Test
  void testReadHomeWithContent() throws IOException, ClassNotFoundException {
    // Create a home
    Home home = new Home();
    // Create a temporary file
    File tempFile = OperatingSystem.createTemporaryFile("home", ".sh3d");
    // Write home in it
    OutputStream out = new FileOutputStream(tempFile);
    try {
      new DefaultHomeOutputStream(out).writeHome(home);
    } finally {
      out.close();
    }
    // Read home from it
    InputStream in = new FileInputStream(tempFile);
    try {
      Home readHome = new DefaultHomeInputStream(in, ContentRecording.INCLUDE_ALL_CONTENT).readHome();
      // Check home
      assertEquals(home, readHome);
      // Check content
      URLContent urlContent = (URLContent)readHome.getWallpaper();
      assertEquals("file", urlContent.getURL().getProtocol());
      assertEquals(tempFile.getParentFile().getAbsolutePath(), urlContent.getURL().getPath());
      assertEquals("wallpaper.png", urlContent.getURL().getFile());
    } finally {
      in.close();
    }
  }
  
  /**
  * Tests the {@link DefaultHomeInputStream#readHome()} method.
  */
  @Test
  void testReadHomeWithContentAndRelativeURL() throws IOException, ClassNotFoundException {
    // Create a home
    Home home = new Home();
    // Create a temporary file
    File tempFile = OperatingSystem.createTemporaryFile("home", ".sh3d");
    // Write home in it
    OutputStream out = new FileOutputStream(tempFile);
    try {
      new DefaultHomeOutputStream(out).writeHome(home);
    } finally {
      out.close();
    }
    // Read home from it
    InputStream in = new FileInputStream(tempFile);
    try {
      Home readHome = new DefaultHomeInputStream(in, ContentRecording.INCLUDE_ALL_CONTENT, true).readHome();
      // Check home
      assertEquals(home, readHome);
      // Check content
      URLContent urlContent = (URLContent)readHome.getWallpaper();
      assertEquals("file", urlContent.getURL().getProtocol());
      assertEquals(tempFile.getParentFile().getAbsolutePath(), urlContent.getURL().getPath());
      assertEquals("wallpaper.png", urlContent.getURL().getFile());
    } finally {
      in.close();
    }
  }
  
  /**
  * Tests the {@link DefaultHomeInputStream#readHome()} method.
  */
  @Test
  void testReadHomeWithContentAndRelativeURLAndBaseURL() throws IOException, ClassNotFoundException {
    // Create a home
    Home home = new Home();
    // Create a temporary file
    File tempFile = OperatingSystem.createTemporaryFile("home", ".sh3d");
    // Write home in it
    OutputStream out = new FileOutputStream(tempFile);
    try {
      new DefaultHomeOutputStream(out).writeHome(home);
    } finally {
      out.close();
    }
    // Read home from it
    InputStream in = new FileInputStream(tempFile);
    try {
      Home readHome = new DefaultHomeInputStream(in, ContentRecording.INCLUDE_ALL_CONTENT, true, new URL("http://www.example.com/homes/")).readHome();
      // Check home
      assertEquals(home, readHome);
      // Check content
      URLContent urlContent = (URLContent)readHome.getWallpaper();
      assertEquals("http", urlContent.getURL().getProtocol());
      assertEquals("www.example.com", urlContent.getURL().getHost());
      assertEquals("/homes/", urlContent.getURL().getPath());
      assertEquals("wallpaper.png", urlContent.getURL().getFile());
    } finally {
      in.close();
    }
  }
  
  /**
  * Tests the {@link DefaultHomeInputStream#readHome()} method.
  */
  @Test
  void testReadHomeWithContentAndRelativeURLAndBaseURLAndBaseURLPath() throws IOException, ClassNotFoundException {
    // Create a home
    Home home = new Home();
    // Create a temporary file
    File tempFile = OperatingSystem.createTemporaryFile("home", ".sh3d");
    // Write home in it
    OutputStream out = new FileOutputStream(tempFile);
    try {
      new DefaultHomeOutputStream(out).writeHome(home);
    } finally {
      out.close();
    }
    // Read home from it
    InputStream in = new FileInputStream(tempFile);
    try {
      Home readHome = new DefaultHomeInputStream(in, ContentRecording.INCLUDE_ALL_CONTENT, true, new URL("http://www.example.com/homes/"), "/homes/").readHome();
      // Check home
      assertEquals(home, readHome);
      // Check content
      URLContent urlContent = (URLContent)readHome.getWallpaper();
      assertEquals("http", urlContent.getURL().getProtocol());
      assertEquals("www.example.com", urlContent.getURL().getHost());
      assertEquals("/homes/", urlContent.getURL().getPath());
      assertEquals("wallpaper.png", urlContent.getURL().getFile());
    } finally {
      in.close();
    }
  }
  
  /**
  * Tests the {@link DefaultHomeInputStream#readHome()} method.
  */
  @Test
  void testReadHomeWithContentAndRelativeURLAndBaseURLAndBaseURLPathAndBaseURLFile() throws IOException, ClassNotFoundException {
    // Create a home
    Home home = new Home();
    // Create a temporary file
    File tempFile = OperatingSystem.createTemporaryFile("home", ".sh3d");
    // Write home in it
    OutputStream out = new FileOutputStream(tempFile);
    try {
      new DefaultHomeOutputStream(out).writeHome(home);
    } finally {
      out.close();
    }
    // Read home from it
    InputStream in = new FileInputStream(tempFile);
    try {
      Home readHome = new DefaultHomeInputStream(in, ContentRecording.INCLUDE_ALL_CONTENT, true, new URL("http://www.example.com/homes/"), "/homes/", "home.sh3d").readHome();
      // Check home
      assertEquals(home, readHome);
      // Check content
      URLContent urlContent = (URLContent)readHome.getWallpaper();
      assertEquals("http", urlContent.getURL().getProtocol());
      assertEquals("www.example.com", urlContent.getURL().getHost());
      assertEquals("/homes/", urlContent.getURL().getPath());
      assertEquals("wallpaper.png", urlContent.getURL().getFile());
    } finally {
      in.close();
    }
  }
  
  /**
  * Tests the {@link DefaultHomeInputStream#readHome()} method.
  */
  @Test
  void testReadHomeWithContentAndRelativeURLAndBaseURLAndBaseURLPathAndBaseURLFileAndBaseURLParameters() throws IOException, ClassNotFoundException {
    // Create a home
    Home home = new Home();
    // Create a temporary file
    File tempFile = OperatingSystem.createTemporaryFile("home", ".sh3d");
    // Write home in it
    OutputStream out = new FileOutputStream(tempFile);
    try {
      new DefaultHomeOutputStream(out).writeHome(home);
    } finally {
      out.close();
    }
    // Read home from it
    InputStream in = new FileInputStream(tempFile);
    try {
      Home readHome = new DefaultHomeInputStream(in, ContentRecording.INCLUDE_ALL_CONTENT, true, new URL("http://www.example.com/homes/"), "/homes/", "home.sh3d", "param1=value1&param2=value2").readHome();
      // Check home
      assertEquals(home, readHome);
      // Check content
      URLContent urlContent = (URLContent)readHome.getWallpaper();
      assertEquals("http", urlContent.getURL().getProtocol());
      assertEquals("www.example.com", urlContent.getURL().getHost());
      assertEquals("/homes/", urlContent.getURL().getPath());
      assertEquals("wallpaper.png", urlContent.getURL().getFile());
    } finally {
      in.close();
    }
  }
  
  /**
  * Tests the {@link DefaultHomeInputStream#readHome()} method.
  */
  @Test
  void testReadHomeWithContentAndRelativeURLAndBaseURLAndBaseURLPathAndBaseURLFileAndBaseURLParametersAndBaseURLRef() throws IOException, ClassNotFoundException {
    // Create a home
    Home home = new Home();
    // Create a temporary file
    File tempFile = OperatingSystem.createTemporaryFile("home", ".sh3d