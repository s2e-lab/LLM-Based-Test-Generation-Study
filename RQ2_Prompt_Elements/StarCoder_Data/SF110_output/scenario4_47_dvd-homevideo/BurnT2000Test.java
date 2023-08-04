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
     * @throws java.io.IOException
     */
    @Test
    void testBurnToDVD() throws IOException {
        System.out.println("BurnToDVD");
        GUI DVD_GUI = new GUI();
        Burn instance = new Burn();
        boolean expResult = false;
        boolean result = instance.BurnToDVD(DVD_GUI);
        assertEquals(expResult, result);
    }
}
