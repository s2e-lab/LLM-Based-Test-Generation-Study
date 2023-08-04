// A4j_0Test.java
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
class A4j_0Test {

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "heavy";
        A4j instance = new A4j();
        BlendedSearch expResult = new BlendedSearch();
        BlendedSearch result = instance.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch_1() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "lite";
        A4j instance = new A4j();
        BlendedSearch expResult = new BlendedSearch();
        BlendedSearch result = instance.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch_2() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        A4j instance = new A4j();
        BlendedSearch expResult = new BlendedSearch();
        BlendedSearch result = instance.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch_3() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        A4j instance = new A4j();
        BlendedSearch expResult = new BlendedSearch();
        BlendedSearch result = instance.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch_4() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        A4j instance = new A4j();
        BlendedSearch expResult = new BlendedSearch();
        BlendedSearch result = instance.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch_5() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        A4j instance = new A4j();
        BlendedSearch expResult = new BlendedSearch();
        BlendedSearch result = instance.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch_6() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        A4j instance = new A4j();
        BlendedSearch expResult = new BlendedSearch();
        BlendedSearch result = instance.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch_7() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        A4j instance = new A4j();
        BlendedSearch expResult = new BlendedSearch();
        BlendedSearch result = instance.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch_8() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        A4j instance = new A4j();
        BlendedSearch expResult = new BlendedSearch();
        BlendedSearch result = instance.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch_9() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        A4j instance = new A4j();
        BlendedSearch expResult = new BlendedSearch();
        BlendedSearch result = instance.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }

    /**
     * Test of BlendedSearch method, of class A4j.
     */
    @Test
    void testBlendedSearch_10() {
        System.out.println("BlendedSearch");
        String searchTerm = "java";
        String type = "blended";
        A4j instance = new A4j();
        BlendedSearch expResult = new BlendedSearch();
        BlendedSearch result = instance.BlendedSearch(searchTerm, type);
        assertEquals(expResult, result);
    }
}

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
* It contains ten unit test cases for the {@link A4j#KeywordSearch(String, String, String, String)} method.
*/
class A4j_1Test {
		
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
        A4j instance = new A4j();
        ProductInfo expResult = new ProductInfo();
        ProductInfo result = instance.KeywordSearch(searchTerm, productLine, type, page);
        assertEquals(expResult, result);
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     */
    @Test
    void testKeywordSearch_1() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "books";
        String type = "lite";
        String page = "1";
        A4j instance = new A4j();
        ProductInfo expResult = new ProductInfo();
        ProductInfo result = instance.KeywordSearch(searchTerm, productLine, type, page);
        assertEquals(expResult, result);
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     */
    @Test
    void testKeywordSearch_2() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "books";
        String type = "blended";
        String page = "1";
        A4j instance = new A4j();
        ProductInfo expResult = new ProductInfo();
        ProductInfo result = instance.KeywordSearch(searchTerm, productLine, type, page);
        assertEquals(expResult, result);
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     */
    @Test
    void testKeywordSearch_3() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "books";
        String type = "blended";
        String page = "1";
        A4j instance = new A4j();
        ProductInfo expResult = new ProductInfo();
        ProductInfo result = instance.KeywordSearch(searchTerm, productLine, type, page);
        assertEquals(expResult, result);
    }

    /**
     * Test of KeywordSearch method, of class A4j.
     */
    @Test
    void testKeywordSearch_4() {
        System.out.println("KeywordSearch");
        String searchTerm = "java";
        String productLine = "books";
        String type = "blended";
        String page = "1