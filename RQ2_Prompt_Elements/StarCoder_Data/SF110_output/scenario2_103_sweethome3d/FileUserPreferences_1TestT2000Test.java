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
        assertTrue(fileUserPreferences.texturesLibraryExists("textures/library/textures.library"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.zip"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.jar"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.rar"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.gz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.bz2"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.xz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.lzma"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.lz"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.lzo"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.z"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.Z"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7Z"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.001"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.002"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.003"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.004"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.005"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.006"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.007"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.008"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.009"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.010"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.011"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.012"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.013"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.014"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.015"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.016"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.017"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.018"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.019"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.020"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.021"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.022"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.023"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.024"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.025"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.026"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.027"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.028"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.029"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.030"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.031"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.032"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.033"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.034"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.035"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.036"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.037"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.038"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.039"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.040"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.041"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.042"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.043"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.044"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.045"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.046"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.047"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.048"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.049"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.050"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.051"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.052"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.053"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.054"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.055"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.056"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.library.tar.7z.057"));
        assertFalse(fileUserPreferences.texturesLibraryExists("textures/library/textures.