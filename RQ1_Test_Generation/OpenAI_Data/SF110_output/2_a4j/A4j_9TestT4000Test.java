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
		* Test case for {@link A4j#ListmaniaSearch(String)}.
		* It tests the method for the following values of parameter <code>listId</code>:
		* <ul>
		*  <li><code>null</code></li>
		*  <li>empty string</li>
		*  <li>string with length greater than 10</li>
		*  <li>string with length less than 10</li>
		*  <li>string with length equal to 10</li>
		* </ul>
		*/
		@Test
		void testListmaniaSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ListmaniaSearch(null);
				assertNull(productInfo);
				productInfo = a4j.ListmaniaSearch("");
				assertNull(productInfo);
				productInfo = a4j.ListmaniaSearch("12345678901");
				assertNull(productInfo);
				productInfo = a4j.ListmaniaSearch("123456789");
				assertNull(productInfo);
				productInfo = a4j.ListmaniaSearch("1234567890");
				assertNull(productInfo);
		}
}

// A4j_10Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#WishListSearch(String)} method.
*/
class A4j_10Test {
		
		/**
		* Test case for {@link A4j#WishListSearch(String)}.
		* It tests the method for the following values of parameter <code>wishListId</code>:
		* <ul>
		*  <li><code>null</code></li>
		*  <li>empty string</li>
		*  <li>string with length greater than 10</li>
		*  <li>string with length less than 10</li>
		*  <li>string with length equal to 10</li>
		* </ul>
		*/
		@Test
		void testWishListSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.WishListSearch(null);
				assertNull(productInfo);
				productInfo = a4j.WishListSearch("");
				assertNull(productInfo);
				productInfo = a4j.WishListSearch("12345678901");
				assertNull(productInfo);
				productInfo = a4j.WishListSearch("123456789");
				assertNull(productInfo);
				productInfo = a4j.WishListSearch("1234567890");
				assertNull(productInfo);
		}
}

// A4j_11Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ThirdParty(String, String, String, String)} method.
*/
class A4j_11Test {
		
		/**
		* Test case for {@link A4j#ThirdParty(String, String, String, String)}.
		* It tests the method for the following values of parameter <code>sellerId</code>:
		* <ul>
		*  <li><code>null</code></li>
		*  <li>empty string</li>
		*  <li>string with length greater than 10</li>
		*  <li>string with length less than 10</li>
		*  <li>string with length equal to 10</li>
		* </ul>
		*/
		@Test
		void testThirdParty() {
				A4j a4j = new A4j();
				SellerSearch sellerSearch = a4j.ThirdParty(null, null, null, null);
				assertNull(sellerSearch);
				sellerSearch = a4j.ThirdParty("", null, null, null);
				assertNull(sellerSearch);
				sellerSearch = a4j.ThirdParty("12345678901", null, null, null);
				assertNull(sellerSearch);
				sellerSearch = a4j.ThirdParty("123456789", null, null, null);
				assertNull(sellerSearch);
				sellerSearch = a4j.ThirdParty("1234567890", null, null, null);
				assertNull(sellerSearch);
		}
}

// A4j_12Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#AddtoCart(String, String)} method.
*/
class A4j_12Test {
		
		/**
		* Test case for {@link A4j#AddtoCart(String, String)}.
		* It tests the method for the following values of parameter <code>asin</code>:
		* <ul>
		*  <li><code>null</code></li>
		*  <li>empty string</li>
		*  <li>string with length greater than 10</li>
		*  <li>string with length less than 10</li>
		*  <li>string with length equal to 10</li>
		* </ul>
		*/
		@Test
		void testAddtoCart() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.AddtoCart(null, null);
				assertNull(shoppingCart);
				shoppingCart = a4j.AddtoCart("", null);
				assertNull(shoppingCart);
				shoppingCart = a4j.AddtoCart("12345678901", null);
				assertNull(shoppingCart);
				shoppingCart = a4j.AddtoCart("123456789", null);
				assertNull(shoppingCart);
				shoppingCart = a4j.AddtoCart("1234567890", null);
				assertNull(shoppingCart);
		}
}

