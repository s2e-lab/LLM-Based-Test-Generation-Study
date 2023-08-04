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
     * Test case number: 1
     * Test case values: "Java", "books", "heavy", "1"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_1() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "heavy", "1");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 2
     * Test case values: "Java", "books", "heavy", "2"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_2() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "heavy", "2");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 3
     * Test case values: "Java", "books", "heavy", "3"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_3() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "heavy", "3");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 4
     * Test case values: "Java", "books", "heavy", "4"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_4() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "heavy", "4");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 5
     * Test case values: "Java", "books", "heavy", "5"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_5() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "heavy", "5");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 6
     * Test case values: "Java", "books", "heavy", "6"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_6() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "heavy", "6");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 7
     * Test case values: "Java", "books", "heavy", "7"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_7() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "heavy", "7");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 8
     * Test case values: "Java", "books", "heavy", "8"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_8() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "heavy", "8");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 9
     * Test case values: "Java", "books", "heavy", "9"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_9() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "heavy", "9");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 10
     * Test case values: "Java", "books", "heavy", "10"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_10() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "heavy", "10");
        assertEquals(expected, actual);
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
     * Test case number: 1
     * Test case values: "Java", "books", "lite", "1"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_1() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "lite", "1");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 2
     * Test case values: "Java", "books", "lite", "2"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_2() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "lite", "2");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 3
     * Test case values: "Java", "books", "lite", "3"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_3() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "lite", "3");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 4
     * Test case values: "Java", "books", "lite", "4"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_4() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "lite", "4");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 5
     * Test case values: "Java", "books", "lite", "5"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_5() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setProduct(new Product());
        expected.setCart(new Cart());
        ProductInfo actual = a4j.KeywordSearch("Java", "books", "lite", "5");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: