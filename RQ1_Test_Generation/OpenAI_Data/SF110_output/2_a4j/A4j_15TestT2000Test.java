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
		private Cart cart = new Cart();
		private Product product = new Product();
		private Search search = new Search();
		
		@Test
		void testModifyCart_1() {
				ShoppingCart shoppingCart = cart.AddtoCart("B00004T8WQ", "1");
				assertNotNull(shoppingCart);
				assertNotNull(shoppingCart.getCartId());
				assertNotNull(shoppingCart.getHmac());
				assertNotNull(shoppingCart.getPurchaseUrl());
				assertNotNull(shoppingCart.getSubTotal());
				assertNotNull(shoppingCart.getCartItems());
				assertNotNull(shoppingCart.getCartItems().getCartItem());
				assertEquals(1, shoppingCart.getCartItems().getCartItem().size());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getAsin());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getCartItemId());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getQuantity());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getTitle());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductGroup());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getListPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getListPrice().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getListPrice().getCurrencyCode());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getListPrice().getFormattedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getPrice().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getPrice().getCurrencyCode());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getPrice().getFormattedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getItemTotal());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getItemTotal().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getItemTotal().getCurrencyCode());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getItemTotal().getFormattedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getCartItemId());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getAsin());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getTitle());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getProductGroup());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getQuantity());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getListPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getListPrice().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getListPrice().getCurrencyCode());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getListPrice().getFormattedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getPrice().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getPrice().getCurrencyCode());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getPrice().getFormattedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getItemTotal());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getItemTotal().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getItemTotal().getCurrencyCode());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getItemTotal().getFormattedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem().getCartItemId());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem().getAsin());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem().getTitle());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem().getProductGroup());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem().getQuantity());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem().getListPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem().getListPrice().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem().getListPrice().getCurrencyCode());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem().getListPrice().getFormattedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem().getPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().getSavedForLaterItem().getPrice().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSavedForLaterItem().get