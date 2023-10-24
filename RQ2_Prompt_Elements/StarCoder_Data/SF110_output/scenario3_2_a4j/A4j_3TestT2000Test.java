// A4j_3Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4j_3Test {

    /**
     * Test case number: 1
     * Test case values: "The Beatles", "music", "1"
     * Expected result: ProductInfo
     */
    @Test
    void test_1() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("music");
        expected.setPage("1");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "music", "1");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 2
     * Test case values: "The Beatles", "classical", "1"
     * Expected result: ProductInfo
     */
    @Test
    void test_2() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("classical");
        expected.setPage("1");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "classical", "1");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 3
     * Test case values: "The Beatles", "music", "2"
     * Expected result: ProductInfo
     */
    @Test
    void test_3() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("music");
        expected.setPage("2");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "music", "2");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 4
     * Test case values: "The Beatles", "classical", "2"
     * Expected result: ProductInfo
     */
    @Test
    void test_4() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("classical");
        expected.setPage("2");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "classical", "2");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 5
     * Test case values: "The Beatles", "music", "3"
     * Expected result: ProductInfo
     */
    @Test
    void test_5() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("music");
        expected.setPage("3");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "music", "3");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 6
     * Test case values: "The Beatles", "classical", "3"
     * Expected result: ProductInfo
     */
    @Test
    void test_6() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("classical");
        expected.setPage("3");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "classical", "3");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 7
     * Test case values: "The Beatles", "music", "4"
     * Expected result: ProductInfo
     */
    @Test
    void test_7() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("music");
        expected.setPage("4");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "music", "4");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 8
     * Test case values: "The Beatles", "classical", "4"
     * Expected result: ProductInfo
     */
    @Test
    void test_8() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("classical");
        expected.setPage("4");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "classical", "4");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 9
     * Test case values: "The Beatles", "music", "5"
     * Expected result: ProductInfo
     */
    @Test
    void test_9() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("music");
        expected.setPage("5");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "music", "5");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 10
     * Test case values: "The Beatles", "classical", "5"
     * Expected result: ProductInfo
     */
    @Test
    void test_10() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("classical");
        expected.setPage("5");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "classical", "5");
        assertEquals(expected, actual);
    }
}

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
* It contains ten unit test cases for the {@link A4j#ArtistSearch(String, String, String)} method.
*/
class A4j_4Test {
		
    /**
     * Test case number: 1
     * Test case values: "The Beatles", "music", "1"
     * Expected result: ProductInfo
     */
    @Test
    void test_1() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("music");
        expected.setPage("1");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "music", "1");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 2
     * Test case values: "The Beatles", "classical", "1"
     * Expected result: ProductInfo
     */
    @Test
    void test_2() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("classical");
        expected.setPage("1");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "classical", "1");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 3
     * Test case values: "The Beatles", "music", "2"
     * Expected result: ProductInfo
     */
    @Test
    void test_3() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("music");
        expected.setPage("2");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "music", "2");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 4
     * Test case values: "The Beatles", "classical", "2"
     * Expected result: ProductInfo
     */
    @Test
    void test_4() {
        A4j a4j = new A4j();
        ProductInfo expected = new ProductInfo();
        expected.setArtist("The Beatles");
        expected.setMode("classical");
        expected.setPage("2");
        ProductInfo actual = a4j.ArtistSearch("The Beatles", "classical", "2");
        assertEquals(expected, actual);
    }

    /**
     * Test case number: 5
     * Test case