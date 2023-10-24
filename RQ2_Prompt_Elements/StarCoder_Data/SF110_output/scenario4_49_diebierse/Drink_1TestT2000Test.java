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
     * Test of the {@link Drink#save()} method.
     * It tests if the XML file is created.
     */
    @Test
    void save() {
        Drink drink = new Drink("Test", null);
        File file = drink.save();
        assertTrue(file.exists());
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
* It contains ten unit test cases for the {@link Drink#load()} method.
*/
class Drink_2Test {
		
    /**
     * Test of the {@link Drink#load()} method.
     * It tests if the XML file is loaded.
     */
    @Test
    void load() {
        Drink drink = new Drink("Test", null);
        drink.load();
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
* It contains ten unit test cases for the {@link Drink#toString()} method.
*/
class Drink_3Test {
		
    /**
     * Test of the {@link Drink#toString()} method.
     * It tests if the string is created.
     */
    @Test
    void toString() {
        Drink drink = new Drink("Test", null);
        String string = drink.toString();
        assertNotNull(string);
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
* It contains ten unit test cases for the {@link Drink#getDataHeaderString()} method.
*/
class Drink_4Test {
		
    /**
     * Test of the {@link Drink#getDataHeaderString()} method.
     * It tests if the string is created.
     */
    @Test
    void getDataHeaderString() {
        Drink drink = new Drink("Test", null);
        String string = drink.getDataHeaderString();
        assertNotNull(string);
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
* It contains ten unit test cases for the {@link Drink#getDataString()} method.
*/
class Drink_5Test {
		
    /**
     * Test of the {@link Drink#getDataString()} method.
     * It tests if the string is created.
     */
    @Test
    void getDataString() {
        Drink drink = new Drink("Test", null);
        String string = drink.getDataString();
        assertNotNull(string);
    }
}

// Drink_6Test.java
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
* It contains ten unit test cases for the {@link Drink#getMinPrice()} method.
*/
class Drink_6Test {
		
    /**
     * Test of the {@link Drink#getMinPrice()} method.
     * It tests if the value is returned.
     */
    @Test
    void getMinPrice() {
        Drink drink = new Drink("Test", null);
        int minPrice = drink.getMinPrice();
        assertEquals(0, minPrice);
    }
}

// Drink_7Test.java
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
* It contains ten unit test cases for the {@link Drink#setMinPrice(int)} method.
*/
class Drink_7Test {
		
    /**
     * Test of the {@link Drink#setMinPrice(int)} method.
     * It tests if the value is set.
     */
    @Test
    void setMinPrice() {
        Drink drink = new Drink("Test", null);
        drink.setMinPrice(10);
        int minPrice = drink.getMinPrice();
        assertEquals(10, minPrice);
    }
}

// Drink_8Test.java
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
* It contains ten unit test cases for the {@link Drink#getMaxPrice()} method.
*/
class Drink_8Test {
		
    /**
     * Test of the {@link Drink#getMaxPrice()} method.
     * It tests if the value is returned.
     */
    @Test
    void getMaxPrice() {
        Drink drink = new Drink("Test", null);
        int maxPrice = drink.getMaxPrice();
        assertEquals(0, maxPrice);
    }
}

// Drink_9Test.java
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
* It contains ten unit test cases for the {@link Drink#setMaxPrice(int