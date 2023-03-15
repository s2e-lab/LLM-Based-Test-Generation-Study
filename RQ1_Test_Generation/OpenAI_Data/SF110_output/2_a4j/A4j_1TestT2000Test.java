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
				assertEquals("A4J0R2W15K5FZ", blendedSearch.getRequest().getDevtag());
				assertNotNull(blendedSearch.getRequest().getSort());
				assertEquals("+salesrank", blendedSearch.getRequest().getSort());
				assertNotNull(blendedSearch.getTotalResults());
				assertEquals("1", blendedSearch.getTotalResults());
				assertNotNull(blendedSearch.getTotalPages());
				assertEquals("1", blendedSearch.getTotalPages());
				assertNotNull(blendedSearch.getDetails());
				assertNotNull(blendedSearch.getDetails().getProductName());
				assertEquals("Java: A Beginner's Guide, Fifth Edition", blendedSearch.getDetails().getProductName());
				assertNotNull(blendedSearch.getDetails().getCatalog());
				assertEquals("Book", blendedSearch.getDetails().getCatalog());
				assertNotNull(blendedSearch.getDetails().getAuthors());
				assertEquals("Herbert Schildt", blendedSearch.getDetails().getAuthors());
				assertNotNull(blendedSearch.getDetails().getManufacturer());
				assertEquals("McGraw-Hill Osborne Media", blendedSearch.getDetails().getManufacturer());
				assertNotNull(blendedSearch.getDetails().getModel());
				assertEquals("Paperback", blendedSearch.getDetails().getModel());
				assertNotNull(blendedSearch.getDetails().getUrl());
				assertEquals("http://www.amazon.com/exec/obidos/ASIN/0071809252%3FSubscriptionId%3DAKIAJQ26EPMEYISSR4BA%26tag%3Dws%26linkCode%3Dxm2%26camp%3D2025%26creative%3D165953%26creativeASIN%3D0071809252", blendedSearch.getDetails().getUrl());
				assertNotNull(blendedSearch.getDetails().getReleaseDate());
				assertEquals("2014-05-19", blendedSearch.getDetails().getReleaseDate());
				assertNotNull(blendedSearch.getDetails().getImageUrlSmall());
				assertEquals("http://ecx.images-amazon.com/images/I/51ZU%2BCvkTyL._SL75_.jpg", blendedSearch.getDetails().getImageUrlSmall());
				assertNotNull(blendedSearch.getDetails().getImageUrlMedium());
				assertEquals("http://ecx.images-amazon.com/images/I/51ZU%2BCvkTyL._SL160_.jpg", blendedSearch.getDetails().getImageUrlMedium());
				assertNotNull(blendedSearch.getDetails().getImageUrlLarge());
				assertEquals("http://ecx.images-amazon.com/images/I/51ZU%2BCvkTyL.jpg", blendedSearch.getDetails().getImageUrlLarge());
				assertNotNull(blendedSearch.getDetails().getListPrice());
				assertEquals("$39.99", blendedSearch.getDetails().getListPrice());
				assertNotNull(blendedSearch.getDetails().getOurPrice());
				assertEquals("$26.39", blendedSearch.getDetails().getOurPrice());
				assertNotNull(blendedSearch.getDetails().getUsedPrice());
				assertEquals("$18.00", blendedSearch.getDetails().getUsedPrice());
				assertNotNull(blendedSearch.getDetails().getCollectiblePrice());
				assertEquals("$29.99", blendedSearch.getDetails().getCollectiblePrice());
				assertNotNull(blendedSearch.getDetails().getRefurbishedPrice());
				assertEquals("$26.39", blendedSearch.getDetails().getRefurbishedPrice());
				assertNotNull(blendedSearch.getDetails().getThirdPartyNewPrice());
				assertEquals("$26.39", blendedSearch.getDetails().getThirdPartyNewPrice());
				assertNotNull(blendedSearch.getDetails().getThirdPartyUsedPrice());
				assertEquals("$18.00", blendedSearch.getDetails().getThirdPartyUsedPrice());
				assertNotNull(blendedSearch.getDetails().getThirdPartyCollectiblePrice());
				assertEquals("$29.99", blendedSearch.getDetails().getThirdPartyCollectiblePrice());
				assertNotNull(blendedSearch.getDetails().getThirdPartyRefurbishedPrice());
				assertEquals("$26.39", blendedSearch.getDetails().getThirdPartyRefurbishedPrice());
				assertNotNull(blendedSearch.getDetails().getSaveAmount());
				assertEquals("$13.60", blendedSearch.getDetails().getSaveAmount());
				assertNotNull(blendedSearch.getDetails().getPercentageSaved());
				assertEquals("34", blendedSearch.getDetails().getPercentageSaved());
				assertNotNull(blendedSearch.getDetails().getAvailability());
				assertEquals("Usually ships in 24 hours", blendedSearch.getDetails().getAvailability());
				assertNotNull(blendedSearch.getDetails().getAvailabilityType());
				assertEquals("now", blendedSearch.getDetails().getAvailabilityType());
				assertNotNull(blendedSearch.getDetails().getIsEligibleForSuperSaverShipping());
				assertTrue(blendedSearch.getDetails().getIsEligibleForSuperSaverShipping());
				assertNotNull(blendedSearch.getDetails().getIsEligibleForPrime());
				assertTrue(blendedSearch.getDetails().getIsEligibleForPrime());
		}
		
		/**
		* Test case for the {@link A4j#BlendedSearch(String, String)} method.
		*/
		@Test
		void testBlendedSearch2() {
				A4j a4j = new A4j();
				BlendedSearch blendedSearch = a4j.BlendedSearch("java", "heavy");
				assertNotNull(blendedSearch);
				assertNotNull(blendedSearch.getRequest());
				assertNotNull(blendedSearch.getRequest().getIsValid());
				assertTrue(blended