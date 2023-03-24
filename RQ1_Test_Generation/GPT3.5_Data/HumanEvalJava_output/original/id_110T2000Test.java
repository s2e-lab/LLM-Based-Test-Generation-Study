// ExchangeTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains ten unit test cases for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {
    
    @Test
    void testExchange1() {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> lst2 = Arrays.asList(1, 2, 3, 4);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }
    
    @Test
    void testExchange2() {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> lst2 = Arrays.asList(1, 5, 3, 4);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }
    
    @Test
    void testExchange3() {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> lst2 = Arrays.asList(2, 1, 4, 3);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }
    
    @Test
    void testExchange4() {
        List<Integer> lst1 = Arrays.asList(5, 7, 3);
        List<Integer> lst2 = Arrays.asList(2, 6, 4);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }
    
    @Test
    void testExchange5() {
        List<Integer> lst1 = Arrays.asList(5, 7, 3);
        List<Integer> lst2 = Arrays.asList(2, 6, 3);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }
    
    @Test
    void testExchange6() {
        List<Integer> lst1 = Arrays.asList(3, 2, 6, 1, 8, 9);
        List<Integer> lst2 = Arrays.asList(3, 5, 5, 1, 1, 1);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }
    
    @Test
    void testExchange7() {
        List<Integer> lst1 = Arrays.asList(100, 200);
        List<Integer> lst2 = Arrays.asList(200, 200);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }
    
    @Test
    void testExchange8() {
        List<Integer> lst1 = Arrays.asList(1, 3, 5);
        List<Integer> lst2 = Arrays.asList(2, 4, 6);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }
    
    @Test
    void testExchange9() {
        List<Integer> lst1 = Arrays.asList(1, 3, 5);
        List<Integer> lst2 = Arrays.asList(2, 4, 5);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }
    
    @Test
    void testExchange10() {
        List<Integer> lst1 = Arrays.asList(1, 3, 5);
        List<Integer> lst2 = Arrays.asList(2, 4, 7);
        assertEquals("NO", Exchange.exchange(lst1, lst2));
    }
}