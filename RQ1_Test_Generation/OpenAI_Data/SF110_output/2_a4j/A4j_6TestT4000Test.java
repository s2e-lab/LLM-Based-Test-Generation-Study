// A4j_6Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#DirectorSearch(String, String, String)} method.
*/
class A4j_6Test {

		/**
		* Test case for the {@link A4j#DirectorSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>directorName</code>: <code>"Steven Spielberg"</code></li>
		* <li><code>mode</code>: <code>"dvd"</code></li>
		* <li><code>page</code>: <code>"1"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testDirectorSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.DirectorSearch("Steven Spielberg", "dvd", "1");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#DirectorSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>directorName</code>: <code>"Steven Spielberg"</code></li>
		* <li><code>mode</code>: <code>"vhs"</code></li>
		* <li><code>page</code>: <code>"1"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testDirectorSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.DirectorSearch("Steven Spielberg", "vhs", "1");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#DirectorSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>directorName</code>: <code>"Steven Spielberg"</code></li>
		* <li><code>mode</code>: <code>"video"</code></li>
		* <li><code>page</code>: <code>"1"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testDirectorSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.DirectorSearch("Steven Spielberg", "video", "1");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#DirectorSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>directorName</code>: <code>"Steven Spielberg"</code></li>
		* <li><code>mode</code>: <code>"dvd"</code></li>
		* <li><code>page</code>: <code>"2"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testDirectorSearch_4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.DirectorSearch("Steven Spielberg", "dvd", "2");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#DirectorSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>directorName</code>: <code>"Steven Spielberg"</code></li>
		* <li><code>mode</code>: <code>"vhs"</code></li>
		* <li><code>page</code>: <code>"2"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testDirectorSearch_5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.DirectorSearch("Steven Spielberg", "vhs", "2");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#DirectorSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>directorName</code>: <code>"Steven Spielberg"</code></li>
		* <li><code>mode</code>: <code>"video"</code></li>
		* <li><code>page</code>: <code>"2"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testDirectorSearch_6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.DirectorSearch("Steven Spielberg", "video", "2");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#DirectorSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>directorName</code>: <code>"Steven Spielberg"</code></li>
		* <li><code>mode</code>: <code>"dvd"</code></li>
		* <li><code>page</code>: <code>"3"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testDirectorSearch_7() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.DirectorSearch("Steven Spielberg", "dvd", "3");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#DirectorSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>directorName</code>: <code>"Steven Spielberg"</code></li>
		* <li><code>mode</code>: <code>"vhs"</code></li>
		* <li><code>page</code>: <code>"3"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testDirectorSearch_8() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.DirectorSearch("Steven Spielberg", "vhs", "3");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#DirectorSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>directorName</code>: <code>"Steven Spielberg"</code></li>
		* <li><code>mode</code>: <code>"video"</code></li>
		* <li><code>page</code>: <code>"3"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testDirectorSearch_9() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.DirectorSearch("Steven Spielberg", "video", "3");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#DirectorSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>directorName</code>: <code>"Steven Spielberg"</code></li>
		* <li><code>mode</code>: <code>"dvd"</code></li>
		* <li><code>page</code>: <code>"4"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testDirectorSearch_10() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.DirectorSearch("Steven Spielberg", "dvd", "4");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
}

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
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>manufactureName</code>: <code>"Sony"</code></li>
		* <li><code>mode</code>: <code>"electronics"</code></li>
		* <li><code>page</code>: <code>"1"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testManufactureSearch_1() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Sony", "electronics", "1");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>manufactureName</code>: <code>"Sony"</code></li>
		* <li><code>mode</code>: <code>"kitchen"</code></li>
		* <li><code>page</code>: <code>"1"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testManufactureSearch_2() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Sony", "kitchen", "1");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>manufactureName</code>: <code>"Sony"</code></li>
		* <li><code>mode</code>: <code>"videogames"</code></li>
		* <li><code>page</code>: <code>"1"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testManufactureSearch_3() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Sony", "videogames", "1");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>manufactureName</code>: <code>"Sony"</code></li>
		* <li><code>mode</code>: <code>"software"</code></li>
		* <li><code>page</code>: <code>"1"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testManufactureSearch_4() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Sony", "software", "1");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>manufactureName</code>: <code>"Sony"</code></li>
		* <li><code>mode</code>: <code>"photo"</code></li>
		* <li><code>page</code>: <code>"1"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testManufactureSearch_5() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Sony", "photo", "1");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String, String)} method.
		* It tests the method for the following values of the parameters:
		* <ul>
		* <li><code>manufactureName</code>: <code>"Sony"</code></li>
		* <li><code>mode</code>: <code>"pc-hardware"</code></li>
		* <li><code>page</code>: <code>"1"</code></li>
		* </ul>
		* The expected result is <code>true</code>.
		*/
		@Test
		void testManufactureSearch_6() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ManufactureSearch("Sony", "pc-hardware", "1");
				assertTrue(productInfo.getTotalResults() > 0);
		}
		
		/**
		* Test case for the {@link A4j#ManufactureSearch(String, String,