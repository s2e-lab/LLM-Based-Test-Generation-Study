// MakeAPileTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains ten unit test cases for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {
    
    @Test
    void testMakeAPileWithThree() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(5);
        expected.add(7);
        List<Integer> actual = MakeAPile.makeAPile(3);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithFour() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        List<Integer> actual = MakeAPile.makeAPile(4);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithFive() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(7);
        expected.add(9);
        expected.add(11);
        expected.add(13);
        List<Integer> actual = MakeAPile.makeAPile(5);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithSix() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(6);
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        List<Integer> actual = MakeAPile.makeAPile(6);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithEight() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(10);
        expected.add(12);
        expected.add(14);
        expected.add(16);
        expected.add(18);
        expected.add(20);
        expected.add(22);
        List<Integer> actual = MakeAPile.makeAPile(8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithOne() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> actual = MakeAPile.makeAPile(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithZero() {
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = MakeAPile.makeAPile(0);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMakeAPileWithNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            MakeAPile.makeAPile(-1);
        });
    }
    
    @Test
    void testMakeAPileWithLargeNumber() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1000000);
        expected.add(1000002);
        expected.add(1000004);
        expected.add(1000006);
        expected.add(1000008);
        expected.add(1000010);
        expected.add(1000012);
        expected.add(1000014);
        expected.add(1000016);
        expected.add(1000018);
        expected.add(1000020);
        expected.add(1000022);
        expected.add(1000024);
        expected.add(1000026);
        expected.add(1000028);
        expected.add(1000030);
        expected.add(1000032);
        expected.add(1000034);
        expected.add(1000036);
        expected.add(1000038);
        expected.add(1000040);
        expected.add(1000042);
        expected.add(1000044);
        expected.add(1000046);
        expected.add(1000048);
        expected.add(1000050);
        expected.add(1000052);
        expected.add(1000054);
        expected.add(1000056);
        expected.add(1000058);
        expected.add(1000060);
        expected.add(1000062);
        expected.add(1000064);
        expected.add(1000066);
        expected.add(1000068);
        expected.add(1000070);
        expected.add(1000072);
        expected.add(1000074);
        expected.add(1000076);
        expected.add(1000078);
        expected.add(1000080);
        expected.add(1000082);
        expected.add(1000084);
        expected.add(1000086);
        expected.add(1000088);
        expected.add(1000090);
        expected.add(1000092);
        expected.add(1000094);
        expected.add(1000096);
        expected.add(1000098);
        expected.add(1000100);
        expected.add(1000102);
        expected.add(1000104);
        expected.add(1000106);
        expected.add(1000108);
        expected.add(1000110);
        expected.add(1000112);
        expected.add(1000114);
        expected.add(1000116);
        expected.add(1000118);
        expected.add(1000120);
        expected.add(1000122);
        expected.add(1000124);
        expected.add(1000126);
        expected.add(1000128);
        expected.add(1000130);
        expected.add(1000132);
        expected.add(1000134);
        expected.add(1000136);
        expected.add(1000138);
        expected.add(1000140);
        expected.add(1000142);
        expected.add(1000144);
        expected.add(1000146);
        expected.add(1000148);
        expected.add(1000150);
        expected.add(1000152);
        expected.add(1000154);
        expected.add(1000156);
        expected.add(1000158);
        expected.add(1000160);
        expected.add(1000162);
        expected.add(1000164);
        expected.add(1000166);
        expected.add(1000168);
        expected.add(1000170);
        expected.add(1000172);
        expected.add(1000174);
        expected.add(1000176);
        expected.add(1000178);
        expected.add(1000180);
        expected.add(1000182);
        expected.add(1000184);
        expected.add(1000186);
        expected.add(1000188);
        expected.add(1000190);
        expected.add(1000192);
        expected.add(1000194);
        expected.add(1000196);
        expected.add(1000198);
        expected.add(1000200);
        expected.add(1000202);
        expected.add(1000204);
        expected.add(1000206);
        expected.add(1000208);
        expected.add(1000210);
        expected.add(1000212);
        expected.add(1000214);
        expected.add(1000216);
        expected.add(1000218);
        expected.add(1000220);
        expected.add(1000222);
        expected.add(1000224);
        expected.add(1000226);
        expected.add(1000228);
        expected.add(1000230);
        expected.add(1000232);
        expected.add(1000234);
        expected.add(1000236);
        expected.add(1000238);
        expected.add(1000240);
        expected.add(1000242);
        expected.add(1000244);
        expected.add(1000246);
        expected.add(1000248);
        expected.add(1000250);
        expected.add(1000252);
        expected.add(1000254);
        expected.add(1000256);
        expected.add(1000258);
        expected.add(1000260);
        expected.add(1000262);
        expected.add(1000264);
        expected.add(1000266);
        expected.add(1000268);
        expected.add(1000270);
        expected.add(1000272);
        expected.add(1000274);
        expected.add(1000276);
        expected.add(1000278);
        expected.add(1000280);
        expected.add(1000282);
        expected.add(1000284);
        expected.add(1000286);
        expected.add(1000288);
        expected.add(1000290);
        expected.add(1000292);
        expected.add(1000294);
        expected.add(1000296);
        expected.add(1000298);
        expected.add(1000300);
        expected.add(1000302);
        expected.add(1000304);
        expected.add(1000306);
        expected.add(1000308);
        expected.add(1000310);
        expected.add(1000312);
        expected.add(1000314);
        expected.add(1000316);
        expected.add(1000318);
        expected.add(1000320);
        expected.add(1000322);
        expected.add(1000324);
        expected.add(1000326);
        expected.add(1000328);
        expected.add(1000330);
        expected.add(1000332);
        expected.add(1000334);
        expected.add(1000336);
        expected.add(1000338);
        expected