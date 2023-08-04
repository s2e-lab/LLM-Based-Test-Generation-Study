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
    * Test case values: "laptop", "Laptops", "Laptop", "1"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_1() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "1");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 2
    * Test case values: "laptop", "Laptops", "Laptop", "2"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_2() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "2");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 3
    * Test case values: "laptop", "Laptops", "Laptop", "3"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_3() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "3");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 4
    * Test case values: "laptop", "Laptops", "Laptop", "4"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_4() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "4");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 5
    * Test case values: "laptop", "Laptops", "Laptop", "5"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_5() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "5");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 6
    * Test case values: "laptop", "Laptops", "Laptop", "6"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_6() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "6");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 7
    * Test case values: "laptop", "Laptops", "Laptop", "7"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_7() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "7");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 8
    * Test case values: "laptop", "Laptops", "Laptop", "8"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_8() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "8");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 9
    * Test case values: "laptop", "Laptops", "Laptop", "9"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_9() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "9");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 10
    * Test case values: "laptop", "Laptops", "Laptop", "10"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_10() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "10");
        assertEquals("Laptop", productInfo.getProduct().getName());
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
    * Test case values: "laptop", "Laptops", "Laptop", "1"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_1() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "1");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 2
    * Test case values: "laptop", "Laptops", "Laptop", "2"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_2() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "2");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 3
    * Test case values: "laptop", "Laptops", "Laptop", "3"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_3() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "3");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 4
    * Test case values: "laptop", "Laptops", "Laptop", "4"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_4() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "4");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 5
    * Test case values: "laptop", "Laptops", "Laptop", "5"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_5() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "5");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 6
    * Test case values: "laptop", "Laptops", "Laptop", "6"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_6() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "6");
        assertEquals("Laptop", productInfo.getProduct().getName());
    }

    /**
    * Test case number: 7
    * Test case values: "laptop", "Laptops", "Laptop", "7"
    * Expected result: "Laptop"
    */
    @Test
    void testKeywordSearch_7() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.KeywordSearch("laptop", "Laptops", "Laptop", "7");
        assertEquals("