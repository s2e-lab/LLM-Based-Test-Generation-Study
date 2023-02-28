package scenario2;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HasCloseElementsTest {

    @Test
    public void test() throws Exception{

        assertEquals(false, scenario2.HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 3.0), 0.5));
		assertEquals(true, scenario2.HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0), 0.3));
		assertEquals(true, scenario2.HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2), 0.3));
		assertEquals(false, scenario2.HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2), 0.05));
		assertEquals(true, scenario2.HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0), 0.95));
		assertEquals(false, scenario2.HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0), 0.8));
		assertEquals(true, scenario2.HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0), 0.1));
		assertEquals(true, scenario2.HasCloseElements.hasCloseElements(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1), 1.0));
		assertEquals(false, scenario2.HasCloseElements.hasCloseElements(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1), 0.5));
		
    }

}