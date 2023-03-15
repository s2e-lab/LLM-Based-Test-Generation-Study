// Search_2Test.java
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
* It contains ten unit test cases for the {@link Search#Generic(String, String, String, String, String, String)} method.
*/
class Search_2Test {
/**
		* Test case for the {@link Search#Generic(String, String, String, String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchType: "ActorSearch"</li>
		* <li>searchTerm: "Tom Hanks"</li>
		* <li>mode: "dvd"</li>
		* <li>type: "lite"</li>
		* <li>page: "1"</li>
		* <li>offer: "all"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testGeneric_1() throws Exception {
				Search search = new Search();
				ProductInfo productInfo = search.Generic("ActorSearch", "Tom Hanks", "dvd", "lite", "1", "all");
				assertNotNull(productInfo);
		}

		/**
		* Test case for the {@link Search#Generic(String, String, String, String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchType: "ArtistSearch"</li>
		* <li>searchTerm: "The Beatles"</li>
		* <li>mode: "music"</li>
		* <li>type: "lite"</li>
		* <li>page: "1"</li>
		* <li>offer: "all"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testGeneric_2() throws Exception {
				Search search = new Search();
				ProductInfo productInfo = search.Generic("ArtistSearch", "The Beatles", "music", "lite", "1", "all");
				assertNotNull(productInfo);
		}

		/**
		* Test case for the {@link Search#Generic(String, String, String, String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchType: "AuthorSearch"</li>
		* <li>searchTerm: "Stephen King"</li>
		* <li>mode: "books"</li>
		* <li>type: "lite"</li>
		* <li>page: "1"</li>
		* <li>offer: "all"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testGeneric_3() throws Exception {
				Search search = new Search();
				ProductInfo productInfo = search.Generic("AuthorSearch", "Stephen King", "books", "lite", "1", "all");
				assertNotNull(productInfo);
		}

		/**
		* Test case for the {@link Search#Generic(String, String, String, String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchType: "DirectorSearch"</li>
		* <li>searchTerm: "Steven Spielberg"</li>
		* <li>mode: "dvd"</li>
		* <li>type: "lite"</li>
		* <li>page: "1"</li>
		* <li>offer: "all"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testGeneric_4() throws Exception {
				Search search = new Search();
				ProductInfo productInfo = search.Generic("DirectorSearch", "Steven Spielberg", "dvd", "lite", "1", "all");
				assertNotNull(productInfo);
		}

		/**
		* Test case for the {@link Search#Generic(String, String, String, String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchType: "ManufacturerSearch"</li>
		* <li>searchTerm: "Sony"</li>
		* <li>mode: "electronics"</li>
		* <li>type: "lite"</li>
		* <li>page: "1"</li>
		* <li>offer: "all"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testGeneric_5() throws Exception {
				Search search = new Search();
				ProductInfo productInfo = search.Generic("ManufacturerSearch", "Sony", "electronics", "lite", "1", "all");
				assertNotNull(productInfo);
		}

		/**
		* Test case for the {@link Search#Generic(String, String, String, String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchType: "UpcSearch"</li>
		* <li>searchTerm: "074644859125"</li>
		* <li>mode: "music"</li>
		* <li>type: "lite"</li>
		* <li>page: "1"</li>
		* <li>offer: "all"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testGeneric_6() throws Exception {
				Search search = new Search();
				ProductInfo productInfo = search.Generic("UpcSearch", "074644859125", "music", "lite", "1", "all");
				assertNotNull(productInfo);
		}

		/**
		* Test case for the {@link Search#Generic(String, String, String, String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchType: "ListManiaSearch"</li>
		* <li>searchTerm: "1QQQQQQQQQQQQQQQQQQQ"</li>
		* <li>mode: "mode"</li>
		* <li>type: "lite"</li>
		* <li>page: "1"</li>
		* <li>offer: "all"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testGeneric_7() throws Exception {
				Search search = new Search();
				ProductInfo productInfo = search.Generic("ListManiaSearch", "1QQQQQQQQQQQQQQQQQQQ", "mode", "lite", "1", "all");
				assertNotNull(productInfo);
		}

		/**
		* Test case for the {@link Search#Generic(String, String, String, String, String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchType: "WishlistSearch"</li>
		* <li>searchTerm: "1QQQQQQQQQQQQQQQQQQQ"</li>
		* <li>mode: "mode"</li>
		* <li>type: "lite"</li>
		* <li>page: "1"</li>
		* <