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
* It contains ten unit test cases for the {@link A4j#AddtoCart(String, String)} method.
*/
class A4j_5Test {

    /**
     * Test case number: 1
     * Test case values: "0123456789", "1"
     * Expected result: "0123456789"
     */
    @Test
    void test_1() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "1");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 2
     * Test case values: "0123456789", "2"
     * Expected result: "0123456789"
     */
    @Test
    void test_2() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "2");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 3
     * Test case values: "0123456789", "3"
     * Expected result: "0123456789"
     */
    @Test
    void test_3() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "3");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 4
     * Test case values: "0123456789", "4"
     * Expected result: "0123456789"
     */
    @Test
    void test_4() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "4");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 5
     * Test case values: "0123456789", "5"
     * Expected result: "0123456789"
     */
    @Test
    void test_5() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "5");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 6
     * Test case values: "0123456789", "6"
     * Expected result: "0123456789"
     */
    @Test
    void test_6() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "6");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 7
     * Test case values: "0123456789", "7"
     * Expected result: "0123456789"
     */
    @Test
    void test_7() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "7");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 8
     * Test case values: "0123456789", "8"
     * Expected result: "0123456789"
     */
    @Test
    void test_8() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "8");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 9
     * Test case values: "0123456789", "9"
     * Expected result: "0123456789"
     */
    @Test
    void test_9() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "9");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 10
     * Test case values: "0123456789", "10"
     * Expected result: "0123456789"
     */
    @Test
    void test_10() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "10");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
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
* It contains ten unit test cases for the {@link A4j#AddtoCart(String, String)} method.
*/
class A4j_6Test {
		
    /**
     * Test case number: 1
     * Test case values: "0123456789", "1"
     * Expected result: "0123456789"
     */
    @Test
    void test_1() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "1");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 2
     * Test case values: "0123456789", "2"
     * Expected result: "0123456789"
     */
    @Test
    void test_2() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "2");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 3
     * Test case values: "0123456789", "3"
     * Expected result: "0123456789"
     */
    @Test
    void test_3() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "3");
        assertEquals("0123456789", shoppingCart.getCart().get(0).getASIN());
    }

    /**
     * Test case number: 4
     * Test case values: "0123456789", "4"
     * Expected result: "0123456789"
     */
    @Test
    void test_4() {
        A4j a4j = new A4j();
        ShoppingCart shoppingCart = a4j.AddtoCart("0123456789", "4");
        assertEquals("01234