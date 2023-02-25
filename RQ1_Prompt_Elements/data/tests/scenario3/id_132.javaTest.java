package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsNestedTest {

    @Test
    public void test() throws Exception{
        assertEquals(true, scenario3.IsNested.isNested("Arrays.asList(Arrays.asList())"));
		assertEquals(false, scenario3.IsNested.isNested("Arrays.asList()))))))Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList()"));
		assertEquals(false, scenario3.IsNested.isNested("Arrays.asList()Arrays.asList()"));
		assertEquals(false, scenario3.IsNested.isNested("Arrays.asList()"));
		assertEquals(true, scenario3.IsNested.isNested("Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList())))"));
		assertEquals(false, scenario3.IsNested.isNested("Arrays.asList())))))))))"));
		assertEquals(true, scenario3.IsNested.isNested("Arrays.asList()Arrays.asList()Arrays.asList(Arrays.asList())"));
		assertEquals(false, scenario3.IsNested.isNested("Arrays.asList(Arrays.asList()"));
		assertEquals(false, scenario3.IsNested.isNested("Arrays.asList())"));
		assertEquals(true, scenario3.IsNested.isNested("Arrays.asList(Arrays.asList())Arrays.asList(Arrays.asList("));
		assertEquals(true, scenario3.IsNested.isNested("Arrays.asList(Arrays.asList()Arrays.asList())"));
		assertEquals(false, scenario3.IsNested.isNested(""));
		assertEquals(false, scenario3.IsNested.isNested("Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList(Arrays.asList("));
		assertEquals(false, scenario3.IsNested.isNested("))))))))"));
		assertEquals(public static Boolean isNested(String string) {, scenario3.IsNested.*/);
		
    }

}