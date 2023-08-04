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
     * Test of {@link A4j#AuthorSearch(String, String)}
     * @since 1.0
     */
    @Test
    void testAuthorSearch() {
        System.out.println("AuthorSearch");
        String authorName = "<NAME>";
        String page = "1";
        ProductInfo result = A4j.AuthorSearch(authorName, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#AuthorSearch(String, String)}
     * @since 1.0
     */
    @Test
    void testAuthorSearch2() {
        System.out.println("AuthorSearch");
        String authorName = "<NAME>";
        String page = "2";
        ProductInfo result = A4j.AuthorSearch(authorName, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#AuthorSearch(String, String)}
     * @since 1.0
     */
    @Test
    void testAuthorSearch3() {
        System.out.println("AuthorSearch");
        String authorName = "<NAME>";
        String page = "3";
        ProductInfo result = A4j.AuthorSearch(authorName, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#AuthorSearch(String, String)}
     * @since 1.0
     */
    @Test
    void testAuthorSearch4() {
        System.out.println("AuthorSearch");
        String authorName = "<NAME>";
        String page = "4";
        ProductInfo result = A4j.AuthorSearch(authorName, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#AuthorSearch(String, String)}
     * @since 1.0
     */
    @Test
    void testAuthorSearch5() {
        System.out.println("AuthorSearch");
        String authorName = "<NAME>";
        String page = "5";
        ProductInfo result = A4j.AuthorSearch(authorName, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#AuthorSearch(String, String)}
     * @since 1.0
     */
    @Test
    void testAuthorSearch6() {
        System.out.println("AuthorSearch");
        String authorName = "<NAME>";
        String page = "6";
        ProductInfo result = A4j.AuthorSearch(authorName, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#AuthorSearch(String, String)}
     * @since 1.0
     */
    @Test
    void testAuthorSearch7() {
        System.out.println("AuthorSearch");
        String authorName = "<NAME>";
        String page = "7";
        ProductInfo result = A4j.AuthorSearch(authorName, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#AuthorSearch(String, String)}
     * @since 1.0
     */
    @Test
    void testAuthorSearch8() {
        System.out.println("AuthorSearch");
        String authorName = "<NAME>";
        String page = "8";
        ProductInfo result = A4j.AuthorSearch(authorName, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#AuthorSearch(String, String)}
     * @since 1.0
     */
    @Test
    void testAuthorSearch9() {
        System.out.println("AuthorSearch");
        String authorName = "<NAME>";
        String page = "9";
        ProductInfo result = A4j.AuthorSearch(authorName, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#AuthorSearch(String, String)}
     * @since 1.0
     */
    @Test
    void testAuthorSearch10() {
        System.out.println("AuthorSearch");
        String authorName = "<NAME>";
        String page = "10";
        ProductInfo result = A4j.AuthorSearch(authorName, page);
        assertNotNull(result);
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
* It contains ten unit test cases for the {@link A4j#DirectorSearch(String, String, String)} method.
*/
class A4j_6Test {
		
    /**
     * Test of {@link A4j#DirectorSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testDirectorSearch() {
        System.out.println("DirectorSearch");
        String directorName = "<NAME>";
        String mode = "dvd";
        String page = "1";
        ProductInfo result = A4j.DirectorSearch(directorName, mode, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#DirectorSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testDirectorSearch2() {
        System.out.println("DirectorSearch");
        String directorName = "<NAME>";
        String mode = "dvd";
        String page = "2";
        ProductInfo result = A4j.DirectorSearch(directorName, mode, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#DirectorSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testDirectorSearch3() {
        System.out.println("DirectorSearch");
        String directorName = "<NAME>";
        String mode = "dvd";
        String page = "3";
        ProductInfo result = A4j.DirectorSearch(directorName, mode, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#DirectorSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testDirectorSearch4() {
        System.out.println("DirectorSearch");
        String directorName = "<NAME>";
        String mode = "dvd";
        String page = "4";
        ProductInfo result = A4j.DirectorSearch(directorName, mode, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#DirectorSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testDirectorSearch5() {
        System.out.println("DirectorSearch");
        String directorName = "<NAME>";
        String mode = "dvd";
        String page = "5";
        ProductInfo result = A4j.DirectorSearch(directorName, mode, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#DirectorSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testDirectorSearch6() {
        System.out.println("DirectorSearch");
        String directorName = "<NAME>";
        String mode = "dvd";
        String page = "6";
        ProductInfo result = A4j.DirectorSearch(directorName, mode, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#DirectorSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testDirectorSearch7() {
        System.out.println("DirectorSearch");
        String directorName = "<NAME>";
        String mode = "dvd";
        String page = "7";
        ProductInfo result = A4j.DirectorSearch(directorName, mode, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#DirectorSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testDirectorSearch8() {
        System.out.println("DirectorSearch");
        String directorName = "<NAME>";
        String mode = "dvd";
        String page = "8";
        ProductInfo result = A4j.DirectorSearch(directorName, mode, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#DirectorSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testDirectorSearch9() {
        System.out.println("DirectorSearch");
        String directorName = "<NAME>";
        String mode = "dvd";
        String page = "9";
        ProductInfo result = A4j.DirectorSearch(directorName, mode, page);
        assertNotNull(result);
    }

    /**
     * Test of {@link A4j#DirectorSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testDirectorSearch