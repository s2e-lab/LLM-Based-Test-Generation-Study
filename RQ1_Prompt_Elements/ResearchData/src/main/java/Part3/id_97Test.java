package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultiplyTest {
    @Test
    public void test1() {
        assertEquals(16, Multiply.multiply(148, 412));
    }
    @Test
    public void test2() {
        assertEquals(72, Multiply.multiply(19, 28));
    }
    @Test
    public void test3() {
        assertEquals(0, Multiply.multiply(2020, 1851));
    }
    @Test
    public void test4() {
        assertEquals(20, Multiply.multiply(14, -15));
    }
    @Test
    public void test5() {
        assertEquals(42, Multiply.multiply(76, 67));
    }
    @Test
    public void test6() {
        assertEquals(49, Multiply.multiply(17, 27));
    }
    @Test
    public void test7() {
        assertEquals(0, Multiply.multiply(0, 1));
    }
    @Test
    public void test8() {
        assertEquals(0, Multiply.multiply(0, 0));
    }
    @Test
    public void test9() {
        assertEquals(0, Multiply.multiply(0, -1));
    }
    @Test
    public void test10() {
        assertEquals(0, Multiply.multiply(-1, 0));
    }
}