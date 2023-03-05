// SettingsTest0.java
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
class SettingsTest0 {

	/**
	* Test case for {@link Settings#save()}.
	* It tests if the method saves the settings correctly.
	*/
	@Test
	void testSave() {
		Settings settings = new Settings(new Model());
		settings.setTimeInterval(10);
		settings.setPriceSteps(10);
		settings.setCurrency("�");
		settings.setStandardLogic(true);
		settings.setBackgroundImagePath("C:\\Users\\User\\Desktop\\background.jpg");
		settings.setMessage("Das ist eine Standard-Nachrichtf�r das Laufband!");
		settings.setMessageSpeed(10);
		File file = settings.save();
		try {
			SAXBuilder builder = new SAXBuilder();
			Document settingsDoc = builder.build(file);
			Element settingsRoot = settingsDoc.getRootElement();
			assertEquals(10, Integer.valueOf(settingsRoot.getChildText("timeInterval")));
			assertEquals(10, Integer.valueOf(settingsRoot.getChildText("priceSteps")));
			assertEquals("�", settingsRoot.getChildText("currency"));
			assertEquals("C:\\Users\\User\\Desktop\\background.jpg", settingsRoot.getChildText("backgound"));
			assertEquals("y", settingsRoot.getChildText("standardLogic"));
			assertEquals("Das ist eine Standard-Nachrichtf�r das Laufband!", settingsRoot.getChildText("message"));
			assertEquals("10", settingsRoot.getChildText("messageSpeed"));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}

// SettingsTest1.java
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
class SettingsTest1 {
		
	/**
	* Test case for {@link Settings#save()}.
	* It tests if the method saves the settings correctly.
	*/
	@Test
	void testSave() {
		Settings settings = new Settings(new Model());
		settings.setTimeInterval(10);
		settings.setPriceSteps(10);
		settings.setCurrency("�");
		settings.setStandardLogic(true);
		settings.setBackgroundImagePath("C:\\Users\\User\\Desktop\\background.jpg");
		settings.setMessage("Das ist eine Standard-Nachrichtf�r das Laufband!");
		settings.setMessageSpeed(10);
		File file = settings.save();
		try {
			SAXBuilder builder = new SAXBuilder();
			Document settingsDoc = builder.build(file);
			Element settingsRoot = settingsDoc.getRootElement();
			assertEquals(10, Integer.valueOf(settingsRoot.getChildText("timeInterval")));
			assertEquals(10, Integer.valueOf(settingsRoot.getChildText("priceSteps")));
			assertEquals("�", settingsRoot.getChildText("currency"));
			assertEquals("C:\\Users\\User\\Desktop\\background.jpg", settingsRoot.getChildText("backgound"));
			assertEquals("y", settingsRoot.getChildText("standardLogic"));
			assertEquals("Das ist eine Standard-Nachrichtf�r das Laufband!", settingsRoot.getChildText("message"));
			assertEquals("10", settingsRoot.getChildText("messageSpeed"));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}

// SettingsTest2.java
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
class SettingsTest2 {
		
	/**
	* Test case for {@link Settings#save()}.
	* It tests if the method saves the settings correctly.
	*/
	@Test
	void testSave() {
		Settings settings = new Settings(new Model());
		settings.setTimeInterval(10);
		settings.setPriceSteps(10);
		settings.setCurrency("�");
		settings.setStandardLogic(true);
		settings.setBackgroundImagePath("C:\\Users\\User\\Desktop\\background.jpg");
		settings.setMessage("Das ist eine Standard-Nachrichtf�r das Laufband!");
		settings.setMessageSpeed(10);
		File file = settings.save();
		try {
			SAXBuilder builder = new SAXBuilder();
			Document settingsDoc = builder.build(file);
			Element settingsRoot = settingsDoc.getRootElement();
			assertEquals(10, Integer.valueOf(settingsRoot.getChildText("timeInterval")));
			assertEquals(10, Integer.valueOf(settingsRoot.getChildText("priceSteps")));
			assertEquals("�", settingsRoot.getChildText("currency"));
			assertEquals("C:\\Users\\User\\Desktop\\background.jpg", settingsRoot.getChildText("backgound"));
			assertEquals("y", settingsRoot.getChildText("standardLogic"));
			assertEquals("Das ist eine Standard-Nachrichtf�r das Laufband!", settingsRoot.getChildText("message"));
			assertEquals("10", settingsRoot.getChildText("messageSpeed"));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}

// SettingsTest3.java
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
class SettingsTest3 {
		
	/**
	* Test case for {@link Settings#save()}.
	* It tests if the method saves the settings correctly.
	*/
	@Test
	void testSave() {
		Settings settings = new Settings(new Model());
		settings.setTimeInterval(10);
		settings.setPriceSteps(10);
		settings.setCurrency("�");
		settings.setStandardLogic(true);
		settings.setBackgroundImagePath("C:\\Users\\User\\Desktop\\background.jpg");
		settings.setMessage("Das ist eine Standard-Nachrichtf�r das Laufband!");
		settings.setMessageSpeed(10);
		File file = settings.save();
		try {
			SAXBuilder builder = new SAXBuilder();
			Document settingsDoc = builder.build(file);
			Element settingsRoot = settingsDoc.get