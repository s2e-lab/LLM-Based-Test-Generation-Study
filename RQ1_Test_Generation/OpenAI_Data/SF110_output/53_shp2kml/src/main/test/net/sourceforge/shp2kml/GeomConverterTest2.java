// GeomConverterTest2.java
package net.sourceforge.shp2kml;

import java.util.ArrayList;
import com.vividsolutions.jts.algorithm.*;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GeomConverter}.
* It contains ten unit test cases for the {@link GeomConverter#convertPolygon(Coordinate[])} method.
*/
class GeomConverterTest2 {

		/**
		* Test case 1.
		* Test the {@link GeomConverter#convertPolygon(Coordinate[])} method.
		* Test the conversion of a polygon with one hole.
		*/
		@Test
		void testConvertPolygon1() {
				Coordinate[] coords = new Coordinate[10];
				coords[0] = new Coordinate(0, 0);
				coords[1] = new Coordinate(0, 1);
				coords[2] = new Coordinate(1, 1);
				coords[3] = new Coordinate(1, 0);
				coords[4] = new Coordinate(0, 0);
				coords[5] = new Coordinate(0.5, 0.5);
				coords[6] = new Coordinate(0.5, 0.75);
				coords[7] = new Coordinate(0.75, 0.75);
				coords[8] = new Coordinate(0.75, 0.5);
				coords[9] = new Coordinate(0.5, 0.5);
				String str = GeomConverter.convertPolygon(coords);
				assertEquals("<Polygon><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,1.0,0 1.0,1.0,0 1.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs><innerBoundaryIs><LinearRing><coordinates>0.5,0.5,0 0.5,0.75,0 0.75,0.75,0 0.75,0.5,0 0.5,0.5,0 </coordinates></LinearRing></innerBoundaryIs></Polygon>", str);
		}
		
		/**
		* Test case 2.
		* Test the {@link GeomConverter#convertPolygon(Coordinate[])} method.
		* Test the conversion of a polygon with two holes.
		*/
		@Test
		void testConvertPolygon2() {
				Coordinate[] coords = new Coordinate[16];
				coords[0] = new Coordinate(0, 0);
				coords[1] = new Coordinate(0, 1);
				coords[2] = new Coordinate(1, 1);
				coords[3] = new Coordinate(1, 0);
				coords[4] = new Coordinate(0, 0);
				coords[5] = new Coordinate(0.5, 0.5);
				coords[6] = new Coordinate(0.5, 0.75);
				coords[7] = new Coordinate(0.75, 0.75);
				coords[8] = new Coordinate(0.75, 0.5);
				coords[9] = new Coordinate(0.5, 0.5);
				coords[10] = new Coordinate(0.25, 0.25);
				coords[11] = new Coordinate(0.25, 0.5);
				coords[12] = new Coordinate(0.5, 0.5);
				coords[13] = new Coordinate(0.5, 0.25);
				coords[14] = new Coordinate(0.25, 0.25);
				coords[15] = new Coordinate(0.25, 0.25);
				String str = GeomConverter.convertPolygon(coords);
				assertEquals("<Polygon><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,1.0,0 1.0,1.0,0 1.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs><innerBoundaryIs><LinearRing><coordinates>0.5,0.5,0 0.5,0.75,0 0.75,0.75,0 0.75,0.5,0 0.5,0.5,0 </coordinates></LinearRing></innerBoundaryIs><innerBoundaryIs><LinearRing><coordinates>0.25,0.25,0 0.25,0.5,0 0.5,0.5,0 0.5,0.25,0 0.25,0.25,0 </coordinates></LinearRing></innerBoundaryIs></Polygon>", str);
		}
		
		/**
		* Test case 3.
		* Test the {@link GeomConverter#convertPolygon(Coordinate[])} method.
		* Test the conversion of a polygon with three holes.
		*/
		@Test
		void testConvertPolygon3() {
				Coordinate[] coords = new Coordinate[22];
				coords[0] = new Coordinate(0, 0);
				coords[1] = new Coordinate(0, 1);
				coords[2] = new Coordinate(1, 1);
				coords[3] = new Coordinate(1, 0);
				coords[4] = new Coordinate(0, 0);
				coords[5] = new Coordinate(0.5, 0.5);
				coords[6] = new Coordinate(0.5, 0.75);
				coords[7] = new Coordinate(0.75, 0.75);
				coords[8] = new Coordinate(0.75, 0.5);
				coords[9] = new Coordinate(0.5, 0.5);
				coords[10] = new Coordinate(0.25, 0.25);
				coords[11] = new Coordinate(0.25, 0.5);
				coords[12] = new Coordinate(0.5, 0.5);
				coords[13] = new Coordinate(0.5, 0.25);
				coords[14] = new Coordinate(0.25, 0.25);
				coords[15] = new Coordinate(0.25, 0.25);
				coords[16] = new Coordinate(0.25, 0.25);
				coords[17] = new Coordinate(0.25, 0.5);
				coords[18] = new Coordinate(0.5, 0.5);
				coords[19] = new Coordinate(0.5, 0.25);
				coords[20] = new Coordinate(0.25, 0.25);
				coords[21] = new Coordinate(0.25, 0.25);
				String str = GeomConverter.convertPolygon(coords);
				assertEquals("<Polygon><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,1.0,0 1.0,1.0,0 1.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs><innerBoundaryIs><LinearRing><coordinates>0.5,0.5,0 0.5,0.75,0 0.75,0.75,0 0.75,0.5,0 0.5,0.5,0 </coordinates></LinearRing></innerBoundaryIs><innerBoundaryIs><LinearRing><coordinates>0.25,0.25,0 0.25,0.5,0 0.5,0.5,0 0.5,0.25,0 0.25,0.25,0 </coordinates></LinearRing></innerBoundaryIs><innerBoundaryIs><LinearRing><coordinates>0.25,0.25,0 0.25,0.5,0 0.5,0.5