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
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files.
	 */
	@Test
	void testListMaps() {
		logger.info("Test if the method returns a Vector of Files.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertNotNull(mapFiles);
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files with the correct size.
	 */
	@Test
	void testListMapsSize() {
		logger.info("Test if the method returns a Vector of Files with the correct size.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertEquals(mapFiles.size(), 2);
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files with the correct content.
	 */
	@Test
	void testListMapsContent() {
		logger.info("Test if the method returns a Vector of Files with the correct content.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertEquals(mapFiles.get(0).getName(), "map1.xml");
		assertEquals(mapFiles.get(1).getName(), "map2.xml");
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files with the correct content.
	 */
	@Test
	void testListMapsContent2() {
		logger.info("Test if the method returns a Vector of Files with the correct content.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertEquals(mapFiles.get(0).getName(), "map1.xml");
		assertEquals(mapFiles.get(1).getName(), "map2.xml");
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files with the correct content.
	 */
	@Test
	void testListMapsContent3() {
		logger.info("Test if the method returns a Vector of Files with the correct content.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertEquals(mapFiles.get(0).getName(), "map1.xml");
		assertEquals(mapFiles.get(1).getName(), "map2.xml");
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files with the correct content.
	 */
	@Test
	void testListMapsContent4() {
		logger.info("Test if the method returns a Vector of Files with the correct content.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertEquals(mapFiles.get(0).getName(), "map1.xml");
		assertEquals(mapFiles.get(1).getName(), "map2.xml");
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files with the correct content.
	 */
	@Test
	void testListMapsContent5() {
		logger.info("Test if the method returns a Vector of Files with the correct content.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertEquals(mapFiles.get(0).getName(), "map1.xml");
		assertEquals(mapFiles.get(1).getName(), "map2.xml");
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files with the correct content.
	 */
	@Test
	void testListMapsContent6() {
		logger.info("Test if the method returns a Vector of Files with the correct content.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertEquals(mapFiles.get(0).getName(), "map1.xml");
		assertEquals(mapFiles.get(1).getName(), "map2.xml");
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files with the correct content.
	 */
	@Test
	void testListMapsContent7() {
		logger.info("Test if the method returns a Vector of Files with the correct content.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertEquals(mapFiles.get(0).getName(), "map1.xml");
		assertEquals(mapFiles.get(1).getName(), "map2.xml");
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files with the correct content.
	 */
	@Test
	void testListMapsContent8() {
		logger.info("Test if the method returns a Vector of Files with the correct content.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertEquals(mapFiles.get(0).getName(), "map1.xml");
		assertEquals(mapFiles.get(1).getName(), "map2.xml");
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files with the correct content.
	 */
	@Test
	void testListMapsContent9() {
		logger.info("Test if the method returns a Vector of Files with the correct content.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertEquals(mapFiles.get(0).getName(), "map1.xml");
		assertEquals(mapFiles.get(1).getName(), "map2.xml");
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files with the correct content.
	 */
	@Test
	void testListMapsContent10() {
		logger.info("Test if the method returns a Vector of Files with the correct content.");
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File>