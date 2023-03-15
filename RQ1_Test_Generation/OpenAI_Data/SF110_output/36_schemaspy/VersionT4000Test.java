// VersionTest.java
package net.sourceforge.schemaspy.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Version}.
* It contains ten unit test cases for the {@link Version#compareTo(Version)} method.
*/
class VersionTest {

	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is null.
	 */
	@Test
	void testCompareToNull() {
		Version version = new Version(null);
		Version other = new Version(null);
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is empty.
	 */
	@Test
	void testCompareToEmpty() {
		Version version = new Version("");
		Version other = new Version("");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber() {
		Version version = new Version("1");
		Version other = new Version("1");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber2() {
		Version version = new Version("1");
		Version other = new Version("2");
		assertEquals(-1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber3() {
		Version version = new Version("2");
		Version other = new Version("1");
		assertEquals(1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber4() {
		Version version = new Version("1");
		Version other = new Version("1.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber5() {
		Version version = new Version("1.0");
		Version other = new Version("1");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber6() {
		Version version = new Version("1.0");
		Version other = new Version("1.1");
		assertEquals(-1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber7() {
		Version version = new Version("1.1");
		Version other = new Version("1.0");
		assertEquals(1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber8() {
		Version version = new Version("1.0");
		Version other = new Version("1.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber9() {
		Version version = new Version("1.0.0");
		Version other = new Version("1.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber10() {
		Version version = new Version("1.0.0");
		Version other = new Version("1.0.1");
		assertEquals(-1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber11() {
		Version version = new Version("1.0.1");
		Version other = new Version("1.0.0");
		assertEquals(1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber12() {
		Version version = new Version("1.0.0");
		Version other = new Version("1.0.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber13() {
		Version version = new Version("1.0.0.0");
		Version other = new Version("1.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber14() {
		Version version = new Version("1.0.0.0");
		Version other = new Version("1.0.0.1");
		assertEquals(-1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber15() {
		Version version = new Version("1.0.0.1");
		Version other = new Version("1.0.0.0");
		assertEquals(1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber16() {
		Version version = new Version("1.0.0.0");
		Version other = new Version("1.0.0.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber17() {
		Version version = new Version("1.0.0.0.0");
		Version other = new Version("1.0.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber18() {
		Version version = new Version("1.0.0.0.0");
		Version other = new Version("1.0.0.0.1");
		assertEquals(-1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber19() {
		Version version = new Version("1.0.0.0.1");
		Version other = new Version("1.0.0.0.0");
		assertEquals(1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber20() {
		Version version = new Version("1.0.0.0.0");
		Version other = new Version("1.0.0.0.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber21() {
		Version version = new Version("1.0.0.0.0.0");
		Version other = new Version("1.0.0.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber22() {
		Version version = new Version("1.0.0.0.0.0");
		Version other = new Version("1.0.0.0.0.1");
		assertEquals(-1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber23() {
		Version version = new Version("1.0.0.0.0.1");
		Version other = new Version("1.0.0.0.0.0");
		assertEquals(1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber24() {
		Version version = new Version("1.0.0.0.0.0");
		Version other = new Version("1.0.0.0.0.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber25() {
		Version version = new Version("1.0.0.0.0.0.0");
		Version other = new Version("1.0.0.0.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber26() {
		Version version = new Version("1.0.0.0.0.0.0");
		Version other = new Version("1.0.0.0.0.0.1");
		assertEquals(-1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber27() {
		Version version = new Version("1.0.0.0.0.0.1");
		Version other = new Version("1.0.0.0.0.0.0");
		assertEquals(1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber28() {
		Version version = new Version("1.0.0.0.0.0.0");
		Version other = new Version("1.0.0.0.0.0.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber29() {
		Version version = new Version("1.0.0.0.0.0.0.0");
		Version other = new Version("1.0.0.0.0.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber30() {
		Version version = new Version("1.0.0.0.0.0.0.0");
		Version other = new Version("1.0.0.0.0.0.0.1");
		assertEquals(-1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber31() {
		Version version = new Version("1.0.0.0.0.0.0.1");
		Version other = new Version("1.0.0.0.0.0.0.0");
		assertEquals(1, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber32() {
		Version version = new Version("1.0.0.0.0.0.0.0");
		Version other = new Version("1.0.0.0.0.0.0.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber33() {
		Version version = new Version("1.0.0.0.0.0.0.0.0");
		Version other = new Version("1.0.0.0.0.0.0.0");
		assertEquals(0, version.compareTo(other));
	}
	
	/**
	 * Test case for {@link Version#compareTo(Version)} method.
	 * It tests the case when the version is a single number.
	 */
	@Test
	void testCompareToSingleNumber34() {
		Version version = new Version("1.