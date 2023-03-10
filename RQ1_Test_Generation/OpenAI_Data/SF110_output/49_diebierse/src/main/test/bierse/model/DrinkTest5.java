// DrinkTest5.java
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
* It contains ten unit test cases for the {@link Drink#equals(Object)} method.
*/
class DrinkTest5 {

		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns true if the name of the drink is null.
		 */
		@Test
		public void testEquals_NameIsNull() {
				Drink drink1 = new Drink(null, null);
				Drink drink2 = new Drink(null, null);
				assertTrue(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns true if the name of the drink is not null.
		 */
		@Test
		public void testEquals_NameIsNotNull() {
				Drink drink1 = new Drink("Test", null);
				Drink drink2 = new Drink("Test", null);
				assertTrue(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns false if the name of the drink is not equal.
		 */
		@Test
		public void testEquals_NameIsNotEqual() {
				Drink drink1 = new Drink("Test1", null);
				Drink drink2 = new Drink("Test2", null);
				assertFalse(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns false if the name of the drink is null and the other is not.
		 */
		@Test
		public void testEquals_NameIsNullAndOtherIsNot() {
				Drink drink1 = new Drink(null, null);
				Drink drink2 = new Drink("Test", null);
				assertFalse(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns false if the name of the drink is not null and the other is.
		 */
		@Test
		public void testEquals_NameIsNotNullAndOtherIs() {
				Drink drink1 = new Drink("Test", null);
				Drink drink2 = new Drink(null, null);
				assertFalse(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns false if the name of the drink is null and the other is not null.
		 */
		@Test
		public void testEquals_NameIsNullAndOtherIsNotNull() {
				Drink drink1 = new Drink(null, null);
				Drink drink2 = new Drink("Test", null);
				assertFalse(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns false if the name of the drink is not null and the other is null.
		 */
		@Test
		public void testEquals_NameIsNotNullAndOtherIsNull() {
				Drink drink1 = new Drink("Test", null);
				Drink drink2 = new Drink(null, null);
				assertFalse(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns false if the name of the drink is not null and the other is null.
		 */
		@Test
		public void testEquals_NameIsNotNullAndOtherIsNull2() {
				Drink drink1 = new Drink("Test", null);
				Drink drink2 = new Drink(null, null);
				assertFalse(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns false if the name of the drink is not null and the other is null.
		 */
		@Test
		public void testEquals_NameIsNotNullAndOtherIsNull3() {
				Drink drink1 = new Drink("Test", null);
				Drink drink2 = new Drink(null, null);
				assertFalse(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns false if the name of the drink is not null and the other is null.
		 */
		@Test
		public void testEquals_NameIsNotNullAndOtherIsNull4() {
				Drink drink1 = new Drink("Test", null);
				Drink drink2 = new Drink(null, null);
				assertFalse(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns false if the name of the drink is not null and the other is null.
		 */
		@Test
		public void testEquals_NameIsNotNullAndOtherIsNull5() {
				Drink drink1 = new Drink("Test", null);
				Drink drink2 = new Drink(null, null);
				assertFalse(drink1.equals(drink2));
		}
}

// DrinkTest6.java
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
* It contains ten unit test cases for the {@link Drink#equals(Object)} method.
*/
class DrinkTest6 {
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns true if the name of the drink is null.
		 */
		@Test
		public void testEquals_NameIsNull() {
				Drink drink1 = new Drink(null, null);
				Drink drink2 = new Drink(null, null);
				assertTrue(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns true if the name of the drink is not null.
		 */
		@Test
		public void testEquals_NameIsNotNull() {
				Drink drink1 = new Drink("Test", null);
				Drink drink2 = new Drink("Test", null);
				assertTrue(drink1.equals(drink2));
		}
		
		/**
		 * Test case for {@link Drink#equals(Object)} method.
		 * It tests if the method returns false if the name of the drink is not equal.
		 */
		@Test
		public void testEquals_NameIsNotEqual() {
				Drink drink1 = new Drink("Test1", null);
				Drink drink2 = new Drink("Test2", null);
				assertFalse(drink1.equals(drink2