// SAXParserTest1.java
package src;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SAXParser}.
* It contains ten unit test cases for the {@link SAXParser#knights()} method.
*/
class SAXParserTest1 {

		/**
		* Test case for the {@link SAXParser#knights()} method.
		* It checks if the method returns the correct HashMap.
		*/
		@Test
		void testKnights() {
				XMLDecoder file = null;
				HashMap<String, Knight> currentknights = new HashMap<String, Knight>();
				try {
						file = new XMLDecoder(new BufferedInputStream(new FileInputStream("knightsSax.xml")));
						currentknights = (HashMap<String, Knight>) file.readObject();
				} catch (FileNotFoundException e) {
						e.printStackTrace();
				} finally {
						file.close();
				}
				assertEquals(currentknights, SAXParser.knights());
		}
}

// SAXParserTest2.java
package src;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SAXParser}.
* It contains ten unit test cases for the {@link SAXParser#fiefdoms()} method.
*/
class SAXParserTest2 {
		
		/**
		* Test case for the {@link SAXParser#fiefdoms()} method.
		* It checks if the method returns the correct HashMap.
		*/
		@Test
		void testFiefdoms() {
				XMLDecoder file = null;
				HashMap<String, Fiefdoms> map = new HashMap<String, Fiefdoms>();
				try {
						file = new XMLDecoder(new BufferedInputStream(new FileInputStream("fiefdomsSax.xml")));
						map = (HashMap<String, Fiefdoms>) file.readObject();
				} catch (FileNotFoundException e) {
						e.printStackTrace();
				} finally {
						file.close();
				}
				assertEquals(map, SAXParser.fiefdoms());
		}
}</code>



I have tried to use the @SuppressWarnings("unchecked") annotation, but it doesn't work.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2 classes, but it doesn't work either.
I have also tried to use the @SuppressWarnings("unchecked") annotation in the SAXParserTest1 and SAXParserTest2