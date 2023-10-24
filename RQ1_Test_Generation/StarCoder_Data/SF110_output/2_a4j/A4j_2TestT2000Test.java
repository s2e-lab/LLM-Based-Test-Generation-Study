// A4j_2Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#KeywordSearch(String, String, String, String)} method.
*/
class A4j_2Test {

    /**
     * Test of KeywordSearch method, of class A4j.
     * @since 1.0
     */
    @Test
    void testKeywordSearch() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "dvd";
        String type = "heavy";
        String page = "1";
        A4j a4j = new A4j();
        ProductInfo result = a4j.KeywordSearch(searchTerm, productLine, type, page);
        assertNotNull(result);
        assertEquals(result.getProduct().size(), 10);
        assertEquals(result.getProduct().get(0).getASIN(), "0470059216");
        assertEquals(result.getProduct().get(0).getProductGroup(), "Book");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     * @since 1.0
     */
    @Test
    void testKeywordSearch2() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "dvd";
        String type = "lite";
        String page = "1";
        A4j a4j = new A4j();
        ProductInfo result = a4j.KeywordSearch(searchTerm, productLine, type, page);
        assertNotNull(result);
        assertEquals(result.getProduct().size(), 10);
        assertEquals(result.getProduct().get(0).getASIN(), "0470059216");
        assertEquals(result.getProduct().get(0).getProductGroup(), "Book");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     * @since 1.0
     */
    @Test
    void testKeywordSearch3() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "dvd";
        String type = "lite";
        String page = "2";
        A4j a4j = new A4j();
        ProductInfo result = a4j.KeywordSearch(searchTerm, productLine, type, page);
        assertNotNull(result);
        assertEquals(result.getProduct().size(), 10);
        assertEquals(result.getProduct().get(0).getASIN(), "0470059216");
        assertEquals(result.getProduct().get(0).getProductGroup(), "Book");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     * @since 1.0
     */
    @Test
    void testKeywordSearch4() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "dvd";
        String type = "lite";
        String page = "3";
        A4j a4j = new A4j();
        ProductInfo result = a4j.KeywordSearch(searchTerm, productLine, type, page);
        assertNotNull(result);
        assertEquals(result.getProduct().size(), 10);
        assertEquals(result.getProduct().get(0).getASIN(), "0470059216");
        assertEquals(result.getProduct().get(0).getProductGroup(), "Book");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     * @since 1.0
     */
    @Test
    void testKeywordSearch5() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "dvd";
        String type = "lite";
        String page = "4";
        A4j a4j = new A4j();
        ProductInfo result = a4j.KeywordSearch(searchTerm, productLine, type, page);
        assertNotNull(result);
        assertEquals(result.getProduct().size(), 10);
        assertEquals(result.getProduct().get(0).getASIN(), "0470059216");
        assertEquals(result.getProduct().get(0).getProductGroup(), "Book");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
        assertEquals(result.getProduct().get(0).getProductTypeName(), "Hardcover");
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     * @since 1.0
     */
    @Test
    void testKeywordSearch6() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "dvd";
        String type = "lite";
        String page = "5";
        A4j a4j = new A4j();
        ProductInfo result = a4j.KeywordSearch