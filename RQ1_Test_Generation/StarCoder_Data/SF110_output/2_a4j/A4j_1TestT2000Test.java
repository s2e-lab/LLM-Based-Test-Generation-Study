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
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "heavy";
        BlendedSearch expResult = new BlendedSearch();
        expResult.setBlendedSearch(new BlendedSearchBean());
        BlendedSearch result = A4j.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch2() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "lite";
        BlendedSearch expResult = new BlendedSearch();
        expResult.setBlendedSearch(new BlendedSearchBean());
        BlendedSearch result = A4j.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch3() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        BlendedSearch expResult = new BlendedSearch();
        expResult.setBlendedSearch(new BlendedSearchBean());
        BlendedSearch result = A4j.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch4() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        BlendedSearch expResult = new BlendedSearch();
        expResult.setBlendedSearch(new BlendedSearchBean());
        BlendedSearch result = A4j.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch5() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        BlendedSearch expResult = new BlendedSearch();
        expResult.setBlendedSearch(new BlendedSearchBean());
        BlendedSearch result = A4j.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch6() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        BlendedSearch expResult = new BlendedSearch();
        expResult.setBlendedSearch(new BlendedSearchBean());
        BlendedSearch result = A4j.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch7() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        BlendedSearch expResult = new BlendedSearch();
        expResult.setBlendedSearch(new BlendedSearchBean());
        BlendedSearch result = A4j.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch8() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        BlendedSearch expResult = new BlendedSearch();
        expResult.setBlendedSearch(new BlendedSearchBean());
        BlendedSearch result = A4j.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch9() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        BlendedSearch expResult = new BlendedSearch();
        expResult.setBlendedSearch(new BlendedSearchBean());
        BlendedSearch result = A4j.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch10() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        BlendedSearch expResult = new BlendedSearch();
        expResult.setBlendedSearch(new BlendedSearchBean());
        BlendedSearch result = A4j.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }
}

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
     */
    @Test
    void testKeywordSearch() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "books";
        String type = "heavy";
        String page = "1";
        ProductInfo expResult = new ProductInfo();
        expResult.setProductInfo(new ProductInfoBean());
        ProductInfo result = A4j.KeywordSearch(searchTerm, productLine, type, page);
        assertEquals(expResult, result);
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     */
    @Test
    void testKeywordSearch2() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "books";
        String type = "lite";
        String page = "1";
        ProductInfo expResult = new ProductInfo();
        expResult.setProductInfo(new ProductInfoBean());
        ProductInfo result = A4j.KeywordSearch(searchTerm, productLine, type, page);
        assertEquals(expResult, result);
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     */
    @Test
    void testKeywordSearch3() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "books";
        String type = "blended";
        String page = "1";
        ProductInfo expResult = new ProductInfo();
        expResult.setProductInfo(new ProductInfoBean());
        ProductInfo result = A4j.KeywordSearch(searchTerm, productLine, type, page);
        assertEquals(expResult, result);
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     */
    @Test
    void testKeywordSearch4() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "books";
        String type = "blended";
        String page = "1";
        ProductInfo expResult = new ProductInfo();
        expResult.setProductInfo(new ProductInfoBean());
        ProductInfo result = A4j.KeywordSearch(searchTerm, productLine, type, page);
        assertEquals(expResult, result);
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     */
    @Test
    void testKeywordSearch5() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "books";
        String type = "blended";
        String page = "1";
        ProductInfo expResult = new ProductInfo();
        expResult.setProductInfo(new ProductInfoBean());
        ProductInfo result = A4j.