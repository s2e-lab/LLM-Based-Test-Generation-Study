// ProdSignsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProdSigns}.
* It contains ten unit test cases for the {@link ProdSigns#prodSigns(List)} method.
*/
class ProdSignsTest {

    @Test
    void testProdSigns1() {
        List<Object> arr = List.of(1, 2, 3, 4, 5);
        assertEquals(15, ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns2() {
        List<Object> arr = List.of(1, 2, -3, -4, 5);
        assertEquals(-15, ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns3() {
        List<Object> arr = List.of(1, -2, -3, -4, 5);
        assertEquals(15, ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns4() {
        List<Object> arr = List.of(1, -2, 3, -4, 5);
        assertEquals(-15, ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns5() {
        List<Object> arr = List.of(1, 2, 0, -4, 5);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns6() {
        List<Object> arr = List.of(1, 2, 3, 0, 5);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns7() {
        List<Object> arr = List.of(1, 2, 3, 4, 0);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns8() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(75, ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns9() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, -6);
        assertEquals(-75, ProdSigns.prodSigns(arr));
    }

    @Test
    void testProdSigns10() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 0, -6);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }
}
