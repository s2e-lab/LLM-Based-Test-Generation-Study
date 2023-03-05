// KMLObjectTest1.java
package net.sourceforge.shp2kml;

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.net.URL;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link KMLObject}.
* It contains ten unit test cases for the {@link KMLObject#FinishWrite()} method.
*/
class KMLObjectTest1 {

		/**
		* Test case 1 for {@link KMLObject#FinishWrite()}.
		* It tests the method with a valid KML file.
		*/
		@Test
		void testFinishWrite1() {
				KMLObject kml = new KMLObject("test.kml");
				kml.StartWrite();
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				assertTrue(kml.FinishWrite());
		}
		
		/**
		* Test case 2 for {@link KMLObject#FinishWrite()}.
		* It tests the method with a valid KML file.
		*/
		@Test
		void testFinishWrite2() {
				KMLObject kml = new KMLObject("test.kml");
				kml.StartWrite();
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				assertTrue(kml.FinishWrite());
		}
		
		/**
		* Test case 3 for {@link KMLObject#FinishWrite()}.
		* It tests the method with a valid KML file.
		*/
		@Test
		void testFinishWrite3() {
				KMLObject kml = new KMLObject("test.kml");
				kml.StartWrite();
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				assertTrue(kml.FinishWrite());
		}
		
		/**
		* Test case 4 for {@link KMLObject#FinishWrite()}.
		* It tests the method with a valid KML file.
		*/
		@Test
		void testFinishWrite4() {
				KMLObject kml = new KMLObject("test.kml");
				kml.StartWrite();
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				assertTrue(kml.FinishWrite());
		}
		
		/**
		* Test case 5 for {@link KMLObject#FinishWrite()}.
		* It tests the method with a valid KML file.
		*/
		@Test
		void testFinishWrite5() {
				KMLObject kml = new KMLObject("test.kml");
				kml.StartWrite();
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				assertTrue(kml.FinishWrite());
		}
		
		/**
		* Test case 6 for {@link KMLObject#FinishWrite()}.
		* It tests the method with a valid KML file.
		*/
		@Test
		void testFinishWrite6() {
				KMLObject kml = new KMLObject("test.kml");
				kml.StartWrite();
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				kml.addPlacemark("<Placemark><name>Test</name><description>Test</description><Point><coordinates>-122.0822035425683,37.42228990140251,0</coordinates></Point></Placemark>");
				assertTrue(kml.FinishWrite());
		}
		
		/**
		* Test case 7 for {@link KMLObject#FinishWrite()}.