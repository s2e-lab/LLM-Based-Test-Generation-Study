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
		List<String> result = properties.getEnumeratedProperty("test");
		assertEquals(0, result.size());
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set to a single value.
	*/
	@Test
	void testGetEnumeratedProperty_SingleValue() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> values = new ArrayList<String>();
		values.add("test");
		properties.setEnumeratedProperty("test", values);
		List<String> result = properties.getEnumeratedProperty("test");
		assertEquals(1, result.size());
		assertEquals("test", result.get(0));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set to multiple values.
	*/
	@Test
	void testGetEnumeratedProperty_MultipleValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> values = new ArrayList<String>();
		values.add("test1");
		values.add("test2");
		values.add("test3");
		properties.setEnumeratedProperty("test", values);
		List<String> result = properties.getEnumeratedProperty("test");
		assertEquals(3, result.size());
		assertEquals("test1", result.get(0));
		assertEquals("test2", result.get(1));
		assertEquals("test3", result.get(2));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set to an empty list.
	*/
	@Test
	void testGetEnumeratedProperty_EmptyList() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> values = new ArrayList<String>();
		properties.setEnumeratedProperty("test", values);
		List<String> result = properties.getEnumeratedProperty("test");
		assertEquals(0, result.size());
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set to a null list.
	*/
	@Test
	void testGetEnumeratedProperty_NullList() {
		EnumeratedProperties properties = new EnumeratedProperties();
		properties.setEnumeratedProperty("test", null);
		List<String> result = properties.getEnumeratedProperty("test");
		assertEquals(0, result.size());
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set to a list with null values.
	*/
	@Test
	void testGetEnumeratedProperty_NullValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> values = new ArrayList<String>();
		values.add(null);
		values.add(null);
		values.add(null);
		properties.setEnumeratedProperty("test", values);
		List<String> result = properties.getEnumeratedProperty("test");
		assertEquals(3, result.size());
		assertNull(result.get(0));
		assertNull(result.get(1));
		assertNull(result.get(2));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set to a list with empty values.
	*/
	@Test
	void testGetEnumeratedProperty_EmptyValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> values = new ArrayList<String>();
		values.add("");
		values.add("");
		values.add("");
		properties.setEnumeratedProperty("test", values);
		List<String> result = properties.getEnumeratedProperty("test");
		assertEquals(3, result.size());
		assertEquals("", result.get(0));
		assertEquals("", result.get(1));
		assertEquals("", result.get(2));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set to a list with mixed values.
	*/
	@Test
	void testGetEnumeratedProperty_MixedValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> values = new ArrayList<String>();
		values.add("test1");
		values.add("");
		values.add(null);
		values.add("test2");
		properties.setEnumeratedProperty("test", values);
		List<String> result = properties.getEnumeratedProperty("test");
		assertEquals(4, result.size());
		assertEquals("test1", result.get(0));
		assertEquals("", result.get(1));
		assertNull(result.get(2));
		assertEquals("test2", result.get(3));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set to a list with duplicate values.
	*/
	@Test
	void testGetEnumeratedProperty_DuplicateValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> values = new ArrayList<String>();
		values.add("test1");
		values.add("test2");
		values.add("test1");
		values.add("test2");
		properties.setEnumeratedProperty("test", values);
		List<String> result = properties.getEnumeratedProperty("test");
		assertEquals(4, result.size());
		assertEquals("test1", result.get(0));
		assertEquals("test2", result.get(1));
		assertEquals("test1", result.get(2));
		assertEquals("test2", result.get(3));
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set to a list with duplicate values.
	*/
	@Test
	void testGetEnumeratedProperty_DuplicateValues2() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> values = new ArrayList<String>();
		values.add("test1");
		values.add("test2");
		values.add("test1");
		values.add("test2");
		properties.setEnumeratedProperty("test", values);
		List<String> result = properties.getEnumeratedProperty("test");
		assertEquals(4, result.size());
		assertEquals("test1", result.get(0));
		assertEquals("test2", result.get(1));
		assertEquals("test1", result.get(2));
		assertEquals("test2", result.