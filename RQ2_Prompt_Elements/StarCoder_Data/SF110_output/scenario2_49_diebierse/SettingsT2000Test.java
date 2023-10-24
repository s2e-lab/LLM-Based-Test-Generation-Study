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
        settings.setTimeInterval(10);
        settings.setPriceSteps(10);
        settings.setCurrency("EUR");
        settings.setBackgroundImagePath("background.png");
        settings.setStandardLogic(true);
        settings.setMessage("message");
        settings.setMessageSpeed(10);
        File file = settings.save();
        assertTrue(file.exists());
        assertTrue(file.isFile());
        assertTrue(file.canRead());
        assertTrue(file.canWrite());
        assertTrue(file.length() > 0);
        // Read settings from file
        SAXBuilder builder = new SAXBuilder();
        try {
            Document doc = builder.build(file);
            Element root = doc.getRootElement();
            assertEquals(10, Integer.parseInt(root.getChildText(Settings.DOM_TIME_INTERVAL)));
            assertEquals(10, Integer.parseInt(root.getChildText(Settings.DOM_PRICE_STEPS)));
            assertEquals("EUR", root.getChildText(Settings.DOM_CURRENCY));
            assertEquals("background.png", root.getChildText(Settings.DOM_BACKGROUND_IMG));
            assertEquals("message", root.getChildText(Settings.DOM_MESSAGE));
            assertEquals(10, Integer.parseInt(root.getChildText(Settings.DOM_MESSAGE_SPEED)));
            assertEquals("true", root.getChildText(Settings.DOM_STANDARD_LOGIC));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
