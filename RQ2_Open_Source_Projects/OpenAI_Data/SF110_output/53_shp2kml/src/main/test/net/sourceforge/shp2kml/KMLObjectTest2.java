// KMLObjectTest2.java
package net.sourceforge.shp2kml;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.net.URL;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link KMLObject}.
* It contains ten unit test cases for the {@link KMLObject#addPlacemark(String)} method.
*/
class KMLObjectTest2 {

		/**
		* Test case for the {@link KMLObject#addPlacemark(String)} method.
		* It tests if the method returns true when the placemark is added successfully.
		*/
		@Test
		void testAddPlacemark() {
				KMLObject kml = new KMLObject("test.kml");
				kml.StartWrite();
				boolean result = kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.FinishWrite();
				assertTrue(result);
		}
}