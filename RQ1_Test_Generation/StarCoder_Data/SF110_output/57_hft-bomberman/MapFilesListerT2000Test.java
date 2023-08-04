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

    @Test
    void testListMaps() {
        logger.info("testListMaps");
        // test case 1
        String dir = Constants.MAP_PATH;
        Vector<File> mapFiles = new MapFilesLister().ListMaps(dir);
        assertEquals(10, mapFiles.size());
        // test case 2
        dir = "src/test/resources/maps";
        mapFiles = new MapFilesLister().ListMaps(dir);
        assertEquals(10, mapFiles.size());
        // test case 3
        dir = "src/test/resources/maps/map1";
        mapFiles = new MapFilesLister().ListMaps(dir);
        assertEquals(1, mapFiles.size());
        // test case 4
        dir = "src/test/resources/maps/map1/map1.xml";
        mapFiles = new MapFilesLister().ListMaps(dir);
        assertEquals(1, mapFiles.size());
        // test case 5
        dir = "src/test/resources/maps/map1/map1.xml/map1.xml";
        mapFiles = new MapFilesLister().ListMaps(dir);
        assertEquals(1, mapFiles.size());
        // test case 6
        dir = "src/test/resources/maps/map1/map1.xml/map1.xml/map1.xml";
        mapFiles = new MapFilesLister().ListMaps(dir);
        assertEquals(1, mapFiles.size());
        // test case 7
        dir = "src/test/resources/maps/map1/map1.xml/map1.xml/map1.xml/map1.xml";
        mapFiles = new MapFilesLister().ListMaps(dir);
        assertEquals(1, mapFiles.size());
        // test case 8
        dir = "src/test/resources/maps/map1/map1.xml/map1.xml/map1.xml/map1.xml/map1.xml";
        mapFiles = new MapFilesLister().ListMaps(dir);
        assertEquals(1, mapFiles.size());
        // test case 9
        dir = "src/test/resources/maps/map1/map1.xml/map1.xml/map1.xml/map1.xml/map1.xml/map1.xml";
        mapFiles = new MapFilesLister().ListMaps(dir);
        assertEquals(1, mapFiles.size());
        // test case 10
        dir = "src/test/resources/maps/map1/map1.xml/map1.xml/map1.xml/map1.xml/map1.xml/map1.xml/map1.xml";
        mapFiles = new MapFilesLister().ListMaps(dir);
        assertEquals(1, mapFiles.size());
    }

    @Test
    void testGetMapInfoList() {
        logger.info("testGetMapInfoList");
        List<MapInfo> maps = new MapFilesLister().getMapInfoList();
        assertEquals(10, maps.size());
    }

    @Test
    void testClearPreviews() {
        logger.info("testClearPreviews");
        new MapFilesLister().clearPreviews();
    }
}
