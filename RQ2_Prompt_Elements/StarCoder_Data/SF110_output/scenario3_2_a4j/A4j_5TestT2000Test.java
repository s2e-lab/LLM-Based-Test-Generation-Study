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
     * Test case values: "B00005N602", "1"
     * Expected result: ShoppingCart
     */
    @Test
    void test1() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart();
        expected.setCart(new Cart());
        expected.getCart().setProduct(new Product());
        expected.getCart().getProduct().setAsin("B00005N602");
        expected.getCart().getProduct().setQuantity("1");
        ShoppingCart actual = a4j.AddtoCart("B00005N602", "1");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 2
     * Test case values: "B00005N602", "10"
     * Expected result: ShoppingCart
     */
    @Test
    void test2() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart();
        expected.setCart(new Cart());
        expected.getCart().setProduct(new Product());
        expected.getCart().getProduct().setAsin("B00005N602");
        expected.getCart().getProduct().setQuantity("10");
        ShoppingCart actual = a4j.AddtoCart("B00005N602", "10");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 3
     * Test case values: "B00005N602", "100"
     * Expected result: ShoppingCart
     */
    @Test
    void test3() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart();
        expected.setCart(new Cart());
        expected.getCart().setProduct(new Product());
        expected.getCart().getProduct().setAsin("B00005N602");
        expected.getCart().getProduct().setQuantity("100");
        ShoppingCart actual = a4j.AddtoCart("B00005N602", "100");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 4
     * Test case values: "B00005N602", "1000"
     * Expected result: ShoppingCart
     */
    @Test
    void test4() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart();
        expected.setCart(new Cart());
        expected.getCart().setProduct(new Product());
        expected.getCart().getProduct().setAsin("B00005N602");
        expected.getCart().getProduct().setQuantity("1000");
        ShoppingCart actual = a4j.AddtoCart("B00005N602", "1000");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 5
     * Test case values: "B00005N602", "10000"
     * Expected result: ShoppingCart
     */
    @Test
    void test5() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart();
        expected.setCart(new Cart());
        expected.getCart().setProduct(new Product());
        expected.getCart().getProduct().setAsin("B00005N602");
        expected.getCart().getProduct().setQuantity("10000");
        ShoppingCart actual = a4j.AddtoCart("B00005N602", "10000");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 6
     * Test case values: "B00005N602", "100000"
     * Expected result: ShoppingCart
     */
    @Test
    void test6() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart();
        expected.setCart(new Cart());
        expected.getCart().setProduct(new Product());
        expected.getCart().getProduct().setAsin("B00005N602");
        expected.getCart().getProduct().setQuantity("100000");
        ShoppingCart actual = a4j.AddtoCart("B00005N602", "100000");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 7
     * Test case values: "B00005N602", "1000000"
     * Expected result: ShoppingCart
     */
    @Test
    void test7() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart();
        expected.setCart(new Cart());
        expected.getCart().setProduct(new Product());
        expected.getCart().getProduct().setAsin("B00005N602");
        expected.getCart().getProduct().setQuantity("1000000");
        ShoppingCart actual = a4j.AddtoCart("B00005N602", "1000000");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 8
     * Test case values: "B00005N602", "10000000"
     * Expected result: ShoppingCart
     */
    @Test
    void test8() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart();
        expected.setCart(new Cart());
        expected.getCart().setProduct(new Product());
        expected.getCart().getProduct().setAsin("B00005N602");
        expected.getCart().getProduct().setQuantity("10000000");
        ShoppingCart actual = a4j.AddtoCart("B00005N602", "10000000");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 9
     * Test case values: "B00005N602", "100000000"
     * Expected result: ShoppingCart
     */
    @Test
    void test9() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart();
        expected.setCart(new Cart());
        expected.getCart().setProduct(new Product());
        expected.getCart().getProduct().setAsin("B00005N602");
        expected.getCart().getProduct().setQuantity("100000000");
        ShoppingCart actual = a4j.AddtoCart("B00005N602", "100000000");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 10
     * Test case values: "B00005N602", "1000000000"
     * Expected result: ShoppingCart
     */
    @Test
    void test10() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart();
        expected.setCart(new Cart());
        expected.getCart().setProduct(new Product());
        expected.getCart().getProduct().setAsin("B00005N602");
        expected.getCart().getProduct().setQuantity("1000000000");
        ShoppingCart actual = a4j.AddtoCart("B00005N602", "1000000000");
        assertEquals(expected, actual);
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
class A