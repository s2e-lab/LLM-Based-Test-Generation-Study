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

		@Test
		void testGetItemsFromCart_1() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "");
				assertEquals(shoppingCart.getCartId(), "");
				assertEquals(shoppingCart.getHmac(), "");
				assertEquals(shoppingCart.getPurchaseUrl(), "");
				assertEquals(shoppingCart.getSubTotal(), "");
				assertEquals(shoppingCart.getCartItems().size(), 0);
		}
		
		@Test
		void testGetItemsFromCart_2() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("", "1");
				assertEquals(shoppingCart.getCartId(), "");
				assertEquals(shoppingCart.getHmac(), "");
				assertEquals(shoppingCart.getPurchaseUrl(), "");
				assertEquals(shoppingCart.getSubTotal(), "");
				assertEquals(shoppingCart.getCartItems().size(), 0);
		}
		
		@Test
		void testGetItemsFromCart_3() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("1", "");
				assertEquals(shoppingCart.getCartId(), "");
				assertEquals(shoppingCart.getHmac(), "");
				assertEquals(shoppingCart.getPurchaseUrl(), "");
				assertEquals(shoppingCart.getSubTotal(), "");
				assertEquals(shoppingCart.getCartItems().size(), 0);
		}
		
		@Test
		void testGetItemsFromCart_4() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("1", "1");
				assertEquals(shoppingCart.getCartId(), "");
				assertEquals(shoppingCart.getHmac(), "");
				assertEquals(shoppingCart.getPurchaseUrl(), "");
				assertEquals(shoppingCart.getSubTotal(), "");
				assertEquals(shoppingCart.getCartItems().size(), 0);
		}
		
		@Test
		void testGetItemsFromCart_5() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("1", "1");
				assertEquals(shoppingCart.getCartId(), "");
				assertEquals(shoppingCart.getHmac(), "");
				assertEquals(shoppingCart.getPurchaseUrl(), "");
				assertEquals(shoppingCart.getSubTotal(), "");
				assertEquals(shoppingCart.getCartItems().size(), 0);
		}
		
		@Test
		void testGetItemsFromCart_6() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("1", "1");
				assertEquals(shoppingCart.getCartId(), "");
				assertEquals(shoppingCart.getHmac(), "");
				assertEquals(shoppingCart.getPurchaseUrl(), "");
				assertEquals(shoppingCart.getSubTotal(), "");
				assertEquals(shoppingCart.getCartItems().size(), 0);
		}
		
		@Test
		void testGetItemsFromCart_7() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("1", "1");
				assertEquals(shoppingCart.getCartId(), "");
				assertEquals(shoppingCart.getHmac(), "");
				assertEquals(shoppingCart.getPurchaseUrl(), "");
				assertEquals(shoppingCart.getSubTotal(), "");
				assertEquals(shoppingCart.getCartItems().size(), 0);
		}
		
		@Test
		void testGetItemsFromCart_8() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("1", "1");
				assertEquals(shoppingCart.getCartId(), "");
				assertEquals(shoppingCart.getHmac(), "");
				assertEquals(shoppingCart.getPurchaseUrl(), "");
				assertEquals(shoppingCart.getSubTotal(), "");
				assertEquals(shoppingCart.getCartItems().size(), 0);
		}
		
		@Test
		void testGetItemsFromCart_9() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("1", "1");
				assertEquals(shoppingCart.getCartId(), "");
				assertEquals(shoppingCart.getHmac(), "");
				assertEquals(shoppingCart.getPurchaseUrl(), "");
				assertEquals(shoppingCart.getSubTotal(), "");
				assertEquals(shoppingCart.getCartItems().size(), 0);
		}
		
		@Test
		void testGetItemsFromCart_10() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.GetItemsFromCart("1", "1");
				assertEquals(shoppingCart.getCartId(), "");
				assertEquals(shoppingCart.getHmac(), "");
				assertEquals(shoppingCart.getPurchaseUrl(), "");
				assertEquals(shoppingCart.getSubTotal(), "");
				assertEquals(shoppingCart.getCartItems().size(), 0);
		}
}

// A4j_17Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#RemoveFromCart(String, String, String)} method.
*/
class A4j_17Test {
		
		@Test
		void testRemoveFromCart_1() {
				A4j a4j = new A4j();
				ShoppingCart shoppingCart = a4j.RemoveFromCart("", "", "");
				assertEquals(shoppingCart.getCartId(), "");
				assertEquals(shoppingCart.getHmac(), "");
				assertEquals(shoppingCart.getPurchaseUrl(), "");
				assertEquals(shoppingCart.getSubTotal(), "");
				assertEquals(shoppingCart.getCartItems().size(), 0);
		}
		
		@Test
		void testRemoveFromCart_2() {
