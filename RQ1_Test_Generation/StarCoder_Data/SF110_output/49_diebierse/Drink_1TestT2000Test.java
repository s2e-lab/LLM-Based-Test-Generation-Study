// Drink_1Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains ten unit test cases for the {@link Drink#save()} method.
*/
class Drink_1Test {

    /**
    * Test case for {@link Drink#save()}
    * @throws Exception
    */
    @Test
    void testSave() throws Exception {
        Model model = new Model();
        Drink drink = new Drink("Test", model);
        drink.setMinPrice(10);
        drink.setMaxPrice(20);
        drink.setStartPrice(15);
        drink.setTargetAmount(15);
        drink.setDeltaAmount(5);
        drink.setMaxStep(5);
        drink.setUsed(true);
        drink.setKey(KeyEvent.VK_F1);
        File file = drink.save();
        assertTrue(file.exists());
        assertTrue(file.isFile());
        assertTrue(file.getName().endsWith(".xml"));
        assertTrue(file.getName().startsWith("Test"));
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(file);
        Element root = doc.getRootElement();
        assertEquals("10", root.getChildText("minPrice"));
        assertEquals("15", root.getChildText("startPrice"));
        assertEquals("20", root.getChildText("maxPrice"));
        assertEquals("15", root.getChildText("targetAmount"));
        assertEquals("5", root.getChildText("deltaAmount"));
        assertEquals("5", root.getChildText("maxStep"));
        assertEquals("true", root.getChildText("used"));
        assertEquals("112", root.getChildText("key"));
    }
}

// Drink_2Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains ten unit test cases for the {@link Drink#save()} method.
*/
class Drink_2Test {
		
    /**
    * Test case for {@link Drink#save()}
    * @throws Exception
    */
    @Test
    void testSave() throws Exception {
        Model model = new Model();
        Drink drink = new Drink("Test", model);
        drink.setMinPrice(10);
        drink.setMaxPrice(20);
        drink.setStartPrice(15);
        drink.setTargetAmount(15);
        drink.setDeltaAmount(5);
        drink.setMaxStep(5);
        drink.setUsed(false);
        drink.setKey(KeyEvent.VK_F1);
        File file = drink.save();
        assertTrue(file.exists());
        assertTrue(file.isFile());
        assertTrue(file.getName().endsWith(".xml"));
        assertTrue(file.getName().startsWith("Test"));
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(file);
        Element root = doc.getRootElement();
        assertEquals("10", root.getChildText("minPrice"));
        assertEquals("15", root.getChildText("startPrice"));
        assertEquals("20", root.getChildText("maxPrice"));
        assertEquals("15", root.getChildText("targetAmount"));
        assertEquals("5", root.getChildText("deltaAmount"));
        assertEquals("5", root.getChildText("maxStep"));
        assertEquals("false", root.getChildText("used"));
        assertEquals("112", root.getChildText("key"));
    }
}

// Drink_3Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains ten unit test cases for the {@link Drink#save()} method.
*/
class Drink_3Test {
		
    /**
    * Test case for {@link Drink#save()}
    * @throws Exception
    */
    @Test
    void testSave() throws Exception {
        Model model = new Model();
        Drink drink = new Drink("Test", model);
        drink.setMinPrice(10);
        drink.setMaxPrice(20);
        drink.setStartPrice(15);
        drink.setTargetAmount(15);
        drink.setDeltaAmount(5);
        drink.setMaxStep(5);
        drink.setUsed(true);
        drink.setKey(KeyEvent.VK_F2);
        File file = drink.save();
        assertTrue(file.exists());
        assertTrue(file.isFile());
        assertTrue(file.getName().endsWith(".xml"));
        assertTrue(file.getName().startsWith("Test"));
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(file);
        Element root = doc.getRootElement();
        assertEquals("10", root.getChildText("minPrice"));
        assertEquals("15", root.getChildText("startPrice"));
        assertEquals("20", root.getChildText("maxPrice"));
        assertEquals("15", root.getChildText("targetAmount"));
        assertEquals("5", root.getChildText("deltaAmount"));
        assertEquals("5", root.getChildText("maxStep"));
        assertEquals("true", root.getChildText("used"));
        assertEquals("113", root.getChildText("key"));
    }
}

// Drink_4Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains ten unit test cases for the {@link Drink#save()} method.
*/
class Drink_4Test {
		
    /**
    * Test case for {@link Drink#save()}
    * @throws Exception
    */
    @Test
    void testSave() throws Exception {
        Model model = new Model();
        Drink drink = new Drink("Test", model);
        drink.setMinPrice(10);
        drink.setMaxPrice(20);
        drink.setStartPrice(15);
        drink.setTargetAmount(15);
        drink.setDeltaAmount(5);
        drink.setMaxStep(5);
        drink.setUsed(false);
        drink.setKey(KeyEvent.VK_F2);
        File file = drink.save();
        assertTrue(file.exists());
        assertTrue(file.isFile());
        assertTrue(file.getName().endsWith(".xml"));
        assertTrue(file.getName().startsWith("Test"));
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(file);
        Element root = doc.getRootElement();
        assertEquals("10", root.getChildText("minPrice"));
        assertEquals("15", root.getChildText("startPrice"));
        assertEquals("20", root.getChildText("maxPrice"));
        assertEquals("15", root.getChildText("targetAmount"));
        assertEquals("5", root.getChildText("deltaAmount"));
        assertEquals("5", root.getChildText("maxStep"));
        assertEquals("false", root.getChildText("used"));
        assertEquals("113", root.getChildText("key"));
    }
}

// Drink_5Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains ten unit test cases for the {@link Drink#save()} method.
*/
class Drink_5Test {
		
    /**
    * Test case for {@link Drink#save()}
    * @throws Exception
    */
    @Test
    void testSave() throws Exception {
        Model model =