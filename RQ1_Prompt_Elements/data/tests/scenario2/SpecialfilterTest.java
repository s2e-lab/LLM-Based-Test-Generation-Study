package scenario2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpecialfilterTest {

    @Test
    public void test() throws Exception{

        assertEquals(0, scenario2.Specialfilter.specialfilter(Arrays.asList(5, -2, 1, -5)));
		assertEquals(1, scenario2.Specialfilter.specialfilter(Arrays.asList(15, -73, 14, -15)));
		assertEquals(2, scenario2.Specialfilter.specialfilter(Arrays.asList(33, -2, -3, 45, 21, 109)));
		assertEquals(4, scenario2.Specialfilter.specialfilter(Arrays.asList(43, -12, 93, 125, 121, 109)));
		assertEquals(3, scenario2.Specialfilter.specialfilter(Arrays.asList(71, -2, -33, 75, 21, 19)));
		assertEquals(0, scenario2.Specialfilter.specialfilter(Arrays.asList(1)));
		assertEquals(0, scenario2.Specialfilter.specialfilter(Arrays.asList()));
		
    }

}