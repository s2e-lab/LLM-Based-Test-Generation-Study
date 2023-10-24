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
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4j_3Test {

    /**
     * Test of {@link A4j#ArtistSearch(String, String, String)}
     * with a valid artist name.
     */
    @Test
    void testArtistSearch() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ArtistSearch("The Beatles", "music", "1");
        assertNotNull(productInfo);
        assertEquals(1, productInfo.getProducts().size());
        Product product = productInfo.getProducts().get(0);
        assertEquals("The Beatles", product.getArtist());
        assertEquals("The Beatles", product.getArtistName());
        assertEquals("The Beatles", product.getAuthor());
        assertEquals("The Beatles", product.getAuthorName());
        assertEquals("The Beatles", product.getManufacturer());
        assertEquals("The Beatles", product.getManufacturerName());
        assertEquals("The Beatles", product.getDirector());
        assertEquals("The Beatles", product.getDirectorName());
        assertEquals("The Beatles", product.getActor());
        assertEquals("The Beatles", product.getActorName());
        assertEquals("The Beatles", product.getGenre());
        assertEquals("The Beatles", product.getGenreName());
        assertEquals("The Beatles", product.getUPC());
        assertEquals("The Beatles", product.getEAN());
        assertEquals("The Beatles", product.getISBN());
        assertEquals("The Beatles", product.getProductLine());
        assertEquals("The Beatles", product.getProductLineName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The Beatles", product.getProductTypeName());
        assertEquals("The