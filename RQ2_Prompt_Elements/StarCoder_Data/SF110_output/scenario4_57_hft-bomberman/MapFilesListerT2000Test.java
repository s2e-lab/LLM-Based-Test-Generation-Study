// MapFilesListerTest.java
package common;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapFilesLister}.
* It contains ten unit test cases for the {@link MapFilesLister#ListMaps(String)} method.
*/
class MapFilesListerTest {

    private static final Logger logger = Logger.getLogger(MapFilesListerTest.class);

    /**
     * Test of ListMaps method, of class MapFilesLister.
     */
    @Test
    void testListMaps() {
        logger.info("testListMaps");
        String dir = "src/test/resources/maps";
        MapFilesLister instance = new MapFilesLister();
        Vector<File> expResult = new Vector<File>();
        expResult.add(new File("src/test/resources/maps/map1.xml"));
        expResult.add(new File("src/test/resources/maps/map2.xml"));
        expResult.add(new File("src/test/resources/maps/map3.xml"));
        Vector<File> result = instance.ListMaps(dir);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMapInfoList method, of class MapFilesLister.
     */
    @Test
    void testGetMapInfoList() {
        logger.info("getMapInfoList");
        MapFilesLister instance = new MapFilesLister();
        List<MapInfo> expResult = new LinkedList<MapInfo>();
        expResult.add(new MapInfo("map1", "map1.xml", "map1.png"));
        expResult.add(new MapInfo("map2", "map2.xml", "map2.png"));
        expResult.add(new MapInfo("map3", "map3.xml", "map3.png"));
        List<MapInfo> result = instance.getMapInfoList();
        assertEquals(expResult, result);
    }

    /**
     * Test of clearPreviews method, of class MapFilesLister.
     */
    @Test
    void testClearPreviews() {
        logger.info("clearPreviews");
        MapFilesLister instance = new MapFilesLister();
        instance.clearPreviews();
    }
}
