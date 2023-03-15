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
				assertEquals("1", sellerSearch.getProducts().get(0).getAsin());
				assertEquals("1", sellerSearch.getProducts().get(0).getProductName());
				assertEquals("1", sellerSearch.getProducts().get(0).getCatalog());
				assertEquals("1", sellerSearch.getProducts().get(0).getReleaseDate());
				assertEquals("1", sellerSearch.getProducts().get(0).getManufacturer());
				assertEquals("1", sellerSearch.getProducts().get(0).getImageUrlSmall());
				assertEquals("1", sellerSearch.getProducts().get(0).getImageUrlMedium());
				assertEquals("1", sellerSearch.getProducts().get(0).getImageUrlLarge());
				assertEquals("1", sellerSearch.getProducts().get(0).getListPrice());
				assertEquals("1", sellerSearch.getProducts().get(0).getOurPrice());
				assertEquals("1", sellerSearch.getProducts().get(0).getUsedPrice());
				assertEquals("1", sellerSearch.getProducts().get(0).getCollectiblePrice());
				assertEquals("1", sellerSearch.getProducts().get(0).getRefurbishedPrice());
				assertEquals("1", sellerSearch.getProducts().get(0).getAvailability());
				assertEquals("1", sellerSearch.getProducts().get(0).getAvailabilityType());
				assertEquals("1", sellerSearch.getProducts().get(0).getUsedAvailability());
				assertEquals("1", sellerSearch.getProducts().get(0).getUsedAvailabilityType());
				assertEquals("1", sellerSearch.getProducts().get(0).getCollectibleAvailability());
				assertEquals("1", sellerSearch.getProducts().get(0).getCollectibleAvailabilityType());
				assertEquals("1", sellerSearch.getProducts().get(0).getRefurbishedAvailability());
				assertEquals("1", sellerSearch.getProducts().get(0).getRefurbishedAvailabilityType());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyNewPrice());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyNewShipping());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyNewAvailability());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyNewAvailabilityType());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyUsedPrice());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyUsedShipping());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyUsedAvailability());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyUsedAvailabilityType());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyCollectiblePrice());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyCollectibleShipping());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyCollectibleAvailability());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyCollectibleAvailabilityType());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyRefurbishedPrice());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyRefurbishedShipping());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyRefurbishedAvailability());
				assertEquals("1", sellerSearch.getProducts().get(0).getThirdPartyRefurbishedAvailabilityType());
				assertEquals("1", sellerSearch.getProducts().get(0).getSuperSaverShipping());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantId());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantName());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantInfo());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantSku());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantNote());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingGroup());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShipping());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingType());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingPrice());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingAvailability());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingAvailabilityType());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestriction());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionType());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionReason());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMin());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMax());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrency());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMessage());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinMessage());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxMessage());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyMessage());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueMessage());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMinValueValueValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionMaxValueValueValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionCurrencyValueValueValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals("1", sellerSearch.getProducts().get(0).getMerchantShippingRestrictionValueValueValueValueValueValueValueValueValueValueValueValueValueValueValue());
				assertEquals