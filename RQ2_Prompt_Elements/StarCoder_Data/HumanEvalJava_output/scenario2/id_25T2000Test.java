// FactorizeTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains ten unit test cases for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {

    /**
     * Test case for the {@link Factorize#factorize(int)} method.
     * It tests the method with the following input:
     * <ul>
     * <li>n = 12</li>
     * </ul>
     * It expects the following result:
     * <ul>
     * <li>result = [2, 2, 3]</li>
     * </ul>
     */
    @Test
    void testFactorize1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, Factorize.factorize(12));
    }

    /**
     * Test case for the {@link Factorize#factorize(int)} method.
     * It tests the method with the following input:
     * <ul>
     * <li>n = 14</li>
     * </ul>
     * It expects the following result:
     * <ul>
     * <li>result = [2, 7]</li>
     * </ul>
     */
    @Test
    void testFactorize2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(7);
        assertEquals(expected, Factorize.factorize(14));
    }

    /**
     * Test case for the {@link Factorize#factorize(int)} method.
     * It tests the method with the following input:
     * <ul>
     * <li>n = 15</li>
     * </ul>
     * It expects the following result:
     * <ul>
     * <li>result = [3, 5]</li>
     * </ul>
     */
    @Test
    void testFactorize3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(5);
        assertEquals(expected, Factorize.factorize(15));
    }

    /**
     * Test case for the {@link Factorize#factorize(int)} method.
     * It tests the method with the following input:
     * <ul>
     * <li>n = 16</li>
     * </ul>
     * It expects the following result:
     * <ul>
     * <li>result = [2, 2, 2, 2]</li>
     * </ul>
     */
    @Test
    void testFactorize4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(2);
        expected.add(2);
        expected.add(2);
        assertEquals(expected, Factorize.factorize(16));
    }

    /**
     * Test case for the {@link Factorize#factorize(int)} method.
     * It tests the method with the following input:
     * <ul>
     * <li>n = 17</li>
     * </ul>
     * It expects the following result:
     * <ul>
     * <li>result = [17]</li>
     * </ul>
     */
    @Test
    void testFactorize5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(17);
        assertEquals(expected, Factorize.factorize(17));
    }

    /**
     * Test case for the {@link Factorize#factorize(int)} method.
     * It tests the method with the following input:
     * <ul>
     * <li>n = 18</li>
     * </ul>
     * It expects the following result:
     * <ul>
     * <li>result = [2, 3, 3]</li>
     * </ul>
     */
    @Test
    void testFactorize6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(3);
        assertEquals(expected, Factorize.factorize(18));
    }

    /**
     * Test case for the {@link Factorize#factorize(int)} method.
     * It tests the method with the following input:
     * <ul>
     * <li>n = 19</li>
     * </ul>
     * It expects the following result:
     * <ul>
     * <li>result = [19]</li>
     * </ul>
     */
    @Test
    void testFactorize7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(19);
        assertEquals(expected, Factorize.factorize(19));
    }

    /**
     * Test case for the {@link Factorize#factorize(int)} method.
     * It tests the method with the following input:
     * <ul>
     * <li>n = 20</li>
     * </ul>
     * It expects the following result:
     * <ul>
     * <li>result = [2, 2, 5]</li>
     * </ul>
     */
    @Test
    void testFactorize8() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(2);
        expected.add(5);
        assertEquals(expected, Factorize.factorize(20));
    }

    /**
     * Test case for the {@link Factorize#factorize(int)} method.
     * It tests the method with the following input:
     * <ul>
     * <li>n = 21</li>
     * </ul>
     * It expects the following result:
     * <ul>
     * <li>result = [3, 7]</li>
     * </ul>
     */
    @Test
    void testFactorize9() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(7);
        assertEquals(expected, Factorize.factorize(21));
    }

    /**
     * Test case for the {@link Factorize#factorize(int)} method.
     * It tests the method with the following input:
     * <ul>
     * <li>n = 22</li>
     * </ul>
     * It expects the following result:
     * <ul>
     * <li>result = [2, 11]</li>
     * </ul>
     */
    @Test
    void testFactorize10() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(11);
        assertEquals(expected, Factorize.factorize(22));
    }
}
