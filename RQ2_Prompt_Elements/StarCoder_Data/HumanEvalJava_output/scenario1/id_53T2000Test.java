// AddTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains ten unit test cases for the {@link Add#add(int, int)} method.
*/
class AddTest {

    @Test
    void testAdd() {
        assertEquals(3, Add.add(1, 2));
    }

    @Test
    void testAdd2() {
        assertEquals(5, Add.add(2, 3));
    }

    @Test
    void testAdd3() {
        assertEquals(7, Add.add(3, 4));
    }

    @Test
    void testAdd4() {
        assertEquals(9, Add.add(4, 5));
    }

    @Test
    void testAdd5() {
        assertEquals(11, Add.add(5, 6));
    }

    @Test
    void testAdd6() {
        assertEquals(13, Add.add(6, 7));
    }

    @Test
    void testAdd7() {
        assertEquals(15, Add.add(7, 8));
    }

    @Test
    void testAdd8() {
        assertEquals(17, Add.add(8, 9));
    }

    @Test
    void testAdd9() {
        assertEquals(19, Add.add(9, 10));
    }

    @Test
    void testAdd10() {
        assertEquals(21, Add.add(10, 11));
    }
}
