// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {

	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference1() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference2() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference3() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference4() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference5() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference6() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference7() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference8() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference9() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference10() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
}

// HttpFileUtils.java
/*
 * GNU GENERAL PUBLIC LICENSE
 * Version 3, 29 June 2007
 * 
 * Copyright (C) 2010, vlad
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package httpanalyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author vlad
 */
public class HttpFileUtils {

    /**
     * Save properties to file
     * @param properties Properties
     * @param parentFrame JFrame
     */
    public void savePreferenceToFile(Properties properties, JFrame parentFrame) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setDialogTitle("Save preferences");
        fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
        fileChooser.setFileFilter(new HttpFileFilter("properties", "Properties files"));
        int result = fileChooser.showSaveDialog(parentFrame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!file.getName().endsWith(".properties")) {
                file = new File(file.getAbsolutePath() + ".properties");
            }
            try {
                FileOutputStream fos = new FileOutputStream(file);
                properties.store(fos, "HttpAnalyzer preferences");
                fos.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(parentFrame, "Error saving preferences to file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Load properties from file
     * @param parentFrame JFrame
     * @return Properties
     */
    public Properties loadPreferenceFromFile(JFrame parentFrame) {
        Properties properties = new Properties();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setDialogTitle("Load preferences");
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);
        fileChooser.setFileFilter(new HttpFileFilter("properties", "Properties files"));
        int result = fileChooser.showOpenDialog(parentFrame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileInputStream fis = new FileInputStream(file);
                properties.load(fis);
                fis.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(parentFrame, "Error loading preferences from file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return properties;
    }
}

// HttpFileFilter.java
/*
 * GNU GENERAL PUBLIC LICENSE
 * Version 3, 29 June 2007
 * 
 * Copyright (C) 2010, vlad
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package httpanalyzer;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 * @author vlad
 */
public class HttpFileFilter extends FileFilter {

    private String extension;
    private String description;

    /**
     * Constructor
     * @param extension String
     * @param description String
     */
    public HttpFileFilter(String extension, String description) {
        this.extension = extension;
        this.description = description;
    }

    /**
     * Accept file
     * @param f File
     * @return boolean
     */
    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String ext = getExtension(f);
        if (ext != null) {
            if (ext.equals(extension)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Get extension
     * @param f File
     * @return String
     */
    public String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');
        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toLowerCase();
        }
        return ext;
    }

    /**
     * Get description
     * @return String
     */
    @Override
    public String getDescription() {
        return description;
    }
}

// HttpFileUtilsTest.java
package httpanalyzer;

import java.io.File;
import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpFileUtils}.
* It contains ten unit test cases for the {@link HttpFileUtils#loadPreferenceFromFile(JFrame)} method.
*/
class HttpFileUtilsTest {
		
	/**
	 * Test of loadPreferenceFromFile method, of class HttpFileUtils.
	 */
	@Test
	void testLoadPreferenceFromFile() {
		System.out.println("loadPreferenceFromFile");
		JFrame parentFrame = new JFrame();
		HttpFileUtils instance = new HttpFileUtils();
		Properties expResult = new Properties();
		Properties result = instance.loadPreferenceFromFile(parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreferenceFromFile method, of class HttpFileUtils.
	 */
	@Test
	void testLoadPreferenceFromFile1() {
		System.out.println("loadPreferenceFromFile");
		JFrame parentFrame = new JFrame();
		HttpFileUtils instance = new HttpFileUtils();
		Properties expResult = new Properties();
		Properties result = instance.loadPreferenceFromFile(parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreferenceFromFile method, of class HttpFileUtils.
	 */
	@Test
	void testLoadPreferenceFromFile2() {
		System.out.println("loadPreferenceFromFile");
		JFrame parentFrame = new JFrame();
		HttpFileUtils instance = new HttpFileUtils();
		Properties expResult = new Properties();
		Properties result = instance.loadPreferenceFromFile(parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreferenceFromFile method, of class HttpFileUtils.
	 */
	@Test
	void testLoadPreferenceFromFile3() {
		System.out.println("loadPreferenceFromFile");
		JFrame parentFrame = new JFrame();
		HttpFileUtils instance = new HttpFileUtils();
		Properties expResult = new Properties();
		Properties result = instance.loadPreferenceFromFile(parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreferenceFromFile method, of class HttpFileUtils.
	 */
	@Test
	void testLoadPreferenceFromFile4() {
		System.out.println("loadPreferenceFromFile");
		JFrame parentFrame = new JFrame();
		HttpFileUtils instance = new HttpFileUtils();
		Properties expResult = new Properties();
		Properties result = instance.loadPreferenceFromFile(parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreferenceFromFile method, of class HttpFileUtils.
	 */
	@Test
	void testLoadPreferenceFromFile5() {
		System.out.println("loadPreferenceFromFile");
		JFrame parentFrame = new JFrame();
		HttpFileUtils instance = new HttpFileUtils();
		Properties expResult = new Properties();
		Properties result = instance.loadPreferenceFromFile(parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference