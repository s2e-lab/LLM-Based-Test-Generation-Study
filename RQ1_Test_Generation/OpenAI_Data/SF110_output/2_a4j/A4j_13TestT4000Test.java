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

		private A4j a4j = new A4j();
		
		@Test
		void testAddToExistingCart_1() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getMessage(), "We did not find your Cart Id. Please create a new shopping cart.");
		}
		
		@Test
		void testAddToExistingCart_2() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getCode(), "AWS.MissingParameters");
		}
		
		@Test
		void testAddToExistingCart_3() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getIsValid(), "False");
		}
		
		@Test
		void testAddToExistingCart_4() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getDetail(), "CartId is missing.");
		}
		
		@Test
		void testAddToExistingCart_5() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getType(), "Sender");
		}
		
		@Test
		void testAddToExistingCart_6() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getMessage(), "We did not find your Cart Id. Please create a new shopping cart.");
		}
		
		@Test
		void testAddToExistingCart_7() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getCode(), "AWS.MissingParameters");
		}
		
		@Test
		void testAddToExistingCart_8() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getIsValid(), "False");
		}
		
		@Test
		void testAddToExistingCart_9() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getDetail(), "CartId is missing.");
		}
		
		@Test
		void testAddToExistingCart_10() {
				ShoppingCart shoppingCart = a4j.addToExistingCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getType(), "Sender");
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
		
		private A4j a4j = new A4j();
		
		@Test
		void testClearCart_1() {
				ShoppingCart shoppingCart = a4j.clearCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getMessage(), "We did not find your Cart Id. Please create a new shopping cart.");
		}
		
		@Test
		void testClearCart_2() {
				ShoppingCart shoppingCart = a4j.clearCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getCode(), "AWS.MissingParameters");
		}
		
		@Test
		void testClearCart_3() {
				ShoppingCart shoppingCart = a4j.clearCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getIsValid(), "False");
		}
		
		@Test
		void testClearCart_4() {
				ShoppingCart shoppingCart = a4j.clearCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getDetail(), "CartId is missing.");
		}
		
		@Test
		void testClearCart_5() {
				ShoppingCart shoppingCart = a4j.clearCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getType(), "Sender");
		}
		
		@Test
		void testClearCart_6() {
				ShoppingCart shoppingCart = a4j.clearCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getMessage(), "We did not find your Cart Id. Please create a new shopping cart.");
		}
		
		@Test
		void testClearCart_7() {
				ShoppingCart shoppingCart = a4j.clearCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getCode(), "AWS.MissingParameters");
		}
		
		@Test
		void testClearCart_8() {
				ShoppingCart shoppingCart = a4j.clearCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getIsValid(), "False");
		}
		
		@Test
		void testClearCart_9() {
				ShoppingCart shoppingCart = a4j.clearCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getDetail(), "CartId is missing.");
		}
		
		@Test
		void testClearCart_10() {
				ShoppingCart shoppingCart = a4j.clearCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getType(), "Sender");
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
		
		private A4j a4j = new A4j();
		
		@Test
		void testModifyCart_1() {
				ShoppingCart shoppingCart = a4j.modifyCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getMessage(), "We did not find your Cart Id. Please create a new shopping cart.");
		}
		
		@Test
		void testModifyCart_2() {
				ShoppingCart shoppingCart = a4j.modifyCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getCode(), "AWS.MissingParameters");
		}
		
		@Test
		void testModifyCart_3() {
				ShoppingCart shoppingCart = a4j.modifyCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getIsValid(), "False");
		}
		
		@Test
		void testModifyCart_4() {
				ShoppingCart shoppingCart = a4j.modifyCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getDetail(), "CartId is missing.");
		}
		
		@Test
		void testModifyCart_5() {
				ShoppingCart shoppingCart = a4j.modifyCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getType(), "Sender");
		}
		
		@Test
		void testModifyCart_6() {
				ShoppingCart shoppingCart = a4j.modifyCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getMessage(), "We did not find your Cart Id. Please create a new shopping cart.");
		}
		
		@Test
		void testModifyCart_7() {
				ShoppingCart shoppingCart = a4j.modifyCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getCode(), "AWS.MissingParameters");
		}
		
		@Test
		void testModifyCart_8() {
				ShoppingCart shoppingCart = a4j.modifyCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getIsValid(), "False");
		}
		
		@Test
		void testModifyCart_9() {
				ShoppingCart shoppingCart = a4j.modifyCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getDetail(), "CartId is missing.");
		}
		
		@Test
		void testModifyCart_10() {
				ShoppingCart shoppingCart = a4j.modifyCart("", "", "", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getType(), "Sender");
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
		
		private A4j a4j = new A4j();
		
		@Test
		void testGetItemsFromCart_1() {
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getMessage(), "We did not find your Cart Id. Please create a new shopping cart.");
		}
		
		@Test
		void testGetItemsFromCart_2() {
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getCode(), "AWS.MissingParameters");
		}
		
		@Test
		void testGetItemsFromCart_3() {
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getIsValid(), "False");
		}
		
		@Test
		void testGetItemsFromCart_4() {
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getDetail(), "CartId is missing.");
		}
		
		@Test
		void testGetItemsFromCart_5() {
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getType(), "Sender");
		}
		
		@Test
		void testGetItemsFromCart_6() {
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getMessage(), "We did not find your Cart Id. Please create a new shopping cart.");
		}
		
		@Test
		void testGetItemsFromCart_7() {
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getCode(), "AWS.MissingParameters");
		}
		
		@Test
		void testGetItemsFromCart_8() {
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getIsValid(), "False");
		}
		
		@Test
		void testGetItemsFromCart_9() {
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getDetail(), "CartId is missing.");
		}
		
		@Test
		void testGetItemsFromCart_10() {
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "");
				assertEquals(shoppingCart.getCart().getRequest().getErrors().getError().getType(), "