// ProdSignsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProdSigns}.
* It contains ten unit test cases for the {@link ProdSigns#prodSigns(List)} method.
*/
class ProdSignsTest {

    /**
    * Test case number: 1
    * Test case values: [1, 2, 2, -4]
    * Expected output (Post-state): -9
    */
    @Test
    void test1() {
        List<Object> arr = List.of(1, 2, 2, -4);
        Integer expected = -9;
        assertEquals(expected, ProdSigns.prodSigns(arr));
    }

    /**
    * Test case number: 2
    * Test case values: [0, 1]
    * Expected output (Post-state): 0
    */
    @Test
    void test2() {
        List<Object> arr = List.of(0, 1);
        Integer expected = 0;
        assertEquals(expected, ProdSigns.prodSigns(arr));
    }

    /**
    * Test case number: 3
    * Test case values: []
    * Expected output (Post-state): null
    */
    @Test
    void test3() {
        List<Object> arr = List.of();
        Integer expected = null;
        assertEquals(expected, ProdSigns.prodSigns(arr));
    }

    /**
    * Test case number: 4
    * Test case values: [2, 4, 1, 2, -1, -1, 9]
    * Expected output (Post-state): 20
    */
    @Test
    void test4() {
        List<Object> arr = List.of(2, 4, 1, 2, -1, -1, 9);
        Integer expected = 20;
        assertEquals(expected, ProdSigns.prodSigns(arr));
    }

    /**
    * Test case number: 5
    * Test case values: [-1, 1, -1, 1]
    * Expected output (Post-state): 4
    */
    @Test
    void test5() {
        List<Object> arr = List.of(-1, 1, -1, 1);
        Integer expected = 4;
        assertEquals(expected, ProdSigns.prodSigns(arr));
    }

    /**
    * Test case number: 6
    * Test case values: [-1, 1, 1, 1]
    * Expected output (Post-state): -4
    */
    @Test
    void test6() {
        List<Object> arr = List.of(-1, 1, 1, 1);
        Integer expected = -4;
        assertEquals(expected, ProdSigns.prodSigns(arr));
    }

    /**
    * Test case number: 7
    * Test case values: [-1, 1, 1, 0]
    * Expected output (Post-state): 0
    */
    @Test
    void test7() {
        List<Object> arr = List.of(-1, 1, 1, 0);
        Integer expected = 0;
        assertEquals(expected, ProdSigns.prodSigns(arr));
    }

    /**
    * Test case number: 8
    * Test case values: [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 