// A4j_8Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#UpcSearch(String, String, String)} method.
*/
class A4j_8Test {

		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the method for the following values of parameters:
		* <ul>
		* <li>upc = "074645011524"</li>
		* <li>mode = "music"</li>
		* <li>page = "1"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074645011524", "music", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the method for the following values of parameters:
		* <ul>
		* <li>upc = "074645011524"</li>
		* <li>mode = "music"</li>
		* <li>page = "2"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074645011524", "music", "2");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the method for the following values of parameters:
		* <ul>
		* <li>upc = "074645011524"</li>
		* <li>mode = "music"</li>
		* <li>page = "3"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074645011524", "music", "3");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the method for the following values of parameters:
		* <ul>
		* <li>upc = "074645011524"</li>
		* <li>mode = "music"</li>
		* <li>page = "4"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074645011524", "music", "4");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the method for the following values of parameters:
		* <ul>
		* <li>upc = "074645011524"</li>
		* <li>mode = "music"</li>
		* <li>page = "5"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074645011524", "music", "5");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the method for the following values of parameters:
		* <ul>
		* <li>upc = "074645011524"</li>
		* <li>mode = "music"</li>
		* <li>page = "6"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074645011524", "music", "6");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the method for the following values of parameters:
		* <ul>
		* <li>upc = "074645011524"</li>
		* <li>mode = "music"</li>
		* <li>page = "7"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_7() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074645011524", "music", "7");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the method for the following values of parameters:
		* <ul>
		* <li>upc = "074645011524"</li>
		* <li>mode = "music"</li>
		* <li>page = "8"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_8() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074645011524", "music", "8");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the method for the following values of parameters:
		* <ul>
		* <li>upc = "074645011524"</li>
		* <li>mode = "music"</li>
		* <li>page = "9"</li>
		* </ul>
		* The expected result is that the method returns a {@link ProductInfo} object.
		*/
		@Test
		void testUpcSearch_9() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074645011524", "music", "9");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#Up