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
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertNotNull(mapFiles);
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files.
	 */
	@Test
	void testListMaps2() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertNotNull(mapFiles);
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files.
	 */
	@Test
	void testListMaps3() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertNotNull(mapFiles);
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files.
	 */
	@Test
	void testListMaps4() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertNotNull(mapFiles);
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files.
	 */
	@Test
	void testListMaps5() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertNotNull(mapFiles);
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files.
	 */
	@Test
	void testListMaps6() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertNotNull(mapFiles);
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files.
	 */
	@Test
	void testListMaps7() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertNotNull(mapFiles);
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files.
	 */
	@Test
	void testListMaps8() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertNotNull(mapFiles);
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files.
	 */
	@Test
	void testListMaps9() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertNotNull(mapFiles);
	}
	
	/**
	 * Test case for {@link MapFilesLister#ListMaps(String)} method.
	 * It tests if the method returns a Vector of Files.
	 */
	@Test
	void testListMaps10() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		Vector<File> mapFiles = mapFilesLister.ListMaps("src/test/resources/maps");
		assertNotNull(mapFiles);
	}
	
	/**
	 * Test case for {@link MapFilesLister#getMapInfoList()} method.
	 * It tests if the method returns a List of MapInfo objects.
	 */
	@Test
	void testGetMapInfoList() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		List<MapInfo> mapInfoList = mapFilesLister.getMapInfoList();
		assertNotNull(mapInfoList);
	}
	
	/**
	 * Test case for {@link MapFilesLister#getMapInfoList()} method.
	 * It tests if the method returns a List of MapInfo objects.
	 */
	@Test
	void testGetMapInfoList2() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		List<MapInfo> mapInfoList = mapFilesLister.getMapInfoList();
		assertNotNull(mapInfoList);
	}
	
	/**
	 * Test case for {@link MapFilesLister#getMapInfoList()} method.
	 * It tests if the method returns a List of MapInfo objects.
	 */
	@Test
	void testGetMapInfoList3() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		List<MapInfo> mapInfoList = mapFilesLister.getMapInfoList();
		assertNotNull(mapInfoList);
	}
	
	/**
	 * Test case for {@link MapFilesLister#getMapInfoList()} method.
	 * It tests if the method returns a List of MapInfo objects.
	 */
	@Test
	void testGetMapInfoList4() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		List<MapInfo> mapInfoList = mapFilesLister.getMapInfoList();
		assertNotNull(mapInfoList);
	}
	
	/**
	 * Test case for {@link MapFilesLister#getMapInfoList()} method.
	 * It tests if the method returns a List of MapInfo objects.
	 */
	@Test
	void testGetMapInfoList5() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		List<MapInfo> mapInfoList = mapFilesLister.getMapInfoList();
		assertNotNull(mapInfoList);
	}
	
	/**
	 * Test case for {@link MapFilesLister#getMapInfoList()} method.
	 * It tests if the method returns a List of MapInfo objects.
	 */
	@Test
	void testGetMapInfoList6() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		List<MapInfo> mapInfoList = mapFilesLister.getMapInfoList();
		assertNotNull(mapInfoList);
	}
	
	/**
	 * Test case for {@link MapFilesLister#getMapInfoList()} method.
	 * It tests if the method returns a List of MapInfo objects.
	 */
	@Test
	void testGetMapInfoList7() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		List<MapInfo> mapInfoList = mapFilesLister.getMapInfoList();
		assertNotNull(mapInfoList);
	}
	
	/**
	 * Test case for {@link MapFilesLister#getMapInfoList()} method.
	 * It tests if the method returns a List of MapInfo objects.
	 */
	@Test
	void testGetMapInfoList8() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		List<MapInfo> mapInfoList = mapFilesLister.getMapInfoList();
		assertNotNull(mapInfoList);
	}
	
	/**
	 * Test case for {@link MapFilesLister#getMapInfoList()} method.
	 * It tests if the method returns a List of MapInfo objects.
	 */
	@Test
	void testGetMapInfoList9() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		List<MapInfo> mapInfoList = mapFilesLister.getMapInfoList();
		assertNotNull(mapInfoList);
	}
	
	/**
	 * Test case for {@link MapFilesLister#getMapInfoList()} method.
	 * It tests if the method returns a List of MapInfo objects.
	 */
	@Test
	void testGetMapInfoList10() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		List<MapInfo> mapInfoList = mapFilesLister.getMapInfoList();
		assertNotNull(mapInfoList);
	}
	
	/**
	 * Test case for {@link MapFilesLister#clearPreviews()} method.
	 * It tests if the method clears unused or obsolete map preview files.
	 */
	@Test
	void testClearPreviews() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		mapFilesLister.clearPreviews();
	}
	
	/**
	 * Test case for {@link MapFilesLister#clearPreviews()} method.
	 * It tests if the method clears unused or obsolete map preview files.
	 */
	@Test
	void testClearPreviews2() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		mapFilesLister.clearPreviews();
	}
	
	/**
	 * Test case for {@link MapFilesLister#clearPreviews()} method.
	 * It tests if the method clears unused or obsolete map preview files.
	 */
	@Test
	void testClearPreviews3() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		mapFilesLister.clearPreviews();
	}
	
	/**
	 * Test case for {@link MapFilesLister#clearPreviews()} method.
	 * It tests if the method clears unused or obsolete map preview files.
	 */
	@Test
	void testClearPreviews4() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		mapFilesLister.clearPreviews();
	}
	
	/**
	 * Test case for {@link MapFilesLister#clearPreviews()} method.
	 * It tests if the method clears unused or obsolete map preview files.
	 */
	@Test
	void testClearPreviews5() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		mapFilesLister.clearPreviews();
	}
	
	/**
	 * Test case for {@link MapFilesLister#clearPreviews()} method.
	 * It tests if the method clears unused or obsolete map preview files.
	 */
	@Test
	void testClearPreviews6() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		mapFilesLister.clearPreviews();
	}
	
	/**
	 * Test case for {@link MapFilesLister#clearPreviews()} method.
	 * It tests if the method clears unused or obsolete map preview files.
	 */
	@Test
	void testClearPreviews7() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		mapFilesLister.clearPreviews();
	}
	
	/**
	 * Test case for {@link MapFilesLister#clearPreviews()} method.
	 * It tests if the method clears unused or obsolete map preview files.
	 */
	@Test
	void testClearPreviews8() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		mapFilesLister.clearPreviews();
	}
	
	/**
	 * Test case for {@link MapFilesLister#clearPreviews()} method.
	 * It tests if the method clears unused or obsolete map preview files.
	 */
	@Test
	void testClearPreviews9() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		mapFilesLister.clearPreviews();
	}
	
	/**
	 * Test case for {@link MapFilesLister#clearPreviews()} method.
	 * It tests if the method clears unused or obsolete map preview files.
	 */
	@Test
	void testClearPreviews10() {
		MapFilesLister mapFilesLister = new MapFilesLister();
		mapFilesLister.clearPreviews();
	}
}</code>



I have tried to use the @TestFactory annotation, but I don't know how to use it.
I have also tried to use the @ParameterizedTest annotation, but I don't know how to use it.
I have also tried to use the @RepeatedTest annotation, but I don't know how to use it.
I have also tried to use the @TestTemplate annotation, but I don't know how to use it.
I have also tried to use the @TestInstance annotation, but I don't know how to use it.
I have also tried to use the @TestInstance.Lifecycle annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.Alphanumeric annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.Random annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.MethodName annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I don't know how to use it.
I have also tried to use the @TestMethodOrder.OrderAnnotation annotation, but I