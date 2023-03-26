Here's the code for the test class:

```
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdSignsTest {

    @Test
    void testEmptyList() {
        List<Object> arr = Collections.emptyList();
        assertNull(ProdSigns.prodSigns(arr));
    }

    @Test
    void testAllPositive() {
        List<Object> arr = Arrays.asList(1, 2, 3);
        assertEquals(6, ProdSigns.prodSigns(arr));
    }

    @Test
    void testAllNegative() {
        List<Object> arr = Arrays.asList(-1, -2, -3);
        assertEquals(-6, ProdSigns.prodSigns(arr));
    }

    @Test
    void testMixed() {
        List<Object> arr = Arrays.asList(-1, 2, 0, -3);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }

    @Test
    void testZero() {
        List<Object> arr = Arrays.asList(0, 0, 0);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }

    @Test
    void testMixedWithZero() {
        List<Object> arr = Arrays.asList(-1, 2, 0, -3, 0);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }

    @Test
    void testSinglePositive() {
        List<Object> arr = Arrays.asList(5);
        assertEquals(5, ProdSigns.prodSigns(arr));
    }

    @Test
    void testSingleNegative() {
        List<Object> arr = Arrays.asList(-5);
        assertEquals(-5, ProdSigns.prodSigns(arr));
    }

    @Test
    void testSingleZero() {
        List<Object> arr = Arrays.asList(0);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }

    @Test
    void testMixedWithNonIntegers() {
        List<Object> arr = Arrays.asList(-1, 2, "hello", -3, 0);
        assertEquals(0, ProdSigns.prodSigns(arr));
    }

    @Test
    void testEmptyString() {
        List<Object> arr = Arrays.asList("");
        assertEquals(0, ProdSigns.prodSigns(arr));
    }
}
```