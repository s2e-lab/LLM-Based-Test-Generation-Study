package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class ProdSignsTest {
    @Test
    void testProdSigns() {
        assertEquals(ProdSigns.prodSigns(Arrays.asList(1, 2, 2, -4)), -9);
        assertEquals(ProdSigns.prodSigns(Arrays.asList(0, 1)), 0);
        assertEquals(ProdSigns.prodSigns(Arrays.asList()), null);
        assertEquals(ProdSigns.prodSigns(Arrays.asList(1, 1, 1, 2, 3, -1, 1)), -10);
        assertEquals(ProdSigns.prodSigns(Arrays.asList(2, 4, 1, 2, -1, -1, 9)), 20);
        assertEquals(ProdSigns.prodSigns(Arrays.asList(-1, 1, -1, 1)), 4);
        assertEquals(ProdSigns.prodSigns(Arrays.asList(-1, 1, 1, 1)), -4);
        assertEquals(ProdSigns.prodSigns(Arrays.asList(-1, 1, 1, 0)), 0);
        assertEquals(ProdSigns.prodSigns(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), -55);
        assertEquals(ProdSigns.prodSigns(Arrays.asList(-1, -2, -3, -4, -5, -6, -7, -8, -9, -10)), 55);
    }
}