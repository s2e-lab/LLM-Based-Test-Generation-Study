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
     * Test case for {@link Burn#BurnToDVD(GUI)}.
     *
     * @param DVD_GUI This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    @Test
    void testBurnToDVD() {
        GUI DVD_GUI = new GUI();
        Burn burn = new Burn();
        boolean result = burn.BurnToDVD(DVD_GUI);
        assertTrue(result);
    }
}
