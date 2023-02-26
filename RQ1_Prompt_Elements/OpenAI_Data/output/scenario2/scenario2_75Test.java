// IsMultiplyPrimeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsMultiplyPrime}.
* It contains ten unit test cases for the {@link IsMultiplyPrime#isMultiplyPrime(int)} method.
*/
class IsMultiplyPrimeTest {

	@Test
	void testIsMultiplyPrime() {
		assertTrue(IsMultiplyPrime.isMultiplyPrime(2));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(3));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(5));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(7));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(11));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(13));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(17));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(19));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(23));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(29));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(31));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(37));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(41));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(43));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(47));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(53));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(59));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(61));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(67));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(71));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(73));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(79));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(83));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(89));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(97));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(6));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(10));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(14));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(15));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(21));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(22));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(33));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(34));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(35));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(38));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(39));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(46));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(51));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(55));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(57));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(65));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(69));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(77));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(85));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(86));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(91));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(93));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(95));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(42));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(70));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(78));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(102));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(110));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(114));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(130));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(138));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(154));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(166));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(182));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(190));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(210));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(222));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(230));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(238));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(254));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(266));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(282));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(286));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(310));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(322));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(330));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(334));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(350));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(358));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(374));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(386));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(390));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(406));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(418));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(430));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(442));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(454));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(462));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(478));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(482));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(494));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(510));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(526));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(534));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(550));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(558));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(574));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(586));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(590));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(606));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(618));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(630));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(642));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(654));
		assertTrue(IsMultiplyPrime.isMultiplyPrime(662));
		assertTrue(IsMultiplyPrime.