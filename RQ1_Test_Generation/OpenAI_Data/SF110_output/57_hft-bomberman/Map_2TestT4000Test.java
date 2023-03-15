// Map_2Test.java
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
* It contains ten unit test cases for the {@link Map#getStartPoint(int)} method.
*/
class Map_2Test {

		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 1.
		*/
		@Test
		void testGetStartPoint_1() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(1);
				assertEquals(new Point(20, 20), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 2.
		*/
		@Test
		void testGetStartPoint_2() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(2);
				assertEquals(new Point(20, 40), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 3.
		*/
		@Test
		void testGetStartPoint_3() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(3);
				assertEquals(new Point(40, 20), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 4.
		*/
		@Test
		void testGetStartPoint_4() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(4);
				assertEquals(new Point(40, 40), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 5.
		*/
		@Test
		void testGetStartPoint_5() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(5);
				assertEquals(new Point(60, 20), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 6.
		*/
		@Test
		void testGetStartPoint_6() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(6);
				assertEquals(new Point(60, 40), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 7.
		*/
		@Test
		void testGetStartPoint_7() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(7);
				assertEquals(new Point(80, 20), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 8.
		*/
		@Test
		void testGetStartPoint_8() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(8);
				assertEquals(new Point(80, 40), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 9.
		*/
		@Test
		void testGetStartPoint_9() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(9);
				assertEquals(new Point(100, 20), startPoint);
		}
		
		/**
		* Test case for {@link Map#getStartPoint(int)} method.
		* It tests if the method returns the correct start point for player 10.
		*/
		@Test
		void testGetStartPoint_10() {
				Map map = new Map("src/test/resources/testmap.xml");
				Point startPoint = map.getStartPoint(10);
				assertEquals(new Point(100, 40), startPoint);
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
        String mapName = root.getAttribute("name");
        String mapVersion = root.getAttribute("version");
        String mapAuthor = root.getAttribute("author");
        Date mapDate = new Date(root.getAttribute("date"));
        int mapDifficulty = Integer.parseInt(root.getAttribute("difficulty"));
        String mapImageSet = root.getAttribute("imageSet");
        int mapMaxPlayers = Integer.parseInt(root.getAttribute("maxPlayers"));
        String mapFilePath = root.getAttribute("filePath");
        // set map properties to map-object
        map.setProperties(mapName, mapVersion, mapAuthor, mapDate, mapDifficulty, mapImageSet, mapMaxPlayers, mapFilePath);
        // get map dimensions
        NodeList nodeList = root.getElementsByTagName("area");
        Element areaElement = (Element) nodeList.item(0);
        int mapX = Integer.parseInt(areaElement.getAttribute("x"));
        int mapY = Integer.parseInt(areaElement.getAttribute("y"));
        map.setArea(mapX, mapY);
    }

    /**
     * sets tiles to map-object
     *
     * @param map -
     *            map-object
     */
    public void setTiles(Map map) {
        // get all tiles
        NodeList nodeList = root.getElementsByTagName("tile");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element tileElement = (Element) nodeList.item(i);
            // get tile properties
            int tileX = Integer.parseInt(tileElement.getAttribute("x"));
            int tileY = Integer.parseInt(tileElement.getAttribute("y"));
            String tileType = tileElement.getAttribute("type");
            // set tile properties to map-object
            Tile tile = new Tile(new Point(tileX, tileY));
            tile.setType(tileType);
            map.setTileByIndex(tileX, tileY, tile);
        }
    }

    /**
     * sets powerups to map-object
     *
     * @param map -
     *            map-object
     */
    public void setPowerups(Map map) {
        // get all powerups
        NodeList nodeList = root.getElementsByTagName("powerup");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element powerupElement = (Element) nodeList.item(i);
            // get powerup properties
            int powerupX = Integer.parseInt(powerupElement.getAttribute("x"));
            int powerupY = Integer.parseInt(powerupElement.getAttribute("y"));
            String powerupType = powerupElement.getAttribute("type");
            // set powerup properties to map-object
            PowerUp powerup = new PowerUp(new Point(powerupX, powerupY));
            powerup.setType(powerupType);
            map.addPowerup(powerup);
        }
    }

    /**
     * sets startpoints to map-object
     *
     * @param map -
     *            map-object
     */
    public void setStartPoints(Map map) {
        // get all startpoints
        NodeList nodeList = root.getElementsByTagName("startpoint");
        Point[] startPoints = new Point[nodeList.getLength()];
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element startpointElement = (Element) nodeList.item(i);
            // get startpoint properties
            int startpointX = Integer.parseInt(startpointElement.getAttribute("x"));
            int startpointY = Integer.parseInt(startpointElement.getAttribute("y"));
            // set startpoint properties to map-object
            startPoints[i] = new Point(startpointX, startpointY);
        }
        map.setStartPoints(startPoints);
    }

    /**
     * returns map dimensions
     *
     * @return Point with map dimensions
     */
    public Point getArea() {
        return this.area;
    }
}

// Map_3Test.java
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
* It contains ten unit test cases for the {@link Map#getTile(int, int)} method.
*/
class Map_3Test {
		
		/**
		* Test case for {@link Map#getTile(int, int)} method.
		* It tests if the method returns the correct tile for position (0, 0).
		*/
		@Test
		void testGetTile_1() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTile(0, 0);
				assertEquals(new Tile(new Point(0, 0)), tile);
		}
		
		/**
		* Test case for {@link Map#getTile(int, int)} method.
		* It tests if the method returns the correct tile for position (20, 20).
		*/
		@Test
		void testGetTile_2() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTile(20, 20);
				assertEquals(new Tile(new Point(0, 0)), tile);
		}
		
		/**
		* Test case for {@link Map#getTile(int, int)} method.
		* It tests if the method returns the correct tile for position (40, 40).
		*/
		@Test
		void testGetTile_3() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTile(40, 40);
				assertEquals(new Tile(new Point(0, 0)), tile);
		}
		
		/**
		* Test case for {@link Map#getTile(int, int)} method.
		* It tests if the method returns the correct tile for position (60, 60).
		*/
		@Test
		void testGetTile_4() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTile(60, 60);
				assertEquals(new Tile(new Point(0, 0)), tile);
		}
		
		/**
		* Test case for {@link Map#getTile(int, int)} method.
		* It tests if the method returns the correct tile for position (80, 80).
		*/
		@Test
		void testGetTile_5() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTile(80, 80);
				assertEquals(new Tile(new Point(0, 0)), tile);
		}
		
		/**
		* Test case for {@link Map#getTile(int, int)} method.
		* It tests if the method returns the correct tile for position (100, 100).
		*/
		@Test
		void testGetTile_6() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTile(100, 100);
				assertEquals(new Tile(new Point(0, 0)), tile);
		}
		
		/**
		* Test case for {@link Map#getTile(int, int)} method.
		* It tests if the method returns the correct tile for position (120, 120).
		*/
		@Test
		void testGetTile_7() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTile(120, 120);
				assertEquals(new Tile(new Point(0, 0)), tile);
		}
		
		/**
		* Test case for {@link Map#getTile(int, int)} method.
		* It tests if the method returns the correct tile for position (140, 140).
		*/
		@Test
		void testGetTile_8() {
				Map map = new Map("src/test/resources/testmap.xml");
				Tile tile = map.getTile(140, 140);
				assertEquals(new Tile(new Point(0, 0)), tile);
		}
		
		/**
		* Test case for {@link Map#getTile(int, int)} method.
		* It tests if the method returns the correct tile for position (160, 160).
		*/
		