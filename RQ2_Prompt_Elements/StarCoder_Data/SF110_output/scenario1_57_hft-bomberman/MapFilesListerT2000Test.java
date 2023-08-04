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
        MapFilesLister mapFilesLister = new MapFilesLister();
        Vector<File> maps = mapFilesLister.ListMaps("maps");
        assertEquals(10, maps.size());
    }
}
