package scenario3;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdSignsTest {

    @Test
    public void test() throws Exception{

        assertEquals(-9, scenario3.ProdSigns.prodSigns(Arrays.asList(1, 2, 2, -4)));
		assertEquals(0, scenario3.ProdSigns.prodSigns(Arrays.asList(0, 1)));
		assertEquals(-10, scenario3.ProdSigns.prodSigns(Arrays.asList(1, 1, 1, 2, 3, -1, 1)));
		assertEquals(null, scenario3.ProdSigns.prodSigns(Arrays.asList()));
		assertEquals(20, scenario3.ProdSigns.prodSigns(Arrays.asList(2, 4, 1, 2, -1, -1, 9)));
		assertEquals(4, scenario3.ProdSigns.prodSigns(Arrays.asList(-1, 1, -1, 1)));
		assertEquals(-4, scenario3.ProdSigns.prodSigns(Arrays.asList(-1, 1, 1, 1)));
		assertEquals(0, scenario3.ProdSigns.prodSigns(Arrays.asList(-1, 1, 1, 0)));
		
    }

}