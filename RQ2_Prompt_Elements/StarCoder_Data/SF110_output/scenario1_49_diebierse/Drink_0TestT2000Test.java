// Drink_0Test.java
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
* It contains ten unit test cases for the {@link Drink#recalculate()} method.
*/
class Drink_0Test {

    /**
    * Test of {@link Drink#recalculate()} method, of class Drink.
    */
    @Test
    void testRecalculate_0() {
        System.out.println("recalculate");
        Drink drink = new Drink();
        drink.model = new Model();
        drink.model.setIteration(1);
        drink.model.setSettings(new Settings());
        drink.model.getSettings().setPriceSteps(10);
        drink.model.getSettings().setStandardLogic(true);
        drink.model.getSettings().setMinPrice(10);
        drink.model.getSettings().setMaxPrice(100);
        drink.model.getSettings().setMaxStep(10);
        drink.model.getSettings().setDeltaAmount(10);
        drink.model.getSettings().setTargetAmount(100);
        drink.model.getLog().setDebug(true);
        drink.name = "Test";
        drink.lastSold = 10;
        drink.totalSold = 100;
        drink.averageAmount = 10;
        drink.averagePrice = 10;
        drink.averageSoldPrice = 10;
        drink.currentPrice = 10;
        drink.directPrice = 0;
        drink.keepPrice = false;
        drink.trend = 0;
        drink.maxPrice = 100;
        drink.minPrice = 10;
        drink.maxStep = 10;
        drink.deltaAmount = 10;
        drink.targetAmount = 100;
        int expResult = 10;
        int result = drink.recalculate();
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link Drink#recalculate()} method, of class Drink.
    */
    @Test
    void testRecalculate_1() {
        System.out.println("recalculate");
        Drink drink = new Drink();
        drink.model = new Model();
        drink.model.setIteration(1);
        drink.model.setSettings(new Settings());
        drink.model.getSettings().setPriceSteps(10);
        drink.model.getSettings().setStandardLogic(true);
        drink.model.getSettings().setMinPrice(10);
        drink.model.getSettings().setMaxPrice(100);
        drink.model.getSettings().setMaxStep(10);
        drink.model.getSettings().setDeltaAmount(10);
        drink.model.getSettings().setTargetAmount(100);
        drink.model.getLog().setDebug(true);
        drink.name = "Test";
        drink.lastSold = 10;
        drink.totalSold = 100;
        drink.averageAmount = 10;
        drink.averagePrice = 10;
        drink.averageSoldPrice = 10;
        drink.currentPrice = 10;
        drink.directPrice = 0;
        drink.keepPrice = false;
        drink.trend = 0;
        drink.maxPrice = 100;
        drink.minPrice = 10;
        drink.maxStep = 10;
        drink.deltaAmount = 10;
        drink.targetAmount = 100;
        int expResult = 10;
        int result = drink.recalculate();
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link Drink#recalculate()} method, of class Drink.
    */
    @Test
    void testRecalculate_2() {
        System.out.println("recalculate");
        Drink drink = new Drink();
        drink.model = new Model();
        drink.model.setIteration(1);
        drink.model.setSettings(new Settings());
        drink.model.getSettings().setPriceSteps(10);
        drink.model.getSettings().setStandardLogic(true);
        drink.model.getSettings().setMinPrice(10);
        drink.model.getSettings().setMaxPrice(100);
        drink.model.getSettings().setMaxStep(10);
        drink.model.getSettings().setDeltaAmount(10);
        drink.model.getSettings().setTargetAmount(100);
        drink.model.getLog().setDebug(true);
        drink.name = "Test";
        drink.lastSold = 10;
        drink.totalSold = 100;
        drink.averageAmount = 10;
        drink.averagePrice = 10;
        drink.averageSoldPrice = 10;
        drink.currentPrice = 10;
        drink.directPrice = 0;
        drink.keepPrice = false;
        drink.trend = 0;
        drink.maxPrice = 100;
        drink.minPrice = 10;
        drink.maxStep = 10;
        drink.deltaAmount = 10;
        drink.targetAmount = 100;
        int expResult = 10;
        int result = drink.recalculate();
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link Drink#recalculate()} method, of class Drink.
    */
    @Test
    void testRecalculate_3() {
        System.out.println("recalculate");
        Drink drink = new Drink();
        drink.model = new Model();
        drink.model.setIteration(1);
        drink.model.setSettings(new Settings());
        drink.model.getSettings().setPriceSteps(10);
        drink.model.getSettings().setStandardLogic(true);
        drink.model.getSettings().setMinPrice(10);
        drink.model.getSettings().setMaxPrice(100);
        drink.model.getSettings().setMaxStep(10);
        drink.model.getSettings().setDeltaAmount(10);
        drink.model.getSettings().setTargetAmount(100);
        drink.model.getLog().setDebug(true);
        drink.name = "Test";
        drink.lastSold = 10;
        drink.totalSold = 100;
        drink.averageAmount = 10;
        drink.averagePrice = 10;
        drink.averageSoldPrice = 10;
        drink.currentPrice = 10;
        drink.directPrice = 0;
        drink.keepPrice = false;
        drink.trend = 0;
        drink.maxPrice = 100;
        drink.minPrice = 10;
        drink.maxStep = 10;
        drink.deltaAmount = 10;
        drink.targetAmount = 100;
        int expResult = 10;
        int result = drink.recalculate();
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link Drink#recalculate()} method, of class Drink.
    */
    @Test
    void testRecalculate_4() {
        System.out.println("recalculate");
        Drink drink = new Drink();
        drink.model = new Model();
        drink.model.setIteration(1);
        drink.model.setSettings(new Settings());
        drink.model.getSettings().setPriceSteps(10);
        drink.model.getSettings().setStandardLogic(true);
        drink.model.getSettings().setMinPrice(10);
        drink.model.getSettings().setMaxPrice(100);
        drink.model.getSettings().setMaxStep(10);
        drink.model.getSettings().setDeltaAmount(10);
        drink.model.getSettings().setTargetAmount(100);
        drink.model.getLog().setDebug(true);
        drink.name = "Test";
        drink.lastSold = 10;
        drink.totalSold = 100;
        drink.averageAmount = 10;
        drink.averagePrice = 10;
        drink.averageSoldPrice = 10;
        drink.currentPrice = 10;
        drink.directPrice = 0;
        drink.keepPrice = false;
        drink.trend = 0;
        drink.maxPrice = 100;
        drink.minPrice = 10;
        drink.maxStep = 10;
        drink.deltaAmount = 10;
        drink.targetAmount = 100;
        int expResult = 10;
        int result = drink.recalculate();
        assertEquals(expResult, result);
    }

    /**
    * Test of {@link Drink#recalculate()} method, of class Drink.
    */
    @Test
    void testRecalculate_5() {
        System.out.println("recalculate");
        Drink drink = new Drink();
        drink.model = new Model();
        drink.model.setIteration(1);
        drink.model.setSettings(new Settings());
        drink.model.getSettings().setPriceSteps(10);
        drink.model.getSettings().setStandardLogic(true);
        drink.model.getSettings().