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
        assertEquals("The Hitchhiker's Guide to the Galaxy", productInfo.getProducts().get(0).getTitle());
        assertEquals("1979", productInfo.getProducts().get(0).getYear());
        assertEquals("1", productInfo.getProducts().get(0).getAuthor());
        assertEquals("1", productInfo.getProducts().get(0).getPublisher());
        assertEquals("1", productInfo.getProducts().get(0).getPrice());
        assertEquals("1", productInfo.getProducts().get(0).getQuantity());
        assertEquals("1", productInfo.getProducts().get(0).getCart());
    }
}

// A4j_5Test.java
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
class A4j_5Test {
		
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
        assertEquals("The Hitchhiker's Guide to the Galaxy", productInfo.getProducts().get(0).getTitle());
        assertEquals("1979", productInfo.getProducts().get(0).getYear());
        assertEquals("1", productInfo.getProducts().get(0).getAuthor());
        assertEquals("1", productInfo.getProducts().get(0).getPublisher());
        assertEquals("1", productInfo.getProducts().get(0).getPrice());
        assertEquals("1", productInfo.getProducts().get(0).getQuantity());
        assertEquals("1", productInfo.getProducts().get(0).getCart());
    }
}

// A4j_6Test.java
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
class A4j_6Test {
		
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
        assertEquals("The Hitchhiker's Guide to the Galaxy", productInfo.getProducts().get(0).getTitle());
        assertEquals("1979", productInfo.getProducts().get(0).getYear());
        assertEquals("1", productInfo.getProducts().get(0).getAuthor());
        assertEquals("1", productInfo.getProducts().get(0).getPublisher());
        assertEquals("1", productInfo.getProducts().get(0).getPrice());
        assertEquals("1", productInfo.getProducts().get(0).getQuantity());
        assertEquals("1", productInfo.getProducts().get(0).getCart());
    }
}

// A4j_7Test.java
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
class A4j_7Test {
		
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
        assertEquals("The Hitchhiker's Guide to the Galaxy", productInfo.getProducts().get(0).getTitle());
        assertEquals("1979", productInfo.getProducts().get(0).getYear());
        assertEquals("1", productInfo.getProducts().get(0).getAuthor());
        assertEquals("1", productInfo.getProducts().get(0).getPublisher());
        assertEquals("1", productInfo.getProducts().get(0).getPrice());
        assertEquals("1", productInfo.getProducts().get(0).getQuantity());
        assertEquals("1", productInfo.getProducts().get(0).getCart());
    }
}

// A4j_8Test.java
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
class A4j_8Test {
		
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
        assertEquals("The Hitchhiker's Guide to the Galaxy", productInfo.getProducts().get(0).getTitle());
        assertEquals("1979", productInfo.getProducts().get(0).getYear());
        assertEquals("1", productInfo.getProducts().get(0).getAuthor());
        assertEquals("1", productInfo.getProducts().get(0).getPublisher());
        assertEquals("1", productInfo.getProducts().get(0).getPrice());
        assertEquals("1", productInfo.getProducts().get(0).getQuantity());
        assertEquals("1", productInfo.getProducts().get(0).getCart());
    }
}

// A4j_9Test.java
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
class A4j_9Test {
		
    /**
     * Test case for {@link A4j#AuthorSearch(String, String)}.
     *
     * @since 1.0