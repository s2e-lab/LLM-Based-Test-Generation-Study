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
        ProductInfo result = a4j.KeywordSearch("Java", "books", "heavy", "1");
        assertEquals(new ProductInfo(new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424")))), result);
    }

    /**
     * Test case number: 2
     * Test case values: "Java", "books", "heavy", "2"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_2() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.KeywordSearch("Java", "books", "heavy", "2");
        assertEquals(new ProductInfo(new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424")))), result);
    }

    /**
     * Test case number: 3
     * Test case values: "Java", "books", "heavy", "3"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_3() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.KeywordSearch("Java", "books", "heavy", "3");
        assertEquals(new ProductInfo(new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424")))), result);
    }

    /**
     * Test case number: 4
     * Test case values: "Java", "books", "heavy", "4"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_4() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.KeywordSearch("Java", "books", "heavy", "4");
        assertEquals(new ProductInfo(new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424")))), result);
    }

    /**
     * Test case number: 5
     * Test case values: "Java", "books", "heavy", "5"
     * Expected result: ProductInfo
     */
    @Test
    void testKeywordSearch_5() {
        A4j a4j = new A4j();
        ProductInfo result = a4j.KeywordSearch("Java", "books", "heavy", "5");
        assertEquals(new ProductInfo(new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("0071809424"))), new Product(new Search("Java", "books", "heavy"), new Cart(new Product("