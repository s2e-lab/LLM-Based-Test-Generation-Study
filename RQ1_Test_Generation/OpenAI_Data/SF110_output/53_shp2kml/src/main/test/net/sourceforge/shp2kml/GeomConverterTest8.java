// GeomConverterTest8.java
package net.sourceforge.shp2kml;

import java.util.ArrayList;
import com.vividsolutions.jts.algorithm.*;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GeomConverter}.
* It contains ten unit test cases for the {@link GeomConverter#getPlacemarkKML(Geometry, String, String, double)} method.
*/
class GeomConverterTest8 {

	/**
	* Test case for the {@link GeomConverter#getPlacemarkKML(Geometry, String, String, double)} method.
	* It tests the case when the geometry is a point.
	*/
	@Test
	void testGetPlacemarkKMLPoint() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		Geometry geom = new GeometryFactory().createPoint(coords[0]);
		String name = "name";
		String description = "description";
		double altitude = 3;
		String expected = "<Placemark><description><![CDATA[description]]></description><name>name</name><Point><extrude>3</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point></Placemark>";
		String actual = GeomConverter.getPlacemarkKML(geom, name, description, altitude);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#getPlacemarkKML(Geometry, String, String, double)} method.
	* It tests the case when the geometry is a line.
	*/
	@Test
	void testGetPlacemarkKMLLine() {
		Coordinate[] coords = new Coordinate[2];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		Geometry geom = new GeometryFactory().createLineString(coords);
		String name = "name";
		String description = "description";
		double altitude = 3;
		String expected = "<Placemark><description><![CDATA[description]]></description><name>name</name><LineString><extrude>3</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 </coordinates></LineString></Placemark>";
		String actual = GeomConverter.getPlacemarkKML(geom, name, description, altitude);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#getPlacemarkKML(Geometry, String, String, double)} method.
	* It tests the case when the geometry is a polygon.
	*/
	@Test
	void testGetPlacemarkKMLPolygon() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		coords[3] = new Coordinate(7, 8);
		coords[4] = new Coordinate(1, 2);
		Geometry geom = new GeometryFactory().createPolygon(coords);
		String name = "name";
		String description = "description";
		double altitude = 3;
		String expected = "<Placemark><description><![CDATA[description]]></description><name>name</name><Polygon><extrude>3</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 1.0,2.0,0 </coordinates></LinearRing></outerBoundaryIs></Polygon></Placemark>";
		String actual = GeomConverter.getPlacemarkKML(geom, name, description, altitude);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#getPlacemarkKML(Geometry, String, String, double)} method.
	* It tests the case when the geometry is a polygon with a hole.
	*/
	@Test
	void testGetPlacemarkKMLPolygonWithHole() {
		Coordinate[] coords = new Coordinate[9];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		coords[3] = new Coordinate(7, 8);
		coords[4] = new Coordinate(1, 2);
		coords[5] = new Coordinate(9, 10);
		coords[6] = new Coordinate(11, 12);
		coords[7] = new Coordinate(13, 14);
		coords[8] = new Coordinate(9, 10);
		Geometry geom = new GeometryFactory().createPolygon(coords);
		String name = "name";
		String description = "description";
		double altitude = 3;
		String expected = "<Placemark><description><![CDATA[description]]></description><name>name</name><Polygon><extrude>3</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 1.0,2.0,0 </coordinates></LinearRing></outerBoundaryIs><innerBoundaryIs><LinearRing><coordinates>9.0,10.0,0 11.0,12.0,0 13.0,14.0,0 9.0,10.0,0 </coordinates></LinearRing></innerBoundaryIs></Polygon></Placemark>";
		String actual = GeomConverter.getPlacemarkKML(geom, name, description, altitude);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#getPlacemarkKML(Geometry, String, String, double)} method.
	* It tests the case when the geometry is a polygon with two holes.
	*/
	@Test
	void testGetPlacemarkKMLPolygonWithTwoHoles() {
		Coordinate[] coords = new Coordinate[13];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		coords[3] = new Coordinate(7, 8);
		coords[4] = new Coordinate(1, 2);
		coords[5] = new Coordinate(9, 10);
		coords[6] = new Coordinate(11, 12);
		coords[7] = new Coordinate(13, 14);
		coords[8] = new Coordinate(9, 10);
		coords[9] = new Coordinate(15, 16);
		coords[10] = new Coordinate(17, 18);
		coords[11] = new Coordinate(19, 20);
		coords[12] = new Coordinate(15, 16);
		Geometry geom = new GeometryFactory().createPolygon(coords);
		String name = "name";
		String description = "description";
		double altitude = 3;
		String expected = "<Placemark><description><![CDATA[description]]></description><name>name</name><Polygon><extrude>3</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 1.0,2.0,0 </coordinates></LinearRing></outerBoundaryIs><innerBoundaryIs><LinearRing><coordinates>9.0,10.0,0 11.0,12.0,0 13.0,14.0,0 9.0,10.0,0 </coordinates></LinearRing></innerBoundaryIs><innerBoundaryIs><LinearRing