// A4j_13Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#addToExistingCart(String, String, String, String)} method.
*/
class A4j_13Test {
		
		/**
		* Test case for {@link A4j#addToExistingCart(String, String, String, String)}.
		* It tests the method for the following values of parameter <code>cartId</code>:
		* <ul>
		*  <li><code>null</code></li>
		*  <li>empty string</li>
		*  <li>string with length greater than 10</li>
		*  <li>string with length less than 10</li>
		*  <li>string with length equal to 10</li>
		* </ul>
		*/
		@Test
		void testAddToExistingCart() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.addToExistingCart(null, null, null, null);
				assertNull(shoppingCart);
				shoppingCart = a4j.addToExistingCart("", null, null, null);
				assertNull(shoppingCart);
				shoppingCart = a4j.addToExistingCart("12345678901", null, null, null);
				assertNull(shoppingCart);
				shoppingCart = a4j.addToExistingCart("123456789", null, null, null);
				assertNull(shoppingCart);
				shoppingCart = a4j.addToExistingCart("1234567890", null, null, null);
				assertNull(shoppingCart);
		}
}

// A4j_14Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#clearCart(String, String)} method.
*/
class A4j_14Test {
		
		/**
		* Test case for {@link A4j#clearCart(String, String)}.
		* It tests the method for the following values of parameter <code>cartId</code>:
		* <ul>
		*  <li><code>null</code></li>
		*  <li>empty string</li>
		*  <li>string with length greater than 10</li>
		*  <li>string with length less than 10</li>
		*  <li>string with length equal to 10</li>
		* </ul>
		*/
		@Test
		void testClearCart() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.clearCart(null, null);
				assertNull(shoppingCart);
				shoppingCart = a4j.clearCart("", null);
				assertNull(shoppingCart);
				shoppingCart = a4j.clearCart("12345678901", null);
				assertNull(shoppingCart);
				shoppingCart = a4j.clearCart("123456789", null);
				assertNull(shoppingCart);
				shoppingCart = a4j.clearCart("1234567890", null);
				assertNull(shoppingCart);
		}
}

// A4j_15Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#modifyCart(String, String, String, String)} method.
*/
class A4j_15Test {
		
		/**
		* Test case for {@link A4j#modifyCart(String, String, String, String)}.
		* It tests the method for the following values of parameter <code>cartId</code>:
		* <ul>
		*  <li><code>null</code></li>
		*  <li>empty string</li>
		*  <li>string with length greater than 10</li>
		*  <li>string with length less than 10</li>
		*  <li>string with length equal to 10</li>
		* </ul>
		*/
		@Test
		void testModifyCart() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.modifyCart(null, null, null, null);
				assertNull(shoppingCart);
				shoppingCart = a4j.modifyCart("", null, null, null);
				assertNull(shoppingCart);
				shoppingCart = a4j.modifyCart("12345678901", null, null, null);
				assertNull(shoppingCart);
				shoppingCart = a4j.modifyCart("123456789", null, null, null);
				assertNull(shoppingCart);
				shoppingCart = a4j.modifyCart("1234567890", null, null, null);
				assertNull(shoppingCart);
		}
}

// A4j_16Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#GetItemsFromCart(String, String)} method.
*/
class A4j_16Test {
		
		/**
		* Test case for {@link A4j#GetItemsFromCart(String, String)}.
		* It tests the method for the following values of parameter <code>cartId</code>:
		* <ul>
		*  <li><code>null</code></li>
		*  <li>empty string</li>
		*  <li>string with length greater than 10</li>
		*  <li>string with length less than 10</li>
		*  <li>string with length equal to 10</li>
		* </ul>
		*/
		@Test