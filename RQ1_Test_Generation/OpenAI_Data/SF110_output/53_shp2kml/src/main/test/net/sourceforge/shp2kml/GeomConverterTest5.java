// GeomConverterTest5.java
package net.sourceforge.shp2kml;

import java.util.ArrayList;
import com.vividsolutions.jts.algorithm.*;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GeomConverter}.
* It contains ten unit test cases for the {@link GeomConverter#convertPointWithAltitude(Coordinate[], double)} method.
*/
class GeomConverterTest5 {

	/**
	* Test case 1.
	* Test if the method returns the correct KML string for a point geometry.
	*/
	@Test
	void testConvertPointWithAltitude1() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPointWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* Test if the method returns the correct KML string for a point geometry.
	*/
	@Test
	void testConvertPointWithAltitude2() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		String expected = "<Point><extrude>10</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPointWithAltitude(coords, 10);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* Test if the method returns the correct KML string for a point geometry.
	*/
	@Test
	void testConvertPointWithAltitude3() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		String expected = "<Point><extrude>-10</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPointWithAltitude(coords, -10);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* Test if the method returns the correct KML string for a point geometry.
	*/
	@Test
	void testConvertPointWithAltitude4() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPointWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* Test if the method returns the correct KML string for a point geometry.
	*/
	@Test
	void testConvertPointWithAltitude5() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPointWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* Test if the method returns the correct KML string for a point geometry.
	*/
	@Test
	void testConvertPointWithAltitude6() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPointWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* Test if the method returns the correct KML string for a point geometry.
	*/
	@Test
	void testConvertPointWithAltitude7() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPointWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* Test if the method returns the correct KML string for a point geometry.
	*/
	@Test
	void testConvertPointWithAltitude8() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPointWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* Test if the method returns the correct KML string for a point geometry.
	*/
	@Test
	void testConvertPointWithAltitude9() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPointWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* Test if the method returns the correct KML string for a point geometry.
	*/
	@Test
	void testConvertPointWithAltitude10() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPointWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
}

// GeomConverterTest6.java
package net.sourceforge.shp2kml;

import java.util.ArrayList;
import com.vividsolutions.jts.algorithm.*;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GeomConverter}.
* It contains ten unit test cases for the {@link GeomConverter#convertLineWithAltitude(Coordinate[], double)} method.
*/
class GeomConverterTest6 {
		
	/**
	* Test case 1.
	* Test if the method returns the correct KML string for a line geometry.
	*/
	@Test
	void testConvertLineWithAltitude1() {
		Coordinate[] coords = new Coordinate[2];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		String expected = "<LineString><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 </coordinates></LineString>";
		