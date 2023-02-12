package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class IntersperseTest {
    @Test
    public void testIntersperse() {
        List<Object> list1 = new ArrayList<Object>();
        List<Object> list2 = new ArrayList<Object>();
        list2.add(1);
        list2.add(4);
        list2.add(2);
        list2.add(4);
        list2.add(3);
        List<Object> list3 = new ArrayList<Object>();
        list3.add(5);
        list3.add(8);
        list3.add(6);
        list3.add(8);
        list3.add(3);
        list3.add(8);
        list3.add(2);
        List<Object> list4 = new ArrayList<Object>();
        list4.add(2);
        list4.add(2);
        list4.add(2);
        list4.add(2);
        list4.add(2);
        assertEquals(list1, Intersperse.intersperse(list1, 4));
        assertEquals(list2, Intersperse.intersperse(list2, 4));
        assertEquals(list3, Intersperse.intersperse(list3, 8));
        assertEquals(list4, Intersperse.intersperse(list4, 2));
    }
}