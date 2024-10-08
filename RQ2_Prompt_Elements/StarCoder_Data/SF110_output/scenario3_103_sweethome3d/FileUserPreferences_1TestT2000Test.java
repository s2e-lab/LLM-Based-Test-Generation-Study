// FileUserPreferences_1Test.java
package com.eteks.sweethome3d.io;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.prefs.AbstractPreferences;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.eteks.sweethome3d.model.CatalogDoorOrWindow;
import com.eteks.sweethome3d.model.CatalogPieceOfFurniture;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.FurnitureCatalog;
import com.eteks.sweethome3d.model.FurnitureCategory;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.PatternsCatalog;
import com.eteks.sweethome3d.model.RecorderException;
import com.eteks.sweethome3d.model.Sash;
import com.eteks.sweethome3d.model.TexturesCatalog;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileUserPreferences}.
* It contains ten unit test cases for the {@link FileUserPreferences#texturesLibraryExists(String)} method.
*/
class FileUserPreferences_1Test {

    /**
     * Test method for {@link FileUserPreferences#texturesLibraryExists(String)}.
     */
    @Test
    void testTexturesLibraryExists() throws RecorderException {
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        fileUserPreferences.setHomeDirectory(new File("test"));
        fileUserPreferences.setTexturesLibrariesFolders(new File[] {new File("test/texturesLibraries")});
        assertTrue(fileUserPreferences.texturesLibraryExists("test.sh3d"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.zip"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.zip"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.jar"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.jar"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.rar"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.rar"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.gz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.gz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.bz2"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.bz2"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.Z"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.Z"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.z"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.z"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.sh3d.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("test.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibrary