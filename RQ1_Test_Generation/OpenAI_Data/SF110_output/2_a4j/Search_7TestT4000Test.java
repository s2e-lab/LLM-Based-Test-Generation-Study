// Search_7Test.java
package net.kencochrane.a4j.DAO;

import com.wutka.jox.JOXBeanInputStream;
import net.kencochrane.a4j.beans.BlendedSearch;
import net.kencochrane.a4j.beans.ProductInfo;
import net.kencochrane.a4j.beans.SellerSearch;
import net.kencochrane.a4j.file.FileUtil;
import java.io.FileInputStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#ManufactureSearch(String, String, String)} method.
*/
class Search_7Test {

		/**
		* Test case for the {@link Search#ManufactureSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>manufactureName = "Sony"</li>
		* <li>mode = "electronics"</li>
		* <li>page = "1"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testManufactureSearch_1() {
				Search search = new Search();
				ProductInfo productInfo = search.ManufactureSearch("Sony", "electronics", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#ManufactureSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>manufactureName = "Sony"</li>
		* <li>mode = "electronics"</li>
		* <li>page = "2"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testManufactureSearch_2() {
				Search search = new Search();
				ProductInfo productInfo = search.ManufactureSearch("Sony", "electronics", "2");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#ManufactureSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>manufactureName = "Sony"</li>
		* <li>mode = "electronics"</li>
		* <li>page = "3"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testManufactureSearch_3() {
				Search search = new Search();
				ProductInfo productInfo = search.ManufactureSearch("Sony", "electronics", "3");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#ManufactureSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>manufactureName = "Sony"</li>
		* <li>mode = "electronics"</li>
		* <li>page = "4"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testManufactureSearch_4() {
				Search search = new Search();
				ProductInfo productInfo = search.ManufactureSearch("Sony", "electronics", "4");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#ManufactureSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>manufactureName = "Sony"</li>
		* <li>mode = "electronics"</li>
		* <li>page = "5"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testManufactureSearch_5() {
				Search search = new Search();
				ProductInfo productInfo = search.ManufactureSearch("Sony", "electronics", "5");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#ManufactureSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>manufactureName = "Sony"</li>
		* <li>mode = "electronics"</li>
		* <li>page = "6"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testManufactureSearch_6() {
				Search search = new Search();
				ProductInfo productInfo = search.ManufactureSearch("Sony", "electronics", "6");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#ManufactureSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>manufactureName = "Sony"</li>
		* <li>mode = "electronics"</li>
		* <li>page = "7"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testManufactureSearch_7() {
				Search search = new Search();
				ProductInfo productInfo = search.ManufactureSearch("Sony", "electronics", "7");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#ManufactureSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>manufactureName = "Sony"</li>
		* <li>mode = "electronics"</li>
		* <li>page = "8"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testManufactureSearch_8() {
				Search search = new Search();
				ProductInfo productInfo = search.ManufactureSearch("Sony", "electronics", "8");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#ManufactureSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>manufactureName = "Sony"</li>
		* <li>mode = "electronics"</li>
		* <li>page = "9"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testManufactureSearch_9() {
				Search search = new Search();
				ProductInfo productInfo = search.ManufactureSearch("Sony", "electronics", "9");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#ManufactureSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>manufactureName = "Sony"</li>
		* <li>mode = "electronics"</li>
		* <li>page = "10"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testManufactureSearch_10() {
				Search search = new Search();
				ProductInfo productInfo = search.ManufactureSearch("Sony", "electronics", "10");
				assertNotNull(productInfo);
		}
		
}

// Search_8Test.java
package net.kencochrane.a4j.DAO;

import com.wutka.jox.JOXBeanInputStream;
import net.kencochrane.a4j.beans.BlendedSearch;
import net.kencochrane.a4j.beans.ProductInfo;
import net.kencochrane.a4j.beans.SellerSearch;
import net.kencochrane.a4j.file.FileUtil;
import java.io.FileInputStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains ten unit test cases for the {@link Search#UpcSearch(String, String, String)} method.
*/
class Search_8Test {
		
		/**
		* Test case for the {@link Search#UpcSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>upc = "074644524625"</li>
		* <li>mode = "music"</li>
		* <li>page = "1"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_1() {
				Search search = new Search();
				ProductInfo productInfo = search.UpcSearch("074644524625", "music", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#UpcSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>upc = "074644524625"</li>
		* <li>mode = "music"</li>
		* <li>page = "2"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_2() {
				Search search = new Search();
				ProductInfo productInfo = search.UpcSearch("074644524625", "music", "2");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#UpcSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>upc = "074644524625"</li>
		* <li>mode = "music"</li>
		* <li>page = "3"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_3() {
				Search search = new Search();
				ProductInfo productInfo = search.UpcSearch("074644524625", "music", "3");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#UpcSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>upc = "074644524625"</li>
		* <li>mode = "music"</li>
		* <li>page = "4"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_4() {
				Search search = new Search();
				ProductInfo productInfo = search.UpcSearch("074644524625", "music", "4");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#UpcSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>upc = "074644524625"</li>
		* <li>mode = "music"</li>
		* <li>page = "5"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_5() {
				Search search = new Search();
				ProductInfo productInfo = search.UpcSearch("074644524625", "music", "5");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#UpcSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>upc = "074644524625"</li>
		* <li>mode = "music"</li>
		* <li>page = "6"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_6() {
				Search search = new Search();
				ProductInfo productInfo = search.UpcSearch("074644524625", "music", "6");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#UpcSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>upc = "074644524625"</li>
		* <li>mode = "music"</li>
		* <li>page = "7"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_7() {
				Search search = new Search();
				ProductInfo productInfo = search.UpcSearch("074644524625", "music", "7");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#UpcSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>upc = "074644524625"</li>
		* <li>mode = "music"</li>
		* <li>page = "8"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_8() {
				Search search = new Search();
				ProductInfo productInfo = search.UpcSearch("074644524625", "music", "8");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link Search#UpcSearch(String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>upc = "074644524625"</li>
		* <li>mode = "music"</li>
		* <li>page = "9"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.