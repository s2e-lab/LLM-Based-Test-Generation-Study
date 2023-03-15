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
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the <code>manufactureName</code> is <code>null</code>.
		*/
		@Test
		void testManufactureSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch(null, "electronics", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the <code>manufactureName</code> is empty.
		*/
		@Test
		void testManufactureSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("", "electronics", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the <code>manufactureName</code> is invalid.
		*/
		@Test
		void testManufactureSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("invalid", "electronics", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the <code>manufactureName</code> is valid.
		*/
		@Test
		void testManufactureSearch_4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the <code>manufactureName</code> is valid.
		*/
		@Test
		void testManufactureSearch_5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the <code>manufactureName</code> is valid.
		*/
		@Test
		void testManufactureSearch_6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the <code>manufactureName</code> is valid.
		*/
		@Test
		void testManufactureSearch_7() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the <code>manufactureName</code> is valid.
		*/
		@Test
		void testManufactureSearch_8() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the <code>manufactureName</code> is valid.
		*/
		@Test
		void testManufactureSearch_9() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Apple", "electronics", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the case when the <code>manufactureName</code> is valid.
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
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the <code>upc</code> is <code>null</code>.
		*/
		@Test
		void testUpcSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch(null, "music", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the <code>upc</code> is empty.
		*/
		@Test
		void testUpcSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("", "music", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the <code>upc</code> is invalid.
		*/
		@Test
		void testUpcSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("invalid", "music", "1");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the <code>upc</code> is valid.
		*/
		@Test
		void testUpcSearch_4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074644898625", "music", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the <code>upc</code> is valid.
		*/
		@Test
		void testUpcSearch_5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074644898625", "music", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the <code>upc</code> is valid.
		*/
		@Test
		void testUpcSearch_6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074644898625", "music", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the <code>upc</code> is valid.
		*/
		@Test
		void testUpcSearch_7() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074644898625", "music", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the <code>upc</code> is valid.
		*/
		@Test
		void testUpcSearch_8() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074644898625", "music", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the <code>upc</code> is valid.
		*/
		@Test
		void testUpcSearch_9() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074644898625", "music", "1");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#UpcSearch(String, String, String)} method.
		* It tests the case when the <code>upc</code> is valid.
		*/
		@Test
		void testUpcSearch_10() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.UpcSearch("074644898625", "music", "1");
				assertNotNull(productInfo);
		}
		
}

// A4j_9Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ListmaniaSearch(String)} method.
*/
class A4j_9Test {
		
		/**
		* Test case for the {@link A4j#ListmaniaSearch(String)} method.
		* It tests the case when the <code>listId</code> is <code>null</code>.
		*/
		@Test
		void testListmaniaSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ListmaniaSearch(null);
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ListmaniaSearch(String)} method.
		* It tests the case when the <code>listId</code> is empty.
		*/
		@Test
		void testListmaniaSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ListmaniaSearch("");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ListmaniaSearch(String)} method.
		* It tests the case when the <code>listId</code> is invalid.
		*/
		@Test
		void testListmaniaSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ListmaniaSearch("invalid");
				assertNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ListmaniaSearch(String)} method.
		* It tests the case when the <code>listId</code> is valid.
		*/
		@Test
		void testListmaniaSearch_4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ListmaniaSearch("B0009XHJY2");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ListmaniaSearch(String)} method.
		* It tests the case when the <code>listId</code> is valid.
		*/
		@Test
		void testListmaniaSearch_5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ListmaniaSearch("B0009XHJY2");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ListmaniaSearch(String)} method.
		* It tests the case when the <code>listId</code> is valid.
		*/
		@Test
		void testListmaniaSearch_6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ListmaniaSearch("B0009XHJY2");
				assertNotNull(productInfo);
		}
		
		/**
		* Test case for the {@link A4j#ListmaniaSearch(String)} method.
		* It tests the case when the <code>listId</code> is valid.
		*/
		@Test
		void testListmaniaSearch_7() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ListmaniaSearch("B