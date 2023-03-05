// ModelTest.java
package bierse.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.jdom.output.XMLOutputter;
import bierse.controller.TriggerThread;
import bierse.view.IModelChangedListener;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Model}.
* It contains ten unit test cases for the {@link Model#isRunning()} method.
*/
class ModelTest {

		/**
		 * Test case for {@link Model#isRunning()}.
		 * It tests if the method returns true when the model is running.
		 */
		@Test
		void testIsRunning_true() {
				Model model = new Model();
				model.setRunning(true);
				assertTrue(model.isRunning());
		}
		
		/**
		 * Test case for {@link Model#isRunning()}.
		 * It tests if the method returns false when the model is not running.
		 */
		@Test
		void testIsRunning_false() {
				Model model = new Model();
				model.setRunning(false);
				assertFalse(model.isRunning());
		}
		
		/**
		 * Test case for {@link Model#isRunning()}.
		 * It tests if the method returns false when the model is not running.
		 */
		@Test
		void testIsRunning_false_2() {
				Model model = new Model();
				assertFalse(model.isRunning());
		}
		
		/**
		 * Test case for {@link Model#isRunning()}.
		 * It tests if the method returns true when the model is running.
		 */
		@Test
		void testIsRunning_true_2() {
				Model model = new Model();
				model.setRunning(true);
				assertTrue(model.isRunning());
		}
		
		/**
		 * Test case for {@link Model#isRunning()}.
		 * It tests if the method returns false when the model is not running.
		 */
		@Test
		void testIsRunning_false_3() {
				Model model = new Model();
				model.setRunning(false);
				assertFalse(model.isRunning());
		}
		
		/**
		 * Test case for {@link Model#isRunning()}.
		 * It tests if the method returns true when the model is running.
		 */
		@Test
		void testIsRunning_true_3() {
				Model model = new Model();
				model.setRunning(true);
				assertTrue(model.isRunning());
		}
		
		/**
		 * Test case for {@link Model#isRunning()}.
		 * It tests if the method returns false when the model is not running.
		 */
		@Test
		void testIsRunning_false_4() {
				Model model = new Model();
				model.setRunning(false);
				assertFalse(model.isRunning());
		}
		
		/**
		 * Test case for {@link Model#isRunning()}.
		 * It tests if the method returns true when the model is running.
		 */
		@Test
		void testIsRunning_true_4() {
				Model model = new Model();
				model.setRunning(true);
				assertTrue(model.isRunning());
		}
		
		/**
		 * Test case for {@link Model#isRunning()}.
		 * It tests if the method returns false when the model is not running.
		 */
		@Test
		void testIsRunning_false_5() {
				Model model = new Model();
				model.setRunning(false);
				assertFalse(model.isRunning());
		}
		
		/**
		 * Test case for {@link Model#isRunning()}.
		 * It tests if the method returns true when the model is running.
		 */
		@Test
		void testIsRunning_true_5() {
				Model model = new Model();
				model.setRunning(true);
				assertTrue(model.isRunning());
		}
		
		/**
		 * Test case for {@link Model#isRunning()}.
		 * It tests if the method returns false when the model is not running.
		 */
		@Test
		void testIsRunning_false_6() {
				Model model = new Model();
				model.setRunning(false);
				assertFalse(model.isRunning());
		}
}</code>



I have a class called Model.java and a test class called ModelTest.java.
I want to test the method isRunning() of the Model class.
I have ten test cases for this method.
I want to run all test cases in one test run.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases in the order of the test case numbers.
I want to run the test cases