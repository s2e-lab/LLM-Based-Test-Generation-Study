package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeLengthTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario2.PrimeLength.primeLength("Hello"));
		assertEquals(true, scenario2.PrimeLength.primeLength("abcdcba"));
		assertEquals(true, scenario2.PrimeLength.primeLength("kittens"));
		assertEquals(false, scenario2.PrimeLength.primeLength("orange"));
		assertEquals(true, scenario2.PrimeLength.primeLength("wow"));
		assertEquals(true, scenario2.PrimeLength.primeLength("world"));
		assertEquals(true, scenario2.PrimeLength.primeLength("MadaM"));
		assertEquals(true, scenario2.PrimeLength.primeLength("Wow"));
		assertEquals(false, scenario2.PrimeLength.primeLength(""));
		assertEquals(true, scenario2.PrimeLength.primeLength("HI"));
		assertEquals(true, scenario2.PrimeLength.primeLength("go"));
		assertEquals(false, scenario2.PrimeLength.primeLength("gogo"));
		assertEquals(false, scenario2.PrimeLength.primeLength("aaaaaaaaaaaaaaa"));
		assertEquals(true, scenario2.PrimeLength.primeLength("Madam"));
		assertEquals(false, scenario2.PrimeLength.primeLength("M"));
		assertEquals(false, scenario2.PrimeLength.primeLength("0"));
		
    }

}