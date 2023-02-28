package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsNestedTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario3.IsNested.isNested("[[]]"));
		assertEquals(false, scenario3.IsNested.isNested("[]]]]]]][[[[[]"));
		assertEquals(false, scenario3.IsNested.isNested("[][]"));
		assertEquals(false, scenario3.IsNested.isNested("[]"));
		assertEquals(true, scenario3.IsNested.isNested("[[[[]]]]"));
		assertEquals(false, scenario3.IsNested.isNested("[]]]]]]]]]]"));
		assertEquals(true, scenario3.IsNested.isNested("[][][[]]"));
		assertEquals(false, scenario3.IsNested.isNested("[[]"));
		assertEquals(false, scenario3.IsNested.isNested("[]]"));
		assertEquals(true, scenario3.IsNested.isNested("[[]][["));
		assertEquals(true, scenario3.IsNested.isNested("[[][]]"));
		assertEquals(false, scenario3.IsNested.isNested(""));
		assertEquals(false, scenario3.IsNested.isNested("[[[[[[[["));
		assertEquals(false, scenario3.IsNested.isNested("]]]]]]]]"));
		
    }

}