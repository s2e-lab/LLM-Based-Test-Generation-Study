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
    * Test case for {@link Settings#save()}:
    * <ul>
    * <li>Test case for saving settings with default values.</li>
    * </ul>
    */
    @Test
    void testSaveDefault() {
        Settings settings = new Settings();
        settings.save();
        File file = new File(Settings.SETTINGS_FOLDER + "settings.xml");
        assertTrue(file.exists());
        // Load settings from file
        SAXBuilder builder = new SAXBuilder();
        try {
            Document doc = builder.build(file);
            Element root = doc.getRootElement();
            assertEquals(Settings.DOM_SETTINGS_ROOT, root.getName());
            assertEquals(Settings.DOM_TIME_INTERVAL, root.getChild(Settings.DOM_TIME_INTERVAL).getName());
            assertEquals(Settings.DOM_PRICE_STEPS, root.getChild(Settings.DOM_PRICE_STEPS).getName());
            assertEquals(Settings.DOM_CURRENCY, root.getChild(Settings.DOM_CURRENCY).getName());
            assertEquals(Settings.DOM_BACKGROUND_IMG, root.getChild(Settings.DOM_BACKGROUND_IMG).getName());
            assertEquals(Settings.DOM_STANDARD_LOGIC, root.getChild(Settings.DOM_STANDARD_LOGIC).getName());
            assertEquals(Settings.DOM_MESSAGE, root.getChild(Settings.DOM_MESSAGE).getName());
            assertEquals(Settings.DOM_MESSAGE_SPEED, root.getChild(Settings.DOM_MESSAGE_SPEED).getName());
            assertEquals(Settings.DEFAULT_TIME_INTERVAL, Integer.parseInt(root.getChild(Settings.DOM_TIME_INTERVAL).getText()));
            assertEquals(Settings.DEFAULT_PRICE_STEPS, Integer.parseInt(root.getChild(Settings.DOM_PRICE_STEPS).getText()));
            assertEquals(Settings.DEFAULT_CURRENCY, root.getChild(Settings.DOM_CURRENCY).getText());
            assertEquals(Settings.DEFAULT_BACKGROUND_IMG, root.getChild(Settings.DOM_BACKGROUND_IMG).getText());
            assertEquals(Settings.DEFAULT_STANDARD_LOGIC, root.getChild(Settings.DOM_STANDARD_LOGIC).getText());
            assertEquals(Settings.DEFAULT_MESSAGE, root.getChild(Settings.DOM_MESSAGE).getText());
            assertEquals(Settings.DEFAULT_MESSAGE_SPEED, Integer.parseInt(root.getChild(Settings.DOM_MESSAGE_SPEED).getText()));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link Settings#save()}:
    * <ul>
    * <li>Test case for saving settings with custom values.</li>
    * </ul>
    */
    @Test
    void testSaveCustom() {
        Settings settings = new Settings();
        settings.setTimeInterval(10);
        settings.setPriceSteps(10);
        settings.setCurrency("EUR");
        settings.setBackgroundImagePath("test.png");
        settings.setStandardLogic(true);
        settings.setMessage("test");
        settings.setMessageSpeed(10);
        settings.save();
        File file = new File(Settings.SETTINGS_FOLDER + "settings.xml");
        assertTrue(file.exists());
        // Load settings from file
        SAXBuilder builder = new SAXBuilder();
        try {
            Document doc = builder.build(file);
            Element root = doc.getRootElement();
            assertEquals(Settings.DOM_SETTINGS_ROOT, root.getName());
            assertEquals(Settings.DOM_TIME_INTERVAL, root.getChild(Settings.DOM_TIME_INTERVAL).getName());
            assertEquals(Settings.DOM_PRICE_STEPS, root.getChild(Settings.DOM_PRICE_STEPS).getName());
            assertEquals(Settings.DOM_CURRENCY, root.getChild(Settings.DOM_CURRENCY).getName());
            assertEquals(Settings.DOM_BACKGROUND_IMG, root.getChild(Settings.DOM_BACKGROUND_IMG).getName());
            assertEquals(Settings.DOM_STANDARD_LOGIC, root.getChild(Settings.DOM_STANDARD_LOGIC).getName());
            assertEquals(Settings.DOM_MESSAGE, root.getChild(Settings.DOM_MESSAGE).getName());
            assertEquals(Settings.DOM_MESSAGE_SPEED, root.getChild(Settings.DOM_MESSAGE_SPEED).getName());
            assertEquals(10, Integer.parseInt(root.getChild(Settings.DOM_TIME_INTERVAL).getText()));
            assertEquals(10, Integer.parseInt(root.getChild(Settings.DOM_PRICE_STEPS).getText()));
            assertEquals("EUR", root.getChild(Settings.DOM_CURRENCY).getText());
            assertEquals("test.png", root.getChild(Settings.DOM_BACKGROUND_IMG).getText());
            assertEquals(Settings.DOM_YES, root.getChild(Settings.DOM_STANDARD_LOGIC).getText());
            assertEquals("test", root.getChild(Settings.DOM_MESSAGE).getText());
            assertEquals(10, Integer.parseInt(root.getChild(Settings.DOM_MESSAGE_SPEED).getText()));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
