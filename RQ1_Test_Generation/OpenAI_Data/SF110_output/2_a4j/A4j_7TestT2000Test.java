// A4j_7Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ManufactureSearch(String, String, String)} method.
*/
class A4j_7Test {

		/**
		* Test case for {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the manufactureName is null.
		*/
		@Test
		void testManufactureSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch(null, "electronics", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the manufactureName is empty.
		*/
		@Test
		void testManufactureSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("", "electronics", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the manufactureName is not empty and the mode is null.
		*/
		@Test
		void testManufactureSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", null, "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the manufactureName is not empty and the mode is empty.
		*/
		@Test
		void testManufactureSearch_4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the manufactureName is not empty and the mode is not empty and the page is null.
		*/
		@Test
		void testManufactureSearch_5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", null);
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the manufactureName is not empty and the mode is not empty and the page is empty.
		*/
		@Test
		void testManufactureSearch_6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", "");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the manufactureName is not empty and the mode is not empty and the page is not empty.
		*/
		@Test
		void testManufactureSearch_7() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the manufactureName is not empty and the mode is not empty and the page is not empty.
		*/
		@Test
		void testManufactureSearch_8() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the manufactureName is not empty and the mode is not empty and the page is not empty.
		*/
		@Test
		void testManufactureSearch_9() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the manufactureName is not empty and the mode is not empty and the page is not empty.
		*/
		@Test
		void testManufactureSearch_10() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", "1");
				assertNotNull(productInfo);
		}
		
}

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
		* Test case for {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the upc is null.
		*/
		@Test
		void testUpcSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch(null, "music", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the upc is empty.
		*/
		@Test
		void testUpcSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("", "music", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the upc is not empty and the mode is null.
		*/
		@Test
		void testUpcSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("0746448981", null, "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the upc is not empty and the mode is empty.
		*/
		@