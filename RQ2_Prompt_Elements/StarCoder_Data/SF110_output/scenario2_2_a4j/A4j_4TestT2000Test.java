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
* It contains ten unit test cases for the {@link A4j#AuthorSearch(String, String)} method.
*/
class A4j_4Test {

    /**
     * Test case for {@link A4j#AuthorSearch(String, String)}.
     *
     * @since 1.0
     */
    @Test
    void testAuthorSearch() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch("<NAME>", "1");
        assertEquals(1, productInfo.getProducts().size());
        Product product = productInfo.getProducts().get(0);
        assertEquals("The Hitchhiker's Guide to the Galaxy", product.getTitle());
        assertEquals("1978", product.getYear());
        assertEquals("<NAME>", product.getAuthor());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.getAmazonUrl());
        assertEquals("http://www.amazon.com/exec/obidos/ASIN/0345391802/ref=nosim/kencochrane-20", product.get