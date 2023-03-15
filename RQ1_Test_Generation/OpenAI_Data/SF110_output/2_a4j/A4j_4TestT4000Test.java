// A4j_4Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4j_4Test {

		@Test
		void testArtistSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
				assertNotNull(productInfo);
				assertEquals(productInfo.getTotalResults(), "1");
				assertEquals(productInfo.getTotalPages(), "1");
				assertEquals(productInfo.getMode(), "music");
				assertEquals(productInfo.getTag(), "webservices-20");
				assertEquals(productInfo.getType(), "lite");
				assertEquals(productInfo.getDevtag(), "A4J4TEST");
				assertEquals(productInfo.getItem().get(0).getAsin(), "B000002MNZ");
				assertEquals(productInfo.getItem().get(0).getProductName(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getCatalog(), "Music");
				assertEquals(productInfo.getItem().get(0).getArtist(), "The Beatles");
				assertEquals(productInfo.getItem().get(0).getReleaseDate(), "1993-03-22");
				assertEquals(productInfo.getItem().get(0).getListPrice().getAmount(), "13.98");
				assertEquals(productInfo.getItem().get(0).getListPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getListPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getItem().get(0).getOurPrice().getAmount(), "13.98");
				assertEquals(productInfo.getItem().get(0).getOurPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getOurPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getItem().get(0).getUsedPrice().getAmount(), "5.99");
				assertEquals(productInfo.getItem().get(0).getUsedPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getUsedPrice().getFormattedPrice(), "$5.99");
				assertEquals(productInfo.getItem().get(0).getCollectiblePrice().getAmount(), "5.99");
				assertEquals(productInfo.getItem().get(0).getCollectiblePrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getCollectiblePrice().getFormattedPrice(), "$5.99");
				assertEquals(productInfo.getItem().get(0).getRefurbishedPrice().getAmount(), "5.99");
				assertEquals(productInfo.getItem().get(0).getRefurbishedPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getRefurbishedPrice().getFormattedPrice(), "$5.99");
				assertEquals(productInfo.getItem().get(0).getThirdPartyNewPrice().getAmount(), "13.98");
				assertEquals(productInfo.getItem().get(0).getThirdPartyNewPrice().getCurrencyCode(), "USD");
				assertEquals(productInfo.getItem().get(0).getThirdPartyNewPrice().getFormattedPrice(), "$13.98");
				assertEquals(productInfo.getItem().get(0).getImageUrlSmall(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.THUMBZZZ.jpg");
				assertEquals(productInfo.getItem().get(0).getImageUrlMedium(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.MZZZZZZZ.jpg");
				assertEquals(productInfo.getItem().get(0).getImageUrlLarge(), "http://ec1.images-amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
				assertEquals(productInfo.getItem().get(0).getCustomerId(), "A2OFEB6YLE4L1K");
				assertEquals(productInfo.getItem().get(0).getAvailability(), "Usually ships in 24 hours");
				assertEquals(productInfo.getItem().get(0).getAvailabilityAttributes().getAvailabilityType(), "now");
				assertEquals(productInfo.getItem().get(0).getAvailabilityAttributes().getMinimumHours(), "0");
				assertEquals(productInfo.getItem().get(0).getAvailabilityAttributes().getMaximumHours(), "0");
				assertEquals(productInfo.getItem().get(0).getIsEligibleForSuperSaverShipping(), "1");
				assertEquals(productInfo.getItem().get(0).getIsEligibleForPrime(), "1");
				assertEquals(productInfo.getItem().get(0).getIsRedirectASIN(), "0");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getAsin(), "B000002MNZ");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(0).getTitle(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(1).getAsin(), "B000002MNZ");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(1).getTitle(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(2).getAsin(), "B000002MNZ");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(2).getTitle(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(3).getAsin(), "B000002MNZ");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(3).getTitle(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(4).getAsin(), "B000002MNZ");
				assertEquals(productInfo.getItem().get(0).getSimilarProduct().get(4).getTitle(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(0).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(0).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(1).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(1).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(2).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(2).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(3).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(3).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(4).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(4).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(5).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(5).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(6).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(6).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(7).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(7).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(8).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(8).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(9).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(9).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(10).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(10).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(11).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(11).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(12).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(12).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(13).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(13).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(14).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(14).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(15).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(15).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(16).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(16).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(17).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(17).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(18).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(18).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(19).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(19).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(20).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(20).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(21).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(21).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(22).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(22).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(23).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(23).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(24).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(24).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(25).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(25).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(26).getSource(), "Product Description");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get(26).getContent(), "The Beatles 1962-1966 (The Red Album) (Remastered)");
				assertEquals(productInfo.getItem().get(0).getEditorialReview().get