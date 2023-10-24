// ProdSignsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProdSigns}.
* It contains ten unit test cases for the {@link ProdSigns#prodSigns(List)} method.
*/
class ProdSignsTest {

    /**
    * Test case for {@link ProdSigns#prodSigns(List)}.
    */
    @Test
    void testProdSigns() {
        List<Object> arr1 = List.of(1, 5, -7, 3, -1);
        assertEquals(14, ProdSigns.prodSigns(arr1));
        List<Object> arr2 = List.of(1, -2, -3, -4, 3, 2, 1);
        assertEquals(24, ProdSigns.prodSigns(arr2));
        List<Object> arr3 = List.of(1, 1, 1, 1, 1);
        assertEquals(0, ProdSigns.prodSigns(arr3));
        List<Object> arr4 = List.of(-1, -2, -3, -4, -3, -2, -1);
        assertEquals(-24, ProdSigns.prodSigns(arr4));
        List<Object> arr5 = List.of(-1, 1, -1, 1, -1);
        assertEquals(0, ProdSigns.prodSigns(arr5));
        List<Object> arr6 = List.of(1, 2, 3, 4, 5);
        assertEquals(15, ProdSigns.prodSigns(arr6));
        List<Object> arr7 = List.of(1, -1, -1, -1, -1);
        assertEquals(-1, ProdSigns.prodSigns(arr7));
        List<Object> arr8 = List.of(0, 0, 0, 0, 0);
        assertEquals(0, ProdSigns.prodSigns(arr8));
        List<Object> arr9 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(180, ProdSigns.prodSigns(arr9));
        List<Object> arr10 = List.of(1, -2, -3, -4, -5, -6, -7, -8, -9, -10);
        assertEquals(-180, ProdSigns.prodSigns(arr10));
    }
}
