//package Part3;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//class DecimalToBinaryTest {
//    @Test
//    void testDecimalToBinary() {
//        assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
//        assertEquals("db100000db", DecimalToBinary.decimalToBinary(32));
//        assertEquals("db1100111db", DecimalToBinary.decimalToBinary(103));
//        assertEquals("db1111db", DecimalToBinary.decimalToBinary(15));
//        assertEquals("db111111111111111111111111111111db", DecimalToBinary.decimalToBinary(Integer.MAX_VALUE));
//        assertEquals("db10000000000000000000000000000000db", DecimalToBinary.decimalToBinary(Integer.MIN_VALUE));
//        assertEquals("db111111111111111111111111111111db", DecimalToBinary.decimalToBinary(-1));
//        assertEquals("db111111111111111111111111111111db", DecimalToBinary.decimalToBinary(-2147483647));
//        assertEquals("db10000000000000000000000000000000db", DecimalToBinary.decimalToBinary(-2147483648));
//        assertEquals("db111111111111111111111111111111db", DecimalToBinary.decimalToBinary(-2147483649));
//    }
//}