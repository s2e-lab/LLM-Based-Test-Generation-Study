// DerivativeTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {

    /**
    * Test case for {@link Derivative#derivative(List)}.
    */
    @Test
    void testDerivative() {
        List<Integer> xs1 = new ArrayList<Integer>();
        xs1.add(3);
        xs1.add(1);
        xs1.add(2);
        xs1.add(4);
        xs1.add(5);
        List<Object> expected1 = new ArrayList<Object>();
        expected1.add(1);
        expected1.add(4);
        expected1.add(12);
        expected1.add(20);
        assertEquals(expected1, Derivative.derivative(xs1));

        List<Integer> xs2 = new ArrayList<Integer>();
        xs2.add(1);
        xs2.add(2);
        xs2.add(3);
        List<Object> expected2 = new ArrayList<Object>();
        expected2.add(2);
        expected2.add(6);
        assertEquals(expected2, Derivative.derivative(xs2));

        List<Integer> xs3 = new ArrayList<Integer>();
        xs3.add(3);
        xs3.add(2);
        xs3.add(1);
        List<Object> expected3 = new ArrayList<Object>();
        expected3.add(2);
        expected3.add(2);
        assertEquals(expected3, Derivative.derivative(xs3));

        List<Integer> xs4 = new ArrayList<Integer>();
        xs4.add(3);
        xs4.add(2);
        xs4.add(1);
        xs4.add(0);
        xs4.add(4);
        List<Object> expected4 = new ArrayList<Object>();
        expected4.add(2);
        expected4.add(2);
        expected4.add(0);
        expected4.add(16);
        assertEquals(expected4, Derivative.derivative(xs4));

        List<Integer> xs5 = new ArrayList<Integer>();
        xs5.add(1);
        List<Object> expected5 = new ArrayList<Object>();
        assertEquals(expected5, Derivative.derivative(xs5));
    }
}
