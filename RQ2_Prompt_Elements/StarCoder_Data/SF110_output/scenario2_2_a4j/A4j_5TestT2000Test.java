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
     * Test case values: "014014221X", "1"
     * Expected result: ShoppingCart[asin=014014221X, quantity=1, price=14.99, total=14.99]
     */
    @Test
    void test_AddtoCart_01() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart("014014221X", "1", "14.99", "14.99");
        ShoppingCart actual = a4j.AddtoCart("014014221X", "1");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 2
     * Test case values: "014014221X", "2"
     * Expected result: ShoppingCart[asin=014014221X, quantity=2, price=14.99, total=29.98]
     */
    @Test
    void test_AddtoCart_02() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart("014014221X", "2", "14.99", "29.98");
        ShoppingCart actual = a4j.AddtoCart("014014221X", "2");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 3
     * Test case values: "014014221X", "3"
     * Expected result: ShoppingCart[asin=014014221X, quantity=3, price=14.99, total=44.97]
     */
    @Test
    void test_AddtoCart_03() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart("014014221X", "3", "14.99", "44.97");
        ShoppingCart actual = a4j.AddtoCart("014014221X", "3");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 4
     * Test case values: "014014221X", "4"
     * Expected result: ShoppingCart[asin=014014221X, quantity=4, price=14.99, total=59.96]
     */
    @Test
    void test_AddtoCart_04() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart("014014221X", "4", "14.99", "59.96");
        ShoppingCart actual = a4j.AddtoCart("014014221X", "4");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 5
     * Test case values: "014014221X", "5"
     * Expected result: ShoppingCart[asin=014014221X, quantity=5, price=14.99, total=74.95]
     */
    @Test
    void test_AddtoCart_05() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart("014014221X", "5", "14.99", "74.95");
        ShoppingCart actual = a4j.AddtoCart("014014221X", "5");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 6
     * Test case values: "014014221X", "6"
     * Expected result: ShoppingCart[asin=014014221X, quantity=6, price=14.99, total=89.94]
     */
    @Test
    void test_AddtoCart_06() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart("014014221X", "6", "14.99", "89.94");
        ShoppingCart actual = a4j.AddtoCart("014014221X", "6");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 7
     * Test case values: "014014221X", "7"
     * Expected result: ShoppingCart[asin=014014221X, quantity=7, price=14.99, total=104.93]
     */
    @Test
    void test_AddtoCart_07() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart("014014221X", "7", "14.99", "104.93");
        ShoppingCart actual = a4j.AddtoCart("014014221X", "7");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 8
     * Test case values: "014014221X", "8"
     * Expected result: ShoppingCart[asin=014014221X, quantity=8, price=14.99, total=119.92]
     */
    @Test
    void test_AddtoCart_08() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart("014014221X", "8", "14.99", "119.92");
        ShoppingCart actual = a4j.AddtoCart("014014221X", "8");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 9
     * Test case values: "014014221X", "9"
     * Expected result: ShoppingCart[asin=014014221X, quantity=9, price=14.99, total=134.91]
     */
    @Test
    void test_AddtoCart_09() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart("014014221X", "9", "14.99", "134.91");
        ShoppingCart actual = a4j.AddtoCart("014014221X", "9");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 10
     * Test case values: "014014221X", "10"
     * Expected result: ShoppingCart[asin=014014221X, quantity=10, price=14.99, total=149.9]
     */
    @Test
    void test_AddtoCart_10() {
        A4j a4j = new A4j();
        ShoppingCart expected = new ShoppingCart("014014221X", "10", "14.99", "149.9");
        ShoppingCart actual = a4j.AddtoCart("014014221X", "10");
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
class A4j_6Test {
		
    /**
     * Test case number: 1
     * Test case values: "014014221X", "