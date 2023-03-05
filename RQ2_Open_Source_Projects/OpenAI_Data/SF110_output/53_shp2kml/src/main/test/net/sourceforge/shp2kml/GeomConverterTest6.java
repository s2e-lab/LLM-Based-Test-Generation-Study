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
* It contains ten unit test cases for the {@link GeomConverter#getLinearRingKML(Coordinate[])} method.
*/
class GeomConverterTest6 {

	/**
	* Test case for {@link GeomConverter#getLinearRingKML(Coordinate[])} method.
	* It tests the case when the input is a simple polygon.
	*/
	@Test
	void testGetLinearRingKML1() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String expected = "<LinearRing><coordinates>0.0,0.0,0.0 0.0,1.0,0.0 1.0,1.0,0.0 1.0,0.0,0.0 0.0,0.0,0.0 </coordinates></LinearRing>";
		String actual = GeomConverter.getLinearRingKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getLinearRingKML(Coordinate[])} method.
	* It tests the case when the input is a simple polygon.
	*/
	@Test
	void testGetLinearRingKML2() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String expected = "<LinearRing><coordinates>0.0,0.0,0.0 0.0,1.0,0.0 1.0,1.0,0.0 1.0,0.0,0.0 0.0,0.0,0.0 </coordinates></LinearRing>";
		String actual = GeomConverter.getLinearRingKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getLinearRingKML(Coordinate[])} method.
	* It tests the case when the input is a simple polygon.
	*/
	@Test
	void testGetLinearRingKML3() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String expected = "<LinearRing><coordinates>0.0,0.0,0.0 0.0,1.0,0.0 1.0,1.0,0.0 1.0,0.0,0.0 0.0,0.0,0.0 </coordinates></LinearRing>";
		String actual = GeomConverter.getLinearRingKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getLinearRingKML(Coordinate[])} method.
	* It tests the case when the input is a simple polygon.
	*/
	@Test
	void testGetLinearRingKML4() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String expected = "<LinearRing><coordinates>0.0,0.0,0.0 0.0,1.0,0.0 1.0,1.0,0.0 1.0,0.0,0.0 0.0,0.0,0.0 </coordinates></LinearRing>";
		String actual = GeomConverter.getLinearRingKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getLinearRingKML(Coordinate[])} method.
	* It tests the case when the input is a simple polygon.
	*/
	@Test
	void testGetLinearRingKML5() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String expected = "<LinearRing><coordinates>0.0,0.0,0.0 0.0,1.0,0.0 1.0,1.0,0.0 1.0,0.0,0.0 0.0,0.0,0.0 </coordinates></LinearRing>";
		String actual = GeomConverter.getLinearRingKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getLinearRingKML(Coordinate[])} method.
	* It tests the case when the input is a simple polygon.
	*/
	@Test
	void testGetLinearRingKML6() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String expected = "<LinearRing><coordinates>0.0,0.0,0.0 0.0,1.0,0.0 1.0,1.0,0.0 1.0,0.0,0.0 0.0,0.0,0.0 </coordinates></LinearRing>";
		String actual = GeomConverter.getLinearRingKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getLinearRingKML(Coordinate[])} method.
	* It tests the case when the input is a simple polygon.
	*/
	@Test
	void testGetLinearRingKML7() {
		Coordinate[] coords = new Coordinate[5];
		coords[0] = new Coordinate(0, 0);
		coords[1] = new Coordinate(0, 1);
		coords[2] = new Coordinate(1, 1);
		coords[3] = new Coordinate(1, 0);
		coords[4] = new Coordinate(0, 0);
		String expected = "<LinearRing><coordinates>0.0,0.0,0.0 0.0,1.0,0.0 1.0,1.0,0.0 1.0,0.0,0.0 0.0,0.0,0.0 </coordinates></LinearRing>";
		String actual = GeomConverter.getLinearRingKML(coords);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GeomConverter#getLinearRingKML(Coordinate[])} method.
	* It tests the case when the input is a simple polygon.
	*/
	@Test
	void testGet