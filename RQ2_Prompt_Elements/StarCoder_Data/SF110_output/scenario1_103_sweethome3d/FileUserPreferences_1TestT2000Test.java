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

    @Test
    void testTexturesLibraryExists() throws RecorderException {
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        fileUserPreferences.setPluginPreferences(new Preferences() {
            @Override
            public void put(String key, String value) {
            }

            @Override
            public String get(String key, String def) {
                return null;
            }

            @Override
            public void remove(String key) {
            }

            @Override
            public void clear() throws BackingStoreException {
            }

            @Override
            public void putInt(String key, int value) {
            }

            @Override
            public int getInt(String key, int def) {
                return 0;
            }

            @Override
            public void putLong(String key, long value) {
            }

            @Override
            public long getLong(String key, long def) {
                return 0;
            }

            @Override
            public void putBoolean(String key, boolean value) {
            }

            @Override
            public boolean getBoolean(String key, boolean def) {
                return false;
            }

            @Override
            public void putFloat(String key, float value) {
            }

            @Override
            public float getFloat(String key, float def) {
                return 0;
            }

            @Override
            public void putDouble(String key, double value) {
            }

            @Override
            public double getDouble(String key, double def) {
                return 0;
            }

            @Override
            public void putByteArray(String key, byte[] value) {
            }

            @Override
            public byte[] getByteArray(String key, byte[] def) {
                return new byte[0];
            }

            @Override
            public String[] keys() throws BackingStoreException {
                return new String[0];
            }

            @Override
            public String[] childrenNames() throws BackingStoreException {
                return new String[0];
            }

            @Override
            public Preferences parent() {
                return null;
            }

            @Override
            public Preferences node(String pathName) {
                return null;
            }

            @Override
            public boolean nodeExists(String pathName) throws BackingStoreException {
                return false;
            }

            @Override
            public void removeNode() throws BackingStoreException {
            }

            @Override
            public String name() {
                return null;
            }

            @Override
            public String absolutePath() {
                return null;
            }

            @Override
            public boolean isUserNode() {
                return false;
            }

            @Override
            public String toString() {
                return null;
            }

            @Override
            public void addPreferenceChangeListener(PreferenceChangeListener pcl) {
            }

            @Override
            public void removePreferenceChangeListener(PreferenceChangeListener pcl) {
            }

            @Override
            public void addNodeChangeListener(NodeChangeListener ncl) {
            }

            @Override
            public void removeNodeChangeListener(NodeChangeListener ncl) {
            }

            @Override
            public void addPreferenceChangeListener(String s, PreferenceChangeListener pcl) {
            }

            @Override
            public void removePreferenceChangeListener(String s, PreferenceChangeListener pcl) {
            }

            @Override
            public void sync() throws BackingStoreException {
            }

            @Override
            public void flush() throws BackingStoreException {
            }
        });
        assertFalse(fileUserPreferences.texturesLibraryExists("texturesLibrary.zip"));
    }
}

// FileUserPreferences_2Test.java
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
class FileUserPreferences_2Test {
		
    @Test
    void testTexturesLibraryExists() throws RecorderException {
        FileUserPreferences fileUserPreferences = new FileUserPreferences();
        fileUserPreferences.setPluginPreferences(new Preferences() {
            @Override
            public void put(String key, String value) {
            }

            @Override
            public String get(String key, String def) {
                return null;
            }

            @Override
            public void remove(String key) {
            }

            @Override
            public void clear() throws BackingStoreException {
            }

            @Override
            public void putInt(String key, int value) {
            }

            @Override
            public int getInt(String key, int def) {
                return 0;
            }

            @Override
            public void putLong(String key, long value) {
            }

            @Override
            public long getLong(String key, long def) {
                return 0;
            }

            @Override
            public void putBoolean(String key, boolean value) {
            }

            @Override
            public boolean getBoolean(String key, boolean def) {
                return false;
            }

            @Override
            public void putFloat(String key, float value) {
            }

            @Override
            public float getFloat(String key, float def) {
                return 0;
            }

            @Override
            public void putDouble(String key, double value) {
            }

            @Override
            public double getDouble(String key, double def) {
                return 0;
            }

            @Override
            public void putByteArray(String key, byte[] value) {
            }

            @Override
            public byte[] getByteArray(String key, byte[] def) {
                return new byte[0];
            }

            @Override
            public String[] keys() throws BackingStoreException {
                return new String[0];
            }

            @Override
            public String[] childrenNames() throws BackingStoreException {
                return new String[0];
            }

            @Override
            public Preferences parent() {
                return null;
            }

            @Override
            public Preferences node(String pathName) {
                return null;
            }

            @Override
            public boolean nodeExists(String pathName) throws BackingStoreException {
                return false;
            }

            @Override
            public void removeNode() throws BackingStoreException {
            }

            @Override
            public String name() {
                return null;
            }

            @Override
            public String absolutePath() {
                return null;
            }

            @Override
            public boolean isUserNode() {
                return false;
            }

            @Override
            public String toString() {
                return null;
            }

            @Override
            public void addPreferenceChangeListener(PreferenceChangeListener pcl) {
            }

            @Override
           