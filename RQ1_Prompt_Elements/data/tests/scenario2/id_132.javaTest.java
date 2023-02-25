package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsNestedTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario2.IsNested.isNested("Arrays.asList(Arrays.asList())"));
		assertEquals(false, scenario2.IsNested.isNested("Arrays.asList()))))))Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList()"));
		assertEquals(false, scenario2.IsNested.isNested("Arrays.asList()Arrays.asList()"));
		assertEquals(false, scenario2.IsNested.isNested("Arrays.asList()"));
		assertEquals(true, scenario2.IsNested.isNested("Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList())))"));
		assertEquals(false, scenario2.IsNested.isNested("Arrays.asList())))))))))"));
		assertEquals(true, scenario2.IsNested.isNested("Arrays.asList()Arrays.asList()Arrays.asList(Arrays.asList())"));
		assertEquals(false, scenario2.IsNested.isNested("Arrays.asList(Arrays.asList()"));
		assertEquals(false, scenario2.IsNested.isNested("Arrays.asList())"));
		assertEquals(true, scenario2.IsNested.isNested("Arrays.asList(Arrays.asList())Arrays.asList(Arrays.asList("));
		assertEquals(true, scenario2.IsNested.isNested("Arrays.asList(Arrays.asList()Arrays.asList())"));
		assertEquals(false, scenario2.IsNested.isNested(""));
		assertEquals(false, scenario2.IsNested.isNested("Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList("));
		assertEquals(false, scenario2.IsNested.isNested("]]]]]]]]"));
		
    }

}