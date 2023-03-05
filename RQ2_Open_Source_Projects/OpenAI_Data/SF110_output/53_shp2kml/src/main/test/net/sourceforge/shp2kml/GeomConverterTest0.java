// GeomConverterTest0.java
package net.sourceforge.shp2kml;

import java.util.ArrayList;
import com.vividsolutions.jts.algorithm.*;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GeomConverter}.
* It contains ten unit test cases for the {@link GeomConverter#convertPoint(Coordinate[])} method.
*/
class GeomConverterTest0 {

	/**
	* Test case for the {@link GeomConverter#convertPoint(Coordinate[])} method.
	*/
	@Test
	void testConvertPoint0() {
		Coordinate[] coords = new Coordinate[0];
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates></coordinates></Point>";
		String actual = GeomConverter.convertPoint(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#convertPoint(Coordinate[])} method.
	*/
	@Test
	void testConvertPoint1() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1.0, 2.0);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPoint(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#convertPoint(Coordinate[])} method.
	*/
	@Test
	void testConvertPoint2() {
		Coordinate[] coords = new Coordinate[2];
		coords[0] = new Coordinate(1.0, 2.0);
		coords[1] = new Coordinate(3.0, 4.0);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPoint(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#convertPoint(Coordinate[])} method.
	*/
	@Test
	void testConvertPoint3() {
		Coordinate[] coords = new Coordinate[3];
		coords[0] = new Coordinate(1.0, 2.0);
		coords[1] = new Coordinate(3.0, 4.0);
		coords[2] = new Coordinate(5.0, 6.0);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPoint(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#convertPoint(Coordinate[])} method.
	*/
	@Test
	void testConvertPoint4() {
		Coordinate[] coords = new Coordinate[4];
		coords[0] = new Coordinate(1.0, 2.0);
		coords[1] = new Coordinate(3.0, 4.0);
		coords[2] = new Coordinate(5.0, 6.0);
		coords[3] = new Coordinate(7.0, 8.0);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPoint(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#convertPoint(Coordinate[])} method.
	*/
	@Test
	void testConvertPoint5() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(1.0, 2.0);
		coords[1] = new Coordinate(3.0, 4.0);
		coords[2] = new Coordinate(5.0, 6.0);
		coords[3] = new Coordinate(7.0, 8.0);
		coords[4] = new Coordinate(9.0, 10.0);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 9.0,10.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPoint(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#convertPoint(Coordinate[])} method.
	*/
	@Test
	void testConvertPoint6() {
		Coordinate[] coords = new Coordinate[6];
		coords[0] = new Coordinate(1.0, 2.0);
		coords[1] = new Coordinate(3.0, 4.0);
		coords[2] = new Coordinate(5.0, 6.0);
		coords[3] = new Coordinate(7.0, 8.0);
		coords[4] = new Coordinate(9.0, 10.0);
		coords[5] = new Coordinate(11.0, 12.0);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 9.0,10.0,0 11.0,12.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPoint(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#convertPoint(Coordinate[])} method.
	*/
	@Test
	void testConvertPoint7() {
		Coordinate[] coords = new Coordinate[7];
		coords[0] = new Coordinate(1.0, 2.0);
		coords[1] = new Coordinate(3.0, 4.0);
		coords[2] = new Coordinate(5.0, 6.0);
		coords[3] = new Coordinate(7.0, 8.0);
		coords[4] = new Coordinate(9.0, 10.0);
		coords[5] = new Coordinate(11.0, 12.0);
		coords[6] = new Coordinate(13.0, 14.0);
		String expected = "<Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 9.0,10.0,0 11.0,12.0,0 13.0,14.0,0 </coordinates></Point>";
		String actual = GeomConverter.convertPoint(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#convertPoint(Coordinate[])} method.
	*/
	@Test
	void testConvertPoint8() {
		Coordinate[] coords = new Coordinate[8];
		coords[0] = new Coordinate(1.0, 2.0);
		coords[1] = new Coordinate(3.0, 4.0);
