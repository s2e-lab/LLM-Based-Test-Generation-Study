// Map_0Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains ten unit test cases for the {@link Map#getTileByIndex(int, int)} method.
*/
class Map_0Test {

		/**
		* Test case for {@link Map#getTileByIndex(int, int)}
		* 
		* @see Map#getTileByIndex(int, int)
		*/
		@Test
		void testGetTileByIndex_0() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTileByIndex(0, 0);
				assertEquals(tile.getType(), "wall");
		}
		
		/**
		* Test case for {@link Map#getTileByIndex(int, int)}
		* 
		* @see Map#getTileByIndex(int, int)
		*/
		@Test
		void testGetTileByIndex_1() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTileByIndex(1, 0);
				assertEquals(tile.getType(), "wall");
		}
		
		/**
		* Test case for {@link Map#getTileByIndex(int, int)}
		* 
		* @see Map#getTileByIndex(int, int)
		*/
		@Test
		void testGetTileByIndex_2() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTileByIndex(2, 0);
				assertEquals(tile.getType(), "wall");
		}
		
		/**
		* Test case for {@link Map#getTileByIndex(int, int)}
		* 
		* @see Map#getTileByIndex(int, int)
		*/
		@Test
		void testGetTileByIndex_3() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTileByIndex(3, 0);
				assertEquals(tile.getType(), "wall");
		}
		
		/**
		* Test case for {@link Map#getTileByIndex(int, int)}
		* 
		* @see Map#getTileByIndex(int, int)
		*/
		@Test
		void testGetTileByIndex_4() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTileByIndex(4, 0);
				assertEquals(tile.getType(), "wall");
		}
		
		/**
		* Test case for {@link Map#getTileByIndex(int, int)}
		* 
		* @see Map#getTileByIndex(int, int)
		*/
		@Test
		void testGetTileByIndex_5() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTileByIndex(5, 0);
				assertEquals(tile.getType(), "wall");
		}
		
		/**
		* Test case for {@link Map#getTileByIndex(int, int)}
		* 
		* @see Map#getTileByIndex(int, int)
		*/
		@Test
		void testGetTileByIndex_6() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTileByIndex(6, 0);
				assertEquals(tile.getType(), "wall");
		}
		
		/**
		* Test case for {@link Map#getTileByIndex(int, int)}
		* 
		* @see Map#getTileByIndex(int, int)
		*/
		@Test
		void testGetTileByIndex_7() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTileByIndex(7, 0);
				assertEquals(tile.getType(), "wall");
		}
		
		/**
		* Test case for {@link Map#getTileByIndex(int, int)}
		* 
		* @see Map#getTileByIndex(int, int)
		*/
		@Test
		void testGetTileByIndex_8() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTileByIndex(8, 0);
				assertEquals(tile.getType(), "wall");
		}
		
		/**
		* Test case for {@link Map#getTileByIndex(int, int)}
		* 
		* @see Map#getTileByIndex(int, int)
		*/
		@Test
		void testGetTileByIndex_9() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTileByIndex(9, 0);
				assertEquals(tile.getType(), "wall");
		}
}

// MapReader.java
package common;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * MapReader-Class reads xml-file and writes information to map-object
 *
 * @author christian
 */
public class MapReader {

    private Document doc;

    private Element root;

    private Point area;

    /**
     * creates MapReader-Object and reads xml-file
     *
     * @param xmlFile -
     *            path to xml-file
     */
    public MapReader(String xmlFile) {
        try {
            File file = new File(xmlFile);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(file);
            doc.getDocumentElement().normalize();
            root = doc.getDocumentElement();
            area = new Point();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * sets map properties to map-object
     *
     * @param map -
     *            map-object
     */
    public void setMapProperies(Map map) {
        // get map properties
        NodeList mapProperties = root.getElementsByTagName("map");
        Element mapProperty = (Element) mapProperties.item(0);
        // get map dimensions
        NodeList mapDimensions = mapProperty.getElementsByTagName("area");
        Element mapDimension = (Element) mapDimensions.item(0);
        area.x = Integer.parseInt(mapDimension.getAttribute("x"));
        area.y = Integer.parseInt(mapDimension.getAttribute("y"));
        // set map properties
        map.setProperties(mapProperty.getAttribute("name"), mapProperty.getAttribute("version"), mapProperty.getAttribute("author"), new Date(mapProperty.getAttribute("date")), Integer.parseInt(mapProperty.getAttribute("difficulty")),