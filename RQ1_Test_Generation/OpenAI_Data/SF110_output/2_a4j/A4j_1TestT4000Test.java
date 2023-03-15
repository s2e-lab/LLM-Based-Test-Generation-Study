// A4j_1Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#BlendedSearch(String, String)} method.
*/
class A4j_1Test {

		/**
		* Test case for the {@link A4j#BlendedSearch(String, String)} method.
		*/
		@Test
		void testBlendedSearch() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "lite");
				assertNotNull(blendedSearch);
				assertNotNull(blendedSearch.getRequest());
				assertNotNull(blendedSearch.getRequest().getIsValid());
				assertTrue(blendedSearch.getRequest().getIsValid());
				assertNotNull(blendedSearch.getRequest().getKeywords());
				assertEquals("java", blendedSearch.getRequest().getKeywords());
				assertNotNull(blendedSearch.getRequest().getPage());
				assertEquals("1", blendedSearch.getRequest().getPage());
				assertNotNull(blendedSearch.getRequest().getMode());
				assertEquals("blended", blendedSearch.getRequest().getMode());
				assertNotNull(blendedSearch.getRequest().getTag());
				assertEquals("webservices-20", blendedSearch.getRequest().getTag());
				assertNotNull(blendedSearch.getRequest().getType());
				assertEquals("lite", blendedSearch.getRequest().getType());
				assertNotNull(blendedSearch.getRequest().getDevtag());
				assertEquals("A4J0R2W15KXBZ", blendedSearch.getRequest().getDevtag());
				assertNotNull(blendedSearch.getRequest().getVersion());
				assertEquals("1.0", blendedSearch.getRequest().getVersion());
				assertNotNull(blendedSearch.getTotalResults());
				assertEquals("1", blendedSearch.getTotalResults());
				assertNotNull(blendedSearch.getTotalPages());
				assertEquals("1", blendedSearch.getTotalPages());
				assertNotNull(blendedSearch.getDetails());
				assertNotNull(blendedSearch.getDetails().getProductName());
				assertEquals("Java", blendedSearch.getDetails().getProductName());
				assertNotNull(blendedSearch.getDetails().getCatalog());
				assertEquals("Books", blendedSearch.getDetails().getCatalog());
				assertNotNull(blendedSearch.getDetails().getAuthors());
				assertEquals("James Gosling", blendedSearch.getDetails().getAuthors());
				assertNotNull(blendedSearch.getDetails().getManufacturer());
				assertEquals("Prentice Hall", blendedSearch.getDetails().getManufacturer());
				assertNotNull(blendedSearch.getDetails().getProductGroup());
				assertEquals("Book", blendedSearch.getDetails().getProductGroup());
				assertNotNull(blendedSearch.getDetails().getListPrice());
				assertEquals("$49.99", blendedSearch.getDetails().getListPrice());
				assertNotNull(blendedSearch.getDetails().getOurPrice());
				assertEquals("$33.99", blendedSearch.getDetails().getOurPrice());
				assertNotNull(blendedSearch.getDetails().getUsedPrice());
				assertEquals("$1.99", blendedSearch.getDetails().getUsedPrice());
				assertNotNull(blendedSearch.getDetails().getCollectiblePrice());
				assertEquals("$3.99", blendedSearch.getDetails().getCollectiblePrice());
				assertNotNull(blendedSearch.getDetails().getRefurbishedPrice());
				assertEquals("$2.99", blendedSearch.getDetails().getRefurbishedPrice());
				assertNotNull(blendedSearch.getDetails().getThirdPartyNewPrice());
				assertEquals("$4.99", blendedSearch.getDetails().getThirdPartyNewPrice());
				assertNotNull(blendedSearch.getDetails().getImageUrlSmall());
				assertEquals("http://images.amazon.com/images/P/0130895725.01.THUMBZZZ.jpg", blendedSearch.getDetails().getImageUrlSmall());
				assertNotNull(blendedSearch.getDetails().getImageUrlMedium());
				assertEquals("http://images.amazon.com/images/P/0130895725.01.MZZZZZZZ.jpg", blendedSearch.getDetails().getImageUrlMedium());
				assertNotNull(blendedSearch.getDetails().getImageUrlLarge());
				assertEquals("http://images.amazon.com/images/P/0130895725.01.LZZZZZZZ.jpg", blendedSearch.getDetails().getImageUrlLarge());
				assertNotNull(blendedSearch.getDetails().getAddToCartUrl());
				assertEquals("http://www.amazon.com/exec/obidos/ASIN/0130895725/webservices-20/", blendedSearch.getDetails().getAddToCartUrl());
				assertNotNull(blendedSearch.getDetails().getSimilarProductsUrl());
				assertEquals("http://www.amazon.com/exec/obidos/tg/sim-explorer/explore-items/-/0130895725/", blendedSearch.getDetails().getSimilarProductsUrl());
				assertNotNull(blendedSearch.getDetails().getCustomerReviewsUrl());
				assertEquals("http://www.amazon.com/review/product/0130895725", blendedSearch.getDetails().getCustomerReviewsUrl());
				assertNotNull(blendedSearch.getDetails().getEditorialReviewsUrl());
				assertEquals("http://www.amazon.com/exec/obidos/tg/browse/-/0130895725/", blendedSearch.getDetails().getEditorialReviewsUrl());
				assertNotNull(blendedSearch.getDetails().getAsin());
				assertEquals("0130895725", blendedSearch.getDetails().getAsin());
				assertNotNull(blendedSearch.getDetails().getUrl());
				assertEquals("http://www.amazon.com/exec/obidos/ASIN/0130895725/webservices-20/", blendedSearch.getDetails().getUrl());
				assertNotNull(blendedSearch.getDetails().getSalesRank());
				assertEquals("1", blendedSearch.getDetails().getSalesRank());
				assertNotNull(blendedSearch.getDetails().getAvailability());
				assertEquals("Usually ships in 24 hours", blendedSearch.getDetails().getAvailability());
				assertNotNull(blendedSearch.getDetails().getOffers());
				assertNotNull(blendedSearch.getDetails().getOffers().getTotalOffers());
				assertEquals("1", blendedSearch.getDetails().getOffers().getTotalOffers());
				assertNotNull(blendedSearch.getDetails().getOffers().getTotalOfferPages());
				assertEquals("1", blendedSearch.getDetails().getOffers().getTotalOfferPages());
				assertNotNull(blendedSearch.getDetails().getOffers().getMoreOffersUrl());
				assertEquals("http://www.amazon.com/exec/obidos/tg/stores/offering/list/-/0130895725/all/", blendedSearch.getDetails().getOffers().getMoreOffersUrl());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant().getName());
				assertEquals("Amazon.com", blendedSearch.getDetails().getOffers().getOffer().getMerchant().getName());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant().getGlancePage());
				assertEquals("http://www.amazon.com/exec/obidos/tg/stores/seller-info/-/A1PA6795UKMFR9/", blendedSearch.getDetails().getOffers().getOffer().getMerchant().getGlancePage());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant().getReviews());
				assertEquals("http://www.amazon.com/review/product/0130895725", blendedSearch.getDetails().getOffers().getOffer().getMerchant().getReviews());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant().getMerchantId());
				assertEquals("A1PA6795UKMFR9", blendedSearch.getDetails().getOffers().getOffer().getMerchant().getMerchantId());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getCondition());
				assertEquals("new", blendedSearch.getDetails().getOffers().getOffer().getCondition());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getOfferListingId());
				assertEquals("0", blendedSearch.getDetails().getOffers().getOffer().getOfferListingId());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getPrice());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getPrice().getAmount());
				assertEquals("3399", blendedSearch.getDetails().getOffers().getOffer().getPrice().getAmount());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getPrice().getCurrencyCode());
				assertEquals("USD", blendedSearch.getDetails().getOffers().getOffer().getPrice().getCurrencyCode());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getPrice().getFormattedPrice());
				assertEquals("$33.99", blendedSearch.getDetails().getOffers().getOffer().getPrice().getFormattedPrice());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getAvailability());
				assertEquals("Usually ships in 24 hours", blendedSearch.getDetails().getOffers().getOffer().getAvailability());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getAvailabilityAttributes());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getAvailabilityAttributes().getAvailabilityType());
				assertEquals("now", blendedSearch.getDetails().getOffers().getOffer().getAvailabilityAttributes().getAvailabilityType());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getAvailabilityAttributes().getMinimumHours());
				assertEquals("0", blendedSearch.getDetails().getOffers().getOffer().getAvailabilityAttributes().getMinimumHours());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getAvailabilityAttributes().getMaximumHours());
				assertEquals("0", blendedSearch.getDetails().getOffers().getOffer().getAvailabilityAttributes().getMaximumHours());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getIsEligibleForSuperSaverShipping());
				assertEquals("1", blendedSearch.getDetails().getOffers().getOffer().getIsEligibleForSuperSaverShipping());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getIsEligibleForPrime());
				assertEquals("1", blendedSearch.getDetails().getOffers().getOffer().getIsEligibleForPrime());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getIsRedirectOnly());
				assertEquals("0", blendedSearch.getDetails().getOffers().getOffer().getIsRedirectOnly());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getIsBuyboxWinner());
				assertEquals("1", blendedSearch.getDetails().getOffers().getOffer().getIsBuyboxWinner());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getIsFeaturedMerchant());
				assertEquals("1", blendedSearch.getDetails().getOffers().getOffer().getIsFeaturedMerchant());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getSavedPrice());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getSavedPrice().getAmount());
				assertEquals("1600", blendedSearch.getDetails().getOffers().getOffer().getSavedPrice().getAmount());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getSavedPrice().getCurrencyCode());
				assertEquals("USD", blendedSearch.getDetails().getOffers().getOffer().getSavedPrice().getCurrencyCode());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getSavedPrice().getFormattedPrice());
				assertEquals("$16.00", blendedSearch.getDetails().getOffers().getOffer().getSavedPrice().getFormattedPrice());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant().getMerchantId());
				assertEquals("A1PA6795UKMFR9", blendedSearch.getDetails().getOffers().getOffer().getMerchant().getMerchantId());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant().getName());
				assertEquals("Amazon.com", blendedSearch.getDetails().getOffers().getOffer().getMerchant().getName());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant().getGlancePage());
				assertEquals("http://www.amazon.com/exec/obidos/tg/stores/seller-info/-/A1PA6795UKMFR9/", blendedSearch.getDetails().getOffers().getOffer().getMerchant().getGlancePage());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant().getReviews());
				assertEquals("http://www.amazon.com/review/product/0130895725", blendedSearch.getDetails().getOffers().getOffer().getMerchant().getReviews());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant().getAverageFeedbackRating());
				assertEquals("5.0", blendedSearch.getDetails().getOffers().getOffer().getMerchant().getAverageFeedbackRating());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant().getTotalFeedback());
				assertEquals("1", blendedSearch.getDetails().getOffers().getOffer().getMerchant().getTotalFeedback());
				assertNotNull(blendedSearch.getDetails().getOffers().getOffer().getMerchant().getTotalFeedbackPages());
				assertEquals("1", blendedSearch.getDetails().getOffers().getOffer().getMerchant().getTotalFeedbackPages());
				assertNotNull(blended