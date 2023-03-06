// GeomConverterTest3.java
package net.sourceforge.shp2kml;

import java.util.ArrayList;
import com.vividsolutions.jts.algorithm.*;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GeomConverter}.
* It contains ten unit test cases for the {@link GeomConverter#convertPolygonWithAltitude(Coordinate[], double)} method.
*/
class GeomConverterTest3 {

	/**
	* Test case for {@link GeomConverter#convertPolygonWithAltitude(Coordinate[], double)} method.
	* This test case tests the conversion of a polygon with a single ring.
	*/
	@Test
	void testConvertPolygonWithAltitude1() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String str = GeomConverter.convertPolygonWithAltitude(coords, 0);
		assertEquals("<Polygon><extrude>0</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,1.0,0 1.0,1.0,0 1.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs></Polygon>", str);
	}
	
	/**
	* Test case for {@link GeomConverter#convertPolygonWithAltitude(Coordinate[], double)} method.
	* This test case tests the conversion of a polygon with a single ring.
	*/
	@Test
	void testConvertPolygonWithAltitude2() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String str = GeomConverter.convertPolygonWithAltitude(coords, 1);
		assertEquals("<Polygon><extrude>1</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,1.0,0 1.0,1.0,0 1.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs></Polygon>", str);
	}
	
	/**
	* Test case for {@link GeomConverter#convertPolygonWithAltitude(Coordinate[], double)} method.
	* This test case tests the conversion of a polygon with a single ring.
	*/
	@Test
	void testConvertPolygonWithAltitude3() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String str = GeomConverter.convertPolygonWithAltitude(coords, -1);
		assertEquals("<Polygon><extrude>-1</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,1.0,0 1.0,1.0,0 1.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs></Polygon>", str);
	}
	
	/**
	* Test case for {@link GeomConverter#convertPolygonWithAltitude(Coordinate[], double)} method.
	* This test case tests the conversion of a polygon with a single ring.
	*/
	@Test
	void testConvertPolygonWithAltitude4() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String str = GeomConverter.convertPolygonWithAltitude(coords, 0.5);
		assertEquals("<Polygon><extrude>0.5</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,1.0,0 1.0,1.0,0 1.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs></Polygon>", str);
	}
	
	/**
	* Test case for {@link GeomConverter#convertPolygonWithAltitude(Coordinate[], double)} method.
	* This test case tests the conversion of a polygon with a single ring.
	*/
	@Test
	void testConvertPolygonWithAltitude5() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String str = GeomConverter.convertPolygonWithAltitude(coords, -0.5);
		assertEquals("<Polygon><extrude>-0.5</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,1.0,0 1.0,1.0,0 1.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs></Polygon>", str);
	}
	
	/**
	* Test case for {@link GeomConverter#convertPolygonWithAltitude(Coordinate[], double)} method.
	* This test case tests the conversion of a polygon with a single ring.
	*/
	@Test
	void testConvertPolygonWithAltitude6() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String str = GeomConverter.convertPolygonWithAltitude(coords, 0.25);
		assertEquals("<Polygon><extrude>0.25</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,1.0,0 1.0,1.0,0 1.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs></Polygon>", str);
	}
	
	/**
	* Test case for {@link GeomConverter#convertPolygonWithAltitude(Coordinate[], double)} method.
	* This test case tests the conversion of a polygon with a single ring.
	*/
	@Test
	void testConvertPolygonWithAltitude7() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		co