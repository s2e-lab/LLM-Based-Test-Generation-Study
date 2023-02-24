// WillItFlyTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link WillItFly}.
* It contains ten test cases for the {@link WillItFly#willItFly()} method.
*/
class WillItFlyTest {

    @Test
    void testWillItFly() {
        List<Integer> q = new ArrayList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(true, WillItFly.willItFly(q, 10));
        q.clear();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, 9));
        q.clear();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, 11));
        q.clear();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, 0));
        q.clear();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, -1));
        q.clear();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, -10));
        q.clear();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, -100));
        q.clear();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, -1000));
        q.clear();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, -10000));
        q.clear();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        assertEquals(false, WillItFly.willItFly(q, -100000));
    }
}