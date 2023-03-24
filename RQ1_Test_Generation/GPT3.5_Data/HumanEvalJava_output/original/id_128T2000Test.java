// Here's the source code for the ProdSignsTest class:

package original;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdSignsTest {

    @Test
    void testEmptyArray() {
        assertNull(ProdSigns.prodSigns(Collections.emptyList()));
    }

    @Test
    void testArrayWithZero() {
        assertEquals(0, ProdSigns.prodSigns(Arrays.asList(0, 1)));
    }

    @Test
    void testArrayWithAllPositiveNumbers() {
        assertEquals(12, ProdSigns.prodSigns(Arrays.asList(2, 3, 2)));
    }

    @Test
    void testArrayWithAllNegativeNumbers() {
        assertEquals(-12, ProdSigns.prodSigns(Arrays.asList(-2, -3, -2)));
    }

    @Test
    void testArrayWithMixedNumbers() {
        assertEquals(-9, ProdSigns.prodSigns(Arrays.asList(1, 2, 2, -4)));
    }

    @Test
    void testArrayWithOneZero() {
        assertEquals(0, ProdSigns.prodSigns(Arrays.asList(1, 0, 2)));
    }

    @Test
    void testArrayWithMultipleZeros() {
        assertEquals(0, ProdSigns.prodSigns(Arrays.asList(1, 0, 2, 0, -3)));
    }

    @Test
    void testArrayWithAllZeros() {
        assertEquals(0, ProdSigns.prodSigns(Arrays.asList(0, 0, 0)));
    }

    @Test
    void testArrayWithOnePositiveAndOneNegativeNumber() {
        assertEquals(-2, ProdSigns.prodSigns(Arrays.asList(-1, 2)));
    }

    @Test
    void testArrayWithOnePositiveAndOneZero() {
        assertEquals(0, ProdSigns.prodSigns(Arrays.asList(0, 2)));
    }

    @Test
    void testArrayWithOneNegativeAndOneZero() {
        assertEquals(0, ProdSigns.prodSigns(Arrays.asList(-1, 0)));
    }
}