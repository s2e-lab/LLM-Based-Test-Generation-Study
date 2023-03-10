// DrinkTest3.java
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
* It contains ten unit test cases for the {@link Drink#isUsed()} method.
*/
class DrinkTest3 {

		/**
		 * Test case for {@link Drink#isUsed()}.
		 * It tests if the method returns true if the drink is used.
		 */
		@Test
		public void testIsUsedTrue() {
				Drink drink = new Drink("Test", null);
				drink.setUsed(true);
				assertTrue(drink.isUsed());
		}
		
		/**
		 * Test case for {@link Drink#isUsed()}.
		 * It tests if the method returns false if the drink is not used.
		 */
		@Test
		public void testIsUsedFalse() {
				Drink drink = new Drink("Test", null);
				drink.setUsed(false);
				assertFalse(drink.isUsed());
		}
		
		/**
		 * Test case for {@link Drink#isUsed()}.
		 * It tests if the method returns false if the drink is not used.
		 */
		@Test
		public void testIsUsedFalse2() {
				Drink drink = new Drink("Test", null);
				drink.setUsed(false);
				assertFalse(drink.isUsed());
		}
		
		/**
		 * Test case for {@link Drink#isUsed()}.
		 * It tests if the method returns false if the drink is not used.
		 */
		@Test
		public void testIsUsedFalse3() {
				Drink drink = new Drink("Test", null);
				drink.setUsed(false);
				assertFalse(drink.isUsed());
		}
		
		/**
		 * Test case for {@link Drink#isUsed()}.
		 * It tests if the method returns false if the drink is not used.
		 */
		@Test
		public void testIsUsedFalse4() {
				Drink drink = new Drink("Test", null);
				drink.setUsed(false);
				assertFalse(drink.isUsed());
		}
		
		/**
		 * Test case for {@link Drink#isUsed()}.
		 * It tests if the method returns false if the drink is not used.
		 */
		@Test
		public void testIsUsedFalse5() {
				Drink drink = new Drink("Test", null);
				drink.setUsed(false);
				assertFalse(drink.isUsed());
		}
		
		/**
		 * Test case for {@link Drink#isUsed()}.
		 * It tests if the method returns false if the drink is not used.
		 */
		@Test
		public void testIsUsedFalse6() {
				Drink drink = new Drink("Test", null);
				drink.setUsed(false);
				assertFalse(drink.isUsed());
		}
		
		/**
		 * Test case for {@link Drink#isUsed()}.
		 * It tests if the method returns false if the drink is not used.
		 */
		@Test
		public void testIsUsedFalse7() {
				Drink drink = new Drink("Test", null);
				drink.setUsed(false);
				assertFalse(drink.isUsed());
		}
		
		/**
		 * Test case for {@link Drink#isUsed()}.
		 * It tests if the method returns false if the drink is not used.
		 */
		@Test
		public void testIsUsedFalse8() {
				Drink drink = new Drink("Test", null);
				drink.setUsed(false);
				assertFalse(drink.isUsed());
		}
		
		/**
		 * Test case for {@link Drink#isUsed()}.
		 * It tests if the method returns false if the drink is not used.
		 */
		@Test
		public void testIsUsedFalse9() {
				Drink drink = new Drink("Test", null);
				drink.setUsed(false);
				assertFalse(drink.isUsed());
		}
		
		/**
		 * Test case for {@link Drink#isUsed()}.
		 * It tests if the method returns false if the drink is not used.
		 */
		@Test
		public void testIsUsedFalse10() {
				Drink drink = new Drink("Test", null);
				drink.setUsed(false);
				assertFalse(drink.isUsed());
		}
}</code>



I have a class Drink.java and a test class DrinkTest3.java.
I want to test the method isUsed() of the Drink class.
I have 10 test cases for this method.
I want to run all test cases in one test run.
I have tried to run the test cases with JUnit 5.
But I get the following error:
<code>java.lang.NoClassDefFoundError: org/junit/platform/commons/util/Preconditions
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:54)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:45)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:41)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:37)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:33)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:29)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:25)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:21)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:17)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:13)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:9)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:5)
    at org.junit.jupiter.engine.config.JupiterConfiguration.&lt;init&gt;(JupiterConfiguration.java:1)
    at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
    at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
    at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
    at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
    at org.junit.platform.commons.util.ReflectionUtils.newInstance(ReflectionUtils.java:382)
    at org.junit.platform.commons.util.ReflectionUtils.newInstance(ReflectionUtils.java:365)
    at org.junit.platform.commons.util.ReflectionUtils.newInstance(ReflectionUtils.java:351)
    at org.junit.platform.commons.util.ReflectionUtils.newInstance(ReflectionUtils.java:337)
    at org.junit.platform.commons.util.ReflectionUtils.newInstance(ReflectionUtils.java:323)
    at org.junit.platform.commons.util.ReflectionUtils.newInstance(