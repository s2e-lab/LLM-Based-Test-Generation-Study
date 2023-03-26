// ProdSigns.java
package scenario3;

import java.util.List;

class ProdSigns {

    /**
     * * You are given an array arr of integers and you need to return
     * sum of magnitudes of integers multiplied by product of all signs
     * of each number in the array, represented by 1, -1 or 0.
     * Note: return null for empty arr.
     *
     * Example:
     * >>> prodSigns([1, 2, 2, -4]) == -9
     * >>> prodSigns([0, 1]) == 0
     * >>> prodSigns([]) == None
     *
     * > prodSigns([1, 2, 2, -4])
     * -9
     * > prodSigns([0, 1])
     * 0
     * > prodSigns([1, 1, 1, 2, 3, -1, 1])
     * -10
     * > prodSigns([])
     * null
     * > prodSigns([2, 4, 1, 2, -1, -1, 9])
     * 20
     * > prodSigns([-1, 1, -1, 1])
     * 4
     * > prodSigns([-1, 1, 1, 1])
     * -4
     * > prodSigns([-1, 1, 1, 0])
     * 0
     */
    public static Integer prodSigns(List<Integer> arr) {
        if (arr.isEmpty()) {
            return null;
        }
        int product = 1;
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                product *= 1;
                sum += num;
            } else if (num < 0) {
                product *= -1;
                sum += Math.abs(num);
            }
        }
        return product * sum;
    }
}

// ProdSignsTest.java
package scenario3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProdSigns}.
* It contains ten unit test cases for the {@link ProdSigns#prodSigns(List)} method.
*/
class ProdSignsTest {
    
    @Test
    void testProdSigns() {
        assertEquals(-9, ProdSigns.prodSigns(Arrays.asList(1, 2, 2, -4)));
        assertEquals(0, ProdSigns.prodSigns(Arrays.asList(0, 1)));
        assertNull(ProdSigns.prodSigns(Collections.emptyList()));
        assertEquals(-10, ProdSigns.prodSigns(Arrays.asList(1, 1, 1, 2, 3, -1, 1)));
        assertEquals(20, ProdSigns.prodSigns(Arrays.asList(2, 4, 1, 2, -1, -1, 9)));
        assertEquals(4, ProdSigns.prodSigns(Arrays.asList(-1, 1, -1, 1)));
        assertEquals(-4, ProdSigns.prodSigns(Arrays.asList(-1, 1, 1, 1)));
        assertEquals(0, ProdSigns.prodSigns(Arrays.asList(-1, 1, 1, 0)));
    }
}