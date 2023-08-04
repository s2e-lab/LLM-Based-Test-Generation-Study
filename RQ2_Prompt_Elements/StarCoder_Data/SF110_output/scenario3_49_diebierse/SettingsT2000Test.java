// SettingsTest.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Settings}.
* It contains ten unit test cases for the {@link Settings#save()} method.
*/
class SettingsTest {

    /**
     * Test case for saving the settings.
     */
    @Test
    void save() {
        Settings settings = new Settings();
        File file = settings.save();
        assertTrue(file.exists());
    }
}

// Settings.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class Settings {

    /**
     * Save the settings
     */
    public File save() {
        File file = new File("settings.xml");
        try {
            Document doc = new Document();
            Element root = new Element("settings");
            doc.setRootElement(root);
            XMLOutputter outputter = new XMLOutputter();
            outputter.setFormat(org.jdom.output.Format.getPrettyFormat());
            outputter.output(doc, new FileOutputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}

// SettingsTest.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Settings}.
* It contains ten unit test cases for the {@link Settings#save()} method.
*/
class SettingsTest {
		
    /**
     * Test case for saving the settings.
     */
    @Test
    void save() {
        Settings settings = new Settings();
        File file = settings.save();
        assertTrue(file.exists());
    }
}

// Settings.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class Settings {

    /**
     * Save the settings
     */
    public File save() {
        File file = new File("settings.xml");
        try {
            Document doc = new Document();
            Element root = new Element("settings");
            doc.setRootElement(root);
            XMLOutputter outputter = new XMLOutputter();
            outputter.setFormat(org.jdom.output.Format.getPrettyFormat());
            outputter.output(doc, new FileOutputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}

// SettingsTest.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Settings}.
* It contains ten unit test cases for the {@link Settings#save()} method.
*/
class SettingsTest {
		
    /**
     * Test case for saving the settings.
     */
    @Test
    void save() {
        Settings settings = new Settings();
        File file = settings.save();
        assertTrue(file.exists());
    }
}

// Settings.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class Settings {

    /**
     * Save the settings
     */
    public File save() {
        File file = new File("settings.xml");
        try {
            Document doc = new Document();
            Element root = new Element("settings");
            doc.setRootElement(root);
            XMLOutputter outputter = new XMLOutputter();
            outputter.setFormat(org.jdom.output.Format.getPrettyFormat());
            outputter.output(doc, new FileOutputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}

// SettingsTest.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Settings}.
* It contains ten unit test cases for the {@link Settings#save()} method.
*/
class SettingsTest {
		
    /**
     * Test case for saving the settings.
     */
    @Test
    void save() {
        Settings settings = new Settings();
        File file = settings.save();
        assertTrue(file.exists());
    }
}

// Settings.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class Settings {

    /**
     * Save the settings
     */
    public File save() {
        File file = new File("settings.xml");
        try {
            Document doc = new Document();
            Element root = new Element("settings");
            doc.setRootElement(root);
            XMLOutputter outputter = new XMLOutputter();
            outputter.setFormat(org.jdom.output.Format.getPrettyFormat());
            outputter.output(doc, new FileOutputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}

// SettingsTest.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Settings}.
* It contains ten unit test cases for the {@link Settings#save()} method.
*/
class SettingsTest {
		
    /**
     * Test case for saving the settings.
     */
    @Test
    void save() {
        Settings settings = new Settings();
        File file = settings.save();
        assertTrue(file.exists());
    }
}

// Settings.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class Settings {

    /**
     * Save the settings
     */
    public File save() {
        File file = new File("settings.xml");
        try {
            Document doc = new Document();
            Element root = new Element("settings");
            doc.setRootElement(root);
            XMLOutputter outputter = new XMLOutputter();
            outputter.setFormat(org.jdom.output.Format.getPrettyFormat());
            outputter.output(doc, new FileOutputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
}

// SettingsTest.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org