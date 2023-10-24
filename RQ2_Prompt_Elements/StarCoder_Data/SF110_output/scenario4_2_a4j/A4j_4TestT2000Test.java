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
     * Test of {@link A4j#AuthorSearch(String, String)}
     * @since 1.0
     */
    @Test
    void testAuthorSearch() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.AuthorSearch("<NAME>", "1");
        assertEquals(productInfo.getProduct().get(0).getAuthor(), "<NAME>");
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
* It contains ten unit test cases for the {@link A4j#ActorSearch(String, String, String)} method.
*/
class A4j_5Test {
		
    /**
     * Test of {@link A4j#ActorSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testActorSearch() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ActorSearch("<NAME>", "dvd", "1");
        assertEquals(productInfo.getProduct().get(0).getActor(), "<NAME>");
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
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.DirectorSearch("<NAME>", "dvd", "1");
        assertEquals(productInfo.getProduct().get(0).getDirector(), "<NAME>");
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
* It contains ten unit test cases for the {@link A4j#ManufactureSearch(String, String, String)} method.
*/
class A4j_7Test {
		
    /**
     * Test of {@link A4j#ManufactureSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testManufactureSearch() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ManufactureSearch("Sony", "dvd", "1");
        assertEquals(productInfo.getProduct().get(0).getManufacturer(), "Sony");
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
* It contains ten unit test cases for the {@link A4j#UpcSearch(String, String, String)} method.
*/
class A4j_8Test {
		
    /**
     * Test of {@link A4j#UpcSearch(String, String, String)}
     * @since 1.0
     */
    @Test
    void testUpcSearch() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.UpcSearch("081661422451", "dvd", "1");
        assertEquals(productInfo.getProduct().get(0).getUpc(), "081661422451");
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
* It contains ten unit test cases for the {@link A4j#ListmaniaSearch(String)} method.
*/
class A4j_9Test {
		
    /**
     * Test of {@link A4j#ListmaniaSearch(String)}
     * @since 1.0
     */
    @Test
    void testListmaniaSearch() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.ListmaniaSearch("123456789");
        assertEquals(productInfo.getProduct().get(0).getListmaniaId(), "123456789");
    }
}

// A4j_10Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#WishListSearch(String)} method.
*/
class A4j_10Test {
		
    /**
     * Test of {@link A4j#WishListSearch(String)}
     * @since 1.0
     */
    @Test
    void testWishListSearch() {
        A4j a4j = new A4j();
        ProductInfo productInfo = a4j.WishListSearch("123456789");
        assertEquals(productInfo.getProduct().get(0).getWishListId(), "123456789");
    }
}

// A4j_11Test.java
package net.kencochrane.a4j;

import net.kencochrane.a4j.DAO.Cart;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.DAO.Search;
import net.kencochrane.a4j.beans.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link A4j}.
* It contains ten unit test cases for the {@link A4j#ThirdParty(String, String, String, String)} method.
*/
class A4j_11Test {
		
    /**
     * Test of {@link A4j#ThirdParty(String, String, String, String)}
     * @since 1.0
     */
    @Test
    void testThirdParty() {
        A4j a4j = new A4j();
        SellerSearch sellerSearch = a4j.ThirdParty("A2OFEB6Y