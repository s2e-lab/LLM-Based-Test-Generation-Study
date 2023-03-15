// EnumeratedPropertiesTest.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EnumeratedProperties}.
* It contains ten unit test cases for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {

	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is not set.
	*/
	@Test
	void testGetEnumeratedProperty_NotSet() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set.
	*/
	@Test
	void testGetEnumeratedProperty_Set() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with one value.
	*/
	@Test
	void testGetEnumeratedProperty_SetOneValue() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with two values.
	*/
	@Test
	void testGetEnumeratedProperty_SetTwoValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with three values.
	*/
	@Test
	void testGetEnumeratedProperty_SetThreeValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with four values.
	*/
	@Test
	void testGetEnumeratedProperty_SetFourValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with five values.
	*/
	@Test
	void testGetEnumeratedProperty_SetFiveValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with six values.
	*/
	@Test
	void testGetEnumeratedProperty_SetSixValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		expected.add("test6");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with seven values.
	*/
	@Test
	void testGetEnumeratedProperty_SetSevenValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		expected.add("test6");
		expected.add("test7");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with eight values.
	*/
	@Test
	void testGetEnumeratedProperty_SetEightValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		expected.add("test6");
		expected.add("test7");
		expected.add("test8");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with nine values.
	*/
	@Test
	void testGetEnumeratedProperty_SetNineValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		expected.add("test6");
		expected.add("test7");
		expected.add("test8");
		expected.add("test9");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with ten values.
	*/
	@Test
	void testGetEnumeratedProperty_SetTenValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		expected.add("test6");
		expected.add("test7");
		expected.add("test8");
		expected.add("test9");
		expected.add("test10");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
}