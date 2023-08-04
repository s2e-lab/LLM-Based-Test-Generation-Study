// BurnTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains ten unit test cases for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {

    /**
     * Test of BurnToDVD method, of class Burn.
     */
    @Test
    void testBurnToDVD() {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn(true);
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }

    /**
     * Test of BurnToDVD method, of class Burn.
     */
    @Test
    void testBurnToDVD_1() {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn(false);
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }

    /**
     * Test of BurnToDVD method, of class Burn.
     */
    @Test
    void testBurnToDVD_2() {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn(true);
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }

    /**
     * Test of BurnToDVD method, of class Burn.
     */
    @Test
    void testBurnToDVD_3() {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn(true);
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }

    /**
     * Test of BurnToDVD method, of class Burn.
     */
    @Test
    void testBurnToDVD_4() {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn(true);
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }

    /**
     * Test of BurnToDVD method, of class Burn.
     */
    @Test
    void testBurnToDVD_5() {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn(true);
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }

    /**
     * Test of BurnToDVD method, of class Burn.
     */
    @Test
    void testBurnToDVD_6() {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn(true);
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }

    /**
     * Test of BurnToDVD method, of class Burn.
     */
    @Test
    void testBurnToDVD_7() {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn(true);
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }

    /**
     * Test of BurnToDVD method, of class Burn.
     */
    @Test
    void testBurnToDVD_8() {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn(true);
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }

    /**
     * Test of BurnToDVD method, of class Burn.
     */
    @Test
    void testBurnToDVD_9() {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn(true);
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }

    /**
     * Test of BurnToDVD method, of class Burn.
     */
    @Test
    void testBurnToDVD_10() {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn(true);
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }
}
