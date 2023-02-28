package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeLengthTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario1.PrimeLength.primeLength("Hello"));
		assertEquals(true, scenario1.PrimeLength.primeLength("abcdcba"));
		assertEquals(true, scenario1.PrimeLength.primeLength("kittens"));
		assertEquals(false, scenario1.PrimeLength.primeLength("orange"));
		assertEquals(true, scenario1.PrimeLength.primeLength("wow"));
		assertEquals(true, scenario1.PrimeLength.primeLength("world"));
		assertEquals(true, scenario1.PrimeLength.primeLength("MadaM"));
		assertEquals(true, scenario1.PrimeLength.primeLength("Wow"));
		assertEquals(false, scenario1.PrimeLength.primeLength(""));
		assertEquals(true, scenario1.PrimeLength.primeLength("HI"));
		assertEquals(true, scenario1.PrimeLength.primeLength("go"));
		assertEquals(false, scenario1.PrimeLength.primeLength("gogo"));
		assertEquals(false, scenario1.PrimeLength.primeLength("aaaaaaaaaaaaaaa"));
		assertEquals(true, scenario1.PrimeLength.primeLength("Madam"));
		assertEquals(false, scenario1.PrimeLength.primeLength("M"));
		assertEquals(false, scenario1.PrimeLength.primeLength("0"));
		
    }

}