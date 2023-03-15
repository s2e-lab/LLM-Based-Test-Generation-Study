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
		private Cart cart = new Cart();
		private Product product = new Product();
		private Search search = new Search();
		
		@Test
		void testClearCart_1() {
				ShoppingCart shoppingCart = cart.AddtoCart("B00004T9VQ", "1");
				assertNotNull(shoppingCart);
				assertNotNull(shoppingCart.getCartId());
				assertNotNull(shoppingCart.getHmac());
				assertNotNull(shoppingCart.getPurchaseUrl());
				assertNotNull(shoppingCart.getSubTotal());
				assertNotNull(shoppingCart.getCartItems());
				assertNotNull(shoppingCart.getCartItems().getCartItem());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0));
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
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSubTotal());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSubTotal().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSubTotal().getCurrencyCode());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getSubTotal().getFormattedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getAuthors());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getAuthors().getAuthor());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getAuthors().getAuthor().get(0));
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getManufacturer());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getProductName());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getReleaseDate());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getSku());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getSmallImage());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getSmallImage().getUrl());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getSmallImage().getHeight());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getSmallImage().getWidth());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getMediumImage());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getMediumImage().getUrl());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getMediumImage().getHeight());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getMediumImage().getWidth());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getLargeImage());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getLargeImage().getUrl());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getLargeImage().getHeight());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getLargeImage().getWidth());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getListPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getListPrice().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getListPrice().getCurrencyCode());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getListPrice().getFormattedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getOurPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getOurPrice().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getOurPrice().getCurrencyCode());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getOurPrice().getFormattedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getUsedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getUsedPrice().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getUsedPrice().getCurrencyCode());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getUsedPrice().getFormattedPrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getCollectiblePrice());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getCollectiblePrice().getAmount());
				assertNotNull(shoppingCart.getCartItems().getCartItem().get(0).getProductInfo().getCollectiblePrice().getCurrency