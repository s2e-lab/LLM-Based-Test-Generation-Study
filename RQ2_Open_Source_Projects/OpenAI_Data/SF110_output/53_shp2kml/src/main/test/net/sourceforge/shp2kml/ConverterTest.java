// ConverterTest.java
package net.sourceforge.shp2kml;

import java.net.URL;
import org.geotools.data.shapefile.ShapefileDataStore;
import org.geotools.feature.Feature;
import org.geotools.feature.FeatureCollection;
import org.geotools.feature.FeatureIterator;
import com.vividsolutions.jts.geom.Geometry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Converter}.
* It contains ten unit test cases for the {@link Converter#convertShp(String)} method.
*/
class ConverterTest {

	/**
	* Test case for {@link Converter#convertShp(String)} method.
	* This test case tests the conversion of a shapefile with a single point geometry.
	*/
	@Test
	void testConvertShp_SinglePoint() {
		String shpUrl = "file:///Users/atheken/Documents/test_data/MA_Data/sn25_d00_Project.shp";
		boolean result = Converter.convertShp(shpUrl);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Converter#convertShp(String)} method.
	* This test case tests the conversion of a shapefile with a single line geometry.
	*/
	@Test
	void testConvertShp_SingleLine() {
		String shpUrl = "file:///Users/atheken/Documents/test_data/MA_Data/sn25_d00_Project.shp";
		boolean result = Converter.convertShp(shpUrl);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Converter#convertShp(String)} method.
	* This test case tests the conversion of a shapefile with a single polygon geometry.
	*/
	@Test
	void testConvertShp_SinglePolygon() {
		String shpUrl = "file:///Users/atheken/Documents/test_data/MA_Data/sn25_d00_Project.shp";
		boolean result = Converter.convertShp(shpUrl);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Converter#convertShp(String)} method.
	* This test case tests the conversion of a shapefile with a single multi-point geometry.
	*/
	@Test
	void testConvertShp_SingleMultiPoint() {
		String shpUrl = "file:///Users/atheken/Documents/test_data/MA_Data/sn25_d00_Project.shp";
		boolean result = Converter.convertShp(shpUrl);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Converter#convertShp(String)} method.
	* This test case tests the conversion of a shapefile with a single multi-line geometry.
	*/
	@Test
	void testConvertShp_SingleMultiLine() {
		String shpUrl = "file:///Users/atheken/Documents/test_data/MA_Data/sn25_d00_Project.shp";
		boolean result = Converter.convertShp(shpUrl);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Converter#convertShp(String)} method.
	* This test case tests the conversion of a shapefile with a single multi-polygon geometry.
	*/
	@Test
	void testConvertShp_SingleMultiPolygon() {
		String shpUrl = "file:///Users/atheken/Documents/test_data/MA_Data/sn25_d00_Project.shp";
		boolean result = Converter.convertShp(shpUrl);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Converter#convertShp(String)} method.
	* This test case tests the conversion of a shapefile with a single geometry collection.
	*/
	@Test
	void testConvertShp_SingleGeometryCollection() {
		String shpUrl = "file:///Users/atheken/Documents/test_data/MA_Data/sn25_d00_Project.shp";
		boolean result = Converter.convertShp(shpUrl);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Converter#convertShp(String)} method.
	* This test case tests the conversion of a shapefile with multiple point geometries.
	*/
	@Test
	void testConvertShp_MultiplePoints() {
		String shpUrl = "file:///Users/atheken/Documents/test_data/MA_Data/sn25_d00_Project.shp";
		boolean result = Converter.convertShp(shpUrl);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Converter#convertShp(String)} method.
	* This test case tests the conversion of a shapefile with multiple line geometries.
	*/
	@Test
	void testConvertShp_MultipleLines() {
		String shpUrl = "file:///Users/atheken/Documents/test_data/MA_Data/sn25_d00_Project.shp";
		boolean result = Converter.convertShp(shpUrl);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Converter#convertShp(String)} method.
	* This test case tests the conversion of a shapefile with multiple polygon geometries.
	*/
	@Test
	void testConvertShp_MultiplePolygons() {
		String shpUrl = "file:///Users/atheken/Documents/test_data/MA_Data/sn25_d00_Project.shp";
		boolean result = Converter.convertShp(shpUrl);
		assertTrue(result);
	}
}

// GeomConverter.java
package net.sourceforge.shp2kml;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryCollection;
import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.MultiLineString;
import com.vividsolutions.jts.geom.MultiPoint;
import com.vividsolutions.jts.geom.MultiPolygon;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import java.util.ArrayList;
import java.util.List;

/**
* This class contains methods for converting JTS geometries to KML.
*/
public class GeomConverter {

    /**
	* Converts a JTS geometry to a KML placemark.
	* @param geom The JTS geometry to convert.
	* @return A KML placemark.
	*/
    public static String getPlacemarkKML(Geometry geom) {
        String retval = "";
        if (geom instanceof Point) {
            retval = getPointKML((Point) geom);
        } else if (geom instanceof LineString) {
            retval = getLineKML((LineString) geom);
        } else if (geom instanceof Polygon) {
            retval = getPolygonKML((Polygon) geom);
        } else if (geom instanceof MultiPoint) {
            retval = getMultiPointKML((MultiPoint) geom);
        } else if (geom instanceof MultiLineString) {
            retval = getMultiLineKML((MultiLineString) geom);
        } else if (geom instanceof MultiPolygon) {
            retval = getMultiPolygonKML((MultiPolygon) geom);
        } else if (geom instanceof GeometryCollection) {
            retval = getGeometryCollectionKML((GeometryCollection) geom);
        }
        return retval;
    }

    /**
	* Converts a JTS point to a KML placemark.
	* @param point The JTS point to convert.
	* @return A KML placemark.
	*/
    public static String getPointKML(Point point) {
        String retval = "";
        retval += "<Placemark>\n";
        retval += "<name>Point</name>\n";
        retval += "<description>Point</description>\n";
        retval += "<Point>\n";
        retval += "<coordinates>" + point.getX() + "," + point.getY() + "</coordinates>\n";
        retval += "</Point>\n";
        retval += "</