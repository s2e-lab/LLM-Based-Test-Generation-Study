// Search_5Test.java
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
* It contains ten unit test cases for the {@link Search#AuthorSearch(String, String)} method.
*/
class Search_5Test {
/**
		* Test case for the {@link Search#AuthorSearch(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>authorName: "J.K. Rowling"</li>
		* <li>page: "1"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testAuthorSearch_1() {
				String authorName = "J.K. Rowling";
				String page = "1";
				ProductInfo result = new Search().AuthorSearch(authorName, page);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#AuthorSearch(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>authorName: "J.K. Rowling"</li>
		* <li>page: "2"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testAuthorSearch_2() {
				String authorName = "J.K. Rowling";
				String page = "2";
				ProductInfo result = new Search().AuthorSearch(authorName, page);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#AuthorSearch(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>authorName: "J.K. Rowling"</li>
		* <li>page: "3"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testAuthorSearch_3() {
				String authorName = "J.K. Rowling";
				String page = "3";
				ProductInfo result = new Search().AuthorSearch(authorName, page);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#AuthorSearch(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>authorName: "J.K. Rowling"</li>
		* <li>page: "4"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testAuthorSearch_4() {
				String authorName = "J.K. Rowling";
				String page = "4";
				ProductInfo result = new Search().AuthorSearch(authorName, page);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#AuthorSearch(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>authorName: "J.K. Rowling"</li>
		* <li>page: "5"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testAuthorSearch_5() {
				String authorName = "J.K. Rowling";
				String page = "5";
				ProductInfo result = new Search().AuthorSearch(authorName, page);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#AuthorSearch(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>authorName: "J.K. Rowling"</li>
		* <li>page: "6"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testAuthorSearch_6() {
				String authorName = "J.K. Rowling";
				String page = "6";
				ProductInfo result = new Search().AuthorSearch(authorName, page);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#AuthorSearch(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>authorName: "J.K. Rowling"</li>
		* <li>page: "7"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testAuthorSearch_7() {
				String authorName = "J.K. Rowling";
				String page = "7";
				ProductInfo result = new Search().AuthorSearch(authorName, page);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#AuthorSearch(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>authorName: "J.K. Rowling"</li>
		* <li>page: "8"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testAuthorSearch_8() {
				String authorName = "J.K. Rowling";
				String page = "8";
				ProductInfo result = new Search().AuthorSearch(authorName, page);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#AuthorSearch(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>authorName: "J.K. Rowling"</li>
		* <li>page: "9"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testAuthorSearch_9() {
				String authorName = "J.K. Rowling";
				String page = "9";
				ProductInfo result = new Search().AuthorSearch(authorName, page);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#AuthorSearch(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>authorName: "J.K. Rowling"</li>
		* <li>page: "10"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testAuthorSearch_10() {
				String authorName = "J.K. Rowling";
				String page = "10";
				ProductInfo result = new Search().AuthorSearch(authorName, page);
				assertNotNull(result);
		}
}

// Search_6Test.java
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
* It contains ten unit test cases for the {@link Search#Blended(String, String)} method.
*/
class Search_6Test {
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchTerm: "Harry Potter"</li>
		* <li>type: "lite"</li>
		* </ul>
		* The expected result is that the method returns a {@link BlendedSearch} object.
		*/
		@Test
		void testBlended_1() {
				String searchTerm = "Harry Potter";
				String type = "lite";
				BlendedSearch result = new Search().Blended(searchTerm, type);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchTerm: "Harry Potter"</li>
		* <li>type: "heavy"</li>
		* </ul>
		* The expected result is that the method returns a {@link BlendedSearch} object.
		*/
		@Test
		void testBlended_2() {
				String searchTerm = "Harry Potter";
				String type = "heavy";
				BlendedSearch result = new Search().Blended(searchTerm, type);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchTerm: "Harry Potter"</li>
		* <li>type: "lite"</li>
		* </ul>
		* The expected result is that the method returns a {@link BlendedSearch} object.
		*/
		@Test
		void testBlended_3() {
				String searchTerm = "Harry Potter";
				String type = "lite";
				BlendedSearch result = new Search().Blended(searchTerm, type);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchTerm: "Harry Potter"</li>
		* <li>type: "heavy"</li>
		* </ul>
		* The expected result is that the method returns a {@link BlendedSearch} object.
		*/
		@Test
		void testBlended_4() {
				String searchTerm = "Harry Potter";
				String type = "heavy";
				BlendedSearch result = new Search().Blended(searchTerm, type);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchTerm: "Harry Potter"</li>
		* <li>type: "lite"</li>
		* </ul>
		* The expected result is that the method returns a {@link BlendedSearch} object.
		*/
		@Test
		void testBlended_5() {
				String searchTerm = "Harry Potter";
				String type = "lite";
				BlendedSearch result = new Search().Blended(searchTerm, type);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchTerm: "Harry Potter"</li>
		* <li>type: "heavy"</li>
		* </ul>
		* The expected result is that the method returns a {@link BlendedSearch} object.
		*/
		@Test
		void testBlended_6() {
				String searchTerm = "Harry Potter";
				String type = "heavy";
				BlendedSearch result = new Search().Blended(searchTerm, type);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchTerm: "Harry Potter"</li>
		* <li>type: "lite"</li>
		* </ul>
		* The expected result is that the method returns a {@link BlendedSearch} object.
		*/
		@Test
		void testBlended_7() {
				String searchTerm = "Harry Potter";
				String type = "lite";
				BlendedSearch result = new Search().Blended(searchTerm, type);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchTerm: "Harry Potter"</li>
		* <li>type: "heavy"</li>
		* </ul>
		* The expected result is that the method returns a {@link BlendedSearch} object.
		*/
		@Test
		void testBlended_8() {
				String searchTerm = "Harry Potter";
				String type = "heavy";
				BlendedSearch result = new Search().Blended(searchTerm, type);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchTerm: "Harry Potter"</li>
		* <li>type: "lite"</li>
		* </ul>
		* The expected result is that the method returns a {@link BlendedSearch} object.
		*/
		@Test
		void testBlended_9() {
				String searchTerm = "Harry Potter";
				String type = "lite";
				BlendedSearch result = new Search().Blended(searchTerm, type);
				assertNotNull(result);
		}
		/**
		* Test case for the {@link Search#Blended(String, String)} method.
		* It tests the method with the following parameters:
		* <ul>
		* <li>searchTerm: "Harry Potter"</li>
		* <li>type: "heavy"</li>
		* </ul>
		* The expected result is that the method returns a {@link BlendedSearch} object.
		*/
		@Test
		void testBlended_10() {
				String searchTerm = "Harry Potter";
				String type = "heavy";
				BlendedSearch result = new Search().Blended(searchTerm, type);
				assertNotNull(result);
		}
}

// Search_7Test.java
package net