// GeomConverterTest4.java
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
class GeomConverterTest4 {

	/**
	* Test case for {@link GeomConverter#convertLineWithAltitude(Coordinate[], double)} method.
	* Test data: a line with two points.
	* Expected result: a line with two points.
	*/
	@Test
	void testConvertLineWithAltitude1() {
		Coordinate[] coords = new Coordinate[2];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		String expected = "<LineString><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 </coordinates></LineString>";
		String actual = GeomConverter.convertLineWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#convertLineWithAltitude(Coordinate[], double)} method.
	* Test data: a line with three points.
	* Expected result: a line with three points.
	*/
	@Test
	void testConvertLineWithAltitude2() {
		Coordinate[] coords = new Coordinate[3];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		String expected = "<LineString><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 </coordinates></LineString>";
		String actual = GeomConverter.convertLineWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#convertLineWithAltitude(Coordinate[], double)} method.
	* Test data: a line with four points.
	* Expected result: a line with four points.
	*/
	@Test
	void testConvertLineWithAltitude3() {
		Coordinate[] coords = new Coordinate[4];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		coords[3] = new Coordinate(7, 8);
		String expected = "<LineString><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 </coordinates></LineString>";
		String actual = GeomConverter.convertLineWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#convertLineWithAltitude(Coordinate[], double)} method.
	* Test data: a line with five points.
	* Expected result: a line with five points.
	*/
	@Test
	void testConvertLineWithAltitude4() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		coords[3] = new Coordinate(7, 8);
		coords[4] = new Coordinate(9, 10);
		String expected = "<LineString><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 9.0,10.0,0 </coordinates></LineString>";
		String actual = GeomConverter.convertLineWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#convertLineWithAltitude(Coordinate[], double)} method.
	* Test data: a line with six points.
	* Expected result: a line with six points.
	*/
	@Test
	void testConvertLineWithAltitude5() {
		Coordinate[] coords = new Coordinate[6];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		coords[3] = new Coordinate(7, 8);
		coords[4] = new Coordinate(9, 10);
		coords[5] = new Coordinate(11, 12);
		String expected = "<LineString><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 9.0,10.0,0 11.0,12.0,0 </coordinates></LineString>";
		String actual = GeomConverter.convertLineWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#convertLineWithAltitude(Coordinate[], double)} method.
	* Test data: a line with seven points.
	* Expected result: a line with seven points.
	*/
	@Test
	void testConvertLineWithAltitude6() {
		Coordinate[] coords = new Coordinate[7];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		coords[3] = new Coordinate(7, 8);
		coords[4] = new Coordinate(9, 10);
		coords[5] = new Coordinate(11, 12);
		coords[6] = new Coordinate(13, 14);
		String expected = "<LineString><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 9.0,10.0,0 11.0,12.0,0 13.0,14.0,0 </coordinates></LineString>";
		String actual = GeomConverter.convertLineWithAltitude(coords, 0);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#convertLineWithAltitude(Coordinate[], double)} method.
	* Test data: a line with eight points.
	* Expected result: a line with eight points.
	*/
	@Test
	void testConvertLineWithAltitude7() {
		Coordinate[] coords = new Coordinate[8];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		coords[3] = new Coordinate(7, 8);
		coords[4] = new Coordinate(9, 10);
		coords[5] = new Coordinate(11, 12);
		coords[6] = new Coordinate(13, 14);
		coords[7] = new Coordinate(15, 16);
		String expected = "<LineString><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,