// GeomConverterTest7.java
package net.sourceforge.shp2kml;

import java.util.ArrayList;
import com.vividsolutions.jts.algorithm.*;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GeomConverter}.
* It contains ten unit test cases for the {@link GeomConverter#getCoordinatesKML(Coordinate[])} method.
*/
class GeomConverterTest7 {

	/**
	* Test case for {@link GeomConverter#getCoordinatesKML(Coordinate[])} method.
	* It tests the method with a null input.
	*/
	@Test
	void testGetCoordinatesKML_1() {
		Coordinate[] coords = null;
		String expected = "<coordinates></coordinates>";
		String actual = GeomConverter.getCoordinatesKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getCoordinatesKML(Coordinate[])} method.
	* It tests the method with an empty input.
	*/
	@Test
	void testGetCoordinatesKML_2() {
		Coordinate[] coords = new Coordinate[0];
		String expected = "<coordinates></coordinates>";
		String actual = GeomConverter.getCoordinatesKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getCoordinatesKML(Coordinate[])} method.
	* It tests the method with a single coordinate input.
	*/
	@Test
	void testGetCoordinatesKML_3() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		String expected = "<coordinates>1.0,2.0,0 </coordinates>";
		String actual = GeomConverter.getCoordinatesKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getCoordinatesKML(Coordinate[])} method.
	* It tests the method with a multiple coordinate input.
	*/
	@Test
	void testGetCoordinatesKML_4() {
		Coordinate[] coords = new Coordinate[3];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		String expected = "<coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 </coordinates>";
		String actual = GeomConverter.getCoordinatesKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getCoordinatesKML(Coordinate[])} method.
	* It tests the method with a multiple coordinate input.
	*/
	@Test
	void testGetCoordinatesKML_5() {
		Coordinate[] coords = new Coordinate[3];
		coords[0] = new Coordinate(1, 2, 3);
		coords[1] = new Coordinate(4, 5, 6);
		coords[2] = new Coordinate(7, 8, 9);
		String expected = "<coordinates>1.0,2.0,3.0 4.0,5.0,6.0 7.0,8.0,9.0 </coordinates>";
		String actual = GeomConverter.getCoordinatesKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getCoordinatesKML(Coordinate[])} method.
	* It tests the method with a multiple coordinate input.
	*/
	@Test
	void testGetCoordinatesKML_6() {
		Coordinate[] coords = new Coordinate[3];
		coords[0] = new Coordinate(1, 2, 3);
		coords[1] = new Coordinate(4, 5, 6);
		coords[2] = new Coordinate(7, 8, 9);
		String expected = "<coordinates>1.0,2.0,3.0 4.0,5.0,6.0 7.0,8.0,9.0 </coordinates>";
		String actual = GeomConverter.getCoordinatesKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getCoordinatesKML(Coordinate[])} method.
	* It tests the method with a multiple coordinate input.
	*/
	@Test
	void testGetCoordinatesKML_7() {
		Coordinate[] coords = new Coordinate[3];
		coords[0] = new Coordinate(1, 2, 3);
		coords[1] = new Coordinate(4, 5, 6);
		coords[2] = new Coordinate(7, 8, 9);
		String expected = "<coordinates>1.0,2.0,3.0 4.0,5.0,6.0 7.0,8.0,9.0 </coordinates>";
		String actual = GeomConverter.getCoordinatesKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getCoordinatesKML(Coordinate[])} method.
	* It tests the method with a multiple coordinate input.
	*/
	@Test
	void testGetCoordinatesKML_8() {
		Coordinate[] coords = new Coordinate[3];
		coords[0] = new Coordinate(1, 2, 3);
		coords[1] = new Coordinate(4, 5, 6);
		coords[2] = new Coordinate(7, 8, 9);
		String expected = "<coordinates>1.0,2.0,3.0 4.0,5.0,6.0 7.0,8.0,9.0 </coordinates>";
		String actual = GeomConverter.getCoordinatesKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getCoordinatesKML(Coordinate[])} method.
	* It tests the method with a multiple coordinate input.
	*/
	@Test
	void testGetCoordinatesKML_9() {
		Coordinate[] coords = new Coordinate[3];
		coords[0] = new Coordinate(1, 2, 3);
		coords[1] = new Coordinate(4, 5, 6);
		coords[2] = new Coordinate(7, 8, 9);
		String expected = "<coordinates>1.0,2.0,3.0 4.0,5.0,6.0 7.0,8.0,9.0 </coordinates>";
		String actual = GeomConverter.getCoordinatesKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getCoordinatesKML(Coordinate[])} method.
	* It tests the method with a multiple coordinate input.
	*/
	@Test
	void testGetCoordinatesKML_10() {
		Coordinate[] coords = new Coordinate[3];
		coords[0] = new Coordinate(1, 2, 3);
		coords[1] = new Coordinate(4, 5, 6);
		coords[2] = new Coordinate(7, 8, 9);
		String expected = "<coordinates>1.0,2.0,3.0 4.0,5.0,6.0 7.0,8.0,9.0 </coordinates>";
		String actual = GeomConverter.getCoordinatesKML(coords);
		assertEquals(expected, actual);
	}
	
}

// GeomConverterTest8.java
package net.sourceforge.shp2kml;

import java.util.ArrayList;
import com.vividsolutions.jts.algorithm.*;
import com.vividsolutions.jts.geom.Coordinate;
