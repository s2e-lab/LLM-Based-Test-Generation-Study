// SumSquares1Test.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {

    /**
    * Test case for {@link SumSquares1#sumSquares(List)}.
    */
    @Test
    void testSumSquares() {
        List<Object> lst1 = new ArrayList<Object>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        assertEquals(6, SumSquares1.sumSquares(lst1));

        List<Object> lst2 = new ArrayList<Object>();
        lst2.add(1);
        lst2.add(4);
        lst2.add(9);
        assertEquals(14, SumSquares1.sumSquares(lst2));

        List<Object> lst3 = new ArrayList<Object>();
        assertEquals(0, SumSquares1.sumSquares(lst3));

        List<Object> lst4 = new ArrayList<Object>();
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        lst4.add(1);
        assertEquals(9, SumSquares1.sumSquares(lst4));

        List<Object> lst5 = new ArrayList<Object>();
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        lst5.add(-1);
        assertEquals(-3, SumSquares1.sumSquares(lst5));

        List<Object> lst6 = new ArrayList<Object>();
        lst6.add(0);
        assertEquals(0, SumSquares1.sumSquares(lst6));

        List<Object> lst7 = new ArrayList<Object>();
        lst7.add(-1);
        lst7.add(-5);
        lst7.add(2);
        lst7.add(-1);
        lst7.add(-5);
        assertEquals(-126, SumSquares1.sumSquares(lst7));

        List<Object> lst8 = new ArrayList<Object>();
        lst8.add(-56);
        lst8.add(-99);
        lst8.add(1);
        lst8.add(0);
        lst8.add(-2);
        assertEquals(3030, SumSquares1.sumSquares(lst8));

        List<Object> lst9 = new ArrayList<Object>();
        lst9.add(-1);
        lst9.add(0);
        lst9.add(0);
        lst9.add(0);
        lst9.add(0);
        lst9.add(0);
        lst9.add(0);
        lst9.add(0);
        lst9.add(-1);
        assertEquals(0, SumSquares1.sumSquares(lst9));

        List<Object> lst10 = new ArrayList<Object>();
        lst10.add(-16);
        lst10.add(-9);
        lst10.add(-2);
        lst10.add(36);
        lst10.add(36);
        lst10.add(26);
        lst10.add(-20);
        lst10.add(25);
        lst10.add(-40);
        lst10.add(20);
        lst10.add(-4);
        lst10.add(12);
        lst10.add(-26);
        lst10.add(35);
        lst10.add(37);
        assertEquals(-14196, SumSquares1.sumSquares(lst10));

        List<Object> lst11 = new ArrayList<Object>();
        lst11.add(-1);
        lst11.add(-3);
        lst11.add(17);
        lst11.add(-1);
        lst11.add(-15);
        lst11.add(13);
        lst11.add(-1);
        lst11.add(14);
        lst11.add(-14);
        lst11.add(-12);
        lst11.add(-5);
        lst11.add(14);
        lst11.add(-14);
        lst11.add(6);
        lst11.add(13);
        lst11.add(11);
        lst11.add(16);
        lst11.add(16);
        lst11.add(4);
        lst11.add(10);
        assertEquals(-1448, SumSquares1.sumSquares(lst11));
    }
}
