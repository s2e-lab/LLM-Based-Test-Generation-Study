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
		* Test case for the {@link A4j#ThirdParty(String, String, String, String)} method.
		*/
		@Test
		void testThirdParty_1() {
				A4j a4j = new A4j();
				SellerSearch sellerSearch = a4j.ThirdParty("A2OFEB6YLE4L1K", "lite", "1", "open");
				assertNotNull(sellerSearch);
				assertEquals("A2OFEB6YLE4L1K", sellerSearch.getSellerId());
				assertEquals("lite", sellerSearch.getType());
				assertEquals("1", sellerSearch.getPage());
				assertEquals("open", sellerSearch.getStatus());
				assertEquals("1", sellerSearch.getTotalPages());
				assertEquals("1", sellerSearch.getTotalResults());
				assertEquals("1", sellerSearch.getResultsPerPage());
				assertEquals("1", sellerSearch.getCurrentPage());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getProductId());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerId());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerName());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerPrice());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerPriceCurrency());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerPriceAmount());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerPriceFractional());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerCondition());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerSubCondition());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerNotes());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerQuantity());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerState());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerSubState());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerListingId());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsFromCountry());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsFromState());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsFromZip());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToCountry());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToState());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToZip());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToCountryExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToStateExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToZipExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToCountryExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToStateExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToZipExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToCountryExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToStateExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToZipExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToCountryExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToStateExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToZipExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToCountryExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToStateExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToZipExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToCountryExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToStateExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToZipExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToCountryExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToStateExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToZipExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToCountryExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToStateExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToZipExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToCountryExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToStateExclusion());
				assertEquals("1", sellerSearch.getSellerProducts().getSellerProduct().get(0).getSellerShipsToZipExclusion());
				assertEquals("1", seller