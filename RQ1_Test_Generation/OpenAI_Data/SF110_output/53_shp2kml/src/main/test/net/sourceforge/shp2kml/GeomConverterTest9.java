// GeomConverterTest9.java
package net.sourceforge.shp2kml;

import java.util.ArrayList;
import com.vividsolutions.jts.algorithm.*;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GeomConverter}.
* It contains ten unit test cases for the {@link GeomConverter#getPlacemarkKML(Geometry)} method.
*/
class GeomConverterTest9 {

	/**
	* Test case for the {@link GeomConverter#getPlacemarkKML(Geometry)} method.
	* It tests the conversion of a point geometry.
	*/
	@Test
	void testGetPlacemarkKMLPoint() {
		Coordinate[] coords = new Coordinate[1];
		coords[0] = new Coordinate(1, 2);
		Geometry geom = new GeometryFactory().createPoint(coords[0]);
		String expected = "<Placemark><description><![CDATA[]]></description><name></name><Point><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 </coordinates></Point></Placemark>";
		String actual = GeomConverter.getPlacemarkKML(geom);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#getPlacemarkKML(Geometry)} method.
	* It tests the conversion of a line geometry.
	*/
	@Test
	void testGetPlacemarkKMLLine() {
		Coordinate[] coords = new Coordinate[2];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		Geometry geom = new GeometryFactory().createLineString(coords);
		String expected = "<Placemark><description><![CDATA[]]></description><name></name><LineString><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>1.0,2.0,0 3.0,4.0,0 </coordinates></LineString></Placemark>";
		String actual = GeomConverter.getPlacemarkKML(geom);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#getPlacemarkKML(Geometry)} method.
	* It tests the conversion of a polygon geometry.
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
		String expected = "<Placemark><description><![CDATA[]]></description><name></name><Polygon><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 1.0,2.0,0 </coordinates></LinearRing></outerBoundaryIs></Polygon></Placemark>";
		String actual = GeomConverter.getPlacemarkKML(geom);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#getPlacemarkKML(Geometry)} method.
	* It tests the conversion of a polygon geometry with a hole.
	*/
	@Test
	void testGetPlacemarkKMLPolygonWithHole() {
		Coordinate[] coords = new Coordinate[9];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		coords[3] = new Coordinate(7, 8);
		coords[4] = new Coordinate(1, 2);
		coords[5] = new Coordinate(2, 3);
		coords[6] = new Coordinate(4, 5);
		coords[7] = new Coordinate(6, 7);
		coords[8] = new Coordinate(2, 3);
		Geometry geom = new GeometryFactory().createPolygon(coords);
		String expected = "<Placemark><description><![CDATA[]]></description><name></name><Polygon><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 1.0,2.0,0 </coordinates></LinearRing></outerBoundaryIs><innerBoundaryIs><LinearRing><coordinates>2.0,3.0,0 4.0,5.0,0 6.0,7.0,0 2.0,3.0,0 </coordinates></LinearRing></innerBoundaryIs></Polygon></Placemark>";
		String actual = GeomConverter.getPlacemarkKML(geom);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#getPlacemarkKML(Geometry)} method.
	* It tests the conversion of a polygon geometry with two holes.
	*/
	@Test
	void testGetPlacemarkKMLPolygonWithTwoHoles() {
		Coordinate[] coords = new Coordinate[13];
		coords[0] = new Coordinate(1, 2);
		coords[1] = new Coordinate(3, 4);
		coords[2] = new Coordinate(5, 6);
		coords[3] = new Coordinate(7, 8);
		coords[4] = new Coordinate(1, 2);
		coords[5] = new Coordinate(2, 3);
		coords[6] = new Coordinate(4, 5);
		coords[7] = new Coordinate(6, 7);
		coords[8] = new Coordinate(2, 3);
		coords[9] = new Coordinate(3, 4);
		coords[10] = new Coordinate(5, 6);
		coords[11] = new Coordinate(7, 8);
		coords[12] = new Coordinate(3, 4);
		Geometry geom = new GeometryFactory().createPolygon(coords);
		String expected = "<Placemark><description><![CDATA[]]></description><name></name><Polygon><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>1.0,2.0,0 3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 1.0,2.0,0 </coordinates></LinearRing></outerBoundaryIs><innerBoundaryIs><LinearRing><coordinates>2.0,3.0,0 4.0,5.0,0 6.0,7.0,0 2.0,3.0,0 </coordinates></LinearRing></innerBoundaryIs><innerBoundaryIs><LinearRing><coordinates>3.0,4.0,0 5.0,6.0,0 7.0,8.0,0 3.0,4.0,0 </coordinates></LinearRing></innerBoundaryIs></Polygon></Placemark>";
		String actual = GeomConverter.getPlacemarkKML(geom);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link GeomConverter#getPlacemarkKML(Geometry)} method.
	* It tests the conversion of a polygon geometry with a hole and a name.
	*/
	@Test
	void testGetPlacemarkKMLPolygonWithHoleAndName() {
		Coordinate[] coords = new Coordinate[9];
		coords[0] = new Coordinate(1, 2);
	