// DrinkTest4.java
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
* It contains ten unit test cases for the {@link Drink#isKeepPrice()} method.
*/
class DrinkTest4 {

		/**
		 * Test case for {@link Drink#isKeepPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testIsKeepPrice() {
				Drink drink = new Drink("Test", null);
				drink.setKeepPrice(true);
				assertTrue(drink.isKeepPrice());
		}
		
		/**
		 * Test case for {@link Drink#isKeepPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testIsKeepPrice2() {
				Drink drink = new Drink("Test", null);
				drink.setKeepPrice(false);
				assertFalse(drink.isKeepPrice());
		}
		
		/**
		 * Test case for {@link Drink#isKeepPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testIsKeepPrice3() {
				Drink drink = new Drink("Test", null);
				drink.setKeepPrice(true);
				assertFalse(drink.isKeepPrice());
		}
		
		/**
		 * Test case for {@link Drink#isKeepPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testIsKeepPrice4() {
				Drink drink = new Drink("Test", null);
				drink.setKeepPrice(false);
				assertTrue(drink.isKeepPrice());
		}
		
		/**
		 * Test case for {@link Drink#isKeepPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testIsKeepPrice5() {
				Drink drink = new Drink("Test", null);
				drink.setKeepPrice(true);
				assertTrue(drink.isKeepPrice());
		}
		
		/**
		 * Test case for {@link Drink#isKeepPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testIsKeepPrice6() {
				Drink drink = new Drink("Test", null);
				drink.setKeepPrice(false);
				assertFalse(drink.isKeepPrice());
		}
		
		/**
		 * Test case for {@link Drink#isKeepPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testIsKeepPrice7() {
				Drink drink = new Drink("Test", null);
				drink.setKeepPrice(true);
				assertFalse(drink.isKeepPrice());
		}
		
		/**
		 * Test case for {@link Drink#isKeepPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testIsKeepPrice8() {
				Drink drink = new Drink("Test", null);
				drink.setKeepPrice(false);
				assertTrue(drink.isKeepPrice());
		}
		
		/**
		 * Test case for {@link Drink#isKeepPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testIsKeepPrice9() {
				Drink drink = new Drink("Test", null);
				drink.setKeepPrice(true);
				assertTrue(drink.isKeepPrice());
		}
		
		/**
		 * Test case for {@link Drink#isKeepPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testIsKeepPrice10() {
				Drink drink = new Drink("Test", null);
				drink.setKeepPrice(false);
				assertFalse(drink.isKeepPrice());
		}
}

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
* It contains ten unit test cases for the {@link Drink#getDirectPrice()} method.
*/
class DrinkTest5 {
		
		/**
		 * Test case for {@link Drink#getDirectPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testGetDirectPrice() {
				Drink drink = new Drink("Test", null);
				drink.setDirectPrice(1);
				assertEquals(1, drink.getDirectPrice());
		}
		
		/**
		 * Test case for {@link Drink#getDirectPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testGetDirectPrice2() {
				Drink drink = new Drink("Test", null);
				drink.setDirectPrice(2);
				assertEquals(2, drink.getDirectPrice());
		}
		
		/**
		 * Test case for {@link Drink#getDirectPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testGetDirectPrice3() {
				Drink drink = new Drink("Test", null);
				drink.setDirectPrice(3);
				assertEquals(3, drink.getDirectPrice());
		}
		
		/**
		 * Test case for {@link Drink#getDirectPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testGetDirectPrice4() {
				Drink drink = new Drink("Test", null);
				drink.setDirectPrice(4);
				assertEquals(4, drink.getDirectPrice());
		}
		
		/**
		 * Test case for {@link Drink#getDirectPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testGetDirectPrice5() {
				Drink drink = new Drink("Test", null);
				drink.setDirectPrice(5);
				assertEquals(5, drink.getDirectPrice());
		}
		
		/**
		 * Test case for {@link Drink#getDirectPrice()}
		 * 
		 * @result The test case is successful if the method returns the expected value.
		 */
		@Test
		public void testGetDirectPrice6() {
				Drink drink = new Drink("Test",