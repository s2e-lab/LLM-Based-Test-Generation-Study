package scenario3;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeLengthTest {

    @Test
    public void test() throws Exception{
        assertEquals(true, scenario3.PrimeLength.primeLength("Hello"));
		assertEquals(true, scenario3.PrimeLength.primeLength("abcdcba"));
		assertEquals(true, scenario3.PrimeLength.primeLength("kittens"));
		assertEquals(false, scenario3.PrimeLength.primeLength("orange"));
		assertEquals(true, scenario3.PrimeLength.primeLength("wow"));
		assertEquals(true, scenario3.PrimeLength.primeLength("world"));
		assertEquals(true, scenario3.PrimeLength.primeLength("MadaM"));
		assertEquals(true, scenario3.PrimeLength.primeLength("Wow"));
		assertEquals(false, scenario3.PrimeLength.primeLength(""));
		assertEquals(true, scenario3.PrimeLength.primeLength("HI"));
		assertEquals(true, scenario3.PrimeLength.primeLength("go"));
		assertEquals(false, scenario3.PrimeLength.primeLength("gogo"));
		assertEquals(false, scenario3.PrimeLength.primeLength("aaaaaaaaaaaaaaa"));
		assertEquals(true, scenario3.PrimeLength.primeLength("Madam"));
		assertEquals(false, scenario3.PrimeLength.primeLength("M"));
		assertEquals(false, scenario3.PrimeLength.primeLength("0"));
		assertEquals(public static Boolean primeLength(String string) {, scenario3.PrimeLength.*/);
		
    }

}