// A4j_3Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4j_3Test {

		@Test
		void testActorSearch() {
				A4j a4j = new A4j();
				ProductInfo productInfo = a4j.ActorSearch("Tom Hanks", "dvd", "1");
				assertNotNull(productInfo);
				assertEquals(productInfo.getTotalResults(), "1");
				assertEquals(productInfo.getTotalPages(), "1");
				assertEquals(productInfo.getMode(), "dvd");
				assertEquals(productInfo.getTag(), "webservices-20");
				assertEquals(productInfo.getType(), "lite");
				assertEquals(productInfo.getDevtag(), "A4J9BJ3T9CMF5A");
				assertEquals(productInfo.getItem().get(0).getAsin(), "B00005JLZ1");
				assertEquals(productInfo.getItem().get(0).getProductName(), "The Green Mile");
				assertEquals(productInfo.getItem().get(0).getCatalog(), "DVD");
				assertEquals(productInfo.getItem().get(0).getReleaseDate(), "1999-11-23");
				assertEquals(productInfo.getItem().get(0).getTheatricalReleaseDate(), "1999-12-10");
				assertEquals(productInfo.getItem().get(0).getRating(), "R");
				assertEquals(productInfo.getItem().get(0).getRunningTime(), "189");
				assertEquals(productInfo.getItem().get(0).getAspectRatio(), "2.35:1");
				assertEquals(productInfo.getItem().get(0).getNumberOfDiscs(), "1");
				assertEquals(productInfo.getItem().get(0).getFormat(), "AC-3, Closed-captioned, Color, Dolby, Dubbed, DVD, Subtitled, Widescreen, NTSC");
				assertEquals(productInfo.getItem().get(0).getUrl(), "http://www.amazon.com/exec/obidos/ASIN/B00005JLZ1/webservices-20");
				assertEquals(productInfo.getItem().get(0).getActor().get(0).getName(), "Tom Hanks");
				assertEquals(productInfo.getItem().get(0).getActor().get(0).getRole(), "Paul Edgecomb");
				assertEquals(productInfo.getItem().get(0).getActor().get(1).getName(), "David Morse");
				assertEquals(productInfo.getItem().get(0).getActor().get(1).getRole(), "Brutus Howell");
				assertEquals(productInfo.getItem().get(0).getActor().get(2).getName(), "Bonnie Hunt");
				assertEquals(productInfo.getItem().get(0).getActor().get(2).getRole(), "Jan Edgecomb");
				assertEquals(productInfo.getItem().get(0).getActor().get(3).getName(), "Michael Clarke Duncan");
				assertEquals(productInfo.getItem().get(0).getActor().get(3).getRole(), "John Coffey");
				assertEquals(productInfo.getItem().get(0).getActor().get(4).getName(), "James Cromwell");
				assertEquals(productInfo.getItem().get(0).getActor().get(4).getRole(), "Warden Hal Moores");
				assertEquals(productInfo.getItem().get(0).getActor().get(5).getName(), "Michael Jeter");
				assertEquals(productInfo.getItem().get(0).getActor().get(5).getRole(), "Eduard Delacroix");
				assertEquals(productInfo.getItem().get(0).getActor().get(6).getName(), "Graham Greene");
				assertEquals(productInfo.getItem().get(0).getActor().get(6).getRole(), "Arlen Bitterbuck");
				assertEquals(productInfo.getItem().get(0).getActor().get(7).getName(), "Doug Hutchison");
				assertEquals(productInfo.getItem().get(0).getActor().get(7).getRole(), "Percy Wetmore");
				assertEquals(productInfo.getItem().get(0).getActor().get(8).getName(), "Sam Rockwell");
				assertEquals(productInfo.getItem().get(0).getActor().get(8).getRole(), "Wild Bill Wharton");
				assertEquals(productInfo.getItem().get(0).getActor().get(9).getName(), "Barry Pepper");
				assertEquals(productInfo.getItem().get(0).getActor().get(9).getRole(), "Dean Stanton");
				assertEquals(productInfo.getItem().get(0).getActor().get(10).getName(), "Jeffrey DeMunn");
				assertEquals(productInfo.getItem().get(0).getActor().get(10).getRole(), "Harry Terwilliger");
				assertEquals(productInfo.getItem().get(0).getActor().get(11).getName(), "Patricia Clarkson");
				assertEquals(productInfo.getItem().get(0).getActor().get(11).getRole(), "Melinda Moores");
				assertEquals(productInfo.getItem().get(0).getActor().get(12).getName(), "Harry Dean Stanton");
				assertEquals(productInfo.getItem().get(0).getActor().get(12).getRole(), "Toot-Toot");
				assertEquals(productInfo.getItem().get(0).getActor().get(13).getName(), "Dabbs Greer");
				assertEquals(productInfo.getItem().get(0).getActor().get(13).getRole(), "Old Paul Edgecomb");
				assertEquals(productInfo.getItem().get(0).getActor().get(14).getName(), "Eve Brent");
				assertEquals(productInfo.getItem().get(0).getActor().get(14).getRole(), "Elaine Connelly");
				assertEquals(productInfo.getItem().get(0).getActor().get(15).getName(), "Bill McKinney");
				assertEquals(productInfo.getItem().get(0).getActor().get(15).getRole(), "Heywood");
				assertEquals(productInfo.getItem().get(0).getActor().get(16).getName(), "William Sadler");
				assertEquals(productInfo.getItem().get(0).getActor().get(16).getRole(), "Willy Soames");
				assertEquals(productInfo.getItem().get(0).getActor().get(17).getName(), "Jossie Thacker");
				assertEquals(productInfo.getItem().get(0).getActor().get(17).getRole(), "Jan Edgecomb");
				assertEquals(productInfo.getItem().get(0).getActor().get(18).getName(), "Brent Briscoe");
				assertEquals(productInfo.getItem().get(0).getActor().get(18).getRole(), "Toot-Toot");
				assertEquals(productInfo.getItem().get(0).getActor().get(19).getName(), "Dale Dye");
				assertEquals(productInfo.getItem().get(0).getActor().get(19).getRole(), "Captain");
				assertEquals(productInfo.getItem().get(0).getActor().get(20).getName(), "Michael Jeter");
				assertEquals(productInfo.getItem().